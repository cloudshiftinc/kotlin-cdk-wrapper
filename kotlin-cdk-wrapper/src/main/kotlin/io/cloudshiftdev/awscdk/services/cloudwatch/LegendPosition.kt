@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class LegendPosition(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.LegendPosition,
) {
  BOTTOM(software.amazon.awscdk.services.cloudwatch.LegendPosition.BOTTOM),
  RIGHT(software.amazon.awscdk.services.cloudwatch.LegendPosition.RIGHT),
  HIDDEN(software.amazon.awscdk.services.cloudwatch.LegendPosition.HIDDEN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.LegendPosition):
        LegendPosition = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.LegendPosition.BOTTOM -> LegendPosition.BOTTOM
      software.amazon.awscdk.services.cloudwatch.LegendPosition.RIGHT -> LegendPosition.RIGHT
      software.amazon.awscdk.services.cloudwatch.LegendPosition.HIDDEN -> LegendPosition.HIDDEN
    }

    internal fun unwrap(wrapped: LegendPosition):
        software.amazon.awscdk.services.cloudwatch.LegendPosition = wrapped.cdkObject
  }
}
