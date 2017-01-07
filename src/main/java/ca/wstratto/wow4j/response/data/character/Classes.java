package ca.wstratto.wow4j.response.data.character;

import ca.wstratto.wow4j.response.AbstractResponse;

public class Classes extends AbstractResponse {
    private ca.wstratto.wow4j.domain.data.Classes classes;

    public ca.wstratto.wow4j.domain.data.Classes getClasses() {
        return classes;
    }

    public void setClasses(ca.wstratto.wow4j.domain.data.Classes classes) {
        this.classes = classes;
    }
}
