package it.js.spring_kafka_producer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizationDetails implements Serializable {
    private static final long serialVersionUID = -8163444737346992908L;
    private String action;
    private String clientId;
    private String codFamily;
    private String codType;
    private String dueDate;
    private String company;
    private String resource;
    private String executionDate;
    private String feasibleOperation;
    private String operationNumber;
    private String reason;
    private List<AuthorizationDescription> descriptions;
    
    // non c'è nel json di confluence
    /*
    private String search;
    private String keyPending;
    private Double replacementAmount;
    private Double deltaAmount;
*/
}
