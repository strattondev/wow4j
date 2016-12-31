package ca.wstratto.wow4j.domain.guild;

import ca.wstratto.wow4j.domain.realmleaderboard.group.Character;

public class Member {
    private Character character;
    private int rank;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
