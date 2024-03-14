package io.cloudshiftdev.awscdk.services.appconfig

public enum class SourceType(
    private val cdkObject: software.amazon.awscdk.services.appconfig.SourceType,
) {
    LAMBDA(software.amazon.awscdk.services.appconfig.SourceType.LAMBDA),
    SQS(software.amazon.awscdk.services.appconfig.SourceType.SQS),
    SNS(software.amazon.awscdk.services.appconfig.SourceType.SNS),
    EVENTS(software.amazon.awscdk.services.appconfig.SourceType.EVENTS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.SourceType
        ): SourceType =
            when (cdkObject) {
                software.amazon.awscdk.services.appconfig.SourceType.LAMBDA -> SourceType.LAMBDA
                software.amazon.awscdk.services.appconfig.SourceType.SQS -> SourceType.SQS
                software.amazon.awscdk.services.appconfig.SourceType.SNS -> SourceType.SNS
                software.amazon.awscdk.services.appconfig.SourceType.EVENTS -> SourceType.EVENTS
            }

        internal fun unwrap(
            wrapped: SourceType
        ): software.amazon.awscdk.services.appconfig.SourceType = wrapped.cdkObject
    }
}
