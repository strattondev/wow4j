package ca.wstratto.wow4j.response;

import ca.wstratto.wow4j.domain.realm.Realm;

import java.util.List;

public class RealmStatus extends AbstractResponse {
    private List<Realm> realms;

    public List<Realm> getRealms() {
        return realms;
    }

    public void setRealms(List<Realm> realms) {
        this.realms = realms;
    }
}
