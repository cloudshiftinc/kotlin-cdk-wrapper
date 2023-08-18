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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * The attributes for the instance types for a mixed instances policy.
 *
 * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then, it
 * uses your On-Demand and Spot allocation strategies to launch instances from these instance types.
 *
 * When you specify multiple attributes, you get instance types that satisfy all of the specified
 * attributes. If you specify multiple values for an attribute, you get instance types that satisfy
 * any of the specified values.
 *
 * To limit the list of instance types from which Amazon EC2 Auto Scaling can identify matching
 * instance types, you can use one of the following parameters, but not both in the same request:
 * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance types
 *   are ignored, even if they match your specified attributes.
 * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match your
 *   specified attributes.
 *
 * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any unspecified
 * optional attribute is set to its default.
 *
 * For an example template, see
 * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
 * .
 *
 * For more information, see
 * [Creating an Auto Scaling group using attribute-based instance type selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-instance-type-requirements.html)
 * in the *Amazon EC2 Auto Scaling User Guide* . For help determining which instance types match
 * your attributes before you apply them to your Auto Scaling group, see
 * [Preview instance types with specified attributes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-get-instance-types-from-instance-requirements)
 * in the *Amazon EC2 User Guide for Linux Instances* .
 *
 * `InstanceRequirements` is a property of the `LaunchTemplateOverrides` property of the
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * InstanceRequirementsProperty instanceRequirementsProperty =
 * InstanceRequirementsProperty.builder()
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
 * .vCpuCount(VCpuCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupInstanceRequirementsPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.InstanceRequirementsProperty.Builder =
        CfnAutoScalingGroup.InstanceRequirementsProperty.builder()

    private val _acceleratorManufacturers: MutableList<String> = mutableListOf()

    private val _acceleratorNames: MutableList<String> = mutableListOf()

    private val _acceleratorTypes: MutableList<String> = mutableListOf()

    private val _allowedInstanceTypes: MutableList<String> = mutableListOf()

    private val _cpuManufacturers: MutableList<String> = mutableListOf()

    private val _excludedInstanceTypes: MutableList<String> = mutableListOf()

    private val _instanceGenerations: MutableList<String> = mutableListOf()

    private val _localStorageTypes: MutableList<String> = mutableListOf()

    /**
     * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
     *   Inferentia chips) for an instance type. To exclude accelerator-enabled instance types, set
     *   `Max` to `0` .
     *
     * Default: No minimum or maximum limits
     */
    public fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount)
    }

    /**
     * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
     *   Inferentia chips) for an instance type. To exclude accelerator-enabled instance types, set
     *   `Max` to `0` .
     *
     * Default: No minimum or maximum limits
     */
    public fun acceleratorCount(
        acceleratorCount: CfnAutoScalingGroup.AcceleratorCountRequestProperty
    ) {
        cdkBuilder.acceleratorCount(acceleratorCount)
    }

    /**
     * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
     *   specific manufacturers.
     * * For instance types with NVIDIA devices, specify `nvidia` .
     * * For instance types with AMD devices, specify `amd` .
     * * For instance types with AWS devices, specify `amazon-web-services` .
     * * For instance types with Xilinx devices, specify `xilinx` .
     *
     * Default: Any manufacturer
     */
    public fun acceleratorManufacturers(vararg acceleratorManufacturers: String) {
        _acceleratorManufacturers.addAll(listOf(*acceleratorManufacturers))
    }

    /**
     * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
     *   specific manufacturers.
     * * For instance types with NVIDIA devices, specify `nvidia` .
     * * For instance types with AMD devices, specify `amd` .
     * * For instance types with AWS devices, specify `amazon-web-services` .
     * * For instance types with Xilinx devices, specify `xilinx` .
     *
     * Default: Any manufacturer
     */
    public fun acceleratorManufacturers(acceleratorManufacturers: Collection<String>) {
        _acceleratorManufacturers.addAll(acceleratorManufacturers)
    }

    /**
     * @param acceleratorNames Lists the accelerators that must be on an instance type.
     * * For instance types with NVIDIA A100 GPUs, specify `a100` .
     * * For instance types with NVIDIA V100 GPUs, specify `v100` .
     * * For instance types with NVIDIA K80 GPUs, specify `k80` .
     * * For instance types with NVIDIA T4 GPUs, specify `t4` .
     * * For instance types with NVIDIA M60 GPUs, specify `m60` .
     * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
     * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
     *
     * Default: Any accelerator
     */
    public fun acceleratorNames(vararg acceleratorNames: String) {
        _acceleratorNames.addAll(listOf(*acceleratorNames))
    }

    /**
     * @param acceleratorNames Lists the accelerators that must be on an instance type.
     * * For instance types with NVIDIA A100 GPUs, specify `a100` .
     * * For instance types with NVIDIA V100 GPUs, specify `v100` .
     * * For instance types with NVIDIA K80 GPUs, specify `k80` .
     * * For instance types with NVIDIA T4 GPUs, specify `t4` .
     * * For instance types with NVIDIA M60 GPUs, specify `m60` .
     * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
     * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
     *
     * Default: Any accelerator
     */
    public fun acceleratorNames(acceleratorNames: Collection<String>) {
        _acceleratorNames.addAll(acceleratorNames)
    }

    /**
     * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
     *   accelerators on an instance type, in MiB. Default: No minimum or maximum limits
     */
    public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB)
    }

    /**
     * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
     *   accelerators on an instance type, in MiB. Default: No minimum or maximum limits
     */
    public fun acceleratorTotalMemoryMiB(
        acceleratorTotalMemoryMiB: CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty
    ) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB)
    }

    /**
     * @param acceleratorTypes Lists the accelerator types that must be on an instance type.
     * * For instance types with GPU accelerators, specify `gpu` .
     * * For instance types with FPGA accelerators, specify `fpga` .
     * * For instance types with inference accelerators, specify `inference` .
     *
     * Default: Any accelerator type
     */
    public fun acceleratorTypes(vararg acceleratorTypes: String) {
        _acceleratorTypes.addAll(listOf(*acceleratorTypes))
    }

    /**
     * @param acceleratorTypes Lists the accelerator types that must be on an instance type.
     * * For instance types with GPU accelerators, specify `gpu` .
     * * For instance types with FPGA accelerators, specify `fpga` .
     * * For instance types with inference accelerators, specify `inference` .
     *
     * Default: Any accelerator type
     */
    public fun acceleratorTypes(acceleratorTypes: Collection<String>) {
        _acceleratorTypes.addAll(acceleratorTypes)
    }

    /**
     * @param allowedInstanceTypes The instance types to apply your specified attributes against.
     *   All other instance types are ignored, even if they match your specified attributes.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to allow
     * an instance type, size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` ,
     * `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5 instance
     * family, which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2
     * Auto Scaling will allow all the M5a instance types, but not the M5n instance types.
     *
     * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
     *
     * Default: All instance types
     */
    public fun allowedInstanceTypes(vararg allowedInstanceTypes: String) {
        _allowedInstanceTypes.addAll(listOf(*allowedInstanceTypes))
    }

    /**
     * @param allowedInstanceTypes The instance types to apply your specified attributes against.
     *   All other instance types are ignored, even if they match your specified attributes.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to allow
     * an instance type, size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` ,
     * `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5 instance
     * family, which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2
     * Auto Scaling will allow all the M5a instance types, but not the M5n instance types.
     *
     * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
     *
     * Default: All instance types
     */
    public fun allowedInstanceTypes(allowedInstanceTypes: Collection<String>) {
        _allowedInstanceTypes.addAll(allowedInstanceTypes)
    }

    /**
     * @param bareMetal Indicates whether bare metal instance types are included, excluded, or
     *   required. Default: `excluded`
     */
    public fun bareMetal(bareMetal: String) {
        cdkBuilder.bareMetal(bareMetal)
    }

    /**
     * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for an
     *   instance type, in Mbps. For more information, see
     *   [Amazon EBS–optimized instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Default: No minimum or maximum limits
     */
    public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps)
    }

    /**
     * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for an
     *   instance type, in Mbps. For more information, see
     *   [Amazon EBS–optimized instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Default: No minimum or maximum limits
     */
    public fun baselineEbsBandwidthMbps(
        baselineEbsBandwidthMbps: CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty
    ) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps)
    }

    /**
     * @param burstablePerformance Indicates whether burstable performance instance types are
     *   included, excluded, or required. For more information, see
     *   [Burstable performance instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Default: `excluded`
     */
    public fun burstablePerformance(burstablePerformance: String) {
        cdkBuilder.burstablePerformance(burstablePerformance)
    }

    /**
     * @param cpuManufacturers Lists which specific CPU manufacturers to include.
     * * For instance types with Intel CPUs, specify `intel` .
     * * For instance types with AMD CPUs, specify `amd` .
     * * For instance types with AWS CPUs, specify `amazon-web-services` .
     *
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
     * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI)
     * that you specify in your launch template.
     *
     * Default: Any manufacturer
     */
    public fun cpuManufacturers(vararg cpuManufacturers: String) {
        _cpuManufacturers.addAll(listOf(*cpuManufacturers))
    }

    /**
     * @param cpuManufacturers Lists which specific CPU manufacturers to include.
     * * For instance types with Intel CPUs, specify `intel` .
     * * For instance types with AMD CPUs, specify `amd` .
     * * For instance types with AWS CPUs, specify `amazon-web-services` .
     *
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
     * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI)
     * that you specify in your launch template.
     *
     * Default: Any manufacturer
     */
    public fun cpuManufacturers(cpuManufacturers: Collection<String>) {
        _cpuManufacturers.addAll(cpuManufacturers)
    }

    /**
     * @param excludedInstanceTypes The instance types to exclude. You can use strings with one or
     *   more wild cards, represented by an asterisk ( `*` ), to exclude an instance family, type,
     *   size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` ,
     *   `*3*` .
     *
     * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling
     * will exclude all the M5a instance types, but not the M5n instance types.
     *
     * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
     *
     * Default: No excluded instance types
     */
    public fun excludedInstanceTypes(vararg excludedInstanceTypes: String) {
        _excludedInstanceTypes.addAll(listOf(*excludedInstanceTypes))
    }

    /**
     * @param excludedInstanceTypes The instance types to exclude. You can use strings with one or
     *   more wild cards, represented by an asterisk ( `*` ), to exclude an instance family, type,
     *   size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` ,
     *   `*3*` .
     *
     * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling
     * will exclude all the M5a instance types, but not the M5n instance types.
     *
     * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
     *
     * Default: No excluded instance types
     */
    public fun excludedInstanceTypes(excludedInstanceTypes: Collection<String>) {
        _excludedInstanceTypes.addAll(excludedInstanceTypes)
    }

    /**
     * @param instanceGenerations Indicates whether current or previous generation instance types
     *   are included.
     * * For current generation instance types, specify `current` . The current generation includes
     *   EC2 instance types currently recommended for use. This typically includes the latest two to
     *   three generations in each instance family. For more information, see
     *   [Instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     * * For previous generation instance types, specify `previous` .
     *
     * Default: Any current or previous generation
     */
    public fun instanceGenerations(vararg instanceGenerations: String) {
        _instanceGenerations.addAll(listOf(*instanceGenerations))
    }

    /**
     * @param instanceGenerations Indicates whether current or previous generation instance types
     *   are included.
     * * For current generation instance types, specify `current` . The current generation includes
     *   EC2 instance types currently recommended for use. This typically includes the latest two to
     *   three generations in each instance family. For more information, see
     *   [Instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     * * For previous generation instance types, specify `previous` .
     *
     * Default: Any current or previous generation
     */
    public fun instanceGenerations(instanceGenerations: Collection<String>) {
        _instanceGenerations.addAll(instanceGenerations)
    }

    /**
     * @param localStorage Indicates whether instance types with instance store volumes are
     *   included, excluded, or required. For more information, see
     *   [Amazon EC2 instance store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Default: `included`
     */
    public fun localStorage(localStorage: String) {
        cdkBuilder.localStorage(localStorage)
    }

    /**
     * @param localStorageTypes Indicates the type of local storage that is required.
     * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
     * * For instance types with solid state drive (SSD) storage, specify `ssd` .
     *
     * Default: Any local storage type
     */
    public fun localStorageTypes(vararg localStorageTypes: String) {
        _localStorageTypes.addAll(listOf(*localStorageTypes))
    }

    /**
     * @param localStorageTypes Indicates the type of local storage that is required.
     * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
     * * For instance types with solid state drive (SSD) storage, specify `ssd` .
     *
     * Default: Any local storage type
     */
    public fun localStorageTypes(localStorageTypes: Collection<String>) {
        _localStorageTypes.addAll(localStorageTypes)
    }

    /**
     * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
     *   type, in GiB. Default: No minimum or maximum limits
     */
    public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu)
    }

    /**
     * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
     *   type, in GiB. Default: No minimum or maximum limits
     */
    public fun memoryGiBPerVCpu(
        memoryGiBPerVCpu: CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty
    ) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu)
    }

    /**
     * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
     */
    public fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB)
    }

    /**
     * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
     */
    public fun memoryMiB(memoryMiB: CfnAutoScalingGroup.MemoryMiBRequestProperty) {
        cdkBuilder.memoryMiB(memoryMiB)
    }

    /**
     * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in gigabits
     *   per second (Gbps). Default: No minimum or maximum limits
     */
    public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps)
    }

    /**
     * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in gigabits
     *   per second (Gbps). Default: No minimum or maximum limits
     */
    public fun networkBandwidthGbps(
        networkBandwidthGbps: CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty
    ) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps)
    }

    /**
     * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
     *   instance type. Default: No minimum or maximum limits
     */
    public fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount)
    }

    /**
     * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
     *   instance type. Default: No minimum or maximum limits
     */
    public fun networkInterfaceCount(
        networkInterfaceCount: CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty
    ) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount)
    }

    /**
     * @param onDemandMaxPricePercentageOverLowestPrice The price protection threshold for On-Demand
     *   Instances. This is the maximum you’ll pay for an On-Demand Instance, expressed as a
     *   percentage higher than the least expensive current generation M, C, or R instance type with
     *   your specified attributes. When Amazon EC2 Auto Scaling selects instance types with your
     *   attributes, we will exclude instance types whose price is higher than your threshold. The
     *   parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To
     *   turn off price protection, specify a high value, such as `999999` .
     *
     * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
     * is applied based on the per vCPU or per memory price instead of the per instance price.
     *
     * Default: `20`
     */
    public fun onDemandMaxPricePercentageOverLowestPrice(
        onDemandMaxPricePercentageOverLowestPrice: Number
    ) {
        cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(
            onDemandMaxPricePercentageOverLowestPrice
        )
    }

    /**
     * @param requireHibernateSupport Indicates whether instance types must provide On-Demand
     *   Instance hibernation support. Default: `false`
     */
    public fun requireHibernateSupport(requireHibernateSupport: Boolean) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
    }

    /**
     * @param requireHibernateSupport Indicates whether instance types must provide On-Demand
     *   Instance hibernation support. Default: `false`
     */
    public fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
    }

    /**
     * @param spotMaxPricePercentageOverLowestPrice The price protection threshold for Spot
     *   Instances. This is the maximum you’ll pay for a Spot Instance, expressed as a percentage
     *   higher than the least expensive current generation M, C, or R instance type with your
     *   specified attributes. When Amazon EC2 Auto Scaling selects instance types with your
     *   attributes, we will exclude instance types whose price is higher than your threshold. The
     *   parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage. To
     *   turn off price protection, specify a high value, such as `999999` .
     *
     * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
     * is applied based on the per vCPU or per memory price instead of the per instance price.
     *
     * Default: `100`
     */
    public fun spotMaxPricePercentageOverLowestPrice(
        spotMaxPricePercentageOverLowestPrice: Number
    ) {
        cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
    }

    /**
     * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
     *   type, in GB. Default: No minimum or maximum limits
     */
    public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb)
    }

    /**
     * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
     *   type, in GB. Default: No minimum or maximum limits
     */
    public fun totalLocalStorageGb(
        totalLocalStorageGb: CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty
    ) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb)
    }

    /** @param vCpuCount The minimum and maximum number of vCPUs for an instance type. */
    public fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount)
    }

    /** @param vCpuCount The minimum and maximum number of vCPUs for an instance type. */
    public fun vCpuCount(vCpuCount: CfnAutoScalingGroup.VCpuCountRequestProperty) {
        cdkBuilder.vCpuCount(vCpuCount)
    }

    public fun build(): CfnAutoScalingGroup.InstanceRequirementsProperty {
        if (_acceleratorManufacturers.isNotEmpty())
            cdkBuilder.acceleratorManufacturers(_acceleratorManufacturers)
        if (_acceleratorNames.isNotEmpty()) cdkBuilder.acceleratorNames(_acceleratorNames)
        if (_acceleratorTypes.isNotEmpty()) cdkBuilder.acceleratorTypes(_acceleratorTypes)
        if (_allowedInstanceTypes.isNotEmpty())
            cdkBuilder.allowedInstanceTypes(_allowedInstanceTypes)
        if (_cpuManufacturers.isNotEmpty()) cdkBuilder.cpuManufacturers(_cpuManufacturers)
        if (_excludedInstanceTypes.isNotEmpty())
            cdkBuilder.excludedInstanceTypes(_excludedInstanceTypes)
        if (_instanceGenerations.isNotEmpty()) cdkBuilder.instanceGenerations(_instanceGenerations)
        if (_localStorageTypes.isNotEmpty()) cdkBuilder.localStorageTypes(_localStorageTypes)
        return cdkBuilder.build()
    }
}
