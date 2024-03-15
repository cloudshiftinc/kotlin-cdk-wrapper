@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

public enum class PerformanceMode(
  private val cdkObject: software.amazon.awscdk.services.efs.PerformanceMode,
) {
  GENERAL_PURPOSE(software.amazon.awscdk.services.efs.PerformanceMode.GENERAL_PURPOSE),
  MAX_IO(software.amazon.awscdk.services.efs.PerformanceMode.MAX_IO),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.PerformanceMode):
        PerformanceMode = when (cdkObject) {
      software.amazon.awscdk.services.efs.PerformanceMode.GENERAL_PURPOSE ->
          PerformanceMode.GENERAL_PURPOSE
      software.amazon.awscdk.services.efs.PerformanceMode.MAX_IO -> PerformanceMode.MAX_IO
    }

    internal fun unwrap(wrapped: PerformanceMode):
        software.amazon.awscdk.services.efs.PerformanceMode = wrapped.cdkObject
  }
}
