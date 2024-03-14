package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BaseLoadBalancerLookupOptions {
  /**
   * Find by load balancer's ARN.
   *
   * Default: - does not search by load balancer arn
   */
  public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

  /**
   * Match load balancer tags.
   *
   * Default: - does not match load balancers by tags
   */
  public fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
      emptyMap()

  /**
   * A builder for [BaseLoadBalancerLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loadBalancerArn Find by load balancer's ARN.
     */
    public fun loadBalancerArn(loadBalancerArn: String)

    /**
     * @param loadBalancerTags Match load balancer tags.
     */
    public fun loadBalancerTags(loadBalancerTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions.builder()

    /**
     * @param loadBalancerArn Find by load balancer's ARN.
     */
    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /**
     * @param loadBalancerTags Match load balancer tags.
     */
    override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions,
  ) : CdkObject(cdkObject), BaseLoadBalancerLookupOptions {
    /**
     * Find by load balancer's ARN.
     *
     * Default: - does not search by load balancer arn
     */
    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    /**
     * Match load balancer tags.
     *
     * Default: - does not match load balancers by tags
     */
    override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseLoadBalancerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions):
        BaseLoadBalancerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseLoadBalancerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions
  }
}