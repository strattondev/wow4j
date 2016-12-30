package ca.wstratto.wow4j.domain.characterprofile.collectable;

import ca.wstratto.wow4j.domain.characterprofile.Collectable;

import java.util.List;

public class Mounts extends Collectable {
    private List<Mount> collected;

    public List<Mount> getCollected() {
        return collected;
    }

    public void setCollected(List<Mount> collected) {
        this.collected = collected;
    }
}
