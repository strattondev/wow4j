package ca.wstratto.wow4j.domain.characterprofile;

import ca.wstratto.wow4j.domain.characterprofile.raid.Raid;

import java.util.List;

public class Progression {
    private List<Raid> raids;

    public List<Raid> getRaids() {
        return raids;
    }

    public void setRaids(List<Raid> raids) {
        this.raids = raids;
    }
}
