package ca.wstratto.wow4j.domain.data;

import ca.wstratto.wow4j.domain.Achievement;
import ca.wstratto.wow4j.domain.characterprofile.item.Item;

public class Reward {
    private int minGuildLevel;
    private int minGuildRepLevel;
    private Achievement achievement;
    private Item item;

    public int getMinGuildLevel() {
        return minGuildLevel;
    }

    public void setMinGuildLevel(int minGuildLevel) {
        this.minGuildLevel = minGuildLevel;
    }

    public int getMinGuildRepLevel() {
        return minGuildRepLevel;
    }

    public void setMinGuildRepLevel(int minGuildRepLevel) {
        this.minGuildRepLevel = minGuildRepLevel;
    }

    public Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(Achievement achievement) {
        this.achievement = achievement;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
