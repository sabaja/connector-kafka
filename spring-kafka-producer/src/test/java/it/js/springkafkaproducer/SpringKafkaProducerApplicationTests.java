package it.js.springkafkaproducer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

@SpringBootTest
@ImportAutoConfiguration(exclude = KafkaAutoConfiguration.class)
class SpringKafkaProducerApplicationTests {

    @Test
    void contextLoads() {
    }
}