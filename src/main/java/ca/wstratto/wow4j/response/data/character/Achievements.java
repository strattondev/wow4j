package ca.wstratto.wow4j.response.data.character;

import ca.wstratto.wow4j.domain.data.AchievementCategory;
import ca.wstratto.wow4j.response.AbstractResponse;

import java.util.List;

public class Achievements extends AbstractResponse {
    private List<AchievementCategory> achievements;

    public List<AchievementCategory> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<AchievementCategory> achievements) {
        this.achievements = achievements;
    }
}
