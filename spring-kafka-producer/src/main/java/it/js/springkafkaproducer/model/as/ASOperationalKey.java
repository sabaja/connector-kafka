package it.js.springkafkaproducer.model.as;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class ASOperationalKey implements Serializable {
    @Serial
    private static final long serialVersionUID = -3452537911718602574L;

    private String company;
    private String resource;
    private String executionDate;
    private String feasibleOperation;
    private String operationNumber;


}
