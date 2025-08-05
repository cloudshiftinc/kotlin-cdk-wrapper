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
 * Specifies a Spot Fleet request.
 *
 * The Spot Fleet request specifies the total target capacity and the On-Demand target capacity.
 * Amazon EC2 calculates the difference between the total capacity and On-Demand capacity, and launches
 * the difference as Spot capacity.
 *
 * You can submit a single request that includes multiple launch specifications that vary by
 * instance type, AMI, Availability Zone, or subnet.
 *
 * By default, the Spot Fleet requests Spot Instances in the Spot Instance pool where the price per
 * unit is the lowest. Each launch specification can include its own instance weighting that reflects
 * the value of the instance type to your application workload.
 *
 * Alternatively, you can specify that the Spot Fleet distribute the target capacity across the Spot
 * pools included in its launch specifications. By ensuring that the Spot Instances in your Spot Fleet
 * are in different Spot pools, you can improve the availability of your fleet.
 *
 * You can specify tags for the Spot Fleet request and instances launched by the fleet. You cannot
 * tag other resource types in a Spot Fleet request because only the `spot-fleet-request` and
 * `instance` resource types are supported.
 *
 * For more information, see [Spot
 * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet.html) in the *Amazon EC2 User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSpotFleet cfnSpotFleet = CfnSpotFleet.Builder.create(this, "MyCfnSpotFleet")
 * .spotFleetRequestConfigData(SpotFleetRequestConfigDataProperty.builder()
 * .iamFleetRole("iamFleetRole")
 * .targetCapacity(123)
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .context("context")
 * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
 * .instanceInterruptionBehavior("instanceInterruptionBehavior")
 * .instancePoolsToUseCount(123)
 * .launchSpecifications(List.of(SpotFleetLaunchSpecificationProperty.builder()
 * .imageId("imageId")
 * // the properties below are optional
 * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .ebs(EbsBlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build()))
 * .ebsOptimized(false)
 * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
 * .arn("arn")
 * .build())
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
 * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
 * .cpu(CpuPerformanceFactorRequestProperty.builder()
 * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
 * .instanceFamily("instanceFamily")
 * .build()))
 * .build())
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
 * .kernelId("kernelId")
 * .keyName("keyName")
 * .monitoring(SpotFleetMonitoringProperty.builder()
 * .enabled(false)
 * .build())
 * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
 * .associatePublicIpAddress(false)
 * .deleteOnTermination(false)
 * .description("description")
 * .deviceIndex(123)
 * .groups(List.of("groups"))
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
 * .privateIpAddress("privateIpAddress")
 * // the properties below are optional
 * .primary(false)
 * .build()))
 * .secondaryPrivateIpAddressCount(123)
 * .subnetId("subnetId")
 * .build()))
 * .placement(SpotPlacementProperty.builder()
 * .availabilityZone("availabilityZone")
 * .groupName("groupName")
 * .tenancy("tenancy")
 * .build())
 * .ramdiskId("ramdiskId")
 * .securityGroups(List.of(GroupIdentifierProperty.builder()
 * .groupId("groupId")
 * .build()))
 * .spotPrice("spotPrice")
 * .subnetId("subnetId")
 * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .userData("userData")
 * .weightedCapacity(123)
 * .build()))
 * .launchTemplateConfigs(List.of(LaunchTemplateConfigProperty.builder()
 * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
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
 * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
 * .cpu(CpuPerformanceFactorRequestProperty.builder()
 * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
 * .instanceFamily("instanceFamily")
 * .build()))
 * .build())
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
 * .priority(123)
 * .spotPrice("spotPrice")
 * .subnetId("subnetId")
 * .weightedCapacity(123)
 * .build()))
 * .build()))
 * .loadBalancersConfig(LoadBalancersConfigProperty.builder()
 * .classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty.builder()
 * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
 * .name("name")
 * .build()))
 * .build())
 * .targetGroupsConfig(TargetGroupsConfigProperty.builder()
 * .targetGroups(List.of(TargetGroupProperty.builder()
 * .arn("arn")
 * .build()))
 * .build())
 * .build())
 * .onDemandAllocationStrategy("onDemandAllocationStrategy")
 * .onDemandMaxTotalPrice("onDemandMaxTotalPrice")
 * .onDemandTargetCapacity(123)
 * .replaceUnhealthyInstances(false)
 * .spotMaintenanceStrategies(SpotMaintenanceStrategiesProperty.builder()
 * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
 * .replacementStrategy("replacementStrategy")
 * .terminationDelay(123)
 * .build())
 * .build())
 * .spotMaxTotalPrice("spotMaxTotalPrice")
 * .spotPrice("spotPrice")
 * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .targetCapacityUnitType("targetCapacityUnitType")
 * .terminateInstancesWithExpiration(false)
 * .type("type")
 * .validFrom("validFrom")
 * .validUntil("validUntil")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
 */
