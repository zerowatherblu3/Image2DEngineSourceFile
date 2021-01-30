// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.things

internal open class ThingsInterface {
    var thingsName: String //物品名称
        get() = this.thingsName
        set(value) {}
    var thingsQuality: String //物品数量
        get() = this.thingsQuality
        set(value) {if (value < 0) null else value}
    var thingsCode: Int //命名码
        get() = this.thingsCode
        set(value) {if (value < 0) null else value}
    var thingsDescription: String //物品描述
        get() = this.thingsDescription
        set(value) {}
}

operator fun String.compareTo(i: Int): Int {
    TODO("Not yet implemented")//不太理解为什么这么做
}