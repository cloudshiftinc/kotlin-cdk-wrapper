@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options for ApplicationListener lookup.
 *
 * Example:
 *
 * ```
 * IApplicationListener listener = ApplicationListener.fromLookup(this, "ALBListener",
 * ApplicationListenerLookupOptions.builder()
 * .loadBalancerArn("arn:aws:elasticloadbalancing:us-east-2:123456789012:loadbalancer/app/my-load-balancer/1234567890123456")
 * .listenerProtocol(ApplicationProtocol.HTTPS)
 * .listenerPort(443)
 * .build());
 * ```
 */
public interface ApplicationListenerLookupOptions : BaseListenerLookupOptions {
  /**
   * ARN of the listener to look up.
   *
   * Default: - does not filter by listener arn
   */
  public fun listenerArn(): String? = unwrap(this).getListenerArn()

  /**
   * Filter listeners by listener protocol.
   *
   * Default: - does not filter by listener protocol
   */
  public fun listenerProtocol(): ApplicationProtocol? =
      unwrap(this).getListenerProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * A builder for [ApplicationListenerLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listenerArn ARN of the listener to look up.
     */
    public fun listenerArn(listenerArn: String)

    /**
     * @param listenerPort Filter listeners by listener port.
     */
    public fun listenerPort(listenerPort: Number)

    /**
     * @param listenerProtocol Filter listeners by listener protocol.
     */
    public fun listenerProtocol(listenerProtocol: ApplicationProtocol)

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
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions.builder()

    /**
     * @param listenerArn ARN of the listener to look up.
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * @param listenerPort Filter listeners by listener port.
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * @param listenerProtocol Filter listeners by listener protocol.
     */
    override fun listenerProtocol(listenerProtocol: ApplicationProtocol) {
      cdkBuilder.listenerProtocol(listenerProtocol.let(ApplicationProtocol::unwrap))
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
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions,
  ) : CdkObject(cdkObject), ApplicationListenerLookupOptions {
    /**
     * ARN of the listener to look up.
     *
     * Default: - does not filter by listener arn
     */
    override fun listenerArn(): String? = unwrap(this).getListenerArn()

    /**
     * Filter listeners by listener port.
     *
     * Default: - does not filter by listener port
     */
    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    /**
     * Filter listeners by listener protocol.
     *
     * Default: - does not filter by listener protocol
     */
    override fun listenerProtocol(): ApplicationProtocol? =
        unwrap(this).getListenerProtocol()?.let(ApplicationProtocol::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationListenerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions):
        ApplicationListenerLookupOptions = CdkObjectWrappers.wrap(cdkObject) as
        ApplicationListenerLookupOptions

    internal fun unwrap(wrapped: ApplicationListenerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions
  }
}
