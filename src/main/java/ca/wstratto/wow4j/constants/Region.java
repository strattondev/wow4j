package ca.wstratto.wow4j.constants;

public enum Region {
    US("us"),
    EU("eu"),
    KR("kr"),
    TW("tw");

    private String region;

    Region(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
