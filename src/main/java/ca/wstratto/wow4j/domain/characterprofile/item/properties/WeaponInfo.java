package ca.wstratto.wow4j.domain.characterprofile.item.properties;

import ca.wstratto.wow4j.domain.characterprofile.item.properties.weapon.Damage;

public class WeaponInfo {
    private Damage damage;
    private float weaponSpeed;
    private float dps;

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public float getWeaponSpeed() {
        return weaponSpeed;
    }

    public void setWeaponSpeed(float weaponSpeed) {
        this.weaponSpeed = weaponSpeed;
    }

    public float getDps() {
        return dps;
    }

    public void setDps(float dps) {
        this.dps = dps;
    }
}
