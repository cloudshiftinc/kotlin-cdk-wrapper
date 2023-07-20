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
import software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions
import software.amazon.awscdk.services.ec2.BastionHostLinux
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class BastionHostLinuxDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BastionHostLinux.Builder = BastionHostLinux.Builder.create(scope, id)

    private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
        _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
    }

    public fun blockDevices(blockDevices: Collection<BlockDevice>) {
        _blockDevices.addAll(blockDevices)
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

    public fun instanceName(instanceName: String) {
        cdkBuilder.instanceName(instanceName)
    }

    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
    }

    public fun requireImdsv2(requireImdsv2: Boolean) {
        cdkBuilder.requireImdsv2(requireImdsv2)
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.subnetSelection(builder.build())
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): BastionHostLinux {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        return cdkBuilder.build()
    }
}
