package ca.wstratto.wow4j.domain.characterprofile.statable;

import ca.wstratto.wow4j.domain.characterprofile.Statable;
import com.google.gson.annotations.SerializedName;

public class Character extends Statable {
    @SerializedName("int")
    private int intellect;

    private String powerType;
    private int str;
    private int agi;
    private int sta;
    private float speedRating;
    private float speedRatingBonus;
    private float crit;
    private int critRating;
    private float haste;
    private int hasteRating;
    private float hasteRatingPercent;
    private float mastery;
    private int masteryRating;
    private float leech;
    private float leechRating;
    private float leechRatingBonus;
    private int versatility;
    private float versatilityDamageDoneBonus;
    private float versatilityHealingDoneBonus;
    private float versatilityDamageTakenBonus;
    private float avoidanceRating;
    private float avoidanceRatingBonus;
    private int  spellPen;
    private float spellCrit;
    private int spellCritRating;
    private int mana5;
    private int mana5Combat;
    private int armor;
    private float dodge;
    private int dodgeRating;
    private float parry;
    private int parryRating;
    private float block;
    private int blockRating;
    private int mainHandDmgMin;
    private int mainHandDmgMax;
    private float mainHandSpeed;
    private float mainHandDps;
    private int offHandDmgMin;
    private int offHandDmgMax;
    private float offHandSpeed;
    private float offHandDps;
    private int rangedDmgMin;
    private int rangedDmgMax;
    private float rangedSpeed;
    private float rangedDps;

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getSta() {
        return sta;
    }

    public void setSta(int sta) {
        this.sta = sta;
    }

    public float getSpeedRating() {
        return speedRating;
    }

    public void setSpeedRating(float speedRating) {
        this.speedRating = speedRating;
    }

    public float getSpeedRatingBonus() {
        return speedRatingBonus;
    }

    public void setSpeedRatingBonus(float speedRatingBonus) {
        this.speedRatingBonus = speedRatingBonus;
    }

    public float getCrit() {
        return crit;
    }

    public void setCrit(float crit) {
        this.crit = crit;
    }

    public int getCritRating() {
        return critRating;
    }

    public void setCritRating(int critRating) {
        this.critRating = critRating;
    }

    public float getHaste() {
        return haste;
    }

    public void setHaste(float haste) {
        this.haste = haste;
    }

    public int getHasteRating() {
        return hasteRating;
    }

    public void setHasteRating(int hasteRating) {
        this.hasteRating = hasteRating;
    }

    public float getHasteRatingPercent() {
        return hasteRatingPercent;
    }

    public void setHasteRatingPercent(float hasteRatingPercent) {
        this.hasteRatingPercent = hasteRatingPercent;
    }

    public float getMastery() {
        return mastery;
    }

    public void setMastery(float mastery) {
        this.mastery = mastery;
    }

    public int getMasteryRating() {
        return masteryRating;
    }

    public void setMasteryRating(int masteryRating) {
        this.masteryRating = masteryRating;
    }

    public float getLeech() {
        return leech;
    }

    public void setLeech(float leech) {
        this.leech = leech;
    }

    public float getLeechRating() {
        return leechRating;
    }

    public void setLeechRating(float leechRating) {
        this.leechRating = leechRating;
    }

    public float getLeechRatingBonus() {
        return leechRatingBonus;
    }

    public void setLeechRatingBonus(float leechRatingBonus) {
        this.leechRatingBonus = leechRatingBonus;
    }

    public int getVersatility() {
        return versatility;
    }

    public void setVersatility(int versatility) {
        this.versatility = versatility;
    }

    public float getVersatilityDamageDoneBonus() {
        return versatilityDamageDoneBonus;
    }

    public void setVersatilityDamageDoneBonus(float versatilityDamageDoneBonus) {
        this.versatilityDamageDoneBonus = versatilityDamageDoneBonus;
    }

    public float getVersatilityHealingDoneBonus() {
        return versatilityHealingDoneBonus;
    }

    public void setVersatilityHealingDoneBonus(float versatilityHealingDoneBonus) {
        this.versatilityHealingDoneBonus = versatilityHealingDoneBonus;
    }

    public float getVersatilityDamageTakenBonus() {
        return versatilityDamageTakenBonus;
    }

    public void setVersatilityDamageTakenBonus(float versatilityDamageTakenBonus) {
        this.versatilityDamageTakenBonus = versatilityDamageTakenBonus;
    }

