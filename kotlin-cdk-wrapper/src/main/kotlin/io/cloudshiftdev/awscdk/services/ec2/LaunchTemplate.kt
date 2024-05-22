@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IInstanceProfile
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This represents an EC2 LaunchTemplate.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * SecurityGroup sg1 = SecurityGroup.Builder.create(this, "sg1")
 * .vpc(vpc)
 * .build();
 * SecurityGroup sg2 = SecurityGroup.Builder.create(this, "sg2")
 * .vpc(vpc)
 * .build();
 * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "LaunchTemplate")
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .securityGroup(sg1)
 * .build();
 * launchTemplate.addSecurityGroup(sg2);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html)
 */
public open class LaunchTemplate(
  cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplate,
) : Resource(cdkObject), ILaunchTemplate, IGrantable, IConnectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.LaunchTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LaunchTemplateProps,
  ) :
      this(software.amazon.awscdk.services.ec2.LaunchTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(LaunchTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LaunchTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, LaunchTemplateProps(props)
  )

  /**
   * Add the security group to the instance.
   *
   * @param securityGroup : The security group to add. 
   */
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
  }

  /**
   * Allows specifying security group connections for the instance.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The default version for the launch template.
   */
  public open fun defaultVersionNumber(): String = unwrap(this).getDefaultVersionNumber()

  /**
   * Principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * The AMI ID of the image to use.
   */
  public open fun imageId(): String? = unwrap(this).getImageId()

  /**
   * Type of instance to launch.
   */
  public open fun instanceType(): InstanceType? =
      unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  /**
   * The latest version of the launch template.
   */
  public open fun latestVersionNumber(): String = unwrap(this).getLatestVersionNumber()

  /**
   * The identifier of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
   */
  public override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

  /**
   * The name of the Launch Template.
   *
   * Exactly one of `launchTemplateId` and `launchTemplateName` will be set.
   */
  public override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  /**
   * The type of OS the instance is running.
   */
  public open fun osType(): OperatingSystemType? =
      unwrap(this).getOsType()?.let(OperatingSystemType::wrap)

  /**
   * IAM Role assumed by instances that are launched from this template.
   */
  public open fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * UserData executed by instances that are launched from this template.
   */
  public open fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * The version number of this launch template to use.
   */
  public override fun versionNumber(): String = unwrap(this).getVersionNumber()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.LaunchTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether instances should have a public IP addresses associated with them.
     *
     * Default: - Use subnet settings
     *
     * @param associatePublicIpAddress Whether instances should have a public IP addresses
     * associated with them. 
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

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
     * CPU credit type for burstable EC2 instance types.
     *
     * Default: - No credit type is specified in the Launch Template.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * @param cpuCredits CPU credit type for burstable EC2 instance types. 
     */
    public fun cpuCredits(cpuCredits: CpuCredits)

    /**
     * If set to true, then detailed monitoring will be enabled on instances created with this
     * launch template.
     *
     * Default: False - Detailed monitoring is disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
     * @param detailedMonitoring If set to true, then detailed monitoring will be enabled on
     * instances created with this launch template. 
     */
    public fun detailedMonitoring(detailedMonitoring: Boolean)

    /**
     * If you set this parameter to true, you cannot terminate the instances launched with this
     * launch template using the Amazon EC2 console, CLI, or API;
     *
     * otherwise, you can.
     *
     * Default: - The API termination setting is not specified in the Launch Template.
     *
     * @param disableApiTermination If you set this parameter to true, you cannot terminate the
     * instances launched with this launch template using the Amazon EC2 console, CLI, or API;. 
     */
    public fun disableApiTermination(disableApiTermination: Boolean)

    /**
     * Indicates whether the instances are optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     * performance. This optimization
     * isn't available with all instance types. Additional usage charges apply when using an
     * EBS-optimized instance.
     *
     * Default: - EBS optimization is not specified in the launch template.
     *
     * @param ebsOptimized Indicates whether the instances are optimized for Amazon EBS I/O. 
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * If you set this parameter to true, the instance is enabled for hibernation.
     *
     * Default: - Hibernation configuration is not specified in the launch template; defaulting to
     * false.
     *
     * @param hibernationConfigured If you set this parameter to true, the instance is enabled for
     * hibernation. 
     */
    public fun hibernationConfigured(hibernationConfigured: Boolean)

    /**
     * Enables or disables the HTTP metadata endpoint on your instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint)
     * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances. 
     */
    public fun httpEndpoint(httpEndpoint: Boolean)

    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpprotocolipv6)
     * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
     * service. 
     */
    public fun httpProtocolIpv6(httpProtocolIpv6: Boolean)

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     *
     * The larger the number, the further instance metadata requests can travel.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit)
     * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
     * requests. 
     */
    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

    /**
     * The state of token usage for your instance metadata requests.
     *
     * The default state is `optional` if not specified. However,
     * if requireImdsv2 is true, the state must be `required`.
     *
     * Default: LaunchTemplateHttpTokens.OPTIONAL
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens)
     * @param httpTokens The state of token usage for your instance metadata requests. 
     */
    public fun httpTokens(httpTokens: LaunchTemplateHttpTokens)

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: - Shutdown behavior is not specified in the launch template; defaults to STOP.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior)
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown). 
     */
    public
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior)

    /**
     * Set to enabled to allow access to instance tags from the instance metadata.
     *
     * Set to disabled to turn off access to instance tags from the instance metadata.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-instancemetadatatags)
     * @param instanceMetadataTags Set to enabled to allow access to instance tags from the instance
     * metadata. 
     */
    public fun instanceMetadataTags(instanceMetadataTags: Boolean)

    /**
     * The instance profile used to pass role information to EC2 instances.
     *
     * Note: You can provide an instanceProfile or a role, but not both.
     *
     * Default: - No instance profile
     *
     * @param instanceProfile The instance profile used to pass role information to EC2 instances. 
     */
    public fun instanceProfile(instanceProfile: IInstanceProfile)

    /**
     * Type of instance to launch.
     *
     * Default: - This Launch Template does not specify a default Instance Type.
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
     * Name for this launch template.
     *
     * Default: Automatically generated name
     *
     * @param launchTemplateName Name for this launch template. 
     */
    public fun launchTemplateName(launchTemplateName: String)

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template does not specify a default AMI.
     *
     * @param machineImage The AMI that will be used by instances. 
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * If this parameter is set to true, the instance is enabled for AWS Nitro Enclaves;
     *
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     *
     * Default: - Enablement of Nitro enclaves is not specified in the launch template; defaulting
     * to false.
     *
     * @param nitroEnclaveEnabled If this parameter is set to true, the instance is enabled for AWS
     * Nitro Enclaves;. 
     */
    public fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean)

    /**
     * Whether IMDSv2 should be required on launched instances.
     *
     * Default: - false
     *
     * @param requireImdsv2 Whether IMDSv2 should be required on launched instances. 
     */
    public fun requireImdsv2(requireImdsv2: Boolean)

    /**
     * An IAM role to associate with the instance profile that is used by instances.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`.
     * Note: You can provide an instanceProfile or a role, but not both.
     *
     * Default: - No new role is created.
     *
     * Example:
     *
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     *
     * @param role An IAM role to associate with the instance profile that is used by instances. 
     */
    public fun role(role: IRole)

    /**
     * Security group to assign to instances created with the launch template.
     *
     * Default: No security group is assigned.
     *
     * @param securityGroup Security group to assign to instances created with the launch template. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
     * use Spot instances, and the options for the Spot instances will be as defined.
     *
     * Default: - Instance launched with this template will not be spot instances.
     *
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined. 
     */
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions)

    /**
     * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
     * use Spot instances, and the options for the Spot instances will be as defined.
     *
     * Default: - Instance launched with this template will not be spot instances.
     *
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ce905ff67a4ffc05d319d73c1977f1338e37b312b69e262901226d015543042")
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit)

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template creates a UserData based on the type of provided
     * machineImage; no UserData is created if a machineImage is not provided
     *
     * @param userData The AMI that will be used by instances. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplate.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplate.Builder.create(scope, id)

    /**
     * Whether instances should have a public IP addresses associated with them.
     *
     * Default: - Use subnet settings
     *
     * @param associatePublicIpAddress Whether instances should have a public IP addresses
     * associated with them. 
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
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
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice.Companion::unwrap))
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
     * CPU credit type for burstable EC2 instance types.
     *
     * Default: - No credit type is specified in the Launch Template.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * @param cpuCredits CPU credit type for burstable EC2 instance types. 
     */
    override fun cpuCredits(cpuCredits: CpuCredits) {
      cdkBuilder.cpuCredits(cpuCredits.let(CpuCredits.Companion::unwrap))
    }

    /**
     * If set to true, then detailed monitoring will be enabled on instances created with this
     * launch template.
     *
     * Default: False - Detailed monitoring is disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
     * @param detailedMonitoring If set to true, then detailed monitoring will be enabled on
     * instances created with this launch template. 
     */
    override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    /**
     * If you set this parameter to true, you cannot terminate the instances launched with this
     * launch template using the Amazon EC2 console, CLI, or API;
     *
     * otherwise, you can.
     *
     * Default: - The API termination setting is not specified in the Launch Template.
     *
     * @param disableApiTermination If you set this parameter to true, you cannot terminate the
     * instances launched with this launch template using the Amazon EC2 console, CLI, or API;. 
     */
    override fun disableApiTermination(disableApiTermination: Boolean) {
      cdkBuilder.disableApiTermination(disableApiTermination)
    }

    /**
     * Indicates whether the instances are optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     * performance. This optimization
     * isn't available with all instance types. Additional usage charges apply when using an
     * EBS-optimized instance.
     *
     * Default: - EBS optimization is not specified in the launch template.
     *
     * @param ebsOptimized Indicates whether the instances are optimized for Amazon EBS I/O. 
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * If you set this parameter to true, the instance is enabled for hibernation.
     *
     * Default: - Hibernation configuration is not specified in the launch template; defaulting to
     * false.
     *
     * @param hibernationConfigured If you set this parameter to true, the instance is enabled for
     * hibernation. 
     */
    override fun hibernationConfigured(hibernationConfigured: Boolean) {
      cdkBuilder.hibernationConfigured(hibernationConfigured)
    }

    /**
     * Enables or disables the HTTP metadata endpoint on your instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint)
     * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances. 
     */
    override fun httpEndpoint(httpEndpoint: Boolean) {
      cdkBuilder.httpEndpoint(httpEndpoint)
    }

    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpprotocolipv6)
     * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
     * service. 
     */
    override fun httpProtocolIpv6(httpProtocolIpv6: Boolean) {
      cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     *
     * The larger the number, the further instance metadata requests can travel.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit)
     * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
     * requests. 
     */
    override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
      cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    /**
     * The state of token usage for your instance metadata requests.
     *
     * The default state is `optional` if not specified. However,
     * if requireImdsv2 is true, the state must be `required`.
     *
     * Default: LaunchTemplateHttpTokens.OPTIONAL
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens)
     * @param httpTokens The state of token usage for your instance metadata requests. 
     */
    override fun httpTokens(httpTokens: LaunchTemplateHttpTokens) {
      cdkBuilder.httpTokens(httpTokens.let(LaunchTemplateHttpTokens.Companion::unwrap))
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: - Shutdown behavior is not specified in the launch template; defaults to STOP.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior)
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown). 
     */
    override
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior) {
      cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior.let(InstanceInitiatedShutdownBehavior.Companion::unwrap))
    }

    /**
     * Set to enabled to allow access to instance tags from the instance metadata.
     *
     * Set to disabled to turn off access to instance tags from the instance metadata.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-instancemetadatatags)
     * @param instanceMetadataTags Set to enabled to allow access to instance tags from the instance
     * metadata. 
     */
    override fun instanceMetadataTags(instanceMetadataTags: Boolean) {
      cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    /**
     * The instance profile used to pass role information to EC2 instances.
     *
     * Note: You can provide an instanceProfile or a role, but not both.
     *
     * Default: - No instance profile
     *
     * @param instanceProfile The instance profile used to pass role information to EC2 instances. 
     */
    override fun instanceProfile(instanceProfile: IInstanceProfile) {
      cdkBuilder.instanceProfile(instanceProfile.let(IInstanceProfile.Companion::unwrap))
    }

    /**
     * Type of instance to launch.
     *
     * Default: - This Launch Template does not specify a default Instance Type.
     *
     * @param instanceType Type of instance to launch. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
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
      cdkBuilder.keyPair(keyPair.let(IKeyPair.Companion::unwrap))
    }

    /**
     * Name for this launch template.
     *
     * Default: Automatically generated name
     *
     * @param launchTemplateName Name for this launch template. 
     */
    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template does not specify a default AMI.
     *
     * @param machineImage The AMI that will be used by instances. 
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage.Companion::unwrap))
    }

    /**
     * If this parameter is set to true, the instance is enabled for AWS Nitro Enclaves;
     *
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     *
     * Default: - Enablement of Nitro enclaves is not specified in the launch template; defaulting
     * to false.
     *
     * @param nitroEnclaveEnabled If this parameter is set to true, the instance is enabled for AWS
     * Nitro Enclaves;. 
     */
    override fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean) {
      cdkBuilder.nitroEnclaveEnabled(nitroEnclaveEnabled)
    }

    /**
     * Whether IMDSv2 should be required on launched instances.
     *
     * Default: - false
     *
     * @param requireImdsv2 Whether IMDSv2 should be required on launched instances. 
     */
    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * An IAM role to associate with the instance profile that is used by instances.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`.
     * Note: You can provide an instanceProfile or a role, but not both.
     *
     * Default: - No new role is created.
     *
     * Example:
     *
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     *
     * @param role An IAM role to associate with the instance profile that is used by instances. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * Security group to assign to instances created with the launch template.
     *
     * Default: No security group is assigned.
     *
     * @param securityGroup Security group to assign to instances created with the launch template. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    /**
     * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
     * use Spot instances, and the options for the Spot instances will be as defined.
     *
     * Default: - Instance launched with this template will not be spot instances.
     *
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined. 
     */
    override fun spotOptions(spotOptions: LaunchTemplateSpotOptions) {
      cdkBuilder.spotOptions(spotOptions.let(LaunchTemplateSpotOptions.Companion::unwrap))
    }

    /**
     * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
     * use Spot instances, and the options for the Spot instances will be as defined.
     *
     * Default: - Instance launched with this template will not be spot instances.
     *
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ce905ff67a4ffc05d319d73c1977f1338e37b312b69e262901226d015543042")
    override fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit): Unit =
        spotOptions(LaunchTemplateSpotOptions(spotOptions))

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template creates a UserData based on the type of provided
     * machineImage; no UserData is created if a machineImage is not provided
     *
     * @param userData The AMI that will be used by instances. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplate = cdkBuilder.build()
  }

  public companion object {
    public fun fromLaunchTemplateAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LaunchTemplateAttributes,
    ): ILaunchTemplate =
        software.amazon.awscdk.services.ec2.LaunchTemplate.fromLaunchTemplateAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(LaunchTemplateAttributes.Companion::unwrap)).let(ILaunchTemplate::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("057cd63217e551e0bd19d10f532f79a21856bfe1557c66c09debaa22e75ea62c")
    public fun fromLaunchTemplateAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LaunchTemplateAttributes.Builder.() -> Unit,
    ): ILaunchTemplate = fromLaunchTemplateAttributes(scope, id, LaunchTemplateAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LaunchTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LaunchTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplate): LaunchTemplate
        = LaunchTemplate(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplate): software.amazon.awscdk.services.ec2.LaunchTemplate
        = wrapped.cdkObject as software.amazon.awscdk.services.ec2.LaunchTemplate
  }
}
