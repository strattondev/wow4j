package ca.wstratto.wow4j.domain.characterprofile.collectable;

import ca.wstratto.wow4j.domain.characterprofile.Collectable;

import java.util.List;

public class BattlePets extends Collectable {
    private List<BattlePet> collected;

    public List<BattlePet> getCollected() {
        return collected;
    }

    public void setCollected(List<BattlePet> collected) {
        this.collected = collected;
    }
}
