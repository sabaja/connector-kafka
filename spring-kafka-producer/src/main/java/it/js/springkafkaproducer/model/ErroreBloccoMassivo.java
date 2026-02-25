package it.js.springkafkaproducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErroreBloccoMassivo implements Serializable {
    private String returnReason;
    private String description;
    private String requestId;
    @JsonDeserialize(using = AuthorizationEventFromStringDeserializer.class)
    private AuthorizationEvent requestContent;
}
