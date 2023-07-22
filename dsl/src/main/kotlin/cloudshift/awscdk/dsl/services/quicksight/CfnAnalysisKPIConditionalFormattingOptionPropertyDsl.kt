@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisKPIConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.KPIConditionalFormattingOptionProperty.Builder =
      CfnAnalysis.KPIConditionalFormattingOptionProperty.builder()

  /**
   * @param primaryValue The conditional formatting for the primary value of a KPI visual.
   */
  public fun primaryValue(primaryValue: IResolvable) {
    cdkBuilder.primaryValue(primaryValue)
  }

  /**
   * @param primaryValue The conditional formatting for the primary value of a KPI visual.
   */
  public fun primaryValue(primaryValue: CfnAnalysis.KPIPrimaryValueConditionalFormattingProperty) {
    cdkBuilder.primaryValue(primaryValue)
  }

  /**
   * @param progressBar The conditional formatting for the progress bar of a KPI visual.
   */
  public fun progressBar(progressBar: IResolvable) {
    cdkBuilder.progressBar(progressBar)
  }

  /**
   * @param progressBar The conditional formatting for the progress bar of a KPI visual.
   */
  public fun progressBar(progressBar: CfnAnalysis.KPIProgressBarConditionalFormattingProperty) {
    cdkBuilder.progressBar(progressBar)
  }

  public fun build(): CfnAnalysis.KPIConditionalFormattingOptionProperty = cdkBuilder.build()
}
