package io.cloudshiftdev.awscdk.services.lambda

public enum class DestinationType(
    private val cdkObject: software.amazon.awscdk.services.lambda.DestinationType,
) {
    FAILURE(software.amazon.awscdk.services.lambda.DestinationType.FAILURE),
    SUCCESS(software.amazon.awscdk.services.lambda.DestinationType.SUCCESS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.DestinationType
        ): DestinationType =
            when (cdkObject) {
                software.amazon.awscdk.services.lambda.DestinationType.FAILURE ->
                    DestinationType.FAILURE
                software.amazon.awscdk.services.lambda.DestinationType.SUCCESS ->
                    DestinationType.SUCCESS
            }

        internal fun unwrap(
            wrapped: DestinationType
        ): software.amazon.awscdk.services.lambda.DestinationType = wrapped.cdkObject
    }
}
