package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ApplicationLoadBalancerAttributes {
  public fun loadBalancerArn(): String

  public fun loadBalancerCanonicalHostedZoneId(): String? =
      unwrap(this).getLoadBalancerCanonicalHostedZoneId()

  public fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

  public fun securityGroupAllowsAllOutbound(): Boolean? =
      unwrap(this).getSecurityGroupAllowsAllOutbound()

  public fun securityGroupId(): String

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public interface Builder {
    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String)

    public fun loadBalancerDnsName(loadBalancerDnsName: String)

    public fun securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound: Boolean)

    public fun securityGroupId(securityGroupId: String)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes.builder()

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
      cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    override fun loadBalancerDnsName(loadBalancerDnsName: String) {
      cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    override fun securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound: Boolean) {
      cdkBuilder.securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound)
    }

    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes,
  ) : ApplicationLoadBalancerAttributes {
    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerCanonicalHostedZoneId(): String? =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    override fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

    override fun securityGroupAllowsAllOutbound(): Boolean? =
        unwrap(this).getSecurityGroupAllowsAllOutbound()

    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationLoadBalancerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes):
        ApplicationLoadBalancerAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerAttributes):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes =
        (wrapped as Wrapper).cdkObject
  }
}
