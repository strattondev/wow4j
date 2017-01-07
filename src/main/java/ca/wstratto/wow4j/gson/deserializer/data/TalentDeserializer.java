package ca.wstratto.wow4j.gson.deserializer.data;

import ca.wstratto.wow4j.Connection;
import ca.wstratto.wow4j.domain.characterprofile.specialization.Spec;
import ca.wstratto.wow4j.domain.data.Talent;
import ca.wstratto.wow4j.domain.data.talent.Tree;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TalentDeserializer implements JsonDeserializer<Talent> {
    @Override
    public Talent deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Talent talent = new Talent();
        List<Spec> specList = new ArrayList<>();
        List<Tree> treeList = new ArrayList<>();
        JsonObject jsonObject = json.getAsJsonObject();

        for (JsonElement jsonElement : jsonObject.getAsJsonArray("specs")) {
            specList.add(Connection.GSON.fromJson(jsonElement, Spec.class));
        }

        for (JsonElement jsonElement : jsonObject.getAsJsonArray("talents")) {
            treeList.add(Connection.GSON.fromJson(jsonElement, Tree.class));
        }

        talent.setClassName(jsonObject.get("class").getAsString());
        talent.setSpecs(specList);
        talent.setTalents(treeList);

        return talent;
    }
}
