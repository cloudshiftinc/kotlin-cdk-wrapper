package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface InterfaceVpcEndpointOptions {
  public fun lookupSupportedAzs(): Boolean? = unwrap(this).getLookupSupportedAzs()

  public fun `open`(): Boolean? = unwrap(this).getOpen()

  public fun privateDnsEnabled(): Boolean? = unwrap(this).getPrivateDnsEnabled()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun service(): IInterfaceVpcEndpointService

  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  public interface Builder {
    public fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
    }

    public fun `open`(`open`: Boolean) {
    }

    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun service(service: IInterfaceVpcEndpointService) {
    }

    public fun subnets(subnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41961a405f9019549cd4f6bef0e89b8c8835511f3fd849fdc0b2cb42ee990fdf")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions.Builder
        = software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions.builder()

    public override fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
      cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
    }

    public override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    public override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun service(service: IInterfaceVpcEndpointService) {
      cdkBuilder.service(service.let(IInterfaceVpcEndpointService::unwrap))
    }

    public override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41961a405f9019549cd4f6bef0e89b8c8835511f3fd849fdc0b2cb42ee990fdf")
    public override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions,
  ) : InterfaceVpcEndpointOptions {
    public override fun lookupSupportedAzs(): Boolean? = unwrap(this).getLookupSupportedAzs()

    public override fun `open`(): Boolean? = unwrap(this).getOpen()

    public override fun privateDnsEnabled(): Boolean? = unwrap(this).getPrivateDnsEnabled()

    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    public override fun service(): IInterfaceVpcEndpointService =
        unwrap(this).getService().let(IInterfaceVpcEndpointService::wrap)

    public override fun subnets(): SubnetSelection? =
        unwrap(this).getSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceVpcEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions):
        InterfaceVpcEndpointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointOptions):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions = (wrapped as
        Wrapper).cdkObject
  }
}
