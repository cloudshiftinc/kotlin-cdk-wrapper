package io.cloudshiftdev.awscdk.services.fsx

public enum class LustreDataCompressionType(
    private val cdkObject: software.amazon.awscdk.services.fsx.LustreDataCompressionType,
) {
    NONE(software.amazon.awscdk.services.fsx.LustreDataCompressionType.NONE),
    LZ4(software.amazon.awscdk.services.fsx.LustreDataCompressionType.LZ4),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.fsx.LustreDataCompressionType
        ): LustreDataCompressionType =
            when (cdkObject) {
                software.amazon.awscdk.services.fsx.LustreDataCompressionType.NONE ->
                    LustreDataCompressionType.NONE
                software.amazon.awscdk.services.fsx.LustreDataCompressionType.LZ4 ->
                    LustreDataCompressionType.LZ4
            }

        internal fun unwrap(
            wrapped: LustreDataCompressionType
        ): software.amazon.awscdk.services.fsx.LustreDataCompressionType = wrapped.cdkObject
    }
}
