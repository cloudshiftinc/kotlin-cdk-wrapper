@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
import software.constructs.Construct

/**
 * Define a Network Listener.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.apigatewayv2.integrations.alpha.HttpNlbIntegration;
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
@CdkDslMarker
public class NetworkListenerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NetworkListener.Builder = NetworkListener.Builder.create(scope, id)

  private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

  private val _defaultTargetGroups: MutableList<INetworkTargetGroup> = mutableListOf()

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
   * @param alpnPolicy Application-Layer Protocol Negotiation (ALPN) is a TLS extension that is sent
   * on the initial TLS handshake hello messages. 
   */
  public fun alpnPolicy(alpnPolicy: AlpnPolicy) {
    cdkBuilder.alpnPolicy(alpnPolicy)
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
  public fun certificates(vararg certificates: IListenerCertificate) {
    _certificates.addAll(listOf(*certificates))
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
  public fun certificates(certificates: Collection<IListenerCertificate>) {
    _certificates.addAll(certificates)
  }

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
  public fun defaultAction(defaultAction: NetworkListenerAction) {
    cdkBuilder.defaultAction(defaultAction)
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
  public fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup) {
    _defaultTargetGroups.addAll(listOf(*defaultTargetGroups))
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
  public fun defaultTargetGroups(defaultTargetGroups: Collection<INetworkTargetGroup>) {
    _defaultTargetGroups.addAll(defaultTargetGroups)
  }

  /**
   * The load balancer to attach this listener to.
   *
   * @param loadBalancer The load balancer to attach this listener to. 
   */
  public fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
    cdkBuilder.loadBalancer(loadBalancer)
  }

  /**
   * The port on which the listener listens for requests.
   *
   * @param port The port on which the listener listens for requests. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP.
   *
   * Default: - TLS if certificates are provided. TCP otherwise.
   *
   * @param protocol Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP. 
   */
  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * SSL Policy.
   *
   * Default: - Current predefined security policy.
   *
   * @param sslPolicy SSL Policy. 
   */
  public fun sslPolicy(sslPolicy: SslPolicy) {
    cdkBuilder.sslPolicy(sslPolicy)
  }

  public fun build(): NetworkListener {
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    if(_defaultTargetGroups.isNotEmpty()) cdkBuilder.defaultTargetGroups(_defaultTargetGroups)
    return cdkBuilder.build()
  }
}
