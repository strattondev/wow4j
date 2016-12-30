package ca.wstratto.wow4j.domain.characterprofile;

import java.util.List;

public class BattlePetSlot {
    private int slot;
    private String battlePetGuid;
    private boolean isEmpty;
    private boolean isLocked;
    private List<Integer> abilities;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getBattlePetGuid() {
        return battlePetGuid;
    }

    public void setBattlePetGuid(String battlePetGuid) {
        this.battlePetGuid = battlePetGuid;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public List<Integer> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Integer> abilities) {
        this.abilities = abilities;
    }
}
