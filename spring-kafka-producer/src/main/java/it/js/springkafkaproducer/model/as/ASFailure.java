package it.js.springkafkaproducer.model.as;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class ASFailure implements Serializable {
    @Serial
    private static final long serialVersionUID = -6450346056616509041L;

    private String source;
    private String type;
    private String code;
    private String description;
    private String field;
    private String fieldFormat;

    @Override
    public String toString() {
        return "ASFailure{" +
                "source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", field='" + field + '\'' +
                ", fieldFormat='" + fieldFormat + '\'' +
                '}';
    }
}
