@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

public enum class StorageType(
  private val cdkObject: software.amazon.awscdk.services.fsx.StorageType,
) {
  SSD(software.amazon.awscdk.services.fsx.StorageType.SSD),
  HDD(software.amazon.awscdk.services.fsx.StorageType.HDD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.StorageType): StorageType =
        when (cdkObject) {
      software.amazon.awscdk.services.fsx.StorageType.SSD -> StorageType.SSD
      software.amazon.awscdk.services.fsx.StorageType.HDD -> StorageType.HDD
    }

    internal fun unwrap(wrapped: StorageType): software.amazon.awscdk.services.fsx.StorageType =
        wrapped.cdkObject
  }
}
