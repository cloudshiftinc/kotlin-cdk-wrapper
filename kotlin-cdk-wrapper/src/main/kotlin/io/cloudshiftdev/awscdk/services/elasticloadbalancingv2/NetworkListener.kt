@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Network Listener.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration;
 * Vpc vpc = new Vpc(this, "VPC");
 * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "lb").vpc(vpc).build();
 * NetworkListener listener = lb.addListener("listener",
 * BaseNetworkListenerProps.builder().port(80).build());
 * listener.addTargets("target", AddNetworkTargetsProps.builder()
 * .port(80)
 * .build());
 * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
 * .defaultIntegration(new HttpNlbIntegration("DefaultIntegration", listener))
 * .build();
 * ```
 */
public open class NetworkListener(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener,
) : BaseListener(cdkObject),
    INetworkListener {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkListenerProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(NetworkListenerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkListenerProps.Builder.() -> Unit,
  ) : this(scope, id, NetworkListenerProps(props)
  )

  /**
   * Perform the given Action on incoming requests.
   *
   * This allows full control of the default Action of the load balancer,
   * including weighted forwarding. See the `NetworkListenerAction` class for
   * all options.
   *
   * @param _id 
   * @param props 
   */
  public open fun addAction(id: String, props: AddNetworkActionProps) {
    unwrap(this).addAction(id, props.let(AddNetworkActionProps.Companion::unwrap))
  }

  /**
   * Perform the given Action on incoming requests.
   *
   * This allows full control of the default Action of the load balancer,
   * including weighted forwarding. See the `NetworkListenerAction` class for
   * all options.
   *
   * @param _id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("036aa6d3ab6bc8c429ccb9ac7b967253290c5479fa6b86a60dd00debbb34dec3")
  public open fun addAction(id: String, props: AddNetworkActionProps.Builder.() -> Unit): Unit =
      addAction(id, AddNetworkActionProps(props))

  /**
   * Add one or more certificates to this listener.
   *
   * After the first certificate, this creates NetworkListenerCertificates
   * resources since cloudformation requires the certificates array on the
   * listener resource to have a length of 1.
   *
   * @param id 
   * @param certificates 
   */
  public open fun addCertificates(id: String, certificates: List<IListenerCertificate>) {
    unwrap(this).addCertificates(id, certificates.map(IListenerCertificate.Companion::unwrap))
  }

  /**
   * Load balance incoming requests to the given target groups.
   *
   * All target groups will be load balanced to with equal weight and without
   * stickiness. For a more complex configuration than that, use `addAction()`.
   *
   * @param _id 
   * @param targetGroups 
   */
  public open fun addTargetGroups(id: String, vararg targetGroups: INetworkTargetGroup) {
    unwrap(this).addTargetGroups(id, *targetGroups.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup}.toTypedArray())
  }

  /**
   * Load balance incoming requests to the given load balancing targets.
   *
   * This method implicitly creates a NetworkTargetGroup for the targets
   * involved, and a 'forward' action to route traffic to the given TargetGroup.
   *
   * If you want more control over the precise setup, create the TargetGroup
   * and use `addAction` yourself.
   *
   * It's possible to add conditions to the targets added in this way. At least
   * one set of targets must be added without conditions.
   *
   * @return The newly created target group
   * @param id 
   * @param props 
   */
  public open fun addTargets(id: String, props: AddNetworkTargetsProps): NetworkTargetGroup =
      unwrap(this).addTargets(id,
      props.let(AddNetworkTargetsProps.Companion::unwrap)).let(NetworkTargetGroup::wrap)

  /**
   * Load balance incoming requests to the given load balancing targets.
   *
   * This method implicitly creates a NetworkTargetGroup for the targets
   * involved, and a 'forward' action to route traffic to the given TargetGroup.
   *
   * If you want more control over the precise setup, create the TargetGroup
   * and use `addAction` yourself.
   *
   * It's possible to add conditions to the targets added in this way. At least
   * one set of targets must be added without conditions.
   *
   * @return The newly created target group
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41f0d55776f114fa246adc0a6dd8ab00cb0e063207a8f595e01583960d0dc3d3")
  public open fun addTargets(id: String, props: AddNetworkTargetsProps.Builder.() -> Unit):
      NetworkTargetGroup = addTargets(id, AddNetworkTargetsProps(props))

  /**
   * The load balancer this listener is attached to.
   */
  public open fun loadBalancer(): INetworkLoadBalancer =
      unwrap(this).getLoadBalancer().let(INetworkLoadBalancer::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkListener].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param alpnPolicy Application-Layer Protocol Negotiation (ALPN) is a TLS extension that is
     * sent on the initial TLS handshake hello messages. 
     */
    public fun alpnPolicy(alpnPolicy: AlpnPolicy)

    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    public fun certificates(certificates: List<IListenerCertificate>)

    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    public fun certificates(vararg certificates: IListenerCertificate)

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
     *
     * @param defaultAction Default action to take for requests to this listener. 
     */
    public fun defaultAction(defaultAction: NetworkListenerAction)

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    public fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>)

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    public fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup)

    /**
     * The load balancer to attach this listener to.
     *
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    public fun loadBalancer(loadBalancer: INetworkLoadBalancer)

    /**
     * The port on which the listener listens for requests.
     *
     * @param port The port on which the listener listens for requests. 
     */
    public fun port(port: Number)

    /**
     * Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP.
     *
     * Default: - TLS if certificates are provided. TCP otherwise.
     *
     * @param protocol Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP. 
     */
    public fun protocol(protocol: Protocol)

    /**
     * SSL Policy.
     *
     * Default: - Current predefined security policy.
     *
     * @param sslPolicy SSL Policy. 
     */
    public fun sslPolicy(sslPolicy: SslPolicy)

    /**
     * The load balancer TCP idle timeout.
     *
     * Default: Duration.seconds(350)
     *
     * @param tcpIdleTimeout The load balancer TCP idle timeout. 
     */
    public fun tcpIdleTimeout(tcpIdleTimeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.Builder.create(scope,
        id)

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
     *
     * @param alpnPolicy Application-Layer Protocol Negotiation (ALPN) is a TLS extension that is
     * sent on the initial TLS handshake hello messages. 
     */
    override fun alpnPolicy(alpnPolicy: AlpnPolicy) {
      cdkBuilder.alpnPolicy(alpnPolicy.let(AlpnPolicy.Companion::unwrap))
    }

    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate.Companion::unwrap))
    }

    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

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
     *
     * @param defaultAction Default action to take for requests to this listener. 
     */
    override fun defaultAction(defaultAction: NetworkListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(NetworkListenerAction.Companion::unwrap))
    }

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    override fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(INetworkTargetGroup.Companion::unwrap))
    }

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    override fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    /**
     * The load balancer to attach this listener to.
     *
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    override fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(INetworkLoadBalancer.Companion::unwrap))
    }

    /**
     * The port on which the listener listens for requests.
     *
     * @param port The port on which the listener listens for requests. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP.
     *
     * Default: - TLS if certificates are provided. TCP otherwise.
     *
     * @param protocol Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP. 
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
    }

    /**
     * SSL Policy.
     *
     * Default: - Current predefined security policy.
     *
     * @param sslPolicy SSL Policy. 
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy.Companion::unwrap))
    }

    /**
     * The load balancer TCP idle timeout.
     *
     * Default: Duration.seconds(350)
     *
     * @param tcpIdleTimeout The load balancer TCP idle timeout. 
     */
    override fun tcpIdleTimeout(tcpIdleTimeout: Duration) {
      cdkBuilder.tcpIdleTimeout(tcpIdleTimeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkListenerLookupOptions,
    ): INetworkListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.fromLookup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, options.let(NetworkListenerLookupOptions.Companion::unwrap)).let(INetworkListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abba836d5b64859eb292993f79e315fb864ac07f994e22ba71ba4c2aa5303a97")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkListenerLookupOptions.Builder.() -> Unit,
    ): INetworkListener = fromLookup(scope, id, NetworkListenerLookupOptions(options))

    public fun fromNetworkListenerArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      networkListenerArn: String,
    ): INetworkListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.fromNetworkListenerArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, networkListenerArn).let(INetworkListener::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkListener(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener):
        NetworkListener = NetworkListener(cdkObject)

    internal fun unwrap(wrapped: NetworkListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener = wrapped.cdkObject
        as software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
  }
}
