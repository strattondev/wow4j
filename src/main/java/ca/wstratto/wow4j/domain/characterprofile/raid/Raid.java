package ca.wstratto.wow4j.domain.characterprofile.raid;

import java.util.List;

public class Raid {
    private String name;
    private int lfr;
    private int normal;
    private int heroic;
    private int mythic;
    private int id;
    private List<Boss> bosses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLfr() {
        return lfr;
    }

    public void setLfr(int lfr) {
        this.lfr = lfr;
    }

    public int getNormal() {
        return normal;
    }

    public void setNormal(int normal) {
        this.normal = normal;
    }

    public int getHeroic() {
        return heroic;
    }

    public void setHeroic(int heroic) {
        this.heroic = heroic;
    }

    public int getMythic() {
        return mythic;
    }

    public void setMythic(int mythic) {
        this.mythic = mythic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }
}
