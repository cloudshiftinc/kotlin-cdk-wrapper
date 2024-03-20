@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the configuration information to launch a fleet--or group--of instances.
 *
 * An EC2 Fleet can launch multiple instance types across multiple Availability Zones, using the
 * On-Demand Instance, Reserved Instance, and Spot Instance purchasing models together. Using EC2
 * Fleet, you can define separate On-Demand and Spot capacity targets, specify the instance types that
 * work best for your applications, and specify how Amazon EC2 should distribute your fleet capacity
 * within each purchasing model. For more information, see [Launching an EC2
 * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html) in the *Amazon EC2 User
 * Guide for Linux Instances* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnEC2Fleet cfnEC2Fleet = CfnEC2Fleet.Builder.create(this, "MyCfnEC2Fleet")
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
public open class CfnEC2Fleet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEC2FleetProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnEC2Fleet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEC2FleetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEC2FleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEC2FleetProps(props)
  )

  /**
   * The ID of the EC2 Fleet.
   */
  public open fun attrFleetId(): String = unwrap(this).getAttrFleetId()

  /**
   * Reserved.
   */
  public open fun context(): String? = unwrap(this).getContext()

  /**
   * Reserved.
   */
  public open fun context(`value`: String) {
    unwrap(this).setContext(`value`)
  }

  /**
   * Indicates whether running instances should be terminated if the total target capacity of the
   * EC2 Fleet is decreased below the current size of the EC2 Fleet.
   */
  public open fun excessCapacityTerminationPolicy(): String? =
      unwrap(this).getExcessCapacityTerminationPolicy()

  /**
   * Indicates whether running instances should be terminated if the total target capacity of the
   * EC2 Fleet is decreased below the current size of the EC2 Fleet.
   */
  public open fun excessCapacityTerminationPolicy(`value`: String) {
    unwrap(this).setExcessCapacityTerminationPolicy(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The configuration for the EC2 Fleet.
   */
  public open fun launchTemplateConfigs(): Any = unwrap(this).getLaunchTemplateConfigs()

  /**
   * The configuration for the EC2 Fleet.
   */
  public open fun launchTemplateConfigs(`value`: IResolvable) {
    unwrap(this).setLaunchTemplateConfigs(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration for the EC2 Fleet.
   */
  public open fun launchTemplateConfigs(`value`: List<Any>) {
    unwrap(this).setLaunchTemplateConfigs(`value`)
  }

  /**
   * The configuration for the EC2 Fleet.
   */
  public open fun launchTemplateConfigs(vararg `value`: Any): Unit =
      launchTemplateConfigs(`value`.toList())

  /**
   * Describes the configuration of On-Demand Instances in an EC2 Fleet.
   */
  public open fun onDemandOptions(): Any? = unwrap(this).getOnDemandOptions()

  /**
   * Describes the configuration of On-Demand Instances in an EC2 Fleet.
   */
  public open fun onDemandOptions(`value`: IResolvable) {
    unwrap(this).setOnDemandOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the configuration of On-Demand Instances in an EC2 Fleet.
   */
  public open fun onDemandOptions(`value`: OnDemandOptionsRequestProperty) {
    unwrap(this).setOnDemandOptions(`value`.let(OnDemandOptionsRequestProperty::unwrap))
  }

  /**
   * Describes the configuration of On-Demand Instances in an EC2 Fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa2dfda2abe9c01c64a6a12cff8cc21d844e72e641d359a0035d4d3e0958753a")
  public open fun onDemandOptions(`value`: OnDemandOptionsRequestProperty.Builder.() -> Unit): Unit
      = onDemandOptions(OnDemandOptionsRequestProperty(`value`))

  /**
   * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
   */
  public open fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

  /**
   * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
   */
  public open fun replaceUnhealthyInstances(`value`: Boolean) {
    unwrap(this).setReplaceUnhealthyInstances(`value`)
  }

  /**
   * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
   */
  public open fun replaceUnhealthyInstances(`value`: IResolvable) {
    unwrap(this).setReplaceUnhealthyInstances(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the configuration of Spot Instances in an EC2 Fleet.
   */
  public open fun spotOptions(): Any? = unwrap(this).getSpotOptions()

  /**
   * Describes the configuration of Spot Instances in an EC2 Fleet.
   */
  public open fun spotOptions(`value`: IResolvable) {
    unwrap(this).setSpotOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the configuration of Spot Instances in an EC2 Fleet.
   */
  public open fun spotOptions(`value`: SpotOptionsRequestProperty) {
    unwrap(this).setSpotOptions(`value`.let(SpotOptionsRequestProperty::unwrap))
  }

  /**
   * Describes the configuration of Spot Instances in an EC2 Fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5a0964b879cd5370e795221ca2d73ead1348dc08d9dcd14b21c16f57df95ec6f")
  public open fun spotOptions(`value`: SpotOptionsRequestProperty.Builder.() -> Unit): Unit =
      spotOptions(SpotOptionsRequestProperty(`value`))

  /**
   * The key-value pair for tagging the EC2 Fleet request on creation.
   *
   * For more information, see [Tag your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   */
  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The key-value pair for tagging the EC2 Fleet request on creation.
   *
   * For more information, see [Tag your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   */
  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The key-value pair for tagging the EC2 Fleet request on creation.
   *
   * For more information, see [Tag your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   */
  public open fun tagSpecifications(`value`: List<Any>) {
    unwrap(this).setTagSpecifications(`value`)
  }

  /**
   * The key-value pair for tagging the EC2 Fleet request on creation.
   *
   * For more information, see [Tag your
   * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
   */
  public open fun tagSpecifications(vararg `value`: Any): Unit = tagSpecifications(`value`.toList())

  /**
   * The number of units to request.
   */
  public open fun targetCapacitySpecification(): Any = unwrap(this).getTargetCapacitySpecification()

  /**
   * The number of units to request.
   */
  public open fun targetCapacitySpecification(`value`: IResolvable) {
    unwrap(this).setTargetCapacitySpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The number of units to request.
   */
  public open fun targetCapacitySpecification(`value`: TargetCapacitySpecificationRequestProperty) {
    unwrap(this).setTargetCapacitySpecification(`value`.let(TargetCapacitySpecificationRequestProperty::unwrap))
  }

  /**
   * The number of units to request.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82e634fca018886fa633356bdc133a07b389a5e9da55081aed53368d52ecbf20")
  public open
      fun targetCapacitySpecification(`value`: TargetCapacitySpecificationRequestProperty.Builder.() -> Unit):
      Unit = targetCapacitySpecification(TargetCapacitySpecificationRequestProperty(`value`))

  /**
   * Indicates whether running instances should be terminated when the EC2 Fleet expires.
   */
  public open fun terminateInstancesWithExpiration(): Any? =
      unwrap(this).getTerminateInstancesWithExpiration()

  /**
   * Indicates whether running instances should be terminated when the EC2 Fleet expires.
   */
  public open fun terminateInstancesWithExpiration(`value`: Boolean) {
    unwrap(this).setTerminateInstancesWithExpiration(`value`)
  }

  /**
   * Indicates whether running instances should be terminated when the EC2 Fleet expires.
   */
  public open fun terminateInstancesWithExpiration(`value`: IResolvable) {
    unwrap(this).setTerminateInstancesWithExpiration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The fleet type.
   *
   * The default value is `maintain` .
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The fleet type.
   *
   * The default value is `maintain` .
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The start date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH*
   * : *MM* : *SS* Z).
   */
  public open fun validFrom(): String? = unwrap(this).getValidFrom()

  /**
   * The start date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH*
   * : *MM* : *SS* Z).
   */
  public open fun validFrom(`value`: String) {
    unwrap(this).setValidFrom(`value`)
  }

  /**
   * The end date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH* :
   * *MM* : *SS* Z).
   */
  public open fun validUntil(): String? = unwrap(this).getValidUntil()

  /**
   * The end date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH* :
   * *MM* : *SS* Z).
   */
  public open fun validUntil(`value`: String) {
    unwrap(this).setValidUntil(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnEC2Fleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-context)
     * @param context Reserved. 
     */
    public fun context(context: String)

    /**
     * Indicates whether running instances should be terminated if the total target capacity of the
     * EC2 Fleet is decreased below the current size of the EC2 Fleet.
     *
     * Supported only for fleets of type `maintain` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy)
     * @param excessCapacityTerminationPolicy Indicates whether running instances should be
     * terminated if the total target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet. 
     */
    public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String)

    /**
     * The configuration for the EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable)

    /**
     * The configuration for the EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    public fun launchTemplateConfigs(launchTemplateConfigs: List<Any>)

    /**
     * The configuration for the EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any)

    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet. 
     */
    public fun onDemandOptions(onDemandOptions: IResolvable)

    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet. 
     */
    public fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty)

    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6685d56f0e1de435cdbe8fcee9802e7b365e56c0f39b379f5904ed1415e96303")
    public fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty.Builder.() -> Unit)

    /**
     * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
     *
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances)
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances. 
     */
    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean)

    /**
     * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
     *
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances)
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances. 
     */
    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable)

    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet. 
     */
    public fun spotOptions(spotOptions: IResolvable)

    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet. 
     */
    public fun spotOptions(spotOptions: SpotOptionsRequestProperty)

    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ebd98aa70c64aeb4662d1d346071a23aa61765a886bfc40a56f4c0036b5375a")
    public fun spotOptions(spotOptions: SpotOptionsRequestProperty.Builder.() -> Unit)

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
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) . 
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

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
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) . 
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

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
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) . 
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * The number of units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
     * @param targetCapacitySpecification The number of units to request. 
     */
    public fun targetCapacitySpecification(targetCapacitySpecification: IResolvable)

    /**
     * The number of units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
     * @param targetCapacitySpecification The number of units to request. 
     */
    public
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty)

    /**
     * The number of units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
     * @param targetCapacitySpecification The number of units to request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee757ffc0432fc2249e84757321dd9bdd60a27a1b6dd7c8f1c58ef26587184b7")
    public
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty.Builder.() -> Unit)

    /**
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration)
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires. 
     */
    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean)

    /**
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration)
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires. 
     */
    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable)

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
     * @param type The fleet type. The default value is `maintain` . 
     */
    public fun type(type: String)

    /**
     * The start date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T
     * *HH* : *MM* : *SS* Z).
     *
     * The default is to start fulfilling the request immediately.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom)
     * @param validFrom The start date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z). 
     */
    public fun validFrom(validFrom: String)

    /**
     * The end date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH*
     * : *MM* : *SS* Z).
     *
     * At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no
     * value is specified, the request remains until you cancel it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil)
     * @param validUntil The end date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z). 
     */
    public fun validUntil(validUntil: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEC2Fleet.Builder =
        software.amazon.awscdk.services.ec2.CfnEC2Fleet.Builder.create(scope, id)

    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-context)
     * @param context Reserved. 
     */
    override fun context(context: String) {
      cdkBuilder.context(context)
    }

    /**
     * Indicates whether running instances should be terminated if the total target capacity of the
     * EC2 Fleet is decreased below the current size of the EC2 Fleet.
     *
     * Supported only for fleets of type `maintain` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy)
     * @param excessCapacityTerminationPolicy Indicates whether running instances should be
     * terminated if the total target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet. 
     */
    override fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
      cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
    }

    /**
     * The configuration for the EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    override fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs.let(IResolvable::unwrap))
    }

    /**
     * The configuration for the EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    override fun launchTemplateConfigs(launchTemplateConfigs: List<Any>) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
    }

    /**
     * The configuration for the EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs)
     * @param launchTemplateConfigs The configuration for the EC2 Fleet. 
     */
    override fun launchTemplateConfigs(vararg launchTemplateConfigs: Any): Unit =
        launchTemplateConfigs(launchTemplateConfigs.toList())

    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet. 
     */
    override fun onDemandOptions(onDemandOptions: IResolvable) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(IResolvable::unwrap))
    }

    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet. 
     */
    override fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(OnDemandOptionsRequestProperty::unwrap))
    }

    /**
     * Describes the configuration of On-Demand Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-ondemandoptions)
     * @param onDemandOptions Describes the configuration of On-Demand Instances in an EC2 Fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6685d56f0e1de435cdbe8fcee9802e7b365e56c0f39b379f5904ed1415e96303")
    override
        fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty.Builder.() -> Unit):
        Unit = onDemandOptions(OnDemandOptionsRequestProperty(onDemandOptions))

    /**
     * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
     *
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances)
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances. 
     */
    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
    }

    /**
     * Indicates whether EC2 Fleet should replace unhealthy Spot Instances.
     *
     * Supported only for fleets of type `maintain` . For more information, see [EC2 Fleet health
     * checks](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances)
     * @param replaceUnhealthyInstances Indicates whether EC2 Fleet should replace unhealthy Spot
     * Instances. 
     */
    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances.let(IResolvable::unwrap))
    }

    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet. 
     */
    override fun spotOptions(spotOptions: IResolvable) {
      cdkBuilder.spotOptions(spotOptions.let(IResolvable::unwrap))
    }

    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet. 
     */
    override fun spotOptions(spotOptions: SpotOptionsRequestProperty) {
      cdkBuilder.spotOptions(spotOptions.let(SpotOptionsRequestProperty::unwrap))
    }

    /**
     * Describes the configuration of Spot Instances in an EC2 Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-spotoptions)
     * @param spotOptions Describes the configuration of Spot Instances in an EC2 Fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ebd98aa70c64aeb4662d1d346071a23aa61765a886bfc40a56f4c0036b5375a")
    override fun spotOptions(spotOptions: SpotOptionsRequestProperty.Builder.() -> Unit): Unit =
        spotOptions(SpotOptionsRequestProperty(spotOptions))

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
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) . 
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

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
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) . 
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

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
     * @param tagSpecifications The key-value pair for tagging the EC2 Fleet request on creation.
     * For more information, see [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) . 
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * The number of units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
     * @param targetCapacitySpecification The number of units to request. 
     */
    override fun targetCapacitySpecification(targetCapacitySpecification: IResolvable) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(IResolvable::unwrap))
    }

    /**
     * The number of units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
     * @param targetCapacitySpecification The number of units to request. 
     */
    override
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(TargetCapacitySpecificationRequestProperty::unwrap))
    }

    /**
     * The number of units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-targetcapacityspecification)
     * @param targetCapacitySpecification The number of units to request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee757ffc0432fc2249e84757321dd9bdd60a27a1b6dd7c8f1c58ef26587184b7")
    override
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty.Builder.() -> Unit):
        Unit =
        targetCapacitySpecification(TargetCapacitySpecificationRequestProperty(targetCapacitySpecification))

    /**
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration)
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires. 
     */
    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
    }

    /**
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration)
     * @param terminateInstancesWithExpiration Indicates whether running instances should be
     * terminated when the EC2 Fleet expires. 
     */
    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration.let(IResolvable::unwrap))
    }

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
     * @param type The fleet type. The default value is `maintain` . 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The start date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T
     * *HH* : *MM* : *SS* Z).
     *
     * The default is to start fulfilling the request immediately.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom)
     * @param validFrom The start date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z). 
     */
    override fun validFrom(validFrom: String) {
      cdkBuilder.validFrom(validFrom)
    }

    /**
     * The end date and time of the request, in UTC format (for example, *YYYY* - *MM* - *DD* T *HH*
     * : *MM* : *SS* Z).
     *
     * At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no
     * value is specified, the request remains until you cancel it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil)
     * @param validUntil The end date and time of the request, in UTC format (for example, *YYYY* -
     * *MM* - *DD* T *HH* : *MM* : *SS* Z). 
     */
    override fun validUntil(validUntil: String) {
      cdkBuilder.validUntil(validUntil)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnEC2Fleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEC2Fleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEC2Fleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet): CfnEC2Fleet =
        CfnEC2Fleet(cdkObject)

    internal fun unwrap(wrapped: CfnEC2Fleet): software.amazon.awscdk.services.ec2.CfnEC2Fleet =
        wrapped.cdkObject
  }

  /**
   * Specifies the number of units to request for an EC2 Fleet.
   *
   * You can choose to set the target capacity in terms of instances or a performance characteristic
   * that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
   * is `maintain` , you can specify a target capacity of `0` and add capacity later.
   *
   * `TargetCapacitySpecificationRequest` is a property of the
   * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TargetCapacitySpecificationRequestProperty targetCapacitySpecificationRequestProperty =
   * TargetCapacitySpecificationRequestProperty.builder()
   * .totalTargetCapacity(123)
   * // the properties below are optional
   * .defaultTargetCapacityType("defaultTargetCapacityType")
   * .onDemandTargetCapacity(123)
   * .spotTargetCapacity(123)
   * .targetCapacityUnitType("targetCapacityUnitType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html)
   */
  public interface TargetCapacitySpecificationRequestProperty {
    /**
     * The default target capacity type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-defaulttargetcapacitytype)
     */
    public fun defaultTargetCapacityType(): String? = unwrap(this).getDefaultTargetCapacityType()

    /**
     * The number of On-Demand units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity)
     */
    public fun onDemandTargetCapacity(): Number? = unwrap(this).getOnDemandTargetCapacity()

    /**
     * The number of Spot units to request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity)
     */
    public fun spotTargetCapacity(): Number? = unwrap(this).getSpotTargetCapacity()

    /**
     * The unit for the target capacity. You can specify this parameter only when using
     * attributed-based instance type selection.
     *
     * Default: `units` (the number of instances)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-targetcapacityunittype)
     */
    public fun targetCapacityUnitType(): String? = unwrap(this).getTargetCapacityUnitType()

    /**
     * The number of units to request, filled using the default target capacity type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity)
     */
    public fun totalTargetCapacity(): Number

    /**
     * A builder for [TargetCapacitySpecificationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultTargetCapacityType The default target capacity type.
       */
      public fun defaultTargetCapacityType(defaultTargetCapacityType: String)

      /**
       * @param onDemandTargetCapacity The number of On-Demand units to request.
       */
      public fun onDemandTargetCapacity(onDemandTargetCapacity: Number)

      /**
       * @param spotTargetCapacity The number of Spot units to request.
       */
      public fun spotTargetCapacity(spotTargetCapacity: Number)

      /**
       * @param targetCapacityUnitType The unit for the target capacity. You can specify this
       * parameter only when using attributed-based instance type selection.
       * Default: `units` (the number of instances)
       */
      public fun targetCapacityUnitType(targetCapacityUnitType: String)

      /**
       * @param totalTargetCapacity The number of units to request, filled using the default target
       * capacity type. 
       */
      public fun totalTargetCapacity(totalTargetCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.builder()

      /**
       * @param defaultTargetCapacityType The default target capacity type.
       */
      override fun defaultTargetCapacityType(defaultTargetCapacityType: String) {
        cdkBuilder.defaultTargetCapacityType(defaultTargetCapacityType)
      }

      /**
       * @param onDemandTargetCapacity The number of On-Demand units to request.
       */
      override fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
        cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
      }

      /**
       * @param spotTargetCapacity The number of Spot units to request.
       */
      override fun spotTargetCapacity(spotTargetCapacity: Number) {
        cdkBuilder.spotTargetCapacity(spotTargetCapacity)
      }

      /**
       * @param targetCapacityUnitType The unit for the target capacity. You can specify this
       * parameter only when using attributed-based instance type selection.
       * Default: `units` (the number of instances)
       */
      override fun targetCapacityUnitType(targetCapacityUnitType: String) {
        cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
      }

      /**
       * @param totalTargetCapacity The number of units to request, filled using the default target
       * capacity type. 
       */
      override fun totalTargetCapacity(totalTargetCapacity: Number) {
        cdkBuilder.totalTargetCapacity(totalTargetCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty,
    ) : CdkObject(cdkObject), TargetCapacitySpecificationRequestProperty {
      /**
       * The default target capacity type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-defaulttargetcapacitytype)
       */
      override fun defaultTargetCapacityType(): String? =
          unwrap(this).getDefaultTargetCapacityType()

      /**
       * The number of On-Demand units to request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity)
       */
      override fun onDemandTargetCapacity(): Number? = unwrap(this).getOnDemandTargetCapacity()

      /**
       * The number of Spot units to request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity)
       */
      override fun spotTargetCapacity(): Number? = unwrap(this).getSpotTargetCapacity()

      /**
       * The unit for the target capacity. You can specify this parameter only when using
       * attributed-based instance type selection.
       *
       * Default: `units` (the number of instances)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-targetcapacityunittype)
       */
      override fun targetCapacityUnitType(): String? = unwrap(this).getTargetCapacityUnitType()

      /**
       * The number of units to request, filled using the default target capacity type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity)
       */
      override fun totalTargetCapacity(): Number = unwrap(this).getTotalTargetCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetCapacitySpecificationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty):
          TargetCapacitySpecificationRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetCapacitySpecificationRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetCapacitySpecificationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty
    }
  }

  /**
   * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
   * instance.
   *
   * To exclude accelerator-enabled instance types, set `Max` to `0` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AcceleratorCountRequestProperty acceleratorCountRequestProperty =
   * AcceleratorCountRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratorcountrequest.html)
   */
  public interface AcceleratorCountRequestProperty {
    /**
     * The maximum number of accelerators.
     *
     * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
     * types, set `Max` to `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratorcountrequest.html#cfn-ec2-ec2fleet-acceleratorcountrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of accelerators.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratorcountrequest.html#cfn-ec2-ec2fleet-acceleratorcountrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [AcceleratorCountRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of accelerators.
       * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
       * types, set `Max` to `0` .
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of accelerators.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty.builder()

      /**
       * @param max The maximum number of accelerators.
       * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
       * types, set `Max` to `0` .
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of accelerators.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty,
    ) : CdkObject(cdkObject), AcceleratorCountRequestProperty {
      /**
       * The maximum number of accelerators.
       *
       * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
       * types, set `Max` to `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratorcountrequest.html#cfn-ec2-ec2fleet-acceleratorcountrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of accelerators.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratorcountrequest.html#cfn-ec2-ec2fleet-acceleratorcountrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty):
          AcceleratorCountRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AcceleratorCountRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty
    }
  }

  /**
   * Specifies the tags to apply to a resource when the resource is being created for an EC2 Fleet.
   *
   * `TagSpecification` is a property of the
   * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html)
   */
  public interface TagSpecificationProperty {
    /**
     * The type of resource to tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [TagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType The type of resource to tag.
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty.builder()

      /**
       * @param resourceType The type of resource to tag.
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty,
    ) : CdkObject(cdkObject), TagSpecificationProperty {
      /**
       * The type of resource to tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The tags to apply to the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty):
          TagSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? TagSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty
    }
  }

  /**
   * Specifies overrides for a launch template for an EC2 Fleet.
   *
   * `FleetLaunchTemplateOverridesRequest` is a property of the
   * [FleetLaunchTemplateConfigRequest](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * FleetLaunchTemplateOverridesRequestProperty fleetLaunchTemplateOverridesRequestProperty =
   * FleetLaunchTemplateOverridesRequestProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html)
   */
  public interface FleetLaunchTemplateOverridesRequestProperty {
    /**
     * The Availability Zone in which to launch the instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The attributes for the instance types.
     *
     * When you specify instance attributes, Amazon EC2 will identify instance types with those
     * attributes.
     *
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancerequirements)
     */
    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    /**
     * The instance type.
     *
     * `mac1.metal` is not supported as a launch template override.
     *
     *
     * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     *
     * We do not recommend using this parameter because it can lead to increased interruptions. If
     * you do not specify this parameter, you will pay the current Spot price.
     *
     *
     * If you specify a maximum price, your instances will be interrupted more frequently than if
     * you do not specify this parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-maxprice)
     */
    public fun maxPrice(): String? = unwrap(this).getMaxPrice()

    /**
     * The location where the instance launched, if applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-placement)
     */
    public fun placement(): Any? = unwrap(this).getPlacement()

    /**
     * The priority for the launch template override. The highest priority is launched first.
     *
     * If the On-Demand `AllocationStrategy` is set to `prioritized` , EC2 Fleet uses priority to
     * determine which launch template override to use first in fulfilling On-Demand capacity.
     *
     * If the Spot `AllocationStrategy` is set to `capacity-optimized-prioritized` , EC2 Fleet uses
     * priority on a best-effort basis to determine which launch template override to use in fulfilling
     * Spot capacity, but optimizes for capacity first.
     *
     * Valid values are whole numbers starting at `0` . The lower the number, the higher the
     * priority. If no number is set, the launch template override has the lowest priority. You can set
     * the same priority for different launch template overrides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The IDs of the subnets in which to launch the instances.
     *
     * Separate multiple subnet IDs using commas (for example, `subnet-1234abcdeexample1,
     * subnet-0987cdef6example2` ). A request of type `instant` can have only one subnet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The number of units provided by the specified instance type.
     *
     *
     * When specifying weights, the price used in the `lowest-price` and `price-capacity-optimized`
     * allocation strategies is per *unit* hour (where the instance price is divided by the specified
     * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
     * resulting in only 1 instance being launched, the price used is per *instance* hour.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-weightedcapacity)
     */
    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [FleetLaunchTemplateOverridesRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone in which to launch the instances.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with those
       * attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      public fun instanceRequirements(instanceRequirements: IResolvable)

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with those
       * attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      public fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty)

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with those
       * attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99a0b1cb554d9f79e3533a2feeae208040c090771703fe72d9e217cdb3371d2f")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit)

      /**
       * @param instanceType The instance type.
       * `mac1.metal` is not supported as a launch template override.
       *
       *
       * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
       */
      public fun instanceType(instanceType: String)

      /**
       * @param maxPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      public fun maxPrice(maxPrice: String)

      /**
       * @param placement The location where the instance launched, if applicable.
       */
      public fun placement(placement: IResolvable)

      /**
       * @param placement The location where the instance launched, if applicable.
       */
      public fun placement(placement: PlacementProperty)

      /**
       * @param placement The location where the instance launched, if applicable.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9152d63c4d2134d1a71fc402152824819c952050ebe311f8e289c81397631e")
      public fun placement(placement: PlacementProperty.Builder.() -> Unit)

      /**
       * @param priority The priority for the launch template override. The highest priority is
       * launched first.
       * If the On-Demand `AllocationStrategy` is set to `prioritized` , EC2 Fleet uses priority to
       * determine which launch template override to use first in fulfilling On-Demand capacity.
       *
       * If the Spot `AllocationStrategy` is set to `capacity-optimized-prioritized` , EC2 Fleet
       * uses priority on a best-effort basis to determine which launch template override to use in
       * fulfilling Spot capacity, but optimizes for capacity first.
       *
       * Valid values are whole numbers starting at `0` . The lower the number, the higher the
       * priority. If no number is set, the launch template override has the lowest priority. You can
       * set the same priority for different launch template overrides.
       */
      public fun priority(priority: Number)

      /**
       * @param subnetId The IDs of the subnets in which to launch the instances.
       * Separate multiple subnet IDs using commas (for example, `subnet-1234abcdeexample1,
       * subnet-0987cdef6example2` ). A request of type `instant` can have only one subnet ID.
       */
      public fun subnetId(subnetId: String)

      /**
       * @param weightedCapacity The number of units provided by the specified instance type.
       *
       * When specifying weights, the price used in the `lowest-price` and
       * `price-capacity-optimized` allocation strategies is per *unit* hour (where the instance price
       * is divided by the specified weight). However, if all the specified weights are above the
       * requested `TargetCapacity` , resulting in only 1 instance being launched, the price used is
       * per *instance* hour.
       */
      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.builder()

      /**
       * @param availabilityZone The Availability Zone in which to launch the instances.
       */
      override fun availabilityZone(availabilityZone: String) {
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
      override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with those
       * attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      override fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsRequestProperty::unwrap))
      }

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with those
       * attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99a0b1cb554d9f79e3533a2feeae208040c090771703fe72d9e217cdb3371d2f")
      override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsRequestProperty(instanceRequirements))

      /**
       * @param instanceType The instance type.
       * `mac1.metal` is not supported as a launch template override.
       *
       *
       * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param maxPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      override fun maxPrice(maxPrice: String) {
        cdkBuilder.maxPrice(maxPrice)
      }

      /**
       * @param placement The location where the instance launched, if applicable.
       */
      override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable::unwrap))
      }

      /**
       * @param placement The location where the instance launched, if applicable.
       */
      override fun placement(placement: PlacementProperty) {
        cdkBuilder.placement(placement.let(PlacementProperty::unwrap))
      }

      /**
       * @param placement The location where the instance launched, if applicable.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9152d63c4d2134d1a71fc402152824819c952050ebe311f8e289c81397631e")
      override fun placement(placement: PlacementProperty.Builder.() -> Unit): Unit =
          placement(PlacementProperty(placement))

      /**
       * @param priority The priority for the launch template override. The highest priority is
       * launched first.
       * If the On-Demand `AllocationStrategy` is set to `prioritized` , EC2 Fleet uses priority to
       * determine which launch template override to use first in fulfilling On-Demand capacity.
       *
       * If the Spot `AllocationStrategy` is set to `capacity-optimized-prioritized` , EC2 Fleet
       * uses priority on a best-effort basis to determine which launch template override to use in
       * fulfilling Spot capacity, but optimizes for capacity first.
       *
       * Valid values are whole numbers starting at `0` . The lower the number, the higher the
       * priority. If no number is set, the launch template override has the lowest priority. You can
       * set the same priority for different launch template overrides.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param subnetId The IDs of the subnets in which to launch the instances.
       * Separate multiple subnet IDs using commas (for example, `subnet-1234abcdeexample1,
       * subnet-0987cdef6example2` ). A request of type `instant` can have only one subnet ID.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      /**
       * @param weightedCapacity The number of units provided by the specified instance type.
       *
       * When specifying weights, the price used in the `lowest-price` and
       * `price-capacity-optimized` allocation strategies is per *unit* hour (where the instance price
       * is divided by the specified weight). However, if all the specified weights are above the
       * requested `TargetCapacity` , resulting in only 1 instance being launched, the price used is
       * per *instance* hour.
       */
      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty,
    ) : CdkObject(cdkObject), FleetLaunchTemplateOverridesRequestProperty {
      /**
       * The Availability Zone in which to launch the instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The attributes for the instance types.
       *
       * When you specify instance attributes, Amazon EC2 will identify instance types with those
       * attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancerequirements)
       */
      override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      /**
       * The instance type.
       *
       * `mac1.metal` is not supported as a launch template override.
       *
       *
       * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The maximum price per unit hour that you are willing to pay for a Spot Instance.
       *
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-maxprice)
       */
      override fun maxPrice(): String? = unwrap(this).getMaxPrice()

      /**
       * The location where the instance launched, if applicable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-placement)
       */
      override fun placement(): Any? = unwrap(this).getPlacement()

      /**
       * The priority for the launch template override. The highest priority is launched first.
       *
       * If the On-Demand `AllocationStrategy` is set to `prioritized` , EC2 Fleet uses priority to
       * determine which launch template override to use first in fulfilling On-Demand capacity.
       *
       * If the Spot `AllocationStrategy` is set to `capacity-optimized-prioritized` , EC2 Fleet
       * uses priority on a best-effort basis to determine which launch template override to use in
       * fulfilling Spot capacity, but optimizes for capacity first.
       *
       * Valid values are whole numbers starting at `0` . The lower the number, the higher the
       * priority. If no number is set, the launch template override has the lowest priority. You can
       * set the same priority for different launch template overrides.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

      /**
       * The IDs of the subnets in which to launch the instances.
       *
       * Separate multiple subnet IDs using commas (for example, `subnet-1234abcdeexample1,
       * subnet-0987cdef6example2` ). A request of type `instant` can have only one subnet ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()

      /**
       * The number of units provided by the specified instance type.
       *
       *
       * When specifying weights, the price used in the `lowest-price` and
       * `price-capacity-optimized` allocation strategies is per *unit* hour (where the instance price
       * is divided by the specified weight). However, if all the specified weights are above the
       * requested `TargetCapacity` , resulting in only 1 instance being launched, the price used is
       * per *instance* hour.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-weightedcapacity)
       */
      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateOverridesRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty):
          FleetLaunchTemplateOverridesRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetLaunchTemplateOverridesRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateOverridesRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty
    }
  }

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
   * import io.cloudshiftdev.awscdk.services.ec2.*;
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
  public interface SpotOptionsRequestProperty {
    /**
     * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools
     * specified by the EC2 Fleet.
     *
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-allocationstrategy)
     */
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * The behavior when a Spot Instance is interrupted.
     *
     * Default: `terminate`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instanceinterruptionbehavior)
     */
    public fun instanceInterruptionBehavior(): String? =
        unwrap(this).getInstanceInterruptionBehavior()

    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     *
     * Supported only when Spot `AllocationStrategy` is set to `lowest-price` . EC2 Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     *
     * Note that EC2 Fleet attempts to draw Spot Instances from the number of pools that you specify
     * on a best effort basis. If a pool runs out of Spot capacity before fulfilling your target
     * capacity, EC2 Fleet will continue to fulfill your request by drawing from the next cheapest
     * pool. To ensure that your target capacity is met, you might receive Spot Instances from more
     * than the number of pools that you specified. Similarly, if most of the pools have no Spot
     * capacity, you might receive your full target capacity from fewer than the number of pools that
     * you specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instancepoolstousecount)
     */
    public fun instancePoolsToUseCount(): Number? = unwrap(this).getInstancePoolsToUseCount()

    /**
     * The strategies for managing your Spot Instances that are at an elevated risk of being
     * interrupted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maintenancestrategies)
     */
    public fun maintenanceStrategies(): Any? = unwrap(this).getMaintenanceStrategies()

    /**
     * The maximum amount per hour for Spot Instances that you're willing to pay.
     *
     * We do not recommend using this parameter because it can lead to increased interruptions. If
     * you do not specify this parameter, you will pay the current Spot price.
     *
     *
     * If you specify a maximum price, your Spot Instances will be interrupted more frequently than
     * if you do not specify this parameter. &gt; If your fleet includes T instances that are
     * configured as `unlimited` , and if their average CPU usage exceeds the baseline utilization, you
     * will incur a charge for surplus credits. The `MaxTotalPrice` does not account for surplus
     * credits, and, if you use surplus credits, your final cost might be higher than what you
     * specified for `MaxTotalPrice` . For more information, see [Surplus credits can incur
     * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
     * in the *EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maxtotalprice)
     */
    public fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

    /**
     * The minimum target capacity for Spot Instances in the fleet.
     *
     * If the minimum target capacity is not reached, the fleet launches no instances.
     *
     * Supported only for fleets of type `instant` .
     *
     * At least one of the following must be specified: `SingleAvailabilityZone` |
     * `SingleInstanceType`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-mintargetcapacity)
     */
    public fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

    /**
     * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     *
     * Supported only for fleets of type `instant` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleavailabilityzone)
     */
    public fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

    /**
     * Indicates that the fleet uses a single instance type to launch all Spot Instances in the
     * fleet.
     *
     * Supported only for fleets of type `instant` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleinstancetype)
     */
    public fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()

    /**
     * A builder for [SpotOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy Indicates how to allocate the target Spot Instance capacity
       * across the Spot Instance pools specified by the EC2 Fleet.
       * If the allocation strategy is `lowestPrice` , EC2 Fleet launches instances from the Spot
       * Instance pools with the lowest price. This is the default allocation strategy.
       *
       * If the allocation strategy is `diversified` , EC2 Fleet launches instances from all the
       * Spot Instance pools that you specify.
       *
       * If the allocation strategy is `capacityOptimized` , EC2 Fleet launches instances from Spot
       * Instance pools that are optimally chosen based on the available Spot Instance capacity.
       *
       * *Allowed Values* : `lowestPrice` | `diversified` | `capacityOptimized` |
       * `capacityOptimizedPrioritized`
       */
      public fun allocationStrategy(allocationStrategy: String)

      /**
       * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
       * Default: `terminate`
       */
      public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String)

      /**
       * @param instancePoolsToUseCount The number of Spot pools across which to allocate your
       * target Spot capacity.
       * Supported only when Spot `AllocationStrategy` is set to `lowest-price` . EC2 Fleet selects
       * the cheapest Spot pools and evenly allocates your target Spot capacity across the number of
       * Spot pools that you specify.
       *
       * Note that EC2 Fleet attempts to draw Spot Instances from the number of pools that you
       * specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your
       * target capacity, EC2 Fleet will continue to fulfill your request by drawing from the next
       * cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances
       * from more than the number of pools that you specified. Similarly, if most of the pools have no
       * Spot capacity, you might receive your full target capacity from fewer than the number of pools
       * that you specified.
       */
      public fun instancePoolsToUseCount(instancePoolsToUseCount: Number)

      /**
       * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
       * elevated risk of being interrupted.
       */
      public fun maintenanceStrategies(maintenanceStrategies: IResolvable)

      /**
       * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
       * elevated risk of being interrupted.
       */
      public fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty)

      /**
       * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
       * elevated risk of being interrupted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500ef6316a62131118ebc42fa82a07abcb3210ee9a5942fa639e876b95154539")
      public
          fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty.Builder.() -> Unit)

      /**
       * @param maxTotalPrice The maximum amount per hour for Spot Instances that you're willing to
       * pay.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your Spot Instances will be interrupted more frequently
       * than if you do not specify this parameter. &gt; If your fleet includes T instances that are
       * configured as `unlimited` , and if their average CPU usage exceeds the baseline utilization,
       * you will incur a charge for surplus credits. The `MaxTotalPrice` does not account for surplus
       * credits, and, if you use surplus credits, your final cost might be higher than what you
       * specified for `MaxTotalPrice` . For more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *EC2 User Guide* .
       */
      public fun maxTotalPrice(maxTotalPrice: String)

      /**
       * @param minTargetCapacity The minimum target capacity for Spot Instances in the fleet.
       * If the minimum target capacity is not reached, the fleet launches no instances.
       *
       * Supported only for fleets of type `instant` .
       *
       * At least one of the following must be specified: `SingleAvailabilityZone` |
       * `SingleInstanceType`
       */
      public fun minTargetCapacity(minTargetCapacity: Number)

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all Spot Instances into a
       * single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      public fun singleAvailabilityZone(singleAvailabilityZone: Boolean)

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all Spot Instances into a
       * single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable)

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all Spot Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      public fun singleInstanceType(singleInstanceType: Boolean)

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all Spot Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      public fun singleInstanceType(singleInstanceType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty.builder()

      /**
       * @param allocationStrategy Indicates how to allocate the target Spot Instance capacity
       * across the Spot Instance pools specified by the EC2 Fleet.
       * If the allocation strategy is `lowestPrice` , EC2 Fleet launches instances from the Spot
       * Instance pools with the lowest price. This is the default allocation strategy.
       *
       * If the allocation strategy is `diversified` , EC2 Fleet launches instances from all the
       * Spot Instance pools that you specify.
       *
       * If the allocation strategy is `capacityOptimized` , EC2 Fleet launches instances from Spot
       * Instance pools that are optimally chosen based on the available Spot Instance capacity.
       *
       * *Allowed Values* : `lowestPrice` | `diversified` | `capacityOptimized` |
       * `capacityOptimizedPrioritized`
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      /**
       * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
       * Default: `terminate`
       */
      override fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
      }

      /**
       * @param instancePoolsToUseCount The number of Spot pools across which to allocate your
       * target Spot capacity.
       * Supported only when Spot `AllocationStrategy` is set to `lowest-price` . EC2 Fleet selects
       * the cheapest Spot pools and evenly allocates your target Spot capacity across the number of
       * Spot pools that you specify.
       *
       * Note that EC2 Fleet attempts to draw Spot Instances from the number of pools that you
       * specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your
       * target capacity, EC2 Fleet will continue to fulfill your request by drawing from the next
       * cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances
       * from more than the number of pools that you specified. Similarly, if most of the pools have no
       * Spot capacity, you might receive your full target capacity from fewer than the number of pools
       * that you specified.
       */
      override fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
        cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
      }

      /**
       * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
       * elevated risk of being interrupted.
       */
      override fun maintenanceStrategies(maintenanceStrategies: IResolvable) {
        cdkBuilder.maintenanceStrategies(maintenanceStrategies.let(IResolvable::unwrap))
      }

      /**
       * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
       * elevated risk of being interrupted.
       */
      override fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty) {
        cdkBuilder.maintenanceStrategies(maintenanceStrategies.let(MaintenanceStrategiesProperty::unwrap))
      }

      /**
       * @param maintenanceStrategies The strategies for managing your Spot Instances that are at an
       * elevated risk of being interrupted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500ef6316a62131118ebc42fa82a07abcb3210ee9a5942fa639e876b95154539")
      override
          fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty.Builder.() -> Unit):
          Unit = maintenanceStrategies(MaintenanceStrategiesProperty(maintenanceStrategies))

      /**
       * @param maxTotalPrice The maximum amount per hour for Spot Instances that you're willing to
       * pay.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your Spot Instances will be interrupted more frequently
       * than if you do not specify this parameter. &gt; If your fleet includes T instances that are
       * configured as `unlimited` , and if their average CPU usage exceeds the baseline utilization,
       * you will incur a charge for surplus credits. The `MaxTotalPrice` does not account for surplus
       * credits, and, if you use surplus credits, your final cost might be higher than what you
       * specified for `MaxTotalPrice` . For more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *EC2 User Guide* .
       */
      override fun maxTotalPrice(maxTotalPrice: String) {
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
      override fun minTargetCapacity(minTargetCapacity: Number) {
        cdkBuilder.minTargetCapacity(minTargetCapacity)
      }

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all Spot Instances into a
       * single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      override fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
      }

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all Spot Instances into a
       * single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      override fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone.let(IResolvable::unwrap))
      }

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all Spot Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      override fun singleInstanceType(singleInstanceType: Boolean) {
        cdkBuilder.singleInstanceType(singleInstanceType)
      }

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all Spot Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      override fun singleInstanceType(singleInstanceType: IResolvable) {
        cdkBuilder.singleInstanceType(singleInstanceType.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty,
    ) : CdkObject(cdkObject), SpotOptionsRequestProperty {
      /**
       * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools
       * specified by the EC2 Fleet.
       *
       * If the allocation strategy is `lowestPrice` , EC2 Fleet launches instances from the Spot
       * Instance pools with the lowest price. This is the default allocation strategy.
       *
       * If the allocation strategy is `diversified` , EC2 Fleet launches instances from all the
       * Spot Instance pools that you specify.
       *
       * If the allocation strategy is `capacityOptimized` , EC2 Fleet launches instances from Spot
       * Instance pools that are optimally chosen based on the available Spot Instance capacity.
       *
       * *Allowed Values* : `lowestPrice` | `diversified` | `capacityOptimized` |
       * `capacityOptimizedPrioritized`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-allocationstrategy)
       */
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      /**
       * The behavior when a Spot Instance is interrupted.
       *
       * Default: `terminate`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instanceinterruptionbehavior)
       */
      override fun instanceInterruptionBehavior(): String? =
          unwrap(this).getInstanceInterruptionBehavior()

      /**
       * The number of Spot pools across which to allocate your target Spot capacity.
       *
       * Supported only when Spot `AllocationStrategy` is set to `lowest-price` . EC2 Fleet selects
       * the cheapest Spot pools and evenly allocates your target Spot capacity across the number of
       * Spot pools that you specify.
       *
       * Note that EC2 Fleet attempts to draw Spot Instances from the number of pools that you
       * specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your
       * target capacity, EC2 Fleet will continue to fulfill your request by drawing from the next
       * cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances
       * from more than the number of pools that you specified. Similarly, if most of the pools have no
       * Spot capacity, you might receive your full target capacity from fewer than the number of pools
       * that you specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instancepoolstousecount)
       */
      override fun instancePoolsToUseCount(): Number? = unwrap(this).getInstancePoolsToUseCount()

      /**
       * The strategies for managing your Spot Instances that are at an elevated risk of being
       * interrupted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maintenancestrategies)
       */
      override fun maintenanceStrategies(): Any? = unwrap(this).getMaintenanceStrategies()

      /**
       * The maximum amount per hour for Spot Instances that you're willing to pay.
       *
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your Spot Instances will be interrupted more frequently
       * than if you do not specify this parameter. &gt; If your fleet includes T instances that are
       * configured as `unlimited` , and if their average CPU usage exceeds the baseline utilization,
       * you will incur a charge for surplus credits. The `MaxTotalPrice` does not account for surplus
       * credits, and, if you use surplus credits, your final cost might be higher than what you
       * specified for `MaxTotalPrice` . For more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *EC2 User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maxtotalprice)
       */
      override fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

      /**
       * The minimum target capacity for Spot Instances in the fleet.
       *
       * If the minimum target capacity is not reached, the fleet launches no instances.
       *
       * Supported only for fleets of type `instant` .
       *
       * At least one of the following must be specified: `SingleAvailabilityZone` |
       * `SingleInstanceType`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-mintargetcapacity)
       */
      override fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

      /**
       * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
       *
       * Supported only for fleets of type `instant` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleavailabilityzone)
       */
      override fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

      /**
       * Indicates that the fleet uses a single instance type to launch all Spot Instances in the
       * fleet.
       *
       * Supported only for fleets of type `instant` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleinstancetype)
       */
      override fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpotOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty):
          SpotOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotOptionsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty
    }
  }

  /**
   * The attributes for the instance types.
   *
   * When you specify instance attributes, Amazon EC2 will identify instance types with these
   * attributes.
   *
   * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
   * unspecified optional attribute is set to its default.
   *
   * When you specify multiple attributes, you get instance types that satisfy all of the specified
   * attributes. If you specify multiple values for an attribute, you get instance types that satisfy
   * any of the specified values.
   *
   * To limit the list of instance types from which Amazon EC2 can identify matching instance types,
   * you can use one of the following parameters, but not both in the same request:
   *
   * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance types
   * are ignored, even if they match your specified attributes.
   * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
   * your specified attributes.
   *
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   *
   * Attribute-based instance type selection is only supported when using Auto Scaling groups, EC2
   * Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the [launch
   * instance
   * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) , or
   * with the
   * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) API
   * or
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
   *
   *
   * For more information, see [Attribute-based instance type selection for EC2
   * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
   * , [Attribute-based instance type selection for Spot
   * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
   * , and [Spot placement
   * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
   * *Amazon EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceRequirementsRequestProperty instanceRequirementsRequestProperty =
   * InstanceRequirementsRequestProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html)
   */
  public interface InstanceRequirementsRequestProperty {
    /**
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
     * instance.
     *
     * To exclude accelerator-enabled instance types, set `Max` to `0` .
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratorcount)
     */
    public fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

    /**
     * Indicates whether instance types must have accelerators by specific manufacturers.
     *
     * * For instance types with AWS devices, specify `amazon-web-services` .
     * * For instance types with AMD devices, specify `amd` .
     * * For instance types with Habana devices, specify `habana` .
     * * For instance types with NVIDIA devices, specify `nvidia` .
     * * For instance types with Xilinx devices, specify `xilinx` .
     *
     * Default: Any manufacturer
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratormanufacturers)
     */
    public fun acceleratorManufacturers(): List<String> = unwrap(this).getAcceleratorManufacturers()
        ?: emptyList()

    /**
     * The accelerators that must be on the instance type.
     *
     * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
     * * For instance types with NVIDIA A100 GPUs, specify `a100` .
     * * For instance types with NVIDIA H100 GPUs, specify `h100` .
     * * For instance types with AWS Inferentia chips, specify `inferentia` .
     * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
     * * For instance types with NVIDIA K80 GPUs, specify `k80` .
     * * For instance types with NVIDIA M60 GPUs, specify `m60` .
     * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
     * * For instance types with NVIDIA T4 GPUs, specify `t4` .
     * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
     * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
     * * For instance types with NVIDIA V100 GPUs, specify `v100` .
     *
     * Default: Any accelerator
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratornames)
     */
    public fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?: emptyList()

    /**
     * The minimum and maximum amount of total accelerator memory, in MiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratortotalmemorymib)
     */
    public fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

    /**
     * The accelerator types that must be on the instance type.
     *
     * * To include instance types with GPU hardware, specify `gpu` .
     * * To include instance types with FPGA hardware, specify `fpga` .
     * * To include instance types with inference hardware, specify `inference` .
     *
     * Default: Any accelerator type
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratortypes)
     */
    public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

    /**
     * The instance types to apply your specified attributes against.
     *
     * All other instance types are ignored, even if they match your specified attributes.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to allow
     * an instance type, size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` ,
     * `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow all the
     * M5a instance types, but not the M5n instance types.
     *
     *
     * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
     *
     *
     * Default: All instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-allowedinstancetypes)
     */
    public fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
        emptyList()

    /**
     * Indicates whether bare metal instance types must be included, excluded, or required.
     *
     * * To include bare metal instance types, specify `included` .
     * * To require only bare metal instance types, specify `required` .
     * * To exclude bare metal instance types, specify `excluded` .
     *
     * Default: `excluded`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-baremetal)
     */
    public fun bareMetal(): String? = unwrap(this).getBareMetal()

    /**
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
     *
     * For more information, see [Amazon EBS–optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
     * *Amazon EC2 User Guide* .
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-baselineebsbandwidthmbps)
     */
    public fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

    /**
     * Indicates whether burstable performance T instance types are included, excluded, or required.
     *
     * For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * .
     *
     * * To include burstable performance instance types, specify `included` .
     * * To require only burstable performance instance types, specify `required` .
     * * To exclude burstable performance instance types, specify `excluded` .
     *
     * Default: `excluded`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-burstableperformance)
     */
    public fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

    /**
     * The CPU manufacturers to include.
     *
     * * For instance types with Intel CPUs, specify `intel` .
     * * For instance types with AMD CPUs, specify `amd` .
     * * For instance types with AWS CPUs, specify `amazon-web-services` .
     *
     *
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with
     * a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your
     * launch template.
     *
     *
     * Default: Any manufacturer
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-cpumanufacturers)
     */
    public fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?: emptyList()

    /**
     * The instance types to exclude.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
     * exclude an instance family, type, size, or generation. The following are examples: `m5.8xlarge`
     * , `c5*.*` , `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
     * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will exclude
     * all the M5a instance types, but not the M5n instance types.
     *
     *
     * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
     *
     *
     * Default: No excluded instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-excludedinstancetypes)
     */
    public fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes() ?:
        emptyList()

    /**
     * Indicates whether current or previous generation instance types are included.
     *
     * The current generation instance types are recommended for use. Current generation instance
     * types are typically the latest two to three generations in each instance family. For more
     * information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * For current generation instance types, specify `current` .
     *
     * For previous generation instance types, specify `previous` .
     *
     * Default: Current and previous generation instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-instancegenerations)
     */
    public fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
        emptyList()

    /**
     * Indicates whether instance types with instance store volumes are included, excluded, or
     * required.
     *
     * For more information, [Amazon EC2 instance
     * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the *Amazon
     * EC2 User Guide* .
     *
     * * To include instance types with instance store volumes, specify `included` .
     * * To require only instance types with instance store volumes, specify `required` .
     * * To exclude instance types with instance store volumes, specify `excluded` .
     *
     * Default: `included`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-localstorage)
     */
    public fun localStorage(): String? = unwrap(this).getLocalStorage()

    /**
     * The type of local storage that is required.
     *
     * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
     * * For instance types with solid state drive (SSD) storage, specify `ssd` .
     *
     * Default: `hdd` and `ssd`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-localstoragetypes)
     */
    public fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
        emptyList()

    /**
     * [Price protection] The price protection threshold for Spot Instances, as a percentage of an
     * identified On-Demand price.
     *
     * The identified On-Demand price is the price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. If no current generation C, M, or R instance
     * type matches your attributes, then the identified price is from the lowest priced current
     * generation instance types, and failing that, from the lowest priced previous generation instance
     * types that match your attributes. When Amazon EC2 selects instance types with your attributes,
     * it will exclude instance types whose price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *
     * To indicate no price protection threshold, specify a high value, such as `999999` .
     *
     * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
     * is based on the per vCPU or per memory price instead of the per instance price.
     *
     *
     * Only one of `SpotMaxPricePercentageOverLowestPrice` or
     * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify either,
     * then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter defaults
     * to `100` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-maxspotpriceaspercentageofoptimalondemandprice)
     */
    public fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
        unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

    /**
     * The minimum and maximum amount of memory per vCPU, in GiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-memorygibpervcpu)
     */
    public fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

    /**
     * The minimum and maximum amount of memory, in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-memorymib)
     */
    public fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

    /**
     * The minimum and maximum amount of baseline network bandwidth, in gigabits per second (Gbps).
     *
     * For more information, see [Amazon EC2 instance network
     * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-networkbandwidthgbps)
     */
    public fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

    /**
     * The minimum and maximum number of network interfaces.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-networkinterfacecount)
     */
    public fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

    /**
     * [Price protection] The price protection threshold for On-Demand Instances, as a percentage
     * higher than an identified On-Demand price.
     *
     * The identified On-Demand price is the price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. When Amazon EC2 selects instance types with your
     * attributes, it will exclude instance types whose price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *
     * To indicate no price protection threshold, specify a high value, such as `999999` .
     *
     * This parameter is not supported for
     * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
     * and
     * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
     * .
     *
     *
     * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
     * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     * price.
     *
     *
     * Default: `20`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-ondemandmaxpricepercentageoverlowestprice)
     */
    public fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

    /**
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     *
     * This parameter is not supported for
     * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
     * .
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-requirehibernatesupport)
     */
    public fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

    /**
     * [Price protection] The price protection threshold for Spot Instances, as a percentage higher
     * than an identified Spot price.
     *
     * The identified Spot price is the Spot price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. If no current generation C, M, or R instance
     * type matches your attributes, then the identified Spot price is from the lowest priced current
     * generation instance types, and failing that, from the lowest priced previous generation instance
     * types that match your attributes. When Amazon EC2 selects instance types with your attributes,
     * it will exclude instance types whose Spot price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *
     * To indicate no price protection threshold, specify a high value, such as `999999` .
     *
     * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
     * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     * price.
     *
     * This parameter is not supported for
     * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
     * and
     * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
     * .
     *
     *
     * Only one of `SpotMaxPricePercentageOverLowestPrice` or
     * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify either,
     * then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter defaults
     * to `100` .
     *
     *
     * Default: `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-spotmaxpricepercentageoverlowestprice)
     */
    public fun spotMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

    /**
     * The minimum and maximum amount of total local storage, in GB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-totallocalstoragegb)
     */
    public fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

    /**
     * The minimum and maximum number of vCPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-vcpucount)
     */
    public fun vCpuCount(): Any? = unwrap(this).getVCpuCount()

    /**
     * A builder for [InstanceRequirementsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      public fun acceleratorCount(acceleratorCount: IResolvable)

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      public fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty)

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c47fa8de885dd5f9da410cc792099d6bd7508c1bad277ab38dc9f08d30b15464")
      public
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit)

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      public fun acceleratorManufacturers(acceleratorManufacturers: List<String>)

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      public fun acceleratorManufacturers(vararg acceleratorManufacturers: String)

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      public fun acceleratorNames(acceleratorNames: List<String>)

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      public fun acceleratorNames(vararg acceleratorNames: String)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5c35e2c62e850e2f7d24ad83562bca18776cd4f981238d0067d86625b16db72")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit)

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * To include instance types with GPU hardware, specify `gpu` .
       * * To include instance types with FPGA hardware, specify `fpga` .
       * * To include instance types with inference hardware, specify `inference` .
       *
       * Default: Any accelerator type
       */
      public fun acceleratorTypes(acceleratorTypes: List<String>)

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * To include instance types with GPU hardware, specify `gpu` .
       * * To include instance types with FPGA hardware, specify `fpga` .
       * * To include instance types with inference hardware, specify `inference` .
       *
       * Default: Any accelerator type
       */
      public fun acceleratorTypes(vararg acceleratorTypes: String)

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      public fun allowedInstanceTypes(allowedInstanceTypes: List<String>)

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      public fun allowedInstanceTypes(vararg allowedInstanceTypes: String)

      /**
       * @param bareMetal Indicates whether bare metal instance types must be included, excluded, or
       * required.
       * * To include bare metal instance types, specify `included` .
       * * To require only bare metal instance types, specify `required` .
       * * To exclude bare metal instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      public fun bareMetal(bareMetal: String)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19534bbb047387c09ab85613a207af1e0cb22e91d8d0f22ccc3db25943079ad9")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit)

      /**
       * @param burstablePerformance Indicates whether burstable performance T instance types are
       * included, excluded, or required.
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * .
       *
       * * To include burstable performance instance types, specify `included` .
       * * To require only burstable performance instance types, specify `required` .
       * * To exclude burstable performance instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      public fun burstablePerformance(burstablePerformance: String)

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      public fun cpuManufacturers(cpuManufacturers: List<String>)

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      public fun cpuManufacturers(vararg cpuManufacturers: String)

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      public fun excludedInstanceTypes(excludedInstanceTypes: List<String>)

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      public fun excludedInstanceTypes(vararg excludedInstanceTypes: String)

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      public fun instanceGenerations(instanceGenerations: List<String>)

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      public fun instanceGenerations(vararg instanceGenerations: String)

      /**
       * @param localStorage Indicates whether instance types with instance store volumes are
       * included, excluded, or required.
       * For more information, [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide* .
       *
       * * To include instance types with instance store volumes, specify `included` .
       * * To require only instance types with instance store volumes, specify `required` .
       * * To exclude instance types with instance store volumes, specify `excluded` .
       *
       * Default: `included`
       */
      public fun localStorage(localStorage: String)

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      public fun localStorageTypes(localStorageTypes: List<String>)

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      public fun localStorageTypes(vararg localStorageTypes: String)

      /**
       * @param maxSpotPriceAsPercentageOfOptimalOnDemandPrice [Price protection] The price
       * protection threshold for Spot Instances, as a percentage of an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from the lowest priced
       * current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       */
      public
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb4c1ca6587add1b9116c99aa6e4498c7a2e58bedad71f3a4ce2313e9308a0d6")
      public
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit)

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      public fun memoryMiB(memoryMiB: IResolvable)

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty)

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b393de1edce629abce74c6b91f90af952d8bfb5bce71299af2514e2e31971b")
      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of baseline network bandwidth,
       * in gigabits per second (Gbps).
       * For more information, see [Amazon EC2 instance network
       * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
       * in the *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of baseline network bandwidth,
       * in gigabits per second (Gbps).
       * For more information, see [Amazon EC2 instance network
       * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
       * in the *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      public fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of baseline network bandwidth,
       * in gigabits per second (Gbps).
       * For more information, see [Amazon EC2 instance network
       * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
       * in the *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc305de9dfcfa46ed17753b3731d42835e2ce5d3e13ae3e75930d3ebd273b71")
      public
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      public fun networkInterfaceCount(networkInterfaceCount: IResolvable)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      public fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aefd44432d942bf8fa655fc41a78c488cb4c89021a7f2f5304ca9da56f3bedd")
      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit)

      /**
       * @param onDemandMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for On-Demand Instances, as a percentage higher than an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. When Amazon EC2 selects instance types with
       * your attributes, it will exclude instance types whose price exceeds your specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       *
       * Default: `20`
       */
      public
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number)

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      public fun requireHibernateSupport(requireHibernateSupport: Boolean)

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      public fun requireHibernateSupport(requireHibernateSupport: IResolvable)

      /**
       * @param spotMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for Spot Instances, as a percentage higher than an identified Spot price.
       * The identified Spot price is the Spot price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified Spot price is from the lowest
       * priced current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose Spot price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * Default: `100`
       */
      public
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number)

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable)

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      public fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty)

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("274e6344f3d3b68b13e415c9ff2f989ecd9efba4807de0eb82b31b302f5ae7e5")
      public
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      public fun vCpuCount(vCpuCount: IResolvable)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      public fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068e0d31b8c48e26793c4cd21945d06f96fec0418b4b3b216f4c7a91d92cf0e9")
      public fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty.builder()

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountRequestProperty::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c47fa8de885dd5f9da410cc792099d6bd7508c1bad277ab38dc9f08d30b15464")
      override
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit):
          Unit = acceleratorCount(AcceleratorCountRequestProperty(acceleratorCount))

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      override fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
        cdkBuilder.acceleratorManufacturers(acceleratorManufacturers)
      }

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      override fun acceleratorManufacturers(vararg acceleratorManufacturers: String): Unit =
          acceleratorManufacturers(acceleratorManufacturers.toList())

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      override fun acceleratorNames(acceleratorNames: List<String>) {
        cdkBuilder.acceleratorNames(acceleratorNames)
      }

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      override fun acceleratorNames(vararg acceleratorNames: String): Unit =
          acceleratorNames(acceleratorNames.toList())

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      override fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBRequestProperty::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5c35e2c62e850e2f7d24ad83562bca18776cd4f981238d0067d86625b16db72")
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty(acceleratorTotalMemoryMiB))

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * To include instance types with GPU hardware, specify `gpu` .
       * * To include instance types with FPGA hardware, specify `fpga` .
       * * To include instance types with inference hardware, specify `inference` .
       *
       * Default: Any accelerator type
       */
      override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * To include instance types with GPU hardware, specify `gpu` .
       * * To include instance types with FPGA hardware, specify `fpga` .
       * * To include instance types with inference hardware, specify `inference` .
       *
       * Default: Any accelerator type
       */
      override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
          acceleratorTypes(acceleratorTypes.toList())

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      override fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
        cdkBuilder.allowedInstanceTypes(allowedInstanceTypes)
      }

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      override fun allowedInstanceTypes(vararg allowedInstanceTypes: String): Unit =
          allowedInstanceTypes(allowedInstanceTypes.toList())

      /**
       * @param bareMetal Indicates whether bare metal instance types must be included, excluded, or
       * required.
       * * To include bare metal instance types, specify `included` .
       * * To require only bare metal instance types, specify `required` .
       * * To exclude bare metal instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      override fun bareMetal(bareMetal: String) {
        cdkBuilder.bareMetal(bareMetal)
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      override fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(IResolvable::unwrap))
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsRequestProperty::unwrap))
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19534bbb047387c09ab85613a207af1e0cb22e91d8d0f22ccc3db25943079ad9")
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty(baselineEbsBandwidthMbps))

      /**
       * @param burstablePerformance Indicates whether burstable performance T instance types are
       * included, excluded, or required.
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * .
       *
       * * To include burstable performance instance types, specify `included` .
       * * To require only burstable performance instance types, specify `required` .
       * * To exclude burstable performance instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      override fun burstablePerformance(burstablePerformance: String) {
        cdkBuilder.burstablePerformance(burstablePerformance)
      }

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      override fun cpuManufacturers(cpuManufacturers: List<String>) {
        cdkBuilder.cpuManufacturers(cpuManufacturers)
      }

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      override fun cpuManufacturers(vararg cpuManufacturers: String): Unit =
          cpuManufacturers(cpuManufacturers.toList())

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      override fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
        cdkBuilder.excludedInstanceTypes(excludedInstanceTypes)
      }

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      override fun excludedInstanceTypes(vararg excludedInstanceTypes: String): Unit =
          excludedInstanceTypes(excludedInstanceTypes.toList())

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      override fun instanceGenerations(instanceGenerations: List<String>) {
        cdkBuilder.instanceGenerations(instanceGenerations)
      }

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      override fun instanceGenerations(vararg instanceGenerations: String): Unit =
          instanceGenerations(instanceGenerations.toList())

      /**
       * @param localStorage Indicates whether instance types with instance store volumes are
       * included, excluded, or required.
       * For more information, [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide* .
       *
       * * To include instance types with instance store volumes, specify `included` .
       * * To require only instance types with instance store volumes, specify `required` .
       * * To exclude instance types with instance store volumes, specify `excluded` .
       *
       * Default: `included`
       */
      override fun localStorage(localStorage: String) {
        cdkBuilder.localStorage(localStorage)
      }

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      override fun localStorageTypes(localStorageTypes: List<String>) {
        cdkBuilder.localStorageTypes(localStorageTypes)
      }

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      override fun localStorageTypes(vararg localStorageTypes: String): Unit =
          localStorageTypes(localStorageTypes.toList())

      /**
       * @param maxSpotPriceAsPercentageOfOptimalOnDemandPrice [Price protection] The price
       * protection threshold for Spot Instances, as a percentage of an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from the lowest priced
       * current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       */
      override
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
        cdkBuilder.maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice)
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(IResolvable::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuRequestProperty::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb4c1ca6587add1b9116c99aa6e4498c7a2e58bedad71f3a4ce2313e9308a0d6")
      override
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit):
          Unit = memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty(memoryGiBPerVCpu))

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRequestProperty::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b393de1edce629abce74c6b91f90af952d8bfb5bce71299af2514e2e31971b")
      override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBRequestProperty(memoryMiB))

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of baseline network bandwidth,
       * in gigabits per second (Gbps).
       * For more information, see [Amazon EC2 instance network
       * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
       * in the *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      override fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable::unwrap))
      }

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of baseline network bandwidth,
       * in gigabits per second (Gbps).
       * For more information, see [Amazon EC2 instance network
       * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
       * in the *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      override fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsRequestProperty::unwrap))
      }

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of baseline network bandwidth,
       * in gigabits per second (Gbps).
       * For more information, see [Amazon EC2 instance network
       * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
       * in the *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc305de9dfcfa46ed17753b3731d42835e2ce5d3e13ae3e75930d3ebd273b71")
      override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty(networkBandwidthGbps))

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountRequestProperty::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aefd44432d942bf8fa655fc41a78c488cb4c89021a7f2f5304ca9da56f3bedd")
      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit):
          Unit = networkInterfaceCount(NetworkInterfaceCountRequestProperty(networkInterfaceCount))

      /**
       * @param onDemandMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for On-Demand Instances, as a percentage higher than an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. When Amazon EC2 selects instance types with
       * your attributes, it will exclude instance types whose price exceeds your specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       *
       * Default: `20`
       */
      override
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
      }

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      override fun requireHibernateSupport(requireHibernateSupport: Boolean) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
      }

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      override fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport.let(IResolvable::unwrap))
      }

      /**
       * @param spotMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for Spot Instances, as a percentage higher than an identified Spot price.
       * The identified Spot price is the Spot price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified Spot price is from the lowest
       * priced current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose Spot price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * Default: `100`
       */
      override
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      override fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(IResolvable::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      override fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBRequestProperty::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("274e6344f3d3b68b13e415c9ff2f989ecd9efba4807de0eb82b31b302f5ae7e5")
      override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBRequestProperty(totalLocalStorageGb))

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRangeRequestProperty::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068e0d31b8c48e26793c4cd21945d06f96fec0418b4b3b216f4c7a91d92cf0e9")
      override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountRangeRequestProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty,
    ) : CdkObject(cdkObject), InstanceRequirementsRequestProperty {
      /**
       * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
       * instance.
       *
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratorcount)
       */
      override fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

      /**
       * Indicates whether instance types must have accelerators by specific manufacturers.
       *
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratormanufacturers)
       */
      override fun acceleratorManufacturers(): List<String> =
          unwrap(this).getAcceleratorManufacturers() ?: emptyList()

      /**
       * The accelerators that must be on the instance type.
       *
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratornames)
       */
      override fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?:
          emptyList()

      /**
       * The minimum and maximum amount of total accelerator memory, in MiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratortotalmemorymib)
       */
      override fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

      /**
       * The accelerator types that must be on the instance type.
       *
       * * To include instance types with GPU hardware, specify `gpu` .
       * * To include instance types with FPGA hardware, specify `fpga` .
       * * To include instance types with inference hardware, specify `inference` .
       *
       * Default: Any accelerator type
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-acceleratortypes)
       */
      override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
          emptyList()

      /**
       * The instance types to apply your specified attributes against.
       *
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-allowedinstancetypes)
       */
      override fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
          emptyList()

      /**
       * Indicates whether bare metal instance types must be included, excluded, or required.
       *
       * * To include bare metal instance types, specify `included` .
       * * To require only bare metal instance types, specify `required` .
       * * To exclude bare metal instance types, specify `excluded` .
       *
       * Default: `excluded`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-baremetal)
       */
      override fun bareMetal(): String? = unwrap(this).getBareMetal()

      /**
       * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
       *
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-baselineebsbandwidthmbps)
       */
      override fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

      /**
       * Indicates whether burstable performance T instance types are included, excluded, or
       * required.
       *
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * .
       *
       * * To include burstable performance instance types, specify `included` .
       * * To require only burstable performance instance types, specify `required` .
       * * To exclude burstable performance instance types, specify `excluded` .
       *
       * Default: `excluded`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-burstableperformance)
       */
      override fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

      /**
       * The CPU manufacturers to include.
       *
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-cpumanufacturers)
       */
      override fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?:
          emptyList()

      /**
       * The instance types to exclude.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-excludedinstancetypes)
       */
      override fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes()
          ?: emptyList()

      /**
       * Indicates whether current or previous generation instance types are included.
       *
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-instancegenerations)
       */
      override fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
          emptyList()

      /**
       * Indicates whether instance types with instance store volumes are included, excluded, or
       * required.
       *
       * For more information, [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide* .
       *
       * * To include instance types with instance store volumes, specify `included` .
       * * To require only instance types with instance store volumes, specify `required` .
       * * To exclude instance types with instance store volumes, specify `excluded` .
       *
       * Default: `included`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-localstorage)
       */
      override fun localStorage(): String? = unwrap(this).getLocalStorage()

      /**
       * The type of local storage that is required.
       *
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-localstoragetypes)
       */
      override fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
          emptyList()

      /**
       * [Price protection] The price protection threshold for Spot Instances, as a percentage of an
       * identified On-Demand price.
       *
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from the lowest priced
       * current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-maxspotpriceaspercentageofoptimalondemandprice)
       */
      override fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
          unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

      /**
       * The minimum and maximum amount of memory per vCPU, in GiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-memorygibpervcpu)
       */
      override fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

      /**
       * The minimum and maximum amount of memory, in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-memorymib)
       */
      override fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

      /**
       * The minimum and maximum amount of baseline network bandwidth, in gigabits per second
       * (Gbps).
       *
       * For more information, see [Amazon EC2 instance network
       * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
       * in the *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-networkbandwidthgbps)
       */
      override fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

      /**
       * The minimum and maximum number of network interfaces.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-networkinterfacecount)
       */
      override fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

      /**
       * [Price protection] The price protection threshold for On-Demand Instances, as a percentage
       * higher than an identified On-Demand price.
       *
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. When Amazon EC2 selects instance types with
       * your attributes, it will exclude instance types whose price exceeds your specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       *
       * Default: `20`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-ondemandmaxpricepercentageoverlowestprice)
       */
      override fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

      /**
       * Indicates whether instance types must support hibernation for On-Demand Instances.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-requirehibernatesupport)
       */
      override fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

      /**
       * [Price protection] The price protection threshold for Spot Instances, as a percentage
       * higher than an identified Spot price.
       *
       * The identified Spot price is the Spot price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified Spot price is from the lowest
       * priced current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose Spot price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * Default: `100`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-spotmaxpricepercentageoverlowestprice)
       */
      override fun spotMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

      /**
       * The minimum and maximum amount of total local storage, in GB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-totallocalstoragegb)
       */
      override fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

      /**
       * The minimum and maximum number of vCPUs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-instancerequirementsrequest.html#cfn-ec2-ec2fleet-instancerequirementsrequest-vcpucount)
       */
      override fun vCpuCount(): Any? = unwrap(this).getVCpuCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceRequirementsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty):
          InstanceRequirementsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceRequirementsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty
    }
  }

  /**
   * The strategies for managing your Spot Instances that are at an elevated risk of being
   * interrupted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MaintenanceStrategiesProperty maintenanceStrategiesProperty =
   * MaintenanceStrategiesProperty.builder()
   * .capacityRebalance(CapacityRebalanceProperty.builder()
   * .replacementStrategy("replacementStrategy")
   * .terminationDelay(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-maintenancestrategies.html)
   */
  public interface MaintenanceStrategiesProperty {
    /**
     * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated
     * risk of being interrupted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-maintenancestrategies.html#cfn-ec2-ec2fleet-maintenancestrategies-capacityrebalance)
     */
    public fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

    /**
     * A builder for [MaintenanceStrategiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityRebalance The strategy to use when Amazon EC2 emits a signal that your Spot
       * Instance is at an elevated risk of being interrupted.
       */
      public fun capacityRebalance(capacityRebalance: IResolvable)

      /**
       * @param capacityRebalance The strategy to use when Amazon EC2 emits a signal that your Spot
       * Instance is at an elevated risk of being interrupted.
       */
      public fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty)

      /**
       * @param capacityRebalance The strategy to use when Amazon EC2 emits a signal that your Spot
       * Instance is at an elevated risk of being interrupted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b367b1646207064ec7fe580a92bcaa435e03ca7f5ef4af6d271da161412cbe2")
      public fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty.builder()

      /**
       * @param capacityRebalance The strategy to use when Amazon EC2 emits a signal that your Spot
       * Instance is at an elevated risk of being interrupted.
       */
      override fun capacityRebalance(capacityRebalance: IResolvable) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable::unwrap))
      }

      /**
       * @param capacityRebalance The strategy to use when Amazon EC2 emits a signal that your Spot
       * Instance is at an elevated risk of being interrupted.
       */
      override fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(CapacityRebalanceProperty::unwrap))
      }

      /**
       * @param capacityRebalance The strategy to use when Amazon EC2 emits a signal that your Spot
       * Instance is at an elevated risk of being interrupted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b367b1646207064ec7fe580a92bcaa435e03ca7f5ef4af6d271da161412cbe2")
      override
          fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty.Builder.() -> Unit):
          Unit = capacityRebalance(CapacityRebalanceProperty(capacityRebalance))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty,
    ) : CdkObject(cdkObject), MaintenanceStrategiesProperty {
      /**
       * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an
       * elevated risk of being interrupted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-maintenancestrategies.html#cfn-ec2-ec2fleet-maintenancestrategies-capacityrebalance)
       */
      override fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceStrategiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty):
          MaintenanceStrategiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MaintenanceStrategiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceStrategiesProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty
    }
  }

  /**
   * The Spot Instance replacement strategy to use when Amazon EC2 emits a rebalance notification
   * signal that your Spot Instance is at an elevated risk of being interrupted.
   *
   * For more information, see [Capacity
   * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-capacity-rebalance.html)
   * in the *Amazon EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CapacityRebalanceProperty capacityRebalanceProperty = CapacityRebalanceProperty.builder()
   * .replacementStrategy("replacementStrategy")
   * .terminationDelay(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityrebalance.html)
   */
  public interface CapacityRebalanceProperty {
    /**
     * The replacement strategy to use. Only available for fleets of type `maintain` .
     *
     * `launch` - EC2 Fleet launches a replacement Spot Instance when a rebalance notification is
     * emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances
     * that receive a rebalance notification. You can terminate the old instances, or you can leave
     * them running. You are charged for all instances while they are running.
     *
     * `launch-before-terminate` - EC2 Fleet launches a replacement Spot Instance when a rebalance
     * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that
     * you specify (in `TerminationDelay` ), terminates the instances that received a rebalance
     * notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityrebalance.html#cfn-ec2-ec2fleet-capacityrebalance-replacementstrategy)
     */
    public fun replacementStrategy(): String? = unwrap(this).getReplacementStrategy()

    /**
     * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot
     * Instance after launching a new replacement Spot Instance.
     *
     * Required when `ReplacementStrategy` is set to `launch-before-terminate` .
     *
     * Not valid when `ReplacementStrategy` is set to `launch` .
     *
     * Valid values: Minimum value of `120` seconds. Maximum value of `7200` seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityrebalance.html#cfn-ec2-ec2fleet-capacityrebalance-terminationdelay)
     */
    public fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()

    /**
     * A builder for [CapacityRebalanceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replacementStrategy The replacement strategy to use. Only available for fleets of
       * type `maintain` .
       * `launch` - EC2 Fleet launches a replacement Spot Instance when a rebalance notification is
       * emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances
       * that receive a rebalance notification. You can terminate the old instances, or you can leave
       * them running. You are charged for all instances while they are running.
       *
       * `launch-before-terminate` - EC2 Fleet launches a replacement Spot Instance when a rebalance
       * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay
       * that you specify (in `TerminationDelay` ), terminates the instances that received a rebalance
       * notification.
       */
      public fun replacementStrategy(replacementStrategy: String)

      /**
       * @param terminationDelay The amount of time (in seconds) that Amazon EC2 waits before
       * terminating the old Spot Instance after launching a new replacement Spot Instance.
       * Required when `ReplacementStrategy` is set to `launch-before-terminate` .
       *
       * Not valid when `ReplacementStrategy` is set to `launch` .
       *
       * Valid values: Minimum value of `120` seconds. Maximum value of `7200` seconds.
       */
      public fun terminationDelay(terminationDelay: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty.builder()

      /**
       * @param replacementStrategy The replacement strategy to use. Only available for fleets of
       * type `maintain` .
       * `launch` - EC2 Fleet launches a replacement Spot Instance when a rebalance notification is
       * emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances
       * that receive a rebalance notification. You can terminate the old instances, or you can leave
       * them running. You are charged for all instances while they are running.
       *
       * `launch-before-terminate` - EC2 Fleet launches a replacement Spot Instance when a rebalance
       * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay
       * that you specify (in `TerminationDelay` ), terminates the instances that received a rebalance
       * notification.
       */
      override fun replacementStrategy(replacementStrategy: String) {
        cdkBuilder.replacementStrategy(replacementStrategy)
      }

      /**
       * @param terminationDelay The amount of time (in seconds) that Amazon EC2 waits before
       * terminating the old Spot Instance after launching a new replacement Spot Instance.
       * Required when `ReplacementStrategy` is set to `launch-before-terminate` .
       *
       * Not valid when `ReplacementStrategy` is set to `launch` .
       *
       * Valid values: Minimum value of `120` seconds. Maximum value of `7200` seconds.
       */
      override fun terminationDelay(terminationDelay: Number) {
        cdkBuilder.terminationDelay(terminationDelay)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty,
    ) : CdkObject(cdkObject), CapacityRebalanceProperty {
      /**
       * The replacement strategy to use. Only available for fleets of type `maintain` .
       *
       * `launch` - EC2 Fleet launches a replacement Spot Instance when a rebalance notification is
       * emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances
       * that receive a rebalance notification. You can terminate the old instances, or you can leave
       * them running. You are charged for all instances while they are running.
       *
       * `launch-before-terminate` - EC2 Fleet launches a replacement Spot Instance when a rebalance
       * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay
       * that you specify (in `TerminationDelay` ), terminates the instances that received a rebalance
       * notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityrebalance.html#cfn-ec2-ec2fleet-capacityrebalance-replacementstrategy)
       */
      override fun replacementStrategy(): String? = unwrap(this).getReplacementStrategy()

      /**
       * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot
       * Instance after launching a new replacement Spot Instance.
       *
       * Required when `ReplacementStrategy` is set to `launch-before-terminate` .
       *
       * Not valid when `ReplacementStrategy` is set to `launch` .
       *
       * Valid values: Minimum value of `120` seconds. Maximum value of `7200` seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityrebalance.html#cfn-ec2-ec2fleet-capacityrebalance-terminationdelay)
       */
      override fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityRebalanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty):
          CapacityRebalanceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CapacityRebalanceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityRebalanceProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty
    }
  }

  /**
   * The minimum and maximum number of network interfaces.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NetworkInterfaceCountRequestProperty networkInterfaceCountRequestProperty =
   * NetworkInterfaceCountRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkinterfacecountrequest.html)
   */
  public interface NetworkInterfaceCountRequestProperty {
    /**
     * The maximum number of network interfaces.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkinterfacecountrequest.html#cfn-ec2-ec2fleet-networkinterfacecountrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of network interfaces.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkinterfacecountrequest.html#cfn-ec2-ec2fleet-networkinterfacecountrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [NetworkInterfaceCountRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of network interfaces.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of network interfaces.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty.builder()

      /**
       * @param max The maximum number of network interfaces.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of network interfaces.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceCountRequestProperty {
      /**
       * The maximum number of network interfaces.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkinterfacecountrequest.html#cfn-ec2-ec2fleet-networkinterfacecountrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of network interfaces.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkinterfacecountrequest.html#cfn-ec2-ec2fleet-networkinterfacecountrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkInterfaceCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty):
          NetworkInterfaceCountRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkInterfaceCountRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty
    }
  }

  /**
   * Describes the placement of an instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PlacementProperty placementProperty = PlacementProperty.builder()
   * .affinity("affinity")
   * .availabilityZone("availabilityZone")
   * .groupName("groupName")
   * .hostId("hostId")
   * .hostResourceGroupArn("hostResourceGroupArn")
   * .partitionNumber(123)
   * .spreadDomain("spreadDomain")
   * .tenancy("tenancy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html)
   */
  public interface PlacementProperty {
    /**
     * The affinity setting for the instance on the Dedicated Host.
     *
     * This parameter is not supported for
     * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
     * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-affinity)
     */
    public fun affinity(): String? = unwrap(this).getAffinity()

    /**
     * The Availability Zone of the instance.
     *
     * If not specified, an Availability Zone will be automatically chosen for you based on the load
     * balancing criteria for the Region.
     *
     * This parameter is not supported for
     * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The name of the placement group that the instance is in.
     *
     * If you specify `GroupName` , you can't specify `GroupId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-groupname)
     */
    public fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The ID of the Dedicated Host on which the instance resides.
     *
     * This parameter is not supported for
     * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
     * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-hostid)
     */
    public fun hostId(): String? = unwrap(this).getHostId()

    /**
     * The ARN of the host resource group in which to launch the instances.
     *
     * If you specify this parameter, either omit the *Tenancy* parameter or set it to `host` .
     *
     * This parameter is not supported for
     * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-hostresourcegrouparn)
     */
    public fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

    /**
     * The number of the partition that the instance is in.
     *
     * Valid only if the placement group strategy is set to `partition` .
     *
     * This parameter is not supported for
     * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-partitionnumber)
     */
    public fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-spreaddomain)
     */
    public fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

    /**
     * The tenancy of the instance. An instance with a tenancy of `dedicated` runs on single-tenant
     * hardware.
     *
     * This parameter is not supported for
     * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) . The
     * `host` tenancy is not supported for
     * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
     * or for T3 instances that are configured for the `unlimited` CPU credit option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-tenancy)
     */
    public fun tenancy(): String? = unwrap(this).getTenancy()

    /**
     * A builder for [PlacementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param affinity The affinity setting for the instance on the Dedicated Host.
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * .
       */
      public fun affinity(affinity: String)

      /**
       * @param availabilityZone The Availability Zone of the instance.
       * If not specified, an Availability Zone will be automatically chosen for you based on the
       * load balancing criteria for the Region.
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param groupName The name of the placement group that the instance is in.
       * If you specify `GroupName` , you can't specify `GroupId` .
       */
      public fun groupName(groupName: String)

      /**
       * @param hostId The ID of the Dedicated Host on which the instance resides.
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * .
       */
      public fun hostId(hostId: String)

      /**
       * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
       * instances.
       * If you specify this parameter, either omit the *Tenancy* parameter or set it to `host` .
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       */
      public fun hostResourceGroupArn(hostResourceGroupArn: String)

      /**
       * @param partitionNumber The number of the partition that the instance is in.
       * Valid only if the placement group strategy is set to `partition` .
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       */
      public fun partitionNumber(partitionNumber: Number)

      /**
       * @param spreadDomain Reserved for future use.
       */
      public fun spreadDomain(spreadDomain: String)

      /**
       * @param tenancy The tenancy of the instance. An instance with a tenancy of `dedicated` runs
       * on single-tenant hardware.
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) . The
       * `host` tenancy is not supported for
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * or for T3 instances that are configured for the `unlimited` CPU credit option.
       */
      public fun tenancy(tenancy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty.builder()

      /**
       * @param affinity The affinity setting for the instance on the Dedicated Host.
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * .
       */
      override fun affinity(affinity: String) {
        cdkBuilder.affinity(affinity)
      }

      /**
       * @param availabilityZone The Availability Zone of the instance.
       * If not specified, an Availability Zone will be automatically chosen for you based on the
       * load balancing criteria for the Region.
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param groupName The name of the placement group that the instance is in.
       * If you specify `GroupName` , you can't specify `GroupId` .
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param hostId The ID of the Dedicated Host on which the instance resides.
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * .
       */
      override fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
      }

      /**
       * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
       * instances.
       * If you specify this parameter, either omit the *Tenancy* parameter or set it to `host` .
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       */
      override fun hostResourceGroupArn(hostResourceGroupArn: String) {
        cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
      }

      /**
       * @param partitionNumber The number of the partition that the instance is in.
       * Valid only if the placement group strategy is set to `partition` .
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       */
      override fun partitionNumber(partitionNumber: Number) {
        cdkBuilder.partitionNumber(partitionNumber)
      }

      /**
       * @param spreadDomain Reserved for future use.
       */
      override fun spreadDomain(spreadDomain: String) {
        cdkBuilder.spreadDomain(spreadDomain)
      }

      /**
       * @param tenancy The tenancy of the instance. An instance with a tenancy of `dedicated` runs
       * on single-tenant hardware.
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) . The
       * `host` tenancy is not supported for
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * or for T3 instances that are configured for the `unlimited` CPU credit option.
       */
      override fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty,
    ) : CdkObject(cdkObject), PlacementProperty {
      /**
       * The affinity setting for the instance on the Dedicated Host.
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-affinity)
       */
      override fun affinity(): String? = unwrap(this).getAffinity()

      /**
       * The Availability Zone of the instance.
       *
       * If not specified, an Availability Zone will be automatically chosen for you based on the
       * load balancing criteria for the Region.
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The name of the placement group that the instance is in.
       *
       * If you specify `GroupName` , you can't specify `GroupId` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-groupname)
       */
      override fun groupName(): String? = unwrap(this).getGroupName()

      /**
       * The ID of the Dedicated Host on which the instance resides.
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-hostid)
       */
      override fun hostId(): String? = unwrap(this).getHostId()

      /**
       * The ARN of the host resource group in which to launch the instances.
       *
       * If you specify this parameter, either omit the *Tenancy* parameter or set it to `host` .
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-hostresourcegrouparn)
       */
      override fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

      /**
       * The number of the partition that the instance is in.
       *
       * Valid only if the placement group strategy is set to `partition` .
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-partitionnumber)
       */
      override fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

      /**
       * Reserved for future use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-spreaddomain)
       */
      override fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

      /**
       * The tenancy of the instance. An instance with a tenancy of `dedicated` runs on
       * single-tenant hardware.
       *
       * This parameter is not supported for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) . The
       * `host` tenancy is not supported for
       * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
       * or for T3 instances that are configured for the `unlimited` CPU credit option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html#cfn-ec2-ec2fleet-placement-tenancy)
       */
      override fun tenancy(): String? = unwrap(this).getTenancy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty):
          PlacementProperty = CdkObjectWrappers.wrap(cdkObject) as? PlacementProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty
    }
  }

  /**
   * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
   *
   *
   * Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum
   * bandwidth. Amazon EC2 will identify instance types that support the specified minimum bandwidth,
   * but the actual bandwidth of your instance might go below the specified minimum at times. For more
   * information, see [Available instance
   * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth)
   * in the *Amazon EC2 User Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NetworkBandwidthGbpsRequestProperty networkBandwidthGbpsRequestProperty =
   * NetworkBandwidthGbpsRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkbandwidthgbpsrequest.html)
   */
  public interface NetworkBandwidthGbpsRequestProperty {
    /**
     * The maximum amount of network bandwidth, in Gbps.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkbandwidthgbpsrequest.html#cfn-ec2-ec2fleet-networkbandwidthgbpsrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of network bandwidth, in Gbps.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkbandwidthgbpsrequest.html#cfn-ec2-ec2fleet-networkbandwidthgbpsrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [NetworkBandwidthGbpsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of network bandwidth, in Gbps.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of network bandwidth, in Gbps.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty.builder()

      /**
       * @param max The maximum amount of network bandwidth, in Gbps.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of network bandwidth, in Gbps.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty,
    ) : CdkObject(cdkObject), NetworkBandwidthGbpsRequestProperty {
      /**
       * The maximum amount of network bandwidth, in Gbps.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkbandwidthgbpsrequest.html#cfn-ec2-ec2fleet-networkbandwidthgbpsrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of network bandwidth, in Gbps.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkbandwidthgbpsrequest.html#cfn-ec2-ec2fleet-networkbandwidthgbpsrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkBandwidthGbpsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty):
          NetworkBandwidthGbpsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkBandwidthGbpsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkBandwidthGbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty
    }
  }

  /**
   * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
   *
   * For more information, see [Amazon EBS–optimized
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the *Amazon
   * EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * BaselineEbsBandwidthMbpsRequestProperty baselineEbsBandwidthMbpsRequestProperty =
   * BaselineEbsBandwidthMbpsRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-baselineebsbandwidthmbpsrequest.html)
   */
  public interface BaselineEbsBandwidthMbpsRequestProperty {
    /**
     * The maximum baseline bandwidth, in Mbps.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-ec2fleet-baselineebsbandwidthmbpsrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum baseline bandwidth, in Mbps.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-ec2fleet-baselineebsbandwidthmbpsrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [BaselineEbsBandwidthMbpsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum baseline bandwidth, in Mbps.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum baseline bandwidth, in Mbps.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty.builder()

      /**
       * @param max The maximum baseline bandwidth, in Mbps.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum baseline bandwidth, in Mbps.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty,
    ) : CdkObject(cdkObject), BaselineEbsBandwidthMbpsRequestProperty {
      /**
       * The maximum baseline bandwidth, in Mbps.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-ec2fleet-baselineebsbandwidthmbpsrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum baseline bandwidth, in Mbps.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-ec2fleet-baselineebsbandwidthmbpsrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BaselineEbsBandwidthMbpsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty):
          BaselineEbsBandwidthMbpsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BaselineEbsBandwidthMbpsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineEbsBandwidthMbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty
    }
  }

  /**
   * Specifies the allocation strategy of On-Demand Instances in an EC2 Fleet.
   *
   * `OnDemandOptionsRequest` is a property of the
   * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * OnDemandOptionsRequestProperty onDemandOptionsRequestProperty =
   * OnDemandOptionsRequestProperty.builder()
   * .allocationStrategy("allocationStrategy")
   * .capacityReservationOptions(CapacityReservationOptionsRequestProperty.builder()
   * .usageStrategy("usageStrategy")
   * .build())
   * .maxTotalPrice("maxTotalPrice")
   * .minTargetCapacity(123)
   * .singleAvailabilityZone(false)
   * .singleInstanceType(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html)
   */
  public interface OnDemandOptionsRequestProperty {
    /**
     * The strategy that determines the order of the launch template overrides to use in fulfilling
     * On-Demand capacity.
     *
     * `lowest-price` - EC2 Fleet uses price to determine the order, launching the lowest price
     * first.
     *
     * `prioritized` - EC2 Fleet uses the priority that you assigned to each launch template
     * override, launching the highest priority first.
     *
     * Default: `lowest-price`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-allocationstrategy)
     */
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
     *
     * Supported only for fleets of type `instant` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-capacityreservationoptions)
     */
    public fun capacityReservationOptions(): Any? = unwrap(this).getCapacityReservationOptions()

    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay.
     *
     *
     * If your fleet includes T instances that are configured as `unlimited` , and if their average
     * CPU usage exceeds the baseline utilization, you will incur a charge for surplus credits. The
     * `MaxTotalPrice` does not account for surplus credits, and, if you use surplus credits, your
     * final cost might be higher than what you specified for `MaxTotalPrice` . For more information,
     * see [Surplus credits can incur
     * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
     * in the *EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-maxtotalprice)
     */
    public fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

    /**
     * The minimum target capacity for On-Demand Instances in the fleet.
     *
     * If the minimum target capacity is not reached, the fleet launches no instances.
     *
     * Supported only for fleets of type `instant` .
     *
     * At least one of the following must be specified: `SingleAvailabilityZone` |
     * `SingleInstanceType`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-mintargetcapacity)
     */
    public fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

    /**
     * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     *
     * Supported only for fleets of type `instant` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleavailabilityzone)
     */
    public fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

    /**
     * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the
     * fleet.
     *
     * Supported only for fleets of type `instant` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleinstancetype)
     */
    public fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()

    /**
     * A builder for [OnDemandOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy The strategy that determines the order of the launch template
       * overrides to use in fulfilling On-Demand capacity.
       * `lowest-price` - EC2 Fleet uses price to determine the order, launching the lowest price
       * first.
       *
       * `prioritized` - EC2 Fleet uses the priority that you assigned to each launch template
       * override, launching the highest priority first.
       *
       * Default: `lowest-price`
       */
      public fun allocationStrategy(allocationStrategy: String)

      /**
       * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
       * fulfilling On-Demand capacity.
       * Supported only for fleets of type `instant` .
       */
      public fun capacityReservationOptions(capacityReservationOptions: IResolvable)

      /**
       * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
       * fulfilling On-Demand capacity.
       * Supported only for fleets of type `instant` .
       */
      public
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty)

      /**
       * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
       * fulfilling On-Demand capacity.
       * Supported only for fleets of type `instant` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44d65a255e2e8408608684ca96aa0805cfc82a089a45a7af1a9f1688b6b173ae")
      public
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty.Builder.() -> Unit)

      /**
       * @param maxTotalPrice The maximum amount per hour for On-Demand Instances that you're
       * willing to pay.
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `MaxTotalPrice` does not account for surplus credits, and, if you use surplus
       * credits, your final cost might be higher than what you specified for `MaxTotalPrice` . For
       * more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *EC2 User Guide* .
       */
      public fun maxTotalPrice(maxTotalPrice: String)

      /**
       * @param minTargetCapacity The minimum target capacity for On-Demand Instances in the fleet.
       * If the minimum target capacity is not reached, the fleet launches no instances.
       *
       * Supported only for fleets of type `instant` .
       *
       * At least one of the following must be specified: `SingleAvailabilityZone` |
       * `SingleInstanceType`
       */
      public fun minTargetCapacity(minTargetCapacity: Number)

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all On-Demand Instances
       * into a single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      public fun singleAvailabilityZone(singleAvailabilityZone: Boolean)

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all On-Demand Instances
       * into a single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable)

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all On-Demand Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      public fun singleInstanceType(singleInstanceType: Boolean)

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all On-Demand Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      public fun singleInstanceType(singleInstanceType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty.builder()

      /**
       * @param allocationStrategy The strategy that determines the order of the launch template
       * overrides to use in fulfilling On-Demand capacity.
       * `lowest-price` - EC2 Fleet uses price to determine the order, launching the lowest price
       * first.
       *
       * `prioritized` - EC2 Fleet uses the priority that you assigned to each launch template
       * override, launching the highest priority first.
       *
       * Default: `lowest-price`
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      /**
       * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
       * fulfilling On-Demand capacity.
       * Supported only for fleets of type `instant` .
       */
      override fun capacityReservationOptions(capacityReservationOptions: IResolvable) {
        cdkBuilder.capacityReservationOptions(capacityReservationOptions.let(IResolvable::unwrap))
      }

      /**
       * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
       * fulfilling On-Demand capacity.
       * Supported only for fleets of type `instant` .
       */
      override
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty) {
        cdkBuilder.capacityReservationOptions(capacityReservationOptions.let(CapacityReservationOptionsRequestProperty::unwrap))
      }

      /**
       * @param capacityReservationOptions The strategy for using unused Capacity Reservations for
       * fulfilling On-Demand capacity.
       * Supported only for fleets of type `instant` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44d65a255e2e8408608684ca96aa0805cfc82a089a45a7af1a9f1688b6b173ae")
      override
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty.Builder.() -> Unit):
          Unit =
          capacityReservationOptions(CapacityReservationOptionsRequestProperty(capacityReservationOptions))

      /**
       * @param maxTotalPrice The maximum amount per hour for On-Demand Instances that you're
       * willing to pay.
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `MaxTotalPrice` does not account for surplus credits, and, if you use surplus
       * credits, your final cost might be higher than what you specified for `MaxTotalPrice` . For
       * more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *EC2 User Guide* .
       */
      override fun maxTotalPrice(maxTotalPrice: String) {
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
      override fun minTargetCapacity(minTargetCapacity: Number) {
        cdkBuilder.minTargetCapacity(minTargetCapacity)
      }

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all On-Demand Instances
       * into a single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      override fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
      }

      /**
       * @param singleAvailabilityZone Indicates that the fleet launches all On-Demand Instances
       * into a single Availability Zone.
       * Supported only for fleets of type `instant` .
       */
      override fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone.let(IResolvable::unwrap))
      }

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all On-Demand Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      override fun singleInstanceType(singleInstanceType: Boolean) {
        cdkBuilder.singleInstanceType(singleInstanceType)
      }

      /**
       * @param singleInstanceType Indicates that the fleet uses a single instance type to launch
       * all On-Demand Instances in the fleet.
       * Supported only for fleets of type `instant` .
       */
      override fun singleInstanceType(singleInstanceType: IResolvable) {
        cdkBuilder.singleInstanceType(singleInstanceType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty,
    ) : CdkObject(cdkObject), OnDemandOptionsRequestProperty {
      /**
       * The strategy that determines the order of the launch template overrides to use in
       * fulfilling On-Demand capacity.
       *
       * `lowest-price` - EC2 Fleet uses price to determine the order, launching the lowest price
       * first.
       *
       * `prioritized` - EC2 Fleet uses the priority that you assigned to each launch template
       * override, launching the highest priority first.
       *
       * Default: `lowest-price`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-allocationstrategy)
       */
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      /**
       * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
       *
       * Supported only for fleets of type `instant` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-capacityreservationoptions)
       */
      override fun capacityReservationOptions(): Any? = unwrap(this).getCapacityReservationOptions()

      /**
       * The maximum amount per hour for On-Demand Instances that you're willing to pay.
       *
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `MaxTotalPrice` does not account for surplus credits, and, if you use surplus
       * credits, your final cost might be higher than what you specified for `MaxTotalPrice` . For
       * more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *EC2 User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-maxtotalprice)
       */
      override fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

      /**
       * The minimum target capacity for On-Demand Instances in the fleet.
       *
       * If the minimum target capacity is not reached, the fleet launches no instances.
       *
       * Supported only for fleets of type `instant` .
       *
       * At least one of the following must be specified: `SingleAvailabilityZone` |
       * `SingleInstanceType`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-mintargetcapacity)
       */
      override fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

      /**
       * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
       *
       * Supported only for fleets of type `instant` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleavailabilityzone)
       */
      override fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

      /**
       * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in
       * the fleet.
       *
       * Supported only for fleets of type `instant` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleinstancetype)
       */
      override fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnDemandOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty):
          OnDemandOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OnDemandOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandOptionsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty
    }
  }

  /**
   * Specifies the launch template to be used by the EC2 Fleet for configuring Amazon EC2 instances.
   *
   * You must specify the following:
   *
   * * The ID or the name of the launch template, but not both.
   * * The version of the launch template.
   *
   * `FleetLaunchTemplateSpecificationRequest` is a property of the
   * [FleetLaunchTemplateConfigRequest](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html)
   * property type.
   *
   * For information about creating a launch template, see
   * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
   * and [Create a launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * in the *Amazon EC2 User Guide* .
   *
   * For examples of launch templates, see
   * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate--examples)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * FleetLaunchTemplateSpecificationRequestProperty fleetLaunchTemplateSpecificationRequestProperty
   * = FleetLaunchTemplateSpecificationRequestProperty.builder()
   * .version("version")
   * // the properties below are optional
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html)
   */
  public interface FleetLaunchTemplateSpecificationRequestProperty {
    /**
     * The ID of the launch template.
     *
     * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the launch template.
     *
     * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest-launchtemplatename)
     */
    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The launch template version number, `$Latest` , or `$Default` . You must specify a value,
     * otherwise the request fails.
     *
     * If the value is `$Latest` , Amazon EC2 uses the latest version of the launch template.
     *
     * If the value is `$Default` , Amazon EC2 uses the default version of the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest-version)
     */
    public fun version(): String

    /**
     * A builder for [FleetLaunchTemplateSpecificationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateId The ID of the launch template.
       * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
       */
      public fun launchTemplateId(launchTemplateId: String)

      /**
       * @param launchTemplateName The name of the launch template.
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
       */
      public fun launchTemplateName(launchTemplateName: String)

      /**
       * @param version The launch template version number, `$Latest` , or `$Default` . You must
       * specify a value, otherwise the request fails. 
       * If the value is `$Latest` , Amazon EC2 uses the latest version of the launch template.
       *
       * If the value is `$Default` , Amazon EC2 uses the default version of the launch template.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.builder()

      /**
       * @param launchTemplateId The ID of the launch template.
       * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
       */
      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      /**
       * @param launchTemplateName The name of the launch template.
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
       */
      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      /**
       * @param version The launch template version number, `$Latest` , or `$Default` . You must
       * specify a value, otherwise the request fails. 
       * If the value is `$Latest` , Amazon EC2 uses the latest version of the launch template.
       *
       * If the value is `$Default` , Amazon EC2 uses the default version of the launch template.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty,
    ) : CdkObject(cdkObject), FleetLaunchTemplateSpecificationRequestProperty {
      /**
       * The ID of the launch template.
       *
       * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * The name of the launch template.
       *
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest-launchtemplatename)
       */
      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      /**
       * The launch template version number, `$Latest` , or `$Default` . You must specify a value,
       * otherwise the request fails.
       *
       * If the value is `$Latest` , Amazon EC2 uses the latest version of the launch template.
       *
       * If the value is `$Default` , Amazon EC2 uses the default version of the launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateSpecificationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty):
          FleetLaunchTemplateSpecificationRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetLaunchTemplateSpecificationRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateSpecificationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty
    }
  }

  /**
   * The minimum and maximum amount of memory, in MiB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MemoryMiBRequestProperty memoryMiBRequestProperty = MemoryMiBRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorymibrequest.html)
   */
  public interface MemoryMiBRequestProperty {
    /**
     * The maximum amount of memory, in MiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorymibrequest.html#cfn-ec2-ec2fleet-memorymibrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory, in MiB.
     *
     * To specify no minimum limit, specify `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorymibrequest.html#cfn-ec2-ec2fleet-memorymibrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [MemoryMiBRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of memory, in MiB.
       * To specify no minimum limit, specify `0` .
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty.builder()

      /**
       * @param max The maximum amount of memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of memory, in MiB.
       * To specify no minimum limit, specify `0` .
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty,
    ) : CdkObject(cdkObject), MemoryMiBRequestProperty {
      /**
       * The maximum amount of memory, in MiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorymibrequest.html#cfn-ec2-ec2fleet-memorymibrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory, in MiB.
       *
       * To specify no minimum limit, specify `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorymibrequest.html#cfn-ec2-ec2fleet-memorymibrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty):
          MemoryMiBRequestProperty = CdkObjectWrappers.wrap(cdkObject) as? MemoryMiBRequestProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty
    }
  }

  /**
   * The minimum and maximum number of vCPUs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * VCpuCountRangeRequestProperty vCpuCountRangeRequestProperty =
   * VCpuCountRangeRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-vcpucountrangerequest.html)
   */
  public interface VCpuCountRangeRequestProperty {
    /**
     * The maximum number of vCPUs.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-vcpucountrangerequest.html#cfn-ec2-ec2fleet-vcpucountrangerequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of vCPUs.
     *
     * To specify no minimum limit, specify `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-vcpucountrangerequest.html#cfn-ec2-ec2fleet-vcpucountrangerequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [VCpuCountRangeRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of vCPUs.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of vCPUs.
       * To specify no minimum limit, specify `0` .
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty.builder()

      /**
       * @param max The maximum number of vCPUs.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of vCPUs.
       * To specify no minimum limit, specify `0` .
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty,
    ) : CdkObject(cdkObject), VCpuCountRangeRequestProperty {
      /**
       * The maximum number of vCPUs.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-vcpucountrangerequest.html#cfn-ec2-ec2fleet-vcpucountrangerequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of vCPUs.
       *
       * To specify no minimum limit, specify `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-vcpucountrangerequest.html#cfn-ec2-ec2fleet-vcpucountrangerequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountRangeRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty):
          VCpuCountRangeRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VCpuCountRangeRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountRangeRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty
    }
  }

  /**
   * The minimum and maximum amount of total accelerator memory, in MiB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AcceleratorTotalMemoryMiBRequestProperty acceleratorTotalMemoryMiBRequestProperty =
   * AcceleratorTotalMemoryMiBRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratortotalmemorymibrequest.html)
   */
  public interface AcceleratorTotalMemoryMiBRequestProperty {
    /**
     * The maximum amount of accelerator memory, in MiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratortotalmemorymibrequest.html#cfn-ec2-ec2fleet-acceleratortotalmemorymibrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of accelerator memory, in MiB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratortotalmemorymibrequest.html#cfn-ec2-ec2fleet-acceleratortotalmemorymibrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [AcceleratorTotalMemoryMiBRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of accelerator memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of accelerator memory, in MiB.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty.builder()

      /**
       * @param max The maximum amount of accelerator memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of accelerator memory, in MiB.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty,
    ) : CdkObject(cdkObject), AcceleratorTotalMemoryMiBRequestProperty {
      /**
       * The maximum amount of accelerator memory, in MiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratortotalmemorymibrequest.html#cfn-ec2-ec2fleet-acceleratortotalmemorymibrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of accelerator memory, in MiB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-acceleratortotalmemorymibrequest.html#cfn-ec2-ec2fleet-acceleratortotalmemorymibrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AcceleratorTotalMemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty):
          AcceleratorTotalMemoryMiBRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AcceleratorTotalMemoryMiBRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty
    }
  }

  /**
   * Describes the strategy for using unused Capacity Reservations for fulfilling On-Demand
   * capacity.
   *
   *
   * This strategy can only be used if the EC2 Fleet is of type `instant` .
   *
   *
   * For more information about Capacity Reservations, see [On-Demand Capacity
   * Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html)
   * in the *Amazon EC2 User Guide* . For examples of using Capacity Reservations in an EC2 Fleet, see
   * [EC2 Fleet example
   * configurations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-examples.html) in
   * the *Amazon EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CapacityReservationOptionsRequestProperty capacityReservationOptionsRequestProperty =
   * CapacityReservationOptionsRequestProperty.builder()
   * .usageStrategy("usageStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html)
   */
  public interface CapacityReservationOptionsRequestProperty {
    /**
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     *
     * If you specify `use-capacity-reservations-first` , the fleet uses unused Capacity
     * Reservations to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple
     * instance pools have unused Capacity Reservations, the On-Demand allocation strategy (
     * `lowest-price` or `prioritized` ) is applied. If the number of unused Capacity Reservations is
     * less than the On-Demand target capacity, the remaining On-Demand target capacity is launched
     * according to the On-Demand allocation strategy ( `lowest-price` or `prioritized` ).
     *
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the
     * chosen On-Demand allocation strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html#cfn-ec2-ec2fleet-capacityreservationoptionsrequest-usagestrategy)
     */
    public fun usageStrategy(): String? = unwrap(this).getUsageStrategy()

    /**
     * A builder for [CapacityReservationOptionsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param usageStrategy Indicates whether to use unused Capacity Reservations for fulfilling
       * On-Demand capacity.
       * If you specify `use-capacity-reservations-first` , the fleet uses unused Capacity
       * Reservations to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple
       * instance pools have unused Capacity Reservations, the On-Demand allocation strategy (
       * `lowest-price` or `prioritized` ) is applied. If the number of unused Capacity Reservations is
       * less than the On-Demand target capacity, the remaining On-Demand target capacity is launched
       * according to the On-Demand allocation strategy ( `lowest-price` or `prioritized` ).
       *
       * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the
       * chosen On-Demand allocation strategy.
       */
      public fun usageStrategy(usageStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty.builder()

      /**
       * @param usageStrategy Indicates whether to use unused Capacity Reservations for fulfilling
       * On-Demand capacity.
       * If you specify `use-capacity-reservations-first` , the fleet uses unused Capacity
       * Reservations to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple
       * instance pools have unused Capacity Reservations, the On-Demand allocation strategy (
       * `lowest-price` or `prioritized` ) is applied. If the number of unused Capacity Reservations is
       * less than the On-Demand target capacity, the remaining On-Demand target capacity is launched
       * according to the On-Demand allocation strategy ( `lowest-price` or `prioritized` ).
       *
       * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the
       * chosen On-Demand allocation strategy.
       */
      override fun usageStrategy(usageStrategy: String) {
        cdkBuilder.usageStrategy(usageStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty,
    ) : CdkObject(cdkObject), CapacityReservationOptionsRequestProperty {
      /**
       * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
       *
       * If you specify `use-capacity-reservations-first` , the fleet uses unused Capacity
       * Reservations to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple
       * instance pools have unused Capacity Reservations, the On-Demand allocation strategy (
       * `lowest-price` or `prioritized` ) is applied. If the number of unused Capacity Reservations is
       * less than the On-Demand target capacity, the remaining On-Demand target capacity is launched
       * according to the On-Demand allocation strategy ( `lowest-price` or `prioritized` ).
       *
       * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the
       * chosen On-Demand allocation strategy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html#cfn-ec2-ec2fleet-capacityreservationoptionsrequest-usagestrategy)
       */
      override fun usageStrategy(): String? = unwrap(this).getUsageStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityReservationOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty):
          CapacityReservationOptionsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CapacityReservationOptionsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityReservationOptionsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty
    }
  }

  /**
   * Specifies a launch template and overrides for an EC2 Fleet.
   *
   * `FleetLaunchTemplateConfigRequest` is a property of the
   * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * FleetLaunchTemplateConfigRequestProperty fleetLaunchTemplateConfigRequestProperty =
   * FleetLaunchTemplateConfigRequestProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html)
   */
  public interface FleetLaunchTemplateConfigRequestProperty {
    /**
     * The launch template to use.
     *
     * You must specify either the launch template ID or launch template name in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-launchtemplatespecification)
     */
    public fun launchTemplateSpecification(): Any? = unwrap(this).getLaunchTemplateSpecification()

    /**
     * Any parameters that you specify override the same parameters in the launch template.
     *
     * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
     * launch templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * A builder for [FleetLaunchTemplateConfigRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateSpecification The launch template to use.
       * You must specify either the launch template ID or launch template name in the request.
       */
      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable)

      /**
       * @param launchTemplateSpecification The launch template to use.
       * You must specify either the launch template ID or launch template name in the request.
       */
      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty)

      /**
       * @param launchTemplateSpecification The launch template to use.
       * You must specify either the launch template ID or launch template name in the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0ec4cc1dc1142399b7f1cacbbd347beb1f9bba7e97e957a3dca7cc4b86b049e")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty.Builder.() -> Unit)

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
       * launch templates.
       */
      public fun overrides(overrides: IResolvable)

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
       * launch templates.
       */
      public fun overrides(overrides: List<Any>)

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
       * launch templates.
       */
      public fun overrides(vararg overrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.builder()

      /**
       * @param launchTemplateSpecification The launch template to use.
       * You must specify either the launch template ID or launch template name in the request.
       */
      override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplateSpecification The launch template to use.
       * You must specify either the launch template ID or launch template name in the request.
       */
      override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(FleetLaunchTemplateSpecificationRequestProperty::unwrap))
      }

      /**
       * @param launchTemplateSpecification The launch template to use.
       * You must specify either the launch template ID or launch template name in the request.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0ec4cc1dc1142399b7f1cacbbd347beb1f9bba7e97e957a3dca7cc4b86b049e")
      override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(FleetLaunchTemplateSpecificationRequestProperty(launchTemplateSpecification))

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
       * launch templates.
       */
      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
       * launch templates.
       */
      override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides)
      }

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
       * launch templates.
       */
      override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty,
    ) : CdkObject(cdkObject), FleetLaunchTemplateConfigRequestProperty {
      /**
       * The launch template to use.
       *
       * You must specify either the launch template ID or launch template name in the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-launchtemplatespecification)
       */
      override fun launchTemplateSpecification(): Any? =
          unwrap(this).getLaunchTemplateSpecification()

      /**
       * Any parameters that you specify override the same parameters in the launch template.
       *
       * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
       * launch templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateConfigRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty):
          FleetLaunchTemplateConfigRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetLaunchTemplateConfigRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateConfigRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty
    }
  }

  /**
   * The minimum and maximum amount of memory per vCPU, in GiB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MemoryGiBPerVCpuRequestProperty memoryGiBPerVCpuRequestProperty =
   * MemoryGiBPerVCpuRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorygibpervcpurequest.html)
   */
  public interface MemoryGiBPerVCpuRequestProperty {
    /**
     * The maximum amount of memory per vCPU, in GiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorygibpervcpurequest.html#cfn-ec2-ec2fleet-memorygibpervcpurequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory per vCPU, in GiB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorygibpervcpurequest.html#cfn-ec2-ec2fleet-memorygibpervcpurequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [MemoryGiBPerVCpuRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of memory per vCPU, in GiB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of memory per vCPU, in GiB.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.builder()

      /**
       * @param max The maximum amount of memory per vCPU, in GiB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of memory per vCPU, in GiB.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty,
    ) : CdkObject(cdkObject), MemoryGiBPerVCpuRequestProperty {
      /**
       * The maximum amount of memory per vCPU, in GiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorygibpervcpurequest.html#cfn-ec2-ec2fleet-memorygibpervcpurequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory per vCPU, in GiB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorygibpervcpurequest.html#cfn-ec2-ec2fleet-memorygibpervcpurequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty):
          MemoryGiBPerVCpuRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MemoryGiBPerVCpuRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty
    }
  }

  /**
   * The minimum and maximum amount of total local storage, in GB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TotalLocalStorageGBRequestProperty totalLocalStorageGBRequestProperty =
   * TotalLocalStorageGBRequestProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-totallocalstoragegbrequest.html)
   */
  public interface TotalLocalStorageGBRequestProperty {
    /**
     * The maximum amount of total local storage, in GB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-totallocalstoragegbrequest.html#cfn-ec2-ec2fleet-totallocalstoragegbrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of total local storage, in GB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-totallocalstoragegbrequest.html#cfn-ec2-ec2fleet-totallocalstoragegbrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [TotalLocalStorageGBRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of total local storage, in GB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of total local storage, in GB.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty.builder()

      /**
       * @param max The maximum amount of total local storage, in GB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of total local storage, in GB.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty,
    ) : CdkObject(cdkObject), TotalLocalStorageGBRequestProperty {
      /**
       * The maximum amount of total local storage, in GB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-totallocalstoragegbrequest.html#cfn-ec2-ec2fleet-totallocalstoragegbrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of total local storage, in GB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-totallocalstoragegbrequest.html#cfn-ec2-ec2fleet-totallocalstoragegbrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TotalLocalStorageGBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty):
          TotalLocalStorageGBRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TotalLocalStorageGBRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TotalLocalStorageGBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty
    }
  }
}
