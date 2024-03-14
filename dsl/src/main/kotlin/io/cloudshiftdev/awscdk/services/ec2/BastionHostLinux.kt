package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BastionHostLinux
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.BastionHostLinux,
) : Resource(cdkObject), IInstance {
    /**
     * Allow SSH access from the given peer or peers.
     *
     * Necessary if you want to connect to the instance using ssh. If not called, you should use SSM
     * Session Manager to connect to the instance.
     *
     * @param peer
     */
    public open fun allowSshAccessFrom(peer: IPeer) {
        unwrap(this).allowSshAccessFrom(peer.let(IPeer::unwrap))
    }

    /** Allows specify security group connections for the instance. */
    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    /** The principal to grant permissions to. */
    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /** The underlying instance resource. */
    public open fun instance(): Instance = unwrap(this).getInstance().let(Instance::wrap)

    /** The availability zone the instance was launched in. */
    public override fun instanceAvailabilityZone(): String =
        unwrap(this).getInstanceAvailabilityZone()

    /** The instance's ID. */
    public override fun instanceId(): String = unwrap(this).getInstanceId()

    /** Private DNS name for this instance. */
    public override fun instancePrivateDnsName(): String = unwrap(this).getInstancePrivateDnsName()

    /** Private IP for this instance. */
    public override fun instancePrivateIp(): String = unwrap(this).getInstancePrivateIp()

    /**
     * Publicly-routable DNS name for this instance.
     *
     * (May be an empty string if the instance does not have a public name).
     */
    public override fun instancePublicDnsName(): String = unwrap(this).getInstancePublicDnsName()

    /**
     * Publicly-routable IP address for this instance.
     *
     * (May be an empty string if the instance does not have a public IP).
     */
    public override fun instancePublicIp(): String = unwrap(this).getInstancePublicIp()

    /** The IAM role assumed by the instance. */
    public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /** The stack in which this resource is defined. */
    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.BastionHostLinux]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * In which AZ to place the instance within the VPC.
         *
         * Default: - Random zone.
         *
         * @param availabilityZone In which AZ to place the instance within the VPC.
         */
        public fun availabilityZone(availabilityZone: String)

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        public fun blockDevices(blockDevices: List<BlockDevice>)

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        public fun blockDevices(vararg blockDevices: BlockDevice)

        /**
         * Apply the given CloudFormation Init configuration to the instance at startup.
         *
         * Default: - no CloudFormation init
         *
         * @param init Apply the given CloudFormation Init configuration to the instance at startup.
         */
        public fun `init`(`init`: CloudFormationInit)

        /**
         * Use the given options for applying CloudFormation Init.
         *
         * Describes the configsets to use and the timeout to wait
         *
         * Default: - default options
         *
         * @param initOptions Use the given options for applying CloudFormation Init.
         */
        public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

        /**
         * Use the given options for applying CloudFormation Init.
         *
         * Describes the configsets to use and the timeout to wait
         *
         * Default: - default options
         *
         * @param initOptions Use the given options for applying CloudFormation Init.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("bfaa4840168db92b778ecaf120f203401115dc4ca25675e0793d5ff81c02d457")
        public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

        /**
         * The name of the instance.
         *
         * Default: 'BastionHost'
         *
         * @param instanceName The name of the instance.
         */
        public fun instanceName(instanceName: String)

        /**
         * Type of instance to launch.
         *
         * Default: 't3.nano'
         *
         * @param instanceType Type of instance to launch.
         */
        public fun instanceType(instanceType: InstanceType)

        /**
         * The machine image to use, assumed to have SSM Agent preinstalled.
         *
         * Default: - An Amazon Linux 2 image which is kept up-to-date automatically (the instance
         * may be replaced on every deployment) and already has SSM Agent installed.
         *
         * @param machineImage The machine image to use, assumed to have SSM Agent preinstalled.
         */
        public fun machineImage(machineImage: IMachineImage)

        /**
         * Whether IMDSv2 should be required on this instance.
         *
         * Default: - false
         *
         * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
         */
        public fun requireImdsv2(requireImdsv2: Boolean)

        /**
         * Security Group to assign to this instance.
         *
         * Default: - create new security group with no inbound and all outbound traffic allowed
         *
         * @param securityGroup Security Group to assign to this instance.
         */
        public fun securityGroup(securityGroup: ISecurityGroup)

        /**
         * Select the subnets to run the bastion host in.
         *
         * Set this to PUBLIC if you need to connect to this instance via the internet and cannot
         * use SSM. You have to allow port 22 manually by using the connections field
         *
         * Default: - private subnets of the supplied VPC
         *
         * @param subnetSelection Select the subnets to run the bastion host in.
         */
        public fun subnetSelection(subnetSelection: SubnetSelection)

        /**
         * Select the subnets to run the bastion host in.
         *
         * Set this to PUBLIC if you need to connect to this instance via the internet and cannot
         * use SSM. You have to allow port 22 manually by using the connections field
         *
         * Default: - private subnets of the supplied VPC
         *
         * @param subnetSelection Select the subnets to run the bastion host in.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("de651b213989ca3417ce5fee09a5e0ac582b2776767ef5cf9eb1f14f8e6656df")
        public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

        /**
         * VPC to launch the instance in.
         *
         * @param vpc VPC to launch the instance in.
         */
        public fun vpc(vpc: IVpc)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.BastionHostLinux.Builder =
            software.amazon.awscdk.services.ec2.BastionHostLinux.Builder.create(scope, id)

        /**
         * In which AZ to place the instance within the VPC.
         *
         * Default: - Random zone.
         *
         * @param availabilityZone In which AZ to place the instance within the VPC.
         */
        override fun availabilityZone(availabilityZone: String) {
            cdkBuilder.availabilityZone(availabilityZone)
        }

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        override fun blockDevices(blockDevices: List<BlockDevice>) {
            cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
        }

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
            blockDevices(blockDevices.toList())

        /**
         * Apply the given CloudFormation Init configuration to the instance at startup.
         *
         * Default: - no CloudFormation init
         *
         * @param init Apply the given CloudFormation Init configuration to the instance at startup.
         */
        override fun `init`(`init`: CloudFormationInit) {
            cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
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
        override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
            cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("bfaa4840168db92b778ecaf120f203401115dc4ca25675e0793d5ff81c02d457")
        override fun initOptions(
            initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit
        ): Unit = initOptions(ApplyCloudFormationInitOptions(initOptions))

        /**
         * The name of the instance.
         *
         * Default: 'BastionHost'
         *
         * @param instanceName The name of the instance.
         */
        override fun instanceName(instanceName: String) {
            cdkBuilder.instanceName(instanceName)
        }

        /**
         * Type of instance to launch.
         *
         * Default: 't3.nano'
         *
         * @param instanceType Type of instance to launch.
         */
        override fun instanceType(instanceType: InstanceType) {
            cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
        }

        /**
         * The machine image to use, assumed to have SSM Agent preinstalled.
         *
         * Default: - An Amazon Linux 2 image which is kept up-to-date automatically (the instance
         * may be replaced on every deployment) and already has SSM Agent installed.
         *
         * @param machineImage The machine image to use, assumed to have SSM Agent preinstalled.
         */
        override fun machineImage(machineImage: IMachineImage) {
            cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
        }

        /**
         * Whether IMDSv2 should be required on this instance.
         *
         * Default: - false
         *
         * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
         */
        override fun requireImdsv2(requireImdsv2: Boolean) {
            cdkBuilder.requireImdsv2(requireImdsv2)
        }

        /**
         * Security Group to assign to this instance.
         *
         * Default: - create new security group with no inbound and all outbound traffic allowed
         *
         * @param securityGroup Security Group to assign to this instance.
         */
        override fun securityGroup(securityGroup: ISecurityGroup) {
            cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
        }

        /**
         * Select the subnets to run the bastion host in.
         *
         * Set this to PUBLIC if you need to connect to this instance via the internet and cannot
         * use SSM. You have to allow port 22 manually by using the connections field
         *
         * Default: - private subnets of the supplied VPC
         *
         * @param subnetSelection Select the subnets to run the bastion host in.
         */
        override fun subnetSelection(subnetSelection: SubnetSelection) {
            cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
        }

        /**
         * Select the subnets to run the bastion host in.
         *
         * Set this to PUBLIC if you need to connect to this instance via the internet and cannot
         * use SSM. You have to allow port 22 manually by using the connections field
         *
         * Default: - private subnets of the supplied VPC
         *
         * @param subnetSelection Select the subnets to run the bastion host in.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("de651b213989ca3417ce5fee09a5e0ac582b2776767ef5cf9eb1f14f8e6656df")
        override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
            subnetSelection(SubnetSelection(subnetSelection))

        /**
         * VPC to launch the instance in.
         *
         * @param vpc VPC to launch the instance in.
         */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ec2.BastionHostLinux =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): BastionHostLinux {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return BastionHostLinux(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.BastionHostLinux
        ): BastionHostLinux = BastionHostLinux(cdkObject)

        internal fun unwrap(
            wrapped: BastionHostLinux
        ): software.amazon.awscdk.services.ec2.BastionHostLinux = wrapped.cdkObject
    }
}
