package it.js.spring_kafka_producer.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;

public class AuthorizationEventFromStringDeserializer extends JsonDeserializer<AuthorizationEvent> {

    private final ObjectMapper mapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Override
    public AuthorizationEvent deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        if (node.isTextual()) {
            String json = node.asText();
            return mapper.readValue(json, AuthorizationEvent.class);
        } else if (node.isObject()) {
            return mapper.treeToValue(node, AuthorizationEvent.class);
        } else {
            throw new JsonMappingException(jsonParser, "authorizationDetails deve essere un oggetto JSON o una stringa JSON");
        }
    }
}