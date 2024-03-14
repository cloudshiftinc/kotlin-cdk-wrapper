package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpcLink internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLink,
) : Resource(cdkObject), IVpcLink {
  public open fun addSecurityGroups(groups: ISecurityGroup) {
    unwrap(this).addSecurityGroups(groups.let(ISecurityGroup::unwrap))
  }

  public open fun addSubnets(subnets: ISubnet) {
    unwrap(this).addSubnets(subnets.let(ISubnet::unwrap))
  }

  public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  public override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()

  public interface Builder {
    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun subnets(subnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e9a30b66ec339f577be96e7497ab4fa16491a572bfd3f02c33f8af0ec3021eb")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcLinkName(vpcLinkName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.VpcLink.Builder =
        software.amazon.awscdk.services.apigatewayv2.VpcLink.Builder.create(scope, id)

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e9a30b66ec339f577be96e7497ab4fa16491a572bfd3f02c33f8af0ec3021eb")
    public override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.VpcLink = cdkBuilder.build()
  }

  public companion object {
    public open fun fromVpcLinkAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcLinkAttributes,
    ): IVpcLink =
        software.amazon.awscdk.services.apigatewayv2.VpcLink.fromVpcLinkAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VpcLinkAttributes::unwrap)).let(IVpcLink::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9e78863e3435398a013c3a0826c825227d2aed3794e9cb063278a04cc32533a")
    public open fun fromVpcLinkAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VpcLinkAttributes.Builder.() -> Unit,
    ): IVpcLink = fromVpcLinkAttributes(scope, id, VpcLinkAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLink): VpcLink =
        VpcLink(cdkObject)

    internal fun unwrap(wrapped: VpcLink): software.amazon.awscdk.services.apigatewayv2.VpcLink =
        wrapped.cdkObject
  }
}
