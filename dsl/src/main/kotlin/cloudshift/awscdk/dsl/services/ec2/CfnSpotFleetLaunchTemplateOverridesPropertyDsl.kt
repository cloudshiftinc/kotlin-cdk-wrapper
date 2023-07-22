@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetLaunchTemplateOverridesPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.LaunchTemplateOverridesProperty.Builder =
      CfnSpotFleet.LaunchTemplateOverridesProperty.builder()

  /**
   * @param availabilityZone The Availability Zone in which to launch the instances.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param instanceRequirements The instance requirements.
   * When you specify instance requirements, Amazon EC2 will identify instance types with the
   * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
   * instances from these instance types, in the same way as when you specify a list of instance types.
   *
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   */
  public fun instanceRequirements(instanceRequirements: IResolvable) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  /**
   * @param instanceRequirements The instance requirements.
   * When you specify instance requirements, Amazon EC2 will identify instance types with the
   * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
   * instances from these instance types, in the same way as when you specify a list of instance types.
   *
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   */
  public
      fun instanceRequirements(instanceRequirements: CfnSpotFleet.InstanceRequirementsRequestProperty) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  /**
   * @param instanceType The instance type.
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param priority The priority for the launch template override. The highest priority is launched
   * first.
   * If `OnDemandAllocationStrategy` is set to `prioritized` , Spot Fleet uses priority to determine
   * which launch template override to use first in fulfilling On-Demand capacity.
   *
   * If the Spot `AllocationStrategy` is set to `capacityOptimizedPrioritized` , Spot Fleet uses
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
   * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
   * Instance.
   * We do not recommend using this parameter because it can lead to increased interruptions. If you
   * do not specify this parameter, you will pay the current Spot price.
   *
   *
   * If you specify a maximum price, your instances will be interrupted more frequently than if you
   * do not specify this parameter.
   */
  public fun spotPrice(spotPrice: String) {
    cdkBuilder.spotPrice(spotPrice)
  }

  /**
   * @param subnetId The ID of the subnet in which to launch the instances.
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

  public fun build(): CfnSpotFleet.LaunchTemplateOverridesProperty = cdkBuilder.build()
}
