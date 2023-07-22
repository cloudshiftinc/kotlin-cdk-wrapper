@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDefaultFreeFormLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DefaultFreeFormLayoutConfigurationProperty.Builder =
      CfnDashboard.DefaultFreeFormLayoutConfigurationProperty.builder()

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
      fun canvasSizeOptions(canvasSizeOptions: CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun build(): CfnDashboard.DefaultFreeFormLayoutConfigurationProperty = cdkBuilder.build()
}
