package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface NatInstanceProps {
  public fun creditSpecification(): CpuCredits? =
      unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

  public fun defaultAllowedTraffic(): NatTrafficDirection? =
      unwrap(this).getDefaultAllowedTraffic()?.let(NatTrafficDirection::wrap)

  public fun instanceType(): InstanceType

  @Deprecated(message = "deprecated in CDK")
  public fun keyName(): String? = unwrap(this).getKeyName()

  public fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

  public fun machineImage(): IMachineImage? =
      unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public interface Builder {
    public fun creditSpecification(creditSpecification: CpuCredits)

    public fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection)

    public fun instanceType(instanceType: InstanceType)

    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    public fun keyPair(keyPair: IKeyPair)

    public fun machineImage(machineImage: IMachineImage)

    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatInstanceProps.Builder =
        software.amazon.awscdk.services.ec2.NatInstanceProps.builder()

    override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
    }

    override fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
      cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic.let(NatTrafficDirection::unwrap))
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair::unwrap))
    }

    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NatInstanceProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProps,
  ) : NatInstanceProps {
    override fun creditSpecification(): CpuCredits? =
        unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

    override fun defaultAllowedTraffic(): NatTrafficDirection? =
        unwrap(this).getDefaultAllowedTraffic()?.let(NatTrafficDirection::wrap)

    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun keyName(): String? = unwrap(this).getKeyName()

    override fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

    override fun machineImage(): IMachineImage? =
        unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NatInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceProps):
        NatInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NatInstanceProps):
        software.amazon.awscdk.services.ec2.NatInstanceProps = (wrapped as Wrapper).cdkObject
  }
}
