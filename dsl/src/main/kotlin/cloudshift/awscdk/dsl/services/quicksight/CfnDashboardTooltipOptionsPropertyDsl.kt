@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTooltipOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TooltipOptionsProperty.Builder =
      CfnDashboard.TooltipOptionsProperty.builder()

  public fun fieldBasedTooltip(fieldBasedTooltip: IResolvable) {
    cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
  }

  public fun fieldBasedTooltip(fieldBasedTooltip: CfnDashboard.FieldBasedTooltipProperty) {
    cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
  }

  public fun selectedTooltipType(selectedTooltipType: String) {
    cdkBuilder.selectedTooltipType(selectedTooltipType)
  }

  public fun tooltipVisibility(tooltipVisibility: String) {
    cdkBuilder.tooltipVisibility(tooltipVisibility)
  }

  public fun build(): CfnDashboard.TooltipOptionsProperty = cdkBuilder.build()
}
