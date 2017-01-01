package ca.wstratto.wow4j.domain.pvp;

public class ArenaPlayer {
    private int ranking;
    private int rating;
    private String name;
    private int realmId;
    private String realmName;
    private String realmSlug;
    private int raceId;
    private int classId;
    private int specId;
    private int factionId;
    private int genderId;
    private int seasonWins;
    private int seasonLosses;
    private int weeklyWins;
    private int weeklyLosses;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRealmId() {
        return realmId;
    }

    public void setRealmId(int realmId) {
        this.realmId = realmId;
    }

    public String getRealmName() {
        return realmName;
    }

    public void setRealmName(String realmName) {
        this.realmName = realmName;
    }

    public String getRealmSlug() {
        return realmSlug;
    }

    public void setRealmSlug(String realmSlug) {
        this.realmSlug = realmSlug;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getSpecId() {
        return specId;
    }

    public void setSpecId(int specId) {
        this.specId = specId;
    }

    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public int getSeasonWins() {
        return seasonWins;
    }

    public void setSeasonWins(int seasonWins) {
        this.seasonWins = seasonWins;
    }

    public int getSeasonLosses() {
        return seasonLosses;
    }

    public void setSeasonLosses(int seasonLosses) {
        this.seasonLosses = seasonLosses;
    }

    public int getWeeklyWins() {
        return weeklyWins;
    }

    public void setWeeklyWins(int weeklyWins) {
        this.weeklyWins = weeklyWins;
    }

    public int getWeeklyLosses() {
        return weeklyLosses;
    }

    public void setWeeklyLosses(int weeklyLosses) {
        this.weeklyLosses = weeklyLosses;
    }
}
