package it.js.springkafkaproducer.model.as;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ASResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 4533178970247459860L;

    private String status;
    private ASOperationalKey operationalKey;
    private ASEvent event;
    private List<ASFailure> failures;
    private List<AdditionalInfosVault> additionalInfosVault;
    private String id;

    @Override
    public String toString() {
        return "ASResponse{" +
                "status='" + status + '\'' +
                ", operationalKey=" + operationalKey +
                ", event=" + event +
                ", failures=" + failures +
                ", additionalInfosVault=" + additionalInfosVault +
                ", id='" + id + '\'' +
                '}';
    }
}
