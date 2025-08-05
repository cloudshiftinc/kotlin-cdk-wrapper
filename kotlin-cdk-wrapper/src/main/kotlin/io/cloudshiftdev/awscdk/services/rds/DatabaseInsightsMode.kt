@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

public enum class DatabaseInsightsMode(
  private val cdkObject: software.amazon.awscdk.services.rds.DatabaseInsightsMode,
) {
  STANDARD(software.amazon.awscdk.services.rds.DatabaseInsightsMode.STANDARD),
  ADVANCED(software.amazon.awscdk.services.rds.DatabaseInsightsMode.ADVANCED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInsightsMode):
        DatabaseInsightsMode = when (cdkObject) {
      software.amazon.awscdk.services.rds.DatabaseInsightsMode.STANDARD ->
          DatabaseInsightsMode.STANDARD
      software.amazon.awscdk.services.rds.DatabaseInsightsMode.ADVANCED ->
          DatabaseInsightsMode.ADVANCED
    }

    internal fun unwrap(wrapped: DatabaseInsightsMode):
        software.amazon.awscdk.services.rds.DatabaseInsightsMode = wrapped.cdkObject
  }
}
