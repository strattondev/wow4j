package ca.wstratto.wow4j.constants;

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
