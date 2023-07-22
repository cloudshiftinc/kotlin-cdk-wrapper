@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardKPIConditionalFormattingOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.KPIConditionalFormattingOptionProperty.Builder =
      CfnDashboard.KPIConditionalFormattingOptionProperty.builder()

  /**
   * @param primaryValue The conditional formatting for the primary value of a KPI visual.
   */
  public fun primaryValue(primaryValue: IResolvable) {
    cdkBuilder.primaryValue(primaryValue)
  }

  /**
   * @param primaryValue The conditional formatting for the primary value of a KPI visual.
   */
  public fun primaryValue(primaryValue: CfnDashboard.KPIPrimaryValueConditionalFormattingProperty) {
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
  public fun progressBar(progressBar: CfnDashboard.KPIProgressBarConditionalFormattingProperty) {
    cdkBuilder.progressBar(progressBar)
  }

  public fun build(): CfnDashboard.KPIConditionalFormattingOptionProperty = cdkBuilder.build()
}
