package ca.wstratto.wow4j.gson.deserializer;

import ca.wstratto.wow4j.response.Achievement;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class AchievementDeserializer implements JsonDeserializer<Achievement> {
    @Override
    public Achievement deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Achievement achievement = new Achievement();

        achievement.setAchievement(new Gson().fromJson(json, ca.wstratto.wow4j.domain.Achievement.class));

        return achievement;
    }
}
