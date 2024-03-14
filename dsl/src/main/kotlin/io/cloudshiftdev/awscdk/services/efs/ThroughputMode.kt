package io.cloudshiftdev.awscdk.services.efs

public enum class ThroughputMode(
  private val cdkObject: software.amazon.awscdk.services.efs.ThroughputMode,
) {
  BURSTING(software.amazon.awscdk.services.efs.ThroughputMode.BURSTING),
  PROVISIONED(software.amazon.awscdk.services.efs.ThroughputMode.PROVISIONED),
  ELASTIC(software.amazon.awscdk.services.efs.ThroughputMode.ELASTIC),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.ThroughputMode): ThroughputMode
        = when (cdkObject) {
      software.amazon.awscdk.services.efs.ThroughputMode.BURSTING -> ThroughputMode.BURSTING
      software.amazon.awscdk.services.efs.ThroughputMode.PROVISIONED -> ThroughputMode.PROVISIONED
      software.amazon.awscdk.services.efs.ThroughputMode.ELASTIC -> ThroughputMode.ELASTIC
    }

    internal fun unwrap(wrapped: ThroughputMode): software.amazon.awscdk.services.efs.ThroughputMode
        = wrapped.cdkObject
  }
}
