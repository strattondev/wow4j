package ca.wstratto.wow4j.gson.deserializer;

import ca.wstratto.wow4j.response.Zone;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class ZoneDeserializer implements JsonDeserializer<Zone> {
    @Override
    public Zone deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Zone zone = new Zone();

        ca.wstratto.wow4j.domain.zone.Zone zoneDomain = new Gson().fromJson(json, ca.wstratto.wow4j.domain.zone.Zone.class);
        zone.setZone(zoneDomain);

        return zone;
    }
}
