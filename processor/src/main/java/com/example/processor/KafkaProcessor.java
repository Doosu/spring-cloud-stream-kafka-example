package com.example.processor;

import com.example.models.MessageModel;
import java.util.function.Function;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class KafkaProcessor {

  @Bean
  public Function<KStream<String, MessageModel>, KStream<String, MessageModel>> evenNumberSquareProcessor(){
    return kStream ->  kStream
        .filter((k, v) -> v.getId() % 2 == 0)
        .peek((k, v) -> log.warn("Squaring Id Even : {}", v.getId()))
        .mapValues(v -> {
          v.setId(v.getId() * v.getId());
          return v;
        });
  };

}
