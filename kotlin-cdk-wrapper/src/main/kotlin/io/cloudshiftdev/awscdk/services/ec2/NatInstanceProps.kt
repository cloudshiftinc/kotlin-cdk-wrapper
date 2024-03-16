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
 * NatInstanceProvider natInstanceProvider = NatProvider.instance(NatInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.T4G, InstanceSize.LARGE))
 * .machineImage(new AmazonLinuxImage())
 * .creditSpecification(CpuCredits.UNLIMITED)
 * .build());
 * Vpc.Builder.create(this, "VPC")
 * .natGatewayProvider(natInstanceProvider)
 * .build();
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
   * Security Group for NAT instances.
   *
   * Default: - A new security group will be created
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

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
     */
    public fun securityGroup(securityGroup: ISecurityGroup)
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
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NatInstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProps,
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
     * Security Group for NAT instances.
     *
     * Default: - A new security group will be created
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NatInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProps):
        NatInstanceProps = CdkObjectWrappers.wrap(cdkObject) as NatInstanceProps

    internal fun unwrap(wrapped: NatInstanceProps):
        software.amazon.awscdk.services.ec2.NatInstanceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.NatInstanceProps
  }
}
