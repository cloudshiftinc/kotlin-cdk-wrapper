package io.cloudshiftdev.awscdk.services.autoscaling

public enum class ScalingProcess(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.ScalingProcess,
) {
  LAUNCH(software.amazon.awscdk.services.autoscaling.ScalingProcess.LAUNCH),
  TERMINATE(software.amazon.awscdk.services.autoscaling.ScalingProcess.TERMINATE),
  HEALTH_CHECK(software.amazon.awscdk.services.autoscaling.ScalingProcess.HEALTH_CHECK),
  REPLACE_UNHEALTHY(software.amazon.awscdk.services.autoscaling.ScalingProcess.REPLACE_UNHEALTHY),
  AZ_REBALANCE(software.amazon.awscdk.services.autoscaling.ScalingProcess.AZ_REBALANCE),
  ALARM_NOTIFICATION(software.amazon.awscdk.services.autoscaling.ScalingProcess.ALARM_NOTIFICATION),
  SCHEDULED_ACTIONS(software.amazon.awscdk.services.autoscaling.ScalingProcess.SCHEDULED_ACTIONS),
  ADD_TO_LOAD_BALANCER(software.amazon.awscdk.services.autoscaling.ScalingProcess.ADD_TO_LOAD_BALANCER),
  INSTANCE_REFRESH(software.amazon.awscdk.services.autoscaling.ScalingProcess.INSTANCE_REFRESH),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScalingProcess):
        ScalingProcess = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.ScalingProcess.LAUNCH -> ScalingProcess.LAUNCH
      software.amazon.awscdk.services.autoscaling.ScalingProcess.TERMINATE ->
          ScalingProcess.TERMINATE
      software.amazon.awscdk.services.autoscaling.ScalingProcess.HEALTH_CHECK ->
          ScalingProcess.HEALTH_CHECK
      software.amazon.awscdk.services.autoscaling.ScalingProcess.REPLACE_UNHEALTHY ->
          ScalingProcess.REPLACE_UNHEALTHY
      software.amazon.awscdk.services.autoscaling.ScalingProcess.AZ_REBALANCE ->
          ScalingProcess.AZ_REBALANCE
      software.amazon.awscdk.services.autoscaling.ScalingProcess.ALARM_NOTIFICATION ->
          ScalingProcess.ALARM_NOTIFICATION
      software.amazon.awscdk.services.autoscaling.ScalingProcess.SCHEDULED_ACTIONS ->
          ScalingProcess.SCHEDULED_ACTIONS
      software.amazon.awscdk.services.autoscaling.ScalingProcess.ADD_TO_LOAD_BALANCER ->
          ScalingProcess.ADD_TO_LOAD_BALANCER
      software.amazon.awscdk.services.autoscaling.ScalingProcess.INSTANCE_REFRESH ->
          ScalingProcess.INSTANCE_REFRESH
    }

    internal fun unwrap(wrapped: ScalingProcess):
        software.amazon.awscdk.services.autoscaling.ScalingProcess = wrapped.cdkObject
  }
}
