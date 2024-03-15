@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a standalone ApplicationListener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationLoadBalancer applicationLoadBalancer;
 * ApplicationTargetGroup applicationTargetGroup;
 * ListenerAction listenerAction;
 * ListenerCertificate listenerCertificate;
 * ApplicationListenerProps applicationListenerProps = ApplicationListenerProps.builder()
 * .loadBalancer(applicationLoadBalancer)
 * // the properties below are optional
 * .certificates(List.of(listenerCertificate))
 * .defaultAction(listenerAction)
 * .defaultTargetGroups(List.of(applicationTargetGroup))
 * .open(false)
 * .port(123)
 * .protocol(ApplicationProtocol.HTTP)
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .build();
 * ```
 */
public interface ApplicationListenerProps : BaseApplicationListenerProps {
  /**
   * The load balancer to attach this listener to.
   */
  public fun loadBalancer(): IApplicationLoadBalancer

  /**
   * A builder for [ApplicationListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    public fun certificates(certificates: List<IListenerCertificate>)

    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    public fun certificates(vararg certificates: IListenerCertificate)

    /**
     * @param defaultAction Default action to take for requests to this listener.
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses.
     *
     * See the `ListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    public fun defaultAction(defaultAction: ListenerAction)

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>)

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup)

    /**
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer)

    /**
     * @param open Allow anyone to connect to the load balancer on the listener port.
     * If this is specified, the load balancer will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the load balancer on the listener port.
     */
    public fun `open`(`open`: Boolean)

    /**
     * @param port The port on which the listener listens for requests.
     */
    public fun port(port: Number)

    /**
     * @param protocol The protocol to use.
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported.
     */
    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps.builder()

    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

    /**
     * @param defaultAction Default action to take for requests to this listener.
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses.
     *
     * See the `ListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    override fun defaultAction(defaultAction: ListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(ListenerAction::unwrap))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    override fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(IApplicationTargetGroup::unwrap))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    override fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    /**
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    override fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer::unwrap))
    }

    /**
     * @param open Allow anyone to connect to the load balancer on the listener port.
     * If this is specified, the load balancer will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the load balancer on the listener port.
     */
    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    /**
     * @param port The port on which the listener listens for requests.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol to use.
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported.
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps,
  ) : CdkObject(cdkObject), ApplicationListenerProps {
    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     */
    override fun certificates(): List<IListenerCertificate> =
        unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

    /**
     * Default action to take for requests to this listener.
     *
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses.
     *
     * See the `ListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     *
     * Default: - None.
     */
    override fun defaultAction(): ListenerAction? =
        unwrap(this).getDefaultAction()?.let(ListenerAction::wrap)

    /**
     * Default target groups to load balance to.
     *
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     *
     * Default: - None.
     */
    override fun defaultTargetGroups(): List<IApplicationTargetGroup> =
        unwrap(this).getDefaultTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()

    /**
     * The load balancer to attach this listener to.
     */
    override fun loadBalancer(): IApplicationLoadBalancer =
        unwrap(this).getLoadBalancer().let(IApplicationLoadBalancer::wrap)

    /**
     * Allow anyone to connect to the load balancer on the listener port.
     *
     * If this is specified, the load balancer will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the load balancer on the listener port.
     *
     * Default: true
     */
    override fun `open`(): Boolean? = unwrap(this).getOpen()

    /**
     * The port on which the listener listens for requests.
     *
     * Default: - Determined from protocol if known.
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol to use.
     *
     * Default: - Determined from port if known.
     */
    override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    /**
     * The security policy that defines which ciphers and protocols are supported.
     *
     * Default: - The current predefined security policy.
     */
    override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps):
        ApplicationListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps
  }
}
