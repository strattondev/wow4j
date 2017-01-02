package ca.wstratto.wow4j.response;

import java.util.List;

public class Zone extends AbstractResponse {
    private List<ca.wstratto.wow4j.domain.zone.Zone> zones;

    public List<ca.wstratto.wow4j.domain.zone.Zone> getZones() {
        return zones;
    }

    public void setZones(List<ca.wstratto.wow4j.domain.zone.Zone> zones) {
        this.zones = zones;
    }
}
