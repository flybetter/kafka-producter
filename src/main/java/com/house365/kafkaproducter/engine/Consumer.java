package com.house365.kafkaproducter.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "users", groupId = "groupid")
    public void consume(String message) {
        logger.info(String.format("### -> consuming Message -> %s", message));
    }

}
