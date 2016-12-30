package ca.wstratto.wow4j.domain.characterprofile.item.properties;

public class Appearance {
    private int itemid;
    private int itemAppearanceModId;
    private int enchantDisplayInfoId;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getItemAppearanceModId() {
        return itemAppearanceModId;
    }

    public void setItemAppearanceModId(int itemAppearanceModId) {
        this.itemAppearanceModId = itemAppearanceModId;
    }

    public int getEnchantDisplayInfoId() {
        return enchantDisplayInfoId;
    }

    public void setEnchantDisplayInfoId(int enchantDisplayInfoId) {
        this.enchantDisplayInfoId = enchantDisplayInfoId;
    }
}
