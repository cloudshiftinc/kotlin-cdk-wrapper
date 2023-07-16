@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetOnDemandOptionsRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder =
      CfnEC2Fleet.OnDemandOptionsRequestProperty.builder()

  public fun allocationStrategy(allocationStrategy: String) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  public fun capacityReservationOptions(capacityReservationOptions: IResolvable) {
    cdkBuilder.capacityReservationOptions(capacityReservationOptions)
  }

  public
      fun capacityReservationOptions(capacityReservationOptions: CfnEC2Fleet.CapacityReservationOptionsRequestProperty) {
    cdkBuilder.capacityReservationOptions(capacityReservationOptions)
  }

  public fun maxTotalPrice(maxTotalPrice: String) {
    cdkBuilder.maxTotalPrice(maxTotalPrice)
  }

  public fun minTargetCapacity(minTargetCapacity: Number) {
    cdkBuilder.minTargetCapacity(minTargetCapacity)
  }

  public fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
    cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
  }

  public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
    cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
  }

  public fun singleInstanceType(singleInstanceType: Boolean) {
    cdkBuilder.singleInstanceType(singleInstanceType)
  }

  public fun singleInstanceType(singleInstanceType: IResolvable) {
    cdkBuilder.singleInstanceType(singleInstanceType)
  }

  public fun build(): CfnEC2Fleet.OnDemandOptionsRequestProperty = cdkBuilder.build()
}
