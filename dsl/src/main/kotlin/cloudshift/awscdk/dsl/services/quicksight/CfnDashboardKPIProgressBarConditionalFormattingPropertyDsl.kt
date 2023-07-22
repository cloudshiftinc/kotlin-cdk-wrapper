@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardKPIProgressBarConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnDashboard.KPIProgressBarConditionalFormattingProperty.Builder =
      CfnDashboard.KPIProgressBarConditionalFormattingProperty.builder()

  /**
   * @param foregroundColor The conditional formatting of the progress bar's foreground color.
   */
  public fun foregroundColor(foregroundColor: IResolvable) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  /**
   * @param foregroundColor The conditional formatting of the progress bar's foreground color.
   */
  public fun foregroundColor(foregroundColor: CfnDashboard.ConditionalFormattingColorProperty) {
    cdkBuilder.foregroundColor(foregroundColor)
  }

  public fun build(): CfnDashboard.KPIProgressBarConditionalFormattingProperty = cdkBuilder.build()
}
