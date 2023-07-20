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
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.CpuCredits
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens
import software.amazon.awscdk.services.ec2.LaunchTemplateProps
import software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IInstanceProfile
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LaunchTemplatePropsDsl {
    private val cdkBuilder: LaunchTemplateProps.Builder = LaunchTemplateProps.builder()

    private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
        _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
    }

    public fun blockDevices(blockDevices: Collection<BlockDevice>) {
        _blockDevices.addAll(blockDevices)
    }

    public fun cpuCredits(cpuCredits: CpuCredits) {
        cdkBuilder.cpuCredits(cpuCredits)
    }

    public fun detailedMonitoring(detailedMonitoring: Boolean) {
        cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    public fun disableApiTermination(disableApiTermination: Boolean) {
        cdkBuilder.disableApiTermination(disableApiTermination)
    }

    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun hibernationConfigured(hibernationConfigured: Boolean) {
        cdkBuilder.hibernationConfigured(hibernationConfigured)
    }

    public fun httpEndpoint(httpEndpoint: Boolean) {
        cdkBuilder.httpEndpoint(httpEndpoint)
    }

    public fun httpProtocolIpv6(httpProtocolIpv6: Boolean) {
        cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    public fun httpTokens(httpTokens: LaunchTemplateHttpTokens) {
        cdkBuilder.httpTokens(httpTokens)
    }

    public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior) {
        cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
    }

    public fun instanceMetadataTags(instanceMetadataTags: Boolean) {
        cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    public fun instanceProfile(instanceProfile: IInstanceProfile) {
        cdkBuilder.instanceProfile(instanceProfile)
    }

    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
    }

    public fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean) {
        cdkBuilder.nitroEnclaveEnabled(nitroEnclaveEnabled)
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

    public fun spotOptions(block: LaunchTemplateSpotOptionsDsl.() -> Unit = {}) {
        val builder = LaunchTemplateSpotOptionsDsl()
        builder.apply(block)
        cdkBuilder.spotOptions(builder.build())
    }

    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions) {
        cdkBuilder.spotOptions(spotOptions)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): LaunchTemplateProps {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        return cdkBuilder.build()
    }
}
