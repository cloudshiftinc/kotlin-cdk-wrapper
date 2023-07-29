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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * This represents a single EC2 instance.
 *
 * Example:
 * ```
 * IVpc vpc;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // instance to add as the target for load balancer.
 * Instance instance = Instance.Builder.create(this, "targetInstance")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
 * .build();
 * lb.addTarget(new InstanceTarget(instance));
 * ```
 */
@CdkDslMarker
public class InstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Instance.Builder = Instance.Builder.create(scope, id)

    private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

    /**
     * Whether the instance could initiate connections to anywhere by default.
     *
     * This property is only used when you do not provide a security group.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether the instance could initiate connections to anywhere by
     *   default.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * Whether to associate a public IP address to the primary network interface attached to this
     * instance.
     *
     * Default: - public IP address is automatically assigned based on default behavior
     *
     * @param associatePublicIpAddress Whether to associate a public IP address to the primary
     *   network interface attached to this instance.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

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
     * Whether "Detailed Monitoring" is enabled for this instance Keep in mind that Detailed
     * Monitoring results in extra charges.
     *
     * Default: - false
     *
     * [Documentation](http://aws.amazon.com/cloudwatch/pricing/)
     *
     * @param detailedMonitoring Whether "Detailed Monitoring" is enabled for this instance Keep in
     *   mind that Detailed Monitoring results in extra charges.
     */
    public fun detailedMonitoring(detailedMonitoring: Boolean) {
        cdkBuilder.detailedMonitoring(detailedMonitoring)
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
     * Default: - CDK generated name
     *
     * @param instanceName The name of the instance.
     */
    public fun instanceName(instanceName: String) {
        cdkBuilder.instanceName(instanceName)
    }

    /**
     * Type of instance to launch.
     *
     * @param instanceType Type of instance to launch.
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * Name of SSH keypair to grant access to instance.
     *
     * Default: - No SSH access will be possible.
     *
     * @param keyName Name of SSH keypair to grant access to instance.
     */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /**
     * AMI to launch.
     *
     * @param machineImage AMI to launch.
     */
    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
    }

    /**
     * Defines a private IP address to associate with an instance.
     *
     * Private IP should be available within the VPC that the instance is build within.
     *
     * Default: - no association
     *
     * @param privateIpAddress Defines a private IP address to associate with an instance.
     */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * Propagate the EC2 instance tags to the EBS volumes.
     *
     * Default: - false
     *
     * @param propagateTagsToVolumeOnCreation Propagate the EC2 instance tags to the EBS volumes.
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
        cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
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
     * The length of time to wait for the resourceSignalCount.
     *
     * The maximum value is 43200 (12 hours).
     *
     * Default: Duration.minutes(5)
     *
     * @param resourceSignalTimeout The length of time to wait for the resourceSignalCount.
     */
    public fun resourceSignalTimeout(resourceSignalTimeout: Duration) {
        cdkBuilder.resourceSignalTimeout(resourceSignalTimeout)
    }

    /**
     * An IAM role to associate with the instance profile assigned to this Auto Scaling Group.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * Default: - A role will automatically be created, it can be accessed via the `role` property
     *
     * Example:
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     *
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     *   Group.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * Security Group to assign to this instance.
     *
     * Default: - create new security group
     *
     * @param securityGroup Security Group to assign to this instance.
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     *
     * This controls whether source/destination checking is enabled on the instance. A value of true
     * means that checking is enabled, and false means that checking is disabled. The value must be
     * false for the instance to perform NAT.
     *
     * Default: true
     *
     * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
     *   NAT.
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean) {
        cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * Add SSM session permissions to the instance role.
     *
     * Setting this to `true` adds the necessary permissions to connect to the instance using SSM
     * Session Manager. You can do this from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself. You must also use an AMI that
     * comes with the SSM Agent, or install the SSM Agent yourself. See
     * [Working with SSM Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     *
     * Default: false
     *
     * @param ssmSessionPermissions Add SSM session permissions to the instance role.
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
        cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * Specific UserData to use.
     *
     * The UserData may still be mutated after creation.
     *
     * Default: - A UserData object appropriate for the MachineImage's Operating System is created.
     *
     * @param userData Specific UserData to use.
     */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    /**
     * Changes to the UserData force replacement.
     *
     * Depending the EC2 instance type, changing UserData either restarts the instance or replaces
     * the instance.
     * * Instance store-backed instances are replaced.
     * * EBS-backed instances are restarted.
     *
     * By default, restarting does not execute the new UserData so you will need a different
     * mechanism to ensure the instance is restarted.
     *
     * Setting this to `true` will make the instance's Logical ID depend on the UserData, which will
     * cause CloudFormation to replace it if the UserData changes.
     *
     * Default: - true iff `initOptions` is specified, false otherwise.
     *
     * @param userDataCausesReplacement Changes to the UserData force replacement.
     */
    public fun userDataCausesReplacement(userDataCausesReplacement: Boolean) {
        cdkBuilder.userDataCausesReplacement(userDataCausesReplacement)
    }

    /**
     * VPC to launch the instance in.
     *
     * @param vpc VPC to launch the instance in.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * Where to place the instance within the VPC.
     *
     * Default: - Private subnets.
     *
     * @param vpcSubnets Where to place the instance within the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * Where to place the instance within the VPC.
     *
     * Default: - Private subnets.
     *
     * @param vpcSubnets Where to place the instance within the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): Instance {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        return cdkBuilder.build()
    }
}
