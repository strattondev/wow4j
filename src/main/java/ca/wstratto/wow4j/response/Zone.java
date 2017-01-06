package ca.wstratto.wow4j.response;

public class Zone extends AbstractResponse {
    private ca.wstratto.wow4j.domain.zone.Zone zone;

    public ca.wstratto.wow4j.domain.zone.Zone getZone() {
        return zone;
    }

    public void setZone(ca.wstratto.wow4j.domain.zone.Zone zone) {
        this.zone = zone;
    }
}
