package ca.wstratto.wow4j.domain.data;

public class PetType {
    private int id;
    private String key;
    private String name;
    private int typeAbilityId;
    private int strongAgainstId;
    private int weakAgainstId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeAbilityId() {
        return typeAbilityId;
    }

    public void setTypeAbilityId(int typeAbilityId) {
        this.typeAbilityId = typeAbilityId;
    }

    public int getStrongAgainstId() {
        return strongAgainstId;
    }

    public void setStrongAgainstId(int strongAgainstId) {
        this.strongAgainstId = strongAgainstId;
    }

    public int getWeakAgainstId() {
        return weakAgainstId;
    }

    public void setWeakAgainstId(int weakAgainstId) {
        this.weakAgainstId = weakAgainstId;
    }
}
