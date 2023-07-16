@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnFleet

@CdkDslMarker
public class CfnFleetLocationCapacityPropertyDsl {
  private val cdkBuilder: CfnFleet.LocationCapacityProperty.Builder =
      CfnFleet.LocationCapacityProperty.builder()

  public fun desiredEc2Instances(desiredEc2Instances: Number) {
    cdkBuilder.desiredEc2Instances(desiredEc2Instances)
  }

  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun build(): CfnFleet.LocationCapacityProperty = cdkBuilder.build()
}
