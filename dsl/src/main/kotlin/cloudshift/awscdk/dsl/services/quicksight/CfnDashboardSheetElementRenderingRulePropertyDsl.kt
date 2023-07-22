@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSheetElementRenderingRulePropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetElementRenderingRuleProperty.Builder =
      CfnDashboard.SheetElementRenderingRuleProperty.builder()

  /**
   * @param configurationOverrides The override configuration of the rendering rules of a sheet. 
   */
  public fun configurationOverrides(configurationOverrides: IResolvable) {
    cdkBuilder.configurationOverrides(configurationOverrides)
  }

  /**
   * @param configurationOverrides The override configuration of the rendering rules of a sheet. 
   */
  public
      fun configurationOverrides(configurationOverrides: CfnDashboard.SheetElementConfigurationOverridesProperty) {
    cdkBuilder.configurationOverrides(configurationOverrides)
  }

  /**
   * @param expression The expression of the rendering rules of a sheet. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnDashboard.SheetElementRenderingRuleProperty = cdkBuilder.build()
}
