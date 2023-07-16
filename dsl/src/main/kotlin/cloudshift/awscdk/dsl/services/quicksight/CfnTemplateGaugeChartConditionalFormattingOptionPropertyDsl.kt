@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGaugeChartConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnTemplate.GaugeChartConditionalFormattingOptionProperty.Builder =
      CfnTemplate.GaugeChartConditionalFormattingOptionProperty.builder()

  public fun arc(arc: IResolvable) {
    cdkBuilder.arc(arc)
  }

  public fun arc(arc: CfnTemplate.GaugeChartArcConditionalFormattingProperty) {
    cdkBuilder.arc(arc)
  }

  public fun primaryValue(primaryValue: IResolvable) {
    cdkBuilder.primaryValue(primaryValue)
  }

  public
      fun primaryValue(primaryValue: CfnTemplate.GaugeChartPrimaryValueConditionalFormattingProperty) {
    cdkBuilder.primaryValue(primaryValue)
  }

  public fun build(): CfnTemplate.GaugeChartConditionalFormattingOptionProperty = cdkBuilder.build()
}
