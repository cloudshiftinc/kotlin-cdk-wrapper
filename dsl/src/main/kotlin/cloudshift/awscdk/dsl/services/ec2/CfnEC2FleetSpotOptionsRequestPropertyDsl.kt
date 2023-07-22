@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * Specifies the configuration of Spot Instances for an EC2 Fleet.
 *
 * `SpotOptionsRequest` is a property of the
 * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SpotOptionsRequestProperty spotOptionsRequestProperty = SpotOptionsRequestProperty.builder()
 * .allocationStrategy("allocationStrategy")
 * .instanceInterruptionBehavior("instanceInterruptionBehavior")
 * .instancePoolsToUseCount(123)
 * .maintenanceStrategies(MaintenanceStrategiesProperty.builder()
 * .capacityRebalance(CapacityRebalanceProperty.builder()
 * .replacementStrategy("replacementStrategy")
 * .terminationDelay(123)
 * .build())
 * .build())
 * .maxTotalPrice("maxTotalPrice")
 * .minTargetCapacity(123)
 * .singleAvailabilityZone(false)
 * .singleInstanceType(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html)
 */
@CdkDslMarker
public class CfnEC2FleetSpotOptionsRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.SpotOptionsRequestProperty.Builder =
      CfnEC2Fleet.SpotOptionsRequestProperty.builder()

  /**
   * @param allocationStrategy Indicates how to allocate the target Spot Instance capacity across
   * the Spot Instance pools specified by the EC2 Fleet.
   * If the allocation strategy is `lowestPrice` , EC2 Fleet launches instances from the Spot
   * Instance pools with the lowest price. This is the default allocation strategy.
   *
   * If the allocation strategy is `diversified` , EC2 Fleet launches instances from all the Spot
   * Instance pools that you specify.
   *
   * If the allocation strategy is `capacityOptimized` , EC2 Fleet launches instances from Spot
   * Instance pools that are optimally chosen based on the available Spot Instance capacity.
   *
   * *Allowed Values* : `lowestPrice` | `diversified` | `capacityOptimized` |
   * `capacityOptimizedPrioritized`
   */
  public fun allocationStrategy(allocationStrategy: String) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  /**
   * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
   * Default: `terminate`
   */
  public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
    cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
  }

  /**
   * @param instancePoolsToUseCount The number of Spot pools across which to allocate your target
   * Spot capacity.
   * Supported only when Spot `AllocationStrategy` is set to `lowest-price` . EC2 Fleet selects the
   * cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools
   * that you specify.
   *
   * Note that EC2 Fleet attempts to draw Spot Instances from the number of pools that you specify
   * on a best effort basis. If a pool runs out of Spot capacity before fulfilling your target
   * capacity, EC2 Fleet will continue to fulfill your request by drawing from the next cheapest pool.
   * To ensure that your target capacity is met, you might receive Spot Instances from more than the
   * number of pools that you specified. Similarly, if most of the pools have no Spot capacity, you
   * might receive your full target capacity from fewer than the number of pools that you specified.
   */
  public fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
    cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
  }

  /**
   * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
   * elevated risk of being interrupted.
   */
  public fun maintenanceStrategies(maintenanceStrategies: IResolvable) {
    cdkBuilder.maintenanceStrategies(maintenanceStrategies)
  }

  /**
   * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
   * elevated risk of being interrupted.
   */
  public
      fun maintenanceStrategies(maintenanceStrategies: CfnEC2Fleet.MaintenanceStrategiesProperty) {
    cdkBuilder.maintenanceStrategies(maintenanceStrategies)
  }

  /**
   * @param maxTotalPrice The maximum amount per hour for Spot Instances that you're willing to pay.
   * We do not recommend using this parameter because it can lead to increased interruptions. If you
   * do not specify this parameter, you will pay the current Spot price.
   *
   *
   * If you specify a maximum price, your Spot Instances will be interrupted more frequently than if
   * you do not specify this parameter.
   */
  public fun maxTotalPrice(maxTotalPrice: String) {
    cdkBuilder.maxTotalPrice(maxTotalPrice)
  }

  /**
   * @param minTargetCapacity The minimum target capacity for Spot Instances in the fleet.
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
   * @param singleAvailabilityZone Indicates that the fleet launches all Spot Instances into a
   * single Availability Zone.
   * Supported only for fleets of type `instant` .
   */
  public fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
    cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
  }

  /**
   * @param singleAvailabilityZone Indicates that the fleet launches all Spot Instances into a
   * single Availability Zone.
   * Supported only for fleets of type `instant` .
   */
  public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
    cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
  }

  /**
   * @param singleInstanceType Indicates that the fleet uses a single instance type to launch all
   * Spot Instances in the fleet.
   * Supported only for fleets of type `instant` .
   */
  public fun singleInstanceType(singleInstanceType: Boolean) {
    cdkBuilder.singleInstanceType(singleInstanceType)
  }

  /**
   * @param singleInstanceType Indicates that the fleet uses a single instance type to launch all
   * Spot Instances in the fleet.
   * Supported only for fleets of type `instant` .
   */
  public fun singleInstanceType(singleInstanceType: IResolvable) {
    cdkBuilder.singleInstanceType(singleInstanceType)
  }

  public fun build(): CfnEC2Fleet.SpotOptionsRequestProperty = cdkBuilder.build()
}
