@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnListener`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnListenerProps cfnListenerProps = CfnListenerProps.builder()
 * .defaultActions(List.of(ActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
 * .userPoolArn("userPoolArn")
 * .userPoolClientId("userPoolClientId")
 * .userPoolDomain("userPoolDomain")
 * // the properties below are optional
 * .authenticationRequestExtraParams(Map.of(
 * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
 * .onUnauthenticatedRequest("onUnauthenticatedRequest")
 * .scope("scope")
 * .sessionCookieName("sessionCookieName")
 * .sessionTimeout("sessionTimeout")
 * .build())
 * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientId("clientId")
 * .issuer("issuer")
 * .tokenEndpoint("tokenEndpoint")
 * .userInfoEndpoint("userInfoEndpoint")
 * // the properties below are optional
 * .authenticationRequestExtraParams(Map.of(
 * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
 * .clientSecret("clientSecret")
 * .onUnauthenticatedRequest("onUnauthenticatedRequest")
 * .scope("scope")
 * .sessionCookieName("sessionCookieName")
 * .sessionTimeout("sessionTimeout")
 * .useExistingClientSecret(false)
 * .build())
 * .fixedResponseConfig(FixedResponseConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentType("contentType")
 * .messageBody("messageBody")
 * .build())
 * .forwardConfig(ForwardConfigProperty.builder()
 * .targetGroups(List.of(TargetGroupTupleProperty.builder()
 * .targetGroupArn("targetGroupArn")
 * .weight(123)
 * .build()))
 * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
 * .durationSeconds(123)
 * .enabled(false)
 * .build())
 * .build())
 * .order(123)
 * .redirectConfig(RedirectConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .host("host")
 * .path("path")
 * .port("port")
 * .protocol("protocol")
 * .query("query")
 * .build())
 * .targetGroupArn("targetGroupArn")
 * .build()))
 * .loadBalancerArn("loadBalancerArn")
 * // the properties below are optional
 * .alpnPolicy(List.of("alpnPolicy"))
 * .certificates(List.of(CertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build()))
 * .mutualAuthentication(MutualAuthenticationProperty.builder()
 * .ignoreClientCertificateExpiry(false)
 * .mode("mode")
 * .trustStoreArn("trustStoreArn")
 * .build())
 * .port(123)
 * .protocol("protocol")
 * .sslPolicy("sslPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html)
 */
public interface CfnListenerProps {
  /**
   * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
   */
  public fun alpnPolicy(): List<String> = unwrap(this).getAlpnPolicy() ?: emptyList()

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
   */
  public fun certificates(): Any? = unwrap(this).getCertificates()

  /**
   * The actions for the default rule. You cannot define a condition for a default rule.
   *
   * To create additional rules for an Application Load Balancer, use
   * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
   */
  public fun defaultActions(): Any

  /**
   * The Amazon Resource Name (ARN) of the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
   */
  public fun loadBalancerArn(): String

  /**
   * The mutual authentication configuration information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
   */
  public fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

  /**
   * The port on which the load balancer is listening.
   *
   * You cannot specify a port for a Gateway Load Balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The protocol for connections from clients to the load balancer.
   *
   * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
   * Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or
   * TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
   * Balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
   */
  public fun protocol(): String? = unwrap(this).getProtocol()

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
   */
  public fun sslPolicy(): String? = unwrap(this).getSslPolicy()

  /**
   * A builder for [CfnListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
     * (ALPN) policy.
     */
    public fun alpnPolicy(alpnPolicy: List<String>)

    /**
     * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
     * (ALPN) policy.
     */
    public fun alpnPolicy(vararg alpnPolicy: String)

    /**
     * @param certificates The default SSL server certificate for a secure listener.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * To create a certificate list for a secure listener, use
     * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     * .
     */
    public fun certificates(certificates: IResolvable)

    /**
     * @param certificates The default SSL server certificate for a secure listener.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * To create a certificate list for a secure listener, use
     * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     * .
     */
    public fun certificates(certificates: List<Any>)

    /**
     * @param certificates The default SSL server certificate for a secure listener.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * To create a certificate list for a secure listener, use
     * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     * .
     */
    public fun certificates(vararg certificates: Any)

    /**
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     * default rule. 
     * To create additional rules for an Application Load Balancer, use
     * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     * .
     */
    public fun defaultActions(defaultActions: IResolvable)

    /**
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     * default rule. 
     * To create additional rules for an Application Load Balancer, use
     * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     * .
     */
    public fun defaultActions(defaultActions: List<Any>)

    /**
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     * default rule. 
     * To create additional rules for an Application Load Balancer, use
     * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     * .
     */
    public fun defaultActions(vararg defaultActions: Any)

    /**
     * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer. 
     */
    public fun loadBalancerArn(loadBalancerArn: String)

    /**
     * @param mutualAuthentication The mutual authentication configuration information.
     */
    public fun mutualAuthentication(mutualAuthentication: IResolvable)

    /**
     * @param mutualAuthentication The mutual authentication configuration information.
     */
    public fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty)

    /**
     * @param mutualAuthentication The mutual authentication configuration information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be8cc113af5bb7f2afd743200f6101fb564f42ee98951a3619b055f0fc659f3")
    public
        fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param port The port on which the load balancer is listening.
     * You cannot specify a port for a Gateway Load Balancer.
     */
    public fun port(port: Number)

    /**
     * @param protocol The protocol for connections from clients to the load balancer.
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or
     * TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     */
    public fun protocol(protocol: String)

    /**
     * @param sslPolicy [HTTPS and TLS listeners] The security policy that defines which protocols
     * and ciphers are supported.
     * For more information, see [Security
     * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)
     * in the *Application Load Balancers Guide* and [Security
     * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies)
     * in the *Network Load Balancers Guide* .
     */
    public fun sslPolicy(sslPolicy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps.builder()

    /**
     * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
     * (ALPN) policy.
     */
    override fun alpnPolicy(alpnPolicy: List<String>) {
      cdkBuilder.alpnPolicy(alpnPolicy)
    }

    /**
     * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
     * (ALPN) policy.
     */
    override fun alpnPolicy(vararg alpnPolicy: String): Unit = alpnPolicy(alpnPolicy.toList())

    /**
     * @param certificates The default SSL server certificate for a secure listener.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * To create a certificate list for a secure listener, use
     * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     * .
     */
    override fun certificates(certificates: IResolvable) {
      cdkBuilder.certificates(certificates.let(IResolvable::unwrap))
    }

    /**
     * @param certificates The default SSL server certificate for a secure listener.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * To create a certificate list for a secure listener, use
     * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     * .
     */
    override fun certificates(certificates: List<Any>) {
      cdkBuilder.certificates(certificates)
    }

    /**
     * @param certificates The default SSL server certificate for a secure listener.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * To create a certificate list for a secure listener, use
     * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
     * .
     */
    override fun certificates(vararg certificates: Any): Unit = certificates(certificates.toList())

    /**
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     * default rule. 
     * To create additional rules for an Application Load Balancer, use
     * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     * .
     */
    override fun defaultActions(defaultActions: IResolvable) {
      cdkBuilder.defaultActions(defaultActions.let(IResolvable::unwrap))
    }

    /**
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     * default rule. 
     * To create additional rules for an Application Load Balancer, use
     * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     * .
     */
    override fun defaultActions(defaultActions: List<Any>) {
      cdkBuilder.defaultActions(defaultActions)
    }

    /**
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     * default rule. 
     * To create additional rules for an Application Load Balancer, use
     * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     * .
     */
    override fun defaultActions(vararg defaultActions: Any): Unit =
        defaultActions(defaultActions.toList())

    /**
     * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer. 
     */
    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /**
     * @param mutualAuthentication The mutual authentication configuration information.
     */
    override fun mutualAuthentication(mutualAuthentication: IResolvable) {
      cdkBuilder.mutualAuthentication(mutualAuthentication.let(IResolvable::unwrap))
    }

    /**
     * @param mutualAuthentication The mutual authentication configuration information.
     */
    override
        fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty) {
      cdkBuilder.mutualAuthentication(mutualAuthentication.let(CfnListener.MutualAuthenticationProperty::unwrap))
    }

    /**
     * @param mutualAuthentication The mutual authentication configuration information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6be8cc113af5bb7f2afd743200f6101fb564f42ee98951a3619b055f0fc659f3")
    override
        fun mutualAuthentication(mutualAuthentication: CfnListener.MutualAuthenticationProperty.Builder.() -> Unit):
        Unit = mutualAuthentication(CfnListener.MutualAuthenticationProperty(mutualAuthentication))

    /**
     * @param port The port on which the load balancer is listening.
     * You cannot specify a port for a Gateway Load Balancer.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol for connections from clients to the load balancer.
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or
     * TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param sslPolicy [HTTPS and TLS listeners] The security policy that defines which protocols
     * and ciphers are supported.
     * For more information, see [Security
     * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)
     * in the *Application Load Balancers Guide* and [Security
     * policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies)
     * in the *Network Load Balancers Guide* .
     */
    override fun sslPolicy(sslPolicy: String) {
      cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps,
  ) : CdkObject(cdkObject), CfnListenerProps {
    /**
     * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
     */
    override fun alpnPolicy(): List<String> = unwrap(this).getAlpnPolicy() ?: emptyList()

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
     */
    override fun certificates(): Any? = unwrap(this).getCertificates()

    /**
     * The actions for the default rule. You cannot define a condition for a default rule.
     *
     * To create additional rules for an Application Load Balancer, use
     * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
     */
    override fun defaultActions(): Any = unwrap(this).getDefaultActions()

    /**
     * The Amazon Resource Name (ARN) of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
     */
    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    /**
     * The mutual authentication configuration information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
     */
    override fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

    /**
     * The port on which the load balancer is listening.
     *
     * You cannot specify a port for a Gateway Load Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol for connections from clients to the load balancer.
     *
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or
     * TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
     */
    override fun protocol(): String? = unwrap(this).getProtocol()

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
     */
    override fun sslPolicy(): String? = unwrap(this).getSslPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps):
        CfnListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps
  }
}
