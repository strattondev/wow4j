package ca.wstratto.wow4j.domain.characterprofile.profession;

import java.util.List;

public class Profession {
    private int id;
    private String name;
    private String icon;
    private int rank;
    private int max;
    private List<Integer> recipes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public List<Integer> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Integer> recipes) {
        this.recipes = recipes;
    }
}
