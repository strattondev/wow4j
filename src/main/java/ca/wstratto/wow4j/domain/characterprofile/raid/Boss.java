package ca.wstratto.wow4j.domain.characterprofile.raid;

public class Boss {
    private int id;
    private String name;
    private int lfrKills;
    private long lfrTimestamp;
    private int normalKills;
    private long normalTimestamp;
    private int heroicKills;
    private long heroicTimestamp;
    private int mythicKills;
    private int mythicTimestamp;

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

    public int getLfrKills() {
        return lfrKills;
    }

    public void setLfrKills(int lfrKills) {
        this.lfrKills = lfrKills;
    }

    public long getLfrTimestamp() {
        return lfrTimestamp;
    }

    public void setLfrTimestamp(long lfrTimestamp) {
        this.lfrTimestamp = lfrTimestamp;
    }

    public int getNormalKills() {
        return normalKills;
    }

    public void setNormalKills(int normalKills) {
        this.normalKills = normalKills;
    }

    public long getNormalTimestamp() {
        return normalTimestamp;
    }

    public void setNormalTimestamp(long normalTimestamp) {
        this.normalTimestamp = normalTimestamp;
    }

    public int getHeroicKills() {
        return heroicKills;
    }

    public void setHeroicKills(int heroicKills) {
        this.heroicKills = heroicKills;
    }

    public long getHeroicTimestamp() {
        return heroicTimestamp;
    }

    public void setHeroicTimestamp(long heroicTimestamp) {
        this.heroicTimestamp = heroicTimestamp;
    }

    public int getMythicKills() {
        return mythicKills;
    }

    public void setMythicKills(int mythicKills) {
        this.mythicKills = mythicKills;
    }

    public int getMythicTimestamp() {
        return mythicTimestamp;
    }

    public void setMythicTimestamp(int mythicTimestamp) {
        this.mythicTimestamp = mythicTimestamp;
    }
}
