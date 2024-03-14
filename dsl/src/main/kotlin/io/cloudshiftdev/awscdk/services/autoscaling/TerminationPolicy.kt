package io.cloudshiftdev.awscdk.services.autoscaling

public enum class TerminationPolicy(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.TerminationPolicy,
) {
  ALLOCATION_STRATEGY(software.amazon.awscdk.services.autoscaling.TerminationPolicy.ALLOCATION_STRATEGY),
  CLOSEST_TO_NEXT_INSTANCE_HOUR(software.amazon.awscdk.services.autoscaling.TerminationPolicy.CLOSEST_TO_NEXT_INSTANCE_HOUR),
  DEFAULT(software.amazon.awscdk.services.autoscaling.TerminationPolicy.DEFAULT),
  NEWEST_INSTANCE(software.amazon.awscdk.services.autoscaling.TerminationPolicy.NEWEST_INSTANCE),
  OLDEST_INSTANCE(software.amazon.awscdk.services.autoscaling.TerminationPolicy.OLDEST_INSTANCE),
  OLDEST_LAUNCH_CONFIGURATION(software.amazon.awscdk.services.autoscaling.TerminationPolicy.OLDEST_LAUNCH_CONFIGURATION),
  OLDEST_LAUNCH_TEMPLATE(software.amazon.awscdk.services.autoscaling.TerminationPolicy.OLDEST_LAUNCH_TEMPLATE),
  CUSTOM_LAMBDA_FUNCTION(software.amazon.awscdk.services.autoscaling.TerminationPolicy.CUSTOM_LAMBDA_FUNCTION),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.TerminationPolicy):
        TerminationPolicy = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.ALLOCATION_STRATEGY ->
          TerminationPolicy.ALLOCATION_STRATEGY
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.CLOSEST_TO_NEXT_INSTANCE_HOUR ->
          TerminationPolicy.CLOSEST_TO_NEXT_INSTANCE_HOUR
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.DEFAULT ->
          TerminationPolicy.DEFAULT
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.NEWEST_INSTANCE ->
          TerminationPolicy.NEWEST_INSTANCE
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.OLDEST_INSTANCE ->
          TerminationPolicy.OLDEST_INSTANCE
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.OLDEST_LAUNCH_CONFIGURATION ->
          TerminationPolicy.OLDEST_LAUNCH_CONFIGURATION
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.OLDEST_LAUNCH_TEMPLATE ->
          TerminationPolicy.OLDEST_LAUNCH_TEMPLATE
      software.amazon.awscdk.services.autoscaling.TerminationPolicy.CUSTOM_LAMBDA_FUNCTION ->
          TerminationPolicy.CUSTOM_LAMBDA_FUNCTION
    }

    internal fun unwrap(wrapped: TerminationPolicy):
        software.amazon.awscdk.services.autoscaling.TerminationPolicy = wrapped.cdkObject
  }
}
