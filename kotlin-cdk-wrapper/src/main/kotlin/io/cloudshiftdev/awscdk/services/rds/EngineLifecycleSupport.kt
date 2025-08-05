@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

public enum class EngineLifecycleSupport(
  private val cdkObject: software.amazon.awscdk.services.rds.EngineLifecycleSupport,
) {
  OPEN_SOURCE_RDS_EXTENDED_SUPPORT(software.amazon.awscdk.services.rds.EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT),
  OPEN_SOURCE_RDS_EXTENDED_SUPPORT_DISABLED(software.amazon.awscdk.services.rds.EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT_DISABLED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.EngineLifecycleSupport):
        EngineLifecycleSupport = when (cdkObject) {
      software.amazon.awscdk.services.rds.EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT ->
          EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT
      software.amazon.awscdk.services.rds.EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT_DISABLED ->
          EngineLifecycleSupport.OPEN_SOURCE_RDS_EXTENDED_SUPPORT_DISABLED
    }

    internal fun unwrap(wrapped: EngineLifecycleSupport):
        software.amazon.awscdk.services.rds.EngineLifecycleSupport = wrapped.cdkObject
  }
}
