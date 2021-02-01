// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.mob

class MobFighting {
    var FriendlyEffect : Boolean = true
        get() = field
        set
    var computingHatredLevel : Int? = -1
        get() = field
        set(value) {if (value in -1..10) value else -1}

    fun decideEnemyOrFriendly(FriendlyEffect : Boolean ,Friendly : Int = 0, Enemy : Int = 1): Int {
        if (FriendlyEffect == true) {
            return Friendly
        }
        else {
            return Enemy
        }
    }
}