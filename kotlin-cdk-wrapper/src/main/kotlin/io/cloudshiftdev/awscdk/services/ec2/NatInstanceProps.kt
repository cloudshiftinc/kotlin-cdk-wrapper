@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

/**
 * Properties for a NAT instance.
 *
 * Example:
 *
 * ```
 * InstanceType instanceType;
 * NatInstanceProviderV2 provider = NatProvider.instanceV2(NatInstanceProps.builder()
 * .instanceType(instanceType)
 * .defaultAllowedTraffic(NatTrafficDirection.OUTBOUND_ONLY)
 * .build());
 * Vpc.Builder.create(this, "TheVPC")
 * .natGatewayProvider(provider)
 * .build();
 * provider.connections.allowFrom(Peer.ipv4("1.2.3.4/8"), Port.HTTP);
 * ```
 */
public interface NatInstanceProps {
  /**
   * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
   *
   * The unlimited CPU credit option is not supported for T3 instances with dedicated host (`host`)
   * tenancy.
   *
   * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
   */
  public fun creditSpecification(): CpuCredits? =
      unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

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
   */
  public fun defaultAllowedTraffic(): NatTrafficDirection? =
      unwrap(this).getDefaultAllowedTraffic()?.let(NatTrafficDirection::wrap)

  /**
   * Instance type of the NAT instance.
   */
  public fun instanceType(): InstanceType

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
   */
  public fun machineImage(): IMachineImage? =
      unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

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
   */
  @Deprecated(message = "deprecated in CDK")
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Custom user data to run on the NAT instances.
   *
   * Default:
   * UserData.forLinux().addCommands(...NatInstanceProviderV2.DEFAULT_USER_DATA_COMMANDS);  -
   * Appropriate user data commands to initialize and configure the NAT instances
   *
   * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_NAT_Instance.html#create-nat-ami)
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * A builder for [NatInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc).
     * The unlimited CPU credit option is not supported for T3 instances with dedicated host
     * (`host`) tenancy.
     */
    public fun creditSpecification(creditSpecification: CpuCredits)

    /**
     * @param defaultAllowedTraffic Direction to allow all traffic through the NAT instance by
     * default.
     * By default, inbound and outbound traffic is allowed.
     *
     * If you set this to another value than INBOUND_AND_OUTBOUND, you must
     * configure the NAT instance's security groups in another way, either by
     * passing in a fully configured Security Group using the `securityGroup`
     * property, or by configuring it using the `.securityGroup` or
     * `.connections` members after passing the NAT Instance Provider to a Vpc.
     */
    public fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection)

    /**
     * @param instanceType Instance type of the NAT instance. 
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
     * @param machineImage The machine image (AMI) to use.
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
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * @param securityGroup Security Group for NAT instances.
     * @deprecated - Cannot create a new security group before the VPC is created,
     * and cannot create the VPC without the NAT provider.
     * Set [defaultAllowedTraffic ] to [NatTrafficDirection.NONE ]
     * and use [NatInstanceProviderV2.gatewayInstances ] to retrieve
     * the instances on the fly and add security groups
     */
    @Deprecated(message = "deprecated in CDK")
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param userData Custom user data to run on the NAT instances.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatInstanceProps.Builder =
        software.amazon.awscdk.services.ec2.NatInstanceProps.builder()

    /**
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     * (T2, T3, T3a, etc).
     * The unlimited CPU credit option is not supported for T3 instances with dedicated host
     * (`host`) tenancy.
     */
    override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
    }

    /**
     * @param defaultAllowedTraffic Direction to allow all traffic through the NAT instance by
     * default.
     * By default, inbound and outbound traffic is allowed.
     *
     * If you set this to another value than INBOUND_AND_OUTBOUND, you must
     * configure the NAT instance's security groups in another way, either by
     * passing in a fully configured Security Group using the `securityGroup`
     * property, or by configuring it using the `.securityGroup` or
     * `.connections` members after passing the NAT Instance Provider to a Vpc.
     */
    override fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
      cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic.let(NatTrafficDirection::unwrap))
    }

    /**
     * @param instanceType Instance type of the NAT instance. 
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
     * @param machineImage The machine image (AMI) to use.
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
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    /**
     * @param securityGroup Security Group for NAT instances.
     * @deprecated - Cannot create a new security group before the VPC is created,
     * and cannot create the VPC without the NAT provider.
     * Set [defaultAllowedTraffic ] to [NatTrafficDirection.NONE ]
     * and use [NatInstanceProviderV2.gatewayInstances ] to retrieve
     * the instances on the fly and add security groups
     */
    @Deprecated(message = "deprecated in CDK")
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param userData Custom user data to run on the NAT instances.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NatInstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProps,
  ) : CdkObject(cdkObject), NatInstanceProps {
    /**
     * Specifying the CPU credit type for burstable EC2 instance types (T2, T3, T3a, etc).
     *
     * The unlimited CPU credit option is not supported for T3 instances with dedicated host
     * (`host`) tenancy.
     *
     * Default: - T2 instances are standard, while T3, T4g, and T3a instances are unlimited.
     */
    override fun creditSpecification(): CpuCredits? =
        unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

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
     */
    override fun defaultAllowedTraffic(): NatTrafficDirection? =
        unwrap(this).getDefaultAllowedTraffic()?.let(NatTrafficDirection::wrap)

    /**
     * Instance type of the NAT instance.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

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
     */
    override fun machineImage(): IMachineImage? =
        unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

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
     */
    @Deprecated(message = "deprecated in CDK")
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * Custom user data to run on the NAT instances.
     *
     * Default:
     * UserData.forLinux().addCommands(...NatInstanceProviderV2.DEFAULT_USER_DATA_COMMANDS);  -
     * Appropriate user data commands to initialize and configure the NAT instances
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_NAT_Instance.html#create-nat-ami)
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NatInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProps):
        NatInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? NatInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NatInstanceProps):
        software.amazon.awscdk.services.ec2.NatInstanceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.NatInstanceProps
  }
}
