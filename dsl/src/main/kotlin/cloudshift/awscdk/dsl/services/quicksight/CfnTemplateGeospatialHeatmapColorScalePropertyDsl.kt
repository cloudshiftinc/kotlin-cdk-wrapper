@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The color scale specification for the heatmap point style.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GeospatialHeatmapColorScaleProperty geospatialHeatmapColorScaleProperty =
 * GeospatialHeatmapColorScaleProperty.builder()
 * .colors(List.of(GeospatialHeatmapDataColorProperty.builder()
 * .color("color")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-geospatialheatmapcolorscale.html)
 */
@CdkDslMarker
public class CfnTemplateGeospatialHeatmapColorScalePropertyDsl {
  private val cdkBuilder: CfnTemplate.GeospatialHeatmapColorScaleProperty.Builder =
      CfnTemplate.GeospatialHeatmapColorScaleProperty.builder()

  private val _colors: MutableList<Any> = mutableListOf()

  /**
   * @param colors The list of colors to be used in heatmap point style.
   */
  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  /**
   * @param colors The list of colors to be used in heatmap point style.
   */
  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  /**
   * @param colors The list of colors to be used in heatmap point style.
   */
  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  public fun build(): CfnTemplate.GeospatialHeatmapColorScaleProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    return cdkBuilder.build()
  }
}
