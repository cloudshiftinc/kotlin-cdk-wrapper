package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IInstanceProfile
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface LaunchTemplateProps {
  /**
   * Whether instances should have a public IP addresses associated with them.
   *
   * Default: - Use subnet settings
   */
  public fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

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
   * CPU credit type for burstable EC2 instance types.
   *
   * Default: - No credit type is specified in the Launch Template.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
   */
  public fun cpuCredits(): CpuCredits? = unwrap(this).getCpuCredits()?.let(CpuCredits::wrap)

  /**
   * If set to true, then detailed monitoring will be enabled on instances created with this launch
   * template.
   *
   * Default: False - Detailed monitoring is disabled.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
   */
  public fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

  /**
   * If you set this parameter to true, you cannot terminate the instances launched with this launch
   * template using the Amazon EC2 console, CLI, or API;
   *
   * otherwise, you can.
   *
   * Default: - The API termination setting is not specified in the Launch Template.
   */
  public fun disableApiTermination(): Boolean? = unwrap(this).getDisableApiTermination()

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
   */
  public fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()

  /**
   * If you set this parameter to true, the instance is enabled for hibernation.
   *
   * Default: - Hibernation configuration is not specified in the launch template; defaulting to
   * false.
   */
  public fun hibernationConfigured(): Boolean? = unwrap(this).getHibernationConfigured()

  /**
   * Enables or disables the HTTP metadata endpoint on your instances.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint)
   */
  public fun httpEndpoint(): Boolean? = unwrap(this).getHttpEndpoint()

  /**
   * Enables or disables the IPv6 endpoint for the instance metadata service.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpprotocolipv6)
   */
  public fun httpProtocolIpv6(): Boolean? = unwrap(this).getHttpProtocolIpv6()

  /**
   * The desired HTTP PUT response hop limit for instance metadata requests.
   *
   * The larger the number, the further instance metadata requests can travel.
   *
   * Default: 1
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit)
   */
  public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

  /**
   * The state of token usage for your instance metadata requests.
   *
   * The default state is `optional` if not specified. However,
   * if requireImdsv2 is true, the state must be `required`.
   *
   * Default: LaunchTemplateHttpTokens.OPTIONAL
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens)
   */
  public fun httpTokens(): LaunchTemplateHttpTokens? =
      unwrap(this).getHttpTokens()?.let(LaunchTemplateHttpTokens::wrap)

  /**
   * Indicates whether an instance stops or terminates when you initiate shutdown from the instance
   * (using the operating system command for system shutdown).
   *
   * Default: - Shutdown behavior is not specified in the launch template; defaults to STOP.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior)
   */
  public fun instanceInitiatedShutdownBehavior(): InstanceInitiatedShutdownBehavior? =
      unwrap(this).getInstanceInitiatedShutdownBehavior()?.let(InstanceInitiatedShutdownBehavior::wrap)

  /**
   * Set to enabled to allow access to instance tags from the instance metadata.
   *
   * Set to disabled to turn off access to instance tags from the instance metadata.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-instancemetadatatags)
   */
  public fun instanceMetadataTags(): Boolean? = unwrap(this).getInstanceMetadataTags()

  /**
   * The instance profile used to pass role information to EC2 instances.
   *
   * Note: You can provide an instanceProfile or a role, but not both.
   *
   * Default: - No instance profile
   */
  public fun instanceProfile(): IInstanceProfile? =
      unwrap(this).getInstanceProfile()?.let(IInstanceProfile::wrap)

  /**
   * Type of instance to launch.
   *
   * Default: - This Launch Template does not specify a default Instance Type.
   */
  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  /**
   * (deprecated) Name of SSH keypair to grant access to instance.
   *
   * Default: - No SSH access will be possible.
   *
   * * Use `keyPair` instead -
   * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
   */
  @Deprecated(message = "deprecated in CDK")
  public fun keyName(): String? = unwrap(this).getKeyName()

  /**
   * The SSH keypair to grant access to the instance.
   *
   * Default: - No SSH access will be possible.
   */
  public fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

  /**
   * Name for this launch template.
   *
   * Default: Automatically generated name
   */
  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  /**
   * The AMI that will be used by instances.
   *
   * Default: - This Launch Template does not specify a default AMI.
   */
  public fun machineImage(): IMachineImage? =
      unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

  /**
   * If this parameter is set to true, the instance is enabled for AWS Nitro Enclaves;
   *
   * otherwise, it is not enabled for AWS Nitro Enclaves.
   *
   * Default: - Enablement of Nitro enclaves is not specified in the launch template; defaulting to
   * false.
   */
  public fun nitroEnclaveEnabled(): Boolean? = unwrap(this).getNitroEnclaveEnabled()

  /**
   * Whether IMDSv2 should be required on launched instances.
   *
   * Default: - false
   */
  public fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

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
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Security group to assign to instances created with the launch template.
   *
   * Default: No security group is assigned.
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
   * use Spot instances, and the options for the Spot instances will be as defined.
   *
   * Default: - Instance launched with this template will not be spot instances.
   */
  public fun spotOptions(): LaunchTemplateSpotOptions? =
      unwrap(this).getSpotOptions()?.let(LaunchTemplateSpotOptions::wrap)

  /**
   * The AMI that will be used by instances.
   *
   * Default: - This Launch Template creates a UserData based on the type of provided
   * machineImage; no UserData is created if a machineImage is not provided
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * A builder for [LaunchTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associatePublicIpAddress Whether instances should have a public IP addresses
     * associated with them.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

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
     * @param cpuCredits CPU credit type for burstable EC2 instance types.
     */
    public fun cpuCredits(cpuCredits: CpuCredits)

    /**
     * @param detailedMonitoring If set to true, then detailed monitoring will be enabled on
     * instances created with this launch template.
     */
    public fun detailedMonitoring(detailedMonitoring: Boolean)

    /**
     * @param disableApiTermination If you set this parameter to true, you cannot terminate the
     * instances launched with this launch template using the Amazon EC2 console, CLI, or API;.
     * otherwise, you can.
     */
    public fun disableApiTermination(disableApiTermination: Boolean)

    /**
     * @param ebsOptimized Indicates whether the instances are optimized for Amazon EBS I/O.
     * This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     * performance. This optimization
     * isn't available with all instance types. Additional usage charges apply when using an
     * EBS-optimized instance.
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * @param hibernationConfigured If you set this parameter to true, the instance is enabled for
     * hibernation.
     */
    public fun hibernationConfigured(hibernationConfigured: Boolean)

    /**
     * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances.
     */
    public fun httpEndpoint(httpEndpoint: Boolean)

    /**
     * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
     * service.
     */
    public fun httpProtocolIpv6(httpProtocolIpv6: Boolean)

    /**
     * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
     * requests.
     * The larger the number, the further instance metadata requests can travel.
     */
    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

    /**
     * @param httpTokens The state of token usage for your instance metadata requests.
     * The default state is `optional` if not specified. However,
     * if requireImdsv2 is true, the state must be `required`.
     */
    public fun httpTokens(httpTokens: LaunchTemplateHttpTokens)

    /**
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown).
     */
    public
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior)

    /**
     * @param instanceMetadataTags Set to enabled to allow access to instance tags from the instance
     * metadata.
     * Set to disabled to turn off access to instance tags from the instance metadata.
     */
    public fun instanceMetadataTags(instanceMetadataTags: Boolean)

    /**
     * @param instanceProfile The instance profile used to pass role information to EC2 instances.
     * Note: You can provide an instanceProfile or a role, but not both.
     */
    public fun instanceProfile(instanceProfile: IInstanceProfile)

    /**
     * @param instanceType Type of instance to launch.
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param keyName Name of SSH keypair to grant access to instance.
     * @deprecated - Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    /**
     * @param keyPair The SSH keypair to grant access to the instance.
     */
    public fun keyPair(keyPair: IKeyPair)

    /**
     * @param launchTemplateName Name for this launch template.
     */
    public fun launchTemplateName(launchTemplateName: String)

    /**
     * @param machineImage The AMI that will be used by instances.
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * @param nitroEnclaveEnabled If this parameter is set to true, the instance is enabled for AWS
     * Nitro Enclaves;.
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     */
    public fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean)

    /**
     * @param requireImdsv2 Whether IMDSv2 should be required on launched instances.
     */
    public fun requireImdsv2(requireImdsv2: Boolean)

    /**
     * @param role An IAM role to associate with the instance profile that is used by instances.
     * The role must be assumable by the service principal `ec2.amazonaws.com`.
     * Note: You can provide an instanceProfile or a role, but not both.
     */
    public fun role(role: IRole)

    /**
     * @param securityGroup Security group to assign to instances created with the launch template.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined.
     */
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions)

    /**
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88001c7544e45aacfe574b5dab74e5aa452d7405a9304723b27c46ee86d910cb")
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit)

    /**
     * @param userData The AMI that will be used by instances.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplateProps.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateProps.builder()

    /**
     * @param associatePublicIpAddress Whether instances should have a public IP addresses
     * associated with them.
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
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
     * @param cpuCredits CPU credit type for burstable EC2 instance types.
     */
    override fun cpuCredits(cpuCredits: CpuCredits) {
      cdkBuilder.cpuCredits(cpuCredits.let(CpuCredits::unwrap))
    }

    /**
     * @param detailedMonitoring If set to true, then detailed monitoring will be enabled on
     * instances created with this launch template.
     */
    override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    /**
     * @param disableApiTermination If you set this parameter to true, you cannot terminate the
     * instances launched with this launch template using the Amazon EC2 console, CLI, or API;.
     * otherwise, you can.
     */
    override fun disableApiTermination(disableApiTermination: Boolean) {
      cdkBuilder.disableApiTermination(disableApiTermination)
    }

    /**
     * @param ebsOptimized Indicates whether the instances are optimized for Amazon EBS I/O.
     * This optimization provides dedicated throughput
     * to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O
     * performance. This optimization
     * isn't available with all instance types. Additional usage charges apply when using an
     * EBS-optimized instance.
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * @param hibernationConfigured If you set this parameter to true, the instance is enabled for
     * hibernation.
     */
    override fun hibernationConfigured(hibernationConfigured: Boolean) {
      cdkBuilder.hibernationConfigured(hibernationConfigured)
    }

    /**
     * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances.
     */
    override fun httpEndpoint(httpEndpoint: Boolean) {
      cdkBuilder.httpEndpoint(httpEndpoint)
    }

    /**
     * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
     * service.
     */
    override fun httpProtocolIpv6(httpProtocolIpv6: Boolean) {
      cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    /**
     * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
     * requests.
     * The larger the number, the further instance metadata requests can travel.
     */
    override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
      cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    /**
     * @param httpTokens The state of token usage for your instance metadata requests.
     * The default state is `optional` if not specified. However,
     * if requireImdsv2 is true, the state must be `required`.
     */
    override fun httpTokens(httpTokens: LaunchTemplateHttpTokens) {
      cdkBuilder.httpTokens(httpTokens.let(LaunchTemplateHttpTokens::unwrap))
    }

    /**
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown).
     */
    override
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior) {
      cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior.let(InstanceInitiatedShutdownBehavior::unwrap))
    }

    /**
     * @param instanceMetadataTags Set to enabled to allow access to instance tags from the instance
     * metadata.
     * Set to disabled to turn off access to instance tags from the instance metadata.
     */
    override fun instanceMetadataTags(instanceMetadataTags: Boolean) {
      cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    /**
     * @param instanceProfile The instance profile used to pass role information to EC2 instances.
     * Note: You can provide an instanceProfile or a role, but not both.
     */
    override fun instanceProfile(instanceProfile: IInstanceProfile) {
      cdkBuilder.instanceProfile(instanceProfile.let(IInstanceProfile::unwrap))
    }

    /**
     * @param instanceType Type of instance to launch.
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param keyName Name of SSH keypair to grant access to instance.
     * @deprecated - Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param keyPair The SSH keypair to grant access to the instance.
     */
    override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair::unwrap))
    }

    /**
     * @param launchTemplateName Name for this launch template.
     */
    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param machineImage The AMI that will be used by instances.
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    /**
     * @param nitroEnclaveEnabled If this parameter is set to true, the instance is enabled for AWS
     * Nitro Enclaves;.
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     */
    override fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean) {
      cdkBuilder.nitroEnclaveEnabled(nitroEnclaveEnabled)
    }

    /**
     * @param requireImdsv2 Whether IMDSv2 should be required on launched instances.
     */
    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * @param role An IAM role to associate with the instance profile that is used by instances.
     * The role must be assumable by the service principal `ec2.amazonaws.com`.
     * Note: You can provide an instanceProfile or a role, but not both.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param securityGroup Security group to assign to instances created with the launch template.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined.
     */
    override fun spotOptions(spotOptions: LaunchTemplateSpotOptions) {
      cdkBuilder.spotOptions(spotOptions.let(LaunchTemplateSpotOptions::unwrap))
    }

    /**
     * @param spotOptions If this property is defined, then the Launch Template's
     * InstanceMarketOptions will be set to use Spot instances, and the options for the Spot instances
     * will be as defined.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88001c7544e45aacfe574b5dab74e5aa452d7405a9304723b27c46ee86d910cb")
    override fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit): Unit =
        spotOptions(LaunchTemplateSpotOptions(spotOptions))

    /**
     * @param userData The AMI that will be used by instances.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateProps,
  ) : CdkObject(cdkObject), LaunchTemplateProps {
    /**
     * Whether instances should have a public IP addresses associated with them.
     *
     * Default: - Use subnet settings
     */
    override fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

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
     * CPU credit type for burstable EC2 instance types.
     *
     * Default: - No credit type is specified in the Launch Template.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     */
    override fun cpuCredits(): CpuCredits? = unwrap(this).getCpuCredits()?.let(CpuCredits::wrap)

    /**
     * If set to true, then detailed monitoring will be enabled on instances created with this
     * launch template.
     *
     * Default: False - Detailed monitoring is disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
     */
    override fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

    /**
     * If you set this parameter to true, you cannot terminate the instances launched with this
     * launch template using the Amazon EC2 console, CLI, or API;
     *
     * otherwise, you can.
     *
     * Default: - The API termination setting is not specified in the Launch Template.
     */
    override fun disableApiTermination(): Boolean? = unwrap(this).getDisableApiTermination()

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
     */
    override fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()

    /**
     * If you set this parameter to true, the instance is enabled for hibernation.
     *
     * Default: - Hibernation configuration is not specified in the launch template; defaulting to
     * false.
     */
    override fun hibernationConfigured(): Boolean? = unwrap(this).getHibernationConfigured()

    /**
     * Enables or disables the HTTP metadata endpoint on your instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint)
     */
    override fun httpEndpoint(): Boolean? = unwrap(this).getHttpEndpoint()

    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpprotocolipv6)
     */
    override fun httpProtocolIpv6(): Boolean? = unwrap(this).getHttpProtocolIpv6()

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     *
     * The larger the number, the further instance metadata requests can travel.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit)
     */
    override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    /**
     * The state of token usage for your instance metadata requests.
     *
     * The default state is `optional` if not specified. However,
     * if requireImdsv2 is true, the state must be `required`.
     *
     * Default: LaunchTemplateHttpTokens.OPTIONAL
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens)
     */
    override fun httpTokens(): LaunchTemplateHttpTokens? =
        unwrap(this).getHttpTokens()?.let(LaunchTemplateHttpTokens::wrap)

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: - Shutdown behavior is not specified in the launch template; defaults to STOP.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior)
     */
    override fun instanceInitiatedShutdownBehavior(): InstanceInitiatedShutdownBehavior? =
        unwrap(this).getInstanceInitiatedShutdownBehavior()?.let(InstanceInitiatedShutdownBehavior::wrap)

    /**
     * Set to enabled to allow access to instance tags from the instance metadata.
     *
     * Set to disabled to turn off access to instance tags from the instance metadata.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-instancemetadatatags)
     */
    override fun instanceMetadataTags(): Boolean? = unwrap(this).getInstanceMetadataTags()

    /**
     * The instance profile used to pass role information to EC2 instances.
     *
     * Note: You can provide an instanceProfile or a role, but not both.
     *
     * Default: - No instance profile
     */
    override fun instanceProfile(): IInstanceProfile? =
        unwrap(this).getInstanceProfile()?.let(IInstanceProfile::wrap)

    /**
     * Type of instance to launch.
     *
     * Default: - This Launch Template does not specify a default Instance Type.
     */
    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    /**
     * (deprecated) Name of SSH keypair to grant access to instance.
     *
     * Default: - No SSH access will be possible.
     *
     * * Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    override fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * The SSH keypair to grant access to the instance.
     *
     * Default: - No SSH access will be possible.
     */
    override fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

    /**
     * Name for this launch template.
     *
     * Default: Automatically generated name
     */
    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template does not specify a default AMI.
     */
    override fun machineImage(): IMachineImage? =
        unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

    /**
     * If this parameter is set to true, the instance is enabled for AWS Nitro Enclaves;
     *
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     *
     * Default: - Enablement of Nitro enclaves is not specified in the launch template; defaulting
     * to false.
     */
    override fun nitroEnclaveEnabled(): Boolean? = unwrap(this).getNitroEnclaveEnabled()

    /**
     * Whether IMDSv2 should be required on launched instances.
     *
     * Default: - false
     */
    override fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Security group to assign to instances created with the launch template.
     *
     * Default: No security group is assigned.
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
     * use Spot instances, and the options for the Spot instances will be as defined.
     *
     * Default: - Instance launched with this template will not be spot instances.
     */
    override fun spotOptions(): LaunchTemplateSpotOptions? =
        unwrap(this).getSpotOptions()?.let(LaunchTemplateSpotOptions::wrap)

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template creates a UserData based on the type of provided
     * machineImage; no UserData is created if a machineImage is not provided
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateProps):
        LaunchTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateProps):
        software.amazon.awscdk.services.ec2.LaunchTemplateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.LaunchTemplateProps
  }
}
