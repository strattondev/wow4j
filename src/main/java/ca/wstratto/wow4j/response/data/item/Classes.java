package ca.wstratto.wow4j.response.data.item;

import ca.wstratto.wow4j.response.AbstractResponse;

import java.util.List;

public class Classes extends AbstractResponse {
    private List<ca.wstratto.wow4j.domain.data.item.Classes> classes;

    public List<ca.wstratto.wow4j.domain.data.item.Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<ca.wstratto.wow4j.domain.data.item.Classes> classes) {
        this.classes = classes;
    }
}
