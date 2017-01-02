package ca.wstratto.wow4j.domain.zone;

import ca.wstratto.wow4j.response.Boss;

import java.util.List;

public class Zone {
    private int id;
    private String name;
    private String urlSlug;
    private String description;
    private int expansionId;
    private String patch;
    private String numPlayers;
    private boolean isDungeon;
    private boolean isRaid;
    private int advisedMinLevel;
    private int advisedMaxLevel;
    private int advisedHeroicMinLevel;
    private int advisedHeroicMaxLevel;
    private List<String> availableModes;
    private int lfgNormalMinGearLevel;
    private int lfgHeroicMinGearLevel;
    private int floors;
    private List<Boss> bosses;
    private Location location;

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

    public String getUrlSlug() {
        return urlSlug;
    }

    public void setUrlSlug(String urlSlug) {
        this.urlSlug = urlSlug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExpansionId() {
        return expansionId;
    }

    public void setExpansionId(int expansionId) {
        this.expansionId = expansionId;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public String getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(String numPlayers) {
        this.numPlayers = numPlayers;
    }

    public boolean isDungeon() {
        return isDungeon;
    }

    public void setDungeon(boolean dungeon) {
        isDungeon = dungeon;
    }

    public boolean isRaid() {
        return isRaid;
    }

    public void setRaid(boolean raid) {
        isRaid = raid;
    }

    public int getAdvisedMinLevel() {
        return advisedMinLevel;
    }

    public void setAdvisedMinLevel(int advisedMinLevel) {
        this.advisedMinLevel = advisedMinLevel;
    }

    public int getAdvisedMaxLevel() {
        return advisedMaxLevel;
    }

    public void setAdvisedMaxLevel(int advisedMaxLevel) {
        this.advisedMaxLevel = advisedMaxLevel;
    }

    public int getAdvisedHeroicMinLevel() {
        return advisedHeroicMinLevel;
    }

    public void setAdvisedHeroicMinLevel(int advisedHeroicMinLevel) {
        this.advisedHeroicMinLevel = advisedHeroicMinLevel;
    }

    public int getAdvisedHeroicMaxLevel() {
        return advisedHeroicMaxLevel;
    }

    public void setAdvisedHeroicMaxLevel(int advisedHeroicMaxLevel) {
        this.advisedHeroicMaxLevel = advisedHeroicMaxLevel;
    }

    public List<String> getAvailableModes() {
        return availableModes;
    }

    public void setAvailableModes(List<String> availableModes) {
        this.availableModes = availableModes;
    }

    public int getLfgNormalMinGearLevel() {
        return lfgNormalMinGearLevel;
    }

    public void setLfgNormalMinGearLevel(int lfgNormalMinGearLevel) {
        this.lfgNormalMinGearLevel = lfgNormalMinGearLevel;
    }

    public int getLfgHeroicMinGearLevel() {
        return lfgHeroicMinGearLevel;
    }

    public void setLfgHeroicMinGearLevel(int lfgHeroicMinGearLevel) {
        this.lfgHeroicMinGearLevel = lfgHeroicMinGearLevel;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
