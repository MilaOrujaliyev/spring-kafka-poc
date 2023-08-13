package com.example.springkafkapoc.controller;

import com.example.springkafkapoc.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private KafkaProducer producer;

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody String message) {
        producer.send("test-topic", message);
        return ResponseEntity.ok("Message sent!");
    }
}
