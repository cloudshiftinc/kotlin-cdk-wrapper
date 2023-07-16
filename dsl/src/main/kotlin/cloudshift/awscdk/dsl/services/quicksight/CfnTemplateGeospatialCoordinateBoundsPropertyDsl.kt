@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGeospatialCoordinateBoundsPropertyDsl {
  private val cdkBuilder: CfnTemplate.GeospatialCoordinateBoundsProperty.Builder =
      CfnTemplate.GeospatialCoordinateBoundsProperty.builder()

  public fun east(east: Number) {
    cdkBuilder.east(east)
  }

  public fun north(north: Number) {
    cdkBuilder.north(north)
  }

  public fun south(south: Number) {
    cdkBuilder.south(south)
  }

  public fun west(west: Number) {
    cdkBuilder.west(west)
  }

  public fun build(): CfnTemplate.GeospatialCoordinateBoundsProperty = cdkBuilder.build()
}
