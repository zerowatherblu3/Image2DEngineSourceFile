// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.Things

internal open class ThingsInterface {
    val thingsName: String
        get() = this.thingsName
    var thingsQuality: String
        get() = this.thingsQuality
        set(value) {if (value < 0) null else value}
    var thingsCode: Int
        get() = this.thingsCode
        set(value) {if (value < 0) null else value}
    val thingsDescription: String
        get() = this.thingsDescription
}

operator fun String.compareTo(i: Int): Int {
    TODO("Not yet implemented")//不太理解为什么这么做
}