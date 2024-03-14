package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface NetworkListenerLookupOptions : BaseListenerLookupOptions {
  /**
   * Protocol of the listener port.
   *
   * Default: - listener is not filtered by protocol
   */
  public fun listenerProtocol(): Protocol? = unwrap(this).getListenerProtocol()?.let(Protocol::wrap)

  /**
   * A builder for [NetworkListenerLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listenerPort Filter listeners by listener port.
     */
    public fun listenerPort(listenerPort: Number)

    /**
     * @param listenerProtocol Protocol of the listener port.
     */
    public fun listenerProtocol(listenerProtocol: Protocol)

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
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions.builder()

    /**
     * @param listenerPort Filter listeners by listener port.
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * @param listenerProtocol Protocol of the listener port.
     */
    override fun listenerProtocol(listenerProtocol: Protocol) {
      cdkBuilder.listenerProtocol(listenerProtocol.let(Protocol::unwrap))
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
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions,
  ) : CdkObject(cdkObject), NetworkListenerLookupOptions {
    /**
     * Filter listeners by listener port.
     *
     * Default: - does not filter by listener port
     */
    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    /**
     * Protocol of the listener port.
     *
     * Default: - listener is not filtered by protocol
     */
    override fun listenerProtocol(): Protocol? =
        unwrap(this).getListenerProtocol()?.let(Protocol::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkListenerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions):
        NetworkListenerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions
  }
}
