@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGaugeChartConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.GaugeChartConditionalFormattingOptionProperty.Builder =
      CfnDashboard.GaugeChartConditionalFormattingOptionProperty.builder()

  /**
   * @param arc The options that determine the presentation of the arc of a `GaugeChartVisual` .
   */
  public fun arc(arc: IResolvable) {
    cdkBuilder.arc(arc)
  }

  /**
   * @param arc The options that determine the presentation of the arc of a `GaugeChartVisual` .
   */
  public fun arc(arc: CfnDashboard.GaugeChartArcConditionalFormattingProperty) {
    cdkBuilder.arc(arc)
  }

  /**
   * @param primaryValue The conditional formatting for the primary value of a `GaugeChartVisual` .
   */
  public fun primaryValue(primaryValue: IResolvable) {
    cdkBuilder.primaryValue(primaryValue)
  }

  /**
   * @param primaryValue The conditional formatting for the primary value of a `GaugeChartVisual` .
   */
  public
      fun primaryValue(primaryValue: CfnDashboard.GaugeChartPrimaryValueConditionalFormattingProperty) {
    cdkBuilder.primaryValue(primaryValue)
  }

  public fun build(): CfnDashboard.GaugeChartConditionalFormattingOptionProperty =
      cdkBuilder.build()
}
