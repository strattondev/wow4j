package ca.wstratto.wow4j.domain.characterprofile;

import ca.wstratto.wow4j.domain.characterprofile.profession.Profession;

import java.util.List;

public class Professions {
    private List<Profession> primary;
    private List<Profession> secondary;

    public List<Profession> getPrimary() {
        return primary;
    }

    public void setPrimary(List<Profession> primary) {
        this.primary = primary;
    }

    public List<Profession> getSecondary() {
        return secondary;
    }

    public void setSecondary(List<Profession> secondary) {
        this.secondary = secondary;
    }
}
