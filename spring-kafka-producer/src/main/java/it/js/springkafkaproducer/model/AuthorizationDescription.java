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
public class AuthorizationDescription implements Serializable {
    private static final long serialVersionUID = 8104189712710425634L;
    private String description;
    private String type;
}
