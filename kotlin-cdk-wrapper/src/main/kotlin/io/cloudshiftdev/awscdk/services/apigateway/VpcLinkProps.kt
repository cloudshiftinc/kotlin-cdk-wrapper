@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpcLinkProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun targets(): List<INetworkLoadBalancer> =
      unwrap(this).getTargets()?.map(INetworkLoadBalancer::wrap) ?: emptyList()

  public fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun targets(targets: List<INetworkLoadBalancer>)

    public fun targets(vararg targets: INetworkLoadBalancer)

    public fun vpcLinkName(vpcLinkName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.VpcLinkProps.Builder =
        software.amazon.awscdk.services.apigateway.VpcLinkProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun targets(targets: List<INetworkLoadBalancer>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancer::unwrap))
    }

    override fun targets(vararg targets: INetworkLoadBalancer): Unit = targets(targets.toList())

    override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.VpcLinkProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.VpcLinkProps,
  ) : CdkObject(cdkObject), VpcLinkProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun targets(): List<INetworkLoadBalancer> =
        unwrap(this).getTargets()?.map(INetworkLoadBalancer::wrap) ?: emptyList()

    override fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.VpcLinkProps):
        VpcLinkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLinkProps):
        software.amazon.awscdk.services.apigateway.VpcLinkProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.VpcLinkProps
  }
}
