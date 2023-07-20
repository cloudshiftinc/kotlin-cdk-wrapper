@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentLocationPropertyDsl {
  private val cdkBuilder: CfnSegment.LocationProperty.Builder =
      CfnSegment.LocationProperty.builder()

  public fun country(country: IResolvable) {
    cdkBuilder.country(country)
  }

  public fun country(country: CfnSegment.SetDimensionProperty) {
    cdkBuilder.country(country)
  }

  public fun gpsPoint(gpsPoint: IResolvable) {
    cdkBuilder.gpsPoint(gpsPoint)
  }

  public fun gpsPoint(gpsPoint: CfnSegment.GPSPointProperty) {
    cdkBuilder.gpsPoint(gpsPoint)
  }

  public fun build(): CfnSegment.LocationProperty = cdkBuilder.build()
}
