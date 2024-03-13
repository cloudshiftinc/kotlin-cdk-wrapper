package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NetworkLoadBalancerAttributes {
  public fun loadBalancerArn(): String

  public fun loadBalancerCanonicalHostedZoneId(): String? =
      unwrap(this).getLoadBalancerCanonicalHostedZoneId()

  public fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

  public fun loadBalancerSecurityGroups(): List<String> =
      unwrap(this).getLoadBalancerSecurityGroups() ?: emptyList()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public interface Builder {
    public fun loadBalancerArn(loadBalancerArn: String) {
    }

    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
    }

    public fun loadBalancerDnsName(loadBalancerDnsName: String) {
    }

    public fun loadBalancerSecurityGroups(loadBalancerSecurityGroups: List<String>) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.builder()

    public override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public override
        fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
      cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    public override fun loadBalancerDnsName(loadBalancerDnsName: String) {
      cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    public override fun loadBalancerSecurityGroups(loadBalancerSecurityGroups: List<String>) {
      cdkBuilder.loadBalancerSecurityGroups(loadBalancerSecurityGroups)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes,
  ) : NetworkLoadBalancerAttributes {
    public override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    public override fun loadBalancerCanonicalHostedZoneId(): String? =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    public override fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

    public override fun loadBalancerSecurityGroups(): List<String> =
        unwrap(this).getLoadBalancerSecurityGroups() ?: emptyList()

    public override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes):
        NetworkLoadBalancerAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerAttributes):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes =
        (wrapped as Wrapper).cdkObject
  }
}
