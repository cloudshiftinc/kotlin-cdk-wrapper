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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.autoscaling.BlockDeviceDsl
import cloudshift.awscdk.dsl.services.autoscaling.NotificationConfigurationDsl
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.BlockDevice
import software.amazon.awscdk.services.autoscaling.GroupMetrics
import software.amazon.awscdk.services.autoscaling.HealthCheck
import software.amazon.awscdk.services.autoscaling.Monitoring
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration
import software.amazon.awscdk.services.autoscaling.Signals
import software.amazon.awscdk.services.autoscaling.TerminationPolicy
import software.amazon.awscdk.services.autoscaling.UpdatePolicy
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions
import software.amazon.awscdk.services.eks.BootstrapOptions
import software.amazon.awscdk.services.eks.MachineImageType
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AutoScalingGroupCapacityOptionsDsl {
    private val cdkBuilder: AutoScalingGroupCapacityOptions.Builder =
        AutoScalingGroupCapacityOptions.builder()

    private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

    private val _groupMetrics: MutableList<GroupMetrics> = mutableListOf()

    private val _notifications: MutableList<NotificationConfiguration> = mutableListOf()

    private val _terminationPolicies: MutableList<TerminationPolicy> = mutableListOf()

    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    public fun autoScalingGroupName(autoScalingGroupName: String) {
        cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
        _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
    }

    public fun blockDevices(blockDevices: Collection<BlockDevice>) {
        _blockDevices.addAll(blockDevices)
    }

    public fun bootstrapEnabled(bootstrapEnabled: Boolean) {
        cdkBuilder.bootstrapEnabled(bootstrapEnabled)
    }

    public fun bootstrapOptions(block: BootstrapOptionsDsl.() -> Unit = {}) {
        val builder = BootstrapOptionsDsl()
        builder.apply(block)
        cdkBuilder.bootstrapOptions(builder.build())
    }

    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
        cdkBuilder.bootstrapOptions(bootstrapOptions)
    }

    public fun capacityRebalance(capacityRebalance: Boolean) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    public fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
        cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
    }

    public fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    public fun groupMetrics(vararg groupMetrics: GroupMetrics) {
        _groupMetrics.addAll(listOf(*groupMetrics))
    }

    public fun groupMetrics(groupMetrics: Collection<GroupMetrics>) {
        _groupMetrics.addAll(groupMetrics)
    }

    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
        cdkBuilder.ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties)
    }

    public fun instanceMonitoring(instanceMonitoring: Monitoring) {
        cdkBuilder.instanceMonitoring(instanceMonitoring)
    }

    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    public fun machineImageType(machineImageType: MachineImageType) {
        cdkBuilder.machineImageType(machineImageType)
    }

    public fun mapRole(mapRole: Boolean) {
        cdkBuilder.mapRole(mapRole)
    }

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
        cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
        cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    public fun notifications(notifications: NotificationConfigurationDsl.() -> Unit) {
        _notifications.add(NotificationConfigurationDsl().apply(notifications).build())
    }

    public fun notifications(notifications: Collection<NotificationConfiguration>) {
        _notifications.addAll(notifications)
    }

    public fun signals(signals: Signals) {
        cdkBuilder.signals(signals)
    }

    public fun spotInterruptHandler(spotInterruptHandler: Boolean) {
        cdkBuilder.spotInterruptHandler(spotInterruptHandler)
    }

    public fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
    }

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
        cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    public fun terminationPolicies(vararg terminationPolicies: TerminationPolicy) {
        _terminationPolicies.addAll(listOf(*terminationPolicies))
    }

    public fun terminationPolicies(terminationPolicies: Collection<TerminationPolicy>) {
        _terminationPolicies.addAll(terminationPolicies)
    }

    public fun updatePolicy(updatePolicy: UpdatePolicy) {
        cdkBuilder.updatePolicy(updatePolicy)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): AutoScalingGroupCapacityOptions {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        if (_groupMetrics.isNotEmpty()) cdkBuilder.groupMetrics(_groupMetrics)
        if (_notifications.isNotEmpty()) cdkBuilder.notifications(_notifications)
        if (_terminationPolicies.isNotEmpty()) cdkBuilder.terminationPolicies(_terminationPolicies)
        return cdkBuilder.build()
    }
}
