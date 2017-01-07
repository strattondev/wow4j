package ca.wstratto.wow4j.response;

public class Achievement extends AbstractResponse {
    private ca.wstratto.wow4j.domain.Achievement achievement;

    public ca.wstratto.wow4j.domain.Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(ca.wstratto.wow4j.domain.Achievement achievement) {
        this.achievement = achievement;
    }
}
