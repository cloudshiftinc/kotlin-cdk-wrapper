@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance
import software.amazon.awscdk.services.ec2.CfnInstanceProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInstancePropsDsl {
    private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _elasticGpuSpecifications: MutableList<Any> = mutableListOf()

    private val _elasticInferenceAccelerators: MutableList<Any> = mutableListOf()

    private val _ipv6Addresses: MutableList<Any> = mutableListOf()

    private val _licenseSpecifications: MutableList<Any> = mutableListOf()

    private val _networkInterfaces: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _ssmAssociations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _volumes: MutableList<Any> = mutableListOf()

    public fun additionalInfo(additionalInfo: String) {
        cdkBuilder.additionalInfo(additionalInfo)
    }

    public fun affinity(affinity: String) {
        cdkBuilder.affinity(affinity)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
        _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
    }

    public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
        _blockDeviceMappings.addAll(blockDeviceMappings)
    }

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    public fun cpuOptions(cpuOptions: IResolvable) {
        cdkBuilder.cpuOptions(cpuOptions)
    }

    public fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty) {
        cdkBuilder.cpuOptions(cpuOptions)
    }

    public fun creditSpecification(creditSpecification: IResolvable) {
        cdkBuilder.creditSpecification(creditSpecification)
    }

    public fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty) {
        cdkBuilder.creditSpecification(creditSpecification)
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

    public fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty) {
        cdkBuilder.enclaveOptions(enclaveOptions)
    }

    public fun hibernationOptions(hibernationOptions: IResolvable) {
        cdkBuilder.hibernationOptions(hibernationOptions)
    }

    public fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty) {
        cdkBuilder.hibernationOptions(hibernationOptions)
    }

    public fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
    }

    public fun hostResourceGroupArn(hostResourceGroupArn: String) {
        cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
    }

    public fun iamInstanceProfile(iamInstanceProfile: String) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    public fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
    }

    public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
        cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    public fun ipv6Addresses(vararg ipv6Addresses: Any) {
        _ipv6Addresses.addAll(listOf(*ipv6Addresses))
    }

    public fun ipv6Addresses(ipv6Addresses: Collection<Any>) {
        _ipv6Addresses.addAll(ipv6Addresses)
    }

    public fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    public fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
    }

    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate)
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

    public fun monitoring(monitoring: Boolean) {
        cdkBuilder.monitoring(monitoring)
    }

    public fun monitoring(monitoring: IResolvable) {
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

    public fun placementGroupName(placementGroupName: String) {
        cdkBuilder.placementGroupName(placementGroupName)
    }

    public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
    }

    public fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
    }

    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
        cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable) {
        cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    public fun ramdiskId(ramdiskId: String) {
        cdkBuilder.ramdiskId(ramdiskId)
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

    public fun sourceDestCheck(sourceDestCheck: Boolean) {
        cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    public fun sourceDestCheck(sourceDestCheck: IResolvable) {
        cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    public fun ssmAssociations(vararg ssmAssociations: Any) {
        _ssmAssociations.addAll(listOf(*ssmAssociations))
    }

    public fun ssmAssociations(ssmAssociations: Collection<Any>) {
        _ssmAssociations.addAll(ssmAssociations)
    }

    public fun ssmAssociations(ssmAssociations: IResolvable) {
        cdkBuilder.ssmAssociations(ssmAssociations)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    public fun userData(userData: String) {
        cdkBuilder.userData(userData)
    }

    public fun volumes(vararg volumes: Any) {
        _volumes.addAll(listOf(*volumes))
    }

    public fun volumes(volumes: Collection<Any>) {
        _volumes.addAll(volumes)
    }

    public fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes)
    }

    public fun build(): CfnInstanceProps {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        if (_elasticGpuSpecifications.isNotEmpty()) {
            cdkBuilder.elasticGpuSpecifications(_elasticGpuSpecifications)
        }
        if (_elasticInferenceAccelerators.isNotEmpty()) {
            cdkBuilder.elasticInferenceAccelerators(_elasticInferenceAccelerators)
        }
        if (_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
        if (_licenseSpecifications.isNotEmpty()) cdkBuilder.licenseSpecifications(_licenseSpecifications)
        if (_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_ssmAssociations.isNotEmpty()) cdkBuilder.ssmAssociations(_ssmAssociations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
