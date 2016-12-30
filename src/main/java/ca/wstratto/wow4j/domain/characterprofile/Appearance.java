package ca.wstratto.wow4j.domain.characterprofile;

import java.util.List;

public class Appearance {
    private int faceVariation;
    private int skinColor;
    private int hairVariation;
    private int hairColor;
    private int featureVariation;
    private boolean showHelm;
    private boolean showCloak;
    private List<Integer> customDisplayOptions;

    public int getFaceVariation() {
        return faceVariation;
    }

    public void setFaceVariation(int faceVariation) {
        this.faceVariation = faceVariation;
    }

    public int getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(int skinColor) {
        this.skinColor = skinColor;
    }

    public int getHairVariation() {
        return hairVariation;
    }

    public void setHairVariation(int hairVariation) {
        this.hairVariation = hairVariation;
    }

    public int getHairColor() {
        return hairColor;
    }

    public void setHairColor(int hairColor) {
        this.hairColor = hairColor;
    }

    public int getFeatureVariation() {
        return featureVariation;
    }

    public void setFeatureVariation(int featureVariation) {
        this.featureVariation = featureVariation;
    }

    public boolean isShowHelm() {
        return showHelm;
    }

    public void setShowHelm(boolean showHelm) {
        this.showHelm = showHelm;
    }

    public boolean isShowCloak() {
        return showCloak;
    }

    public void setShowCloak(boolean showCloak) {
        this.showCloak = showCloak;
    }

    public List<Integer> getCustomDisplayOptions() {
        return customDisplayOptions;
    }

    public void setCustomDisplayOptions(List<Integer> customDisplayOptions) {
        this.customDisplayOptions = customDisplayOptions;
    }
}
