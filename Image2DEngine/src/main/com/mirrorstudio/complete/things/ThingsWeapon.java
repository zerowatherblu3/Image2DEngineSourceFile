// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is under LGPL license

package complete.things;

public class ThingsWeapon implements ThingsTemplate {
    private int thingsCode;
    private String thingsName;
    private String thingsDescription;

    private double weaponDamage;
    private double weaponAttackSpeed;
    private double weaponAttackBreakArmor;
    //TODO: 武器攻击造成的特殊效果(weaponEffect)


    public String getThingsDescription() {
        return thingsDescription;
    }

    public String getThingsName() {
        return thingsName;
    }

    public int getThingsCode() {
        return thingsCode;
    }

    public double getWeaponAttackBreakArmor() {
        return weaponAttackBreakArmor;
    }

    public double getWeaponAttackSpeed() {
        return weaponAttackSpeed;
    }

    public double getWeaponDamage() {
        return weaponDamage;
    }

}
