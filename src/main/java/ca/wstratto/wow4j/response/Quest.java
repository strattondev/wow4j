package ca.wstratto.wow4j.response;

public class Quest extends AbstractResponse {
    private int id;
    private String title;
    private int reqLevel;
    private int suggestedPartyMembers;
    private String category;
    private int level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReqLevel() {
        return reqLevel;
    }

    public void setReqLevel(int reqLevel) {
        this.reqLevel = reqLevel;
    }

    public int getSuggestedPartyMembers() {
        return suggestedPartyMembers;
    }

    public void setSuggestedPartyMembers(int suggestedPartyMembers) {
        this.suggestedPartyMembers = suggestedPartyMembers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
