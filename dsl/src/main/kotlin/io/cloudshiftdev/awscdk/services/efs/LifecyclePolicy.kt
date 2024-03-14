package io.cloudshiftdev.awscdk.services.efs

public enum class LifecyclePolicy(
    private val cdkObject: software.amazon.awscdk.services.efs.LifecyclePolicy,
) {
    AFTER_1_DAY(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_1_DAY),
    AFTER_7_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_7_DAYS),
    AFTER_14_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_14_DAYS),
    AFTER_30_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_30_DAYS),
    AFTER_60_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_60_DAYS),
    AFTER_90_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_90_DAYS),
    AFTER_180_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_180_DAYS),
    AFTER_270_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_270_DAYS),
    AFTER_365_DAYS(software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_365_DAYS),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.efs.LifecyclePolicy
        ): LifecyclePolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_1_DAY ->
                    LifecyclePolicy.AFTER_1_DAY
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_7_DAYS ->
                    LifecyclePolicy.AFTER_7_DAYS
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_14_DAYS ->
                    LifecyclePolicy.AFTER_14_DAYS
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_30_DAYS ->
                    LifecyclePolicy.AFTER_30_DAYS
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_60_DAYS ->
                    LifecyclePolicy.AFTER_60_DAYS
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_90_DAYS ->
                    LifecyclePolicy.AFTER_90_DAYS
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_180_DAYS ->
                    LifecyclePolicy.AFTER_180_DAYS
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_270_DAYS ->
                    LifecyclePolicy.AFTER_270_DAYS
                software.amazon.awscdk.services.efs.LifecyclePolicy.AFTER_365_DAYS ->
                    LifecyclePolicy.AFTER_365_DAYS
            }

        internal fun unwrap(
            wrapped: LifecyclePolicy
        ): software.amazon.awscdk.services.efs.LifecyclePolicy = wrapped.cdkObject
    }
}
