@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGaugeChartConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GaugeChartConditionalFormattingOptionProperty.Builder =
      CfnAnalysis.GaugeChartConditionalFormattingOptionProperty.builder()

  public fun arc(arc: IResolvable) {
    cdkBuilder.arc(arc)
  }

  public fun arc(arc: CfnAnalysis.GaugeChartArcConditionalFormattingProperty) {
    cdkBuilder.arc(arc)
  }

  public fun primaryValue(primaryValue: IResolvable) {
    cdkBuilder.primaryValue(primaryValue)
  }

  public
      fun primaryValue(primaryValue: CfnAnalysis.GaugeChartPrimaryValueConditionalFormattingProperty) {
    cdkBuilder.primaryValue(primaryValue)
  }

  public fun build(): CfnAnalysis.GaugeChartConditionalFormattingOptionProperty = cdkBuilder.build()
}
