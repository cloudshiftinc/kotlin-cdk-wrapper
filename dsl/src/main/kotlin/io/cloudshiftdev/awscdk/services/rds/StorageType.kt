package io.cloudshiftdev.awscdk.services.rds

public enum class StorageType(
  private val cdkObject: software.amazon.awscdk.services.rds.StorageType,
) {
  STANDARD(software.amazon.awscdk.services.rds.StorageType.STANDARD),
  GP2(software.amazon.awscdk.services.rds.StorageType.GP2),
  GP3(software.amazon.awscdk.services.rds.StorageType.GP3),
  IO1(software.amazon.awscdk.services.rds.StorageType.IO1),
  IO2(software.amazon.awscdk.services.rds.StorageType.IO2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.StorageType): StorageType =
        when (cdkObject) {
      software.amazon.awscdk.services.rds.StorageType.STANDARD -> StorageType.STANDARD
      software.amazon.awscdk.services.rds.StorageType.GP2 -> StorageType.GP2
      software.amazon.awscdk.services.rds.StorageType.GP3 -> StorageType.GP3
      software.amazon.awscdk.services.rds.StorageType.IO1 -> StorageType.IO1
      software.amazon.awscdk.services.rds.StorageType.IO2 -> StorageType.IO2
    }

    internal fun unwrap(wrapped: StorageType): software.amazon.awscdk.services.rds.StorageType =
        wrapped.cdkObject
  }
}
