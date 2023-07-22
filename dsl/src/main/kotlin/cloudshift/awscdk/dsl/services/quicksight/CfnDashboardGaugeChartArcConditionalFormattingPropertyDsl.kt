@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGaugeChartArcConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnDashboard.GaugeChartArcConditionalFormattingProperty.Builder =
      CfnDashboard.GaugeChartArcConditionalFormattingProperty.builder()

  /**
   * @param foregroundColor The conditional formatting of the arc foreground color.
   */
  public fun foregroundColor(foregroundColor: IResolvable) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  /**
   * @param foregroundColor The conditional formatting of the arc foreground color.
   */
  public fun foregroundColor(foregroundColor: CfnDashboard.ConditionalFormattingColorProperty) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  public fun build(): CfnDashboard.GaugeChartArcConditionalFormattingProperty = cdkBuilder.build()
}
