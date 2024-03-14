package io.cloudshiftdev.awscdk.services.ec2

public enum class InstanceInitiatedShutdownBehavior(
  private val cdkObject: software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior,
) {
  STOP(software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior.STOP),
  TERMINATE(software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior.TERMINATE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior):
        InstanceInitiatedShutdownBehavior = when (cdkObject) {
      software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior.STOP ->
          InstanceInitiatedShutdownBehavior.STOP
      software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior.TERMINATE ->
          InstanceInitiatedShutdownBehavior.TERMINATE
    }

    internal fun unwrap(wrapped: InstanceInitiatedShutdownBehavior):
        software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior = wrapped.cdkObject
  }
}
