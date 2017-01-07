package ca.wstratto.wow4j.response.data.guild;

import ca.wstratto.wow4j.domain.data.Perk;
import ca.wstratto.wow4j.response.AbstractResponse;

import java.util.List;

public class Perks extends AbstractResponse {
    private List<Perk> perks;

    public List<Perk> getPerks() {
        return perks;
    }

    public void setPerks(List<Perk> perks) {
        this.perks = perks;
    }
}
