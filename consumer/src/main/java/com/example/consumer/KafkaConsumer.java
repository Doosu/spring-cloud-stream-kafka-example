package com.example.consumer;

import com.example.models.MessageModel;
import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class KafkaConsumer {

  @Bean
  public Consumer<KStream<String, MessageModel>> squaredNumberConsumer(){
    return stream -> stream.foreach((key, value) -> log.warn("Message Consumed : {} || {}", key, value));
  };

}
