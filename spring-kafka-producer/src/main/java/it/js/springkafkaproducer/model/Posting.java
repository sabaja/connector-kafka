package it.js.springkafkaproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Posting implements Serializable {
    private static final long serialVersionUID = 5725861113100441347L;
    // non c'è nel json di confluence
//    private String sequenceId;
        private Double amount;
        private Boolean credit;
        private String denomination;
        private String clientTransactionId;
        private String flagTypeControl;
        private String valueDate;
        // non c'è nel json di confluence
//        private String totElement;
        private AuthorizationDetails authorizationDetails;
}
