@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-defaultinteractivelayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisDefaultInteractiveLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty.Builder =
      CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty.builder()

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
  public fun freeForm(freeForm: CfnAnalysis.DefaultFreeFormLayoutConfigurationProperty) {
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
  public fun grid(grid: CfnAnalysis.DefaultGridLayoutConfigurationProperty) {
    cdkBuilder.grid(grid)
  }

  public fun build(): CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty = cdkBuilder.build()
}
