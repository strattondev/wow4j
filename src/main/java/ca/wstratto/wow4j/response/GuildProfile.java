package ca.wstratto.wow4j.response;

import ca.wstratto.wow4j.domain.characterprofile.Achievements;
import ca.wstratto.wow4j.domain.guild.Member;
import ca.wstratto.wow4j.domain.realmleaderboard.ChallengeMode;

import java.util.List;

public class GuildProfile extends AbstractResponse {
    private long lastModified;
    private String name;
    private String realm;
    private String battlegroup;
    private int level;
    private int side;
    private int achievementPoints;
    private Achievements achievements;
    private List<ChallengeMode> challenge;
    private List<Member> members;

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getBattlegroup() {
        return battlegroup;
    }

    public void setBattlegroup(String battlegroup) {
        this.battlegroup = battlegroup;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(int achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public Achievements getAchievements() {
        return achievements;
    }

    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }

    public List<ChallengeMode> getChallenge() {
        return challenge;
    }

    public void setChallenge(List<ChallengeMode> challenge) {
        this.challenge = challenge;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
