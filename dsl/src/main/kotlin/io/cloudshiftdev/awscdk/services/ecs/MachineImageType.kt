package io.cloudshiftdev.awscdk.services.ecs

public enum class MachineImageType(
    private val cdkObject: software.amazon.awscdk.services.ecs.MachineImageType,
) {
    AMAZON_LINUX_2(software.amazon.awscdk.services.ecs.MachineImageType.AMAZON_LINUX_2),
    BOTTLEROCKET(software.amazon.awscdk.services.ecs.MachineImageType.BOTTLEROCKET),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.MachineImageType
        ): MachineImageType =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.MachineImageType.AMAZON_LINUX_2 ->
                    MachineImageType.AMAZON_LINUX_2
                software.amazon.awscdk.services.ecs.MachineImageType.BOTTLEROCKET ->
                    MachineImageType.BOTTLEROCKET
            }

        internal fun unwrap(
            wrapped: MachineImageType
        ): software.amazon.awscdk.services.ecs.MachineImageType = wrapped.cdkObject
    }
}
