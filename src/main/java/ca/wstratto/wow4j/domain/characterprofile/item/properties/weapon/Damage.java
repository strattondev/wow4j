package ca.wstratto.wow4j.domain.characterprofile.item.properties.weapon;

public class Damage {
    private int min;
    private int max;
    private int exactMin;
    private int exactMax;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getExactMin() {
        return exactMin;
    }

    public void setExactMin(int exactMin) {
        this.exactMin = exactMin;
    }

    public int getExactMax() {
        return exactMax;
    }

    public void setExactMax(int exactMax) {
        this.exactMax = exactMax;
    }
}
