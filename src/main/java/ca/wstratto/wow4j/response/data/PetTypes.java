package ca.wstratto.wow4j.response.data;

import ca.wstratto.wow4j.domain.data.PetType;
import ca.wstratto.wow4j.response.AbstractResponse;

import java.util.List;

public class PetTypes extends AbstractResponse {
    private List<PetType> petTypes;

    public List<PetType> getPetTypes() {
        return petTypes;
    }

    public void setPetTypes(List<PetType> petTypes) {
        this.petTypes = petTypes;
    }
}