public open class CfnSpotFleet(
  cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSpotFleetProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnSpotFleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSpotFleetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSpotFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSpotFleetProps(props)
  )

  /**
   * The ID of the Spot Fleet.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Describes the configuration of a Spot Fleet request.
   */
  public open fun spotFleetRequestConfigData(): Any = unwrap(this).getSpotFleetRequestConfigData()

  /**
   * Describes the configuration of a Spot Fleet request.
   */
  public open fun spotFleetRequestConfigData(`value`: IResolvable) {
    unwrap(this).setSpotFleetRequestConfigData(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes the configuration of a Spot Fleet request.
   */
  public open fun spotFleetRequestConfigData(`value`: SpotFleetRequestConfigDataProperty) {
    unwrap(this).setSpotFleetRequestConfigData(`value`.let(SpotFleetRequestConfigDataProperty.Companion::unwrap))
  }

  /**
   * Describes the configuration of a Spot Fleet request.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("36d6398bf26b73cf18eb0b8c512d5387a8849d6c130a26ce24afdff186bb169a")
  public open
      fun spotFleetRequestConfigData(`value`: SpotFleetRequestConfigDataProperty.Builder.() -> Unit):
      Unit = spotFleetRequestConfigData(SpotFleetRequestConfigDataProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSpotFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes the configuration of a Spot Fleet request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    public fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable)

    /**
     * Describes the configuration of a Spot Fleet request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty)

    /**
     * Describes the configuration of a Spot Fleet request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02782af9bceaf15dc0153b18e3a8466d4c0f6e1b8aac50fc17032f781d56123")
    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSpotFleet.Builder =
        software.amazon.awscdk.services.ec2.CfnSpotFleet.Builder.create(scope, id)

    /**
     * Describes the configuration of a Spot Fleet request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    override fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes the configuration of a Spot Fleet request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(SpotFleetRequestConfigDataProperty.Companion::unwrap))
    }

    /**
     * Describes the configuration of a Spot Fleet request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02782af9bceaf15dc0153b18e3a8466d4c0f6e1b8aac50fc17032f781d56123")
    override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty.Builder.() -> Unit):
        Unit =
        spotFleetRequestConfigData(SpotFleetRequestConfigDataProperty(spotFleetRequestConfigData))

    public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSpotFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSpotFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSpotFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet): CfnSpotFleet =
        CfnSpotFleet(cdkObject)

    internal fun unwrap(wrapped: CfnSpotFleet): software.amazon.awscdk.services.ec2.CfnSpotFleet =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.CfnSpotFleet
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratorcountrequest.html)
   */
  public interface AcceleratorCountRequestProperty {
    /**
     * The maximum number of accelerators.
     *
     * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
     * types, set `Max` to `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratorcountrequest.html#cfn-ec2-spotfleet-acceleratorcountrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of accelerators.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratorcountrequest.html#cfn-ec2-spotfleet-acceleratorcountrequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty,
    ) : CdkObject(cdkObject),
        AcceleratorCountRequestProperty {
      /**
       * The maximum number of accelerators.
       *
       * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
       * types, set `Max` to `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratorcountrequest.html#cfn-ec2-spotfleet-acceleratorcountrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of accelerators.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratorcountrequest.html#cfn-ec2-spotfleet-acceleratorcountrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty):
          AcceleratorCountRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AcceleratorCountRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratortotalmemorymibrequest.html)
   */
  public interface AcceleratorTotalMemoryMiBRequestProperty {
    /**
     * The maximum amount of accelerator memory, in MiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratortotalmemorymibrequest.html#cfn-ec2-spotfleet-acceleratortotalmemorymibrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of accelerator memory, in MiB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratortotalmemorymibrequest.html#cfn-ec2-spotfleet-acceleratortotalmemorymibrequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty,
    ) : CdkObject(cdkObject),
        AcceleratorTotalMemoryMiBRequestProperty {
      /**
       * The maximum amount of accelerator memory, in MiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratortotalmemorymibrequest.html#cfn-ec2-spotfleet-acceleratortotalmemorymibrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of accelerator memory, in MiB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratortotalmemorymibrequest.html#cfn-ec2-spotfleet-acceleratortotalmemorymibrequest-min)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty):
          AcceleratorTotalMemoryMiBRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AcceleratorTotalMemoryMiBRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineebsbandwidthmbpsrequest.html)
   */
  public interface BaselineEbsBandwidthMbpsRequestProperty {
    /**
     * The maximum baseline bandwidth, in Mbps.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-spotfleet-baselineebsbandwidthmbpsrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum baseline bandwidth, in Mbps.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-spotfleet-baselineebsbandwidthmbpsrequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty,
    ) : CdkObject(cdkObject),
        BaselineEbsBandwidthMbpsRequestProperty {
      /**
       * The maximum baseline bandwidth, in Mbps.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-spotfleet-baselineebsbandwidthmbpsrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum baseline bandwidth, in Mbps.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineebsbandwidthmbpsrequest.html#cfn-ec2-spotfleet-baselineebsbandwidthmbpsrequest-min)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty):
          BaselineEbsBandwidthMbpsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BaselineEbsBandwidthMbpsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineEbsBandwidthMbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty
    }
  }

  /**
   * The baseline performance to consider, using an instance family as a baseline reference.
   *
   * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
   * this baseline to guide instance type selection, but there is no guarantee that the selected
   * instance types will always exceed the baseline for every application.
   *
   * Currently, this parameter only supports CPU performance as a baseline performance factor. For
   * example, specifying `c6i` would use the CPU performance of the `c6i` family as the baseline
   * reference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * BaselinePerformanceFactorsRequestProperty baselinePerformanceFactorsRequestProperty =
   * BaselinePerformanceFactorsRequestProperty.builder()
   * .cpu(CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineperformancefactorsrequest.html)
   */
  public interface BaselinePerformanceFactorsRequestProperty {
    /**
     * The CPU performance to consider, using an instance family as the baseline reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineperformancefactorsrequest.html#cfn-ec2-spotfleet-baselineperformancefactorsrequest-cpu)
     */
    public fun cpu(): Any? = unwrap(this).getCpu()

    /**
     * A builder for [BaselinePerformanceFactorsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpu The CPU performance to consider, using an instance family as the baseline
       * reference.
       */
      public fun cpu(cpu: IResolvable)

      /**
       * @param cpu The CPU performance to consider, using an instance family as the baseline
       * reference.
       */
      public fun cpu(cpu: CpuPerformanceFactorRequestProperty)

      /**
       * @param cpu The CPU performance to consider, using an instance family as the baseline
       * reference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e424b80d8f082fb9d828cb3061c2cd9fdb276f19ca86e170de9b5f1ca966f2c")
      public fun cpu(cpu: CpuPerformanceFactorRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselinePerformanceFactorsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselinePerformanceFactorsRequestProperty.builder()

      /**
       * @param cpu The CPU performance to consider, using an instance family as the baseline
       * reference.
       */
      override fun cpu(cpu: IResolvable) {
        cdkBuilder.cpu(cpu.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cpu The CPU performance to consider, using an instance family as the baseline
       * reference.
       */
      override fun cpu(cpu: CpuPerformanceFactorRequestProperty) {
        cdkBuilder.cpu(cpu.let(CpuPerformanceFactorRequestProperty.Companion::unwrap))
      }

      /**
       * @param cpu The CPU performance to consider, using an instance family as the baseline
       * reference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e424b80d8f082fb9d828cb3061c2cd9fdb276f19ca86e170de9b5f1ca966f2c")
      override fun cpu(cpu: CpuPerformanceFactorRequestProperty.Builder.() -> Unit): Unit =
          cpu(CpuPerformanceFactorRequestProperty(cpu))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselinePerformanceFactorsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselinePerformanceFactorsRequestProperty,
    ) : CdkObject(cdkObject),
        BaselinePerformanceFactorsRequestProperty {
      /**
       * The CPU performance to consider, using an instance family as the baseline reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-baselineperformancefactorsrequest.html#cfn-ec2-spotfleet-baselineperformancefactorsrequest-cpu)
       */
      override fun cpu(): Any? = unwrap(this).getCpu()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BaselinePerformanceFactorsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselinePerformanceFactorsRequestProperty):
          BaselinePerformanceFactorsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BaselinePerformanceFactorsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselinePerformanceFactorsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselinePerformanceFactorsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselinePerformanceFactorsRequestProperty
    }
  }

  /**
   * Specifies a block device mapping.
   *
   * You can specify `Ebs` or `VirtualName` , but not both.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * // the properties below are optional
   * .ebs(EbsBlockDeviceProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .snapshotId("snapshotId")
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice("noDevice")
   * .virtualName("virtualName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html)
   */
  public interface BlockDeviceMappingProperty {
    /**
     * The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-devicename)
     */
    public fun deviceName(): String

    /**
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-ebs)
     */
    public fun ebs(): Any? = unwrap(this).getEbs()

    /**
     * To omit the device from the block device mapping, specify an empty string.
     *
     * When this property is specified, the device is removed from the block device mapping
     * regardless of the assigned value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-nodevice)
     */
    public fun noDevice(): String? = unwrap(this).getNoDevice()

    /**
     * The virtual device name ( `ephemeral` N).
     *
     * Instance store volumes are numbered starting from 0. An instance type with 2 available
     * instance store volumes can specify mappings for `ephemeral0` and `ephemeral1` . The number of
     * available instance store volumes depends on the instance type. After you connect to the
     * instance, you must mount the volume.
     *
     * NVMe instance store volumes are automatically enumerated and assigned a device name.
     * Including them in your block device mapping has no effect.
     *
     * Constraints: For M3 instances, you must specify instance store volumes in the block device
     * mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes
     * specified in the block device mapping for the AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-virtualname)
     */
    public fun virtualName(): String? = unwrap(this).getVirtualName()

    /**
     * A builder for [BlockDeviceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName The device name (for example, `/dev/sdh` or `xvdh` ). 
       */
      public fun deviceName(deviceName: String)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      public fun ebs(ebs: IResolvable)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      public fun ebs(ebs: EbsBlockDeviceProperty)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b581e74fd883d2230af83bfae0f1a260db629bac1f4ce9b257768d201ce78ec")
      public fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit)

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       * When this property is specified, the device is removed from the block device mapping
       * regardless of the assigned value.
       */
      public fun noDevice(noDevice: String)

      /**
       * @param virtualName The virtual device name ( `ephemeral` N).
       * Instance store volumes are numbered starting from 0. An instance type with 2 available
       * instance store volumes can specify mappings for `ephemeral0` and `ephemeral1` . The number of
       * available instance store volumes depends on the instance type. After you connect to the
       * instance, you must mount the volume.
       *
       * NVMe instance store volumes are automatically enumerated and assigned a device name.
       * Including them in your block device mapping has no effect.
       *
       * Constraints: For M3 instances, you must specify instance store volumes in the block device
       * mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes
       * specified in the block device mapping for the AMI.
       */
      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty.builder()

      /**
       * @param deviceName The device name (for example, `/dev/sdh` or `xvdh` ). 
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      override fun ebs(ebs: EbsBlockDeviceProperty) {
        cdkBuilder.ebs(ebs.let(EbsBlockDeviceProperty.Companion::unwrap))
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b581e74fd883d2230af83bfae0f1a260db629bac1f4ce9b257768d201ce78ec")
      override fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit): Unit =
          ebs(EbsBlockDeviceProperty(ebs))

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       * When this property is specified, the device is removed from the block device mapping
       * regardless of the assigned value.
       */
      override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      /**
       * @param virtualName The virtual device name ( `ephemeral` N).
       * Instance store volumes are numbered starting from 0. An instance type with 2 available
       * instance store volumes can specify mappings for `ephemeral0` and `ephemeral1` . The number of
       * available instance store volumes depends on the instance type. After you connect to the
       * instance, you must mount the volume.
       *
       * NVMe instance store volumes are automatically enumerated and assigned a device name.
       * Including them in your block device mapping has no effect.
       *
       * Constraints: For M3 instances, you must specify instance store volumes in the block device
       * mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes
       * specified in the block device mapping for the AMI.
       */
      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty,
    ) : CdkObject(cdkObject),
        BlockDeviceMappingProperty {
      /**
       * The device name (for example, `/dev/sdh` or `xvdh` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-devicename)
       */
      override fun deviceName(): String = unwrap(this).getDeviceName()

      /**
       * Parameters used to automatically set up EBS volumes when the instance is launched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-ebs)
       */
      override fun ebs(): Any? = unwrap(this).getEbs()

      /**
       * To omit the device from the block device mapping, specify an empty string.
       *
       * When this property is specified, the device is removed from the block device mapping
       * regardless of the assigned value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-nodevice)
       */
      override fun noDevice(): String? = unwrap(this).getNoDevice()

      /**
       * The virtual device name ( `ephemeral` N).
       *
       * Instance store volumes are numbered starting from 0. An instance type with 2 available
       * instance store volumes can specify mappings for `ephemeral0` and `ephemeral1` . The number of
       * available instance store volumes depends on the instance type. After you connect to the
       * instance, you must mount the volume.
       *
       * NVMe instance store volumes are automatically enumerated and assigned a device name.
       * Including them in your block device mapping has no effect.
       *
       * Constraints: For M3 instances, you must specify instance store volumes in the block device
       * mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes
       * specified in the block device mapping for the AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html#cfn-ec2-spotfleet-blockdevicemapping-virtualname)
       */
      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BlockDeviceMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty
    }
  }

  /**
   * Specifies a Classic Load Balancer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ClassicLoadBalancerProperty classicLoadBalancerProperty = ClassicLoadBalancerProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html)
   */
  public interface ClassicLoadBalancerProperty {
    /**
     * The name of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html#cfn-ec2-spotfleet-classicloadbalancer-name)
     */
    public fun name(): String

    /**
     * A builder for [ClassicLoadBalancerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the load balancer. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty.builder()

      /**
       * @param name The name of the load balancer. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty,
    ) : CdkObject(cdkObject),
        ClassicLoadBalancerProperty {
      /**
       * The name of the load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancer.html#cfn-ec2-spotfleet-classicloadbalancer-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClassicLoadBalancerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty):
          ClassicLoadBalancerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClassicLoadBalancerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClassicLoadBalancerProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty
    }
  }

  /**
   * Specifies the Classic Load Balancers to attach to a Spot Fleet.
   *
   * Spot Fleet registers the running Spot Instances with these Classic Load Balancers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ClassicLoadBalancersConfigProperty classicLoadBalancersConfigProperty =
   * ClassicLoadBalancersConfigProperty.builder()
   * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html)
   */
  public interface ClassicLoadBalancersConfigProperty {
    /**
     * One or more Classic Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers)
     */
    public fun classicLoadBalancers(): Any

    /**
     * A builder for [ClassicLoadBalancersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classicLoadBalancers One or more Classic Load Balancers. 
       */
      public fun classicLoadBalancers(classicLoadBalancers: IResolvable)

      /**
       * @param classicLoadBalancers One or more Classic Load Balancers. 
       */
      public fun classicLoadBalancers(classicLoadBalancers: List<Any>)

      /**
       * @param classicLoadBalancers One or more Classic Load Balancers. 
       */
      public fun classicLoadBalancers(vararg classicLoadBalancers: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty.builder()

      /**
       * @param classicLoadBalancers One or more Classic Load Balancers. 
       */
      override fun classicLoadBalancers(classicLoadBalancers: IResolvable) {
        cdkBuilder.classicLoadBalancers(classicLoadBalancers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param classicLoadBalancers One or more Classic Load Balancers. 
       */
      override fun classicLoadBalancers(classicLoadBalancers: List<Any>) {
        cdkBuilder.classicLoadBalancers(classicLoadBalancers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param classicLoadBalancers One or more Classic Load Balancers. 
       */
      override fun classicLoadBalancers(vararg classicLoadBalancers: Any): Unit =
          classicLoadBalancers(classicLoadBalancers.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty,
    ) : CdkObject(cdkObject),
        ClassicLoadBalancersConfigProperty {
      /**
       * One or more Classic Load Balancers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers)
       */
      override fun classicLoadBalancers(): Any = unwrap(this).getClassicLoadBalancers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ClassicLoadBalancersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty):
          ClassicLoadBalancersConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClassicLoadBalancersConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClassicLoadBalancersConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty
    }
  }

  /**
   * The CPU performance to consider, using an instance family as the baseline reference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CpuPerformanceFactorRequestProperty cpuPerformanceFactorRequestProperty =
   * CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-cpuperformancefactorrequest.html)
   */
  public interface CpuPerformanceFactorRequestProperty {
    /**
     * Specify an instance family to use as the baseline reference for CPU performance.
     *
     * All instance types that match your specified attributes will be compared against the CPU
     * performance of the referenced instance family, regardless of CPU manufacturer or architecture
     * differences.
     *
     *
     * Currently, only one instance family can be specified in the list.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-cpuperformancefactorrequest.html#cfn-ec2-spotfleet-cpuperformancefactorrequest-references)
     */
    public fun references(): Any? = unwrap(this).getReferences()

    /**
     * A builder for [CpuPerformanceFactorRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param references Specify an instance family to use as the baseline reference for CPU
       * performance.
       * All instance types that match your specified attributes will be compared against the CPU
       * performance of the referenced instance family, regardless of CPU manufacturer or architecture
       * differences.
       *
       *
       * Currently, only one instance family can be specified in the list.
       */
      public fun references(references: IResolvable)

      /**
       * @param references Specify an instance family to use as the baseline reference for CPU
       * performance.
       * All instance types that match your specified attributes will be compared against the CPU
       * performance of the referenced instance family, regardless of CPU manufacturer or architecture
       * differences.
       *
       *
       * Currently, only one instance family can be specified in the list.
       */
      public fun references(references: List<Any>)

      /**
       * @param references Specify an instance family to use as the baseline reference for CPU
       * performance.
       * All instance types that match your specified attributes will be compared against the CPU
       * performance of the referenced instance family, regardless of CPU manufacturer or architecture
       * differences.
       *
       *
       * Currently, only one instance family can be specified in the list.
       */
      public fun references(vararg references: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.CpuPerformanceFactorRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.CpuPerformanceFactorRequestProperty.builder()

      /**
       * @param references Specify an instance family to use as the baseline reference for CPU
       * performance.
       * All instance types that match your specified attributes will be compared against the CPU
       * performance of the referenced instance family, regardless of CPU manufacturer or architecture
       * differences.
       *
       *
       * Currently, only one instance family can be specified in the list.
       */
      override fun references(references: IResolvable) {
        cdkBuilder.references(references.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param references Specify an instance family to use as the baseline reference for CPU
       * performance.
       * All instance types that match your specified attributes will be compared against the CPU
       * performance of the referenced instance family, regardless of CPU manufacturer or architecture
       * differences.
       *
       *
       * Currently, only one instance family can be specified in the list.
       */
      override fun references(references: List<Any>) {
        cdkBuilder.references(references.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param references Specify an instance family to use as the baseline reference for CPU
       * performance.
       * All instance types that match your specified attributes will be compared against the CPU
       * performance of the referenced instance family, regardless of CPU manufacturer or architecture
       * differences.
       *
       *
       * Currently, only one instance family can be specified in the list.
       */
      override fun references(vararg references: Any): Unit = references(references.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.CpuPerformanceFactorRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.CpuPerformanceFactorRequestProperty,
    ) : CdkObject(cdkObject),
        CpuPerformanceFactorRequestProperty {
      /**
       * Specify an instance family to use as the baseline reference for CPU performance.
       *
       * All instance types that match your specified attributes will be compared against the CPU
       * performance of the referenced instance family, regardless of CPU manufacturer or architecture
       * differences.
       *
       *
       * Currently, only one instance family can be specified in the list.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-cpuperformancefactorrequest.html#cfn-ec2-spotfleet-cpuperformancefactorrequest-references)
       */
      override fun references(): Any? = unwrap(this).getReferences()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CpuPerformanceFactorRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.CpuPerformanceFactorRequestProperty):
          CpuPerformanceFactorRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CpuPerformanceFactorRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CpuPerformanceFactorRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.CpuPerformanceFactorRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.CpuPerformanceFactorRequestProperty
    }
  }

  /**
   * Describes a block device for an EBS volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EbsBlockDeviceProperty ebsBlockDeviceProperty = EbsBlockDeviceProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .snapshotId("snapshotId")
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html)
   */
  public interface EbsBlockDeviceProperty {
    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     *
     * For more information, see [Preserving Amazon EBS volumes on instance
     * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * Indicates whether the encryption state of an EBS volume is changed while being restored from
     * a backing snapshot.
     *
     * The effect of setting the encryption state to `true` depends on the volume origin (new or
     * from a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see [Amazon EBS
     * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters)
     * in the *Amazon EC2 User Guide* .
     *
     * In no case can you remove encryption from an encrypted volume.
     *
     * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For
     * more information, see [Supported Instance
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     * .
     *
     * This parameter is not returned by
     * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The number of I/O operations per second (IOPS).
     *
     * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
     * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
     * volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     *
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
     * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . On other instances, you can achieve performance up to 32,000 IOPS.
     *
     * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
     * 3,000 IOPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The ID of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-snapshotid)
     */
    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
     * default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     *
     * The following are the supported sizes for each volume type:
     *
     * * `gp2` and `gp3` : 1 - 16,384 GiB
     * * `io1` : 4 - 16,384 GiB
     * * `io2` : 4 - 65,536 GiB
     * * `st1` and `sc1` : 125 - 16,384 GiB
     * * `standard` : 1 - 1024 GiB
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The volume type.
     *
     * For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) in the *Amazon
     * EBS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EbsBlockDeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param encrypted Indicates whether the encryption state of an EBS volume is changed while
       * being restored from a backing snapshot.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters)
       * in the *Amazon EC2 User Guide* .
       *
       * In no case can you remove encryption from an encrypted volume.
       *
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For
       * more information, see [Supported Instance
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       * This parameter is not returned by
       * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
       * .
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Indicates whether the encryption state of an EBS volume is changed while
       * being restored from a backing snapshot.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters)
       * in the *Amazon EC2 User Guide* .
       *
       * In no case can you remove encryption from an encrypted volume.
       *
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For
       * more information, see [Supported Instance
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       * This parameter is not returned by
       * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
       * .
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . On other instances, you can achieve performance up to 32,000 IOPS.
       *
       * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
       * 3,000 IOPS.
       */
      public fun iops(iops: Number)

      /**
       * @param snapshotId The ID of the snapshot.
       */
      public fun snapshotId(snapshotId: String)

      /**
       * @param volumeSize The size of the volume, in GiBs.
       * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
       * default is the snapshot size. You can specify a volume size that is equal to or larger than
       * the snapshot size.
       *
       * The following are the supported sizes for each volume type:
       *
       * * `gp2` and `gp3` : 1 - 16,384 GiB
       * * `io1` : 4 - 16,384 GiB
       * * `io2` : 4 - 65,536 GiB
       * * `st1` and `sc1` : 125 - 16,384 GiB
       * * `standard` : 1 - 1024 GiB
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) in the *Amazon
       * EBS User Guide* .
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty.builder()

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encrypted Indicates whether the encryption state of an EBS volume is changed while
       * being restored from a backing snapshot.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters)
       * in the *Amazon EC2 User Guide* .
       *
       * In no case can you remove encryption from an encrypted volume.
       *
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For
       * more information, see [Supported Instance
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       * This parameter is not returned by
       * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
       * .
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Indicates whether the encryption state of an EBS volume is changed while
       * being restored from a backing snapshot.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters)
       * in the *Amazon EC2 User Guide* .
       *
       * In no case can you remove encryption from an encrypted volume.
       *
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For
       * more information, see [Supported Instance
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       * This parameter is not returned by
       * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
       * .
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . On other instances, you can achieve performance up to 32,000 IOPS.
       *
       * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
       * 3,000 IOPS.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param snapshotId The ID of the snapshot.
       */
      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      /**
       * @param volumeSize The size of the volume, in GiBs.
       * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
       * default is the snapshot size. You can specify a volume size that is equal to or larger than
       * the snapshot size.
       *
       * The following are the supported sizes for each volume type:
       *
       * * `gp2` and `gp3` : 1 - 16,384 GiB
       * * `io1` : 4 - 16,384 GiB
       * * `io2` : 4 - 65,536 GiB
       * * `st1` and `sc1` : 125 - 16,384 GiB
       * * `standard` : 1 - 1024 GiB
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) in the *Amazon
       * EBS User Guide* .
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty,
    ) : CdkObject(cdkObject),
        EbsBlockDeviceProperty {
      /**
       * Indicates whether the EBS volume is deleted on instance termination.
       *
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * Indicates whether the encryption state of an EBS volume is changed while being restored
       * from a backing snapshot.
       *
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Amazon EBS
       * Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters)
       * in the *Amazon EC2 User Guide* .
       *
       * In no case can you remove encryption from an encrypted volume.
       *
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For
       * more information, see [Supported Instance
       * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       * This parameter is not returned by
       * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * The number of I/O operations per second (IOPS).
       *
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . On other instances, you can achieve performance up to 32,000 IOPS.
       *
       * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
       * 3,000 IOPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The ID of the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-snapshotid)
       */
      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      /**
       * The size of the volume, in GiBs.
       *
       * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
       * default is the snapshot size. You can specify a volume size that is equal to or larger than
       * the snapshot size.
       *
       * The following are the supported sizes for each volume type:
       *
       * * `gp2` and `gp3` : 1 - 16,384 GiB
       * * `io1` : 4 - 16,384 GiB
       * * `io2` : 4 - 65,536 GiB
       * * `st1` and `sc1` : 125 - 16,384 GiB
       * * `standard` : 1 - 1024 GiB
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * The volume type.
       *
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html) in the *Amazon
       * EBS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-ebsblockdevice.html#cfn-ec2-spotfleet-ebsblockdevice-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty):
          EbsBlockDeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? EbsBlockDeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty
    }
  }

  /**
   * Specifies the launch template to be used by the Spot Fleet request for configuring Amazon EC2
   * instances.
   *
   * You must specify the following:
   *
   * * The ID or the name of the launch template, but not both.
   * * The version of the launch template.
   *
   * `FleetLaunchTemplateSpecification` is a property of the
   * [AWS::EC2::SpotFleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
   * resource.
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
   * FleetLaunchTemplateSpecificationProperty fleetLaunchTemplateSpecificationProperty =
   * FleetLaunchTemplateSpecificationProperty.builder()
   * .version("version")
   * // the properties below are optional
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html)
   */
  public interface FleetLaunchTemplateSpecificationProperty {
    /**
     * The ID of the launch template.
     *
     * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the launch template.
     *
     * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename)
     */
    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The version number of the launch template.
     *
     * Specifying `$Latest` or `$Default` for the template version number is not supported. However,
     * you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the `Fn::GetAtt` intrinsic
     * function. For more information, see
     * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version)
     */
    public fun version(): String

    /**
     * A builder for [FleetLaunchTemplateSpecificationProperty]
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
       * @param version The version number of the launch template. 
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
       * .
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.builder()

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
       * @param version The version number of the launch template. 
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
       * .
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty,
    ) : CdkObject(cdkObject),
        FleetLaunchTemplateSpecificationProperty {
      /**
       * The ID of the launch template.
       *
       * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * The name of the launch template.
       *
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename)
       */
      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      /**
       * The version number of the launch template.
       *
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty):
          FleetLaunchTemplateSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FleetLaunchTemplateSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty
    }
  }

  /**
   * Describes a security group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * GroupIdentifierProperty groupIdentifierProperty = GroupIdentifierProperty.builder()
   * .groupId("groupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-groupidentifier.html)
   */
  public interface GroupIdentifierProperty {
    /**
     * The ID of the security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-groupidentifier.html#cfn-ec2-spotfleet-groupidentifier-groupid)
     */
    public fun groupId(): String

    /**
     * A builder for [GroupIdentifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupId The ID of the security group. 
       */
      public fun groupId(groupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty.builder()

      /**
       * @param groupId The ID of the security group. 
       */
      override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty,
    ) : CdkObject(cdkObject),
        GroupIdentifierProperty {
      /**
       * The ID of the security group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-groupidentifier.html#cfn-ec2-spotfleet-groupidentifier-groupid)
       */
      override fun groupId(): String = unwrap(this).getGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty):
          GroupIdentifierProperty = CdkObjectWrappers.wrap(cdkObject) as? GroupIdentifierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupIdentifierProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty
    }
  }

  /**
   * Describes an IAM instance profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IamInstanceProfileSpecificationProperty iamInstanceProfileSpecificationProperty =
   * IamInstanceProfileSpecificationProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-iaminstanceprofilespecification.html)
   */
  public interface IamInstanceProfileSpecificationProperty {
    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-iaminstanceprofilespecification.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [IamInstanceProfileSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the instance profile.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the instance profile.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty,
    ) : CdkObject(cdkObject),
        IamInstanceProfileSpecificationProperty {
      /**
       * The Amazon Resource Name (ARN) of the instance profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-iaminstanceprofilespecification.html#cfn-ec2-spotfleet-iaminstanceprofilespecification-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IamInstanceProfileSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty):
          IamInstanceProfileSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IamInstanceProfileSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamInstanceProfileSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty
    }
  }

  /**
   * Describes an IPv6 address.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html)
   */
  public interface InstanceIpv6AddressProperty {
    /**
     * The IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html#cfn-ec2-spotfleet-instanceipv6address-ipv6address)
     */
    public fun ipv6Address(): String

    /**
     * A builder for [InstanceIpv6AddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv6Address The IPv6 address. 
       */
      public fun ipv6Address(ipv6Address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty.builder()

      /**
       * @param ipv6Address The IPv6 address. 
       */
      override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty,
    ) : CdkObject(cdkObject),
        InstanceIpv6AddressProperty {
      /**
       * The IPv6 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instanceipv6address.html#cfn-ec2-spotfleet-instanceipv6address-ipv6address)
       */
      override fun ipv6Address(): String = unwrap(this).getIpv6Address()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceIpv6AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty):
          InstanceIpv6AddressProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceIpv6AddressProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceIpv6AddressProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty
    }
  }

  /**
   * Describes a network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceNetworkInterfaceSpecificationProperty instanceNetworkInterfaceSpecificationProperty =
   * InstanceNetworkInterfaceSpecificationProperty.builder()
   * .associatePublicIpAddress(false)
   * .deleteOnTermination(false)
   * .description("description")
   * .deviceIndex(123)
   * .groups(List.of("groups"))
   * .ipv6AddressCount(123)
   * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build()))
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
   * .privateIpAddress("privateIpAddress")
   * // the properties below are optional
   * .primary(false)
   * .build()))
   * .secondaryPrivateIpAddressCount(123)
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html)
   */
  public interface InstanceNetworkInterfaceSpecificationProperty {
    /**
     * Indicates whether to assign a public IPv4 address to an instance you launch in a VPC.
     *
     * The public IP address can only be assigned to a network interface for eth0, and can only be
     * assigned to a new network interface, not an existing one. You cannot specify more than one
     * network interface in the request. If launching into a default subnet, the default value is
     * `true` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-associatepublicipaddress)
     */
    public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    /**
     * Indicates whether the network interface is deleted when the instance is terminated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * The description of the network interface.
     *
     * Applies only if creating a network interface when launching an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The position of the network interface in the attachment order.
     *
     * A primary network interface has a device index of 0.
     *
     * If you specify a network interface when launching an instance, you must specify the device
     * index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deviceindex)
     */
    public fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

    /**
     * The IDs of the security groups for the network interface.
     *
     * Applies only if creating a network interface when launching an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-groups)
     */
    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * A number of IPv6 addresses to assign to the network interface.
     *
     * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
     * option and the option to assign specific IPv6 addresses in the same request. You can specify
     * this option if you've specified a minimum number of instances to launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresscount)
     */
    public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    /**
     * The IPv6 addresses to assign to the network interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresses)
     */
    public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    /**
     * The ID of the network interface.
     *
     * If you are creating a Spot Fleet, omit this parameter because you can’t specify a network
     * interface ID in a launch specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The private IPv4 addresses to assign to the network interface.
     *
     * Only one private IPv4 address can be designated as primary. You cannot specify this option if
     * you're launching more than one instance in a
     * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-privateipaddresses)
     */
    public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    /**
     * The number of secondary private IPv4 addresses.
     *
     * You can’t specify this parameter and also specify a secondary private IP address using the
     * `PrivateIpAddress` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-secondaryprivateipaddresscount)
     */
    public fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    /**
     * The ID of the subnet associated with the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [InstanceNetworkInterfaceSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance you launch in a VPC.
       * The public IP address can only be assigned to a network interface for eth0, and can only be
       * assigned to a new network interface, not an existing one. You cannot specify more than one
       * network interface in the request. If launching into a default subnet, the default value is
       * `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance you launch in a VPC.
       * The public IP address can only be assigned to a network interface for eth0, and can only be
       * assigned to a new network interface, not an existing one. You cannot specify more than one
       * network interface in the request. If launching into a default subnet, the default value is
       * `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param description The description of the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun description(description: String)

      /**
       * @param deviceIndex The position of the network interface in the attachment order.
       * A primary network interface has a device index of 0.
       *
       * If you specify a network interface when launching an instance, you must specify the device
       * index.
       */
      public fun deviceIndex(deviceIndex: Number)

      /**
       * @param groups The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun groups(groups: List<String>)

      /**
       * @param groups The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun groups(vararg groups: String)

      /**
       * @param ipv6AddressCount A number of IPv6 addresses to assign to the network interface.
       * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
       * option and the option to assign specific IPv6 addresses in the same request. You can specify
       * this option if you've specified a minimum number of instances to launch.
       */
      public fun ipv6AddressCount(ipv6AddressCount: Number)

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      public fun ipv6Addresses(ipv6Addresses: IResolvable)

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      public fun ipv6Addresses(ipv6Addresses: List<Any>)

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      public fun ipv6Addresses(vararg ipv6Addresses: Any)

      /**
       * @param networkInterfaceId The ID of the network interface.
       * If you are creating a Spot Fleet, omit this parameter because you can’t specify a network
       * interface ID in a launch specification.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
       * Only one private IPv4 address can be designated as primary. You cannot specify this option
       * if you're launching more than one instance in a
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * request.
       */
      public fun privateIpAddresses(privateIpAddresses: IResolvable)

      /**
       * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
       * Only one private IPv4 address can be designated as primary. You cannot specify this option
       * if you're launching more than one instance in a
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * request.
       */
      public fun privateIpAddresses(privateIpAddresses: List<Any>)

      /**
       * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
       * Only one private IPv4 address can be designated as primary. You cannot specify this option
       * if you're launching more than one instance in a
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * request.
       */
      public fun privateIpAddresses(vararg privateIpAddresses: Any)

      /**
       * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses.
       * You can’t specify this parameter and also specify a secondary private IP address using the
       * `PrivateIpAddress` parameter.
       */
      public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

      /**
       * @param subnetId The ID of the subnet associated with the network interface.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.builder()

      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance you launch in a VPC.
       * The public IP address can only be assigned to a network interface for eth0, and can only be
       * assigned to a new network interface, not an existing one. You cannot specify more than one
       * network interface in the request. If launching into a default subnet, the default value is
       * `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
      }

      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance you launch in a VPC.
       * The public IP address can only be assigned to a network interface for eth0, and can only be
       * assigned to a new network interface, not an existing one. You cannot specify more than one
       * network interface in the request. If launching into a default subnet, the default value is
       * `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param description The description of the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param deviceIndex The position of the network interface in the attachment order.
       * A primary network interface has a device index of 0.
       *
       * If you specify a network interface when launching an instance, you must specify the device
       * index.
       */
      override fun deviceIndex(deviceIndex: Number) {
        cdkBuilder.deviceIndex(deviceIndex)
      }

      /**
       * @param groups The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      /**
       * @param groups The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun groups(vararg groups: String): Unit = groups(groups.toList())

      /**
       * @param ipv6AddressCount A number of IPv6 addresses to assign to the network interface.
       * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
       * option and the option to assign specific IPv6 addresses in the same request. You can specify
       * this option if you've specified a minimum number of instances to launch.
       */
      override fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
      }

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      override fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      override fun ipv6Addresses(ipv6Addresses: List<Any>) {
        cdkBuilder.ipv6Addresses(ipv6Addresses.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
          ipv6Addresses(ipv6Addresses.toList())

      /**
       * @param networkInterfaceId The ID of the network interface.
       * If you are creating a Spot Fleet, omit this parameter because you can’t specify a network
       * interface ID in a launch specification.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
       * Only one private IPv4 address can be designated as primary. You cannot specify this option
       * if you're launching more than one instance in a
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * request.
       */
      override fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
       * Only one private IPv4 address can be designated as primary. You cannot specify this option
       * if you're launching more than one instance in a
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * request.
       */
      override fun privateIpAddresses(privateIpAddresses: List<Any>) {
        cdkBuilder.privateIpAddresses(privateIpAddresses.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param privateIpAddresses The private IPv4 addresses to assign to the network interface.
       * Only one private IPv4 address can be designated as primary. You cannot specify this option
       * if you're launching more than one instance in a
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * request.
       */
      override fun privateIpAddresses(vararg privateIpAddresses: Any): Unit =
          privateIpAddresses(privateIpAddresses.toList())

      /**
       * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses.
       * You can’t specify this parameter and also specify a secondary private IP address using the
       * `PrivateIpAddress` parameter.
       */
      override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
      }

      /**
       * @param subnetId The ID of the subnet associated with the network interface.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty,
    ) : CdkObject(cdkObject),
        InstanceNetworkInterfaceSpecificationProperty {
      /**
       * Indicates whether to assign a public IPv4 address to an instance you launch in a VPC.
       *
       * The public IP address can only be assigned to a network interface for eth0, and can only be
       * assigned to a new network interface, not an existing one. You cannot specify more than one
       * network interface in the request. If launching into a default subnet, the default value is
       * `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-associatepublicipaddress)
       */
      override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

      /**
       * Indicates whether the network interface is deleted when the instance is terminated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * The description of the network interface.
       *
       * Applies only if creating a network interface when launching an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The position of the network interface in the attachment order.
       *
       * A primary network interface has a device index of 0.
       *
       * If you specify a network interface when launching an instance, you must specify the device
       * index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-deviceindex)
       */
      override fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

      /**
       * The IDs of the security groups for the network interface.
       *
       * Applies only if creating a network interface when launching an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-groups)
       */
      override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      /**
       * A number of IPv6 addresses to assign to the network interface.
       *
       * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
       * option and the option to assign specific IPv6 addresses in the same request. You can specify
       * this option if you've specified a minimum number of instances to launch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresscount)
       */
      override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

      /**
       * The IPv6 addresses to assign to the network interface.
       *
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-ipv6addresses)
       */
      override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

      /**
       * The ID of the network interface.
       *
       * If you are creating a Spot Fleet, omit this parameter because you can’t specify a network
       * interface ID in a launch specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * The private IPv4 addresses to assign to the network interface.
       *
       * Only one private IPv4 address can be designated as primary. You cannot specify this option
       * if you're launching more than one instance in a
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-privateipaddresses)
       */
      override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

      /**
       * The number of secondary private IPv4 addresses.
       *
       * You can’t specify this parameter and also specify a secondary private IP address using the
       * `PrivateIpAddress` parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-secondaryprivateipaddresscount)
       */
      override fun secondaryPrivateIpAddressCount(): Number? =
          unwrap(this).getSecondaryPrivateIpAddressCount()

      /**
       * The ID of the subnet associated with the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancenetworkinterfacespecification.html#cfn-ec2-spotfleet-instancenetworkinterfacespecification-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceNetworkInterfaceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty):
          InstanceNetworkInterfaceSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceNetworkInterfaceSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceNetworkInterfaceSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty
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
   * For more information, see [Specify attributes for instance type selection for EC2 Fleet or Spot
   * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
   * and [Spot placement
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
   * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
   * .cpu(CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build())
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratorcount)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratormanufacturers)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratornames)
     */
    public fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?: emptyList()

    /**
     * The minimum and maximum amount of total accelerator memory, in MiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratortotalmemorymib)
     */
    public fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

    /**
     * The accelerator types that must be on the instance type.
     *
     * * For instance types with FPGA accelerators, specify `fpga` .
     * * For instance types with GPU accelerators, specify `gpu` .
     * * For instance types with Inference accelerators, specify `inference` .
     *
     * Default: Any accelerator type
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratortypes)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-allowedinstancetypes)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-baremetal)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-baselineebsbandwidthmbps)
     */
    public fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

    /**
     * The baseline performance to consider, using an instance family as a baseline reference.
     *
     * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
     * this baseline to guide instance type selection, but there is no guarantee that the selected
     * instance types will always exceed the baseline for every application. Currently, this parameter
     * only supports CPU performance as a baseline performance factor. For more information, see
     * [Performance
     * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-baselineperformancefactors)
     */
    public fun baselinePerformanceFactors(): Any? = unwrap(this).getBaselinePerformanceFactors()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-burstableperformance)
     */
    public fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

    /**
     * The CPU manufacturers to include.
     *
     * * For instance types with Intel CPUs, specify `intel` .
     * * For instance types with AMD CPUs, specify `amd` .
     * * For instance types with AWS CPUs, specify `amazon-web-services` .
     * * For instance types with Apple CPUs, specify `apple` .
     *
     *
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with
     * a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your
     * launch template.
     *
     *
     * Default: Any manufacturer
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-cpumanufacturers)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-excludedinstancetypes)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-instancegenerations)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-localstorage)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-localstoragetypes)
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
     * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
     * threshold is based on the per vCPU or per memory price instead of the per instance price.
     *
     *
     * Only one of `SpotMaxPricePercentageOverLowestPrice` or
     * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify either,
     * Amazon EC2 will automatically apply optimal price protection to consistently select from a wide
     * range of instance types. To indicate no price protection threshold for Spot Instances, meaning
     * you want to consider all instance types that match your attributes, include one of these
     * parameters and specify a high value, such as `999999` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-maxspotpriceaspercentageofoptimalondemandprice)
     */
    public fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
        unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

    /**
     * The minimum and maximum amount of memory per vCPU, in GiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-memorygibpervcpu)
     */
    public fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

    /**
     * The minimum and maximum amount of memory, in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-memorymib)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-networkbandwidthgbps)
     */
    public fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

    /**
     * The minimum and maximum number of network interfaces.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-networkinterfacecount)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-ondemandmaxpricepercentageoverlowestprice)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-requirehibernatesupport)
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
     * Amazon EC2 will automatically apply optimal price protection to consistently select from a wide
     * range of instance types. To indicate no price protection threshold for Spot Instances, meaning
     * you want to consider all instance types that match your attributes, include one of these
     * parameters and specify a high value, such as `999999` .
     *
     *
     * Default: `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-spotmaxpricepercentageoverlowestprice)
     */
    public fun spotMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

    /**
     * The minimum and maximum amount of total local storage, in GB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-totallocalstoragegb)
     */
    public fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

    /**
     * The minimum and maximum number of vCPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-vcpucount)
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
      @JvmName("9dd7f5c7bf610209ecffc70d325c152bc449df13f10058070598a040f70d8d57")
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
      @JvmName("a8cf9cb9703f14eb82a8f73fcc25a005cf1ccaa31e5242ea3fdb2620921c52f8")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit)

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with Inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      public fun acceleratorTypes(acceleratorTypes: List<String>)

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with Inference accelerators, specify `inference` .
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
      @JvmName("ce444a765458867778cd413296fa644507b6c553db7ebf192135fc3103638111")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit)

      /**
       * @param baselinePerformanceFactors The baseline performance to consider, using an instance
       * family as a baseline reference.
       * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
       * this baseline to guide instance type selection, but there is no guarantee that the selected
       * instance types will always exceed the baseline for every application. Currently, this
       * parameter only supports CPU performance as a baseline performance factor. For more
       * information, see [Performance
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
       * in the *Amazon EC2 User Guide* .
       */
      public fun baselinePerformanceFactors(baselinePerformanceFactors: IResolvable)

      /**
       * @param baselinePerformanceFactors The baseline performance to consider, using an instance
       * family as a baseline reference.
       * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
       * this baseline to guide instance type selection, but there is no guarantee that the selected
       * instance types will always exceed the baseline for every application. Currently, this
       * parameter only supports CPU performance as a baseline performance factor. For more
       * information, see [Performance
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
       * in the *Amazon EC2 User Guide* .
       */
      public
          fun baselinePerformanceFactors(baselinePerformanceFactors: BaselinePerformanceFactorsRequestProperty)

      /**
       * @param baselinePerformanceFactors The baseline performance to consider, using an instance
       * family as a baseline reference.
       * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
       * this baseline to guide instance type selection, but there is no guarantee that the selected
       * instance types will always exceed the baseline for every application. Currently, this
       * parameter only supports CPU performance as a baseline performance factor. For more
       * information, see [Performance
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
       * in the *Amazon EC2 User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9789bf248588c2aba2e9d8ae36811eed568865028a787340b13de9de45def776")
      public
          fun baselinePerformanceFactors(baselinePerformanceFactors: BaselinePerformanceFactorsRequestProperty.Builder.() -> Unit)

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
       * * For instance types with Apple CPUs, specify `apple` .
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
       * * For instance types with Apple CPUs, specify `apple` .
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
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, Amazon EC2 will automatically apply optimal price protection to consistently select
       * from a wide range of instance types. To indicate no price protection threshold for Spot
       * Instances, meaning you want to consider all instance types that match your attributes, include
       * one of these parameters and specify a high value, such as `999999` .
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
      @JvmName("b7b5fdd2320b4d86cfa68ce1a2b7060c6dd39faf19e367cc87893f53e12377fd")
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
      @JvmName("d1e55dc0730e248586fae509d59ef249f8e88094440dd0f55a4a6c83b56dacbf")
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
      @JvmName("0174dd24edcead65c727a2273b532e9b1f0ac9946d3aa989df656d0dfbbdb913")
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
      @JvmName("35f0706514a2c7276a7e2f765daf6f31719a09e1a02759e481526025cdce636f")
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
       * either, Amazon EC2 will automatically apply optimal price protection to consistently select
       * from a wide range of instance types. To indicate no price protection threshold for Spot
       * Instances, meaning you want to consider all instance types that match your attributes, include
       * one of these parameters and specify a high value, such as `999999` .
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
      @JvmName("50564b0ff242a938558907924526f471940847924bbdbc5cebe5c89383f1a0e4")
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
      @JvmName("f6cba54a5ddca06f090236dc9a4804843ab47ff2b3010cee01398011e0ca44fe")
      public fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty.builder()

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountRequestProperty.Companion::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dd7f5c7bf610209ecffc70d325c152bc449df13f10058070598a040f70d8d57")
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
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBRequestProperty.Companion::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8cf9cb9703f14eb82a8f73fcc25a005cf1ccaa31e5242ea3fdb2620921c52f8")
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty(acceleratorTotalMemoryMiB))

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with Inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with Inference accelerators, specify `inference` .
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
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsRequestProperty.Companion::unwrap))
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
      @JvmName("ce444a765458867778cd413296fa644507b6c553db7ebf192135fc3103638111")
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty(baselineEbsBandwidthMbps))

      /**
       * @param baselinePerformanceFactors The baseline performance to consider, using an instance
       * family as a baseline reference.
       * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
       * this baseline to guide instance type selection, but there is no guarantee that the selected
       * instance types will always exceed the baseline for every application. Currently, this
       * parameter only supports CPU performance as a baseline performance factor. For more
       * information, see [Performance
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
       * in the *Amazon EC2 User Guide* .
       */
      override fun baselinePerformanceFactors(baselinePerformanceFactors: IResolvable) {
        cdkBuilder.baselinePerformanceFactors(baselinePerformanceFactors.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param baselinePerformanceFactors The baseline performance to consider, using an instance
       * family as a baseline reference.
       * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
       * this baseline to guide instance type selection, but there is no guarantee that the selected
       * instance types will always exceed the baseline for every application. Currently, this
       * parameter only supports CPU performance as a baseline performance factor. For more
       * information, see [Performance
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
       * in the *Amazon EC2 User Guide* .
       */
      override
          fun baselinePerformanceFactors(baselinePerformanceFactors: BaselinePerformanceFactorsRequestProperty) {
        cdkBuilder.baselinePerformanceFactors(baselinePerformanceFactors.let(BaselinePerformanceFactorsRequestProperty.Companion::unwrap))
      }

      /**
       * @param baselinePerformanceFactors The baseline performance to consider, using an instance
       * family as a baseline reference.
       * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
       * this baseline to guide instance type selection, but there is no guarantee that the selected
       * instance types will always exceed the baseline for every application. Currently, this
       * parameter only supports CPU performance as a baseline performance factor. For more
       * information, see [Performance
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
       * in the *Amazon EC2 User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9789bf248588c2aba2e9d8ae36811eed568865028a787340b13de9de45def776")
      override
          fun baselinePerformanceFactors(baselinePerformanceFactors: BaselinePerformanceFactorsRequestProperty.Builder.() -> Unit):
          Unit =
          baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty(baselinePerformanceFactors))

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
       * * For instance types with Apple CPUs, specify `apple` .
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
       * * For instance types with Apple CPUs, specify `apple` .
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
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, Amazon EC2 will automatically apply optimal price protection to consistently select
       * from a wide range of instance types. To indicate no price protection threshold for Spot
       * Instances, meaning you want to consider all instance types that match your attributes, include
       * one of these parameters and specify a high value, such as `999999` .
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
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuRequestProperty.Companion::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7b5fdd2320b4d86cfa68ce1a2b7060c6dd39faf19e367cc87893f53e12377fd")
      override
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit):
          Unit = memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty(memoryGiBPerVCpu))

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRequestProperty.Companion::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1e55dc0730e248586fae509d59ef249f8e88094440dd0f55a4a6c83b56dacbf")
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
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsRequestProperty.Companion::unwrap))
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
      @JvmName("0174dd24edcead65c727a2273b532e9b1f0ac9946d3aa989df656d0dfbbdb913")
      override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty(networkBandwidthGbps))

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountRequestProperty.Companion::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35f0706514a2c7276a7e2f765daf6f31719a09e1a02759e481526025cdce636f")
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
        cdkBuilder.requireHibernateSupport(requireHibernateSupport.let(IResolvable.Companion::unwrap))
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
       * either, Amazon EC2 will automatically apply optimal price protection to consistently select
       * from a wide range of instance types. To indicate no price protection threshold for Spot
       * Instances, meaning you want to consider all instance types that match your attributes, include
       * one of these parameters and specify a high value, such as `999999` .
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
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      override fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBRequestProperty.Companion::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50564b0ff242a938558907924526f471940847924bbdbc5cebe5c89383f1a0e4")
      override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBRequestProperty(totalLocalStorageGb))

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRangeRequestProperty.Companion::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6cba54a5ddca06f090236dc9a4804843ab47ff2b3010cee01398011e0ca44fe")
      override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountRangeRequestProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty,
    ) : CdkObject(cdkObject),
        InstanceRequirementsRequestProperty {
      /**
       * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
       * instance.
       *
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratorcount)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratormanufacturers)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratornames)
       */
      override fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?:
          emptyList()

      /**
       * The minimum and maximum amount of total accelerator memory, in MiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratortotalmemorymib)
       */
      override fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

      /**
       * The accelerator types that must be on the instance type.
       *
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with Inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-acceleratortypes)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-allowedinstancetypes)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-baremetal)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-baselineebsbandwidthmbps)
       */
      override fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

      /**
       * The baseline performance to consider, using an instance family as a baseline reference.
       *
       * The instance family establishes the lowest acceptable level of performance. Amazon EC2 uses
       * this baseline to guide instance type selection, but there is no guarantee that the selected
       * instance types will always exceed the baseline for every application. Currently, this
       * parameter only supports CPU performance as a baseline performance factor. For more
       * information, see [Performance
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-abis-performance-protection)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-baselineperformancefactors)
       */
      override fun baselinePerformanceFactors(): Any? = unwrap(this).getBaselinePerformanceFactors()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-burstableperformance)
       */
      override fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

      /**
       * The CPU manufacturers to include.
       *
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       * * For instance types with Apple CPUs, specify `apple` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-cpumanufacturers)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-excludedinstancetypes)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-instancegenerations)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-localstorage)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-localstoragetypes)
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
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, Amazon EC2 will automatically apply optimal price protection to consistently select
       * from a wide range of instance types. To indicate no price protection threshold for Spot
       * Instances, meaning you want to consider all instance types that match your attributes, include
       * one of these parameters and specify a high value, such as `999999` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-maxspotpriceaspercentageofoptimalondemandprice)
       */
      override fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
          unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

      /**
       * The minimum and maximum amount of memory per vCPU, in GiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-memorygibpervcpu)
       */
      override fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

      /**
       * The minimum and maximum amount of memory, in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-memorymib)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-networkbandwidthgbps)
       */
      override fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

      /**
       * The minimum and maximum number of network interfaces.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-networkinterfacecount)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-ondemandmaxpricepercentageoverlowestprice)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-requirehibernatesupport)
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
       * either, Amazon EC2 will automatically apply optimal price protection to consistently select
       * from a wide range of instance types. To indicate no price protection threshold for Spot
       * Instances, meaning you want to consider all instance types that match your attributes, include
       * one of these parameters and specify a high value, such as `999999` .
       *
       *
       * Default: `100`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-spotmaxpricepercentageoverlowestprice)
       */
      override fun spotMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

      /**
       * The minimum and maximum amount of total local storage, in GB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-totallocalstoragegb)
       */
      override fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

      /**
       * The minimum and maximum number of vCPUs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-instancerequirementsrequest.html#cfn-ec2-spotfleet-instancerequirementsrequest-vcpucount)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty):
          InstanceRequirementsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceRequirementsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty
    }
  }

  /**
   * Specifies a launch template and overrides.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LaunchTemplateConfigProperty launchTemplateConfigProperty =
   * LaunchTemplateConfigProperty.builder()
   * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
   * .version("version")
   * // the properties below are optional
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .build())
   * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
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
   * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
   * .cpu(CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build())
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
   * .priority(123)
   * .spotPrice("spotPrice")
   * .subnetId("subnetId")
   * .weightedCapacity(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html)
   */
  public interface LaunchTemplateConfigProperty {
    /**
     * The launch template to use.
     *
     * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
     * because you can't specify a network interface ID in a Spot Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-launchtemplatespecification)
     */
    public fun launchTemplateSpecification(): Any? = unwrap(this).getLaunchTemplateSpecification()

    /**
     * Any parameters that you specify override the same parameters in the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * A builder for [LaunchTemplateConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateSpecification The launch template to use.
       * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
       * because you can't specify a network interface ID in a Spot Fleet.
       */
      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable)

      /**
       * @param launchTemplateSpecification The launch template to use.
       * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
       * because you can't specify a network interface ID in a Spot Fleet.
       */
      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty)

      /**
       * @param launchTemplateSpecification The launch template to use.
       * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
       * because you can't specify a network interface ID in a Spot Fleet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1b3aa417a1a4f76a0c9f6d398854c827997616d658347bdd91e44fc06e4cf26")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty.Builder.() -> Unit)

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       */
      public fun overrides(overrides: IResolvable)

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       */
      public fun overrides(overrides: List<Any>)

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       */
      public fun overrides(vararg overrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty.builder()

      /**
       * @param launchTemplateSpecification The launch template to use.
       * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
       * because you can't specify a network interface ID in a Spot Fleet.
       */
      override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param launchTemplateSpecification The launch template to use.
       * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
       * because you can't specify a network interface ID in a Spot Fleet.
       */
      override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(FleetLaunchTemplateSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param launchTemplateSpecification The launch template to use.
       * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
       * because you can't specify a network interface ID in a Spot Fleet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1b3aa417a1a4f76a0c9f6d398854c827997616d658347bdd91e44fc06e4cf26")
      override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty(launchTemplateSpecification))

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       */
      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       */
      override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param overrides Any parameters that you specify override the same parameters in the launch
       * template.
       */
      override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty,
    ) : CdkObject(cdkObject),
        LaunchTemplateConfigProperty {
      /**
       * The launch template to use.
       *
       * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter
       * because you can't specify a network interface ID in a Spot Fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-launchtemplatespecification)
       */
      override fun launchTemplateSpecification(): Any? =
          unwrap(this).getLaunchTemplateSpecification()

      /**
       * Any parameters that you specify override the same parameters in the launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty):
          LaunchTemplateConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LaunchTemplateConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty
    }
  }

  /**
   * Specifies overrides for a launch template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LaunchTemplateOverridesProperty launchTemplateOverridesProperty =
   * LaunchTemplateOverridesProperty.builder()
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
   * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
   * .cpu(CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build())
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
   * .priority(123)
   * .spotPrice("spotPrice")
   * .subnetId("subnetId")
   * .weightedCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html)
   */
  public interface LaunchTemplateOverridesProperty {
    /**
     * The Availability Zone in which to launch the instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The instance requirements.
     *
     * When you specify instance requirements, Amazon EC2 will identify instance types with the
     * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
     * instances from these instance types, in the same way as when you specify a list of instance
     * types.
     *
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancerequirements)
     */
    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    /**
     * The instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The priority for the launch template override. The highest priority is launched first.
     *
     * If `OnDemandAllocationStrategy` is set to `prioritized` , Spot Fleet uses priority to
     * determine which launch template override to use first in fulfilling On-Demand capacity.
     *
     * If the Spot `AllocationStrategy` is set to `capacityOptimizedPrioritized` , Spot Fleet uses
     * priority on a best-effort basis to determine which launch template override to use in fulfilling
     * Spot capacity, but optimizes for capacity first.
     *
     * Valid values are whole numbers starting at `0` . The lower the number, the higher the
     * priority. If no number is set, the launch template override has the lowest priority. You can set
     * the same priority for different launch template overrides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice)
     */
    public fun spotPrice(): String? = unwrap(this).getSpotPrice()

    /**
     * The ID of the subnet in which to launch the instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The number of units provided by the specified instance type.
     *
     * These are the same units that you chose to set the target capacity in terms of instances, or
     * a performance characteristic such as vCPUs, memory, or I/O.
     *
     * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
     * number of instances to the next whole number. If this value is not specified, the default is 1.
     *
     *
     * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
     * allocation strategies is per *unit* hour (where the instance price is divided by the specified
     * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
     * resulting in only 1 instance being launched, the price used is per *instance* hour.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity)
     */
    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [LaunchTemplateOverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone in which to launch the instances.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param instanceRequirements The instance requirements.
       * When you specify instance requirements, Amazon EC2 will identify instance types with the
       * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
       * instances from these instance types, in the same way as when you specify a list of instance
       * types.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      public fun instanceRequirements(instanceRequirements: IResolvable)

      /**
       * @param instanceRequirements The instance requirements.
       * When you specify instance requirements, Amazon EC2 will identify instance types with the
       * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
       * instances from these instance types, in the same way as when you specify a list of instance
       * types.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      public fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty)

      /**
       * @param instanceRequirements The instance requirements.
       * When you specify instance requirements, Amazon EC2 will identify instance types with the
       * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
       * instances from these instance types, in the same way as when you specify a list of instance
       * types.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ddf9b5404b04aee7a64694a12d00e743d3313875085babee8d958acad6c3dbe")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit)

      /**
       * @param instanceType The instance type.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param priority The priority for the launch template override. The highest priority is
       * launched first.
       * If `OnDemandAllocationStrategy` is set to `prioritized` , Spot Fleet uses priority to
       * determine which launch template override to use first in fulfilling On-Demand capacity.
       *
       * If the Spot `AllocationStrategy` is set to `capacityOptimizedPrioritized` , Spot Fleet uses
       * priority on a best-effort basis to determine which launch template override to use in
       * fulfilling Spot capacity, but optimizes for capacity first.
       *
       * Valid values are whole numbers starting at `0` . The lower the number, the higher the
       * priority. If no number is set, the launch template override has the lowest priority. You can
       * set the same priority for different launch template overrides.
       */
      public fun priority(priority: Number)

      /**
       * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      public fun spotPrice(spotPrice: String)

      /**
       * @param subnetId The ID of the subnet in which to launch the instances.
       */
      public fun subnetId(subnetId: String)

      /**
       * @param weightedCapacity The number of units provided by the specified instance type.
       * These are the same units that you chose to set the target capacity in terms of instances,
       * or a performance characteristic such as vCPUs, memory, or I/O.
       *
       * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
       * number of instances to the next whole number. If this value is not specified, the default is
       * 1.
       *
       *
       * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
       * allocation strategies is per *unit* hour (where the instance price is divided by the specified
       * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
       * resulting in only 1 instance being launched, the price used is per *instance* hour.
       */
      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty.builder()

      /**
       * @param availabilityZone The Availability Zone in which to launch the instances.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param instanceRequirements The instance requirements.
       * When you specify instance requirements, Amazon EC2 will identify instance types with the
       * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
       * instances from these instance types, in the same way as when you specify a list of instance
       * types.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param instanceRequirements The instance requirements.
       * When you specify instance requirements, Amazon EC2 will identify instance types with the
       * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
       * instances from these instance types, in the same way as when you specify a list of instance
       * types.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      override fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsRequestProperty.Companion::unwrap))
      }

      /**
       * @param instanceRequirements The instance requirements.
       * When you specify instance requirements, Amazon EC2 will identify instance types with the
       * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
       * instances from these instance types, in the same way as when you specify a list of instance
       * types.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ddf9b5404b04aee7a64694a12d00e743d3313875085babee8d958acad6c3dbe")
      override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsRequestProperty(instanceRequirements))

      /**
       * @param instanceType The instance type.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param priority The priority for the launch template override. The highest priority is
       * launched first.
       * If `OnDemandAllocationStrategy` is set to `prioritized` , Spot Fleet uses priority to
       * determine which launch template override to use first in fulfilling On-Demand capacity.
       *
       * If the Spot `AllocationStrategy` is set to `capacityOptimizedPrioritized` , Spot Fleet uses
       * priority on a best-effort basis to determine which launch template override to use in
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
       * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      override fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
      }

      /**
       * @param subnetId The ID of the subnet in which to launch the instances.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      /**
       * @param weightedCapacity The number of units provided by the specified instance type.
       * These are the same units that you chose to set the target capacity in terms of instances,
       * or a performance characteristic such as vCPUs, memory, or I/O.
       *
       * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
       * number of instances to the next whole number. If this value is not specified, the default is
       * 1.
       *
       *
       * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
       * allocation strategies is per *unit* hour (where the instance price is divided by the specified
       * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
       * resulting in only 1 instance being launched, the price used is per *instance* hour.
       */
      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty,
    ) : CdkObject(cdkObject),
        LaunchTemplateOverridesProperty {
      /**
       * The Availability Zone in which to launch the instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The instance requirements.
       *
       * When you specify instance requirements, Amazon EC2 will identify instance types with the
       * provided requirements, and then use your On-Demand and Spot allocation strategies to launch
       * instances from these instance types, in the same way as when you specify a list of instance
       * types.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancerequirements)
       */
      override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      /**
       * The instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The priority for the launch template override. The highest priority is launched first.
       *
       * If `OnDemandAllocationStrategy` is set to `prioritized` , Spot Fleet uses priority to
       * determine which launch template override to use first in fulfilling On-Demand capacity.
       *
       * If the Spot `AllocationStrategy` is set to `capacityOptimizedPrioritized` , Spot Fleet uses
       * priority on a best-effort basis to determine which launch template override to use in
       * fulfilling Spot capacity, but optimizes for capacity first.
       *
       * Valid values are whole numbers starting at `0` . The lower the number, the higher the
       * priority. If no number is set, the launch template override has the lowest priority. You can
       * set the same priority for different launch template overrides.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice)
       */
      override fun spotPrice(): String? = unwrap(this).getSpotPrice()

      /**
       * The ID of the subnet in which to launch the instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()

      /**
       * The number of units provided by the specified instance type.
       *
       * These are the same units that you chose to set the target capacity in terms of instances,
       * or a performance characteristic such as vCPUs, memory, or I/O.
       *
       * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
       * number of instances to the next whole number. If this value is not specified, the default is
       * 1.
       *
       *
       * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
       * allocation strategies is per *unit* hour (where the instance price is divided by the specified
       * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
       * resulting in only 1 instance being launched, the price used is per *instance* hour.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity)
       */
      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty):
          LaunchTemplateOverridesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LaunchTemplateOverridesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateOverridesProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty
    }
  }

  /**
   * Specifies the Classic Load Balancers and target groups to attach to a Spot Fleet request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LoadBalancersConfigProperty loadBalancersConfigProperty = LoadBalancersConfigProperty.builder()
   * .classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty.builder()
   * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .targetGroupsConfig(TargetGroupsConfigProperty.builder()
   * .targetGroups(List.of(TargetGroupProperty.builder()
   * .arn("arn")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html)
   */
  public interface LoadBalancersConfigProperty {
    /**
     * The Classic Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-classicloadbalancersconfig)
     */
    public fun classicLoadBalancersConfig(): Any? = unwrap(this).getClassicLoadBalancersConfig()

    /**
     * The target groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-targetgroupsconfig)
     */
    public fun targetGroupsConfig(): Any? = unwrap(this).getTargetGroupsConfig()

    /**
     * A builder for [LoadBalancersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classicLoadBalancersConfig The Classic Load Balancers.
       */
      public fun classicLoadBalancersConfig(classicLoadBalancersConfig: IResolvable)

      /**
       * @param classicLoadBalancersConfig The Classic Load Balancers.
       */
      public
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty)

      /**
       * @param classicLoadBalancersConfig The Classic Load Balancers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25b177d5ab308e359fc68672e76e4f903124271a3a7479bab51b0656361308b0")
      public
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty.Builder.() -> Unit)

      /**
       * @param targetGroupsConfig The target groups.
       */
      public fun targetGroupsConfig(targetGroupsConfig: IResolvable)

      /**
       * @param targetGroupsConfig The target groups.
       */
      public fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty)

      /**
       * @param targetGroupsConfig The target groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8017e6e27f4e464d54ac3f8fdb795873361e4735def7ddb9ba1e753fc1e521c9")
      public
          fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty.builder()

      /**
       * @param classicLoadBalancersConfig The Classic Load Balancers.
       */
      override fun classicLoadBalancersConfig(classicLoadBalancersConfig: IResolvable) {
        cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param classicLoadBalancersConfig The Classic Load Balancers.
       */
      override
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty) {
        cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig.let(ClassicLoadBalancersConfigProperty.Companion::unwrap))
      }

      /**
       * @param classicLoadBalancersConfig The Classic Load Balancers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25b177d5ab308e359fc68672e76e4f903124271a3a7479bab51b0656361308b0")
      override
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty.Builder.() -> Unit):
          Unit =
          classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty(classicLoadBalancersConfig))

      /**
       * @param targetGroupsConfig The target groups.
       */
      override fun targetGroupsConfig(targetGroupsConfig: IResolvable) {
        cdkBuilder.targetGroupsConfig(targetGroupsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetGroupsConfig The target groups.
       */
      override fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty) {
        cdkBuilder.targetGroupsConfig(targetGroupsConfig.let(TargetGroupsConfigProperty.Companion::unwrap))
      }

      /**
       * @param targetGroupsConfig The target groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8017e6e27f4e464d54ac3f8fdb795873361e4735def7ddb9ba1e753fc1e521c9")
      override
          fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty.Builder.() -> Unit):
          Unit = targetGroupsConfig(TargetGroupsConfigProperty(targetGroupsConfig))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty,
    ) : CdkObject(cdkObject),
        LoadBalancersConfigProperty {
      /**
       * The Classic Load Balancers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-classicloadbalancersconfig)
       */
      override fun classicLoadBalancersConfig(): Any? = unwrap(this).getClassicLoadBalancersConfig()

      /**
       * The target groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html#cfn-ec2-spotfleet-loadbalancersconfig-targetgroupsconfig)
       */
      override fun targetGroupsConfig(): Any? = unwrap(this).getTargetGroupsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty):
          LoadBalancersConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoadBalancersConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancersConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorygibpervcpurequest.html)
   */
  public interface MemoryGiBPerVCpuRequestProperty {
    /**
     * The maximum amount of memory per vCPU, in GiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorygibpervcpurequest.html#cfn-ec2-spotfleet-memorygibpervcpurequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory per vCPU, in GiB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorygibpervcpurequest.html#cfn-ec2-spotfleet-memorygibpervcpurequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty,
    ) : CdkObject(cdkObject),
        MemoryGiBPerVCpuRequestProperty {
      /**
       * The maximum amount of memory per vCPU, in GiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorygibpervcpurequest.html#cfn-ec2-spotfleet-memorygibpervcpurequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory per vCPU, in GiB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorygibpervcpurequest.html#cfn-ec2-spotfleet-memorygibpervcpurequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty):
          MemoryGiBPerVCpuRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MemoryGiBPerVCpuRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorymibrequest.html)
   */
  public interface MemoryMiBRequestProperty {
    /**
     * The maximum amount of memory, in MiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorymibrequest.html#cfn-ec2-spotfleet-memorymibrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory, in MiB.
     *
     * To specify no minimum limit, specify `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorymibrequest.html#cfn-ec2-spotfleet-memorymibrequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty,
    ) : CdkObject(cdkObject),
        MemoryMiBRequestProperty {
      /**
       * The maximum amount of memory, in MiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorymibrequest.html#cfn-ec2-spotfleet-memorymibrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory, in MiB.
       *
       * To specify no minimum limit, specify `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorymibrequest.html#cfn-ec2-spotfleet-memorymibrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty):
          MemoryMiBRequestProperty = CdkObjectWrappers.wrap(cdkObject) as? MemoryMiBRequestProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty
    }
  }

  /**
   * The minimum and maximum amount of baseline network bandwidth, in gigabits per second (Gbps).
   *
   * For more information, see [Amazon EC2 instance network
   * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html)
   * in the *Amazon EC2 User Guide* .
   *
   * Default: No minimum or maximum limits
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkbandwidthgbpsrequest.html)
   */
  public interface NetworkBandwidthGbpsRequestProperty {
    /**
     * The maximum amount of network bandwidth, in Gbps.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkbandwidthgbpsrequest.html#cfn-ec2-spotfleet-networkbandwidthgbpsrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of network bandwidth, in Gbps.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkbandwidthgbpsrequest.html#cfn-ec2-spotfleet-networkbandwidthgbpsrequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty,
    ) : CdkObject(cdkObject),
        NetworkBandwidthGbpsRequestProperty {
      /**
       * The maximum amount of network bandwidth, in Gbps.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkbandwidthgbpsrequest.html#cfn-ec2-spotfleet-networkbandwidthgbpsrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of network bandwidth, in Gbps.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkbandwidthgbpsrequest.html#cfn-ec2-spotfleet-networkbandwidthgbpsrequest-min)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty):
          NetworkBandwidthGbpsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkBandwidthGbpsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkBandwidthGbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkinterfacecountrequest.html)
   */
  public interface NetworkInterfaceCountRequestProperty {
    /**
     * The maximum number of network interfaces.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkinterfacecountrequest.html#cfn-ec2-spotfleet-networkinterfacecountrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of network interfaces.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkinterfacecountrequest.html#cfn-ec2-spotfleet-networkinterfacecountrequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty,
    ) : CdkObject(cdkObject),
        NetworkInterfaceCountRequestProperty {
      /**
       * The maximum number of network interfaces.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkinterfacecountrequest.html#cfn-ec2-spotfleet-networkinterfacecountrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of network interfaces.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-networkinterfacecountrequest.html#cfn-ec2-spotfleet-networkinterfacecountrequest-min)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty):
          NetworkInterfaceCountRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkInterfaceCountRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty
    }
  }

  /**
   * Specify an instance family to use as the baseline reference for CPU performance.
   *
   * All instance types that match your specified attributes will be compared against the CPU
   * performance of the referenced instance family, regardless of CPU manufacturer or architecture.
   *
   *
   * Currently, only one instance family can be specified in the list.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PerformanceFactorReferenceRequestProperty performanceFactorReferenceRequestProperty =
   * PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-performancefactorreferencerequest.html)
   */
  public interface PerformanceFactorReferenceRequestProperty {
    /**
     * The instance family to use as a baseline reference.
     *
     *
     * Ensure that you specify the correct value for the instance family. The instance family is
     * everything before the period ( `.` ) in the instance type name. For example, in the instance
     * type `c6i.large` , the instance family is `c6i` , not `c6` . For more information, see [Amazon
     * EC2 instance type naming
     * conventions](https://docs.aws.amazon.com/ec2/latest/instancetypes/instance-type-names.html) in
     * *Amazon EC2 Instance Types* .
     *
     *
     * The following instance families are *not supported* for performance protection:
     *
     * * `c1`
     * * `g3` | `g3s`
     * * `hpc7g`
     * * `m1` | `m2`
     * * `mac1` | `mac2` | `mac2-m1ultra` | `mac2-m2` | `mac2-m2pro`
     * * `p3dn` | `p4d` | `p5`
     * * `t1`
     * * `u-12tb1` | `u-18tb1` | `u-24tb1` | `u-3tb1` | `u-6tb1` | `u-9tb1` | `u7i-12tb` |
     * `u7in-16tb` | `u7in-24tb` | `u7in-32tb`
     *
     * If you enable performance protection by specifying a supported instance family, the returned
     * instance types will exclude the above unsupported instance families.
     *
     * If you specify an unsupported instance family as a value for baseline performance, the API
     * returns an empty response for
     * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
     * and an exception for
     * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet.html) ,
     * [RequestSpotFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html)
     * , [ModifyFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyFleet.html) ,
     * and
     * [ModifySpotFleetRequest](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySpotFleetRequest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-performancefactorreferencerequest.html#cfn-ec2-spotfleet-performancefactorreferencerequest-instancefamily)
     */
    public fun instanceFamily(): String? = unwrap(this).getInstanceFamily()

    /**
     * A builder for [PerformanceFactorReferenceRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceFamily The instance family to use as a baseline reference.
       *
       * Ensure that you specify the correct value for the instance family. The instance family is
       * everything before the period ( `.` ) in the instance type name. For example, in the instance
       * type `c6i.large` , the instance family is `c6i` , not `c6` . For more information, see [Amazon
       * EC2 instance type naming
       * conventions](https://docs.aws.amazon.com/ec2/latest/instancetypes/instance-type-names.html) in
       * *Amazon EC2 Instance Types* .
       *
       *
       * The following instance families are *not supported* for performance protection:
       *
       * * `c1`
       * * `g3` | `g3s`
       * * `hpc7g`
       * * `m1` | `m2`
       * * `mac1` | `mac2` | `mac2-m1ultra` | `mac2-m2` | `mac2-m2pro`
       * * `p3dn` | `p4d` | `p5`
       * * `t1`
       * * `u-12tb1` | `u-18tb1` | `u-24tb1` | `u-3tb1` | `u-6tb1` | `u-9tb1` | `u7i-12tb` |
       * `u7in-16tb` | `u7in-24tb` | `u7in-32tb`
       *
       * If you enable performance protection by specifying a supported instance family, the
       * returned instance types will exclude the above unsupported instance families.
       *
       * If you specify an unsupported instance family as a value for baseline performance, the API
       * returns an empty response for
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * and an exception for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet.html) ,
       * [RequestSpotFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html)
       * , [ModifyFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyFleet.html) ,
       * and
       * [ModifySpotFleetRequest](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySpotFleetRequest.html)
       * .
       */
      public fun instanceFamily(instanceFamily: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PerformanceFactorReferenceRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PerformanceFactorReferenceRequestProperty.builder()

      /**
       * @param instanceFamily The instance family to use as a baseline reference.
       *
       * Ensure that you specify the correct value for the instance family. The instance family is
       * everything before the period ( `.` ) in the instance type name. For example, in the instance
       * type `c6i.large` , the instance family is `c6i` , not `c6` . For more information, see [Amazon
       * EC2 instance type naming
       * conventions](https://docs.aws.amazon.com/ec2/latest/instancetypes/instance-type-names.html) in
       * *Amazon EC2 Instance Types* .
       *
       *
       * The following instance families are *not supported* for performance protection:
       *
       * * `c1`
       * * `g3` | `g3s`
       * * `hpc7g`
       * * `m1` | `m2`
       * * `mac1` | `mac2` | `mac2-m1ultra` | `mac2-m2` | `mac2-m2pro`
       * * `p3dn` | `p4d` | `p5`
       * * `t1`
       * * `u-12tb1` | `u-18tb1` | `u-24tb1` | `u-3tb1` | `u-6tb1` | `u-9tb1` | `u7i-12tb` |
       * `u7in-16tb` | `u7in-24tb` | `u7in-32tb`
       *
       * If you enable performance protection by specifying a supported instance family, the
       * returned instance types will exclude the above unsupported instance families.
       *
       * If you specify an unsupported instance family as a value for baseline performance, the API
       * returns an empty response for
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * and an exception for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet.html) ,
       * [RequestSpotFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html)
       * , [ModifyFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyFleet.html) ,
       * and
       * [ModifySpotFleetRequest](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySpotFleetRequest.html)
       * .
       */
      override fun instanceFamily(instanceFamily: String) {
        cdkBuilder.instanceFamily(instanceFamily)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PerformanceFactorReferenceRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.PerformanceFactorReferenceRequestProperty,
    ) : CdkObject(cdkObject),
        PerformanceFactorReferenceRequestProperty {
      /**
       * The instance family to use as a baseline reference.
       *
       *
       * Ensure that you specify the correct value for the instance family. The instance family is
       * everything before the period ( `.` ) in the instance type name. For example, in the instance
       * type `c6i.large` , the instance family is `c6i` , not `c6` . For more information, see [Amazon
       * EC2 instance type naming
       * conventions](https://docs.aws.amazon.com/ec2/latest/instancetypes/instance-type-names.html) in
       * *Amazon EC2 Instance Types* .
       *
       *
       * The following instance families are *not supported* for performance protection:
       *
       * * `c1`
       * * `g3` | `g3s`
       * * `hpc7g`
       * * `m1` | `m2`
       * * `mac1` | `mac2` | `mac2-m1ultra` | `mac2-m2` | `mac2-m2pro`
       * * `p3dn` | `p4d` | `p5`
       * * `t1`
       * * `u-12tb1` | `u-18tb1` | `u-24tb1` | `u-3tb1` | `u-6tb1` | `u-9tb1` | `u7i-12tb` |
       * `u7in-16tb` | `u7in-24tb` | `u7in-32tb`
       *
       * If you enable performance protection by specifying a supported instance family, the
       * returned instance types will exclude the above unsupported instance families.
       *
       * If you specify an unsupported instance family as a value for baseline performance, the API
       * returns an empty response for
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * and an exception for
       * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet.html) ,
       * [RequestSpotFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html)
       * , [ModifyFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyFleet.html) ,
       * and
       * [ModifySpotFleetRequest](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySpotFleetRequest.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-performancefactorreferencerequest.html#cfn-ec2-spotfleet-performancefactorreferencerequest-instancefamily)
       */
      override fun instanceFamily(): String? = unwrap(this).getInstanceFamily()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PerformanceFactorReferenceRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.PerformanceFactorReferenceRequestProperty):
          PerformanceFactorReferenceRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PerformanceFactorReferenceRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PerformanceFactorReferenceRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PerformanceFactorReferenceRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PerformanceFactorReferenceRequestProperty
    }
  }

  /**
   * Describes a secondary private IPv4 address for a network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
   * PrivateIpAddressSpecificationProperty.builder()
   * .privateIpAddress("privateIpAddress")
   * // the properties below are optional
   * .primary(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-privateipaddressspecification.html)
   */
  public interface PrivateIpAddressSpecificationProperty {
    /**
     * Indicates whether the private IPv4 address is the primary private IPv4 address.
     *
     * Only one IPv4 address can be designated as primary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-privateipaddressspecification.html#cfn-ec2-spotfleet-privateipaddressspecification-primary)
     */
    public fun primary(): Any? = unwrap(this).getPrimary()

    /**
     * The private IPv4 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-privateipaddressspecification.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress)
     */
    public fun privateIpAddress(): String

    /**
     * A builder for [PrivateIpAddressSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      public fun primary(primary: Boolean)

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      public fun primary(primary: IResolvable)

      /**
       * @param privateIpAddress The private IPv4 address. 
       */
      public fun privateIpAddress(privateIpAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty.builder()

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param privateIpAddress The private IPv4 address. 
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty,
    ) : CdkObject(cdkObject),
        PrivateIpAddressSpecificationProperty {
      /**
       * Indicates whether the private IPv4 address is the primary private IPv4 address.
       *
       * Only one IPv4 address can be designated as primary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-privateipaddressspecification.html#cfn-ec2-spotfleet-privateipaddressspecification-primary)
       */
      override fun primary(): Any? = unwrap(this).getPrimary()

      /**
       * The private IPv4 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-privateipaddressspecification.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress)
       */
      override fun privateIpAddress(): String = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateIpAddressSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty):
          PrivateIpAddressSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateIpAddressSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddressSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty
    }
  }

  /**
   * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot
   * Instance is at an elevated risk of being interrupted.
   *
   * For more information, see [Capacity
   * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
   * in the *Amazon EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SpotCapacityRebalanceProperty spotCapacityRebalanceProperty =
   * SpotCapacityRebalanceProperty.builder()
   * .replacementStrategy("replacementStrategy")
   * .terminationDelay(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotcapacityrebalance.html)
   */
  public interface SpotCapacityRebalanceProperty {
    /**
     * The replacement strategy to use. Only available for fleets of type `maintain` .
     *
     * `launch` - Spot Fleet launches a new replacement Spot Instance when a rebalance notification
     * is emitted for an existing Spot Instance in the fleet. Spot Fleet does not terminate the
     * instances that receive a rebalance notification. You can terminate the old instances, or you can
     * leave them running. You are charged for all instances while they are running.
     *
     * `launch-before-terminate` - Spot Fleet launches a new replacement Spot Instance when a
     * rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after a
     * delay that you specify (in `TerminationDelay` ), terminates the instances that received a
     * rebalance notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotcapacityrebalance.html#cfn-ec2-spotfleet-spotcapacityrebalance-replacementstrategy)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotcapacityrebalance.html#cfn-ec2-spotfleet-spotcapacityrebalance-terminationdelay)
     */
    public fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()

    /**
     * A builder for [SpotCapacityRebalanceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replacementStrategy The replacement strategy to use. Only available for fleets of
       * type `maintain` .
       * `launch` - Spot Fleet launches a new replacement Spot Instance when a rebalance
       * notification is emitted for an existing Spot Instance in the fleet. Spot Fleet does not
       * terminate the instances that receive a rebalance notification. You can terminate the old
       * instances, or you can leave them running. You are charged for all instances while they are
       * running.
       *
       * `launch-before-terminate` - Spot Fleet launches a new replacement Spot Instance when a
       * rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after
       * a delay that you specify (in `TerminationDelay` ), terminates the instances that received a
       * rebalance notification.
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty.builder()

      /**
       * @param replacementStrategy The replacement strategy to use. Only available for fleets of
       * type `maintain` .
       * `launch` - Spot Fleet launches a new replacement Spot Instance when a rebalance
       * notification is emitted for an existing Spot Instance in the fleet. Spot Fleet does not
       * terminate the instances that receive a rebalance notification. You can terminate the old
       * instances, or you can leave them running. You are charged for all instances while they are
       * running.
       *
       * `launch-before-terminate` - Spot Fleet launches a new replacement Spot Instance when a
       * rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after
       * a delay that you specify (in `TerminationDelay` ), terminates the instances that received a
       * rebalance notification.
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

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty,
    ) : CdkObject(cdkObject),
        SpotCapacityRebalanceProperty {
      /**
       * The replacement strategy to use. Only available for fleets of type `maintain` .
       *
       * `launch` - Spot Fleet launches a new replacement Spot Instance when a rebalance
       * notification is emitted for an existing Spot Instance in the fleet. Spot Fleet does not
       * terminate the instances that receive a rebalance notification. You can terminate the old
       * instances, or you can leave them running. You are charged for all instances while they are
       * running.
       *
       * `launch-before-terminate` - Spot Fleet launches a new replacement Spot Instance when a
       * rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after
       * a delay that you specify (in `TerminationDelay` ), terminates the instances that received a
       * rebalance notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotcapacityrebalance.html#cfn-ec2-spotfleet-spotcapacityrebalance-replacementstrategy)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotcapacityrebalance.html#cfn-ec2-spotfleet-spotcapacityrebalance-terminationdelay)
       */
      override fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpotCapacityRebalanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty):
          SpotCapacityRebalanceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotCapacityRebalanceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotCapacityRebalanceProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty
    }
  }

  /**
   * Specifies the launch specification for one or more Spot Instances.
   *
   * If you include On-Demand capacity in your fleet request, you can't use
   * `SpotFleetLaunchSpecification` ; you must use
   * [LaunchTemplateConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SpotFleetLaunchSpecificationProperty spotFleetLaunchSpecificationProperty =
   * SpotFleetLaunchSpecificationProperty.builder()
   * .imageId("imageId")
   * // the properties below are optional
   * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * // the properties below are optional
   * .ebs(EbsBlockDeviceProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .snapshotId("snapshotId")
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice("noDevice")
   * .virtualName("virtualName")
   * .build()))
   * .ebsOptimized(false)
   * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
   * .arn("arn")
   * .build())
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
   * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
   * .cpu(CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build())
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
   * .kernelId("kernelId")
   * .keyName("keyName")
   * .monitoring(SpotFleetMonitoringProperty.builder()
   * .enabled(false)
   * .build())
   * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
   * .associatePublicIpAddress(false)
   * .deleteOnTermination(false)
   * .description("description")
   * .deviceIndex(123)
   * .groups(List.of("groups"))
   * .ipv6AddressCount(123)
   * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build()))
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
   * .privateIpAddress("privateIpAddress")
   * // the properties below are optional
   * .primary(false)
   * .build()))
   * .secondaryPrivateIpAddressCount(123)
   * .subnetId("subnetId")
   * .build()))
   * .placement(SpotPlacementProperty.builder()
   * .availabilityZone("availabilityZone")
   * .groupName("groupName")
   * .tenancy("tenancy")
   * .build())
   * .ramdiskId("ramdiskId")
   * .securityGroups(List.of(GroupIdentifierProperty.builder()
   * .groupId("groupId")
   * .build()))
   * .spotPrice("spotPrice")
   * .subnetId("subnetId")
   * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .userData("userData")
   * .weightedCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html)
   */
  public interface SpotFleetLaunchSpecificationProperty {
    /**
     * One or more block devices that are mapped to the Spot Instances.
     *
     * You can't specify both a snapshot ID and an encryption value. This is because only blank
     * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
     * and its encryption status is used for the volume encryption status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings)
     */
    public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * Indicates whether the instances are optimized for EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS Optimized instance.
     *
     * Default: `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized)
     */
    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * The IAM instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-iaminstanceprofile)
     */
    public fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

    /**
     * The ID of the AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid)
     */
    public fun imageId(): String

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancerequirements)
     */
    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    /**
     * The instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The ID of the kernel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid)
     */
    public fun kernelId(): String? = unwrap(this).getKernelId()

    /**
     * The name of the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname)
     */
    public fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * Enable or disable monitoring for the instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-monitoring)
     */
    public fun monitoring(): Any? = unwrap(this).getMonitoring()

    /**
     * The network interfaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces)
     */
    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /**
     * The placement information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-placement)
     */
    public fun placement(): Any? = unwrap(this).getPlacement()

    /**
     * The ID of the RAM disk.
     *
     * Some kernels require additional drivers at launch. Check the kernel requirements for
     * information about whether you need to specify a RAM disk. To find kernel requirements, refer to
     * the AWS Resource Center and search for the kernel ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid)
     */
    public fun ramdiskId(): String? = unwrap(this).getRamdiskId()

    /**
     * The security groups.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface instead of using this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups)
     */
    public fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice)
     */
    public fun spotPrice(): String? = unwrap(this).getSpotPrice()

    /**
     * The IDs of the subnets in which to launch the instances.
     *
     * To specify multiple subnets, separate them using commas; for example,
     * "subnet-1234abcdeexample1, subnet-0987cdef6example2".
     *
     * If you specify a network interface, you must specify any subnets as part of the network
     * interface instead of using this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The tags to apply during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications)
     */
    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * The base64-encoded user data that instances use when starting up.
     *
     * User data is limited to 16 KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata)
     */
    public fun userData(): String? = unwrap(this).getUserData()

    /**
     * The number of units provided by the specified instance type.
     *
     * These are the same units that you chose to set the target capacity in terms of instances, or
     * a performance characteristic such as vCPUs, memory, or I/O.
     *
     * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
     * number of instances to the next whole number. If this value is not specified, the default is 1.
     *
     *
     * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
     * allocation strategies is per *unit* hour (where the instance price is divided by the specified
     * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
     * resulting in only 1 instance being launched, the price used is per *instance* hour.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity)
     */
    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [SpotFleetLaunchSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
       * You can't specify both a snapshot ID and an encryption value. This is because only blank
       * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
       * and its encryption status is used for the volume encryption status.
       */
      public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

      /**
       * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
       * You can't specify both a snapshot ID and an encryption value. This is because only blank
       * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
       * and its encryption status is used for the volume encryption status.
       */
      public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

      /**
       * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
       * You can't specify both a snapshot ID and an encryption value. This is because only blank
       * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
       * and its encryption status is used for the volume encryption status.
       */
      public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

      /**
       * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal EBS I/O performance. This optimization isn't available
       * with all instance types. Additional usage charges apply when using an EBS Optimized instance.
       *
       * Default: `false`
       */
      public fun ebsOptimized(ebsOptimized: Boolean)

      /**
       * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal EBS I/O performance. This optimization isn't available
       * with all instance types. Additional usage charges apply when using an EBS Optimized instance.
       *
       * Default: `false`
       */
      public fun ebsOptimized(ebsOptimized: IResolvable)

      /**
       * @param iamInstanceProfile The IAM instance profile.
       */
      public fun iamInstanceProfile(iamInstanceProfile: IResolvable)

      /**
       * @param iamInstanceProfile The IAM instance profile.
       */
      public fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty)

      /**
       * @param iamInstanceProfile The IAM instance profile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27defe39cf25aa0ac99309255b618b67de87e7d99a5086d1362888a4ad41fa04")
      public
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty.Builder.() -> Unit)

      /**
       * @param imageId The ID of the AMI. 
       */
      public fun imageId(imageId: String)

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
      @JvmName("02de0f240290c8b4000b34fb4f071f8d4f4c1a8c3edc2ec04c0d2307dbf00139")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit)

      /**
       * @param instanceType The instance type.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param kernelId The ID of the kernel.
       */
      public fun kernelId(kernelId: String)

      /**
       * @param keyName The name of the key pair.
       */
      public fun keyName(keyName: String)

      /**
       * @param monitoring Enable or disable monitoring for the instances.
       */
      public fun monitoring(monitoring: IResolvable)

      /**
       * @param monitoring Enable or disable monitoring for the instances.
       */
      public fun monitoring(monitoring: SpotFleetMonitoringProperty)

      /**
       * @param monitoring Enable or disable monitoring for the instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3bbdaba45c70bc746a8f3bc59611c1106c07f3c179d500e0d94f73243a1bb4")
      public fun monitoring(monitoring: SpotFleetMonitoringProperty.Builder.() -> Unit)

      /**
       * @param networkInterfaces The network interfaces.
       */
      public fun networkInterfaces(networkInterfaces: IResolvable)

      /**
       * @param networkInterfaces The network interfaces.
       */
      public fun networkInterfaces(networkInterfaces: List<Any>)

      /**
       * @param networkInterfaces The network interfaces.
       */
      public fun networkInterfaces(vararg networkInterfaces: Any)

      /**
       * @param placement The placement information.
       */
      public fun placement(placement: IResolvable)

      /**
       * @param placement The placement information.
       */
      public fun placement(placement: SpotPlacementProperty)

      /**
       * @param placement The placement information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("153369991422b324183ed5a6fd319782210572c6f7e7c729150fb5bd073cd9b5")
      public fun placement(placement: SpotPlacementProperty.Builder.() -> Unit)

      /**
       * @param ramdiskId The ID of the RAM disk.
       * Some kernels require additional drivers at launch. Check the kernel requirements for
       * information about whether you need to specify a RAM disk. To find kernel requirements, refer
       * to the AWS Resource Center and search for the kernel ID.
       */
      public fun ramdiskId(ramdiskId: String)

      /**
       * @param securityGroups The security groups.
       * If you specify a network interface, you must specify any security groups as part of the
       * network interface instead of using this parameter.
       */
      public fun securityGroups(securityGroups: IResolvable)

      /**
       * @param securityGroups The security groups.
       * If you specify a network interface, you must specify any security groups as part of the
       * network interface instead of using this parameter.
       */
      public fun securityGroups(securityGroups: List<Any>)

      /**
       * @param securityGroups The security groups.
       * If you specify a network interface, you must specify any security groups as part of the
       * network interface instead of using this parameter.
       */
      public fun securityGroups(vararg securityGroups: Any)

      /**
       * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      public fun spotPrice(spotPrice: String)

      /**
       * @param subnetId The IDs of the subnets in which to launch the instances.
       * To specify multiple subnets, separate them using commas; for example,
       * "subnet-1234abcdeexample1, subnet-0987cdef6example2".
       *
       * If you specify a network interface, you must specify any subnets as part of the network
       * interface instead of using this parameter.
       */
      public fun subnetId(subnetId: String)

      /**
       * @param tagSpecifications The tags to apply during creation.
       */
      public fun tagSpecifications(tagSpecifications: IResolvable)

      /**
       * @param tagSpecifications The tags to apply during creation.
       */
      public fun tagSpecifications(tagSpecifications: List<Any>)

      /**
       * @param tagSpecifications The tags to apply during creation.
       */
      public fun tagSpecifications(vararg tagSpecifications: Any)

      /**
       * @param userData The base64-encoded user data that instances use when starting up.
       * User data is limited to 16 KB.
       */
      public fun userData(userData: String)

      /**
       * @param weightedCapacity The number of units provided by the specified instance type.
       * These are the same units that you chose to set the target capacity in terms of instances,
       * or a performance characteristic such as vCPUs, memory, or I/O.
       *
       * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
       * number of instances to the next whole number. If this value is not specified, the default is
       * 1.
       *
       *
       * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
       * allocation strategies is per *unit* hour (where the instance price is divided by the specified
       * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
       * resulting in only 1 instance being launched, the price used is per *instance* hour.
       */
      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty.builder()

      /**
       * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
       * You can't specify both a snapshot ID and an encryption value. This is because only blank
       * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
       * and its encryption status is used for the volume encryption status.
       */
      override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
       * You can't specify both a snapshot ID and an encryption value. This is because only blank
       * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
       * and its encryption status is used for the volume encryption status.
       */
      override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
       * You can't specify both a snapshot ID and an encryption value. This is because only blank
       * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
       * and its encryption status is used for the volume encryption status.
       */
      override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
          blockDeviceMappings(blockDeviceMappings.toList())

      /**
       * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal EBS I/O performance. This optimization isn't available
       * with all instance types. Additional usage charges apply when using an EBS Optimized instance.
       *
       * Default: `false`
       */
      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      /**
       * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal EBS I/O performance. This optimization isn't available
       * with all instance types. Additional usage charges apply when using an EBS Optimized instance.
       *
       * Default: `false`
       */
      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamInstanceProfile The IAM instance profile.
       */
      override fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamInstanceProfile The IAM instance profile.
       */
      override fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IamInstanceProfileSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param iamInstanceProfile The IAM instance profile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27defe39cf25aa0ac99309255b618b67de87e7d99a5086d1362888a4ad41fa04")
      override
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty.Builder.() -> Unit):
          Unit = iamInstanceProfile(IamInstanceProfileSpecificationProperty(iamInstanceProfile))

      /**
       * @param imageId The ID of the AMI. 
       */
      override fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
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
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsRequestProperty.Companion::unwrap))
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
      @JvmName("02de0f240290c8b4000b34fb4f071f8d4f4c1a8c3edc2ec04c0d2307dbf00139")
      override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsRequestProperty(instanceRequirements))

      /**
       * @param instanceType The instance type.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param kernelId The ID of the kernel.
       */
      override fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
      }

      /**
       * @param keyName The name of the key pair.
       */
      override fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
      }

      /**
       * @param monitoring Enable or disable monitoring for the instances.
       */
      override fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param monitoring Enable or disable monitoring for the instances.
       */
      override fun monitoring(monitoring: SpotFleetMonitoringProperty) {
        cdkBuilder.monitoring(monitoring.let(SpotFleetMonitoringProperty.Companion::unwrap))
      }

      /**
       * @param monitoring Enable or disable monitoring for the instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3bbdaba45c70bc746a8f3bc59611c1106c07f3c179d500e0d94f73243a1bb4")
      override fun monitoring(monitoring: SpotFleetMonitoringProperty.Builder.() -> Unit): Unit =
          monitoring(SpotFleetMonitoringProperty(monitoring))

      /**
       * @param networkInterfaces The network interfaces.
       */
      override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkInterfaces The network interfaces.
       */
      override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkInterfaces The network interfaces.
       */
      override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
          networkInterfaces(networkInterfaces.toList())

      /**
       * @param placement The placement information.
       */
      override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param placement The placement information.
       */
      override fun placement(placement: SpotPlacementProperty) {
        cdkBuilder.placement(placement.let(SpotPlacementProperty.Companion::unwrap))
      }

      /**
       * @param placement The placement information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("153369991422b324183ed5a6fd319782210572c6f7e7c729150fb5bd073cd9b5")
      override fun placement(placement: SpotPlacementProperty.Builder.() -> Unit): Unit =
          placement(SpotPlacementProperty(placement))

      /**
       * @param ramdiskId The ID of the RAM disk.
       * Some kernels require additional drivers at launch. Check the kernel requirements for
       * information about whether you need to specify a RAM disk. To find kernel requirements, refer
       * to the AWS Resource Center and search for the kernel ID.
       */
      override fun ramdiskId(ramdiskId: String) {
        cdkBuilder.ramdiskId(ramdiskId)
      }

      /**
       * @param securityGroups The security groups.
       * If you specify a network interface, you must specify any security groups as part of the
       * network interface instead of using this parameter.
       */
      override fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityGroups The security groups.
       * If you specify a network interface, you must specify any security groups as part of the
       * network interface instead of using this parameter.
       */
      override fun securityGroups(securityGroups: List<Any>) {
        cdkBuilder.securityGroups(securityGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param securityGroups The security groups.
       * If you specify a network interface, you must specify any security groups as part of the
       * network interface instead of using this parameter.
       */
      override fun securityGroups(vararg securityGroups: Any): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      override fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
      }

      /**
       * @param subnetId The IDs of the subnets in which to launch the instances.
       * To specify multiple subnets, separate them using commas; for example,
       * "subnet-1234abcdeexample1, subnet-0987cdef6example2".
       *
       * If you specify a network interface, you must specify any subnets as part of the network
       * interface instead of using this parameter.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      /**
       * @param tagSpecifications The tags to apply during creation.
       */
      override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tagSpecifications The tags to apply during creation.
       */
      override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param tagSpecifications The tags to apply during creation.
       */
      override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
          tagSpecifications(tagSpecifications.toList())

      /**
       * @param userData The base64-encoded user data that instances use when starting up.
       * User data is limited to 16 KB.
       */
      override fun userData(userData: String) {
        cdkBuilder.userData(userData)
      }

      /**
       * @param weightedCapacity The number of units provided by the specified instance type.
       * These are the same units that you chose to set the target capacity in terms of instances,
       * or a performance characteristic such as vCPUs, memory, or I/O.
       *
       * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
       * number of instances to the next whole number. If this value is not specified, the default is
       * 1.
       *
       *
       * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
       * allocation strategies is per *unit* hour (where the instance price is divided by the specified
       * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
       * resulting in only 1 instance being launched, the price used is per *instance* hour.
       */
      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty,
    ) : CdkObject(cdkObject),
        SpotFleetLaunchSpecificationProperty {
      /**
       * One or more block devices that are mapped to the Spot Instances.
       *
       * You can't specify both a snapshot ID and an encryption value. This is because only blank
       * volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank
       * and its encryption status is used for the volume encryption status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings)
       */
      override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

      /**
       * Indicates whether the instances are optimized for EBS I/O.
       *
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal EBS I/O performance. This optimization isn't available
       * with all instance types. Additional usage charges apply when using an EBS Optimized instance.
       *
       * Default: `false`
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized)
       */
      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

      /**
       * The IAM instance profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-iaminstanceprofile)
       */
      override fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

      /**
       * The ID of the AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid)
       */
      override fun imageId(): String = unwrap(this).getImageId()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancerequirements)
       */
      override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      /**
       * The instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The ID of the kernel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid)
       */
      override fun kernelId(): String? = unwrap(this).getKernelId()

      /**
       * The name of the key pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname)
       */
      override fun keyName(): String? = unwrap(this).getKeyName()

      /**
       * Enable or disable monitoring for the instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-monitoring)
       */
      override fun monitoring(): Any? = unwrap(this).getMonitoring()

      /**
       * The network interfaces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces)
       */
      override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      /**
       * The placement information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-placement)
       */
      override fun placement(): Any? = unwrap(this).getPlacement()

      /**
       * The ID of the RAM disk.
       *
       * Some kernels require additional drivers at launch. Check the kernel requirements for
       * information about whether you need to specify a RAM disk. To find kernel requirements, refer
       * to the AWS Resource Center and search for the kernel ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid)
       */
      override fun ramdiskId(): String? = unwrap(this).getRamdiskId()

      /**
       * The security groups.
       *
       * If you specify a network interface, you must specify any security groups as part of the
       * network interface instead of using this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups)
       */
      override fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice)
       */
      override fun spotPrice(): String? = unwrap(this).getSpotPrice()

      /**
       * The IDs of the subnets in which to launch the instances.
       *
       * To specify multiple subnets, separate them using commas; for example,
       * "subnet-1234abcdeexample1, subnet-0987cdef6example2".
       *
       * If you specify a network interface, you must specify any subnets as part of the network
       * interface instead of using this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()

      /**
       * The tags to apply during creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications)
       */
      override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      /**
       * The base64-encoded user data that instances use when starting up.
       *
       * User data is limited to 16 KB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata)
       */
      override fun userData(): String? = unwrap(this).getUserData()

      /**
       * The number of units provided by the specified instance type.
       *
       * These are the same units that you chose to set the target capacity in terms of instances,
       * or a performance characteristic such as vCPUs, memory, or I/O.
       *
       * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
       * number of instances to the next whole number. If this value is not specified, the default is
       * 1.
       *
       *
       * When specifying weights, the price used in the `lowestPrice` and `priceCapacityOptimized`
       * allocation strategies is per *unit* hour (where the instance price is divided by the specified
       * weight). However, if all the specified weights are above the requested `TargetCapacity` ,
       * resulting in only 1 instance being launched, the price used is per *instance* hour.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetlaunchspecification.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity)
       */
      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotFleetLaunchSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty):
          SpotFleetLaunchSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotFleetLaunchSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetLaunchSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty
    }
  }

  /**
   * Describes whether monitoring is enabled.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SpotFleetMonitoringProperty spotFleetMonitoringProperty = SpotFleetMonitoringProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetmonitoring.html)
   */
  public interface SpotFleetMonitoringProperty {
    /**
     * Enables monitoring for the instance.
     *
     * Default: `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetmonitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [SpotFleetMonitoringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Enables monitoring for the instance.
       * Default: `false`
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Enables monitoring for the instance.
       * Default: `false`
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty.builder()

      /**
       * @param enabled Enables monitoring for the instance.
       * Default: `false`
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Enables monitoring for the instance.
       * Default: `false`
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty,
    ) : CdkObject(cdkObject),
        SpotFleetMonitoringProperty {
      /**
       * Enables monitoring for the instance.
       *
       * Default: `false`
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetmonitoring.html#cfn-ec2-spotfleet-spotfleetmonitoring-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpotFleetMonitoringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty):
          SpotFleetMonitoringProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotFleetMonitoringProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetMonitoringProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty
    }
  }

  /**
   * Specifies the configuration of a Spot Fleet request.
   *
   * For more information, see [Spot
   * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet.html) in the *Amazon EC2
   * User Guide* .
   *
   * You must specify either `LaunchSpecifications` or `LaunchTemplateConfigs` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SpotFleetRequestConfigDataProperty spotFleetRequestConfigDataProperty =
   * SpotFleetRequestConfigDataProperty.builder()
   * .iamFleetRole("iamFleetRole")
   * .targetCapacity(123)
   * // the properties below are optional
   * .allocationStrategy("allocationStrategy")
   * .context("context")
   * .excessCapacityTerminationPolicy("excessCapacityTerminationPolicy")
   * .instanceInterruptionBehavior("instanceInterruptionBehavior")
   * .instancePoolsToUseCount(123)
   * .launchSpecifications(List.of(SpotFleetLaunchSpecificationProperty.builder()
   * .imageId("imageId")
   * // the properties below are optional
   * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * // the properties below are optional
   * .ebs(EbsBlockDeviceProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .snapshotId("snapshotId")
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice("noDevice")
   * .virtualName("virtualName")
   * .build()))
   * .ebsOptimized(false)
   * .iamInstanceProfile(IamInstanceProfileSpecificationProperty.builder()
   * .arn("arn")
   * .build())
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
   * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
   * .cpu(CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build())
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
   * .kernelId("kernelId")
   * .keyName("keyName")
   * .monitoring(SpotFleetMonitoringProperty.builder()
   * .enabled(false)
   * .build())
   * .networkInterfaces(List.of(InstanceNetworkInterfaceSpecificationProperty.builder()
   * .associatePublicIpAddress(false)
   * .deleteOnTermination(false)
   * .description("description")
   * .deviceIndex(123)
   * .groups(List.of("groups"))
   * .ipv6AddressCount(123)
   * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build()))
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
   * .privateIpAddress("privateIpAddress")
   * // the properties below are optional
   * .primary(false)
   * .build()))
   * .secondaryPrivateIpAddressCount(123)
   * .subnetId("subnetId")
   * .build()))
   * .placement(SpotPlacementProperty.builder()
   * .availabilityZone("availabilityZone")
   * .groupName("groupName")
   * .tenancy("tenancy")
   * .build())
   * .ramdiskId("ramdiskId")
   * .securityGroups(List.of(GroupIdentifierProperty.builder()
   * .groupId("groupId")
   * .build()))
   * .spotPrice("spotPrice")
   * .subnetId("subnetId")
   * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .userData("userData")
   * .weightedCapacity(123)
   * .build()))
   * .launchTemplateConfigs(List.of(LaunchTemplateConfigProperty.builder()
   * .launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty.builder()
   * .version("version")
   * // the properties below are optional
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .build())
   * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
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
   * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
   * .cpu(CpuPerformanceFactorRequestProperty.builder()
   * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
   * .instanceFamily("instanceFamily")
   * .build()))
   * .build())
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
   * .priority(123)
   * .spotPrice("spotPrice")
   * .subnetId("subnetId")
   * .weightedCapacity(123)
   * .build()))
   * .build()))
   * .loadBalancersConfig(LoadBalancersConfigProperty.builder()
   * .classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty.builder()
   * .classicLoadBalancers(List.of(ClassicLoadBalancerProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .targetGroupsConfig(TargetGroupsConfigProperty.builder()
   * .targetGroups(List.of(TargetGroupProperty.builder()
   * .arn("arn")
   * .build()))
   * .build())
   * .build())
   * .onDemandAllocationStrategy("onDemandAllocationStrategy")
   * .onDemandMaxTotalPrice("onDemandMaxTotalPrice")
   * .onDemandTargetCapacity(123)
   * .replaceUnhealthyInstances(false)
   * .spotMaintenanceStrategies(SpotMaintenanceStrategiesProperty.builder()
   * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
   * .replacementStrategy("replacementStrategy")
   * .terminationDelay(123)
   * .build())
   * .build())
   * .spotMaxTotalPrice("spotMaxTotalPrice")
   * .spotPrice("spotPrice")
   * .tagSpecifications(List.of(SpotFleetTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .targetCapacityUnitType("targetCapacityUnitType")
   * .terminateInstancesWithExpiration(false)
   * .type("type")
   * .validFrom("validFrom")
   * .validUntil("validUntil")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html)
   */
  public interface SpotFleetRequestConfigDataProperty {
    /**
     * The strategy that determines how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the Spot Fleet launch configuration.
     *
     * For more information, see [Allocation strategies for Spot
     * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-allocation-strategy.html)
     * in the *Amazon EC2 User Guide* .
     *
     * * **priceCapacityOptimized (recommended)** - Spot Fleet identifies the pools with the highest
     * capacity availability for the number of instances that are launching. This means that we will
     * request Spot Instances from the pools that we believe have the lowest chance of interruption in
     * the near term. Spot Fleet then requests Spot Instances from the lowest priced of these pools.
     * * **capacityOptimized** - Spot Fleet identifies the pools with the highest capacity
     * availability for the number of instances that are launching. This means that we will request
     * Spot Instances from the pools that we believe have the lowest chance of interruption in the near
     * term. To give certain instance types a higher chance of launching first, use
     * `capacityOptimizedPrioritized` . Set a priority for each instance type by using the `Priority`
     * parameter for `LaunchTemplateOverrides` . You can assign the same priority to different
     * `LaunchTemplateOverrides` . EC2 implements the priorities on a best-effort basis, but optimizes
     * for capacity first. `capacityOptimizedPrioritized` is supported only if your Spot Fleet uses a
     * launch template. Note that if the `OnDemandAllocationStrategy` is set to `prioritized` , the
     * same priority is applied when fulfilling On-Demand capacity.
     * * **diversified** - Spot Fleet requests instances from all of the Spot Instance pools that
     * you specify.
     * * **lowestPrice (not recommended)** - &gt; We don't recommend the `lowestPrice` allocation
     * strategy because it has the highest risk of interruption for your Spot Instances.
     *
     * Spot Fleet requests instances from the lowest priced Spot Instance pool that has available
     * capacity. If the lowest priced pool doesn't have available capacity, the Spot Instances come
     * from the next lowest priced pool that has available capacity. If a pool runs out of capacity
     * before fulfilling your desired capacity, Spot Fleet will continue to fulfill your request by
     * drawing from the next lowest priced pool. To ensure that your desired capacity is met, you might
     * receive Spot Instances from several pools. Because this strategy only considers instance price
     * and not capacity availability, it might lead to high interruption rates.
     *
     * Default: `lowestPrice`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy)
     */
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-context)
     */
    public fun context(): String? = unwrap(this).getContext()

    /**
     * Indicates whether running Spot Instances should be terminated if you decrease the target
     * capacity of the Spot Fleet request below the current size of the Spot Fleet.
     *
     * Supported only for fleets of type `maintain` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy)
     */
    public fun excessCapacityTerminationPolicy(): String? =
        unwrap(this).getExcessCapacityTerminationPolicy()

    /**
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that
     * grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your
     * behalf.
     *
     * For more information, see [Spot Fleet
     * Prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites)
     * in the *Amazon EC2 User Guide* . Spot Fleet can terminate Spot Instances on your behalf when you
     * cancel its Spot Fleet request or when the Spot Fleet request expires, if you set
     * `TerminateInstancesWithExpiration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole)
     */
    public fun iamFleetRole(): String

    /**
     * The behavior when a Spot Instance is interrupted.
     *
     * The default is `terminate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior)
     */
    public fun instanceInterruptionBehavior(): String? =
        unwrap(this).getInstanceInterruptionBehavior()

    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     *
     * Valid only when Spot *AllocationStrategy* is set to `lowest-price` . Spot Fleet selects the
     * cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     *
     * Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you
     * specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your
     * target capacity, Spot Fleet will continue to fulfill your request by drawing from the next
     * cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances from
     * more than the number of pools that you specified. Similarly, if most of the pools have no Spot
     * capacity, you might receive your full target capacity from fewer than the number of pools that
     * you specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instancepoolstousecount)
     */
    public fun instancePoolsToUseCount(): Number? = unwrap(this).getInstancePoolsToUseCount()

    /**
     * The launch specifications for the Spot Fleet request.
     *
     * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications)
     */
    public fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

    /**
     * The launch template and overrides.
     *
     * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs)
     */
    public fun launchTemplateConfigs(): Any? = unwrap(this).getLaunchTemplateConfigs()

    /**
     * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request.
     *
     * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and
     * target groups.
     *
     * With Network Load Balancers, Spot Fleet cannot register instances that have the following
     * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-loadbalancersconfig)
     */
    public fun loadBalancersConfig(): Any? = unwrap(this).getLoadBalancersConfig()

    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity.
     *
     * If you specify `lowestPrice` , Spot Fleet uses price to determine the order, launching the
     * lowest price first. If you specify `prioritized` , Spot Fleet uses the priority that you assign
     * to each Spot Fleet launch template override, launching the highest priority first. If you do not
     * specify a value, Spot Fleet defaults to `lowestPrice` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-ondemandallocationstrategy)
     */
    public fun onDemandAllocationStrategy(): String? = unwrap(this).getOnDemandAllocationStrategy()

    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay.
     *
     * You can use the `onDemandMaxTotalPrice` parameter, the `spotMaxTotalPrice` parameter, or both
     * parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum
     * price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will
     * launch instances until it reaches the maximum amount you're willing to pay. When the maximum
     * amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t
     * met the target capacity.
     *
     *
     * If your fleet includes T instances that are configured as `unlimited` , and if their average
     * CPU usage exceeds the baseline utilization, you will incur a charge for surplus credits. The
     * `onDemandMaxTotalPrice` does not account for surplus credits, and, if you use surplus credits,
     * your final cost might be higher than what you specified for `onDemandMaxTotalPrice` . For more
     * information, see [Surplus credits can incur
     * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
     * in the *Amazon EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-ondemandmaxtotalprice)
     */
    public fun onDemandMaxTotalPrice(): String? = unwrap(this).getOnDemandMaxTotalPrice()

    /**
     * The number of On-Demand units to request.
     *
     * You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If
     * the request type is `maintain` , you can specify a target capacity of 0 and add capacity later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-ondemandtargetcapacity)
     */
    public fun onDemandTargetCapacity(): Number? = unwrap(this).getOnDemandTargetCapacity()

    /**
     * Indicates whether Spot Fleet should replace unhealthy instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances)
     */
    public fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

    /**
     * The strategies for managing your Spot Instances that are at an elevated risk of being
     * interrupted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotmaintenancestrategies)
     */
    public fun spotMaintenanceStrategies(): Any? = unwrap(this).getSpotMaintenanceStrategies()

    /**
     * The maximum amount per hour for Spot Instances that you're willing to pay.
     *
     * You can use the `spotMaxTotalPrice` parameter, the `onDemandMaxTotalPrice` parameter, or both
     * parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum
     * price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will
     * launch instances until it reaches the maximum amount you're willing to pay. When the maximum
     * amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t
     * met the target capacity.
     *
     *
     * If your fleet includes T instances that are configured as `unlimited` , and if their average
     * CPU usage exceeds the baseline utilization, you will incur a charge for surplus credits. The
     * `spotMaxTotalPrice` does not account for surplus credits, and, if you use surplus credits, your
     * final cost might be higher than what you specified for `spotMaxTotalPrice` . For more
     * information, see [Surplus credits can incur
     * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
     * in the *Amazon EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotmaxtotalprice)
     */
    public fun spotMaxTotalPrice(): String? = unwrap(this).getSpotMaxTotalPrice()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice)
     */
    public fun spotPrice(): String? = unwrap(this).getSpotPrice()

    /**
     * The key-value pair for tagging the Spot Fleet request on creation.
     *
     * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet request
     * fails. To tag instances at launch, specify the tags in the [launch
     * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
     * (valid only if you use `LaunchTemplateConfigs` ) or in the
     * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
     * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch, see
     * [Tag your
     * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-tagspecifications)
     */
    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * The number of units to request for the Spot Fleet.
     *
     * You can choose to set the target capacity in terms of instances or a performance
     * characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If
     * the request type is `maintain` , you can specify a target capacity of 0 and add capacity later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity)
     */
    public fun targetCapacity(): Number

    /**
     * The unit for the target capacity. You can specify this parameter only when using
     * attribute-based instance type selection.
     *
     * Default: `units` (the number of instances)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacityunittype)
     */
    public fun targetCapacityUnitType(): String? = unwrap(this).getTargetCapacityUnitType()

    /**
     * Indicates whether running Spot Instances are terminated when the Spot Fleet request expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration)
     */
    public fun terminateInstancesWithExpiration(): Any? =
        unwrap(this).getTerminateInstancesWithExpiration()

    /**
     * The type of request.
     *
     * Indicates whether the Spot Fleet only requests the target capacity or also attempts to
     * maintain it. When this value is `request` , the Spot Fleet only places the required requests. It
     * does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit
     * requests in alternative Spot pools if capacity is not available. When this value is `maintain` ,
     * the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to
     * meet capacity and automatically replenishes any interrupted instances. Default: `maintain` .
     * `instant` is listed but is not used by Spot Fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The start date and time of the request, in UTC format ( *YYYY* - *MM* - *DD* T *HH* : *MM* :
     * *SS* Z).
     *
     * By default, Amazon EC2 starts fulfilling the request immediately.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom)
     */
    public fun validFrom(): String? = unwrap(this).getValidFrom()

    /**
     * The end date and time of the request, in UTC format ( *YYYY* - *MM* - *DD* T *HH* : *MM* :
     * *SS* Z).
     *
     * After the end date and time, no new Spot Instance requests are placed or able to fulfill the
     * request. If no value is specified, the Spot Fleet request remains until you cancel it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil)
     */
    public fun validUntil(): String? = unwrap(this).getValidUntil()

    /**
     * A builder for [SpotFleetRequestConfigDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy The strategy that determines how to allocate the target Spot
       * Instance capacity across the Spot Instance pools specified by the Spot Fleet launch
       * configuration.
       * For more information, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide* .
       *
       * * **priceCapacityOptimized (recommended)** - Spot Fleet identifies the pools with the
       * highest capacity availability for the number of instances that are launching. This means that
       * we will request Spot Instances from the pools that we believe have the lowest chance of
       * interruption in the near term. Spot Fleet then requests Spot Instances from the lowest priced
       * of these pools.
       * * **capacityOptimized** - Spot Fleet identifies the pools with the highest capacity
       * availability for the number of instances that are launching. This means that we will request
       * Spot Instances from the pools that we believe have the lowest chance of interruption in the
       * near term. To give certain instance types a higher chance of launching first, use
       * `capacityOptimizedPrioritized` . Set a priority for each instance type by using the `Priority`
       * parameter for `LaunchTemplateOverrides` . You can assign the same priority to different
       * `LaunchTemplateOverrides` . EC2 implements the priorities on a best-effort basis, but
       * optimizes for capacity first. `capacityOptimizedPrioritized` is supported only if your Spot
       * Fleet uses a launch template. Note that if the `OnDemandAllocationStrategy` is set to
       * `prioritized` , the same priority is applied when fulfilling On-Demand capacity.
       * * **diversified** - Spot Fleet requests instances from all of the Spot Instance pools that
       * you specify.
       * * **lowestPrice (not recommended)** - &gt; We don't recommend the `lowestPrice` allocation
       * strategy because it has the highest risk of interruption for your Spot Instances.
       *
       * Spot Fleet requests instances from the lowest priced Spot Instance pool that has available
       * capacity. If the lowest priced pool doesn't have available capacity, the Spot Instances come
       * from the next lowest priced pool that has available capacity. If a pool runs out of capacity
       * before fulfilling your desired capacity, Spot Fleet will continue to fulfill your request by
       * drawing from the next lowest priced pool. To ensure that your desired capacity is met, you
       * might receive Spot Instances from several pools. Because this strategy only considers instance
       * price and not capacity availability, it might lead to high interruption rates.
       *
       * Default: `lowestPrice`
       */
      public fun allocationStrategy(allocationStrategy: String)

      /**
       * @param context Reserved.
       */
      public fun context(context: String)

      /**
       * @param excessCapacityTerminationPolicy Indicates whether running Spot Instances should be
       * terminated if you decrease the target capacity of the Spot Fleet request below the current
       * size of the Spot Fleet.
       * Supported only for fleets of type `maintain` .
       */
      public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String)

      /**
       * @param iamFleetRole The Amazon Resource Name (ARN) of an AWS Identity and Access Management
       * (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag
       * instances on your behalf. 
       * For more information, see [Spot Fleet
       * Prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites)
       * in the *Amazon EC2 User Guide* . Spot Fleet can terminate Spot Instances on your behalf when
       * you cancel its Spot Fleet request or when the Spot Fleet request expires, if you set
       * `TerminateInstancesWithExpiration` .
       */
      public fun iamFleetRole(iamFleetRole: String)

      /**
       * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
       * The default is `terminate` .
       */
      public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String)

      /**
       * @param instancePoolsToUseCount The number of Spot pools across which to allocate your
       * target Spot capacity.
       * Valid only when Spot *AllocationStrategy* is set to `lowest-price` . Spot Fleet selects the
       * cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot
       * pools that you specify.
       *
       * Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you
       * specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your
       * target capacity, Spot Fleet will continue to fulfill your request by drawing from the next
       * cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances
       * from more than the number of pools that you specified. Similarly, if most of the pools have no
       * Spot capacity, you might receive your full target capacity from fewer than the number of pools
       * that you specified.
       */
      public fun instancePoolsToUseCount(instancePoolsToUseCount: Number)

      /**
       * @param launchSpecifications The launch specifications for the Spot Fleet request.
       * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
       */
      public fun launchSpecifications(launchSpecifications: IResolvable)

      /**
       * @param launchSpecifications The launch specifications for the Spot Fleet request.
       * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
       */
      public fun launchSpecifications(launchSpecifications: List<Any>)

      /**
       * @param launchSpecifications The launch specifications for the Spot Fleet request.
       * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
       */
      public fun launchSpecifications(vararg launchSpecifications: Any)

      /**
       * @param launchTemplateConfigs The launch template and overrides.
       * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
       */
      public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable)

      /**
       * @param launchTemplateConfigs The launch template and overrides.
       * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
       */
      public fun launchTemplateConfigs(launchTemplateConfigs: List<Any>)

      /**
       * @param launchTemplateConfigs The launch template and overrides.
       * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
       */
      public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any)

      /**
       * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach
       * to the Spot Fleet request.
       * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers
       * and target groups.
       *
       * With Network Load Balancers, Spot Fleet cannot register instances that have the following
       * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
       */
      public fun loadBalancersConfig(loadBalancersConfig: IResolvable)

      /**
       * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach
       * to the Spot Fleet request.
       * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers
       * and target groups.
       *
       * With Network Load Balancers, Spot Fleet cannot register instances that have the following
       * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
       */
      public fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty)

      /**
       * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach
       * to the Spot Fleet request.
       * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers
       * and target groups.
       *
       * With Network Load Balancers, Spot Fleet cannot register instances that have the following
       * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c60fe2dcead1983474af251b47bba970d17e23f115fda5d9d90a420e3001af9")
      public
          fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty.Builder.() -> Unit)

      /**
       * @param onDemandAllocationStrategy The order of the launch template overrides to use in
       * fulfilling On-Demand capacity.
       * If you specify `lowestPrice` , Spot Fleet uses price to determine the order, launching the
       * lowest price first. If you specify `prioritized` , Spot Fleet uses the priority that you
       * assign to each Spot Fleet launch template override, launching the highest priority first. If
       * you do not specify a value, Spot Fleet defaults to `lowestPrice` .
       */
      public fun onDemandAllocationStrategy(onDemandAllocationStrategy: String)

      /**
       * @param onDemandMaxTotalPrice The maximum amount per hour for On-Demand Instances that
       * you're willing to pay.
       * You can use the `onDemandMaxTotalPrice` parameter, the `spotMaxTotalPrice` parameter, or
       * both parameters to ensure that your fleet cost does not exceed your budget. If you set a
       * maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot
       * Fleet will launch instances until it reaches the maximum amount you're willing to pay. When
       * the maximum amount you're willing to pay is reached, the fleet stops launching instances even
       * if it hasn’t met the target capacity.
       *
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `onDemandMaxTotalPrice` does not account for surplus credits, and, if you use
       * surplus credits, your final cost might be higher than what you specified for
       * `onDemandMaxTotalPrice` . For more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *Amazon EC2 User Guide* .
       */
      public fun onDemandMaxTotalPrice(onDemandMaxTotalPrice: String)

      /**
       * @param onDemandTargetCapacity The number of On-Demand units to request.
       * You can choose to set the target capacity in terms of instances or a performance
       * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
       * If the request type is `maintain` , you can specify a target capacity of 0 and add capacity
       * later.
       */
      public fun onDemandTargetCapacity(onDemandTargetCapacity: Number)

      /**
       * @param replaceUnhealthyInstances Indicates whether Spot Fleet should replace unhealthy
       * instances.
       */
      public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean)

      /**
       * @param replaceUnhealthyInstances Indicates whether Spot Fleet should replace unhealthy
       * instances.
       */
      public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable)

      /**
       * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are
       * at an elevated risk of being interrupted.
       */
      public fun spotMaintenanceStrategies(spotMaintenanceStrategies: IResolvable)

      /**
       * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are
       * at an elevated risk of being interrupted.
       */
      public
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty)

      /**
       * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are
       * at an elevated risk of being interrupted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3d6bed7153d74918df0f41ea1dd754235f7102e4aad5f967e77002ce2cb00fe")
      public
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty.Builder.() -> Unit)

      /**
       * @param spotMaxTotalPrice The maximum amount per hour for Spot Instances that you're willing
       * to pay.
       * You can use the `spotMaxTotalPrice` parameter, the `onDemandMaxTotalPrice` parameter, or
       * both parameters to ensure that your fleet cost does not exceed your budget. If you set a
       * maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot
       * Fleet will launch instances until it reaches the maximum amount you're willing to pay. When
       * the maximum amount you're willing to pay is reached, the fleet stops launching instances even
       * if it hasn’t met the target capacity.
       *
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `spotMaxTotalPrice` does not account for surplus credits, and, if you use surplus
       * credits, your final cost might be higher than what you specified for `spotMaxTotalPrice` . For
       * more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *Amazon EC2 User Guide* .
       */
      public fun spotMaxTotalPrice(spotMaxTotalPrice: String)

      /**
       * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      public fun spotPrice(spotPrice: String)

      /**
       * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
       * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet
       * request fails. To tag instances at launch, specify the tags in the [launch
       * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
       * (valid only if you use `LaunchTemplateConfigs` ) or in the
       * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
       * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch,
       * see [Tag your
       * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources)
       * .
       */
      public fun tagSpecifications(tagSpecifications: IResolvable)

      /**
       * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
       * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet
       * request fails. To tag instances at launch, specify the tags in the [launch
       * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
       * (valid only if you use `LaunchTemplateConfigs` ) or in the
       * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
       * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch,
       * see [Tag your
       * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources)
       * .
       */
      public fun tagSpecifications(tagSpecifications: List<Any>)

      /**
       * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
       * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet
       * request fails. To tag instances at launch, specify the tags in the [launch
       * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
       * (valid only if you use `LaunchTemplateConfigs` ) or in the
       * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
       * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch,
       * see [Tag your
       * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources)
       * .
       */
      public fun tagSpecifications(vararg tagSpecifications: Any)

      /**
       * @param targetCapacity The number of units to request for the Spot Fleet. 
       * You can choose to set the target capacity in terms of instances or a performance
       * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
       * If the request type is `maintain` , you can specify a target capacity of 0 and add capacity
       * later.
       */
      public fun targetCapacity(targetCapacity: Number)

      /**
       * @param targetCapacityUnitType The unit for the target capacity. You can specify this
       * parameter only when using attribute-based instance type selection.
       * Default: `units` (the number of instances)
       */
      public fun targetCapacityUnitType(targetCapacityUnitType: String)

      /**
       * @param terminateInstancesWithExpiration Indicates whether running Spot Instances are
       * terminated when the Spot Fleet request expires.
       */
      public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean)

      /**
       * @param terminateInstancesWithExpiration Indicates whether running Spot Instances are
       * terminated when the Spot Fleet request expires.
       */
      public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable)

      /**
       * @param type The type of request.
       * Indicates whether the Spot Fleet only requests the target capacity or also attempts to
       * maintain it. When this value is `request` , the Spot Fleet only places the required requests.
       * It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit
       * requests in alternative Spot pools if capacity is not available. When this value is `maintain`
       * , the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to
       * meet capacity and automatically replenishes any interrupted instances. Default: `maintain` .
       * `instant` is listed but is not used by Spot Fleet.
       */
      public fun type(type: String)

      /**
       * @param validFrom The start date and time of the request, in UTC format ( *YYYY* - *MM* -
       * *DD* T *HH* : *MM* : *SS* Z).
       * By default, Amazon EC2 starts fulfilling the request immediately.
       */
      public fun validFrom(validFrom: String)

      /**
       * @param validUntil The end date and time of the request, in UTC format ( *YYYY* - *MM* -
       * *DD* T *HH* : *MM* : *SS* Z).
       * After the end date and time, no new Spot Instance requests are placed or able to fulfill
       * the request. If no value is specified, the Spot Fleet request remains until you cancel it.
       */
      public fun validUntil(validUntil: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty.builder()

      /**
       * @param allocationStrategy The strategy that determines how to allocate the target Spot
       * Instance capacity across the Spot Instance pools specified by the Spot Fleet launch
       * configuration.
       * For more information, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide* .
       *
       * * **priceCapacityOptimized (recommended)** - Spot Fleet identifies the pools with the
       * highest capacity availability for the number of instances that are launching. This means that
       * we will request Spot Instances from the pools that we believe have the lowest chance of
       * interruption in the near term. Spot Fleet then requests Spot Instances from the lowest priced
       * of these pools.
       * * **capacityOptimized** - Spot Fleet identifies the pools with the highest capacity
       * availability for the number of instances that are launching. This means that we will request
       * Spot Instances from the pools that we believe have the lowest chance of interruption in the
       * near term. To give certain instance types a higher chance of launching first, use
       * `capacityOptimizedPrioritized` . Set a priority for each instance type by using the `Priority`
       * parameter for `LaunchTemplateOverrides` . You can assign the same priority to different
       * `LaunchTemplateOverrides` . EC2 implements the priorities on a best-effort basis, but
       * optimizes for capacity first. `capacityOptimizedPrioritized` is supported only if your Spot
       * Fleet uses a launch template. Note that if the `OnDemandAllocationStrategy` is set to
       * `prioritized` , the same priority is applied when fulfilling On-Demand capacity.
       * * **diversified** - Spot Fleet requests instances from all of the Spot Instance pools that
       * you specify.
       * * **lowestPrice (not recommended)** - &gt; We don't recommend the `lowestPrice` allocation
       * strategy because it has the highest risk of interruption for your Spot Instances.
       *
       * Spot Fleet requests instances from the lowest priced Spot Instance pool that has available
       * capacity. If the lowest priced pool doesn't have available capacity, the Spot Instances come
       * from the next lowest priced pool that has available capacity. If a pool runs out of capacity
       * before fulfilling your desired capacity, Spot Fleet will continue to fulfill your request by
       * drawing from the next lowest priced pool. To ensure that your desired capacity is met, you
       * might receive Spot Instances from several pools. Because this strategy only considers instance
       * price and not capacity availability, it might lead to high interruption rates.
       *
       * Default: `lowestPrice`
       */
      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      /**
       * @param context Reserved.
       */
      override fun context(context: String) {
        cdkBuilder.context(context)
      }

      /**
       * @param excessCapacityTerminationPolicy Indicates whether running Spot Instances should be
       * terminated if you decrease the target capacity of the Spot Fleet request below the current
       * size of the Spot Fleet.
       * Supported only for fleets of type `maintain` .
       */
      override fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
        cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
      }

      /**
       * @param iamFleetRole The Amazon Resource Name (ARN) of an AWS Identity and Access Management
       * (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag
       * instances on your behalf. 
       * For more information, see [Spot Fleet
       * Prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites)
       * in the *Amazon EC2 User Guide* . Spot Fleet can terminate Spot Instances on your behalf when
       * you cancel its Spot Fleet request or when the Spot Fleet request expires, if you set
       * `TerminateInstancesWithExpiration` .
       */
      override fun iamFleetRole(iamFleetRole: String) {
        cdkBuilder.iamFleetRole(iamFleetRole)
      }

      /**
       * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
       * The default is `terminate` .
       */
      override fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
      }

      /**
       * @param instancePoolsToUseCount The number of Spot pools across which to allocate your
       * target Spot capacity.
       * Valid only when Spot *AllocationStrategy* is set to `lowest-price` . Spot Fleet selects the
       * cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot
       * pools that you specify.
       *
       * Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you
       * specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your
       * target capacity, Spot Fleet will continue to fulfill your request by drawing from the next
       * cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances
       * from more than the number of pools that you specified. Similarly, if most of the pools have no
       * Spot capacity, you might receive your full target capacity from fewer than the number of pools
       * that you specified.
       */
      override fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
        cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
      }

      /**
       * @param launchSpecifications The launch specifications for the Spot Fleet request.
       * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
       */
      override fun launchSpecifications(launchSpecifications: IResolvable) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param launchSpecifications The launch specifications for the Spot Fleet request.
       * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
       */
      override fun launchSpecifications(launchSpecifications: List<Any>) {
        cdkBuilder.launchSpecifications(launchSpecifications.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param launchSpecifications The launch specifications for the Spot Fleet request.
       * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
       */
      override fun launchSpecifications(vararg launchSpecifications: Any): Unit =
          launchSpecifications(launchSpecifications.toList())

      /**
       * @param launchTemplateConfigs The launch template and overrides.
       * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
       */
      override fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
        cdkBuilder.launchTemplateConfigs(launchTemplateConfigs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param launchTemplateConfigs The launch template and overrides.
       * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
       */
      override fun launchTemplateConfigs(launchTemplateConfigs: List<Any>) {
        cdkBuilder.launchTemplateConfigs(launchTemplateConfigs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param launchTemplateConfigs The launch template and overrides.
       * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
       */
      override fun launchTemplateConfigs(vararg launchTemplateConfigs: Any): Unit =
          launchTemplateConfigs(launchTemplateConfigs.toList())

      /**
       * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach
       * to the Spot Fleet request.
       * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers
       * and target groups.
       *
       * With Network Load Balancers, Spot Fleet cannot register instances that have the following
       * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
       */
      override fun loadBalancersConfig(loadBalancersConfig: IResolvable) {
        cdkBuilder.loadBalancersConfig(loadBalancersConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach
       * to the Spot Fleet request.
       * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers
       * and target groups.
       *
       * With Network Load Balancers, Spot Fleet cannot register instances that have the following
       * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
       */
      override fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty) {
        cdkBuilder.loadBalancersConfig(loadBalancersConfig.let(LoadBalancersConfigProperty.Companion::unwrap))
      }

      /**
       * @param loadBalancersConfig One or more Classic Load Balancers and target groups to attach
       * to the Spot Fleet request.
       * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers
       * and target groups.
       *
       * With Network Load Balancers, Spot Fleet cannot register instances that have the following
       * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c60fe2dcead1983474af251b47bba970d17e23f115fda5d9d90a420e3001af9")
      override
          fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty.Builder.() -> Unit):
          Unit = loadBalancersConfig(LoadBalancersConfigProperty(loadBalancersConfig))

      /**
       * @param onDemandAllocationStrategy The order of the launch template overrides to use in
       * fulfilling On-Demand capacity.
       * If you specify `lowestPrice` , Spot Fleet uses price to determine the order, launching the
       * lowest price first. If you specify `prioritized` , Spot Fleet uses the priority that you
       * assign to each Spot Fleet launch template override, launching the highest priority first. If
       * you do not specify a value, Spot Fleet defaults to `lowestPrice` .
       */
      override fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
        cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
      }

      /**
       * @param onDemandMaxTotalPrice The maximum amount per hour for On-Demand Instances that
       * you're willing to pay.
       * You can use the `onDemandMaxTotalPrice` parameter, the `spotMaxTotalPrice` parameter, or
       * both parameters to ensure that your fleet cost does not exceed your budget. If you set a
       * maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot
       * Fleet will launch instances until it reaches the maximum amount you're willing to pay. When
       * the maximum amount you're willing to pay is reached, the fleet stops launching instances even
       * if it hasn’t met the target capacity.
       *
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `onDemandMaxTotalPrice` does not account for surplus credits, and, if you use
       * surplus credits, your final cost might be higher than what you specified for
       * `onDemandMaxTotalPrice` . For more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *Amazon EC2 User Guide* .
       */
      override fun onDemandMaxTotalPrice(onDemandMaxTotalPrice: String) {
        cdkBuilder.onDemandMaxTotalPrice(onDemandMaxTotalPrice)
      }

      /**
       * @param onDemandTargetCapacity The number of On-Demand units to request.
       * You can choose to set the target capacity in terms of instances or a performance
       * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
       * If the request type is `maintain` , you can specify a target capacity of 0 and add capacity
       * later.
       */
      override fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
        cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
      }

      /**
       * @param replaceUnhealthyInstances Indicates whether Spot Fleet should replace unhealthy
       * instances.
       */
      override fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
        cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
      }

      /**
       * @param replaceUnhealthyInstances Indicates whether Spot Fleet should replace unhealthy
       * instances.
       */
      override fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
        cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are
       * at an elevated risk of being interrupted.
       */
      override fun spotMaintenanceStrategies(spotMaintenanceStrategies: IResolvable) {
        cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are
       * at an elevated risk of being interrupted.
       */
      override
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty) {
        cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies.let(SpotMaintenanceStrategiesProperty.Companion::unwrap))
      }

      /**
       * @param spotMaintenanceStrategies The strategies for managing your Spot Instances that are
       * at an elevated risk of being interrupted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3d6bed7153d74918df0f41ea1dd754235f7102e4aad5f967e77002ce2cb00fe")
      override
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty.Builder.() -> Unit):
          Unit =
          spotMaintenanceStrategies(SpotMaintenanceStrategiesProperty(spotMaintenanceStrategies))

      /**
       * @param spotMaxTotalPrice The maximum amount per hour for Spot Instances that you're willing
       * to pay.
       * You can use the `spotMaxTotalPrice` parameter, the `onDemandMaxTotalPrice` parameter, or
       * both parameters to ensure that your fleet cost does not exceed your budget. If you set a
       * maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot
       * Fleet will launch instances until it reaches the maximum amount you're willing to pay. When
       * the maximum amount you're willing to pay is reached, the fleet stops launching instances even
       * if it hasn’t met the target capacity.
       *
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `spotMaxTotalPrice` does not account for surplus credits, and, if you use surplus
       * credits, your final cost might be higher than what you specified for `spotMaxTotalPrice` . For
       * more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *Amazon EC2 User Guide* .
       */
      override fun spotMaxTotalPrice(spotMaxTotalPrice: String) {
        cdkBuilder.spotMaxTotalPrice(spotMaxTotalPrice)
      }

      /**
       * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify this parameter.
       */
      override fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
      }

      /**
       * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
       * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet
       * request fails. To tag instances at launch, specify the tags in the [launch
       * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
       * (valid only if you use `LaunchTemplateConfigs` ) or in the
       * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
       * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch,
       * see [Tag your
       * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources)
       * .
       */
      override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
       * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet
       * request fails. To tag instances at launch, specify the tags in the [launch
       * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
       * (valid only if you use `LaunchTemplateConfigs` ) or in the
       * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
       * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch,
       * see [Tag your
       * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources)
       * .
       */
      override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param tagSpecifications The key-value pair for tagging the Spot Fleet request on creation.
       * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet
       * request fails. To tag instances at launch, specify the tags in the [launch
       * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
       * (valid only if you use `LaunchTemplateConfigs` ) or in the
       * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
       * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch,
       * see [Tag your
       * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources)
       * .
       */
      override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
          tagSpecifications(tagSpecifications.toList())

      /**
       * @param targetCapacity The number of units to request for the Spot Fleet. 
       * You can choose to set the target capacity in terms of instances or a performance
       * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
       * If the request type is `maintain` , you can specify a target capacity of 0 and add capacity
       * later.
       */
      override fun targetCapacity(targetCapacity: Number) {
        cdkBuilder.targetCapacity(targetCapacity)
      }

      /**
       * @param targetCapacityUnitType The unit for the target capacity. You can specify this
       * parameter only when using attribute-based instance type selection.
       * Default: `units` (the number of instances)
       */
      override fun targetCapacityUnitType(targetCapacityUnitType: String) {
        cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
      }

      /**
       * @param terminateInstancesWithExpiration Indicates whether running Spot Instances are
       * terminated when the Spot Fleet request expires.
       */
      override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
        cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
      }

      /**
       * @param terminateInstancesWithExpiration Indicates whether running Spot Instances are
       * terminated when the Spot Fleet request expires.
       */
      override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
        cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param type The type of request.
       * Indicates whether the Spot Fleet only requests the target capacity or also attempts to
       * maintain it. When this value is `request` , the Spot Fleet only places the required requests.
       * It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit
       * requests in alternative Spot pools if capacity is not available. When this value is `maintain`
       * , the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to
       * meet capacity and automatically replenishes any interrupted instances. Default: `maintain` .
       * `instant` is listed but is not used by Spot Fleet.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param validFrom The start date and time of the request, in UTC format ( *YYYY* - *MM* -
       * *DD* T *HH* : *MM* : *SS* Z).
       * By default, Amazon EC2 starts fulfilling the request immediately.
       */
      override fun validFrom(validFrom: String) {
        cdkBuilder.validFrom(validFrom)
      }

      /**
       * @param validUntil The end date and time of the request, in UTC format ( *YYYY* - *MM* -
       * *DD* T *HH* : *MM* : *SS* Z).
       * After the end date and time, no new Spot Instance requests are placed or able to fulfill
       * the request. If no value is specified, the Spot Fleet request remains until you cancel it.
       */
      override fun validUntil(validUntil: String) {
        cdkBuilder.validUntil(validUntil)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty,
    ) : CdkObject(cdkObject),
        SpotFleetRequestConfigDataProperty {
      /**
       * The strategy that determines how to allocate the target Spot Instance capacity across the
       * Spot Instance pools specified by the Spot Fleet launch configuration.
       *
       * For more information, see [Allocation strategies for Spot
       * Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-allocation-strategy.html)
       * in the *Amazon EC2 User Guide* .
       *
       * * **priceCapacityOptimized (recommended)** - Spot Fleet identifies the pools with the
       * highest capacity availability for the number of instances that are launching. This means that
       * we will request Spot Instances from the pools that we believe have the lowest chance of
       * interruption in the near term. Spot Fleet then requests Spot Instances from the lowest priced
       * of these pools.
       * * **capacityOptimized** - Spot Fleet identifies the pools with the highest capacity
       * availability for the number of instances that are launching. This means that we will request
       * Spot Instances from the pools that we believe have the lowest chance of interruption in the
       * near term. To give certain instance types a higher chance of launching first, use
       * `capacityOptimizedPrioritized` . Set a priority for each instance type by using the `Priority`
       * parameter for `LaunchTemplateOverrides` . You can assign the same priority to different
       * `LaunchTemplateOverrides` . EC2 implements the priorities on a best-effort basis, but
       * optimizes for capacity first. `capacityOptimizedPrioritized` is supported only if your Spot
       * Fleet uses a launch template. Note that if the `OnDemandAllocationStrategy` is set to
       * `prioritized` , the same priority is applied when fulfilling On-Demand capacity.
       * * **diversified** - Spot Fleet requests instances from all of the Spot Instance pools that
       * you specify.
       * * **lowestPrice (not recommended)** - &gt; We don't recommend the `lowestPrice` allocation
       * strategy because it has the highest risk of interruption for your Spot Instances.
       *
       * Spot Fleet requests instances from the lowest priced Spot Instance pool that has available
       * capacity. If the lowest priced pool doesn't have available capacity, the Spot Instances come
       * from the next lowest priced pool that has available capacity. If a pool runs out of capacity
       * before fulfilling your desired capacity, Spot Fleet will continue to fulfill your request by
       * drawing from the next lowest priced pool. To ensure that your desired capacity is met, you
       * might receive Spot Instances from several pools. Because this strategy only considers instance
       * price and not capacity availability, it might lead to high interruption rates.
       *
       * Default: `lowestPrice`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy)
       */
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      /**
       * Reserved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-context)
       */
      override fun context(): String? = unwrap(this).getContext()

      /**
       * Indicates whether running Spot Instances should be terminated if you decrease the target
       * capacity of the Spot Fleet request below the current size of the Spot Fleet.
       *
       * Supported only for fleets of type `maintain` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy)
       */
      override fun excessCapacityTerminationPolicy(): String? =
          unwrap(this).getExcessCapacityTerminationPolicy()

      /**
       * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that
       * grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your
       * behalf.
       *
       * For more information, see [Spot Fleet
       * Prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html#spot-fleet-prerequisites)
       * in the *Amazon EC2 User Guide* . Spot Fleet can terminate Spot Instances on your behalf when
       * you cancel its Spot Fleet request or when the Spot Fleet request expires, if you set
       * `TerminateInstancesWithExpiration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole)
       */
      override fun iamFleetRole(): String = unwrap(this).getIamFleetRole()

      /**
       * The behavior when a Spot Instance is interrupted.
       *
       * The default is `terminate` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior)
       */
      override fun instanceInterruptionBehavior(): String? =
          unwrap(this).getInstanceInterruptionBehavior()

      /**
       * The number of Spot pools across which to allocate your target Spot capacity.
       *
       * Valid only when Spot *AllocationStrategy* is set to `lowest-price` . Spot Fleet selects the
       * cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot
       * pools that you specify.
       *
       * Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you
       * specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your
       * target capacity, Spot Fleet will continue to fulfill your request by drawing from the next
       * cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances
       * from more than the number of pools that you specified. Similarly, if most of the pools have no
       * Spot capacity, you might receive your full target capacity from fewer than the number of pools
       * that you specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instancepoolstousecount)
       */
      override fun instancePoolsToUseCount(): Number? = unwrap(this).getInstancePoolsToUseCount()

      /**
       * The launch specifications for the Spot Fleet request.
       *
       * If you specify `LaunchSpecifications` , you can't specify `LaunchTemplateConfigs` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications)
       */
      override fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

      /**
       * The launch template and overrides.
       *
       * If you specify `LaunchTemplateConfigs` , you can't specify `LaunchSpecifications` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs)
       */
      override fun launchTemplateConfigs(): Any? = unwrap(this).getLaunchTemplateConfigs()

      /**
       * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request.
       *
       * Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers
       * and target groups.
       *
       * With Network Load Balancers, Spot Fleet cannot register instances that have the following
       * instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-loadbalancersconfig)
       */
      override fun loadBalancersConfig(): Any? = unwrap(this).getLoadBalancersConfig()

      /**
       * The order of the launch template overrides to use in fulfilling On-Demand capacity.
       *
       * If you specify `lowestPrice` , Spot Fleet uses price to determine the order, launching the
       * lowest price first. If you specify `prioritized` , Spot Fleet uses the priority that you
       * assign to each Spot Fleet launch template override, launching the highest priority first. If
       * you do not specify a value, Spot Fleet defaults to `lowestPrice` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-ondemandallocationstrategy)
       */
      override fun onDemandAllocationStrategy(): String? =
          unwrap(this).getOnDemandAllocationStrategy()

      /**
       * The maximum amount per hour for On-Demand Instances that you're willing to pay.
       *
       * You can use the `onDemandMaxTotalPrice` parameter, the `spotMaxTotalPrice` parameter, or
       * both parameters to ensure that your fleet cost does not exceed your budget. If you set a
       * maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot
       * Fleet will launch instances until it reaches the maximum amount you're willing to pay. When
       * the maximum amount you're willing to pay is reached, the fleet stops launching instances even
       * if it hasn’t met the target capacity.
       *
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `onDemandMaxTotalPrice` does not account for surplus credits, and, if you use
       * surplus credits, your final cost might be higher than what you specified for
       * `onDemandMaxTotalPrice` . For more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *Amazon EC2 User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-ondemandmaxtotalprice)
       */
      override fun onDemandMaxTotalPrice(): String? = unwrap(this).getOnDemandMaxTotalPrice()

      /**
       * The number of On-Demand units to request.
       *
       * You can choose to set the target capacity in terms of instances or a performance
       * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
       * If the request type is `maintain` , you can specify a target capacity of 0 and add capacity
       * later.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-ondemandtargetcapacity)
       */
      override fun onDemandTargetCapacity(): Number? = unwrap(this).getOnDemandTargetCapacity()

      /**
       * Indicates whether Spot Fleet should replace unhealthy instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances)
       */
      override fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

      /**
       * The strategies for managing your Spot Instances that are at an elevated risk of being
       * interrupted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotmaintenancestrategies)
       */
      override fun spotMaintenanceStrategies(): Any? = unwrap(this).getSpotMaintenanceStrategies()

      /**
       * The maximum amount per hour for Spot Instances that you're willing to pay.
       *
       * You can use the `spotMaxTotalPrice` parameter, the `onDemandMaxTotalPrice` parameter, or
       * both parameters to ensure that your fleet cost does not exceed your budget. If you set a
       * maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot
       * Fleet will launch instances until it reaches the maximum amount you're willing to pay. When
       * the maximum amount you're willing to pay is reached, the fleet stops launching instances even
       * if it hasn’t met the target capacity.
       *
       *
       * If your fleet includes T instances that are configured as `unlimited` , and if their
       * average CPU usage exceeds the baseline utilization, you will incur a charge for surplus
       * credits. The `spotMaxTotalPrice` does not account for surplus credits, and, if you use surplus
       * credits, your final cost might be higher than what you specified for `spotMaxTotalPrice` . For
       * more information, see [Surplus credits can incur
       * charges](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances-unlimited-mode-concepts.html#unlimited-mode-surplus-credits)
       * in the *Amazon EC2 User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotmaxtotalprice)
       */
      override fun spotMaxTotalPrice(): String? = unwrap(this).getSpotMaxTotalPrice()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice)
       */
      override fun spotPrice(): String? = unwrap(this).getSpotPrice()

      /**
       * The key-value pair for tagging the Spot Fleet request on creation.
       *
       * The value for `ResourceType` must be `spot-fleet-request` , otherwise the Spot Fleet
       * request fails. To tag instances at launch, specify the tags in the [launch
       * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
       * (valid only if you use `LaunchTemplateConfigs` ) or in the
       * `[SpotFleetTagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetTagSpecification.html)`
       * (valid only if you use `LaunchSpecifications` ). For information about tagging after launch,
       * see [Tag your
       * resources](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-resources)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-tagspecifications)
       */
      override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      /**
       * The number of units to request for the Spot Fleet.
       *
       * You can choose to set the target capacity in terms of instances or a performance
       * characteristic that is important to your application workload, such as vCPUs, memory, or I/O.
       * If the request type is `maintain` , you can specify a target capacity of 0 and add capacity
       * later.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity)
       */
      override fun targetCapacity(): Number = unwrap(this).getTargetCapacity()

      /**
       * The unit for the target capacity. You can specify this parameter only when using
       * attribute-based instance type selection.
       *
       * Default: `units` (the number of instances)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacityunittype)
       */
      override fun targetCapacityUnitType(): String? = unwrap(this).getTargetCapacityUnitType()

      /**
       * Indicates whether running Spot Instances are terminated when the Spot Fleet request
       * expires.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration)
       */
      override fun terminateInstancesWithExpiration(): Any? =
          unwrap(this).getTerminateInstancesWithExpiration()

      /**
       * The type of request.
       *
       * Indicates whether the Spot Fleet only requests the target capacity or also attempts to
       * maintain it. When this value is `request` , the Spot Fleet only places the required requests.
       * It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit
       * requests in alternative Spot pools if capacity is not available. When this value is `maintain`
       * , the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to
       * meet capacity and automatically replenishes any interrupted instances. Default: `maintain` .
       * `instant` is listed but is not used by Spot Fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The start date and time of the request, in UTC format ( *YYYY* - *MM* - *DD* T *HH* : *MM*
       * : *SS* Z).
       *
       * By default, Amazon EC2 starts fulfilling the request immediately.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom)
       */
      override fun validFrom(): String? = unwrap(this).getValidFrom()

      /**
       * The end date and time of the request, in UTC format ( *YYYY* - *MM* - *DD* T *HH* : *MM* :
       * *SS* Z).
       *
       * After the end date and time, no new Spot Instance requests are placed or able to fulfill
       * the request. If no value is specified, the Spot Fleet request remains until you cancel it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil)
       */
      override fun validUntil(): String? = unwrap(this).getValidUntil()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotFleetRequestConfigDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty):
          SpotFleetRequestConfigDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotFleetRequestConfigDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetRequestConfigDataProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty
    }
  }

  /**
   * The tags for a Spot Fleet resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SpotFleetTagSpecificationProperty spotFleetTagSpecificationProperty =
   * SpotFleetTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleettagspecification.html)
   */
  public interface SpotFleetTagSpecificationProperty {
    /**
     * The type of resource.
     *
     * Currently, the only resource type that is supported is `instance` . To tag the Spot Fleet
     * request on creation, use the `TagSpecifications` parameter in
     * `[SpotFleetRequestConfigData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html)`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleettagspecification.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleettagspecification.html#cfn-ec2-spotfleet-spotfleettagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [SpotFleetTagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType The type of resource.
       * Currently, the only resource type that is supported is `instance` . To tag the Spot Fleet
       * request on creation, use the `TagSpecifications` parameter in
       * `[SpotFleetRequestConfigData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html)`
       * .
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty.builder()

      /**
       * @param resourceType The type of resource.
       * Currently, the only resource type that is supported is `instance` . To tag the Spot Fleet
       * request on creation, use the `TagSpecifications` parameter in
       * `[SpotFleetRequestConfigData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html)`
       * .
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
      }

      /**
       * @param tags The tags.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty,
    ) : CdkObject(cdkObject),
        SpotFleetTagSpecificationProperty {
      /**
       * The type of resource.
       *
       * Currently, the only resource type that is supported is `instance` . To tag the Spot Fleet
       * request on creation, use the `TagSpecifications` parameter in
       * `[SpotFleetRequestConfigData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetRequestConfigData.html)`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleettagspecification.html#cfn-ec2-spotfleet-spotfleettagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The tags.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleettagspecification.html#cfn-ec2-spotfleet-spotfleettagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotFleetTagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty):
          SpotFleetTagSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotFleetTagSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetTagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty
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
   * SpotMaintenanceStrategiesProperty spotMaintenanceStrategiesProperty =
   * SpotMaintenanceStrategiesProperty.builder()
   * .capacityRebalance(SpotCapacityRebalanceProperty.builder()
   * .replacementStrategy("replacementStrategy")
   * .terminationDelay(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotmaintenancestrategies.html)
   */
  public interface SpotMaintenanceStrategiesProperty {
    /**
     * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot
     * Instance is at an elevated risk of being interrupted.
     *
     * For more information, see [Capacity
     * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotmaintenancestrategies.html#cfn-ec2-spotfleet-spotmaintenancestrategies-capacityrebalance)
     */
    public fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

    /**
     * A builder for [SpotMaintenanceStrategiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2
       * emits a signal that your Spot Instance is at an elevated risk of being interrupted.
       * For more information, see [Capacity
       * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
       * in the *Amazon EC2 User Guide* .
       */
      public fun capacityRebalance(capacityRebalance: IResolvable)

      /**
       * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2
       * emits a signal that your Spot Instance is at an elevated risk of being interrupted.
       * For more information, see [Capacity
       * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
       * in the *Amazon EC2 User Guide* .
       */
      public fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty)

      /**
       * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2
       * emits a signal that your Spot Instance is at an elevated risk of being interrupted.
       * For more information, see [Capacity
       * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
       * in the *Amazon EC2 User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2573a18d019a336fa9f65454022b27033103109b979f9370b6b039c2e26ba7e3")
      public
          fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty.builder()

      /**
       * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2
       * emits a signal that your Spot Instance is at an elevated risk of being interrupted.
       * For more information, see [Capacity
       * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
       * in the *Amazon EC2 User Guide* .
       */
      override fun capacityRebalance(capacityRebalance: IResolvable) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2
       * emits a signal that your Spot Instance is at an elevated risk of being interrupted.
       * For more information, see [Capacity
       * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
       * in the *Amazon EC2 User Guide* .
       */
      override fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(SpotCapacityRebalanceProperty.Companion::unwrap))
      }

      /**
       * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2
       * emits a signal that your Spot Instance is at an elevated risk of being interrupted.
       * For more information, see [Capacity
       * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
       * in the *Amazon EC2 User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2573a18d019a336fa9f65454022b27033103109b979f9370b6b039c2e26ba7e3")
      override
          fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty.Builder.() -> Unit):
          Unit = capacityRebalance(SpotCapacityRebalanceProperty(capacityRebalance))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty,
    ) : CdkObject(cdkObject),
        SpotMaintenanceStrategiesProperty {
      /**
       * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot
       * Instance is at an elevated risk of being interrupted.
       *
       * For more information, see [Capacity
       * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotmaintenancestrategies.html#cfn-ec2-spotfleet-spotmaintenancestrategies-capacityrebalance)
       */
      override fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotMaintenanceStrategiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty):
          SpotMaintenanceStrategiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotMaintenanceStrategiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotMaintenanceStrategiesProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty
    }
  }

  /**
   * Describes Spot Instance placement.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SpotPlacementProperty spotPlacementProperty = SpotPlacementProperty.builder()
   * .availabilityZone("availabilityZone")
   * .groupName("groupName")
   * .tenancy("tenancy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html)
   */
  public interface SpotPlacementProperty {
    /**
     * The Availability Zone.
     *
     * To specify multiple Availability Zones, separate them using commas; for example, "us-west-2a,
     * us-west-2b".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html#cfn-ec2-spotfleet-spotplacement-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The name of the placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html#cfn-ec2-spotfleet-spotplacement-groupname)
     */
    public fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The tenancy of the instance (if the instance is running in a VPC).
     *
     * An instance with a tenancy of `dedicated` runs on single-tenant hardware. The `host` tenancy
     * is not supported for Spot Instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html#cfn-ec2-spotfleet-spotplacement-tenancy)
     */
    public fun tenancy(): String? = unwrap(this).getTenancy()

    /**
     * A builder for [SpotPlacementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone.
       * To specify multiple Availability Zones, separate them using commas; for example,
       * "us-west-2a, us-west-2b".
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param groupName The name of the placement group.
       */
      public fun groupName(groupName: String)

      /**
       * @param tenancy The tenancy of the instance (if the instance is running in a VPC).
       * An instance with a tenancy of `dedicated` runs on single-tenant hardware. The `host`
       * tenancy is not supported for Spot Instances.
       */
      public fun tenancy(tenancy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty.builder()

      /**
       * @param availabilityZone The Availability Zone.
       * To specify multiple Availability Zones, separate them using commas; for example,
       * "us-west-2a, us-west-2b".
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param groupName The name of the placement group.
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param tenancy The tenancy of the instance (if the instance is running in a VPC).
       * An instance with a tenancy of `dedicated` runs on single-tenant hardware. The `host`
       * tenancy is not supported for Spot Instances.
       */
      override fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty,
    ) : CdkObject(cdkObject),
        SpotPlacementProperty {
      /**
       * The Availability Zone.
       *
       * To specify multiple Availability Zones, separate them using commas; for example,
       * "us-west-2a, us-west-2b".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html#cfn-ec2-spotfleet-spotplacement-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The name of the placement group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html#cfn-ec2-spotfleet-spotplacement-groupname)
       */
      override fun groupName(): String? = unwrap(this).getGroupName()

      /**
       * The tenancy of the instance (if the instance is running in a VPC).
       *
       * An instance with a tenancy of `dedicated` runs on single-tenant hardware. The `host`
       * tenancy is not supported for Spot Instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html#cfn-ec2-spotfleet-spotplacement-tenancy)
       */
      override fun tenancy(): String? = unwrap(this).getTenancy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpotPlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty):
          SpotPlacementProperty = CdkObjectWrappers.wrap(cdkObject) as? SpotPlacementProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotPlacementProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty
    }
  }

  /**
   * Describes a load balancer target group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TargetGroupProperty targetGroupProperty = TargetGroupProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html)
   */
  public interface TargetGroupProperty {
    /**
     * The Amazon Resource Name (ARN) of the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html#cfn-ec2-spotfleet-targetgroup-arn)
     */
    public fun arn(): String

    /**
     * A builder for [TargetGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the target group. 
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the target group. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty,
    ) : CdkObject(cdkObject),
        TargetGroupProperty {
      /**
       * The Amazon Resource Name (ARN) of the target group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroup.html#cfn-ec2-spotfleet-targetgroup-arn)
       */
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty):
          TargetGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty
    }
  }

  /**
   * Describes the target groups to attach to a Spot Fleet.
   *
   * Spot Fleet registers the running Spot Instances with these target groups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TargetGroupsConfigProperty targetGroupsConfigProperty = TargetGroupsConfigProperty.builder()
   * .targetGroups(List.of(TargetGroupProperty.builder()
   * .arn("arn")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html)
   */
  public interface TargetGroupsConfigProperty {
    /**
     * One or more target groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups)
     */
    public fun targetGroups(): Any

    /**
     * A builder for [TargetGroupsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetGroups One or more target groups. 
       */
      public fun targetGroups(targetGroups: IResolvable)

      /**
       * @param targetGroups One or more target groups. 
       */
      public fun targetGroups(targetGroups: List<Any>)

      /**
       * @param targetGroups One or more target groups. 
       */
      public fun targetGroups(vararg targetGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty.builder()

      /**
       * @param targetGroups One or more target groups. 
       */
      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetGroups One or more target groups. 
       */
      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param targetGroups One or more target groups. 
       */
      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty,
    ) : CdkObject(cdkObject),
        TargetGroupsConfigProperty {
      /**
       * One or more target groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups)
       */
      override fun targetGroups(): Any = unwrap(this).getTargetGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty):
          TargetGroupsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetGroupsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupsConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-totallocalstoragegbrequest.html)
   */
  public interface TotalLocalStorageGBRequestProperty {
    /**
     * The maximum amount of total local storage, in GB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-totallocalstoragegbrequest.html#cfn-ec2-spotfleet-totallocalstoragegbrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of total local storage, in GB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-totallocalstoragegbrequest.html#cfn-ec2-spotfleet-totallocalstoragegbrequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty,
    ) : CdkObject(cdkObject),
        TotalLocalStorageGBRequestProperty {
      /**
       * The maximum amount of total local storage, in GB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-totallocalstoragegbrequest.html#cfn-ec2-spotfleet-totallocalstoragegbrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of total local storage, in GB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-totallocalstoragegbrequest.html#cfn-ec2-spotfleet-totallocalstoragegbrequest-min)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty):
          TotalLocalStorageGBRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TotalLocalStorageGBRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TotalLocalStorageGBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-vcpucountrangerequest.html)
   */
  public interface VCpuCountRangeRequestProperty {
    /**
     * The maximum number of vCPUs.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-vcpucountrangerequest.html#cfn-ec2-spotfleet-vcpucountrangerequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of vCPUs.
     *
     * To specify no minimum limit, specify `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-vcpucountrangerequest.html#cfn-ec2-spotfleet-vcpucountrangerequest-min)
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty.builder()

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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty,
    ) : CdkObject(cdkObject),
        VCpuCountRangeRequestProperty {
      /**
       * The maximum number of vCPUs.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-vcpucountrangerequest.html#cfn-ec2-spotfleet-vcpucountrangerequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of vCPUs.
       *
       * To specify no minimum limit, specify `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-vcpucountrangerequest.html#cfn-ec2-spotfleet-vcpucountrangerequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountRangeRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty):
          VCpuCountRangeRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VCpuCountRangeRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountRangeRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty
    }
  }
}
