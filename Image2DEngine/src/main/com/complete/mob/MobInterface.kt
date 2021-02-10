// Copyright (c) 2021.  mirror studio
// This file is created by mirror studio
// This file is opening source

package complete.mob

public open class MobInterface constructor (mobComputingHealth : Double, mobComputingMoveSpeed : Double, mobComputingArmor : Double) {
    var mobComputingHealth : Double = 100.0 //生命值
        get() = field
        set
    var mobComputingMoveSpeed : Double = 1.1 //移动速度 单位：m/s
        get() = field
        set
    var mobComputingArmor : Double = 0.0 //护甲
        get() = field
        set
}