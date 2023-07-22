@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateInstanceRequirementsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.InstanceRequirementsProperty.Builder =
      CfnLaunchTemplate.InstanceRequirementsProperty.builder()

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
   * Inferentia chips) on an instance.
   * To exclude accelerator-enabled instance types, set `Max` to `0` .
   *
   * Default: No minimum or maximum limits
   */
  public fun acceleratorCount(acceleratorCount: IResolvable) {
    cdkBuilder.acceleratorCount(acceleratorCount)
  }

  /**
   * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
   * Inferentia chips) on an instance.
   * To exclude accelerator-enabled instance types, set `Max` to `0` .
   *
   * Default: No minimum or maximum limits
   */
  public fun acceleratorCount(acceleratorCount: CfnLaunchTemplate.AcceleratorCountProperty) {
    cdkBuilder.acceleratorCount(acceleratorCount)
  }

  /**
   * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
   * specific manufacturers.
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
   * specific manufacturers.
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
   * @param acceleratorNames The accelerators that must be on the instance type.
   * * For instance types with NVIDIA A100 GPUs, specify `a100` .
   * * For instance types with NVIDIA V100 GPUs, specify `v100` .
   * * For instance types with NVIDIA K80 GPUs, specify `k80` .
   * * For instance types with NVIDIA T4 GPUs, specify `t4` .
   * * For instance types with NVIDIA M60 GPUs, specify `m60` .
   * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
   * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
   * * For instance types with AWS Inferentia chips, specify `inferentia` .
   * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
   *
   * Default: Any accelerator
   */
  public fun acceleratorNames(vararg acceleratorNames: String) {
    _acceleratorNames.addAll(listOf(*acceleratorNames))
  }

  /**
   * @param acceleratorNames The accelerators that must be on the instance type.
   * * For instance types with NVIDIA A100 GPUs, specify `a100` .
   * * For instance types with NVIDIA V100 GPUs, specify `v100` .
   * * For instance types with NVIDIA K80 GPUs, specify `k80` .
   * * For instance types with NVIDIA T4 GPUs, specify `t4` .
   * * For instance types with NVIDIA M60 GPUs, specify `m60` .
   * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
   * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
   * * For instance types with AWS Inferentia chips, specify `inferentia` .
   * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
   *
   * Default: Any accelerator
   */
  public fun acceleratorNames(acceleratorNames: Collection<String>) {
    _acceleratorNames.addAll(acceleratorNames)
  }

  /**
   * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator memory, in
   * MiB.
   * Default: No minimum or maximum limits
   */
  public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
    cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB)
  }

  /**
   * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator memory, in
   * MiB.
   * Default: No minimum or maximum limits
   */
  public
      fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty) {
    cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB)
  }

  /**
   * @param acceleratorTypes The accelerator types that must be on the instance type.
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
   * @param acceleratorTypes The accelerator types that must be on the instance type.
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
   */
  public fun allowedInstanceTypes(vararg allowedInstanceTypes: String) {
    _allowedInstanceTypes.addAll(listOf(*allowedInstanceTypes))
  }

  /**
   * @param allowedInstanceTypes The instance types to apply your specified attributes against.
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
   */
  public fun allowedInstanceTypes(allowedInstanceTypes: Collection<String>) {
    _allowedInstanceTypes.addAll(allowedInstanceTypes)
  }

  /**
   * @param bareMetal Indicates whether bare metal instance types must be included, excluded, or
   * required.
   * * To include bare metal instance types, specify `included` .
   * * To require only bare metal instance types, specify `required` .
   * * To exclude bare metal instance types, specify `excluded` .
   *
   * Default: `excluded`
   */
  public fun bareMetal(bareMetal: String) {
    cdkBuilder.bareMetal(bareMetal)
  }

  /**
   * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS, in
   * Mbps.
   * For more information, see [Amazon EBS–optimized
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the *Amazon
   * EC2 User Guide* .
   *
   * Default: No minimum or maximum limits
   */
  public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
    cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps)
  }

  /**
   * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS, in
   * Mbps.
   * For more information, see [Amazon EBS–optimized
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the *Amazon
   * EC2 User Guide* .
   *
   * Default: No minimum or maximum limits
   */
  public
      fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty) {
    cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps)
  }

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
  public fun burstablePerformance(burstablePerformance: String) {
    cdkBuilder.burstablePerformance(burstablePerformance)
  }

  /**
   * @param cpuManufacturers The CPU manufacturers to include.
   * * For instance types with Intel CPUs, specify `intel` .
   * * For instance types with AMD CPUs, specify `amd` .
   * * For instance types with AWS CPUs, specify `amazon-web-services` .
   *
   *
   * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a
   * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your
   * launch template.
   *
   *
   * Default: Any manufacturer
   */
  public fun cpuManufacturers(vararg cpuManufacturers: String) {
    _cpuManufacturers.addAll(listOf(*cpuManufacturers))
  }

  /**
   * @param cpuManufacturers The CPU manufacturers to include.
   * * For instance types with Intel CPUs, specify `intel` .
   * * For instance types with AMD CPUs, specify `amd` .
   * * For instance types with AWS CPUs, specify `amazon-web-services` .
   *
   *
   * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a
   * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your
   * launch template.
   *
   *
   * Default: Any manufacturer
   */
  public fun cpuManufacturers(cpuManufacturers: Collection<String>) {
    _cpuManufacturers.addAll(cpuManufacturers)
  }

  /**
   * @param excludedInstanceTypes The instance types to exclude.
   * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to exclude
   * an instance type, size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` ,
   * `m5a.*` , `r*` , `*3*` .
   *
   * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family, which
   * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will exclude all the
   * M5a instance types, but not the M5n instance types.
   *
   *
   * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
   *
   *
   * Default: No excluded instance types
   */
  public fun excludedInstanceTypes(vararg excludedInstanceTypes: String) {
    _excludedInstanceTypes.addAll(listOf(*excludedInstanceTypes))
  }

  /**
   * @param excludedInstanceTypes The instance types to exclude.
   * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to exclude
   * an instance type, size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` ,
   * `m5a.*` , `r*` , `*3*` .
   *
   * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family, which
   * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will exclude all the
   * M5a instance types, but not the M5n instance types.
   *
   *
   * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
   *
   *
   * Default: No excluded instance types
   */
  public fun excludedInstanceTypes(excludedInstanceTypes: Collection<String>) {
    _excludedInstanceTypes.addAll(excludedInstanceTypes)
  }

  /**
   * @param instanceGenerations Indicates whether current or previous generation instance types are
   * included.
   * The current generation instance types are recommended for use. Current generation instance
   * types are typically the latest two to three generations in each instance family. For more
   * information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon EC2
   * User Guide* .
   *
   * For current generation instance types, specify `current` .
   *
   * For previous generation instance types, specify `previous` .
   *
   * Default: Current and previous generation instance types
   */
  public fun instanceGenerations(vararg instanceGenerations: String) {
    _instanceGenerations.addAll(listOf(*instanceGenerations))
  }

  /**
   * @param instanceGenerations Indicates whether current or previous generation instance types are
   * included.
   * The current generation instance types are recommended for use. Current generation instance
   * types are typically the latest two to three generations in each instance family. For more
   * information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon EC2
   * User Guide* .
   *
   * For current generation instance types, specify `current` .
   *
   * For previous generation instance types, specify `previous` .
   *
   * Default: Current and previous generation instance types
   */
  public fun instanceGenerations(instanceGenerations: Collection<String>) {
    _instanceGenerations.addAll(instanceGenerations)
  }

  /**
   * @param localStorage Indicates whether instance types with instance store volumes are included,
   * excluded, or required.
   * For more information, [Amazon EC2 instance
   * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the *Amazon
   * EC2 User Guide* .
   *
   * * To include instance types with instance store volumes, specify `included` .
   * * To require only instance types with instance store volumes, specify `required` .
   * * To exclude instance types with instance store volumes, specify `excluded` .
   *
   * Default: `included`
   */
  public fun localStorage(localStorage: String) {
    cdkBuilder.localStorage(localStorage)
  }

  /**
   * @param localStorageTypes The type of local storage that is required.
   * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
   * * For instance types with solid state drive (SSD) storage, specify `ssd` .
   *
   * Default: `hdd` and `ssd`
   */
  public fun localStorageTypes(vararg localStorageTypes: String) {
    _localStorageTypes.addAll(listOf(*localStorageTypes))
  }

  /**
   * @param localStorageTypes The type of local storage that is required.
   * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
   * * For instance types with solid state drive (SSD) storage, specify `ssd` .
   *
   * Default: `hdd` and `ssd`
   */
  public fun localStorageTypes(localStorageTypes: Collection<String>) {
    _localStorageTypes.addAll(localStorageTypes)
  }

  /**
   * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
   * Default: No minimum or maximum limits
   */
  public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
    cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu)
  }

  /**
   * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
   * Default: No minimum or maximum limits
   */
  public fun memoryGiBPerVCpu(memoryGiBPerVCpu: CfnLaunchTemplate.MemoryGiBPerVCpuProperty) {
    cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu)
  }

  /**
   * @param memoryMiB The minimum and maximum amount of memory, in MiB.
   */
  public fun memoryMiB(memoryMiB: IResolvable) {
    cdkBuilder.memoryMiB(memoryMiB)
  }

  /**
   * @param memoryMiB The minimum and maximum amount of memory, in MiB.
   */
  public fun memoryMiB(memoryMiB: CfnLaunchTemplate.MemoryMiBProperty) {
    cdkBuilder.memoryMiB(memoryMiB)
  }

  /**
   * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in gigabits
   * per second (Gbps).
   * Default: No minimum or maximum limits
   */
  public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
    cdkBuilder.networkBandwidthGbps(networkBandwidthGbps)
  }

  /**
   * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in gigabits
   * per second (Gbps).
   * Default: No minimum or maximum limits
   */
  public
      fun networkBandwidthGbps(networkBandwidthGbps: CfnLaunchTemplate.NetworkBandwidthGbpsProperty) {
    cdkBuilder.networkBandwidthGbps(networkBandwidthGbps)
  }

  /**
   * @param networkInterfaceCount The minimum and maximum number of network interfaces.
   * Default: No minimum or maximum limits
   */
  public fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
    cdkBuilder.networkInterfaceCount(networkInterfaceCount)
  }

  /**
   * @param networkInterfaceCount The minimum and maximum number of network interfaces.
   * Default: No minimum or maximum limits
   */
  public
      fun networkInterfaceCount(networkInterfaceCount: CfnLaunchTemplate.NetworkInterfaceCountProperty) {
    cdkBuilder.networkInterfaceCount(networkInterfaceCount)
  }

  /**
   * @param onDemandMaxPricePercentageOverLowestPrice The price protection threshold for On-Demand
   * Instances.
   * This is the maximum you’ll pay for an On-Demand Instance, expressed as a percentage above the
   * least expensive current generation M, C, or R instance type with your specified attributes. When
   * Amazon EC2 selects instance types with your attributes, it excludes instance types priced above
   * your threshold.
   *
   * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
   *
   * To turn off price protection, specify a high value, such as `999999` .
   *
   * This parameter is not supported for
   * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
   * and
   * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
   * .
   *
   *
   * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection threshold
   * is applied based on the per-vCPU or per-memory price instead of the per-instance price.
   *
   *
   * Default: `20`
   */
  public
      fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
    cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
  }

  /**
   * @param requireHibernateSupport Indicates whether instance types must support hibernation for
   * On-Demand Instances.
   * This parameter is not supported for
   * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
   * .
   *
   * Default: `false`
   */
  public fun requireHibernateSupport(requireHibernateSupport: Boolean) {
    cdkBuilder.requireHibernateSupport(requireHibernateSupport)
  }

  /**
   * @param requireHibernateSupport Indicates whether instance types must support hibernation for
   * On-Demand Instances.
   * This parameter is not supported for
   * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
   * .
   *
   * Default: `false`
   */
  public fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
    cdkBuilder.requireHibernateSupport(requireHibernateSupport)
  }

  /**
   * @param spotMaxPricePercentageOverLowestPrice The price protection threshold for Spot Instances.
   * This is the maximum you’ll pay for a Spot Instance, expressed as a percentage above the least
   * expensive current generation M, C, or R instance type with your specified attributes. When Amazon
   * EC2 selects instance types with your attributes, it excludes instance types priced above your
   * threshold.
   *
   * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
   *
   * To turn off price protection, specify a high value, such as `999999` .
   *
   * This parameter is not supported for
   * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
   * and
   * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
   * .
   *
   *
   * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection threshold
   * is applied based on the per-vCPU or per-memory price instead of the per-instance price.
   *
   *
   * Default: `100`
   */
  public fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
    cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
  }

  /**
   * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
   * Default: No minimum or maximum limits
   */
  public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
    cdkBuilder.totalLocalStorageGb(totalLocalStorageGb)
  }

  /**
   * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
   * Default: No minimum or maximum limits
   */
  public
      fun totalLocalStorageGb(totalLocalStorageGb: CfnLaunchTemplate.TotalLocalStorageGBProperty) {
    cdkBuilder.totalLocalStorageGb(totalLocalStorageGb)
  }

  /**
   * @param vCpuCount The minimum and maximum number of vCPUs.
   */
  public fun vCpuCount(vCpuCount: IResolvable) {
    cdkBuilder.vCpuCount(vCpuCount)
  }

  /**
   * @param vCpuCount The minimum and maximum number of vCPUs.
   */
  public fun vCpuCount(vCpuCount: CfnLaunchTemplate.VCpuCountProperty) {
    cdkBuilder.vCpuCount(vCpuCount)
  }

  public fun build(): CfnLaunchTemplate.InstanceRequirementsProperty {
    if(_acceleratorManufacturers.isNotEmpty())
        cdkBuilder.acceleratorManufacturers(_acceleratorManufacturers)
    if(_acceleratorNames.isNotEmpty()) cdkBuilder.acceleratorNames(_acceleratorNames)
    if(_acceleratorTypes.isNotEmpty()) cdkBuilder.acceleratorTypes(_acceleratorTypes)
    if(_allowedInstanceTypes.isNotEmpty()) cdkBuilder.allowedInstanceTypes(_allowedInstanceTypes)
    if(_cpuManufacturers.isNotEmpty()) cdkBuilder.cpuManufacturers(_cpuManufacturers)
    if(_excludedInstanceTypes.isNotEmpty()) cdkBuilder.excludedInstanceTypes(_excludedInstanceTypes)
    if(_instanceGenerations.isNotEmpty()) cdkBuilder.instanceGenerations(_instanceGenerations)
    if(_localStorageTypes.isNotEmpty()) cdkBuilder.localStorageTypes(_localStorageTypes)
    return cdkBuilder.build()
  }
}
