// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes.hardware_info

@Suppress("unused")
class ImuType private constructor() {
    companion object {
        const val Other: UShort = 0u
        const val MPU9250: UShort = 1u
        const val MPU6500: UShort = 2u
        const val BNO080: UShort = 3u
        const val BNO085: UShort = 4u
        const val BNO055: UShort = 5u
        const val MPU6050: UShort = 6u
        const val BNO086: UShort = 7u
        const val BMI160: UShort = 8u
        const val ICM20948: UShort = 9u
        const val ICM42688: UShort = 10u
        const val BMI270: UShort = 11u
        const val LSM6DSV: UShort = 12u
        val names : Array<String> = arrayOf("Other", "MPU9250", "MPU6500", "BNO080", "BNO085", "BNO055", "MPU6050", "BNO086", "BMI160", "ICM20948", "ICM42688", "BMI270", "LSM6DSV")
        @JvmStatic
        fun name(e: Int) : String = names[e]
    }
}
