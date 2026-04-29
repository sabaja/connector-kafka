package it.js.springkafkaproducer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.js.commons.dto.NewOrder;
import it.js.springkafkaproducer.model.as.ASResponse;
import it.js.springkafkaproducer.service.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;


@Slf4j
@SpringBootApplication
public class SpringKafkaProducerApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringKafkaProducerApplication.class, args);
    }


    @Bean
    CommandLineRunner sender(KafkaProducer producer) {

        return _ -> {
            log.info("START INVIO");
            String message = "New order Patata";
            producer.send(message);
//            final NewOrder newOrder = createNewOrder();

            final ASResponse asResponse = createAsResponse();
            producer.sendObject("Kafka_Example1", asResponse);
        };
    }

    private ASResponse createAsResponse() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = """
                    {
                    "status": "EXEC-PARK-PROCESSED-OK",
                    "operationalKey": {
                        "company": "01",
                        "resource": "9943B",
                        "executionDate": "20260422",
                        "feasibleOperation": "MAVAC",
                        "operationNumber": "131508849"
                    },
                    "event": {
                        "ssa": "PO",
                        "channel": "01",
                        "type": "PAGAMENTO_MAV",
                        "sa": "G",
                        "reversal": "false",
                        "id": "9943B20260422MAVAC131508849"
                    },
                    "additionalInfosVault": [
                    ],
                    "id": "019943B20260422MAVAC131508849-1776856615991"
                }
                """;
        return objectMapper.readValue(json, ASResponse.class);
    }


    private NewOrder createNewOrder() {
        final NewOrder newOrder = new NewOrder();
        newOrder.setCustomer("Ordine");
        final ArrayList<Integer> orderIds = new ArrayList<>();
        orderIds.add((int) System.currentTimeMillis());
        orderIds.add(1);
        newOrder.setOrderIds(orderIds);
        return newOrder;
    }
}
