@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardConditionalFormattingIconSetPropertyDsl {
  private val cdkBuilder: CfnDashboard.ConditionalFormattingIconSetProperty.Builder =
      CfnDashboard.ConditionalFormattingIconSetProperty.builder()

  /**
   * @param expression The expression that determines the formatting configuration for the icon set.
   * 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param iconSetType Determines the icon set type.
   */
  public fun iconSetType(iconSetType: String) {
    cdkBuilder.iconSetType(iconSetType)
  }

  public fun build(): CfnDashboard.ConditionalFormattingIconSetProperty = cdkBuilder.build()
}
