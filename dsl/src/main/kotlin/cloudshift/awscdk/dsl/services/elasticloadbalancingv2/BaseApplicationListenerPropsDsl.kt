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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy

/**
 * Basic properties for an ApplicationListener.
 *
 * Example:
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * FargateService service = FargateService.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
 * "LB").vpc(vpc).internetFacing(true).build();
 * ApplicationListener listener = lb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * service.registerLoadBalancerTargets(EcsTarget.builder()
 * .containerName("web")
 * .containerPort(80)
 * .newTargetGroupId("ECS")
 * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
 * .protocol(ApplicationProtocol.HTTPS)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class BaseApplicationListenerPropsDsl {
    private val cdkBuilder: BaseApplicationListenerProps.Builder =
        BaseApplicationListenerProps.builder()

    private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

    private val _defaultTargetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

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
     *   control of the default action of the load balancer, including Action chaining, fixed
     *   responses and redirect responses.
     *
     * See the `ListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    public fun defaultAction(defaultAction: ListenerAction) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to. All target groups will
     *   be load balanced to with equal weight and without stickiness. For a more complex
     *   configuration than that, use either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup) {
        _defaultTargetGroups.addAll(listOf(*defaultTargetGroups))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to. All target groups will
     *   be load balanced to with equal weight and without stickiness. For a more complex
     *   configuration than that, use either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(defaultTargetGroups: Collection<IApplicationTargetGroup>) {
        _defaultTargetGroups.addAll(defaultTargetGroups)
    }

    /**
     * @param open Allow anyone to connect to the load balancer on the listener port. If this is
     *   specified, the load balancer will be opened up to anyone who can reach it. For internal
     *   load balancers this is anyone in the same VPC. For public load balancers, this is anyone on
     *   the internet.
     *
     * If you want to be more selective about who can access this load balancer, set this to `false`
     * and use the listener's `connections` object to selectively grant access to the load balancer
     * on the listener port.
     */
    public fun `open`(`open`: Boolean) {
        cdkBuilder.`open`(`open`)
    }

    /** @param port The port on which the listener listens for requests. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param protocol The protocol to use. */
    public fun protocol(protocol: ApplicationProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported.
     */
    public fun sslPolicy(sslPolicy: SslPolicy) {
        cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): BaseApplicationListenerProps {
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        if (_defaultTargetGroups.isNotEmpty()) cdkBuilder.defaultTargetGroups(_defaultTargetGroups)
        return cdkBuilder.build()
    }
}
