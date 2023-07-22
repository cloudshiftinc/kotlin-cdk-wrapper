@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGeospatialPointStyleOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.GeospatialPointStyleOptionsProperty.Builder =
      CfnTemplate.GeospatialPointStyleOptionsProperty.builder()

  /**
   * @param clusterMarkerConfiguration The cluster marker configuration of the geospatial point
   * style.
   */
  public fun clusterMarkerConfiguration(clusterMarkerConfiguration: IResolvable) {
    cdkBuilder.clusterMarkerConfiguration(clusterMarkerConfiguration)
  }

  /**
   * @param clusterMarkerConfiguration The cluster marker configuration of the geospatial point
   * style.
   */
  public
      fun clusterMarkerConfiguration(clusterMarkerConfiguration: CfnTemplate.ClusterMarkerConfigurationProperty) {
    cdkBuilder.clusterMarkerConfiguration(clusterMarkerConfiguration)
  }

  /**
   * @param heatmapConfiguration The heatmap configuration of the geospatial point style.
   */
  public fun heatmapConfiguration(heatmapConfiguration: IResolvable) {
    cdkBuilder.heatmapConfiguration(heatmapConfiguration)
  }

  /**
   * @param heatmapConfiguration The heatmap configuration of the geospatial point style.
   */
  public
      fun heatmapConfiguration(heatmapConfiguration: CfnTemplate.GeospatialHeatmapConfigurationProperty) {
    cdkBuilder.heatmapConfiguration(heatmapConfiguration)
  }

  /**
   * @param selectedPointStyle The selected point styles (point, cluster) of the geospatial map.
   */
  public fun selectedPointStyle(selectedPointStyle: String) {
    cdkBuilder.selectedPointStyle(selectedPointStyle)
  }

  public fun build(): CfnTemplate.GeospatialPointStyleOptionsProperty = cdkBuilder.build()
}
