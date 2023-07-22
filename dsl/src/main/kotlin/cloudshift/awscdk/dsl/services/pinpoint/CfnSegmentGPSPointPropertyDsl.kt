@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentGPSPointPropertyDsl {
  private val cdkBuilder: CfnSegment.GPSPointProperty.Builder =
      CfnSegment.GPSPointProperty.builder()

  /**
   * @param coordinates The GPS coordinates to measure distance from. 
   */
  public fun coordinates(coordinates: IResolvable) {
    cdkBuilder.coordinates(coordinates)
  }

  /**
   * @param coordinates The GPS coordinates to measure distance from. 
   */
  public fun coordinates(coordinates: CfnSegment.CoordinatesProperty) {
    cdkBuilder.coordinates(coordinates)
  }

  /**
   * @param rangeInKilometers The range, in kilometers, from the GPS coordinates. 
   */
  public fun rangeInKilometers(rangeInKilometers: Number) {
    cdkBuilder.rangeInKilometers(rangeInKilometers)
  }

  public fun build(): CfnSegment.GPSPointProperty = cdkBuilder.build()
}
