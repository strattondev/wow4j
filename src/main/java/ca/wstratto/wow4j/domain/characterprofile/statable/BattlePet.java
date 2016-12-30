package ca.wstratto.wow4j.domain.characterprofile.statable;

import ca.wstratto.wow4j.domain.characterprofile.Statable;

public class BattlePet extends Statable {
    private int speciesId;
    private int breedId;
    private int petQualityId;
    private int level;
    private int speed;

    public int getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(int speciesId) {
        this.speciesId = speciesId;
    }

    public int getBreedId() {
        return breedId;
    }

    public void setBreedId(int breedId) {
        this.breedId = breedId;
    }

    public int getPetQualityId() {
        return petQualityId;
    }

    public void setPetQualityId(int petQualityId) {
        this.petQualityId = petQualityId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
