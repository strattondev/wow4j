package ca.wstratto.wow4j.domain.realm;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Realm {
    @SerializedName("connected_realms")
    private List<String> connectedRealms;

    private String type;
    private String population;
    private boolean queue;
    private boolean status;
    private String name;
    private String slug;
    private String battlegroup;
    private String locale;
    private String timezone;

    public List<String> getConnectedRealms() {
        return connectedRealms;
    }

    public void setConnectedRealms(List<String> connectedRealms) {
        this.connectedRealms = connectedRealms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public boolean isQueue() {
        return queue;
    }

    public void setQueue(boolean queue) {
        this.queue = queue;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBattlegroup() {
        return battlegroup;
    }

    public void setBattlegroup(String battlegroup) {
        this.battlegroup = battlegroup;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
