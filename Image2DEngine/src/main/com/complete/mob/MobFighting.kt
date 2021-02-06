// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.mob

class MobFighting {
    var friendlyEffect : Boolean = true
        get() = field
        set
    var computingHatredLevel : Int? = -1
        get() = field
        set(value) {if (value in -1..10) value else -1}

    fun decideEnemyOrFriendly(friendlyEffect : Boolean ,friendly : Int = 0, enemy : Int = 1): Int {
        if (friendlyEffect == true) {
            return friendly
        }
        else {
            return enemy
        }
    }
}