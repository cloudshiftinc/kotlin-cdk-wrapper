package io.cloudshiftdev.awscdk.services.apigateway

public enum class MethodLoggingLevel(
    private val cdkObject: software.amazon.awscdk.services.apigateway.MethodLoggingLevel,
) {
    OFF(software.amazon.awscdk.services.apigateway.MethodLoggingLevel.OFF),
    ERROR(software.amazon.awscdk.services.apigateway.MethodLoggingLevel.ERROR),
    INFO(software.amazon.awscdk.services.apigateway.MethodLoggingLevel.INFO),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.MethodLoggingLevel
        ): MethodLoggingLevel =
            when (cdkObject) {
                software.amazon.awscdk.services.apigateway.MethodLoggingLevel.OFF ->
                    MethodLoggingLevel.OFF
                software.amazon.awscdk.services.apigateway.MethodLoggingLevel.ERROR ->
                    MethodLoggingLevel.ERROR
                software.amazon.awscdk.services.apigateway.MethodLoggingLevel.INFO ->
                    MethodLoggingLevel.INFO
            }

        internal fun unwrap(
            wrapped: MethodLoggingLevel
        ): software.amazon.awscdk.services.apigateway.MethodLoggingLevel = wrapped.cdkObject
    }
}
