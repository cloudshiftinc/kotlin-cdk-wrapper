package io.cloudshiftdev.awscdk.services.ec2

public enum class SpotInstanceInterruption(
  private val cdkObject: software.amazon.awscdk.services.ec2.SpotInstanceInterruption,
) {
  STOP(software.amazon.awscdk.services.ec2.SpotInstanceInterruption.STOP),
  TERMINATE(software.amazon.awscdk.services.ec2.SpotInstanceInterruption.TERMINATE),
  HIBERNATE(software.amazon.awscdk.services.ec2.SpotInstanceInterruption.HIBERNATE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SpotInstanceInterruption):
        SpotInstanceInterruption = when (cdkObject) {
      software.amazon.awscdk.services.ec2.SpotInstanceInterruption.STOP ->
          SpotInstanceInterruption.STOP
      software.amazon.awscdk.services.ec2.SpotInstanceInterruption.TERMINATE ->
          SpotInstanceInterruption.TERMINATE
      software.amazon.awscdk.services.ec2.SpotInstanceInterruption.HIBERNATE ->
          SpotInstanceInterruption.HIBERNATE
    }

    internal fun unwrap(wrapped: SpotInstanceInterruption):
        software.amazon.awscdk.services.ec2.SpotInstanceInterruption = wrapped.cdkObject
  }
}
