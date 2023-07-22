@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGeospatialHeatmapConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.GeospatialHeatmapConfigurationProperty.Builder =
      CfnTemplate.GeospatialHeatmapConfigurationProperty.builder()

  /**
   * @param heatmapColor The color scale specification for the heatmap point style.
   */
  public fun heatmapColor(heatmapColor: IResolvable) {
    cdkBuilder.heatmapColor(heatmapColor)
  }

  /**
   * @param heatmapColor The color scale specification for the heatmap point style.
   */
  public fun heatmapColor(heatmapColor: CfnTemplate.GeospatialHeatmapColorScaleProperty) {
    cdkBuilder.heatmapColor(heatmapColor)
  }

  public fun build(): CfnTemplate.GeospatialHeatmapConfigurationProperty = cdkBuilder.build()
}
