package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface VpcLinkProps {
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  public fun vpc(): IVpc

  public fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()

  public interface Builder {
    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun subnets(subnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e860511c74b7bbc023d3141652ef1a77b25092644e6854afbf2c6f6f6b4a6a9b")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcLinkName(vpcLinkName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.VpcLinkProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.VpcLinkProps.builder()

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e860511c74b7bbc023d3141652ef1a77b25092644e6854afbf2c6f6f6b4a6a9b")
    public override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.VpcLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkProps,
  ) : VpcLinkProps {
    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    public override fun subnets(): SubnetSelection? =
        unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    public override fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkProps):
        VpcLinkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLinkProps):
        software.amazon.awscdk.services.apigatewayv2.VpcLinkProps = (wrapped as Wrapper).cdkObject
  }
}
