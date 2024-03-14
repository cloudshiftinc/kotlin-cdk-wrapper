package io.cloudshiftdev.awscdk.services.lambda

public enum class LoggingFormat(
    private val cdkObject: software.amazon.awscdk.services.lambda.LoggingFormat,
) {
    TEXT(software.amazon.awscdk.services.lambda.LoggingFormat.TEXT),
    JSON(software.amazon.awscdk.services.lambda.LoggingFormat.JSON),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.LoggingFormat
        ): LoggingFormat =
            when (cdkObject) {
                software.amazon.awscdk.services.lambda.LoggingFormat.TEXT -> LoggingFormat.TEXT
                software.amazon.awscdk.services.lambda.LoggingFormat.JSON -> LoggingFormat.JSON
            }

        internal fun unwrap(
            wrapped: LoggingFormat
        ): software.amazon.awscdk.services.lambda.LoggingFormat = wrapped.cdkObject
    }
}
