package ca.wstratto.wow4j.response.data;

import ca.wstratto.wow4j.domain.data.Talent;
import ca.wstratto.wow4j.response.AbstractResponse;

import java.util.Map;

public class Talents extends AbstractResponse {
    private Map<String, Talent> talents;

    public Map<String, Talent> getTalents() {
        return talents;
    }

    public void setTalents(Map<String, Talent> talents) {
        this.talents = talents;
    }
}
