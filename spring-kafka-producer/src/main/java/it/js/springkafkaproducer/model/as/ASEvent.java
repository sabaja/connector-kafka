package it.js.springkafkaproducer.model.as;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class ASEvent implements Serializable {
    @Serial
    private static final long serialVersionUID = 8521069451394250784L;

    private String ssa;
    private String channel;
    private String type;
    private String sa;
    private String reversal;
    private String id;

    @Override
    public String toString() {
        return "ASEvent{" +
                "ssa='" + ssa + '\'' +
                ", channel='" + channel + '\'' +
                ", type='" + type + '\'' +
                ", sa='" + sa + '\'' +
                ", reversal='" + reversal + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
