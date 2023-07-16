@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateLaunchTemplateDataPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder =
      CfnLaunchTemplate.LaunchTemplateDataProperty.builder()

  private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

  private val _elasticGpuSpecifications: MutableList<Any> = mutableListOf()

  private val _elasticInferenceAccelerators: MutableList<Any> = mutableListOf()

  private val _licenseSpecifications: MutableList<Any> = mutableListOf()

  private val _networkInterfaces: MutableList<Any> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
    _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
  }

  public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
    _blockDeviceMappings.addAll(blockDeviceMappings)
  }

  public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
    cdkBuilder.blockDeviceMappings(blockDeviceMappings)
  }

  public fun capacityReservationSpecification(capacityReservationSpecification: IResolvable) {
    cdkBuilder.capacityReservationSpecification(capacityReservationSpecification)
  }

  public
      fun capacityReservationSpecification(capacityReservationSpecification: CfnLaunchTemplate.CapacityReservationSpecificationProperty) {
    cdkBuilder.capacityReservationSpecification(capacityReservationSpecification)
  }

  public fun cpuOptions(cpuOptions: IResolvable) {
    cdkBuilder.cpuOptions(cpuOptions)
  }

  public fun cpuOptions(cpuOptions: CfnLaunchTemplate.CpuOptionsProperty) {
    cdkBuilder.cpuOptions(cpuOptions)
  }

  public fun creditSpecification(creditSpecification: IResolvable) {
    cdkBuilder.creditSpecification(creditSpecification)
  }

  public
      fun creditSpecification(creditSpecification: CfnLaunchTemplate.CreditSpecificationProperty) {
    cdkBuilder.creditSpecification(creditSpecification)
  }

  public fun disableApiStop(disableApiStop: Boolean) {
    cdkBuilder.disableApiStop(disableApiStop)
  }

  public fun disableApiStop(disableApiStop: IResolvable) {
    cdkBuilder.disableApiStop(disableApiStop)
  }

  public fun disableApiTermination(disableApiTermination: Boolean) {
    cdkBuilder.disableApiTermination(disableApiTermination)
  }

  public fun disableApiTermination(disableApiTermination: IResolvable) {
    cdkBuilder.disableApiTermination(disableApiTermination)
  }

  public fun ebsOptimized(ebsOptimized: Boolean) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun ebsOptimized(ebsOptimized: IResolvable) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any) {
    _elasticGpuSpecifications.addAll(listOf(*elasticGpuSpecifications))
  }

  public fun elasticGpuSpecifications(elasticGpuSpecifications: Collection<Any>) {
    _elasticGpuSpecifications.addAll(elasticGpuSpecifications)
  }

  public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
    cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications)
  }

  public fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any) {
    _elasticInferenceAccelerators.addAll(listOf(*elasticInferenceAccelerators))
  }

  public fun elasticInferenceAccelerators(elasticInferenceAccelerators: Collection<Any>) {
    _elasticInferenceAccelerators.addAll(elasticInferenceAccelerators)
  }

  public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
    cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators)
  }

  public fun enclaveOptions(enclaveOptions: IResolvable) {
    cdkBuilder.enclaveOptions(enclaveOptions)
  }

  public fun enclaveOptions(enclaveOptions: CfnLaunchTemplate.EnclaveOptionsProperty) {
    cdkBuilder.enclaveOptions(enclaveOptions)
  }

  public fun hibernationOptions(hibernationOptions: IResolvable) {
    cdkBuilder.hibernationOptions(hibernationOptions)
  }

  public fun hibernationOptions(hibernationOptions: CfnLaunchTemplate.HibernationOptionsProperty) {
    cdkBuilder.hibernationOptions(hibernationOptions)
  }

  public fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
    cdkBuilder.iamInstanceProfile(iamInstanceProfile)
  }

  public fun iamInstanceProfile(iamInstanceProfile: CfnLaunchTemplate.IamInstanceProfileProperty) {
    cdkBuilder.iamInstanceProfile(iamInstanceProfile)
  }

  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
    cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
  }

  public fun instanceMarketOptions(instanceMarketOptions: IResolvable) {
    cdkBuilder.instanceMarketOptions(instanceMarketOptions)
  }

  public
      fun instanceMarketOptions(instanceMarketOptions: CfnLaunchTemplate.InstanceMarketOptionsProperty) {
    cdkBuilder.instanceMarketOptions(instanceMarketOptions)
  }

  public fun instanceRequirements(instanceRequirements: IResolvable) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  public
      fun instanceRequirements(instanceRequirements: CfnLaunchTemplate.InstanceRequirementsProperty) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun kernelId(kernelId: String) {
    cdkBuilder.kernelId(kernelId)
  }

  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  public fun licenseSpecifications(vararg licenseSpecifications: Any) {
    _licenseSpecifications.addAll(listOf(*licenseSpecifications))
  }

  public fun licenseSpecifications(licenseSpecifications: Collection<Any>) {
    _licenseSpecifications.addAll(licenseSpecifications)
  }

  public fun licenseSpecifications(licenseSpecifications: IResolvable) {
    cdkBuilder.licenseSpecifications(licenseSpecifications)
  }

  public fun maintenanceOptions(maintenanceOptions: IResolvable) {
    cdkBuilder.maintenanceOptions(maintenanceOptions)
  }

  public fun maintenanceOptions(maintenanceOptions: CfnLaunchTemplate.MaintenanceOptionsProperty) {
    cdkBuilder.maintenanceOptions(maintenanceOptions)
  }

  public fun metadataOptions(metadataOptions: IResolvable) {
    cdkBuilder.metadataOptions(metadataOptions)
  }

  public fun metadataOptions(metadataOptions: CfnLaunchTemplate.MetadataOptionsProperty) {
    cdkBuilder.metadataOptions(metadataOptions)
  }

  public fun monitoring(monitoring: IResolvable) {
    cdkBuilder.monitoring(monitoring)
  }

  public fun monitoring(monitoring: CfnLaunchTemplate.MonitoringProperty) {
    cdkBuilder.monitoring(monitoring)
  }

  public fun networkInterfaces(vararg networkInterfaces: Any) {
    _networkInterfaces.addAll(listOf(*networkInterfaces))
  }

  public fun networkInterfaces(networkInterfaces: Collection<Any>) {
    _networkInterfaces.addAll(networkInterfaces)
  }

  public fun networkInterfaces(networkInterfaces: IResolvable) {
    cdkBuilder.networkInterfaces(networkInterfaces)
  }

  public fun placement(placement: IResolvable) {
    cdkBuilder.placement(placement)
  }

  public fun placement(placement: CfnLaunchTemplate.PlacementProperty) {
    cdkBuilder.placement(placement)
  }

  public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
    cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
  }

  public
      fun privateDnsNameOptions(privateDnsNameOptions: CfnLaunchTemplate.PrivateDnsNameOptionsProperty) {
    cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
  }

  public fun ramDiskId(ramDiskId: String) {
    cdkBuilder.ramDiskId(ramDiskId)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  public fun userData(userData: String) {
    cdkBuilder.userData(userData)
  }

  public fun build(): CfnLaunchTemplate.LaunchTemplateDataProperty {
    if(_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
    if(_elasticGpuSpecifications.isNotEmpty())
        cdkBuilder.elasticGpuSpecifications(_elasticGpuSpecifications)
    if(_elasticInferenceAccelerators.isNotEmpty())
        cdkBuilder.elasticInferenceAccelerators(_elasticInferenceAccelerators)
    if(_licenseSpecifications.isNotEmpty()) cdkBuilder.licenseSpecifications(_licenseSpecifications)
    if(_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}
