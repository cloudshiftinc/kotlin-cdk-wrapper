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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnInstanceProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInstancePropsDsl {
    private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _elasticIps: MutableList<String> = mutableListOf()

    private val _layerIds: MutableList<String> = mutableListOf()

    private val _volumes: MutableList<String> = mutableListOf()

    public fun agentVersion(agentVersion: String) {
        cdkBuilder.agentVersion(agentVersion)
    }

    public fun amiId(amiId: String) {
        cdkBuilder.amiId(amiId)
    }

    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    public fun autoScalingType(autoScalingType: String) {
        cdkBuilder.autoScalingType(autoScalingType)
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

    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun elasticIps(vararg elasticIps: String) {
        _elasticIps.addAll(listOf(*elasticIps))
    }

    public fun elasticIps(elasticIps: Collection<String>) {
        _elasticIps.addAll(elasticIps)
    }

    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun layerIds(vararg layerIds: String) {
        _layerIds.addAll(listOf(*layerIds))
    }

    public fun layerIds(layerIds: Collection<String>) {
        _layerIds.addAll(layerIds)
    }

    public fun os(os: String) {
        cdkBuilder.os(os)
    }

    public fun rootDeviceType(rootDeviceType: String) {
        cdkBuilder.rootDeviceType(rootDeviceType)
    }

    public fun sshKeyName(sshKeyName: String) {
        cdkBuilder.sshKeyName(sshKeyName)
    }

    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    public fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable) {
        cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling)
    }

    public fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty) {
        cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling)
    }

    public fun virtualizationType(virtualizationType: String) {
        cdkBuilder.virtualizationType(virtualizationType)
    }

    public fun volumes(vararg volumes: String) {
        _volumes.addAll(listOf(*volumes))
    }

    public fun volumes(volumes: Collection<String>) {
        _volumes.addAll(volumes)
    }

    public fun build(): CfnInstanceProps {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        if (_elasticIps.isNotEmpty()) cdkBuilder.elasticIps(_elasticIps)
        if (_layerIds.isNotEmpty()) cdkBuilder.layerIds(_layerIds)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
