package it.js.springkafkaproducer.model.as;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class ASOverdraft implements Serializable {
    @Serial
    private static final long serialVersionUID = 4004488194666975868L;

    private String flag;
    private String type;
    private String amount;
    private String perc;
    private String flagInt;
    private String typeMov;
    private String bookBalance;
    private String availableBalance;

    @Override
    public String toString() {
        return "ASOverdraft{" +
                "flag='" + flag + '\'' +
                ", type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                ", perc='" + perc + '\'' +
                ", flagInt='" + flagInt + '\'' +
                ", typeMov='" + typeMov + '\'' +
                ", bookBalance='" + bookBalance + '\'' +
                ", availableBalance='" + availableBalance + '\'' +
                '}';
    }
}
