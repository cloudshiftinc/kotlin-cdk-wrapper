@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface InterfaceVpcEndpointProps : InterfaceVpcEndpointOptions {
  public fun vpc(): IVpc

  @CdkDslMarker
  public interface Builder {
    public fun lookupSupportedAzs(lookupSupportedAzs: Boolean)

    public fun `open`(`open`: Boolean)

    public fun privateDnsEnabled(privateDnsEnabled: Boolean)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun service(service: IInterfaceVpcEndpointService)

    public fun subnets(subnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43192c1fc7bb99217fd4042402557726fdd13e9ba719af6c44404f7d12caa7d4")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps.builder()

    override fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
      cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
    }

    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun service(service: IInterfaceVpcEndpointService) {
      cdkBuilder.service(service.let(IInterfaceVpcEndpointService::unwrap))
    }

    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43192c1fc7bb99217fd4042402557726fdd13e9ba719af6c44404f7d12caa7d4")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps,
  ) : CdkObject(cdkObject), InterfaceVpcEndpointProps {
    override fun lookupSupportedAzs(): Boolean? = unwrap(this).getLookupSupportedAzs()

    override fun `open`(): Boolean? = unwrap(this).getOpen()

    override fun privateDnsEnabled(): Boolean? = unwrap(this).getPrivateDnsEnabled()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun service(): IInterfaceVpcEndpointService =
        unwrap(this).getService().let(IInterfaceVpcEndpointService::wrap)

    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceVpcEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps):
        InterfaceVpcEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointProps):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
  }
}
