@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Modern NAT provider which uses NAT Instances.
 *
 * The instance uses Amazon Linux 2023 as the operating system.
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
 * provider.connections.allowFrom(Peer.ipv4("1.2.3.4/8"), Port.tcp(80));
 * ```
 */
public open class NatInstanceProviderV2 internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProviderV2,
) : NatProvider(cdkObject), IConnectable {
  /**
   * Called by the VPC to configure NAT.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param options 
   */
  public override fun configureNat(options: ConfigureNatOptions) {
    unwrap(this).configureNat(options.let(ConfigureNatOptions::unwrap))
  }

  /**
   * Called by the VPC to configure NAT.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd4e1c7dc445ecccb0628de1d2dc0402a07b93c21145f259b74eb40763acacfd")
  public override fun configureNat(options: ConfigureNatOptions.Builder.() -> Unit): Unit =
      configureNat(ConfigureNatOptions(options))

  /**
   * Configures subnet with the gateway.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param subnet 
   */
  public override fun configureSubnet(subnet: PrivateSubnet) {
    unwrap(this).configureSubnet(subnet.let(PrivateSubnet::unwrap))
  }

  /**
   * Return list of gateways spawned by the provider.
   */
  public override fun configuredGateways(): List<GatewayConfig> =
      unwrap(this).getConfiguredGateways().map(GatewayConfig::wrap)

  /**
   * Manage the Security Groups associated with the NAT instances.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The Security Group associated with the NAT instances.
   */
  public open fun securityGroup(): ISecurityGroup =
      unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.NatInstanceProviderV2].
   */
  @CdkDslMarker
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
     * Security Group for NAT instances.
     *
     * Default: - A new security group will be created
     *
     * @param securityGroup Security Group for NAT instances. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatInstanceProviderV2.Builder =
        software.amazon.awscdk.services.ec2.NatInstanceProviderV2.Builder.create()

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
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
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
      cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic.let(NatTrafficDirection::unwrap))
    }

    /**
     * Instance type of the NAT instance.
     *
     * @param instanceType Instance type of the NAT instance. 
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
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    /**
     * Security Group for NAT instances.
     *
     * Default: - A new security group will be created
     *
     * @param securityGroup Security Group for NAT instances. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NatInstanceProviderV2 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NatInstanceProviderV2 {
      val builderImpl = BuilderImpl()
      return NatInstanceProviderV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProviderV2):
        NatInstanceProviderV2 = NatInstanceProviderV2(cdkObject)

    internal fun unwrap(wrapped: NatInstanceProviderV2):
        software.amazon.awscdk.services.ec2.NatInstanceProviderV2 = wrapped.cdkObject
  }
}
