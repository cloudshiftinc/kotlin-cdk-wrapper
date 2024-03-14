package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpcLink internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.VpcLink,
) : Resource(cdkObject), IVpcLink {
  public open fun addTargets(targets: INetworkLoadBalancer) {
    unwrap(this).addTargets(targets.let(INetworkLoadBalancer::unwrap))
  }

  public override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()

  public interface Builder {
    public fun description(description: String)

    public fun targets(targets: List<INetworkLoadBalancer>)

    public fun vpcLinkName(vpcLinkName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.VpcLink.Builder =
        software.amazon.awscdk.services.apigateway.VpcLink.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun targets(targets: List<INetworkLoadBalancer>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancer::unwrap))
    }

    override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.VpcLink = cdkBuilder.build()
  }

  public companion object {
    public open fun fromVpcLinkId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      vpcLinkId: String,
    ): IVpcLink =
        software.amazon.awscdk.services.apigateway.VpcLink.fromVpcLinkId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, vpcLinkId).let(IVpcLink::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.VpcLink): VpcLink =
        VpcLink(cdkObject)

    internal fun unwrap(wrapped: VpcLink): software.amazon.awscdk.services.apigateway.VpcLink =
        wrapped.cdkObject
  }
}
