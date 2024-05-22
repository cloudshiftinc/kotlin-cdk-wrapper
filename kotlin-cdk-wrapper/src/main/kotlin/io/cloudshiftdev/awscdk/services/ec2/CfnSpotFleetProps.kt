@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSpotFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSpotFleetProps cfnSpotFleetProps = CfnSpotFleetProps.builder()
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
public interface CfnSpotFleetProps {
  /**
   * Describes the configuration of a Spot Fleet request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
   */
  public fun spotFleetRequestConfigData(): Any

  /**
   * A builder for [CfnSpotFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    public fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable)

    /**
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty)

    /**
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c50b0f5c9c9abe4594ab31a59b0e265812376b3f723aef4398205f5a4f6b0f03")
    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSpotFleetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSpotFleetProps.builder()

    /**
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    override fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(CfnSpotFleet.SpotFleetRequestConfigDataProperty.Companion::unwrap))
    }

    /**
     * @param spotFleetRequestConfigData Describes the configuration of a Spot Fleet request. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c50b0f5c9c9abe4594ab31a59b0e265812376b3f723aef4398205f5a4f6b0f03")
    override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder.() -> Unit):
        Unit =
        spotFleetRequestConfigData(CfnSpotFleet.SpotFleetRequestConfigDataProperty(spotFleetRequestConfigData))

    public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleetProps,
  ) : CdkObject(cdkObject), CfnSpotFleetProps {
    /**
     * Describes the configuration of a Spot Fleet request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata)
     */
    override fun spotFleetRequestConfigData(): Any = unwrap(this).getSpotFleetRequestConfigData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSpotFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleetProps):
        CfnSpotFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSpotFleetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSpotFleetProps):
        software.amazon.awscdk.services.ec2.CfnSpotFleetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSpotFleetProps
  }
}
