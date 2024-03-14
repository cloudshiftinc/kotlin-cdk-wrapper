package io.cloudshiftdev.awscdk.services.s3

public enum class InventoryObjectVersion(
    private val cdkObject: software.amazon.awscdk.services.s3.InventoryObjectVersion,
) {
    ALL(software.amazon.awscdk.services.s3.InventoryObjectVersion.ALL),
    CURRENT(software.amazon.awscdk.services.s3.InventoryObjectVersion.CURRENT),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.InventoryObjectVersion
        ): InventoryObjectVersion =
            when (cdkObject) {
                software.amazon.awscdk.services.s3.InventoryObjectVersion.ALL ->
                    InventoryObjectVersion.ALL
                software.amazon.awscdk.services.s3.InventoryObjectVersion.CURRENT ->
                    InventoryObjectVersion.CURRENT
            }

        internal fun unwrap(
            wrapped: InventoryObjectVersion
        ): software.amazon.awscdk.services.s3.InventoryObjectVersion = wrapped.cdkObject
    }
}
