@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
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

/**
 * This creates a linux bastion host you can use to connect to other instances or services in your
 * VPC.
 *
 * The recommended way to connect to the bastion host is by using AWS Systems Manager Session
 * Manager.
 *
 * The operating system is Amazon Linux 2 with the latest SSM agent installed
 *
 * You can also configure this bastion host to allow connections via SSH
 *
 * Example:
 * ```
 * BastionHostLinux host = BastionHostLinux.Builder.create(this, "BastionHost")
 * .vpc(vpc)
 * .blockDevices(List.of(BlockDevice.builder()
 * .deviceName("EBSBastionHost")
 * .volume(BlockDeviceVolume.ebs(10, EbsDeviceOptions.builder()
 * .encrypted(true)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class BastionHostLinuxDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BastionHostLinux.Builder = BastionHostLinux.Builder.create(scope, id)

    private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

    /**
     * In which AZ to place the instance within the VPC.
     *
     * Default: - Random zone.
     *
     * @param availabilityZone In which AZ to place the instance within the VPC.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and
     * EBS volumes.
     *
     * Each instance that is launched has an associated root device volume, either an Amazon EBS
     * volume or an instance store volume. You can use block device mappings to specify additional
     * EBS volumes or instance store volumes to attach to an instance when it is launched.
     *
     * Default: - Uses the block device mapping of the AMI
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     *
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     *   virtual devices and EBS volumes.
     */
    public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
        _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
    }

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and
     * EBS volumes.
     *
     * Each instance that is launched has an associated root device volume, either an Amazon EBS
     * volume or an instance store volume. You can use block device mappings to specify additional
     * EBS volumes or instance store volumes to attach to an instance when it is launched.
     *
     * Default: - Uses the block device mapping of the AMI
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     *
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     *   virtual devices and EBS volumes.
     */
    public fun blockDevices(blockDevices: Collection<BlockDevice>) {
        _blockDevices.addAll(blockDevices)
    }

    /**
     * Apply the given CloudFormation Init configuration to the instance at startup.
     *
     * Default: - no CloudFormation init
     *
     * @param init Apply the given CloudFormation Init configuration to the instance at startup.
     */
    public fun `init`(`init`: CloudFormationInit) {
        cdkBuilder.`init`(`init`)
    }

    /**
     * Use the given options for applying CloudFormation Init.
     *
     * Describes the configsets to use and the timeout to wait
     *
     * Default: - default options
     *
     * @param initOptions Use the given options for applying CloudFormation Init.
     */
    public fun initOptions(initOptions: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}) {
        val builder = ApplyCloudFormationInitOptionsDsl()
        builder.apply(initOptions)
        cdkBuilder.initOptions(builder.build())
    }

    /**
     * Use the given options for applying CloudFormation Init.
     *
     * Describes the configsets to use and the timeout to wait
     *
     * Default: - default options
     *
     * @param initOptions Use the given options for applying CloudFormation Init.
     */
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
        cdkBuilder.initOptions(initOptions)
    }

    /**
     * The name of the instance.
     *
     * Default: 'BastionHost'
     *
     * @param instanceName The name of the instance.
     */
    public fun instanceName(instanceName: String) {
        cdkBuilder.instanceName(instanceName)
    }

    /**
     * Type of instance to launch.
     *
     * Default: 't3.nano'
     *
     * @param instanceType Type of instance to launch.
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The machine image to use, assumed to have SSM Agent preinstalled.
     *
     * Default: - An Amazon Linux 2 image which is kept up-to-date automatically (the instance may
     * be replaced on every deployment) and already has SSM Agent installed.
     *
     * @param machineImage The machine image to use, assumed to have SSM Agent preinstalled.
     */
    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
    }

    /**
     * Whether IMDSv2 should be required on this instance.
     *
     * Default: - false
     *
     * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
     */
    public fun requireImdsv2(requireImdsv2: Boolean) {
        cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * Security Group to assign to this instance.
     *
     * Default: - create new security group with no inbound and all outbound traffic allowed
     *
     * @param securityGroup Security Group to assign to this instance.
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * Select the subnets to run the bastion host in.
     *
     * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use
     * SSM. You have to allow port 22 manually by using the connections field
     *
     * Default: - private subnets of the supplied VPC
     *
     * @param subnetSelection Select the subnets to run the bastion host in.
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * Select the subnets to run the bastion host in.
     *
     * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use
     * SSM. You have to allow port 22 manually by using the connections field
     *
     * Default: - private subnets of the supplied VPC
     *
     * @param subnetSelection Select the subnets to run the bastion host in.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /**
     * VPC to launch the instance in.
     *
     * @param vpc VPC to launch the instance in.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): BastionHostLinux {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        return cdkBuilder.build()
    }
}
