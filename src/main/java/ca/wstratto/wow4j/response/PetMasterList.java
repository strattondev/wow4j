package ca.wstratto.wow4j.response;

import ca.wstratto.wow4j.domain.pet.Pet;

import java.util.List;

public class PetMasterList extends AbstractResponse {
    private List<Pet> pets;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
