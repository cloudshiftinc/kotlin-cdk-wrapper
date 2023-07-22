@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGeospatialCoordinateBoundsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialCoordinateBoundsProperty.Builder =
      CfnDashboard.GeospatialCoordinateBoundsProperty.builder()

  /**
   * @param east The longitude of the east bound of the geospatial coordinate bounds. 
   */
  public fun east(east: Number) {
    cdkBuilder.east(east)
  }

  /**
   * @param north The latitude of the north bound of the geospatial coordinate bounds. 
   */
  public fun north(north: Number) {
    cdkBuilder.north(north)
  }

  /**
   * @param south The latitude of the south bound of the geospatial coordinate bounds. 
   */
  public fun south(south: Number) {
    cdkBuilder.south(south)
  }

  /**
   * @param west The longitude of the west bound of the geospatial coordinate bounds. 
   */
  public fun west(west: Number) {
    cdkBuilder.west(west)
  }

  public fun build(): CfnDashboard.GeospatialCoordinateBoundsProperty = cdkBuilder.build()
}
