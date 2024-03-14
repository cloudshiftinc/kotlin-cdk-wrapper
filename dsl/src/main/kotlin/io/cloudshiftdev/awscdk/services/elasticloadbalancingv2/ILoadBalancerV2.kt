package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ILoadBalancerV2 : IResource {
  public fun loadBalancerCanonicalHostedZoneId(): String

  public fun loadBalancerDnsName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2,
  ) : ILoadBalancerV2 {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun loadBalancerCanonicalHostedZoneId(): String =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2):
        ILoadBalancerV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILoadBalancerV2):
        software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2 = (wrapped as
        Wrapper).cdkObject
  }
}
