package com.example.processor;

import java.util.Map;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.streams.errors.DeserializationExceptionHandler;
import org.apache.kafka.streams.processor.ProcessorContext;

public class CustomDeserializationExceptionHandler implements DeserializationExceptionHandler {

  @Override
  public DeserializationHandlerResponse handle(
      final ProcessorContext context,
      final ConsumerRecord<byte[], byte[]> record,
      final Exception exception) {
    return null == exception
        ? DeserializationHandlerResponse.CONTINUE
        : DeserializationHandlerResponse.FAIL;
  }

  @Override
  public void configure(Map<String, ?> configs) {

  }

}
