package io.cloudshiftdev.awscdk.services.autoscaling

public enum class AdjustmentType(
    private val cdkObject: software.amazon.awscdk.services.autoscaling.AdjustmentType,
) {
    CHANGE_IN_CAPACITY(
        software.amazon.awscdk.services.autoscaling.AdjustmentType.CHANGE_IN_CAPACITY
    ),
    PERCENT_CHANGE_IN_CAPACITY(
        software.amazon.awscdk.services.autoscaling.AdjustmentType.PERCENT_CHANGE_IN_CAPACITY
    ),
    EXACT_CAPACITY(software.amazon.awscdk.services.autoscaling.AdjustmentType.EXACT_CAPACITY),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.AdjustmentType
        ): AdjustmentType =
            when (cdkObject) {
                software.amazon.awscdk.services.autoscaling.AdjustmentType.CHANGE_IN_CAPACITY ->
                    AdjustmentType.CHANGE_IN_CAPACITY
                software.amazon.awscdk.services.autoscaling.AdjustmentType
                    .PERCENT_CHANGE_IN_CAPACITY -> AdjustmentType.PERCENT_CHANGE_IN_CAPACITY
                software.amazon.awscdk.services.autoscaling.AdjustmentType.EXACT_CAPACITY ->
                    AdjustmentType.EXACT_CAPACITY
            }

        internal fun unwrap(
            wrapped: AdjustmentType
        ): software.amazon.awscdk.services.autoscaling.AdjustmentType = wrapped.cdkObject
    }
}
