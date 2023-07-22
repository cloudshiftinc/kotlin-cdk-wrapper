@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSheetElementRenderingRulePropertyDsl {
  private val cdkBuilder: CfnTemplate.SheetElementRenderingRuleProperty.Builder =
      CfnTemplate.SheetElementRenderingRuleProperty.builder()

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
      fun configurationOverrides(configurationOverrides: CfnTemplate.SheetElementConfigurationOverridesProperty) {
    cdkBuilder.configurationOverrides(configurationOverrides)
  }

  /**
   * @param expression The expression of the rendering rules of a sheet. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnTemplate.SheetElementRenderingRuleProperty = cdkBuilder.build()
}
