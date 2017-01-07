package ca.wstratto.wow4j.response.data;

import ca.wstratto.wow4j.domain.data.Battlegroup;
import ca.wstratto.wow4j.response.AbstractResponse;

import java.util.List;

public class Battlegroups extends AbstractResponse {
    private List<Battlegroup> battlegroups;

    public List<Battlegroup> getBattlegroups() {
        return battlegroups;
    }

    public void setBattlegroups(List<Battlegroup> battlegroups) {
        this.battlegroups = battlegroups;
    }
}
