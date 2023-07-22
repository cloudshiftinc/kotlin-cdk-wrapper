@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDefaultInteractiveLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DefaultInteractiveLayoutConfigurationProperty.Builder =
      CfnTemplate.DefaultInteractiveLayoutConfigurationProperty.builder()

  /**
   * @param freeForm The options that determine the default settings of a free-form layout
   * configuration.
   */
  public fun freeForm(freeForm: IResolvable) {
    cdkBuilder.freeForm(freeForm)
  }

  /**
   * @param freeForm The options that determine the default settings of a free-form layout
   * configuration.
   */
  public fun freeForm(freeForm: CfnTemplate.DefaultFreeFormLayoutConfigurationProperty) {
    cdkBuilder.freeForm(freeForm)
  }

  /**
   * @param grid The options that determine the default settings for a grid layout configuration.
   */
  public fun grid(grid: IResolvable) {
    cdkBuilder.grid(grid)
  }

  /**
   * @param grid The options that determine the default settings for a grid layout configuration.
   */
  public fun grid(grid: CfnTemplate.DefaultGridLayoutConfigurationProperty) {
    cdkBuilder.grid(grid)
  }

  public fun build(): CfnTemplate.DefaultInteractiveLayoutConfigurationProperty = cdkBuilder.build()
}
