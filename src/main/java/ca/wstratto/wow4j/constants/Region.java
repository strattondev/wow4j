package ca.wstratto.wow4j.constants;

/**
 * Created by wesleystratton on 2016-12-17.
 */
public enum Region {
    US("us"),
    EU("eu");

    private String region;

    Region(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
