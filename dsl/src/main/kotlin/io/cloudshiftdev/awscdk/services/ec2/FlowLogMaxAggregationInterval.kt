package io.cloudshiftdev.awscdk.services.ec2

public enum class FlowLogMaxAggregationInterval(
  private val cdkObject: software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval,
) {
  ONE_MINUTE(software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval.ONE_MINUTE),
  TEN_MINUTES(software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval.TEN_MINUTES),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval):
        FlowLogMaxAggregationInterval = when (cdkObject) {
      software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval.ONE_MINUTE ->
          FlowLogMaxAggregationInterval.ONE_MINUTE
      software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval.TEN_MINUTES ->
          FlowLogMaxAggregationInterval.TEN_MINUTES
    }

    internal fun unwrap(wrapped: FlowLogMaxAggregationInterval):
        software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval = wrapped.cdkObject
  }
}