    public float getAvoidanceRating() {
        return avoidanceRating;
    }

    public void setAvoidanceRating(float avoidanceRating) {
        this.avoidanceRating = avoidanceRating;
    }

    public float getAvoidanceRatingBonus() {
        return avoidanceRatingBonus;
    }

    public void setAvoidanceRatingBonus(float avoidanceRatingBonus) {
        this.avoidanceRatingBonus = avoidanceRatingBonus;
    }

    public int getSpellPen() {
        return spellPen;
    }

    public void setSpellPen(int spellPen) {
        this.spellPen = spellPen;
    }

    public float getSpellCrit() {
        return spellCrit;
    }

    public void setSpellCrit(float spellCrit) {
        this.spellCrit = spellCrit;
    }

    public int getSpellCritRating() {
        return spellCritRating;
    }

    public void setSpellCritRating(int spellCritRating) {
        this.spellCritRating = spellCritRating;
    }

    public int getMana5() {
        return mana5;
    }

    public void setMana5(int mana5) {
        this.mana5 = mana5;
    }

    public int getMana5Combat() {
        return mana5Combat;
    }

    public void setMana5Combat(int mana5Combat) {
        this.mana5Combat = mana5Combat;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public float getDodge() {
        return dodge;
    }

    public void setDodge(float dodge) {
        this.dodge = dodge;
    }

    public int getDodgeRating() {
        return dodgeRating;
    }

    public void setDodgeRating(int dodgeRating) {
        this.dodgeRating = dodgeRating;
    }

    public float getParry() {
        return parry;
    }

    public void setParry(float parry) {
        this.parry = parry;
    }

    public int getParryRating() {
        return parryRating;
    }

    public void setParryRating(int parryRating) {
        this.parryRating = parryRating;
    }

    public float getBlock() {
        return block;
    }

    public void setBlock(float block) {
        this.block = block;
    }

    public int getBlockRating() {
        return blockRating;
    }

    public void setBlockRating(int blockRating) {
        this.blockRating = blockRating;
    }

    public int getMainHandDmgMin() {
        return mainHandDmgMin;
    }

    public void setMainHandDmgMin(int mainHandDmgMin) {
        this.mainHandDmgMin = mainHandDmgMin;
    }

    public int getMainHandDmgMax() {
        return mainHandDmgMax;
    }

    public void setMainHandDmgMax(int mainHandDmgMax) {
        this.mainHandDmgMax = mainHandDmgMax;
    }

    public float getMainHandSpeed() {
        return mainHandSpeed;
    }

    public void setMainHandSpeed(float mainHandSpeed) {
        this.mainHandSpeed = mainHandSpeed;
    }

    public float getMainHandDps() {
        return mainHandDps;
    }

    public void setMainHandDps(float mainHandDps) {
        this.mainHandDps = mainHandDps;
    }

    public int getOffHandDmgMin() {
        return offHandDmgMin;
    }

    public void setOffHandDmgMin(int offHandDmgMin) {
        this.offHandDmgMin = offHandDmgMin;
    }

    public int getOffHandDmgMax() {
        return offHandDmgMax;
    }

    public void setOffHandDmgMax(int offHandDmgMax) {
        this.offHandDmgMax = offHandDmgMax;
    }

    public float getOffHandSpeed() {
        return offHandSpeed;
    }

    public void setOffHandSpeed(float offHandSpeed) {
        this.offHandSpeed = offHandSpeed;
    }

    public float getOffHandDps() {
        return offHandDps;
    }

    public void setOffHandDps(float offHandDps) {
        this.offHandDps = offHandDps;
    }

    public int getRangedDmgMin() {
        return rangedDmgMin;
    }

    public void setRangedDmgMin(int rangedDmgMin) {
        this.rangedDmgMin = rangedDmgMin;
    }

    public int getRangedDmgMax() {
        return rangedDmgMax;
    }

    public void setRangedDmgMax(int rangedDmgMax) {
        this.rangedDmgMax = rangedDmgMax;
    }

    public float getRangedSpeed() {
        return rangedSpeed;
    }

    public void setRangedSpeed(float rangedSpeed) {
        this.rangedSpeed = rangedSpeed;
    }

    public float getRangedDps() {
        return rangedDps;
    }

    public void setRangedDps(float rangedDps) {
        this.rangedDps = rangedDps;
    }
}
