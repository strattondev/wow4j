package ca.wstratto.wow4j.response;

import ca.wstratto.wow4j.domain.pvp.ArenaPlayer;

import java.util.List;

public class Leaderboard extends AbstractResponse {
    private List<ArenaPlayer> rows;

    public List<ArenaPlayer> getRows() {
        return rows;
    }

    public void setRows(List<ArenaPlayer> rows) {
        this.rows = rows;
    }
}
