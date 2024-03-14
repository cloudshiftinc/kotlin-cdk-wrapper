package io.cloudshiftdev.awscdk.services.applicationautoscaling

public enum class MetricAggregationType(
    private val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType,
) {
    AVERAGE(software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType.AVERAGE),
    MINIMUM(software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType.MINIMUM),
    MAXIMUM(software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType.MAXIMUM),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
        ): MetricAggregationType =
            when (cdkObject) {
                software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
                    .AVERAGE -> MetricAggregationType.AVERAGE
                software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
                    .MINIMUM -> MetricAggregationType.MINIMUM
                software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
                    .MAXIMUM -> MetricAggregationType.MAXIMUM
            }

        internal fun unwrap(
            wrapped: MetricAggregationType
        ): software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType =
            wrapped.cdkObject
    }
}
