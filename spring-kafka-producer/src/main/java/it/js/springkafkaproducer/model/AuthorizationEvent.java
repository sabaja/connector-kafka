package it.js.springkafkaproducer.model;


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
public class AuthorizationEvent implements Serializable {
    private static final long serialVersionUID = 7880280197863299267L;
    private String date;
    private String accountId;
    private String typeRif;
    private String sa;
    private String ssa;
    private String channel;
    private Integer timeToLive;
    private OperationalKey operationalKey;
    // non c'è nel json di confluence
//    private ExternalId externalId;
    private OperationData operationData;
    private List<Posting> postings;
}
