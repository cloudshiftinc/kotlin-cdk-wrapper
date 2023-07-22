@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the default settings for interactive layout configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultInteractiveLayoutConfigurationProperty defaultInteractiveLayoutConfigurationProperty =
 * DefaultInteractiveLayoutConfigurationProperty.builder()
 * .freeForm(DefaultFreeFormLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(FreeFormLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .grid(DefaultGridLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-defaultinteractivelayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardDefaultInteractiveLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DefaultInteractiveLayoutConfigurationProperty.Builder =
      CfnDashboard.DefaultInteractiveLayoutConfigurationProperty.builder()

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
  public fun freeForm(freeForm: CfnDashboard.DefaultFreeFormLayoutConfigurationProperty) {
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
  public fun grid(grid: CfnDashboard.DefaultGridLayoutConfigurationProperty) {
    cdkBuilder.grid(grid)
  }

  public fun build(): CfnDashboard.DefaultInteractiveLayoutConfigurationProperty =
      cdkBuilder.build()
}
