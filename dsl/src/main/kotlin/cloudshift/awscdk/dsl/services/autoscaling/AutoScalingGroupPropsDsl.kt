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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.BlockDevice
import software.amazon.awscdk.services.autoscaling.GroupMetrics
import software.amazon.awscdk.services.autoscaling.HealthCheck
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy
import software.amazon.awscdk.services.autoscaling.Monitoring
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration
import software.amazon.awscdk.services.autoscaling.Signals
import software.amazon.awscdk.services.autoscaling.TerminationPolicy
import software.amazon.awscdk.services.autoscaling.UpdatePolicy
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.amazon.awscdk.services.ec2.ILaunchTemplate
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AutoScalingGroupPropsDsl {
    private val cdkBuilder: AutoScalingGroupProps.Builder = AutoScalingGroupProps.builder()

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

    public fun `init`(`init`: CloudFormationInit) {
        cdkBuilder.`init`(`init`)
    }

    public fun initOptions(block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}) {
        val builder = ApplyCloudFormationInitOptionsDsl()
        builder.apply(block)
        cdkBuilder.initOptions(builder.build())
    }

    public fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
        cdkBuilder.initOptions(initOptions)
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

    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
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

    public fun mixedInstancesPolicy(block: MixedInstancesPolicyDsl.() -> Unit = {}) {
        val builder = MixedInstancesPolicyDsl()
        builder.apply(block)
        cdkBuilder.mixedInstancesPolicy(builder.build())
    }

    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy) {
        cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy)
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

    public fun requireImdsv2(requireImdsv2: Boolean) {
        cdkBuilder.requireImdsv2(requireImdsv2)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun signals(signals: Signals) {
        cdkBuilder.signals(signals)
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

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): AutoScalingGroupProps {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        if (_groupMetrics.isNotEmpty()) cdkBuilder.groupMetrics(_groupMetrics)
        if (_notifications.isNotEmpty()) cdkBuilder.notifications(_notifications)
        if (_terminationPolicies.isNotEmpty()) cdkBuilder.terminationPolicies(_terminationPolicies)
        return cdkBuilder.build()
    }
}
