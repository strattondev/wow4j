package ca.wstratto.wow4j.domain.characterprofile;

public class Collectable {
    private int numCollected;
    private int numNotCollected;

    public int getNumCollected() {
        return numCollected;
    }

    public void setNumCollected(int numCollected) {
        this.numCollected = numCollected;
    }

    public int getNumNotCollected() {
        return numNotCollected;
    }

    public void setNumNotCollected(int numNotCollected) {
        this.numNotCollected = numNotCollected;
    }
}
