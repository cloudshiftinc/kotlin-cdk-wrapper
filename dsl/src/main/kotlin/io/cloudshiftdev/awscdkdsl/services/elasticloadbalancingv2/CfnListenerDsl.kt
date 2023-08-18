@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.constructs.Construct

/**
 * Specifies a listener for an Application Load Balancer, Network Load Balancer, or Gateway Load
 * Balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CfnListener cfnListener = CfnListener.Builder.create(this, "MyCfnListener")
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
 * .port(123)
 * .protocol("protocol")
 * .sslPolicy("sslPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html)
 */
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
     *
     * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
     *   (ALPN) policy.
     */
    public fun alpnPolicy(vararg alpnPolicy: String) {
        _alpnPolicy.addAll(listOf(*alpnPolicy))
    }

    /**
     * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
     *
     * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
     *   (ALPN) policy.
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
     *
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
     *
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
     *
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
     *
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     *   default rule.
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
     *
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     *   default rule.
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
     *
     * @param defaultActions The actions for the default rule. You cannot define a condition for a
     *   default rule.
     */
    public fun defaultActions(defaultActions: IResolvable) {
        cdkBuilder.defaultActions(defaultActions)
    }

    /**
     * The Amazon Resource Name (ARN) of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
     *
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
     *
     * @param port The port on which the load balancer is listening.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * The protocol for connections from clients to the load balancer.
     *
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP
     * or TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a
     * Gateway Load Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
     *
     * @param protocol The protocol for connections from clients to the load balancer.
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are
     * supported.
     *
     * For more information, see
     * [Security policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)
     * in the *Application Load Balancers Guide* and
     * [Security policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies)
     * in the *Network Load Balancers Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy)
     *
     * @param sslPolicy [HTTPS and TLS listeners] The security policy that defines which protocols
     *   and ciphers are supported.
     */
    public fun sslPolicy(sslPolicy: String) {
        cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): CfnListener {
        if (_alpnPolicy.isNotEmpty()) cdkBuilder.alpnPolicy(_alpnPolicy)
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        if (_defaultActions.isNotEmpty()) cdkBuilder.defaultActions(_defaultActions)
        return cdkBuilder.build()
    }
}
