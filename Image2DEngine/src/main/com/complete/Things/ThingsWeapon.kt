// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.Things

internal class ThingsWeapon : ThingsInterface() {
    var weaponAttackDamage : Double
        get() = this.weaponAttackDamage
        set(value) {if (value < 0) null else value}
    var weaponAttackSpeed : Double
        get() = this.weaponAttackSpeed
        set(value) {if (value < 0) null else value}
    var weaponAttackEffect : String
        get() = decideWeaponAttackEffect().toString()
        set(value) {if (value !in 0..6) null else value}

    fun decideWeaponAttackEffect() {
        when (weaponAttackEffect.toString()){
        }
    }
}
