package ca.wstratto.wow4j.gson.deserializer.data;

import ca.wstratto.wow4j.Connection;
import ca.wstratto.wow4j.domain.characterprofile.specialization.Talent;
import ca.wstratto.wow4j.domain.data.talent.Column;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ColumnDeserializer implements JsonDeserializer<Column> {
    @Override
    public Column deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Column column = new Column();
        List<Talent> talentList = new ArrayList<>();

        for (JsonElement jsonElement : json.getAsJsonArray()) {
            talentList.add(Connection.GSON.fromJson(jsonElement, Talent.class));
        }

        column.setTalents(talentList);
        return column;
    }
}
