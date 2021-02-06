// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.things

internal open class ThingsWeapon(weaponComputingBreakArmor: Double) : ThingsInterface() {
    var weaponComputingAttackDamage : Double //武器攻击伤害
        get() = this.weaponComputingAttackDamage
        set(value) {if (value < 0) null else value}
    var weaponComputingAttackSpeed : Double //武器攻击速度
        get() = this.weaponComputingAttackSpeed
        set(value) {if (value < 0) null else value}
    var weaponAttackEffect : String //武器效果
        get() = decideWeaponAttackEffect().toString()
        set(value) {if (value.toInt() !in 0..6) null else value}
    var weaponComputingBreakArmor : Double = weaponComputingBreakArmor //破甲
        get() = field
        set

    fun decideWeaponAttackEffect() {
        when (weaponAttackEffect.toString()){
        }
    }//在这里输入战斗中的各种属性
}
