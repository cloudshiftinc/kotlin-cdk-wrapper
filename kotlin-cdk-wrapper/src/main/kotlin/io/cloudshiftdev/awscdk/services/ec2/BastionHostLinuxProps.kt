@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties of the bastion host.
 *
 * Example:
 *
 * ```
 * BastionHostLinux host = BastionHostLinux.Builder.create(this, "BastionHost")
 * .vpc(vpc)
 * .blockDevices(List.of(BlockDevice.builder()
 * .deviceName("/dev/sdh")
 * .volume(BlockDeviceVolume.ebs(10, EbsDeviceOptions.builder()
 * .encrypted(true)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
public interface BastionHostLinuxProps {
  /**
   * In which AZ to place the instance within the VPC.
   *
   * Default: - Random zone.
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * Specifies how block devices are exposed to the instance. You can specify virtual devices and
   * EBS volumes.
   *
   * Each instance that is launched has an associated root device volume,
   * either an Amazon EBS volume or an instance store volume.
   * You can use block device mappings to specify additional EBS volumes or
   * instance store volumes to attach to an instance when it is launched.
   *
   * Default: - Uses the block device mapping of the AMI
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
   */
  public fun blockDevices(): List<BlockDevice> =
      unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

  /**
   * Apply the given CloudFormation Init configuration to the instance at startup.
   *
   * Default: - no CloudFormation init
   */
  public fun `init`(): CloudFormationInit? = unwrap(this).getInit()?.let(CloudFormationInit::wrap)

  /**
   * Use the given options for applying CloudFormation Init.
   *
   * Describes the configsets to use and the timeout to wait
   *
   * Default: - default options
   */
  public fun initOptions(): ApplyCloudFormationInitOptions? =
      unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

  /**
   * The name of the instance.
   *
   * Default: 'BastionHost'
   */
  public fun instanceName(): String? = unwrap(this).getInstanceName()

  /**
   * Type of instance to launch.
   *
   * Default: 't3.nano'
   */
  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  /**
   * The machine image to use, assumed to have SSM Agent preinstalled.
   *
   * Default: - An Amazon Linux 2 image which is kept up-to-date automatically (the instance
   * may be replaced on every deployment) and already has SSM Agent installed.
   */
  public fun machineImage(): IMachineImage? =
      unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

  /**
   * Whether IMDSv2 should be required on this instance.
   *
   * Default: - false
   */
  public fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

  /**
   * Security Group to assign to this instance.
   *
   * Default: - create new security group with no inbound and all outbound traffic allowed
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Select the subnets to run the bastion host in.
   *
   * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use SSM.
   * You have to allow port 22 manually by using the connections field
   *
   * Default: - private subnets of the supplied VPC
   */
  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * VPC to launch the instance in.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [BastionHostLinuxProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone In which AZ to place the instance within the VPC.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    public fun blockDevices(blockDevices: List<BlockDevice>)

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    public fun blockDevices(vararg blockDevices: BlockDevice)

    /**
     * @param init Apply the given CloudFormation Init configuration to the instance at startup.
     */
    public fun `init`(`init`: CloudFormationInit)

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2dfac49ec50e332613a65d7f677db4edcd2c5e01fb930efdb9eb9cb59c7f731")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

    /**
     * @param instanceName The name of the instance.
     */
    public fun instanceName(instanceName: String)

    /**
     * @param instanceType Type of instance to launch.
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param machineImage The machine image to use, assumed to have SSM Agent preinstalled.
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
     */
    public fun requireImdsv2(requireImdsv2: Boolean)

    /**
     * @param securityGroup Security Group to assign to this instance.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param subnetSelection Select the subnets to run the bastion host in.
     * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use
     * SSM.
     * You have to allow port 22 manually by using the connections field
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection Select the subnets to run the bastion host in.
     * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use
     * SSM.
     * You have to allow port 22 manually by using the connections field
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69cc1990bc11a26236389fe1d922244ecc49b5f0f6bcc7c7c5c1dfaa54039dee")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param vpc VPC to launch the instance in. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.BastionHostLinuxProps.Builder =
        software.amazon.awscdk.services.ec2.BastionHostLinuxProps.builder()

    /**
     * @param availabilityZone In which AZ to place the instance within the VPC.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     */
    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    /**
     * @param init Apply the given CloudFormation Init configuration to the instance at startup.
     */
    override fun `init`(`init`: CloudFormationInit) {
      cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
      cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2dfac49ec50e332613a65d7f677db4edcd2c5e01fb930efdb9eb9cb59c7f731")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

    /**
     * @param instanceName The name of the instance.
     */
    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    /**
     * @param instanceType Type of instance to launch.
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param machineImage The machine image to use, assumed to have SSM Agent preinstalled.
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    /**
     * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
     */
    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * @param securityGroup Security Group to assign to this instance.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param subnetSelection Select the subnets to run the bastion host in.
     * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use
     * SSM.
     * You have to allow port 22 manually by using the connections field
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection Select the subnets to run the bastion host in.
     * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use
     * SSM.
     * You have to allow port 22 manually by using the connections field
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69cc1990bc11a26236389fe1d922244ecc49b5f0f6bcc7c7c5c1dfaa54039dee")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param vpc VPC to launch the instance in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.BastionHostLinuxProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.BastionHostLinuxProps,
  ) : CdkObject(cdkObject), BastionHostLinuxProps {
    /**
     * In which AZ to place the instance within the VPC.
     *
     * Default: - Random zone.
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and
     * EBS volumes.
     *
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     *
     * Default: - Uses the block device mapping of the AMI
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     */
    override fun blockDevices(): List<BlockDevice> =
        unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

    /**
     * Apply the given CloudFormation Init configuration to the instance at startup.
     *
     * Default: - no CloudFormation init
     */
    override fun `init`(): CloudFormationInit? =
        unwrap(this).getInit()?.let(CloudFormationInit::wrap)

    /**
     * Use the given options for applying CloudFormation Init.
     *
     * Describes the configsets to use and the timeout to wait
     *
     * Default: - default options
     */
    override fun initOptions(): ApplyCloudFormationInitOptions? =
        unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

    /**
     * The name of the instance.
     *
     * Default: 'BastionHost'
     */
    override fun instanceName(): String? = unwrap(this).getInstanceName()

    /**
     * Type of instance to launch.
     *
     * Default: 't3.nano'
     */
    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    /**
     * The machine image to use, assumed to have SSM Agent preinstalled.
     *
     * Default: - An Amazon Linux 2 image which is kept up-to-date automatically (the instance
     * may be replaced on every deployment) and already has SSM Agent installed.
     */
    override fun machineImage(): IMachineImage? =
        unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

    /**
     * Whether IMDSv2 should be required on this instance.
     *
     * Default: - false
     */
    override fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

    /**
     * Security Group to assign to this instance.
     *
     * Default: - create new security group with no inbound and all outbound traffic allowed
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * Select the subnets to run the bastion host in.
     *
     * Set this to PUBLIC if you need to connect to this instance via the internet and cannot use
     * SSM.
     * You have to allow port 22 manually by using the connections field
     *
     * Default: - private subnets of the supplied VPC
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * VPC to launch the instance in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BastionHostLinuxProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.BastionHostLinuxProps):
        BastionHostLinuxProps = CdkObjectWrappers.wrap(cdkObject) as? BastionHostLinuxProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BastionHostLinuxProps):
        software.amazon.awscdk.services.ec2.BastionHostLinuxProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.BastionHostLinuxProps
  }
}
