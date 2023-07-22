@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGeospatialWindowOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialWindowOptionsProperty.Builder =
      CfnDashboard.GeospatialWindowOptionsProperty.builder()

  /**
   * @param bounds The bounds options (north, south, west, east) of the geospatial window options.
   */
  public fun bounds(bounds: IResolvable) {
    cdkBuilder.bounds(bounds)
  }

  /**
   * @param bounds The bounds options (north, south, west, east) of the geospatial window options.
   */
  public fun bounds(bounds: CfnDashboard.GeospatialCoordinateBoundsProperty) {
    cdkBuilder.bounds(bounds)
  }

  /**
   * @param mapZoomMode The map zoom modes (manual, auto) of the geospatial window options.
   */
  public fun mapZoomMode(mapZoomMode: String) {
    cdkBuilder.mapZoomMode(mapZoomMode)
  }

  public fun build(): CfnDashboard.GeospatialWindowOptionsProperty = cdkBuilder.build()
}
