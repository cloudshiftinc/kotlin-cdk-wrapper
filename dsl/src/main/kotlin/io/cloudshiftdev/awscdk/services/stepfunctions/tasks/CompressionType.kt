package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class CompressionType(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CompressionType,
) {
    NONE(software.amazon.awscdk.services.stepfunctions.tasks.CompressionType.NONE),
    GZIP(software.amazon.awscdk.services.stepfunctions.tasks.CompressionType.GZIP),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CompressionType
        ): CompressionType =
            when (cdkObject) {
                software.amazon.awscdk.services.stepfunctions.tasks.CompressionType.NONE ->
                    CompressionType.NONE
                software.amazon.awscdk.services.stepfunctions.tasks.CompressionType.GZIP ->
                    CompressionType.GZIP
            }

        internal fun unwrap(
            wrapped: CompressionType
        ): software.amazon.awscdk.services.stepfunctions.tasks.CompressionType = wrapped.cdkObject
    }
}
