// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.things

internal class ThingsWeapon : ThingsInterface() {
    var weaponComputingAttackDamage : Double //武器攻击伤害
        get() = this.weaponComputingAttackDamage
        set(value) {if (value < 0) null else value}
    var weaponComputingAttackSpeed : Double //武器攻击速度
        get() = this.weaponComputingAttackSpeed
        set(value) {if (value < 0) null else value}
    var weaponAttackEffect : String //武器效果
        get() = decideWeaponAttackEffect().toString()
        set(value) {if (value !in 0..6) null else value}

    fun decideWeaponAttackEffect() {
        when (weaponAttackEffect.toString()){
        }
    }
}
