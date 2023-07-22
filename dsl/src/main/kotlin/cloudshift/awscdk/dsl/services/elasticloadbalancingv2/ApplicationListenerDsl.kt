@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
import software.constructs.Construct

@CdkDslMarker
public class ApplicationListenerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ApplicationListener.Builder = ApplicationListener.Builder.create(scope,
      id)

  private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

  private val _defaultTargetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

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
   * This allows full control of the default action of the load balancer,
   * including Action chaining, fixed responses and redirect responses.
   *
   * See the `ListenerAction` class for all options.
   *
   * Cannot be specified together with `defaultTargetGroups`.
   *
   * Default: - None.
   *
   * @param defaultAction Default action to take for requests to this listener. 
   */
  public fun defaultAction(defaultAction: ListenerAction) {
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
  public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup) {
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
  public fun defaultTargetGroups(defaultTargetGroups: Collection<IApplicationTargetGroup>) {
    _defaultTargetGroups.addAll(defaultTargetGroups)
  }

  /**
   * The load balancer to attach this listener to.
   *
   * @param loadBalancer The load balancer to attach this listener to. 
   */
  public fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
    cdkBuilder.loadBalancer(loadBalancer)
  }

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
   *
   * @param open Allow anyone to connect to the load balancer on the listener port. 
   */
  public fun `open`(`open`: Boolean) {
    cdkBuilder.`open`(`open`)
  }

  /**
   * The port on which the listener listens for requests.
   *
   * Default: - Determined from protocol if known.
   *
   * @param port The port on which the listener listens for requests. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * The protocol to use.
   *
   * Default: - Determined from port if known.
   *
   * @param protocol The protocol to use. 
   */
  public fun protocol(protocol: ApplicationProtocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * The security policy that defines which ciphers and protocols are supported.
   *
   * Default: - The current predefined security policy.
   *
   * @param sslPolicy The security policy that defines which ciphers and protocols are supported. 
   */
  public fun sslPolicy(sslPolicy: SslPolicy) {
    cdkBuilder.sslPolicy(sslPolicy)
  }

  public fun build(): ApplicationListener {
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    if(_defaultTargetGroups.isNotEmpty()) cdkBuilder.defaultTargetGroups(_defaultTargetGroups)
    return cdkBuilder.build()
  }
}
