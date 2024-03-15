@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String)

    public fun loadBalancerDnsName(loadBalancerDnsName: String)

    public fun loadBalancerSecurityGroups(loadBalancerSecurityGroups: List<String>)

    public fun loadBalancerSecurityGroups(vararg loadBalancerSecurityGroups: String)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.builder()

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
      cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    override fun loadBalancerDnsName(loadBalancerDnsName: String) {
      cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    override fun loadBalancerSecurityGroups(loadBalancerSecurityGroups: List<String>) {
      cdkBuilder.loadBalancerSecurityGroups(loadBalancerSecurityGroups)
    }

    override fun loadBalancerSecurityGroups(vararg loadBalancerSecurityGroups: String): Unit =
        loadBalancerSecurityGroups(loadBalancerSecurityGroups.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes,
  ) : CdkObject(cdkObject), NetworkLoadBalancerAttributes {
    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerCanonicalHostedZoneId(): String? =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    override fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

    override fun loadBalancerSecurityGroups(): List<String> =
        unwrap(this).getLoadBalancerSecurityGroups() ?: emptyList()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes):
        NetworkLoadBalancerAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerAttributes):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes
  }
}
