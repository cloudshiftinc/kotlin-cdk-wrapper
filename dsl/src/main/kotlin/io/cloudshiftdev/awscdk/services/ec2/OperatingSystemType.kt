package io.cloudshiftdev.awscdk.services.ec2

public enum class OperatingSystemType(
    private val cdkObject: software.amazon.awscdk.services.ec2.OperatingSystemType,
) {
    LINUX(software.amazon.awscdk.services.ec2.OperatingSystemType.LINUX),
    WINDOWS(software.amazon.awscdk.services.ec2.OperatingSystemType.WINDOWS),
    UNKNOWN(software.amazon.awscdk.services.ec2.OperatingSystemType.UNKNOWN),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.OperatingSystemType
        ): OperatingSystemType =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.OperatingSystemType.LINUX ->
                    OperatingSystemType.LINUX
                software.amazon.awscdk.services.ec2.OperatingSystemType.WINDOWS ->
                    OperatingSystemType.WINDOWS
                software.amazon.awscdk.services.ec2.OperatingSystemType.UNKNOWN ->
                    OperatingSystemType.UNKNOWN
            }

        internal fun unwrap(
            wrapped: OperatingSystemType
        ): software.amazon.awscdk.services.ec2.OperatingSystemType = wrapped.cdkObject
    }
}
