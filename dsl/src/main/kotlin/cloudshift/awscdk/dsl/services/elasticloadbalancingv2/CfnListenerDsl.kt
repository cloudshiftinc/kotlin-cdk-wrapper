@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.constructs.Construct

@CdkDslMarker
public class CfnListenerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnListener.Builder = CfnListener.Builder.create(scope, id)

  private val _alpnPolicy: MutableList<String> = mutableListOf()

  private val _certificates: MutableList<Any> = mutableListOf()

  private val _defaultActions: MutableList<Any> = mutableListOf()

  /**
   * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
   * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN)
   * policy. 
   */
  public fun alpnPolicy(vararg alpnPolicy: String) {
    _alpnPolicy.addAll(listOf(*alpnPolicy))
  }

  /**
   * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
   * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN)
   * policy. 
   */
  public fun alpnPolicy(alpnPolicy: Collection<String>) {
    _alpnPolicy.addAll(alpnPolicy)
  }

  /**
   * The default SSL server certificate for a secure listener.
   *
   * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
   *
   * To create a certificate list for a secure listener, use
   * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
   * @param certificates The default SSL server certificate for a secure listener. 
   */
  public fun certificates(vararg certificates: Any) {
    _certificates.addAll(listOf(*certificates))
  }

  /**
   * The default SSL server certificate for a secure listener.
   *
   * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
   *
   * To create a certificate list for a secure listener, use
   * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
   * @param certificates The default SSL server certificate for a secure listener. 
   */
  public fun certificates(certificates: Collection<Any>) {
    _certificates.addAll(certificates)
  }

  /**
   * The default SSL server certificate for a secure listener.
   *
   * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
   *
   * To create a certificate list for a secure listener, use
   * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
   * @param certificates The default SSL server certificate for a secure listener. 
   */
  public fun certificates(certificates: IResolvable) {
    cdkBuilder.certificates(certificates)
  }

  /**
   * The actions for the default rule. You cannot define a condition for a default rule.
   *
   * To create additional rules for an Application Load Balancer, use
   * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
   * @param defaultActions The actions for the default rule. You cannot define a condition for a
   * default rule. 
   */
  public fun defaultActions(vararg defaultActions: Any) {
    _defaultActions.addAll(listOf(*defaultActions))
  }

  /**
   * The actions for the default rule. You cannot define a condition for a default rule.
   *
   * To create additional rules for an Application Load Balancer, use
   * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
   * @param defaultActions The actions for the default rule. You cannot define a condition for a
   * default rule. 
   */
  public fun defaultActions(defaultActions: Collection<Any>) {
    _defaultActions.addAll(defaultActions)
  }

  /**
   * The actions for the default rule. You cannot define a condition for a default rule.
   *
   * To create additional rules for an Application Load Balancer, use
   * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
   * @param defaultActions The actions for the default rule. You cannot define a condition for a
   * default rule. 
   */
  public fun defaultActions(defaultActions: IResolvable) {
    cdkBuilder.defaultActions(defaultActions)
  }

  /**
   * The Amazon Resource Name (ARN) of the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
   * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer. 
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * The port on which the load balancer is listening.
   *
   * You cannot specify a port for a Gateway Load Balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
   * @param port The port on which the load balancer is listening. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * The protocol for connections from clients to the load balancer.
   *
   * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
   * Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or
   * TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
   * Balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
   * @param protocol The protocol for connections from clients to the load balancer. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are
   * supported.
   *
   * For more information, see [Security
   * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)
   * in the *Application Load Balancers Guide* and [Security
   * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies)
   * in the *Network Load Balancers Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy)
   * @param sslPolicy [HTTPS and TLS listeners] The security policy that defines which protocols and
   * ciphers are supported. 
   */
  public fun sslPolicy(sslPolicy: String) {
    cdkBuilder.sslPolicy(sslPolicy)
  }

  public fun build(): CfnListener {
    if(_alpnPolicy.isNotEmpty()) cdkBuilder.alpnPolicy(_alpnPolicy)
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    if(_defaultActions.isNotEmpty()) cdkBuilder.defaultActions(_defaultActions)
    return cdkBuilder.build()
  }
}
