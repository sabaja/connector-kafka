package it.js.springkafkaproducer.service;

import it.js.commons.dto.NewOrder;
import it.js.springkafkaproducer.model.as.ASResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaTemplate<String, ASResponse> newOrderkafkaTemplate;

    public KafkaProducer(@Qualifier("stringKafkaTemplate") KafkaTemplate<String, String> kafkaTemplate,
                         @Qualifier("newOrderKafkaTemplate") KafkaTemplate<String, ASResponse> newOrderkafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.newOrderkafkaTemplate = newOrderkafkaTemplate;
    }

    public void send(String order) {
        String topic = "new-string-orders";
        kafkaTemplate.send(topic, order);

        log.info("sent: {}", order);
    }

    public void sendObject(String topic, ASResponse asResponse) {
        newOrderkafkaTemplate.send(topic, asResponse);

        log.info("sent object: {}", asResponse);

    }
}
