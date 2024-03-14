package io.cloudshiftdev.awscdk.services.autoscaling

public enum class MetricAggregationType(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.MetricAggregationType,
) {
  AVERAGE(software.amazon.awscdk.services.autoscaling.MetricAggregationType.AVERAGE),
  MINIMUM(software.amazon.awscdk.services.autoscaling.MetricAggregationType.MINIMUM),
  MAXIMUM(software.amazon.awscdk.services.autoscaling.MetricAggregationType.MAXIMUM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.MetricAggregationType):
        MetricAggregationType = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.MetricAggregationType.AVERAGE ->
          MetricAggregationType.AVERAGE
      software.amazon.awscdk.services.autoscaling.MetricAggregationType.MINIMUM ->
          MetricAggregationType.MINIMUM
      software.amazon.awscdk.services.autoscaling.MetricAggregationType.MAXIMUM ->
          MetricAggregationType.MAXIMUM
    }

    internal fun unwrap(wrapped: MetricAggregationType):
        software.amazon.awscdk.services.autoscaling.MetricAggregationType = wrapped.cdkObject
  }
}
