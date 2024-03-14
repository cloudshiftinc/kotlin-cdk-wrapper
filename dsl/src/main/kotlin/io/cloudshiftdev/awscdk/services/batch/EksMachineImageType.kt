package io.cloudshiftdev.awscdk.services.batch

public enum class EksMachineImageType(
    private val cdkObject: software.amazon.awscdk.services.batch.EksMachineImageType,
) {
    EKS_AL2(software.amazon.awscdk.services.batch.EksMachineImageType.EKS_AL2),
    EKS_AL2_NVIDIA(software.amazon.awscdk.services.batch.EksMachineImageType.EKS_AL2_NVIDIA),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.batch.EksMachineImageType
        ): EksMachineImageType =
            when (cdkObject) {
                software.amazon.awscdk.services.batch.EksMachineImageType.EKS_AL2 ->
                    EksMachineImageType.EKS_AL2
                software.amazon.awscdk.services.batch.EksMachineImageType.EKS_AL2_NVIDIA ->
                    EksMachineImageType.EKS_AL2_NVIDIA
            }

        internal fun unwrap(
            wrapped: EksMachineImageType
        ): software.amazon.awscdk.services.batch.EksMachineImageType = wrapped.cdkObject
    }
}
