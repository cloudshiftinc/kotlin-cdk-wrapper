package io.cloudshiftdev.awscdk.services.config

public enum class MaximumExecutionFrequency(
    private val cdkObject: software.amazon.awscdk.services.config.MaximumExecutionFrequency,
) {
    ONE_HOUR(software.amazon.awscdk.services.config.MaximumExecutionFrequency.ONE_HOUR),
    THREE_HOURS(software.amazon.awscdk.services.config.MaximumExecutionFrequency.THREE_HOURS),
    SIX_HOURS(software.amazon.awscdk.services.config.MaximumExecutionFrequency.SIX_HOURS),
    TWELVE_HOURS(software.amazon.awscdk.services.config.MaximumExecutionFrequency.TWELVE_HOURS),
    TWENTY_FOUR_HOURS(
        software.amazon.awscdk.services.config.MaximumExecutionFrequency.TWENTY_FOUR_HOURS
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.config.MaximumExecutionFrequency
        ): MaximumExecutionFrequency =
            when (cdkObject) {
                software.amazon.awscdk.services.config.MaximumExecutionFrequency.ONE_HOUR ->
                    MaximumExecutionFrequency.ONE_HOUR
                software.amazon.awscdk.services.config.MaximumExecutionFrequency.THREE_HOURS ->
                    MaximumExecutionFrequency.THREE_HOURS
                software.amazon.awscdk.services.config.MaximumExecutionFrequency.SIX_HOURS ->
                    MaximumExecutionFrequency.SIX_HOURS
                software.amazon.awscdk.services.config.MaximumExecutionFrequency.TWELVE_HOURS ->
                    MaximumExecutionFrequency.TWELVE_HOURS
                software.amazon.awscdk.services.config.MaximumExecutionFrequency
                    .TWENTY_FOUR_HOURS -> MaximumExecutionFrequency.TWENTY_FOUR_HOURS
            }

        internal fun unwrap(
            wrapped: MaximumExecutionFrequency
        ): software.amazon.awscdk.services.config.MaximumExecutionFrequency = wrapped.cdkObject
    }
}
