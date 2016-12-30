package ca.wstratto.wow4j.domain.characterprofile;

import java.util.List;

public class Achievements {
    private List<Integer> achievementsCompleted;
    private List<Long> achievementsCompletedTimestamp;
    private List<Integer> criteria;
    private List<Long> criteriaQuantity;
    private List<Long> criteriaTimestamp;
    private List<Long> criteriaCreated;

    public List<Integer> getAchievementsCompleted() {
        return achievementsCompleted;
    }

    public void setAchievementsCompleted(List<Integer> achievementsCompleted) {
        this.achievementsCompleted = achievementsCompleted;
    }

    public List<Long> getAchievementsCompletedTimestamp() {
        return achievementsCompletedTimestamp;
    }

    public void setAchievementsCompletedTimestamp(List<Long> achievementsCompletedTimestamp) {
        this.achievementsCompletedTimestamp = achievementsCompletedTimestamp;
    }

    public List<Integer> getCriteria() {
        return criteria;
    }

    public void setCriteria(List<Integer> criteria) {
        this.criteria = criteria;
    }

    public List<Long> getCriteriaQuantity() {
        return criteriaQuantity;
    }

    public void setCriteriaQuantity(List<Long> criteriaQuantity) {
        this.criteriaQuantity = criteriaQuantity;
    }

    public List<Long> getCriteriaTimestamp() {
        return criteriaTimestamp;
    }

    public void setCriteriaTimestamp(List<Long> criteriaTimestamp) {
        this.criteriaTimestamp = criteriaTimestamp;
    }

    public List<Long> getCriteriaCreated() {
        return criteriaCreated;
    }

    public void setCriteriaCreated(List<Long> criteriaCreated) {
        this.criteriaCreated = criteriaCreated;
    }
}
