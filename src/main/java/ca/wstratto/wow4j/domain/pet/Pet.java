package ca.wstratto.wow4j.domain.pet;

import ca.wstratto.wow4j.domain.characterprofile.statable.BattlePet;

import java.util.List;

public class Pet {
    private boolean canBattle;
    private int creatureId;
    private String name;
    private String family;
    private String icon;
    private int qualityId;
    private BattlePet stats;
    private List<String> strongAgainst;
    private int typeId;
    private List<String> weakAgainst;

    public boolean isCanBattle() {
        return canBattle;
    }

    public void setCanBattle(boolean canBattle) {
        this.canBattle = canBattle;
    }

    public int getCreatureId() {
        return creatureId;
    }

    public void setCreatureId(int creatureId) {
        this.creatureId = creatureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getQualityId() {
        return qualityId;
    }

    public void setQualityId(int qualityId) {
        this.qualityId = qualityId;
    }

    public BattlePet getStats() {
        return stats;
    }

    public void setStats(BattlePet stats) {
        this.stats = stats;
    }

    public List<String> getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(List<String> strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public List<String> getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(List<String> weakAgainst) {
        this.weakAgainst = weakAgainst;
    }
}
