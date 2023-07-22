@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentLocationPropertyDsl {
  private val cdkBuilder: CfnSegment.LocationProperty.Builder =
      CfnSegment.LocationProperty.builder()

  /**
   * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
   */
  public fun country(country: IResolvable) {
    cdkBuilder.country(country)
  }

  /**
   * @param country The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
   */
  public fun country(country: CfnSegment.SetDimensionProperty) {
    cdkBuilder.country(country)
  }

  /**
   * @param gpsPoint The GPS point dimension for the segment.
   */
  public fun gpsPoint(gpsPoint: IResolvable) {
    cdkBuilder.gpsPoint(gpsPoint)
  }

  /**
   * @param gpsPoint The GPS point dimension for the segment.
   */
  public fun gpsPoint(gpsPoint: CfnSegment.GPSPointProperty) {
    cdkBuilder.gpsPoint(gpsPoint)
  }

  public fun build(): CfnSegment.LocationProperty = cdkBuilder.build()
}
