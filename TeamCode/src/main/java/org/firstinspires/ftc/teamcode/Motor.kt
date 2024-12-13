package org.firstinspires.ftc.teamcode

import ArmSpecific.Hardware

fun Motor(motor:Hardware.Motor,motorName:String,encoderTicks: Double?,encoderName:String?) : Hardware.Motor {
    return Hardware.Motor(motor.rpm,encoderTicks?:motor.encoderTicksPerRotation,motor.stallTorque,motor.customGearRatio)
}