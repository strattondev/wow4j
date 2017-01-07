package ca.wstratto.wow4j.gson.deserializer.data;

import ca.wstratto.wow4j.Connection;
import ca.wstratto.wow4j.domain.data.Talent;
import ca.wstratto.wow4j.response.data.Talents;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class TalentsDeserializer implements JsonDeserializer<Talents> {
    @Override
    public Talents deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Talents talents = new Talents();
        Map<String, Talent> talentMap = new HashMap<>();
        JsonObject jsonObject = json.getAsJsonObject();

        for (int i = 1; i <= 12; ++i) {
            JsonElement jsonElement = jsonObject.get(String.valueOf(i));
            talentMap.put(String.valueOf(i), Connection.GSON.fromJson(jsonElement, Talent.class));
        }

        talents.setTalents(talentMap);

        return talents;
    }
}
