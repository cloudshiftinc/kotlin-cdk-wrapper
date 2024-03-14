package io.cloudshiftdev.awscdk.services.dynamodb

public enum class CapacityMode(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.CapacityMode,
) {
  FIXED(software.amazon.awscdk.services.dynamodb.CapacityMode.FIXED),
  AUTOSCALED(software.amazon.awscdk.services.dynamodb.CapacityMode.AUTOSCALED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CapacityMode):
        CapacityMode = when (cdkObject) {
      software.amazon.awscdk.services.dynamodb.CapacityMode.FIXED -> CapacityMode.FIXED
      software.amazon.awscdk.services.dynamodb.CapacityMode.AUTOSCALED -> CapacityMode.AUTOSCALED
    }

    internal fun unwrap(wrapped: CapacityMode):
        software.amazon.awscdk.services.dynamodb.CapacityMode = wrapped.cdkObject
  }
}
