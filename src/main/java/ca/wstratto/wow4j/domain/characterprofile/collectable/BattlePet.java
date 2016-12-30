package ca.wstratto.wow4j.domain.characterprofile.collectable;

public class BattlePet {
    private String name;
    private int spellId;
    private int creatureId;
    private int itemId;
    private int qualityId;
    private String icon;
    private ca.wstratto.wow4j.domain.characterprofile.statable.BattlePet stats;
    private String battlePetGuid;
    private boolean isFavorite;
    private boolean isFirstAbilitySlotSelected;
    private boolean isSecondAbilitySlotSelected;
    private boolean isThirdAbilitySlotSelected;
    private String creatureName;
    private boolean canBattle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellId() {
        return spellId;
    }

    public void setSpellId(int spellId) {
        this.spellId = spellId;
    }

    public int getCreatureId() {
        return creatureId;
    }

    public void setCreatureId(int creatureId) {
        this.creatureId = creatureId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQualityId() {
        return qualityId;
    }

    public void setQualityId(int qualityId) {
        this.qualityId = qualityId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ca.wstratto.wow4j.domain.characterprofile.statable.BattlePet getStats() {
        return stats;
    }

    public void setStats(ca.wstratto.wow4j.domain.characterprofile.statable.BattlePet stats) {
        this.stats = stats;
    }

    public String getBattlePetGuid() {
        return battlePetGuid;
    }

    public void setBattlePetGuid(String battlePetGuid) {
        this.battlePetGuid = battlePetGuid;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isFirstAbilitySlotSelected() {
        return isFirstAbilitySlotSelected;
    }

    public void setFirstAbilitySlotSelected(boolean firstAbilitySlotSelected) {
        isFirstAbilitySlotSelected = firstAbilitySlotSelected;
    }

    public boolean isSecondAbilitySlotSelected() {
        return isSecondAbilitySlotSelected;
    }

    public void setSecondAbilitySlotSelected(boolean secondAbilitySlotSelected) {
        isSecondAbilitySlotSelected = secondAbilitySlotSelected;
    }

    public boolean isThirdAbilitySlotSelected() {
        return isThirdAbilitySlotSelected;
    }

    public void setThirdAbilitySlotSelected(boolean thirdAbilitySlotSelected) {
        isThirdAbilitySlotSelected = thirdAbilitySlotSelected;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    public boolean isCanBattle() {
        return canBattle;
    }

    public void setCanBattle(boolean canBattle) {
        this.canBattle = canBattle;
    }
}
