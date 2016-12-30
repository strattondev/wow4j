package ca.wstratto.wow4j.response;

import ca.wstratto.wow4j.domain.characterprofile.Achievements;
import ca.wstratto.wow4j.domain.characterprofile.Specialization;
import ca.wstratto.wow4j.domain.characterprofile.Appearance;
import ca.wstratto.wow4j.domain.characterprofile.BattlePetSlot;
import ca.wstratto.wow4j.domain.characterprofile.Brackets;
import ca.wstratto.wow4j.domain.characterprofile.Faction;
import ca.wstratto.wow4j.domain.characterprofile.Items;
import ca.wstratto.wow4j.domain.characterprofile.Progression;
import ca.wstratto.wow4j.domain.characterprofile.Statistics;
import ca.wstratto.wow4j.domain.characterprofile.collectable.BattlePets;
import ca.wstratto.wow4j.domain.characterprofile.collectable.Mounts;
import ca.wstratto.wow4j.domain.characterprofile.Professions;
import ca.wstratto.wow4j.domain.characterprofile.statable.Character;
import ca.wstratto.wow4j.domain.characterprofile.Title;
import ca.wstratto.wow4j.domain.characterprofile.character.Guild;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CharacterProfile extends AbstractResponse {
    @SerializedName("class")
    private int characterClass;

    private long totalHonorableKills;
    private long lastModified;
    private String name;
    private String realm;
    private String battlegroup;
    private String thumbnail;
    private String calcClass;
    private int gender;
    private int race;
    private int level;
    private int achievementPoints;
    private int faction;

    private List<Integer> quests;

    private Achievements achievements;
    private Appearance appearance;
    private Guild guild;
    private Character stats;
    private Professions professions;
    private List<Faction> reputation;
    private List<Title> titles;
    private Mounts mounts;
    private BattlePets pets;
    private List<BattlePetSlot> petSlots;
    private Progression progression;
    private Brackets pvp;
    private Items items;
    private List<Specialization> talents;
    private Statistics statistics;

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

    public int getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(int characterClass) {
        this.characterClass = characterClass;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(int achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCalcClass() {
        return calcClass;
    }

    public void setCalcClass(String calcClass) {
        this.calcClass = calcClass;
    }

    public int getFaction() {
        return faction;
    }

    public void setFaction(int faction) {
        this.faction = faction;
    }

    public long getTotalHonorableKills() {
        return totalHonorableKills;
    }

    public void setTotalHonorableKills(long totalHonorableKills) {
        this.totalHonorableKills = totalHonorableKills;
    }

    public List<Integer> getQuests() {
        return quests;
    }

    public void setQuests(List<Integer> quests) {
        this.quests = quests;
    }

    public Achievements getAchievements() {
        return achievements;
    }

    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Character getStats() {
        return stats;
    }

    public void setStats(Character stats) {
        this.stats = stats;
    }

    public Professions getProfessions() {
        return professions;
    }

    public void setProfessions(Professions professions) {
        this.professions = professions;
    }

    public List<Faction> getReputation() {
        return reputation;
    }

    public void setReputation(List<Faction> reputation) {
        this.reputation = reputation;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public Mounts getMounts() {
        return mounts;
    }

    public void setMounts(Mounts mounts) {
        this.mounts = mounts;
    }

    public BattlePets getPets() {
        return pets;
    }

    public void setPets(BattlePets pets) {
        this.pets = pets;
    }

    public List<BattlePetSlot> getPetSlots() {
        return petSlots;
    }

    public void setPetSlots(List<BattlePetSlot> petSlots) {
        this.petSlots = petSlots;
    }

    public Progression getProgression() {
        return progression;
    }

    public void setProgression(Progression progression) {
        this.progression = progression;
    }

    public Brackets getPvp() {
        return pvp;
    }

    public void setPvp(Brackets pvp) {
        this.pvp = pvp;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public List<Specialization> getTalents() {
        return talents;
    }

    public void setTalents(List<Specialization> talents) {
        this.talents = talents;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }
}
