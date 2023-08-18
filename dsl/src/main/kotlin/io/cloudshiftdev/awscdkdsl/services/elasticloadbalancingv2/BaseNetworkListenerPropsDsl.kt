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
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy

/**
 * Basic properties for a Network Listener.
 *
 * Example:
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
public class BaseNetworkListenerPropsDsl {
    private val cdkBuilder: BaseNetworkListenerProps.Builder = BaseNetworkListenerProps.builder()

    private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

    private val _defaultTargetGroups: MutableList<INetworkTargetGroup> = mutableListOf()

    /**
     * @param alpnPolicy Application-Layer Protocol Negotiation (ALPN) is a TLS extension that is
     *   sent on the initial TLS handshake hello messages. ALPN enables the application layer to
     *   negotiate which protocols should be used over a secure connection, such as HTTP/1 and
     *   HTTP/2.
     *
     * Can only be specified together with Protocol TLS.
     */
    public fun alpnPolicy(alpnPolicy: AlpnPolicy) {
        cdkBuilder.alpnPolicy(alpnPolicy)
    }

    /**
     * @param certificates Certificate list of ACM cert ARNs. You must provide exactly one
     *   certificate if the listener protocol is HTTPS or TLS.
     */
    public fun certificates(vararg certificates: IListenerCertificate) {
        _certificates.addAll(listOf(*certificates))
    }

    /**
     * @param certificates Certificate list of ACM cert ARNs. You must provide exactly one
     *   certificate if the listener protocol is HTTPS or TLS.
     */
    public fun certificates(certificates: Collection<IListenerCertificate>) {
        _certificates.addAll(certificates)
    }

    /**
     * @param defaultAction Default action to take for requests to this listener. This allows full
     *   control of the default Action of the load balancer, including weighted forwarding. See the
     *   `NetworkListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    public fun defaultAction(defaultAction: NetworkListenerAction) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to. All target groups will
     *   be load balanced to with equal weight and without stickiness. For a more complex
     *   configuration than that, use either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup) {
        _defaultTargetGroups.addAll(listOf(*defaultTargetGroups))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to. All target groups will
     *   be load balanced to with equal weight and without stickiness. For a more complex
     *   configuration than that, use either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(defaultTargetGroups: Collection<INetworkTargetGroup>) {
        _defaultTargetGroups.addAll(defaultTargetGroups)
    }

    /** @param port The port on which the listener listens for requests. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param protocol Protocol for listener, expects TCP, TLS, UDP, or TCP_UDP. */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    /** @param sslPolicy SSL Policy. */
    public fun sslPolicy(sslPolicy: SslPolicy) {
        cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): BaseNetworkListenerProps {
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        if (_defaultTargetGroups.isNotEmpty()) cdkBuilder.defaultTargetGroups(_defaultTargetGroups)
        return cdkBuilder.build()
    }
}
