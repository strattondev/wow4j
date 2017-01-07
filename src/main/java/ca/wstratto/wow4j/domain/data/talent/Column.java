package ca.wstratto.wow4j.domain.data.talent;

import ca.wstratto.wow4j.domain.characterprofile.specialization.Talent;

import java.util.List;

public class Column {
    private List<Talent> talents;

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }
}
