package io.cloudshiftdev.awscdk.services.autoscaling

public enum class ScalingEvent(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvent,
) {
  INSTANCE_LAUNCH(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_LAUNCH),
  INSTANCE_TERMINATE(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_TERMINATE),
  INSTANCE_TERMINATE_ERROR(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_TERMINATE_ERROR),
  INSTANCE_LAUNCH_ERROR(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_LAUNCH_ERROR),
  TEST_NOTIFICATION(software.amazon.awscdk.services.autoscaling.ScalingEvent.TEST_NOTIFICATION),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScalingEvent):
        ScalingEvent = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_LAUNCH ->
          ScalingEvent.INSTANCE_LAUNCH
      software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_TERMINATE ->
          ScalingEvent.INSTANCE_TERMINATE
      software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_TERMINATE_ERROR ->
          ScalingEvent.INSTANCE_TERMINATE_ERROR
      software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_LAUNCH_ERROR ->
          ScalingEvent.INSTANCE_LAUNCH_ERROR
      software.amazon.awscdk.services.autoscaling.ScalingEvent.TEST_NOTIFICATION ->
          ScalingEvent.TEST_NOTIFICATION
    }

    internal fun unwrap(wrapped: ScalingEvent):
        software.amazon.awscdk.services.autoscaling.ScalingEvent = wrapped.cdkObject
  }
}
