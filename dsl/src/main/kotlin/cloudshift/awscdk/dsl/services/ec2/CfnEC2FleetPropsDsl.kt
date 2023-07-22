@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.amazon.awscdk.services.ec2.CfnEC2FleetProps

@CdkDslMarker
public class CfnEC2FleetPropsDsl {
  private val cdkBuilder: CfnEC2FleetProps.Builder = CfnEC2FleetProps.builder()

  private val _launchTemplateConfigs: MutableList<Any> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  /**
   * @param context Reserved.
   */
  public fun context(context: String) {
    cdkBuilder.context(context)
  }

  /**
   * @param excessCapacityTerminationPolicy Indicates whether running instances should be terminated
   * if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2
   * Fleet.
   * Supported only for fleets of type `maintain` .
   */
  public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
    cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
  }

  /**
   * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
   */
  public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any) {
    _launchTemplateConfigs.addAll(listOf(*launchTemplateConfigs))
  }

  /**
   * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
   */
  public fun launchTemplateConfigs(launchTemplateConfigs: Collection<Any>) {
    _launchTemplateConfigs.addAll(launchTemplateConfigs)
  }

  /**
   * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
   */
  public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
    cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
  }

  /**
   * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
   */
  public fun onDemandOptions(onDemandOptions: IResolvable) {
    cdkBuilder.onDemandOptions(onDemandOptions)
  }

  /**
   * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
   */
  public fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty) {
    cdkBuilder.onDemandOptions(onDemandOptions)
  }

  /**
   * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
   * Instances.
   * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
   * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
   * in the *Amazon EC2 User Guide* .
   */
  public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
    cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
  }

  /**
   * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
   * Instances.
   * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
   * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
   * in the *Amazon EC2 User Guide* .
   */
  public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
    cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
  }

  /**
   * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
   */
  public fun spotOptions(spotOptions: IResolvable) {
    cdkBuilder.spotOptions(spotOptions)
  }

  /**
   * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
   */
  public fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty) {
    cdkBuilder.spotOptions(spotOptions)
  }

  /**
   * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation. For
   * more information, see [Tagging your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
   * `instance` to tag the instances at launch.
   *
   * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
   * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify the
   * tags in a [launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * .
   */
  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  /**
   * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation. For
   * more information, see [Tagging your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
   * `instance` to tag the instances at launch.
   *
   * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
   * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify the
   * tags in a [launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * .
   */
  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  /**
   * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation. For
   * more information, see [Tagging your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
   * `instance` to tag the instances at launch.
   *
   * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
   * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify the
   * tags in a [launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * .
   */
  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  /**
   * @param targetCapacitySpecification The number of units to request. 
   */
  public fun targetCapacitySpecification(targetCapacitySpecification: IResolvable) {
    cdkBuilder.targetCapacitySpecification(targetCapacitySpecification)
  }

  /**
   * @param targetCapacitySpecification The number of units to request. 
   */
  public
      fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty) {
    cdkBuilder.targetCapacitySpecification(targetCapacitySpecification)
  }

  /**
   * @param terminateInstancesWithExpiration Indicates whether running instances should be
   * terminated when the EC2 Fleet expires.
   */
  public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
    cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
  }

  /**
   * @param terminateInstancesWithExpiration Indicates whether running instances should be
   * terminated when the EC2 Fleet expires.
   */
  public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
    cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
  }

  /**
   * @param type The fleet type. The default value is `maintain` .
   * * `maintain` - The EC2 Fleet places an asynchronous request for your desired capacity, and
   * continues to maintain your desired Spot capacity by replenishing interrupted Spot Instances.
   * * `request` - The EC2 Fleet places an asynchronous one-time request for your desired capacity,
   * but does submit Spot requests in alternative capacity pools if Spot capacity is unavailable, and
   * does not maintain Spot capacity if Spot Instances are interrupted.
   * * `instant` - The EC2 Fleet places a synchronous one-time request for your desired capacity,
   * and returns errors for any instances that could not be launched.
   *
   * For more information, see [EC2 Fleet request
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-request-type.html) in the
   * *Amazon EC2 User Guide* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param validFrom The start date and time of the request, in UTC format (for example, *YYYY* -
   * *MM* - *DD* T *HH* : *MM* : *SS* Z).
   * The default is to start fulfilling the request immediately.
   */
  public fun validFrom(validFrom: String) {
    cdkBuilder.validFrom(validFrom)
  }

  /**
   * @param validUntil The end date and time of the request, in UTC format (for example, *YYYY* -
   * *MM* - *DD* T *HH* : *MM* : *SS* Z).
   * At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value
   * is specified, the request remains until you cancel it.
   */
  public fun validUntil(validUntil: String) {
    cdkBuilder.validUntil(validUntil)
  }

  public fun build(): CfnEC2FleetProps {
    if(_launchTemplateConfigs.isNotEmpty()) cdkBuilder.launchTemplateConfigs(_launchTemplateConfigs)
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}
