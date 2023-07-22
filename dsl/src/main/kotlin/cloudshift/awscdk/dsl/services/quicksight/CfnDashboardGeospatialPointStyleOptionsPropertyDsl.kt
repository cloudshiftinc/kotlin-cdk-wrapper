@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGeospatialPointStyleOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialPointStyleOptionsProperty.Builder =
      CfnDashboard.GeospatialPointStyleOptionsProperty.builder()

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
      fun clusterMarkerConfiguration(clusterMarkerConfiguration: CfnDashboard.ClusterMarkerConfigurationProperty) {
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
      fun heatmapConfiguration(heatmapConfiguration: CfnDashboard.GeospatialHeatmapConfigurationProperty) {
    cdkBuilder.heatmapConfiguration(heatmapConfiguration)
  }

  /**
   * @param selectedPointStyle The selected point styles (point, cluster) of the geospatial map.
   */
  public fun selectedPointStyle(selectedPointStyle: String) {
    cdkBuilder.selectedPointStyle(selectedPointStyle)
  }

  public fun build(): CfnDashboard.GeospatialPointStyleOptionsProperty = cdkBuilder.build()
}
