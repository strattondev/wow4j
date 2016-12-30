package ca.wstratto.wow4j.domain.characterprofile.pvp;

public class Bracket {
    private String slug;
    private int rating;
    private int weeklyPlayed;
    private int weeklyWon;
    private int weeklyLost;
    private int seasonPlayed;
    private int seasonWon;
    private int seasonLost;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getWeeklyPlayed() {
        return weeklyPlayed;
    }

    public void setWeeklyPlayed(int weeklyPlayed) {
        this.weeklyPlayed = weeklyPlayed;
    }

    public int getWeeklyWon() {
        return weeklyWon;
    }

    public void setWeeklyWon(int weeklyWon) {
        this.weeklyWon = weeklyWon;
    }

    public int getWeeklyLost() {
        return weeklyLost;
    }

    public void setWeeklyLost(int weeklyLost) {
        this.weeklyLost = weeklyLost;
    }

    public int getSeasonPlayed() {
        return seasonPlayed;
    }

    public void setSeasonPlayed(int seasonPlayed) {
        this.seasonPlayed = seasonPlayed;
    }

    public int getSeasonWon() {
        return seasonWon;
    }

    public void setSeasonWon(int seasonWon) {
        this.seasonWon = seasonWon;
    }

    public int getSeasonLost() {
        return seasonLost;
    }

    public void setSeasonLost(int seasonLost) {
        this.seasonLost = seasonLost;
    }
}
