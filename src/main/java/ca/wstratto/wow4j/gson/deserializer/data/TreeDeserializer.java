package ca.wstratto.wow4j.gson.deserializer.data;

import ca.wstratto.wow4j.Connection;
import ca.wstratto.wow4j.domain.data.talent.Column;
import ca.wstratto.wow4j.domain.data.talent.Tree;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TreeDeserializer implements JsonDeserializer<Tree> {
    @Override
    public Tree deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Tree tree = new Tree();
        List<Column> columnList = new ArrayList<>();

        JsonArray jsonArray = json.getAsJsonArray();

        for (JsonElement jsonElement : jsonArray) {
            columnList.add(Connection.GSON.fromJson(jsonElement, Column.class));
        }

        tree.setColumns(columnList);
        return tree;
    }
}
