package io.cloudshiftdev.awscdk.services.autoscaling

public enum class Monitoring(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.Monitoring,
) {
  BASIC(software.amazon.awscdk.services.autoscaling.Monitoring.BASIC),
  DETAILED(software.amazon.awscdk.services.autoscaling.Monitoring.DETAILED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Monitoring): Monitoring
        = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.Monitoring.BASIC -> Monitoring.BASIC
      software.amazon.awscdk.services.autoscaling.Monitoring.DETAILED -> Monitoring.DETAILED
    }

    internal fun unwrap(wrapped: Monitoring): software.amazon.awscdk.services.autoscaling.Monitoring
        = wrapped.cdkObject
  }
}
