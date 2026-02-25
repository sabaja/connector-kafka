package it.js.spring_kafka_producer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperationalKey implements Serializable {
    private static final long serialVersionUID = -6864087034256876001L;
    private String company;
    private String resource;
    private String executionDate;
    private String feasibleOperation;
    private String operationNumber;
}
