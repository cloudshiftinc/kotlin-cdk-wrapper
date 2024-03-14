package io.cloudshiftdev.awscdk.services.eks

public enum class PatchType(
    private val cdkObject: software.amazon.awscdk.services.eks.PatchType,
) {
    JSON(software.amazon.awscdk.services.eks.PatchType.JSON),
    MERGE(software.amazon.awscdk.services.eks.PatchType.MERGE),
    STRATEGIC(software.amazon.awscdk.services.eks.PatchType.STRATEGIC),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.PatchType): PatchType =
            when (cdkObject) {
                software.amazon.awscdk.services.eks.PatchType.JSON -> PatchType.JSON
                software.amazon.awscdk.services.eks.PatchType.MERGE -> PatchType.MERGE
                software.amazon.awscdk.services.eks.PatchType.STRATEGIC -> PatchType.STRATEGIC
            }

        internal fun unwrap(wrapped: PatchType): software.amazon.awscdk.services.eks.PatchType =
            wrapped.cdkObject
    }
}
