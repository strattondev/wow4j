package ca.wstratto.wow4j.domain.characterprofile;

import ca.wstratto.wow4j.domain.characterprofile.statistics.SubCategory;

import java.util.List;

public class Statistics {
    private int id;
    private String name;
    private List<SubCategory> subCategories;

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

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
