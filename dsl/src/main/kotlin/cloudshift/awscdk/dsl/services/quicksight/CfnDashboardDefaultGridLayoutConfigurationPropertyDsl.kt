@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the default settings for a grid layout configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultGridLayoutConfigurationProperty defaultGridLayoutConfigurationProperty =
 * DefaultGridLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-defaultgridlayoutconfiguration.html)
 */
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
