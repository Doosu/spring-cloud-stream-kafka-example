package com.example.producer;

import com.example.enums.MessageModelType;
import com.example.models.MessageModel;
import java.time.Duration;
import java.util.function.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class KafkaProducer {

  @Bean
  public Supplier<Flux<MessageModel>> numberProducer() {
    return () -> Flux.range(1, 10)
        .map(i -> MessageModel
            .builder()
            .id(i)
            .type(MessageModelType.EMAIL)
            .content("Kafka Message " + i)
            .outgoing("andxlddl@gibhub.com")
            .receivers(
                StringUtils.toList("test@nate.com", "test@gmail.com")
            )
            .build())
        .delayElements(Duration.ofSeconds(1));
  }

}
