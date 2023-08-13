package com.example.springkafkapoc.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "test-topic", groupId = "spring-kafka-poc-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
