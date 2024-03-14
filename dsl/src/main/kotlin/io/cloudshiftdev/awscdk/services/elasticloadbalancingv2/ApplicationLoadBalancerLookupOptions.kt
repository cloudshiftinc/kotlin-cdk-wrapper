package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ApplicationLoadBalancerLookupOptions : BaseLoadBalancerLookupOptions {
  /**
   * A builder for [ApplicationLoadBalancerLookupOptions]
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
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions.builder()

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
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions,
  ) : ApplicationLoadBalancerLookupOptions {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationLoadBalancerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions):
        ApplicationLoadBalancerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions
        = (wrapped as Wrapper).cdkObject
  }
}
