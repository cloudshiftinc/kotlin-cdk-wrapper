@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class LogQueryVisualizationType(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType,
) {
  TABLE(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.TABLE),
  LINE(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.LINE),
  STACKEDAREA(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.STACKEDAREA),
  BAR(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.BAR),
  PIE(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.PIE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType):
        LogQueryVisualizationType = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.TABLE ->
          LogQueryVisualizationType.TABLE
      software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.LINE ->
          LogQueryVisualizationType.LINE
      software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.STACKEDAREA ->
          LogQueryVisualizationType.STACKEDAREA
      software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.BAR ->
          LogQueryVisualizationType.BAR
      software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.PIE ->
          LogQueryVisualizationType.PIE
    }

    internal fun unwrap(wrapped: LogQueryVisualizationType):
        software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType = wrapped.cdkObject
  }
}
