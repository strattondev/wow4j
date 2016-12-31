package ca.wstratto.wow4j.domain.pet;

public class Ability {
    private int slot;
    private int order;
    private int requiredLevel;
    private int id;
    private String name;
    private String icon;
    private long cooldown;
    private int rounds;
    private int petTypeId;
    private boolean isPassive;
    private boolean hideHints;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getCooldown() {
        return cooldown;
    }

    public void setCooldown(long cooldown) {
        this.cooldown = cooldown;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getPetTypeId() {
        return petTypeId;
    }

    public void setPetTypeId(int petTypeId) {
        this.petTypeId = petTypeId;
    }

    public boolean isPassive() {
        return isPassive;
    }

    public void setPassive(boolean passive) {
        isPassive = passive;
    }

    public boolean isHideHints() {
        return hideHints;
    }

    public void setHideHints(boolean hideHints) {
        this.hideHints = hideHints;
    }
}
