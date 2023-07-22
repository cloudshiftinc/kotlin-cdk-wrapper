@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDefaultGridLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DefaultGridLayoutConfigurationProperty.Builder =
      CfnDashboard.DefaultGridLayoutConfigurationProperty.builder()

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a grid layout. 
   */
  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a grid layout. 
   */
  public
      fun canvasSizeOptions(canvasSizeOptions: CfnDashboard.GridLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun build(): CfnDashboard.DefaultGridLayoutConfigurationProperty = cdkBuilder.build()
}
