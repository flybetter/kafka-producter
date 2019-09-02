package com.house365.kafkaproducter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaProducterApplication {


    public static Logger logger = LoggerFactory.getLogger(KafkaProducterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducterApplication.class, args);
    }

//    @Autowired
//    private KafkaTemplate<String, String> template;
//
//    private final CountDownLatch latch = new CountDownLatch(3);
//
//    @Override
//    public void run(String... args) throws Exception {
//        this.template.send("myTopic", "foo1");
//        this.template.send("myTopic", "foo2");
//        this.template.send("myTopic", "foo3");
//        latch.await(60, TimeUnit.SECONDS);
//        logger.info("All received");
//    }
//
//    @KafkaListener(topics = "myTopic")
//    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
//        logger.info(cr.toString());
//        latch.countDown();
//    }


}
