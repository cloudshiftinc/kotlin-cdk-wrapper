@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

public enum class DriveCacheType(
  private val cdkObject: software.amazon.awscdk.services.fsx.DriveCacheType,
) {
  NONE(software.amazon.awscdk.services.fsx.DriveCacheType.NONE),
  READ(software.amazon.awscdk.services.fsx.DriveCacheType.READ),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.DriveCacheType): DriveCacheType
        = when (cdkObject) {
      software.amazon.awscdk.services.fsx.DriveCacheType.NONE -> DriveCacheType.NONE
      software.amazon.awscdk.services.fsx.DriveCacheType.READ -> DriveCacheType.READ
    }

    internal fun unwrap(wrapped: DriveCacheType): software.amazon.awscdk.services.fsx.DriveCacheType
        = wrapped.cdkObject
  }
}
