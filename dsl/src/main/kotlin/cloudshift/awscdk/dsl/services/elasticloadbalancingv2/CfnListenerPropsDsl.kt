@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps

@CdkDslMarker
public class CfnListenerPropsDsl {
  private val cdkBuilder: CfnListenerProps.Builder = CfnListenerProps.builder()

  private val _alpnPolicy: MutableList<String> = mutableListOf()

  private val _certificates: MutableList<Any> = mutableListOf()

  private val _defaultActions: MutableList<Any> = mutableListOf()

  /**
   * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN)
   * policy.
   */
  public fun alpnPolicy(vararg alpnPolicy: String) {
    _alpnPolicy.addAll(listOf(*alpnPolicy))
  }

  /**
   * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN)
   * policy.
   */
  public fun alpnPolicy(alpnPolicy: Collection<String>) {
    _alpnPolicy.addAll(alpnPolicy)
  }

  /**
   * @param certificates The default SSL server certificate for a secure listener.
   * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
   *
   * To create a certificate list for a secure listener, use
   * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
   * .
   */
  public fun certificates(vararg certificates: Any) {
    _certificates.addAll(listOf(*certificates))
  }

  /**
   * @param certificates The default SSL server certificate for a secure listener.
   * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
   *
   * To create a certificate list for a secure listener, use
   * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
   * .
   */
  public fun certificates(certificates: Collection<Any>) {
    _certificates.addAll(certificates)
  }

  /**
   * @param certificates The default SSL server certificate for a secure listener.
   * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
   *
   * To create a certificate list for a secure listener, use
   * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
   * .
   */
  public fun certificates(certificates: IResolvable) {
    cdkBuilder.certificates(certificates)
  }

  /**
   * @param defaultActions The actions for the default rule. You cannot define a condition for a
   * default rule. 
   * To create additional rules for an Application Load Balancer, use
   * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
   * .
   */
  public fun defaultActions(vararg defaultActions: Any) {
    _defaultActions.addAll(listOf(*defaultActions))
  }

  /**
   * @param defaultActions The actions for the default rule. You cannot define a condition for a
   * default rule. 
   * To create additional rules for an Application Load Balancer, use
   * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
   * .
   */
  public fun defaultActions(defaultActions: Collection<Any>) {
    _defaultActions.addAll(defaultActions)
  }

  /**
   * @param defaultActions The actions for the default rule. You cannot define a condition for a
   * default rule. 
   * To create additional rules for an Application Load Balancer, use
   * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
   * .
   */
  public fun defaultActions(defaultActions: IResolvable) {
    cdkBuilder.defaultActions(defaultActions)
  }

  /**
   * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer. 
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * @param port The port on which the load balancer is listening.
   * You cannot specify a port for a Gateway Load Balancer.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol for connections from clients to the load balancer.
   * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
   * Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or
   * TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
   * Balancer.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param sslPolicy [HTTPS and TLS listeners] The security policy that defines which protocols and
   * ciphers are supported.
   * For more information, see [Security
   * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)
   * in the *Application Load Balancers Guide* and [Security
   * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies)
   * in the *Network Load Balancers Guide* .
   */
  public fun sslPolicy(sslPolicy: String) {
    cdkBuilder.sslPolicy(sslPolicy)
  }

  public fun build(): CfnListenerProps {
    if(_alpnPolicy.isNotEmpty()) cdkBuilder.alpnPolicy(_alpnPolicy)
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    if(_defaultActions.isNotEmpty()) cdkBuilder.defaultActions(_defaultActions)
    return cdkBuilder.build()
  }
}
