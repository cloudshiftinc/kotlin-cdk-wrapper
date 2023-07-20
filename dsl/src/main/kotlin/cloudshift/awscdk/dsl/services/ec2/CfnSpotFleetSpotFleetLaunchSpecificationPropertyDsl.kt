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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSpotFleetSpotFleetLaunchSpecificationPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.SpotFleetLaunchSpecificationProperty.Builder =
        CfnSpotFleet.SpotFleetLaunchSpecificationProperty.builder()

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _networkInterfaces: MutableList<Any> = mutableListOf()

    private val _securityGroups: MutableList<Any> = mutableListOf()

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

    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    public fun iamInstanceProfile(iamInstanceProfile: CfnSpotFleet.IamInstanceProfileSpecificationProperty) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    public fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
    }

    public fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements)
    }

    public fun instanceRequirements(instanceRequirements: CfnSpotFleet.InstanceRequirementsRequestProperty) {
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

    public fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring)
    }

    public fun monitoring(monitoring: CfnSpotFleet.SpotFleetMonitoringProperty) {
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

    public fun placement(placement: CfnSpotFleet.SpotPlacementProperty) {
        cdkBuilder.placement(placement)
    }

    public fun ramdiskId(ramdiskId: String) {
        cdkBuilder.ramdiskId(ramdiskId)
    }

    public fun securityGroups(vararg securityGroups: Any) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<Any>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups)
    }

    public fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
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
