@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This represents a single EC2 instance.
 *
 * Example:
 *
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
public open class Instance(
  cdkObject: software.amazon.awscdk.services.ec2.Instance,
) : Resource(cdkObject), IInstance {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: InstanceProps,
  ) :
      this(software.amazon.awscdk.services.ec2.Instance(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(InstanceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: InstanceProps.Builder.() -> Unit,
  ) : this(scope, id, InstanceProps(props)
  )

  /**
   * Add the security group to the instance.
   *
   * @param securityGroup : The security group to add. 
   */
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
  }

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * Add command to the startup script of the instance.
   *
   * The command must be in the scripting language supported by the instance's OS (i.e.
   * Linux/Windows).
   *
   * @param commands 
   */
  public open fun addUserData(vararg commands: String) {
    unwrap(this).addUserData(*commands)
  }

  /**
   * Allows specify security group connections for the instance.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * the underlying instance resource.
   */
  public open fun instance(): CfnInstance = unwrap(this).getInstance().let(CfnInstance::wrap)

  /**
   * The availability zone the instance was launched in.
   */
  public override fun instanceAvailabilityZone(): String =
      unwrap(this).getInstanceAvailabilityZone()

  /**
   * The instance's ID.
   */
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * Private DNS name for this instance.
   */
  public override fun instancePrivateDnsName(): String = unwrap(this).getInstancePrivateDnsName()

  /**
   * Private IP for this instance.
   */
  public override fun instancePrivateIp(): String = unwrap(this).getInstancePrivateIp()

  /**
   * Publicly-routable DNS name for this instance.
   *
   * (May be an empty string if the instance does not have a public name).
   */
  public override fun instancePublicDnsName(): String = unwrap(this).getInstancePublicDnsName()

  /**
   * Publicly-routable IP  address for this instance.
   *
   * (May be an empty string if the instance does not have a public IP).
   */
  public override fun instancePublicIp(): String = unwrap(this).getInstancePublicIp()

  /**
   * The type of OS the instance is running.
   */
  public open fun osType(): OperatingSystemType =
      unwrap(this).getOsType().let(OperatingSystemType::wrap)

  /**
   * The IAM role assumed by the instance.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * UserData for the instance.
   */
  public open fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.Instance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the instance could initiate IPv6 connections to anywhere by default.
     *
     * This property is only used when you do not provide a security group.
     *
     * Default: false
     *
     * @param allowAllIpv6Outbound Whether the instance could initiate IPv6 connections to anywhere
     * by default. 
     */
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    /**
     * Whether the instance could initiate connections to anywhere by default.
     *
     * This property is only used when you do not provide a security group.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether the instance could initiate connections to anywhere by
     * default. 
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * Whether to associate a public IP address to the primary network interface attached to this
     * instance.
     *
     * Default: - public IP address is automatically assigned based on default behavior
     *
     * @param associatePublicIpAddress Whether to associate a public IP address to the primary
     * network interface attached to this instance. 
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    /**
     * In which AZ to place the instance within the VPC.
     *
     * Default: - Random zone.
     *
     * @param availabilityZone In which AZ to place the instance within the VPC. 
     */
    public fun availabilityZone(availabilityZone: String)

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
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes. 
     */
    public fun blockDevices(blockDevices: List<BlockDevice>)

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
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes. 
     */
    public fun blockDevices(vararg blockDevices: BlockDevice)

    /**
     * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
     *
     * The unlimited CPU credit option is not supported for T3 instances with a dedicated host.
     *
     * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
     *
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc). 
     */
    public fun creditSpecification(creditSpecification: CpuCredits)

    /**
     * Whether "Detailed Monitoring" is enabled for this instance Keep in mind that Detailed
     * Monitoring results in extra charges.
     *
     * Default: - false
     *
     * [Documentation](http://aws.amazon.com/cloudwatch/pricing/)
     * @param detailedMonitoring Whether "Detailed Monitoring" is enabled for this instance Keep in
     * mind that Detailed Monitoring results in extra charges. 
     */
    public fun detailedMonitoring(detailedMonitoring: Boolean)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1255c73a191e21ad38f2985417965411599e1b4b9be46e0f44bce9e8798ce1a1")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

    /**
     * The name of the instance.
     *
     * Default: - CDK generated name
     *
     * @param instanceName The name of the instance. 
     */
    public fun instanceName(instanceName: String)

    /**
     * Type of instance to launch.
     *
     * @param instanceType Type of instance to launch. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * (deprecated) Name of SSH keypair to grant access to instance.
     *
     * Default: - No SSH access will be possible.
     *
     * * Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     * @param keyName Name of SSH keypair to grant access to instance. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    /**
     * The SSH keypair to grant access to the instance.
     *
     * Default: - No SSH access will be possible.
     *
     * @param keyPair The SSH keypair to grant access to the instance. 
     */
    public fun keyPair(keyPair: IKeyPair)

    /**
     * AMI to launch.
     *
     * @param machineImage AMI to launch. 
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * Defines a private IP address to associate with an instance.
     *
     * Private IP should be available within the VPC that the instance is build within.
     *
     * Default: - no association
     *
     * @param privateIpAddress Defines a private IP address to associate with an instance. 
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * Propagate the EC2 instance tags to the EBS volumes.
     *
     * Default: - false
     *
     * @param propagateTagsToVolumeOnCreation Propagate the EC2 instance tags to the EBS volumes. 
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean)

    /**
     * Whether IMDSv2 should be required on this instance.
     *
     * Default: - false
     *
     * @param requireImdsv2 Whether IMDSv2 should be required on this instance. 
     */
    public fun requireImdsv2(requireImdsv2: Boolean)

    /**
     * The length of time to wait for the resourceSignalCount.
     *
     * The maximum value is 43200 (12 hours).
     *
     * Default: Duration.minutes(5)
     *
     * @param resourceSignalTimeout The length of time to wait for the resourceSignalCount. 
     */
    public fun resourceSignalTimeout(resourceSignalTimeout: Duration)

    /**
     * An IAM role to associate with the instance profile assigned to this Auto Scaling Group.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * Default: - A role will automatically be created, it can be accessed via the `role` property
     *
     * Example:
     *
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     *
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     * Group. 
     */
    public fun role(role: IRole)

    /**
     * Security Group to assign to this instance.
     *
     * Default: - create new security group
     *
     * @param securityGroup Security Group to assign to this instance. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     *
     * This controls whether source/destination checking is enabled on the instance.
     * A value of true means that checking is enabled, and false means that checking is disabled.
     * The value must be false for the instance to perform NAT.
     *
     * Default: true
     *
     * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
     * NAT. 
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean)

    /**
     * Add SSM session permissions to the instance role.
     *
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     *
     * Default: false
     *
     * @param ssmSessionPermissions Add SSM session permissions to the instance role. 
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    /**
     * Specific UserData to use.
     *
     * The UserData may still be mutated after creation.
     *
     * Default: - A UserData object appropriate for the MachineImage's
     * Operating System is created.
     *
     * @param userData Specific UserData to use. 
     */
    public fun userData(userData: UserData)

    /**
     * Changes to the UserData force replacement.
     *
     * Depending the EC2 instance type, changing UserData either
     * restarts the instance or replaces the instance.
     *
     * * Instance store-backed instances are replaced.
     * * EBS-backed instances are restarted.
     *
     * By default, restarting does not execute the new UserData so you
     * will need a different mechanism to ensure the instance is restarted.
     *
     * Setting this to `true` will make the instance's Logical ID depend on the
     * UserData, which will cause CloudFormation to replace it if the UserData
     * changes.
     *
     * Default: - true iff `initOptions` is specified, false otherwise.
     *
     * @param userDataCausesReplacement Changes to the UserData force replacement. 
     */
    public fun userDataCausesReplacement(userDataCausesReplacement: Boolean)

    /**
     * VPC to launch the instance in.
     *
     * @param vpc VPC to launch the instance in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where to place the instance within the VPC.
     *
     * Default: - Private subnets.
     *
     * @param vpcSubnets Where to place the instance within the VPC. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Where to place the instance within the VPC.
     *
     * Default: - Private subnets.
     *
     * @param vpcSubnets Where to place the instance within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ebf73c6a85a04ee97a84a646dbed1afef0b5d139bc3ae031c9518f7941be4e")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Instance.Builder =
        software.amazon.awscdk.services.ec2.Instance.Builder.create(scope, id)

    /**
     * Whether the instance could initiate IPv6 connections to anywhere by default.
     *
     * This property is only used when you do not provide a security group.
     *
     * Default: false
     *
     * @param allowAllIpv6Outbound Whether the instance could initiate IPv6 connections to anywhere
     * by default. 
     */
    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    /**
     * Whether the instance could initiate connections to anywhere by default.
     *
     * This property is only used when you do not provide a security group.
     *
     * Default: true
     *
     * @param allowAllOutbound Whether the instance could initiate connections to anywhere by
     * default. 
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * Whether to associate a public IP address to the primary network interface attached to this
     * instance.
     *
     * Default: - public IP address is automatically assigned based on default behavior
     *
     * @param associatePublicIpAddress Whether to associate a public IP address to the primary
     * network interface attached to this instance. 
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

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
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes. 
     */
    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

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
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes. 
     */
    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    /**
     * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
     *
     * The unlimited CPU credit option is not supported for T3 instances with a dedicated host.
     *
     * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
     *
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc). 
     */
    override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
    }

    /**
     * Whether "Detailed Monitoring" is enabled for this instance Keep in mind that Detailed
     * Monitoring results in extra charges.
     *
     * Default: - false
     *
     * [Documentation](http://aws.amazon.com/cloudwatch/pricing/)
     * @param detailedMonitoring Whether "Detailed Monitoring" is enabled for this instance Keep in
     * mind that Detailed Monitoring results in extra charges. 
     */
    override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1255c73a191e21ad38f2985417965411599e1b4b9be46e0f44bce9e8798ce1a1")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

    /**
     * The name of the instance.
     *
     * Default: - CDK generated name
     *
     * @param instanceName The name of the instance. 
     */
    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    /**
     * Type of instance to launch.
     *
     * @param instanceType Type of instance to launch. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * (deprecated) Name of SSH keypair to grant access to instance.
     *
     * Default: - No SSH access will be possible.
     *
     * * Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     * @param keyName Name of SSH keypair to grant access to instance. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * The SSH keypair to grant access to the instance.
     *
     * Default: - No SSH access will be possible.
     *
     * @param keyPair The SSH keypair to grant access to the instance. 
     */
    override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair::unwrap))
    }

    /**
     * AMI to launch.
     *
     * @param machineImage AMI to launch. 
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
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
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * Propagate the EC2 instance tags to the EBS volumes.
     *
     * Default: - false
     *
     * @param propagateTagsToVolumeOnCreation Propagate the EC2 instance tags to the EBS volumes. 
     */
    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
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
     * The length of time to wait for the resourceSignalCount.
     *
     * The maximum value is 43200 (12 hours).
     *
     * Default: Duration.minutes(5)
     *
     * @param resourceSignalTimeout The length of time to wait for the resourceSignalCount. 
     */
    override fun resourceSignalTimeout(resourceSignalTimeout: Duration) {
      cdkBuilder.resourceSignalTimeout(resourceSignalTimeout.let(Duration::unwrap))
    }

    /**
     * An IAM role to associate with the instance profile assigned to this Auto Scaling Group.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * Default: - A role will automatically be created, it can be accessed via the `role` property
     *
     * Example:
     *
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     *
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     * Group. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * Security Group to assign to this instance.
     *
     * Default: - create new security group
     *
     * @param securityGroup Security Group to assign to this instance. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     *
     * This controls whether source/destination checking is enabled on the instance.
     * A value of true means that checking is enabled, and false means that checking is disabled.
     * The value must be false for the instance to perform NAT.
     *
     * Default: true
     *
     * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
     * NAT. 
     */
    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * Add SSM session permissions to the instance role.
     *
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     *
     * Default: false
     *
     * @param ssmSessionPermissions Add SSM session permissions to the instance role. 
     */
    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * Specific UserData to use.
     *
     * The UserData may still be mutated after creation.
     *
     * Default: - A UserData object appropriate for the MachineImage's
     * Operating System is created.
     *
     * @param userData Specific UserData to use. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    /**
     * Changes to the UserData force replacement.
     *
     * Depending the EC2 instance type, changing UserData either
     * restarts the instance or replaces the instance.
     *
     * * Instance store-backed instances are replaced.
     * * EBS-backed instances are restarted.
     *
     * By default, restarting does not execute the new UserData so you
     * will need a different mechanism to ensure the instance is restarted.
     *
     * Setting this to `true` will make the instance's Logical ID depend on the
     * UserData, which will cause CloudFormation to replace it if the UserData
     * changes.
     *
     * Default: - true iff `initOptions` is specified, false otherwise.
     *
     * @param userDataCausesReplacement Changes to the UserData force replacement. 
     */
    override fun userDataCausesReplacement(userDataCausesReplacement: Boolean) {
      cdkBuilder.userDataCausesReplacement(userDataCausesReplacement)
    }

    /**
     * VPC to launch the instance in.
     *
     * @param vpc VPC to launch the instance in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Where to place the instance within the VPC.
     *
     * Default: - Private subnets.
     *
     * @param vpcSubnets Where to place the instance within the VPC. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Where to place the instance within the VPC.
     *
     * Default: - Private subnets.
     *
     * @param vpcSubnets Where to place the instance within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ebf73c6a85a04ee97a84a646dbed1afef0b5d139bc3ae031c9518f7941be4e")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.Instance = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Instance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Instance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Instance): Instance =
        Instance(cdkObject)

    internal fun unwrap(wrapped: Instance): software.amazon.awscdk.services.ec2.Instance =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.Instance
  }
}
