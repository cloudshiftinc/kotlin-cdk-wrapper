@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder =
      CfnSpotFleet.SpotFleetRequestConfigDataProperty.builder()

  private val _launchSpecifications: MutableList<Any> = mutableListOf()

  private val _launchTemplateConfigs: MutableList<Any> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  /**
   * @param allocationStrategy The strategy that determines how to allocate the target Spot Instance
   * capacity across the Spot Instance pools specified by the Spot Fleet launch configuration.
   * For more information, see [Allocation strategies for Spot
   * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-allocation-strategy.html)
   * in the *Amazon EC2 User Guide* .
   *
   * * **priceCapacityOptimized (recommended)** - Spot Fleet identifies the pools with the highest
   * capacity availability for the number of instances that are launching. This means that we will
   * request Spot Instances from the pools that we believe have the lowest chance of interruption in
   * the near term. Spot Fleet then requests Spot Instances from the lowest priced of these pools.
   * * **capacityOptimized** - Spot Fleet identifies the pools with the highest capacity
   * availability for the number of instances that are launching. This means that we will request Spot
   * Instances from the pools that we believe have the lowest chance of interruption in the near term.
   * To give certain instance types a higher chance of launching first, use
   * `capacityOptimizedPrioritized` . Set a priority for each instance type by using the `Priority`
   * parameter for `LaunchTemplateOverrides` . You can assign the same priority to different
   * `LaunchTemplateOverrides` . EC2 implements the priorities on a best-effort basis, but optimizes
   * for capacity first. `capacityOptimizedPrioritized` is supported only if your Spot Fleet uses a
   * launch template. Note that if the `OnDemandAllocationStrategy` is set to `prioritized` , the same
   * priority is applied when fulfilling On-Demand capacity.
   * * **diversified** - Spot Fleet requests instances from all of the Spot Instance pools that you
   * specify.
   * * **lowestPrice** - Spot Fleet requests instances from the lowest priced Spot Instance pool
   * that has available capacity. If the lowest priced pool doesn't have available capacity, the Spot
   * Instances come from the next lowest priced pool that has available capacity. If a pool runs out of
   * capacity before fulfilling your desired capacity, Spot Fleet will continue to fulfill your request
   * by drawing from the next lowest priced pool. To ensure that your desired capacity is met, you
   * might receive Spot Instances from several pools. Because this strategy only considers instance
   * price and not capacity availability, it might lead to high interruption rates.
   *
   * Default: `lowestPrice`
   */
  public fun allocationStrategy(allocationStrategy: String) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  /**
   * @param context Reserved.
   */
  public fun context(context: String) {
    cdkBuilder.context(context)
  }

  /**
   * @param excessCapacityTerminationPolicy Indicates whether running Spot Instances should be
   * terminated if you decrease the target capacity of the Spot Fleet request below the current size of
   * the Spot Fleet.
   * Supported only for fleets of type `maintain` .
   */
  public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
    cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
  }

  /**
   * @param iamFleetRole The Amazon Resource Name (ARN) of an AWS Identity and Access Management
   * (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag
   * instances on your behalf. 
   * For more information, see [Spot Fleet
   * Prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites)
   * in the *Amazon EC2 User Guide for Linux Instances* . Spot Fleet can terminate Spot Instances on
   * your behalf when you cancel its Spot Fleet request or when the Spot Fleet request expires, if you
   * set `TerminateInstancesWithExpiration` .
   */
  public fun iamFleetRole(iamFleetRole: String) {
    cdkBuilder.iamFleetRole(iamFleetRole)
  }

  /**
   * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
   * The default is `terminate` .
   */
  public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
    cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
  }

  /**
   * @param instancePoolsToUseCount The number of Spot pools across which to allocate your target
   * Spot capacity.
   * Valid only when Spot *AllocationStrategy* is set to `lowest-price` . Spot Fleet selects the
   * cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools
   * that you specify.
   *
   * Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you specify
   * on a best effort basis. If a pool runs out of Spot capacity before fulfilling your target
   * capacity, Spot Fleet will continue to fulfill your request by drawing from the next cheapest pool.
   * To ensure that your target capacity is met, you might receive Spot Instances from more than the
   * number of pools that you specified. Similarly, if most of the pools have no Spot capacity, you
   * might receive your full target capacity from fewer than the number of pools that you specified.
   */
  public fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
    cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
  }

  /**
   * @param launchSpecifications The launch specifications for the Spot Fleet request.
   * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
   */
  public fun launchSpecifications(vararg launchSpecifications: Any) {
    _launchSpecifications.addAll(listOf(*launchSpecifications))
  }

  /**
   * @param launchSpecifications The launch specifications for the Spot Fleet request.
   * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
   */
  public fun launchSpecifications(launchSpecifications: Collection<Any>) {
    _launchSpecifications.addAll(launchSpecifications)
  }

  /**
   * @param launchSpecifications The launch specifications for the Spot Fleet request.
   * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
   */
  public fun launchSpecifications(launchSpecifications: IResolvable) {
    cdkBuilder.launchSpecifications(launchSpecifications)
  }

  /**
   * @param launchTemplateConfigs The launch template and overrides.
   * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
   */
  public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any) {
    _launchTemplateConfigs.addAll(listOf(*launchTemplateConfigs))
  }

  /**
   * @param launchTemplateConfigs The launch template and overrides.
   * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
   */
  public fun launchTemplateConfigs(launchTemplateConfigs: Collection<Any>) {
    _launchTemplateConfigs.addAll(launchTemplateConfigs)
  }

  /**
   * @param launchTemplateConfigs The launch template and overrides.
   * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
   */
  public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
    cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
  }

  /**
   * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach to
   * the Spot Fleet request.
   * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and
   * target groups.
   *
   * With Network Load Balancers, Spot Fleet cannot register instances that have the following
   * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
   */
  public fun loadBalancersConfig(loadBalancersConfig: IResolvable) {
    cdkBuilder.loadBalancersConfig(loadBalancersConfig)
  }

  /**
   * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach to
   * the Spot Fleet request.
   * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and
   * target groups.
   *
   * With Network Load Balancers, Spot Fleet cannot register instances that have the following
   * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
   */
  public fun loadBalancersConfig(loadBalancersConfig: CfnSpotFleet.LoadBalancersConfigProperty) {
    cdkBuilder.loadBalancersConfig(loadBalancersConfig)
  }

  /**
   * @param onDemandAllocationStrategy The order of the launch template overrides to use in
   * fulfilling On-Demand capacity.
   * If you specify `lowestPrice` , Spot Fleet uses price to determine the order, launching the
   * lowest price first. If you specify `prioritized` , Spot Fleet uses the priority that you assign to
   * each Spot Fleet launch template override, launching the highest priority first. If you do not
   * specify a value, Spot Fleet defaults to `lowestPrice` .
   */
  public fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
    cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
  }

  /**
   * @param onDemandMaxTotalPrice The maximum amount per hour for On-Demand Instances that you're
   * willing to pay.
   * You can use the `onDemandMaxTotalPrice` parameter, the `spotMaxTotalPrice` parameter, or both
   * parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price
   * per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch
   * instances until it reaches the maximum amount you're willing to pay. When the maximum amount
   * you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the
   * target capacity.
   */
  public fun onDemandMaxTotalPrice(onDemandMaxTotalPrice: String) {
    cdkBuilder.onDemandMaxTotalPrice(onDemandMaxTotalPrice)
  }

  /**
   * @param onDemandTargetCapacity The number of On-Demand units to request.
   * You can choose to set the target capacity in terms of instances or a performance characteristic
   * that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
   * is `maintain` , you can specify a target capacity of 0 and add capacity later.
   */
  public fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
    cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
  }

  /**
   * @param replaceUnhealthyInstances Indicates whether Spot Fleet should replace unhealthy
   * instances.
   */
  public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
    cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
  }

  /**
   * @param replaceUnhealthyInstances Indicates whether Spot Fleet should replace unhealthy
   * instances.
   */
  public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
    cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
  }

  /**
   * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are at an
   * elevated risk of being interrupted.
   */
  public fun spotMaintenanceStrategies(spotMaintenanceStrategies: IResolvable) {
    cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies)
  }

  /**
   * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are at an
   * elevated risk of being interrupted.
   */
  public
      fun spotMaintenanceStrategies(spotMaintenanceStrategies: CfnSpotFleet.SpotMaintenanceStrategiesProperty) {
    cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies)
  }

  /**
   * @param spotMaxTotalPrice The maximum amount per hour for Spot Instances that you're willing to
   * pay.
   * You can use the `spotdMaxTotalPrice` parameter, the `onDemandMaxTotalPrice` parameter, or both
   * parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price
   * per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch
   * instances until it reaches the maximum amount you're willing to pay. When the maximum amount
   * you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the
   * target capacity.
   */
  public fun spotMaxTotalPrice(spotMaxTotalPrice: String) {
    cdkBuilder.spotMaxTotalPrice(spotMaxTotalPrice)
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
   * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
   * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet request
   * fails. To tag instances at launch, specify the tags in the [launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * (valid only if you use `LaunchTemplateConfigs` ) or in the
   * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
   * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch, see
   * [Tagging Your
   * Resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   */
  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  /**
   * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
   * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet request
   * fails. To tag instances at launch, specify the tags in the [launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * (valid only if you use `LaunchTemplateConfigs` ) or in the
   * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
   * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch, see
   * [Tagging Your
   * Resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   */
  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  /**
   * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
   * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet request
   * fails. To tag instances at launch, specify the tags in the [launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * (valid only if you use `LaunchTemplateConfigs` ) or in the
   * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
   * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch, see
   * [Tagging Your
   * Resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   */
  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  /**
   * @param targetCapacity The number of units to request for the Spot Fleet. 
   * You can choose to set the target capacity in terms of instances or a performance characteristic
   * that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
   * is `maintain` , you can specify a target capacity of 0 and add capacity later.
   */
  public fun targetCapacity(targetCapacity: Number) {
    cdkBuilder.targetCapacity(targetCapacity)
  }

  /**
   * @param targetCapacityUnitType The unit for the target capacity. `TargetCapacityUnitType` can
   * only be specified when `InstanceRequirements` is specified.
   * Default: `units` (translates to number of instances)
   */
  public fun targetCapacityUnitType(targetCapacityUnitType: String) {
    cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
  }

  /**
   * @param terminateInstancesWithExpiration Indicates whether running Spot Instances are terminated
   * when the Spot Fleet request expires.
   */
  public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
    cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
  }

  /**
   * @param terminateInstancesWithExpiration Indicates whether running Spot Instances are terminated
   * when the Spot Fleet request expires.
   */
  public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
    cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
  }

  /**
   * @param type The type of request.
   * Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain
   * it. When this value is `request` , the Spot Fleet only places the required requests. It does not
   * attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in
   * alternative Spot pools if capacity is not available. When this value is `maintain` , the Spot
   * Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity
   * and automatically replenishes any interrupted instances. Default: `maintain` . `instant` is listed
   * but is not used by Spot Fleet.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param validFrom The start date and time of the request, in UTC format ( *YYYY* - *MM* - *DD* T
   * *HH* : *MM* : *SS* Z).
   * By default, Amazon EC2 starts fulfilling the request immediately.
   */
  public fun validFrom(validFrom: String) {
    cdkBuilder.validFrom(validFrom)
  }

  /**
   * @param validUntil The end date and time of the request, in UTC format ( *YYYY* - *MM* - *DD* T
   * *HH* : *MM* : *SS* Z).
   * After the end date and time, no new Spot Instance requests are placed or able to fulfill the
   * request. If no value is specified, the Spot Fleet request remains until you cancel it.
   */
  public fun validUntil(validUntil: String) {
    cdkBuilder.validUntil(validUntil)
  }

  public fun build(): CfnSpotFleet.SpotFleetRequestConfigDataProperty {
    if(_launchSpecifications.isNotEmpty()) cdkBuilder.launchSpecifications(_launchSpecifications)
    if(_launchTemplateConfigs.isNotEmpty()) cdkBuilder.launchTemplateConfigs(_launchTemplateConfigs)
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}
