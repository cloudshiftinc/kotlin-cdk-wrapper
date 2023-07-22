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

  /**
   * @param allocationStrategy The strategy that determines the order of the launch template
   * overrides to use in fulfilling On-Demand capacity.
   * `lowest-price` - EC2 Fleet uses price to determine the order, launching the lowest price first.
   *
   * `prioritized` - EC2 Fleet uses the priority that you assigned to each launch template override,
   * launching the highest priority first.
   *
   * Default: `lowest-price`
   */
  public fun allocationStrategy(allocationStrategy: String) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  /**
   * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
   * fulfilling On-Demand capacity.
   * Supported only for fleets of type `instant` .
   */
  public fun capacityReservationOptions(capacityReservationOptions: IResolvable) {
    cdkBuilder.capacityReservationOptions(capacityReservationOptions)
  }

  /**
   * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
   * fulfilling On-Demand capacity.
   * Supported only for fleets of type `instant` .
   */
  public
      fun capacityReservationOptions(capacityReservationOptions: CfnEC2Fleet.CapacityReservationOptionsRequestProperty) {
    cdkBuilder.capacityReservationOptions(capacityReservationOptions)
  }

  /**
   * @param maxTotalPrice The maximum amount per hour for On-Demand Instances that you're willing to
   * pay.
   */
  public fun maxTotalPrice(maxTotalPrice: String) {
    cdkBuilder.maxTotalPrice(maxTotalPrice)
  }

  /**
   * @param minTargetCapacity The minimum target capacity for On-Demand Instances in the fleet.
   * If the minimum target capacity is not reached, the fleet launches no instances.
   *
   * Supported only for fleets of type `instant` .
   *
   * At least one of the following must be specified: `SingleAvailabilityZone` |
   * `SingleInstanceType`
   */
  public fun minTargetCapacity(minTargetCapacity: Number) {
    cdkBuilder.minTargetCapacity(minTargetCapacity)
  }

  /**
   * @param singleAvailabilityZone Indicates that the fleet launches all On-Demand Instances into a
   * single Availability Zone.
   * Supported only for fleets of type `instant` .
   */
  public fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
    cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
  }

  /**
   * @param singleAvailabilityZone Indicates that the fleet launches all On-Demand Instances into a
   * single Availability Zone.
   * Supported only for fleets of type `instant` .
   */
  public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
    cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
  }

  /**
   * @param singleInstanceType Indicates that the fleet uses a single instance type to launch all
   * On-Demand Instances in the fleet.
   * Supported only for fleets of type `instant` .
   */
  public fun singleInstanceType(singleInstanceType: Boolean) {
    cdkBuilder.singleInstanceType(singleInstanceType)
  }

  /**
   * @param singleInstanceType Indicates that the fleet uses a single instance type to launch all
   * On-Demand Instances in the fleet.
   * Supported only for fleets of type `instant` .
   */
  public fun singleInstanceType(singleInstanceType: IResolvable) {
    cdkBuilder.singleInstanceType(singleInstanceType)
  }

  public fun build(): CfnEC2Fleet.OnDemandOptionsRequestProperty = cdkBuilder.build()
}
