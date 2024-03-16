@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Properties for a redirection config.
 *
 * Example:
 *
 * ```
 * ApplicationLoadBalancer lb;
 * lb.addRedirect(ApplicationLoadBalancerRedirectConfig.builder()
 * .sourceProtocol(ApplicationProtocol.HTTPS)
 * .sourcePort(8443)
 * .targetProtocol(ApplicationProtocol.HTTP)
 * .targetPort(8080)
 * .build());
 * ```
 */
public interface ApplicationLoadBalancerRedirectConfig {
  /**
   * Allow anyone to connect to this listener.
   *
   * If this is specified, the listener will be opened up to anyone who can reach it.
   * For internal load balancers this is anyone in the same VPC. For public load
   * balancers, this is anyone on the internet.
   *
   * If you want to be more selective about who can access this load
   * balancer, set this to `false` and use the listener's `connections`
   * object to selectively grant access to the listener.
   *
   * Default: true
   */
  public fun `open`(): Boolean? = unwrap(this).getOpen()

  /**
   * The port number to listen to.
   *
   * Default: 80
   */
  public fun sourcePort(): Number? = unwrap(this).getSourcePort()

  /**
   * The protocol of the listener being created.
   *
   * Default: HTTP
   */
  public fun sourceProtocol(): ApplicationProtocol? =
      unwrap(this).getSourceProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * The port number to redirect to.
   *
   * Default: 443
   */
  public fun targetPort(): Number? = unwrap(this).getTargetPort()

  /**
   * The protocol of the redirection target.
   *
   * Default: HTTPS
   */
  public fun targetProtocol(): ApplicationProtocol? =
      unwrap(this).getTargetProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * A builder for [ApplicationLoadBalancerRedirectConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param open Allow anyone to connect to this listener.
     * If this is specified, the listener will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the listener.
     */
    public fun `open`(`open`: Boolean)

    /**
     * @param sourcePort The port number to listen to.
     */
    public fun sourcePort(sourcePort: Number)

    /**
     * @param sourceProtocol The protocol of the listener being created.
     */
    public fun sourceProtocol(sourceProtocol: ApplicationProtocol)

    /**
     * @param targetPort The port number to redirect to.
     */
    public fun targetPort(targetPort: Number)

    /**
     * @param targetProtocol The protocol of the redirection target.
     */
    public fun targetProtocol(targetProtocol: ApplicationProtocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig.builder()

    /**
     * @param open Allow anyone to connect to this listener.
     * If this is specified, the listener will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the listener.
     */
    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    /**
     * @param sourcePort The port number to listen to.
     */
    override fun sourcePort(sourcePort: Number) {
      cdkBuilder.sourcePort(sourcePort)
    }

    /**
     * @param sourceProtocol The protocol of the listener being created.
     */
    override fun sourceProtocol(sourceProtocol: ApplicationProtocol) {
      cdkBuilder.sourceProtocol(sourceProtocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * @param targetPort The port number to redirect to.
     */
    override fun targetPort(targetPort: Number) {
      cdkBuilder.targetPort(targetPort)
    }

    /**
     * @param targetProtocol The protocol of the redirection target.
     */
    override fun targetProtocol(targetProtocol: ApplicationProtocol) {
      cdkBuilder.targetProtocol(targetProtocol.let(ApplicationProtocol::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig,
  ) : CdkObject(cdkObject), ApplicationLoadBalancerRedirectConfig {
    /**
     * Allow anyone to connect to this listener.
     *
     * If this is specified, the listener will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the listener.
     *
     * Default: true
     */
    override fun `open`(): Boolean? = unwrap(this).getOpen()

    /**
     * The port number to listen to.
     *
     * Default: 80
     */
    override fun sourcePort(): Number? = unwrap(this).getSourcePort()

    /**
     * The protocol of the listener being created.
     *
     * Default: HTTP
     */
    override fun sourceProtocol(): ApplicationProtocol? =
        unwrap(this).getSourceProtocol()?.let(ApplicationProtocol::wrap)

    /**
     * The port number to redirect to.
     *
     * Default: 443
     */
    override fun targetPort(): Number? = unwrap(this).getTargetPort()

    /**
     * The protocol of the redirection target.
     *
     * Default: HTTPS
     */
    override fun targetProtocol(): ApplicationProtocol? =
        unwrap(this).getTargetProtocol()?.let(ApplicationProtocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationLoadBalancerRedirectConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig):
        ApplicationLoadBalancerRedirectConfig = CdkObjectWrappers.wrap(cdkObject) as
        ApplicationLoadBalancerRedirectConfig

    internal fun unwrap(wrapped: ApplicationLoadBalancerRedirectConfig):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
  }
}
