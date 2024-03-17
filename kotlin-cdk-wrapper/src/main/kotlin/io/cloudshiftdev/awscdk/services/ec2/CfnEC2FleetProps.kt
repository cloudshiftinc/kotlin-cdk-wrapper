@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEC2Fleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnEC2FleetProps cfnEC2FleetProps = CfnEC2FleetProps.builder()
 * .launchTemplateConfigs(List.of(FleetLaunchTemplateConfigRequestProperty.builder()
 * .launchTemplateSpecification(FleetLaunchTemplateSpecificationRequestProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * .overrides(List.of(FleetLaunchTemplateOverridesRequestProperty.builder()
 * .availabilityZone("availabilityZone")
 * .instanceRequirements(InstanceRequirementsRequestProperty.builder()
 * .acceleratorCount(AcceleratorCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
 * .acceleratorNames(List.of("acceleratorNames"))
 * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .acceleratorTypes(List.of("acceleratorTypes"))
 * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
 * .bareMetal("bareMetal")
 * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .burstablePerformance("burstablePerformance")
 * .cpuManufacturers(List.of("cpuManufacturers"))
 * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
 * .instanceGenerations(List.of("instanceGenerations"))
 * .localStorage("localStorage")
 * .localStorageTypes(List.of("localStorageTypes"))
 * .maxSpotPriceAsPercentageOfOptimalOnDemandPrice(123)
 * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .memoryMiB(MemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .onDemandMaxPricePercentageOverLowestPrice(123)
 * .requireHibernateSupport(false)
 * .spotMaxPricePercentageOverLowestPrice(123)
 * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .vCpuCount(VCpuCountRangeRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .build())
 * .instanceType("instanceType")
 * .maxPrice("maxPrice")
 * .placement(PlacementProperty.builder()
 * .affinity("affinity")
 * .availabilityZone("availabilityZone")
 * .groupName("groupName")
 * .hostId("hostId")
 * .hostResourceGroupArn("hostResourceGroupArn")
 * .partitionNumber(123)
 * .spreadDomain("spreadDomain")
 * .tenancy("tenancy")
 * .build())
 * .priority(123)
 * .subnetId("subnetId")
 * .weightedCapacity(123)
 * .build()))
 * .build()))
 * .targetCapacitySpecification(TargetCapacitySpecificationRequestProperty.builder()
 * .totalTargetCapacity(123)
 * // the properties below are optional
 * .defaultTargetCapacityType("defaultTargetCapacityType")
 * .onDemandTargetCapacity(123)
 * .spotTargetCapacity(123)
 * .targetCapacityUnitType("targetCapacityUnitType")
 * .build())
 * // the properties below are optional
 * .context("context")
 * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
 * .onDemandOptions(OnDemandOptionsRequestProperty.builder()
 * .allocationStrategy("allocationStrategy")
 * .capacityReservationOptions(CapacityReservationOptionsRequestProperty.builder()
 * .usageStrategy("usageStrategy")
 * .build())
 * .maxTotalPrice("maxTotalPrice")
 * .minTargetCapacity(123)
 * .singleAvailabilityZone(false)
 * .singleInstanceType(false)
 * .build())
 * .replaceUnhealthyInstances(false)
 * .spotOptions(SpotOptionsRequestProperty.builder()
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
 * .build())
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .terminateInstancesWithExpiration(false)
 * .type("type")
 * .validFrom("validFrom")
 * .validUntil("validUntil")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
 */
public interface CfnEC2FleetProps {
  /**
   * Reserved.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-context)
   */
  public fun context(): String? = unwrap(this).getContext()

  /**
   * Indicates whether running instances should be terminated if the total target capacity of the
   * EC2 Fleet is decreased below the current size of the EC2 Fleet.
   *
   * Supported only for fleets of type `maintain` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy)
   */
  public fun excessCapacityTerminationPolicy(): String? =
      unwrap(this).getExcessCapacityTerminationPolicy()

  /**
   * The configuration for the EC2 Fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
   */
  public fun launchTemplateConfigs(): Any

  /**
   * Describes the configuration of On-Demand Instances in an EC2 Fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
   */
  public fun onDemandOptions(): Any? = unwrap(this).getOnDemandOptions()

  /**
   * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
   *
   * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
   * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
   * in the *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances)
   */
  public fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

  /**
   * Describes the configuration of Spot Instances in an EC2 Fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
   */
  public fun spotOptions(): Any? = unwrap(this).getSpotOptions()

  /**
   * The key-value pair for tagging the EC2 Fleet request on creation. For more information, see
   * [Tag your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   *
   * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
   * `instance` to tag the instances at launch.
   *
   * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
   * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify the
   * tags in a [launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-tagspecifications)
   */
  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The number of units to request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
   */
  public fun targetCapacitySpecification(): Any

  /**
   * Indicates whether running instances should be terminated when the EC2 Fleet expires.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration)
   */
  public fun terminateInstancesWithExpiration(): Any? =
      unwrap(this).getTerminateInstancesWithExpiration()

  /**
   * The fleet type. The default value is `maintain` .
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * The start date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH*
   * : *MM* : *SS* Z).
   *
   * The default is to start fulfilling the request immediately.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom)
   */
  public fun validFrom(): String? = unwrap(this).getValidFrom()

  /**
   * The end date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH* :
   * *MM* : *SS* Z).
   *
   * At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value
   * is specified, the request remains until you cancel it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil)
   */
  public fun validUntil(): String? = unwrap(this).getValidUntil()

  /**
   * A builder for [CfnEC2FleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param context Reserved.
     */
    public fun context(context: String)

    /**
     * @param excessCapacityTerminationPolicy Indicates whether running instances should be
     * terminated if the total target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * Supported only for fleets of type `maintain` .
     */
    public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String)

    /**
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable)

    /**
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    public fun launchTemplateConfigs(launchTemplateConfigs: List<Any>)

    /**
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any)

    /**
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
     */
    public fun onDemandOptions(onDemandOptions: IResolvable)

    /**
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
     */
    public fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty)

    /**
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7b2bfbe6b74008fc249f9186fc70a68fd8fe93b800c2e90c3430ce0609656")
    public
        fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder.() -> Unit)

    /**
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances.
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     */
    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean)

    /**
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances.
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     */
    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable)

    /**
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
     */
    public fun spotOptions(spotOptions: IResolvable)

    /**
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
     */
    public fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty)

    /**
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6f3ed9b887bab23ab40d8ca03eae8cce7b8d9e53e1030f9b49651caf25f6f5")
    public fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty.Builder.() -> Unit)

    /**
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
     * `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
     * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify
     * the tags in a [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * .
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
     * `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
     * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify
     * the tags in a [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * .
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
     * `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
     * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify
     * the tags in a [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * .
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * @param targetCapacitySpecification The number of units to request. 
     */
    public fun targetCapacitySpecification(targetCapacitySpecification: IResolvable)

    /**
     * @param targetCapacitySpecification The number of units to request. 
     */
    public
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty)

    /**
     * @param targetCapacitySpecification The number of units to request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81b1d42586c55d6d673218be0c158958f7fdec79271c464e78d67c7f098e0348")
    public
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder.() -> Unit)

    /**
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires.
     */
    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean)

    /**
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires.
     */
    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable)

    /**
     * @param type The fleet type. The default value is `maintain` .
     * * `maintain` - The EC2 Fleet places an asynchronous request for your desired capacity, and
     * continues to maintain your desired Spot capacity by replenishing interrupted Spot Instances.
     * * `request` - The EC2 Fleet places an asynchronous one-time request for your desired
     * capacity, but does submit Spot requests in alternative capacity pools if Spot capacity is
     * unavailable, and does not maintain Spot capacity if Spot Instances are interrupted.
     * * `instant` - The EC2 Fleet places a synchronous one-time request for your desired capacity,
     * and returns errors for any instances that could not be launched.
     *
     * For more information, see [EC2 Fleet request
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-request-type.html) in the
     * *Amazon EC2 User Guide* .
     */
    public fun type(type: String)

    /**
     * @param validFrom The start date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z).
     * The default is to start fulfilling the request immediately.
     */
    public fun validFrom(validFrom: String)

    /**
     * @param validUntil The end date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z).
     * At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no
     * value is specified, the request remains until you cancel it.
     */
    public fun validUntil(validUntil: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEC2FleetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEC2FleetProps.builder()

    /**
     * @param context Reserved.
     */
    override fun context(context: String) {
      cdkBuilder.context(context)
    }

    /**
     * @param excessCapacityTerminationPolicy Indicates whether running instances should be
     * terminated if the total target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * Supported only for fleets of type `maintain` .
     */
    override fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
      cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
    }

    /**
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    override fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs.let(IResolvable::unwrap))
    }

    /**
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    override fun launchTemplateConfigs(launchTemplateConfigs: List<Any>) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
    }

    /**
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    override fun launchTemplateConfigs(vararg launchTemplateConfigs: Any): Unit =
        launchTemplateConfigs(launchTemplateConfigs.toList())

    /**
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
     */
    override fun onDemandOptions(onDemandOptions: IResolvable) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(IResolvable::unwrap))
    }

    /**
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
     */
    override fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(CfnEC2Fleet.OnDemandOptionsRequestProperty::unwrap))
    }

    /**
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7b2bfbe6b74008fc249f9186fc70a68fd8fe93b800c2e90c3430ce0609656")
    override
        fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder.() -> Unit):
        Unit = onDemandOptions(CfnEC2Fleet.OnDemandOptionsRequestProperty(onDemandOptions))

    /**
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances.
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     */
    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
    }

    /**
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances.
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     */
    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances.let(IResolvable::unwrap))
    }

    /**
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
     */
    override fun spotOptions(spotOptions: IResolvable) {
      cdkBuilder.spotOptions(spotOptions.let(IResolvable::unwrap))
    }

    /**
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
     */
    override fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty) {
      cdkBuilder.spotOptions(spotOptions.let(CfnEC2Fleet.SpotOptionsRequestProperty::unwrap))
    }

    /**
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6f3ed9b887bab23ab40d8ca03eae8cce7b8d9e53e1030f9b49651caf25f6f5")
    override
        fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty.Builder.() -> Unit):
        Unit = spotOptions(CfnEC2Fleet.SpotOptionsRequestProperty(spotOptions))

    /**
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
     * `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
     * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify
     * the tags in a [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * .
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
     * `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
     * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify
     * the tags in a [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * .
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
     * `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
     * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify
     * the tags in a [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * .
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * @param targetCapacitySpecification The number of units to request. 
     */
    override fun targetCapacitySpecification(targetCapacitySpecification: IResolvable) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(IResolvable::unwrap))
    }

    /**
     * @param targetCapacitySpecification The number of units to request. 
     */
    override
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(CfnEC2Fleet.TargetCapacitySpecificationRequestProperty::unwrap))
    }

    /**
     * @param targetCapacitySpecification The number of units to request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81b1d42586c55d6d673218be0c158958f7fdec79271c464e78d67c7f098e0348")
    override
        fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder.() -> Unit):
        Unit =
        targetCapacitySpecification(CfnEC2Fleet.TargetCapacitySpecificationRequestProperty(targetCapacitySpecification))

    /**
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires.
     */
    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
    }

    /**
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires.
     */
    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration.let(IResolvable::unwrap))
    }

    /**
     * @param type The fleet type. The default value is `maintain` .
     * * `maintain` - The EC2 Fleet places an asynchronous request for your desired capacity, and
     * continues to maintain your desired Spot capacity by replenishing interrupted Spot Instances.
     * * `request` - The EC2 Fleet places an asynchronous one-time request for your desired
     * capacity, but does submit Spot requests in alternative capacity pools if Spot capacity is
     * unavailable, and does not maintain Spot capacity if Spot Instances are interrupted.
     * * `instant` - The EC2 Fleet places a synchronous one-time request for your desired capacity,
     * and returns errors for any instances that could not be launched.
     *
     * For more information, see [EC2 Fleet request
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-request-type.html) in the
     * *Amazon EC2 User Guide* .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param validFrom The start date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z).
     * The default is to start fulfilling the request immediately.
     */
    override fun validFrom(validFrom: String) {
      cdkBuilder.validFrom(validFrom)
    }

    /**
     * @param validUntil The end date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z).
     * At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no
     * value is specified, the request remains until you cancel it.
     */
    override fun validUntil(validUntil: String) {
      cdkBuilder.validUntil(validUntil)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEC2FleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEC2FleetProps,
  ) : CdkObject(cdkObject), CfnEC2FleetProps {
    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-context)
     */
    override fun context(): String? = unwrap(this).getContext()

    /**
     * Indicates whether running instances should be terminated if the total target capacity of the
     * EC2 Fleet is decreased below the current size of the EC2 Fleet.
     *
     * Supported only for fleets of type `maintain` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy)
     */
    override fun excessCapacityTerminationPolicy(): String? =
        unwrap(this).getExcessCapacityTerminationPolicy()

    /**
     * The configuration for the EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
     */
    override fun launchTemplateConfigs(): Any = unwrap(this).getLaunchTemplateConfigs()

    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
     */
    override fun onDemandOptions(): Any? = unwrap(this).getOnDemandOptions()

    /**
     * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
     *
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances)
     */
    override fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
     */
    override fun spotOptions(): Any? = unwrap(this).getSpotOptions()

    /**
     * The key-value pair for tagging the EC2 Fleet request on creation. For more information, see
     * [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     *
     * If the fleet type is `instant` , specify a resource type of `fleet` to tag the fleet or
     * `instance` to tag the instances at launch.
     *
     * If the fleet type is `maintain` or `request` , specify a resource type of `fleet` to tag the
     * fleet. You cannot specify a resource type of `instance` . To tag instances at launch, specify
     * the tags in a [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-tagspecifications)
     */
    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * The number of units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
     */
    override fun targetCapacitySpecification(): Any = unwrap(this).getTargetCapacitySpecification()

    /**
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration)
     */
    override fun terminateInstancesWithExpiration(): Any? =
        unwrap(this).getTerminateInstancesWithExpiration()

    /**
     * The fleet type. The default value is `maintain` .
     *
     * * `maintain` - The EC2 Fleet places an asynchronous request for your desired capacity, and
     * continues to maintain your desired Spot capacity by replenishing interrupted Spot Instances.
     * * `request` - The EC2 Fleet places an asynchronous one-time request for your desired
     * capacity, but does submit Spot requests in alternative capacity pools if Spot capacity is
     * unavailable, and does not maintain Spot capacity if Spot Instances are interrupted.
     * * `instant` - The EC2 Fleet places a synchronous one-time request for your desired capacity,
     * and returns errors for any instances that could not be launched.
     *
     * For more information, see [EC2 Fleet request
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-request-type.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-type)
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * The start date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T
     * *HH* : *MM* : *SS* Z).
     *
     * The default is to start fulfilling the request immediately.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom)
     */
    override fun validFrom(): String? = unwrap(this).getValidFrom()

    /**
     * The end date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH*
     * : *MM* : *SS* Z).
     *
     * At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no
     * value is specified, the request remains until you cancel it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil)
     */
    override fun validUntil(): String? = unwrap(this).getValidUntil()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEC2FleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2FleetProps):
        CfnEC2FleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEC2FleetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEC2FleetProps):
        software.amazon.awscdk.services.ec2.CfnEC2FleetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnEC2FleetProps
  }
}
