@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGeospatialHeatmapDataColorPropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialHeatmapDataColorProperty.Builder =
      CfnDashboard.GeospatialHeatmapDataColorProperty.builder()

  /**
   * @param color The hex color to be used in the heatmap point style. 
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun build(): CfnDashboard.GeospatialHeatmapDataColorProperty = cdkBuilder.build()
}
