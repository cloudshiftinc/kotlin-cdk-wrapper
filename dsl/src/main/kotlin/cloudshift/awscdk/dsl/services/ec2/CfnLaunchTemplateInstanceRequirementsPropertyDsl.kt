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

  public fun acceleratorCount(acceleratorCount: IResolvable) {
    cdkBuilder.acceleratorCount(acceleratorCount)
  }

  public fun acceleratorCount(acceleratorCount: CfnLaunchTemplate.AcceleratorCountProperty) {
    cdkBuilder.acceleratorCount(acceleratorCount)
  }

  public fun acceleratorManufacturers(vararg acceleratorManufacturers: String) {
    _acceleratorManufacturers.addAll(listOf(*acceleratorManufacturers))
  }

  public fun acceleratorManufacturers(acceleratorManufacturers: Collection<String>) {
    _acceleratorManufacturers.addAll(acceleratorManufacturers)
  }

  public fun acceleratorNames(vararg acceleratorNames: String) {
    _acceleratorNames.addAll(listOf(*acceleratorNames))
  }

  public fun acceleratorNames(acceleratorNames: Collection<String>) {
    _acceleratorNames.addAll(acceleratorNames)
  }

  public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
    cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB)
  }

  public
      fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty) {
    cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB)
  }

  public fun acceleratorTypes(vararg acceleratorTypes: String) {
    _acceleratorTypes.addAll(listOf(*acceleratorTypes))
  }

  public fun acceleratorTypes(acceleratorTypes: Collection<String>) {
    _acceleratorTypes.addAll(acceleratorTypes)
  }

  public fun allowedInstanceTypes(vararg allowedInstanceTypes: String) {
    _allowedInstanceTypes.addAll(listOf(*allowedInstanceTypes))
  }

  public fun allowedInstanceTypes(allowedInstanceTypes: Collection<String>) {
    _allowedInstanceTypes.addAll(allowedInstanceTypes)
  }

  public fun bareMetal(bareMetal: String) {
    cdkBuilder.bareMetal(bareMetal)
  }

  public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
    cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps)
  }

  public
      fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty) {
    cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps)
  }

  public fun burstablePerformance(burstablePerformance: String) {
    cdkBuilder.burstablePerformance(burstablePerformance)
  }

  public fun cpuManufacturers(vararg cpuManufacturers: String) {
    _cpuManufacturers.addAll(listOf(*cpuManufacturers))
  }

  public fun cpuManufacturers(cpuManufacturers: Collection<String>) {
    _cpuManufacturers.addAll(cpuManufacturers)
  }

  public fun excludedInstanceTypes(vararg excludedInstanceTypes: String) {
    _excludedInstanceTypes.addAll(listOf(*excludedInstanceTypes))
  }

  public fun excludedInstanceTypes(excludedInstanceTypes: Collection<String>) {
    _excludedInstanceTypes.addAll(excludedInstanceTypes)
  }

  public fun instanceGenerations(vararg instanceGenerations: String) {
    _instanceGenerations.addAll(listOf(*instanceGenerations))
  }

  public fun instanceGenerations(instanceGenerations: Collection<String>) {
    _instanceGenerations.addAll(instanceGenerations)
  }

  public fun localStorage(localStorage: String) {
    cdkBuilder.localStorage(localStorage)
  }

  public fun localStorageTypes(vararg localStorageTypes: String) {
    _localStorageTypes.addAll(listOf(*localStorageTypes))
  }

  public fun localStorageTypes(localStorageTypes: Collection<String>) {
    _localStorageTypes.addAll(localStorageTypes)
  }

  public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
    cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu)
  }

  public fun memoryGiBPerVCpu(memoryGiBPerVCpu: CfnLaunchTemplate.MemoryGiBPerVCpuProperty) {
    cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu)
  }

  public fun memoryMiB(memoryMiB: IResolvable) {
    cdkBuilder.memoryMiB(memoryMiB)
  }

  public fun memoryMiB(memoryMiB: CfnLaunchTemplate.MemoryMiBProperty) {
    cdkBuilder.memoryMiB(memoryMiB)
  }

  public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
    cdkBuilder.networkBandwidthGbps(networkBandwidthGbps)
  }

  public
      fun networkBandwidthGbps(networkBandwidthGbps: CfnLaunchTemplate.NetworkBandwidthGbpsProperty) {
    cdkBuilder.networkBandwidthGbps(networkBandwidthGbps)
  }

  public fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
    cdkBuilder.networkInterfaceCount(networkInterfaceCount)
  }

  public
      fun networkInterfaceCount(networkInterfaceCount: CfnLaunchTemplate.NetworkInterfaceCountProperty) {
    cdkBuilder.networkInterfaceCount(networkInterfaceCount)
  }

  public
      fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
    cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
  }

  public fun requireHibernateSupport(requireHibernateSupport: Boolean) {
    cdkBuilder.requireHibernateSupport(requireHibernateSupport)
  }

  public fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
    cdkBuilder.requireHibernateSupport(requireHibernateSupport)
  }

  public fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
    cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
  }

  public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
    cdkBuilder.totalLocalStorageGb(totalLocalStorageGb)
  }

  public
      fun totalLocalStorageGb(totalLocalStorageGb: CfnLaunchTemplate.TotalLocalStorageGBProperty) {
    cdkBuilder.totalLocalStorageGb(totalLocalStorageGb)
  }

  public fun vCpuCount(vCpuCount: IResolvable) {
    cdkBuilder.vCpuCount(vCpuCount)
  }

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
