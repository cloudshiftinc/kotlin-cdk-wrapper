@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a Network Listener attached to a Load Balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ListenerCertificate listenerCertificate;
 * NetworkListenerAction networkListenerAction;
 * NetworkLoadBalancer networkLoadBalancer;
 * NetworkTargetGroup networkTargetGroup;
 * NetworkListenerProps networkListenerProps = NetworkListenerProps.builder()
 * .loadBalancer(networkLoadBalancer)
 * .port(123)
 * // the properties below are optional
 * .alpnPolicy(AlpnPolicy.HTTP1_ONLY)
 * .certificates(List.of(listenerCertificate))
 * .defaultAction(networkListenerAction)
 * .defaultTargetGroups(List.of(networkTargetGroup))
 * .protocol(Protocol.HTTP)
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .build();
 * ```
 */
public interface NetworkListenerProps : BaseNetworkListenerProps {
  /**
   * The load balancer to attach this listener to.
   */
  public fun loadBalancer(): INetworkLoadBalancer

  /**
   * A builder for [NetworkListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alpnPolicy Application-Layer Protocol Negotiation (ALPN) is a TLS extension that is
     * sent on the initial TLS handshake hello messages.
     * ALPN enables the application layer to negotiate which protocols should be used over a secure
     * connection, such as HTTP/1 and HTTP/2.
     *
     * Can only be specified together with Protocol TLS.
     */
    public fun alpnPolicy(alpnPolicy: AlpnPolicy)

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
     * This allows full control of the default Action of the load balancer,
     * including weighted forwarding. See the `NetworkListenerAction` class for
     * all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    public fun defaultAction(defaultAction: NetworkListenerAction)

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>)

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup)

    /**
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    public fun loadBalancer(loadBalancer: INetworkLoadBalancer)

    /**
     * @param port The port on which the listener listens for requests. 
     */
    public fun port(port: Number)

    /**
     * @param protocol Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP.
     */
    public fun protocol(protocol: Protocol)

    /**
     * @param sslPolicy SSL Policy.
     */
    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps.builder()

    /**
     * @param alpnPolicy Application-Layer Protocol Negotiation (ALPN) is a TLS extension that is
     * sent on the initial TLS handshake hello messages.
     * ALPN enables the application layer to negotiate which protocols should be used over a secure
     * connection, such as HTTP/1 and HTTP/2.
     *
     * Can only be specified together with Protocol TLS.
     */
    override fun alpnPolicy(alpnPolicy: AlpnPolicy) {
      cdkBuilder.alpnPolicy(alpnPolicy.let(AlpnPolicy::unwrap))
    }

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
     * This allows full control of the default Action of the load balancer,
     * including weighted forwarding. See the `NetworkListenerAction` class for
     * all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    override fun defaultAction(defaultAction: NetworkListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(NetworkListenerAction::unwrap))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    override fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(INetworkTargetGroup::unwrap))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    override fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    /**
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    override fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(INetworkLoadBalancer::unwrap))
    }

    /**
     * @param port The port on which the listener listens for requests. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP.
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    /**
     * @param sslPolicy SSL Policy.
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps,
  ) : CdkObject(cdkObject), NetworkListenerProps {
    /**
     * Application-Layer Protocol Negotiation (ALPN) is a TLS extension that is sent on the initial
     * TLS handshake hello messages.
     *
     * ALPN enables the application layer to negotiate which protocols should be used over a secure
     * connection, such as HTTP/1 and HTTP/2.
     *
     * Can only be specified together with Protocol TLS.
     *
     * Default: - None
     */
    override fun alpnPolicy(): AlpnPolicy? = unwrap(this).getAlpnPolicy()?.let(AlpnPolicy::wrap)

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
     * This allows full control of the default Action of the load balancer,
     * including weighted forwarding. See the `NetworkListenerAction` class for
     * all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     *
     * Default: - None.
     */
    override fun defaultAction(): NetworkListenerAction? =
        unwrap(this).getDefaultAction()?.let(NetworkListenerAction::wrap)

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
    override fun defaultTargetGroups(): List<INetworkTargetGroup> =
        unwrap(this).getDefaultTargetGroups()?.map(INetworkTargetGroup::wrap) ?: emptyList()

    /**
     * The load balancer to attach this listener to.
     */
    override fun loadBalancer(): INetworkLoadBalancer =
        unwrap(this).getLoadBalancer().let(INetworkLoadBalancer::wrap)

    /**
     * The port on which the listener listens for requests.
     */
    override fun port(): Number = unwrap(this).getPort()

    /**
     * Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP.
     *
     * Default: - TLS if certificates are provided. TCP otherwise.
     */
    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    /**
     * SSL Policy.
     *
     * Default: - Current predefined security policy.
     */
    override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps):
        NetworkListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
  }
}
