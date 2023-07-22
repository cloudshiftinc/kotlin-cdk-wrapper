@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTooltipOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TooltipOptionsProperty.Builder =
      CfnTemplate.TooltipOptionsProperty.builder()

  /**
   * @param fieldBasedTooltip The setup for the detailed tooltip.
   * The tooltip setup is always saved. The display type is decided based on the tooltip type.
   */
  public fun fieldBasedTooltip(fieldBasedTooltip: IResolvable) {
    cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
  }

  /**
   * @param fieldBasedTooltip The setup for the detailed tooltip.
   * The tooltip setup is always saved. The display type is decided based on the tooltip type.
   */
  public fun fieldBasedTooltip(fieldBasedTooltip: CfnTemplate.FieldBasedTooltipProperty) {
    cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
  }

  /**
   * @param selectedTooltipType The selected type for the tooltip. Choose one of the following
   * options:.
   * * `BASIC` : A basic tooltip.
   * * `DETAILED` : A detailed tooltip.
   */
  public fun selectedTooltipType(selectedTooltipType: String) {
    cdkBuilder.selectedTooltipType(selectedTooltipType)
  }

  /**
   * @param tooltipVisibility Determines whether or not the tooltip is visible.
   */
  public fun tooltipVisibility(tooltipVisibility: String) {
    cdkBuilder.tooltipVisibility(tooltipVisibility)
  }

  public fun build(): CfnTemplate.TooltipOptionsProperty = cdkBuilder.build()
}
