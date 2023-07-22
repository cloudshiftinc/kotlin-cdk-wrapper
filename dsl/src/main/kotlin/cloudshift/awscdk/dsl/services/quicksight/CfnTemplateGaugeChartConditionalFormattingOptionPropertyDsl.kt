@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGaugeChartConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnTemplate.GaugeChartConditionalFormattingOptionProperty.Builder =
      CfnTemplate.GaugeChartConditionalFormattingOptionProperty.builder()

  /**
   * @param arc The options that determine the presentation of the arc of a `GaugeChartVisual` .
   */
  public fun arc(arc: IResolvable) {
    cdkBuilder.arc(arc)
  }

  /**
   * @param arc The options that determine the presentation of the arc of a `GaugeChartVisual` .
   */
  public fun arc(arc: CfnTemplate.GaugeChartArcConditionalFormattingProperty) {
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
      fun primaryValue(primaryValue: CfnTemplate.GaugeChartPrimaryValueConditionalFormattingProperty) {
    cdkBuilder.primaryValue(primaryValue)
  }

  public fun build(): CfnTemplate.GaugeChartConditionalFormattingOptionProperty = cdkBuilder.build()
}
