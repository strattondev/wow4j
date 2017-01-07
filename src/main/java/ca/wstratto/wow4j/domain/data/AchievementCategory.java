package ca.wstratto.wow4j.domain.data;

import ca.wstratto.wow4j.domain.Achievement;

import java.util.List;

public class AchievementCategory {
    private int id;
    private List<Achievement> achievements;
    private List<AchievementCategory> categories;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public List<AchievementCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<AchievementCategory> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
