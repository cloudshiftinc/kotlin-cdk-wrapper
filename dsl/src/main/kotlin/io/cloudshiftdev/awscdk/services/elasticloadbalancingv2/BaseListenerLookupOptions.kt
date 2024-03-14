package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BaseListenerLookupOptions {
  /**
   * Filter listeners by listener port.
   *
   * Default: - does not filter by listener port
   */
  public fun listenerPort(): Number? = unwrap(this).getListenerPort()

  /**
   * Filter listeners by associated load balancer arn.
   *
   * Default: - does not filter by load balancer arn
   */
  public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

  /**
   * Filter listeners by associated load balancer tags.
   *
   * Default: - does not filter by load balancer tags
   */
  public fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
      emptyMap()

  /**
   * A builder for [BaseListenerLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listenerPort Filter listeners by listener port.
     */
    public fun listenerPort(listenerPort: Number)

    /**
     * @param loadBalancerArn Filter listeners by associated load balancer arn.
     */
    public fun loadBalancerArn(loadBalancerArn: String)

    /**
     * @param loadBalancerTags Filter listeners by associated load balancer tags.
     */
    public fun loadBalancerTags(loadBalancerTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions.builder()

    /**
     * @param listenerPort Filter listeners by listener port.
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * @param loadBalancerArn Filter listeners by associated load balancer arn.
     */
    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /**
     * @param loadBalancerTags Filter listeners by associated load balancer tags.
     */
    override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions,
  ) : CdkObject(cdkObject), BaseListenerLookupOptions {
    /**
     * Filter listeners by listener port.
     *
     * Default: - does not filter by listener port
     */
    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    /**
     * Filter listeners by associated load balancer arn.
     *
     * Default: - does not filter by load balancer arn
     */
    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    /**
     * Filter listeners by associated load balancer tags.
     *
     * Default: - does not filter by load balancer tags
     */
    override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseListenerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions):
        BaseListenerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseListenerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions
  }
}
