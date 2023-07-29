@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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

/**
 * Specifies the launch specification for one or more Spot Instances.
 *
 * If you include On-Demand capacity in your fleet request, you can't use
 * `SpotFleetLaunchSpecification` ; you must use
 * [LaunchTemplateConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
 * .burstablePerformance("burstablePerformance")
 * .cpuManufacturers(List.of("cpuManufacturers"))
 * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
 * .instanceGenerations(List.of("instanceGenerations"))
 * .localStorage("localStorage")
 * .localStorageTypes(List.of("localStorageTypes"))
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
@CdkDslMarker
public class CfnSpotFleetSpotFleetLaunchSpecificationPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.SpotFleetLaunchSpecificationProperty.Builder =
        CfnSpotFleet.SpotFleetLaunchSpecificationProperty.builder()

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _networkInterfaces: MutableList<Any> = mutableListOf()

    private val _securityGroups: MutableList<Any> = mutableListOf()

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    /**
     * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
     *   You can't specify both a snapshot ID and an encryption value. This is because only blank
     *   volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not
     *   blank and its encryption status is used for the volume encryption status.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
        _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
    }

    /**
     * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
     *   You can't specify both a snapshot ID and an encryption value. This is because only blank
     *   volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not
     *   blank and its encryption status is used for the volume encryption status.
     */
    public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
        _blockDeviceMappings.addAll(blockDeviceMappings)
    }

    /**
     * @param blockDeviceMappings One or more block devices that are mapped to the Spot Instances.
     *   You can't specify both a snapshot ID and an encryption value. This is because only blank
     *   volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not
     *   blank and its encryption status is used for the volume encryption status.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O. This
     *   optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     *   stack to provide optimal EBS I/O performance. This optimization isn't available with all
     *   instance types. Additional usage charges apply when using an EBS Optimized instance.
     *
     * Default: `false`
     */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * @param ebsOptimized Indicates whether the instances are optimized for EBS I/O. This
     *   optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     *   stack to provide optimal EBS I/O performance. This optimization isn't available with all
     *   instance types. Additional usage charges apply when using an EBS Optimized instance.
     *
     * Default: `false`
     */
    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /** @param iamInstanceProfile The IAM instance profile. */
    public fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    /** @param iamInstanceProfile The IAM instance profile. */
    public fun iamInstanceProfile(
        iamInstanceProfile: CfnSpotFleet.IamInstanceProfileSpecificationProperty
    ) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    /** @param imageId The ID of the AMI. */
    public fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
    }

    /**
     * @param instanceRequirements The attributes for the instance types. When you specify instance
     *   attributes, Amazon EC2 will identify instance types with those attributes.
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     */
    public fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements)
    }

    /**
     * @param instanceRequirements The attributes for the instance types. When you specify instance
     *   attributes, Amazon EC2 will identify instance types with those attributes.
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     */
    public fun instanceRequirements(
        instanceRequirements: CfnSpotFleet.InstanceRequirementsRequestProperty
    ) {
        cdkBuilder.instanceRequirements(instanceRequirements)
    }

    /** @param instanceType The instance type. */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param kernelId The ID of the kernel. */
    public fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
    }

    /** @param keyName The name of the key pair. */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /** @param monitoring Enable or disable monitoring for the instances. */
    public fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring)
    }

    /** @param monitoring Enable or disable monitoring for the instances. */
    public fun monitoring(monitoring: CfnSpotFleet.SpotFleetMonitoringProperty) {
        cdkBuilder.monitoring(monitoring)
    }

    /**
     * @param networkInterfaces One or more network interfaces. If you specify a network interface,
     *   you must specify subnet IDs and security group IDs using the network interface.
     *
     * `SpotFleetLaunchSpecification` currently does not support Elastic Fabric Adapter (EFA). To
     * specify an EFA, you must use
     * [LaunchTemplateConfig](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_LaunchTemplateConfig.html)
     * .
     */
    public fun networkInterfaces(vararg networkInterfaces: Any) {
        _networkInterfaces.addAll(listOf(*networkInterfaces))
    }

    /**
     * @param networkInterfaces One or more network interfaces. If you specify a network interface,
     *   you must specify subnet IDs and security group IDs using the network interface.
     *
     * `SpotFleetLaunchSpecification` currently does not support Elastic Fabric Adapter (EFA). To
     * specify an EFA, you must use
     * [LaunchTemplateConfig](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_LaunchTemplateConfig.html)
     * .
     */
    public fun networkInterfaces(networkInterfaces: Collection<Any>) {
        _networkInterfaces.addAll(networkInterfaces)
    }

    /**
     * @param networkInterfaces One or more network interfaces. If you specify a network interface,
     *   you must specify subnet IDs and security group IDs using the network interface.
     *
     * `SpotFleetLaunchSpecification` currently does not support Elastic Fabric Adapter (EFA). To
     * specify an EFA, you must use
     * [LaunchTemplateConfig](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_LaunchTemplateConfig.html)
     * .
     */
    public fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces)
    }

    /** @param placement The placement information. */
    public fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement)
    }

    /** @param placement The placement information. */
    public fun placement(placement: CfnSpotFleet.SpotPlacementProperty) {
        cdkBuilder.placement(placement)
    }

    /**
     * @param ramdiskId The ID of the RAM disk. Some kernels require additional drivers at launch.
     *   Check the kernel requirements for information about whether you need to specify a RAM disk.
     *   To find kernel requirements, refer to the AWS Resource Center and search for the kernel ID.
     */
    public fun ramdiskId(ramdiskId: String) {
        cdkBuilder.ramdiskId(ramdiskId)
    }

    /** @param securityGroups The security groups. */
    public fun securityGroups(vararg securityGroups: Any) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups. */
    public fun securityGroups(securityGroups: Collection<Any>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param securityGroups The security groups. */
    public fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param spotPrice The maximum price per unit hour that you are willing to pay for a Spot
     *   Instance. We do not recommend using this parameter because it can lead to increased
     *   interruptions. If you do not specify this parameter, you will pay the current Spot price.
     *
     * If you specify a maximum price, your instances will be interrupted more frequently than if
     * you do not specify this parameter.
     */
    public fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
    }

    /**
     * @param subnetId The IDs of the subnets in which to launch the instances. To specify multiple
     *   subnets, separate them using commas; for example, "subnet-1234abcdeexample1,
     *   subnet-0987cdef6example2".
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /** @param tagSpecifications The tags to apply during creation. */
    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    /** @param tagSpecifications The tags to apply during creation. */
    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    /** @param tagSpecifications The tags to apply during creation. */
    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * @param userData The base64-encoded user data that instances use when starting up. User data
     *   is limited to 16 KB.
     */
    public fun userData(userData: String) {
        cdkBuilder.userData(userData)
    }

    /**
     * @param weightedCapacity The number of units provided by the specified instance type. These
     *   are the same units that you chose to set the target capacity in terms of instances, or a
     *   performance characteristic such as vCPUs, memory, or I/O.
     *
     * If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the
     * number of instances to the next whole number. If this value is not specified, the default
     * is 1.
     */
    public fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
    }

    public fun build(): CfnSpotFleet.SpotFleetLaunchSpecificationProperty {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        if (_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
