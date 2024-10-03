@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * (deprecated) NAT provider which uses NAT Instances.
 *
 * Example:
 *
 * ```
 * NatInstanceProvider natInstanceProvider = NatProvider.instance(NatInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.T4G, InstanceSize.LARGE))
 * .machineImage(new AmazonLinuxImage())
 * .creditSpecification(CpuCredits.UNLIMITED)
 * .build());
 * Vpc.Builder.create(this, "VPC")
 * .natGatewayProvider(natInstanceProvider)
 * .build();
 * ```
 *
 * @deprecated use NatInstanceProviderV2. NatInstanceProvider is deprecated since
 * the instance image used has reached EOL on Dec 31 2023
 */
public open class NatInstanceProvider(
  cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProvider,
) : NatProvider(cdkObject),
    IConnectable {
  @Deprecated(message = "deprecated in CDK")
  public constructor(props: NatInstanceProps) :
      this(software.amazon.awscdk.services.ec2.NatInstanceProvider(props.let(NatInstanceProps.Companion::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(props: NatInstanceProps.Builder.() -> Unit) : this(NatInstanceProps(props)
  )

  /**
   * (deprecated) Called by the VPC to configure NAT.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param options 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun configureNat(options: ConfigureNatOptions) {
    unwrap(this).configureNat(options.let(ConfigureNatOptions.Companion::unwrap))
  }

  /**
   * (deprecated) Called by the VPC to configure NAT.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param options 
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd4e1c7dc445ecccb0628de1d2dc0402a07b93c21145f259b74eb40763acacfd")
  public override fun configureNat(options: ConfigureNatOptions.Builder.() -> Unit): Unit =
      configureNat(ConfigureNatOptions(options))

  /**
   * (deprecated) Configures subnet with the gateway.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param subnet 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun configureSubnet(subnet: PrivateSubnet) {
    unwrap(this).configureSubnet(subnet.let(PrivateSubnet.Companion::unwrap))
  }

  /**
   * (deprecated) Return list of gateways spawned by the provider.
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun configuredGateways(): List<GatewayConfig> =
      unwrap(this).getConfiguredGateways().map(GatewayConfig::wrap)

  /**
   * (deprecated) Manage the Security Groups associated with the NAT instances.
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * (deprecated) The Security Group associated with the NAT instances.
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun securityGroup(): ISecurityGroup =
      unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)

  /**
   * (deprecated) A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.NatInstanceProvider].
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
     *
     * The unlimited CPU credit option is not supported for T3 instances with dedicated host
     * (`host`) tenancy.
     *
     * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
     *
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc). 
     */
    public fun creditSpecification(creditSpecification: CpuCredits)

    /**
     * Direction to allow all traffic through the NAT instance by default.
     *
     * By default, inbound and outbound traffic is allowed.
     *
     * If you set this to another value than INBOUND_AND_OUTBOUND, you must
     * configure the NAT instance's security groups in another way, either by
     * passing in a fully configured Security Group using the `securityGroup`
     * property, or by configuring it using the `.securityGroup` or
     * `.connections` members after passing the NAT Instance Provider to a Vpc.
     *
     * Default: NatTrafficDirection.INBOUND_AND_OUTBOUND
     *
     * @param defaultAllowedTraffic Direction to allow all traffic through the NAT instance by
     * default. 
     */
    public fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection)

    /**
     * Instance type of the NAT instance.
     *
     * @param instanceType Instance type of the NAT instance. 
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
     * The machine image (AMI) to use.
     *
     * By default, will do an AMI lookup for the latest NAT instance image.
     *
     * If you have a specific AMI ID you want to use, pass a `GenericLinuxImage`. For example:
     *
     * ```
     * NatProvider.instance(NatInstanceProps.builder()
     * .instanceType(new InstanceType("t3.micro"))
     * .machineImage(new GenericLinuxImage(Map.of(
     * "us-east-2", "ami-0f9c61b5a562a16af")))
     * .build());
     * ```
     *
     * Default: - Latest NAT instance image
     *
     * @param machineImage The machine image (AMI) to use. 
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * (deprecated) Security Group for NAT instances.
     *
     * Default: - A new security group will be created
     *
     * Example:
     *
     * ```
     * NatInstanceProviderV2 natGatewayProvider = NatProvider.instanceV2(NatInstanceProps.builder()
     * .instanceType(new InstanceType("t3.small"))
     * .defaultAllowedTraffic(NatTrafficDirection.NONE)
     * .build());
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").natGatewayProvider(natGatewayProvider).build();
     * SecurityGroup securityGroup = SecurityGroup.Builder.create(this, "SecurityGroup")
     * .vpc(vpc)
     * .allowAllOutbound(false)
     * .build();
     * securityGroup.addEgressRule(Peer.anyIpv4(), Port.tcp(443));
     * for (Object gatewayInstance : natGatewayProvider.getGatewayInstances()) {
     * gatewayInstance.addSecurityGroup(securityGroup);
     * }
     * ```
     *
     * @deprecated - Cannot create a new security group before the VPC is created,
     * and cannot create the VPC without the NAT provider.
     * Set [defaultAllowedTraffic ] to [NatTrafficDirection.NONE ]
     * and use [NatInstanceProviderV2.gatewayInstances ] to retrieve
     * the instances on the fly and add security groups
     * @param securityGroup Security Group for NAT instances. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * Custom user data to run on the NAT instances.
     *
     * Default:
     * UserData.forLinux().addCommands(...NatInstanceProviderV2.DEFAULT_USER_DATA_COMMANDS);  -
     * Appropriate user data commands to initialize and configure the NAT instances
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_NAT_Instance.html#create-nat-ami)
     * @param userData Custom user data to run on the NAT instances. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatInstanceProvider.Builder =
        software.amazon.awscdk.services.ec2.NatInstanceProvider.Builder.create()

    /**
     * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
     *
     * The unlimited CPU credit option is not supported for T3 instances with dedicated host
     * (`host`) tenancy.
     *
     * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
     *
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc). 
     */
    override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits.Companion::unwrap))
    }

    /**
     * Direction to allow all traffic through the NAT instance by default.
     *
     * By default, inbound and outbound traffic is allowed.
     *
     * If you set this to another value than INBOUND_AND_OUTBOUND, you must
     * configure the NAT instance's security groups in another way, either by
     * passing in a fully configured Security Group using the `securityGroup`
     * property, or by configuring it using the `.securityGroup` or
     * `.connections` members after passing the NAT Instance Provider to a Vpc.
     *
     * Default: NatTrafficDirection.INBOUND_AND_OUTBOUND
     *
     * @param defaultAllowedTraffic Direction to allow all traffic through the NAT instance by
     * default. 
     */
    override fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
      cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic.let(NatTrafficDirection.Companion::unwrap))
    }

    /**
     * Instance type of the NAT instance.
     *
     * @param instanceType Instance type of the NAT instance. 
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
     * The machine image (AMI) to use.
     *
     * By default, will do an AMI lookup for the latest NAT instance image.
     *
     * If you have a specific AMI ID you want to use, pass a `GenericLinuxImage`. For example:
     *
     * ```
     * NatProvider.instance(NatInstanceProps.builder()
     * .instanceType(new InstanceType("t3.micro"))
     * .machineImage(new GenericLinuxImage(Map.of(
     * "us-east-2", "ami-0f9c61b5a562a16af")))
     * .build());
     * ```
     *
     * Default: - Latest NAT instance image
     *
     * @param machineImage The machine image (AMI) to use. 
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage.Companion::unwrap))
    }

    /**
     * (deprecated) Security Group for NAT instances.
     *
     * Default: - A new security group will be created
     *
     * Example:
     *
     * ```
     * NatInstanceProviderV2 natGatewayProvider = NatProvider.instanceV2(NatInstanceProps.builder()
     * .instanceType(new InstanceType("t3.small"))
     * .defaultAllowedTraffic(NatTrafficDirection.NONE)
     * .build());
     * Vpc vpc = Vpc.Builder.create(this, "Vpc").natGatewayProvider(natGatewayProvider).build();
     * SecurityGroup securityGroup = SecurityGroup.Builder.create(this, "SecurityGroup")
     * .vpc(vpc)
     * .allowAllOutbound(false)
     * .build();
     * securityGroup.addEgressRule(Peer.anyIpv4(), Port.tcp(443));
     * for (Object gatewayInstance : natGatewayProvider.getGatewayInstances()) {
     * gatewayInstance.addSecurityGroup(securityGroup);
     * }
     * ```
     *
     * @deprecated - Cannot create a new security group before the VPC is created,
     * and cannot create the VPC without the NAT provider.
     * Set [defaultAllowedTraffic ] to [NatTrafficDirection.NONE ]
     * and use [NatInstanceProviderV2.gatewayInstances ] to retrieve
     * the instances on the fly and add security groups
     * @param securityGroup Security Group for NAT instances. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    /**
     * Custom user data to run on the NAT instances.
     *
     * Default:
     * UserData.forLinux().addCommands(...NatInstanceProviderV2.DEFAULT_USER_DATA_COMMANDS);  -
     * Appropriate user data commands to initialize and configure the NAT instances
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_NAT_Instance.html#create-nat-ami)
     * @param userData Custom user data to run on the NAT instances. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NatInstanceProvider = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NatInstanceProvider {
      val builderImpl = BuilderImpl()
      return NatInstanceProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProvider):
        NatInstanceProvider = NatInstanceProvider(cdkObject)

    internal fun unwrap(wrapped: NatInstanceProvider):
        software.amazon.awscdk.services.ec2.NatInstanceProvider = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.NatInstanceProvider
  }
}
