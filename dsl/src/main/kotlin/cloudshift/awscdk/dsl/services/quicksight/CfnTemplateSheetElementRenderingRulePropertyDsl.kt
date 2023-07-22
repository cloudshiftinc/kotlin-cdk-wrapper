@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The rendering rules of a sheet that uses a free-form layout.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetElementRenderingRuleProperty sheetElementRenderingRuleProperty =
 * SheetElementRenderingRuleProperty.builder()
 * .configurationOverrides(SheetElementConfigurationOverridesProperty.builder()
 * .visibility("visibility")
 * .build())
 * .expression("expression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-sheetelementrenderingrule.html)
 */
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
