@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardConditionalFormattingGradientColorPropertyDsl {
  private val cdkBuilder: CfnDashboard.ConditionalFormattingGradientColorProperty.Builder =
      CfnDashboard.ConditionalFormattingGradientColorProperty.builder()

  /**
   * @param color Determines the color. 
   */
  public fun color(color: IResolvable) {
    cdkBuilder.color(color)
  }

  /**
   * @param color Determines the color. 
   */
  public fun color(color: CfnDashboard.GradientColorProperty) {
    cdkBuilder.color(color)
  }

  /**
   * @param expression The expression that determines the formatting configuration for gradient
   * color. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnDashboard.ConditionalFormattingGradientColorProperty = cdkBuilder.build()
}
