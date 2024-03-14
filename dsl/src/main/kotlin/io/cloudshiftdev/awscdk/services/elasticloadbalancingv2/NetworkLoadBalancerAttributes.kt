package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NetworkLoadBalancerAttributes {
  /**
   * ARN of the load balancer.
   */
  public fun loadBalancerArn(): String

  /**
   * The canonical hosted zone ID of this load balancer.
   *
   * Default: - When not provided, LB cannot be used as Route53 Alias target.
   */
  public fun loadBalancerCanonicalHostedZoneId(): String? =
      unwrap(this).getLoadBalancerCanonicalHostedZoneId()

  /**
   * The DNS name of this load balancer.
   *
   * Default: - When not provided, LB cannot be used as Route53 Alias target.
   */
  public fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

  /**
   * Security groups to associate with this load balancer.
   *
   * Default: - No security groups associated with the load balancer.
   */
  public fun loadBalancerSecurityGroups(): List<String> =
      unwrap(this).getLoadBalancerSecurityGroups() ?: emptyList()

  /**
   * The VPC to associate with the load balancer.
   *
   * Default: - When not provided, listeners cannot be created on imported load
   * balancers.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [NetworkLoadBalancerAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loadBalancerArn ARN of the load balancer. 
     */
    public fun loadBalancerArn(loadBalancerArn: String)

    /**
     * @param loadBalancerCanonicalHostedZoneId The canonical hosted zone ID of this load balancer.
     */
    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String)

    /**
     * @param loadBalancerDnsName The DNS name of this load balancer.
     */
    public fun loadBalancerDnsName(loadBalancerDnsName: String)

    /**
     * @param loadBalancerSecurityGroups Security groups to associate with this load balancer.
     */
    public fun loadBalancerSecurityGroups(loadBalancerSecurityGroups: List<String>)

    /**
     * @param loadBalancerSecurityGroups Security groups to associate with this load balancer.
     */
    public fun loadBalancerSecurityGroups(vararg loadBalancerSecurityGroups: String)

    /**
     * @param vpc The VPC to associate with the load balancer.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.builder()

    /**
     * @param loadBalancerArn ARN of the load balancer. 
     */
    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /**
     * @param loadBalancerCanonicalHostedZoneId The canonical hosted zone ID of this load balancer.
     */
    override fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
      cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    /**
     * @param loadBalancerDnsName The DNS name of this load balancer.
     */
    override fun loadBalancerDnsName(loadBalancerDnsName: String) {
      cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    /**
     * @param loadBalancerSecurityGroups Security groups to associate with this load balancer.
     */
    override fun loadBalancerSecurityGroups(loadBalancerSecurityGroups: List<String>) {
      cdkBuilder.loadBalancerSecurityGroups(loadBalancerSecurityGroups)
    }

    /**
     * @param loadBalancerSecurityGroups Security groups to associate with this load balancer.
     */
    override fun loadBalancerSecurityGroups(vararg loadBalancerSecurityGroups: String): Unit =
        loadBalancerSecurityGroups(loadBalancerSecurityGroups.toList())

    /**
     * @param vpc The VPC to associate with the load balancer.
     */
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
    /**
     * ARN of the load balancer.
     */
    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    /**
     * The canonical hosted zone ID of this load balancer.
     *
     * Default: - When not provided, LB cannot be used as Route53 Alias target.
     */
    override fun loadBalancerCanonicalHostedZoneId(): String? =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    /**
     * The DNS name of this load balancer.
     *
     * Default: - When not provided, LB cannot be used as Route53 Alias target.
     */
    override fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

    /**
     * Security groups to associate with this load balancer.
     *
     * Default: - No security groups associated with the load balancer.
     */
    override fun loadBalancerSecurityGroups(): List<String> =
        unwrap(this).getLoadBalancerSecurityGroups() ?: emptyList()

    /**
     * The VPC to associate with the load balancer.
     *
     * Default: - When not provided, listeners cannot be created on imported load
     * balancers.
     */
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
