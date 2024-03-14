package io.cloudshiftdev.awscdk.services.lambda

public enum class Tracing(
    private val cdkObject: software.amazon.awscdk.services.lambda.Tracing,
) {
    ACTIVE(software.amazon.awscdk.services.lambda.Tracing.ACTIVE),
    PASS_THROUGH(software.amazon.awscdk.services.lambda.Tracing.PASS_THROUGH),
    DISABLED(software.amazon.awscdk.services.lambda.Tracing.DISABLED),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Tracing): Tracing =
            when (cdkObject) {
                software.amazon.awscdk.services.lambda.Tracing.ACTIVE -> Tracing.ACTIVE
                software.amazon.awscdk.services.lambda.Tracing.PASS_THROUGH -> Tracing.PASS_THROUGH
                software.amazon.awscdk.services.lambda.Tracing.DISABLED -> Tracing.DISABLED
            }

        internal fun unwrap(wrapped: Tracing): software.amazon.awscdk.services.lambda.Tracing =
            wrapped.cdkObject
    }
}
