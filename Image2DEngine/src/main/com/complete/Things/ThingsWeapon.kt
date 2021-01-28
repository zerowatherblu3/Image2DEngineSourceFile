package complete.Things// Copyright (c) 2021. mirror studio All resigned
// you can edit this file without verify

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
            "0" -> "No Effect"
            "1" -> "Fire"
            "2" -> "Water"
            "3" -> "quantum"
            "4" -> "Electronic"
            "5" -> "Mental"
            "6" -> "Bionic"
        }
    }
}
