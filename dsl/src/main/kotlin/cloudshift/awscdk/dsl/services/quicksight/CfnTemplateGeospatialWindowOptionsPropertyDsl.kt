@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGeospatialWindowOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.GeospatialWindowOptionsProperty.Builder =
      CfnTemplate.GeospatialWindowOptionsProperty.builder()

  /**
   * @param bounds The bounds options (north, south, west, east) of the geospatial window options.
   */
  public fun bounds(bounds: IResolvable) {
    cdkBuilder.bounds(bounds)
  }

  /**
   * @param bounds The bounds options (north, south, west, east) of the geospatial window options.
   */
  public fun bounds(bounds: CfnTemplate.GeospatialCoordinateBoundsProperty) {
    cdkBuilder.bounds(bounds)
  }

  /**
   * @param mapZoomMode The map zoom modes (manual, auto) of the geospatial window options.
   */
  public fun mapZoomMode(mapZoomMode: String) {
    cdkBuilder.mapZoomMode(mapZoomMode)
  }

  public fun build(): CfnTemplate.GeospatialWindowOptionsProperty = cdkBuilder.build()
}
