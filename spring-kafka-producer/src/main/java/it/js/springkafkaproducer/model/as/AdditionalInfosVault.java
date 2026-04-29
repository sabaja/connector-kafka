package it.js.springkafkaproducer.model.as;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class AdditionalInfosVault implements Serializable {
    @Serial
    private static final long serialVersionUID = -1083723889686167813L;

    private String sequenceId;
    private ASOverdraft overdraft;
    private String reasonCode;
    private String reasonCodeDesc;

    @Override
    public String toString() {
        return "AdditionalInfosVault{" +
                "sequenceId='" + sequenceId + '\'' +
                ", overdraft=" + overdraft +
                ", reasonCode='" + reasonCode + '\'' +
                ", reasonCodeDesc='" + reasonCodeDesc + '\'' +
                '}';
    }
}
