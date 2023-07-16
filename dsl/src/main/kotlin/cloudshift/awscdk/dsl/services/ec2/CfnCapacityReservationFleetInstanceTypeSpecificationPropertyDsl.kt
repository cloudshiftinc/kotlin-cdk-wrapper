@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet

@CdkDslMarker
public class CfnCapacityReservationFleetInstanceTypeSpecificationPropertyDsl {
  private val cdkBuilder: CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.Builder =
      CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.builder()

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun availabilityZoneId(availabilityZoneId: String) {
    cdkBuilder.availabilityZoneId(availabilityZoneId)
  }

  public fun ebsOptimized(ebsOptimized: Boolean) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun ebsOptimized(ebsOptimized: IResolvable) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun instancePlatform(instancePlatform: String) {
    cdkBuilder.instancePlatform(instancePlatform)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnCapacityReservationFleet.InstanceTypeSpecificationProperty =
      cdkBuilder.build()
}
