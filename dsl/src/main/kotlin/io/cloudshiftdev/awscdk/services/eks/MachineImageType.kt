package io.cloudshiftdev.awscdk.services.eks

public enum class MachineImageType(
    private val cdkObject: software.amazon.awscdk.services.eks.MachineImageType,
) {
    AMAZON_LINUX_2(software.amazon.awscdk.services.eks.MachineImageType.AMAZON_LINUX_2),
    BOTTLEROCKET(software.amazon.awscdk.services.eks.MachineImageType.BOTTLEROCKET),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.eks.MachineImageType
        ): MachineImageType =
            when (cdkObject) {
                software.amazon.awscdk.services.eks.MachineImageType.AMAZON_LINUX_2 ->
                    MachineImageType.AMAZON_LINUX_2
                software.amazon.awscdk.services.eks.MachineImageType.BOTTLEROCKET ->
                    MachineImageType.BOTTLEROCKET
            }

        internal fun unwrap(
            wrapped: MachineImageType
        ): software.amazon.awscdk.services.eks.MachineImageType = wrapped.cdkObject
    }
}
