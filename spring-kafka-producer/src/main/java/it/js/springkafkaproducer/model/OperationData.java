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
public class OperationData implements Serializable {
    private static final long serialVersionUID = 5375630324259360028L;
    private String ledgerCompany;
    private Boolean checkCircularity;
    private String entity;
    private String inUoEsec;
    private String inSportEsec;
    private String inOperEsec;
    // non c'è nel json di confluence
//    private String inPostLav;
}
