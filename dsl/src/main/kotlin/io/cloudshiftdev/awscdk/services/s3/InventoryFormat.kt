package io.cloudshiftdev.awscdk.services.s3

public enum class InventoryFormat(
    private val cdkObject: software.amazon.awscdk.services.s3.InventoryFormat,
) {
    CSV(software.amazon.awscdk.services.s3.InventoryFormat.CSV),
    PARQUET(software.amazon.awscdk.services.s3.InventoryFormat.PARQUET),
    ORC(software.amazon.awscdk.services.s3.InventoryFormat.ORC),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.InventoryFormat
        ): InventoryFormat =
            when (cdkObject) {
                software.amazon.awscdk.services.s3.InventoryFormat.CSV -> InventoryFormat.CSV
                software.amazon.awscdk.services.s3.InventoryFormat.PARQUET ->
                    InventoryFormat.PARQUET
                software.amazon.awscdk.services.s3.InventoryFormat.ORC -> InventoryFormat.ORC
            }

        internal fun unwrap(
            wrapped: InventoryFormat
        ): software.amazon.awscdk.services.s3.InventoryFormat = wrapped.cdkObject
    }
}
