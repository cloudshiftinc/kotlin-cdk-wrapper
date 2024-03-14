package io.cloudshiftdev.awscdk.services.ec2

public enum class InstanceArchitecture(
    private val cdkObject: software.amazon.awscdk.services.ec2.InstanceArchitecture,
) {
    ARM_64(software.amazon.awscdk.services.ec2.InstanceArchitecture.ARM_64),
    X86_64(software.amazon.awscdk.services.ec2.InstanceArchitecture.X86_64),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.InstanceArchitecture
        ): InstanceArchitecture =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.InstanceArchitecture.ARM_64 ->
                    InstanceArchitecture.ARM_64
                software.amazon.awscdk.services.ec2.InstanceArchitecture.X86_64 ->
                    InstanceArchitecture.X86_64
            }

        internal fun unwrap(
            wrapped: InstanceArchitecture
        ): software.amazon.awscdk.services.ec2.InstanceArchitecture = wrapped.cdkObject
    }
}
