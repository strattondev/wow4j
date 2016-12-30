package ca.wstratto.wow4j.domain.realmleaderboard.map;

import ca.wstratto.wow4j.domain.realmleaderboard.time.Criteria;

public class Map {
    private int id;
    private String name;
    private String slug;
    private boolean hasChallengeMode;
    private Criteria bronzeCriteria;
    private Criteria silverCriteria;
    private Criteria goldCriteria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isHasChallengeMode() {
        return hasChallengeMode;
    }

    public void setHasChallengeMode(boolean hasChallengeMode) {
        this.hasChallengeMode = hasChallengeMode;
    }

    public Criteria getBronzeCriteria() {
        return bronzeCriteria;
    }

    public void setBronzeCriteria(Criteria bronzeCriteria) {
        this.bronzeCriteria = bronzeCriteria;
    }

    public Criteria getSilverCriteria() {
        return silverCriteria;
    }

    public void setSilverCriteria(Criteria silverCriteria) {
        this.silverCriteria = silverCriteria;
    }

    public Criteria getGoldCriteria() {
        return goldCriteria;
    }

    public void setGoldCriteria(Criteria goldCriteria) {
        this.goldCriteria = goldCriteria;
    }
}
