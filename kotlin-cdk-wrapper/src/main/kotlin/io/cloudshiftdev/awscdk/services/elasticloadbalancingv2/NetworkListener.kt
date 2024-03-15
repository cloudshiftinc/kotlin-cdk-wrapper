@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
 * Vpc vpc;
 * AutoScalingGroup asg;
 * ISecurityGroup sg1;
 * ISecurityGroup sg2;
 * // Create the load balancer in a VPC. 'internetFacing' is 'false'
 * // by default, which creates an internal load balancer.
 * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .securityGroups(List.of(sg1))
 * .build();
 * lb.addSecurityGroup(sg2);
 * // Add a listener on a particular port.
 * NetworkListener listener = lb.addListener("Listener", BaseNetworkListenerProps.builder()
 * .port(443)
 * .build());
 * // Add targets on a particular port.
 * listener.addTargets("AppFleet", AddNetworkTargetsProps.builder()
 * .port(443)
 * .targets(List.of(asg))
 * .build());
 * ```
 */
public open class NetworkListener internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener,
) : BaseListener(cdkObject), INetworkListener {
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
  public open fun addAction(_id: String, props: AddNetworkActionProps) {
    unwrap(this).addAction(_id, props.let(AddNetworkActionProps::unwrap))
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
  public open fun addAction(_id: String, props: AddNetworkActionProps.Builder.() -> Unit): Unit =
      addAction(_id, AddNetworkActionProps(props))

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
    unwrap(this).addCertificates(id, certificates.map(IListenerCertificate::unwrap))
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
  public open fun addTargetGroups(_id: String, targetGroups: INetworkTargetGroup) {
    unwrap(this).addTargetGroups(_id, targetGroups.let(INetworkTargetGroup::unwrap))
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
      props.let(AddNetworkTargetsProps::unwrap)).let(NetworkTargetGroup::wrap)

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
      cdkBuilder.alpnPolicy(alpnPolicy.let(AlpnPolicy::unwrap))
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
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
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
      cdkBuilder.defaultAction(defaultAction.let(NetworkListenerAction::unwrap))
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
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(INetworkTargetGroup::unwrap))
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
      cdkBuilder.loadBalancer(loadBalancer.let(INetworkLoadBalancer::unwrap))
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
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    /**
     * SSL Policy.
     *
     * Default: - Current predefined security policy.
     *
     * @param sslPolicy SSL Policy. 
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
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
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(NetworkListenerLookupOptions::unwrap)).let(INetworkListener::wrap)

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
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.fromNetworkListenerArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
  }
}
