package ca.wstratto.wow4j.domain.characterprofile;

import ca.wstratto.wow4j.domain.characterprofile.pvp.Bracket;
import com.google.gson.annotations.SerializedName;

public class Brackets {
    @SerializedName("ARENA_BRACKET_2v2")
    private Bracket twoVsTwo;

    @SerializedName("ARENA_BRACKET_2v2_SKIRMISH")
    private Bracket twoVsTwoSkirmish;

    @SerializedName("ARENA_BRACKET_3v3")
    private Bracket threeVsThree;

    @SerializedName("ARENA_BRACKET_RBG")
    private Bracket rbg;

    @SerializedName("UNKNOWN")
    private Bracket unknown;

    public Bracket getTwoVsTwo() {
        return twoVsTwo;
    }

    public void setTwoVsTwo(Bracket twoVsTwo) {
        this.twoVsTwo = twoVsTwo;
    }

    public Bracket getTwoVsTwoSkirmish() {
        return twoVsTwoSkirmish;
    }

    public void setTwoVsTwoSkirmish(Bracket twoVsTwoSkirmish) {
        this.twoVsTwoSkirmish = twoVsTwoSkirmish;
    }

    public Bracket getThreeVsThree() {
        return threeVsThree;
    }

    public void setThreeVsThree(Bracket threeVsThree) {
        this.threeVsThree = threeVsThree;
    }

    public Bracket getRbg() {
        return rbg;
    }

    public void setRbg(Bracket rbg) {
        this.rbg = rbg;
    }

    public Bracket getUnknown() {
        return unknown;
    }

    public void setUnknown(Bracket unknown) {
        this.unknown = unknown;
    }
}
