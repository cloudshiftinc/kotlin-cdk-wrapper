@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetFleetLaunchTemplateOverridesRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.Builder =
      CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.builder()

  /**
   * @param availabilityZone The Availability Zone in which to launch the instances.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param instanceRequirements The attributes for the instance types.
   * When you specify instance attributes, Amazon EC2 will identify instance types with those
   * attributes.
   *
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   */
  public fun instanceRequirements(instanceRequirements: IResolvable) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  /**
   * @param instanceRequirements The attributes for the instance types.
   * When you specify instance attributes, Amazon EC2 will identify instance types with those
   * attributes.
   *
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   */
  public
      fun instanceRequirements(instanceRequirements: CfnEC2Fleet.InstanceRequirementsRequestProperty) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  /**
   * @param instanceType The instance type.
   * `mac1.metal` is not supported as a launch template override.
   *
   *
   * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param maxPrice The maximum price per unit hour that you are willing to pay for a Spot
   * Instance.
   * We do not recommend using this parameter because it can lead to increased interruptions. If you
   * do not specify this parameter, you will pay the current Spot price.
   *
   *
   * If you specify a maximum price, your instances will be interrupted more frequently than if you
   * do not specify this parameter.
   */
  public fun maxPrice(maxPrice: String) {
    cdkBuilder.maxPrice(maxPrice)
  }

  /**
   * @param placement The location where the instance launched, if applicable.
   */
  public fun placement(placement: IResolvable) {
    cdkBuilder.placement(placement)
  }

  /**
   * @param placement The location where the instance launched, if applicable.
   */
  public fun placement(placement: CfnEC2Fleet.PlacementProperty) {
    cdkBuilder.placement(placement)
  }

  /**
   * @param priority The priority for the launch template override. The highest priority is launched
   * first.
   * If the On-Demand `AllocationStrategy` is set to `prioritized` , EC2 Fleet uses priority to
   * determine which launch template override to use first in fulfilling On-Demand capacity.
   *
   * If the Spot `AllocationStrategy` is set to `capacity-optimized-prioritized` , EC2 Fleet uses
   * priority on a best-effort basis to determine which launch template override to use in fulfilling
   * Spot capacity, but optimizes for capacity first.
   *
   * Valid values are whole numbers starting at `0` . The lower the number, the higher the priority.
   * If no number is set, the launch template override has the lowest priority. You can set the same
   * priority for different launch template overrides.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param subnetId The IDs of the subnets in which to launch the instances.
   * Separate multiple subnet IDs using commas (for example, `subnet-1234abcdeexample1,
   * subnet-0987cdef6example2` ). A request of type `instant` can have only one subnet ID.
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  /**
   * @param weightedCapacity The number of units provided by the specified instance type.
   */
  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty = cdkBuilder.build()
}
