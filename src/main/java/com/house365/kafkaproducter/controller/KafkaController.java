package com.house365.kafkaproducter.controller;

import com.house365.kafkaproducter.engine.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    public static final Logger logger = LoggerFactory.getLogger(KafkaController.class);

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping(value = "/publish/{message}")
    public void sendMessageToKafkaTopic(@PathVariable("message") String message) {
        logger.info(message);
        this.producer.sendMessage(message);

    }
}
