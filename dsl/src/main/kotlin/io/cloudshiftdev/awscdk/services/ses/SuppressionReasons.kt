package io.cloudshiftdev.awscdk.services.ses

public enum class SuppressionReasons(
    private val cdkObject: software.amazon.awscdk.services.ses.SuppressionReasons,
) {
    BOUNCES_AND_COMPLAINTS(
        software.amazon.awscdk.services.ses.SuppressionReasons.BOUNCES_AND_COMPLAINTS
    ),
    BOUNCES_ONLY(software.amazon.awscdk.services.ses.SuppressionReasons.BOUNCES_ONLY),
    COMPLAINTS_ONLY(software.amazon.awscdk.services.ses.SuppressionReasons.COMPLAINTS_ONLY),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ses.SuppressionReasons
        ): SuppressionReasons =
            when (cdkObject) {
                software.amazon.awscdk.services.ses.SuppressionReasons.BOUNCES_AND_COMPLAINTS ->
                    SuppressionReasons.BOUNCES_AND_COMPLAINTS
                software.amazon.awscdk.services.ses.SuppressionReasons.BOUNCES_ONLY ->
                    SuppressionReasons.BOUNCES_ONLY
                software.amazon.awscdk.services.ses.SuppressionReasons.COMPLAINTS_ONLY ->
                    SuppressionReasons.COMPLAINTS_ONLY
            }

        internal fun unwrap(
            wrapped: SuppressionReasons
        ): software.amazon.awscdk.services.ses.SuppressionReasons = wrapped.cdkObject
    }
}
