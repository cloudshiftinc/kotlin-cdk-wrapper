@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDefaultFreeFormLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DefaultFreeFormLayoutConfigurationProperty.Builder =
      CfnTemplate.DefaultFreeFormLayoutConfigurationProperty.builder()

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a free-form layout. 
   */
  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a free-form layout. 
   */
  public
      fun canvasSizeOptions(canvasSizeOptions: CfnTemplate.FreeFormLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun build(): CfnTemplate.DefaultFreeFormLayoutConfigurationProperty = cdkBuilder.build()
}
