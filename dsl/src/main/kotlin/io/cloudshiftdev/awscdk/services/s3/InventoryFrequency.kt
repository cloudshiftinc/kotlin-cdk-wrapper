package io.cloudshiftdev.awscdk.services.s3

public enum class InventoryFrequency(
  private val cdkObject: software.amazon.awscdk.services.s3.InventoryFrequency,
) {
  DAILY(software.amazon.awscdk.services.s3.InventoryFrequency.DAILY),
  WEEKLY(software.amazon.awscdk.services.s3.InventoryFrequency.WEEKLY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.InventoryFrequency):
        InventoryFrequency = when (cdkObject) {
      software.amazon.awscdk.services.s3.InventoryFrequency.DAILY -> InventoryFrequency.DAILY
      software.amazon.awscdk.services.s3.InventoryFrequency.WEEKLY -> InventoryFrequency.WEEKLY
    }

    internal fun unwrap(wrapped: InventoryFrequency):
        software.amazon.awscdk.services.s3.InventoryFrequency = wrapped.cdkObject
  }
}
