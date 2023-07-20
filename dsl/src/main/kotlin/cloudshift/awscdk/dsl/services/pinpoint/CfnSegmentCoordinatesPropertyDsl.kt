@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentCoordinatesPropertyDsl {
  private val cdkBuilder: CfnSegment.CoordinatesProperty.Builder =
      CfnSegment.CoordinatesProperty.builder()

  public fun latitude(latitude: Number) {
    cdkBuilder.latitude(latitude)
  }

  public fun longitude(longitude: Number) {
    cdkBuilder.longitude(longitude)
  }

  public fun build(): CfnSegment.CoordinatesProperty = cdkBuilder.build()
}
