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

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.ec2.PortDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb
import software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroupMetrics
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerMetrics
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroupMetrics
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase

/**
 * Perform the given default action on incoming requests.
 *
 * This allows full control of the default action of the load balancer, including Action chaining,
 * fixed responses and redirect responses. See the `ListenerAction` class for all options.
 *
 * It's possible to add routing conditions to the Action added in this way. At least one Action must
 * be added without conditions (which becomes the default Action).
 *
 * @param id
 * @param props
 */
public inline fun ApplicationListener.addAction(
    id: String,
    block: AddApplicationActionPropsDsl.() -> Unit = {}
) {
    val builder = AddApplicationActionPropsDsl()
    builder.apply(block)
    return addAction(id, builder.build())
}

/**
 * Load balance incoming requests to the given target groups.
 *
 * All target groups will be load balanced to with equal weight and without stickiness. For a more
 * complex configuration than that, use `addAction()`.
 *
 * It's possible to add routing conditions to the TargetGroups added in this way. At least one
 * TargetGroup must be added without conditions (which will become the default Action for this
 * listener).
 *
 * @param id
 * @param props
 */
public inline fun ApplicationListener.addTargetGroups(
    id: String,
    block: AddApplicationTargetGroupsPropsDsl.() -> Unit = {}
) {
    val builder = AddApplicationTargetGroupsPropsDsl()
    builder.apply(block)
    return addTargetGroups(id, builder.build())
}

/**
 * Load balance incoming requests to the given load balancing targets.
 *
 * This method implicitly creates an ApplicationTargetGroup for the targets involved, and a
 * 'forward' action to route traffic to the given TargetGroup.
 *
 * If you want more control over the precise setup, create the TargetGroup and use `addAction`
 * yourself.
 *
 * It's possible to add conditions to the targets added in this way. At least one set of targets
 * must be added without conditions.
 *
 * @param id
 * @param props
 * @return The newly created target group
 */
public inline fun ApplicationListener.addTargets(
    id: String,
    block: AddApplicationTargetsPropsDsl.() -> Unit = {}
): ApplicationTargetGroup {
    val builder = AddApplicationTargetsPropsDsl()
    builder.apply(block)
    return addTargets(id, builder.build())
}

/**
 * Register that a connectable that has been added to this load balancer.
 *
 * Don't call this directly. It is called by ApplicationTargetGroup.
 *
 * @param connectable
 * @param portRange
 */
public inline fun ApplicationListener.registerConnectable(
    connectable: IConnectable,
    block: PortDsl.() -> Unit = {}
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(connectable, builder.build())
}

/**
 * Add a listener to this load balancer.
 *
 * @param id
 * @param props
 * @return The newly created listener
 */
public inline fun NetworkLoadBalancer.addListener(
    id: String,
    block: BaseNetworkListenerPropsDsl.() -> Unit = {}
): NetworkListener {
    val builder = BaseNetworkListenerPropsDsl()
    builder.apply(block)
    return addListener(id, builder.build())
}

/**
 * (deprecated) Return the given named metric for this Network Load Balancer.
 *
 * Default: Average over 5 minutes
 *
 * @param metricName
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.custom` instead
 */
public inline fun NetworkLoadBalancer.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * (deprecated) The total number of concurrent TCP flows (or connections) from clients to targets.
 *
 * This metric includes connections in the SYN_SENT and ESTABLISHED states. TCP connections are not
 * terminated at the load balancer, so a client opening a TCP connection to a target counts as a
 * single flow.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
 */
public inline fun NetworkLoadBalancer.metricActiveFlowCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricActiveFlowCount(builder.build())
}

/**
 * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.activeFlowCount` instead
 */
public inline fun NetworkLoadBalancer.metricConsumedLCUs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedLCUs(builder.build())
}

/**
 * (deprecated) The total number of new TCP flows (or connections) established from clients to
 * targets in the time period.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.newFlowCount` instead
 */
public inline fun NetworkLoadBalancer.metricNewFlowCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNewFlowCount(builder.build())
}

/**
 * (deprecated) The total number of bytes processed by the load balancer, including TCP/IP headers.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.processedBytes` instead
 */
public inline fun NetworkLoadBalancer.metricProcessedBytes(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricProcessedBytes(builder.build())
}

/**
 * (deprecated) The total number of reset (RST) packets sent from a client to a target.
 *
 * These resets are generated by the client and forwarded by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.tcpClientResetCount` instead
 */
public inline fun NetworkLoadBalancer.metricTcpClientResetCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTcpClientResetCount(builder.build())
}

/**
 * (deprecated) The total number of reset (RST) packets generated by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.tcpElbResetCount` instead
 */
public inline fun NetworkLoadBalancer.metricTcpElbResetCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTcpElbResetCount(builder.build())
}

/**
 * (deprecated) The total number of reset (RST) packets sent from a target to a client.
 *
 * These resets are generated by the target and forwarded by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkLoadBalancer.metrics.tcpTargetResetCount` instead
 */
public inline fun NetworkLoadBalancer.metricTcpTargetResetCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTcpTargetResetCount(builder.build())
}

/**
 * Return the given named metric for this Application Load Balancer Target Group.
 *
 * Returns the metric for this target group from the point of view of the first load balancer load
 * balancing to it. If you have multiple load balancers load sending traffic to the same target
 * group, you will have to override the dimensions on this metric.
 *
 * Default: Average over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun ApplicationTargetGroup.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * (deprecated) The number of healthy hosts in the target group.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.healthyHostCount` instead
 */
public inline fun ApplicationTargetGroup.metricHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHealthyHostCount(builder.build())
}

/**
 * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in this
 * target group.
 *
 * This does not include any response codes generated by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param code
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.httpCodeTarget` instead
 */
public inline fun ApplicationTargetGroup.metricHttpCodeTarget(
    code: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpCodeTarget(code, builder.build())
}

/**
 * (deprecated) The number of IPv6 requests received by the target group.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.ipv6RequestCount` instead
 */
public inline fun ApplicationTargetGroup.metricIpv6RequestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIpv6RequestCount(builder.build())
}

/**
 * (deprecated) The number of requests processed over IPv4 and IPv6.
 *
 * This count includes only the requests with a response generated by a target of the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.requestCount` instead
 */
public inline fun ApplicationTargetGroup.metricRequestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRequestCount(builder.build())
}

/**
 * (deprecated) The average number of requests received by each target in a target group.
 *
 * The only valid statistic is Sum. Note that this represents the average not the sum.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.requestCountPerTarget` instead
 */
public inline fun ApplicationTargetGroup.metricRequestCountPerTarget(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRequestCountPerTarget(builder.build())
}

/**
 * (deprecated) The number of connections that were not successfully established between the load
 * balancer and target.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.targetConnectionErrorCount` instead
 */
public inline fun ApplicationTargetGroup.metricTargetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetConnectionErrorCount(builder.build())
}

/**
 * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
 * response from the target is received.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.targetResponseTime` instead
 */
public inline fun ApplicationTargetGroup.metricTargetResponseTime(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetResponseTime(builder.build())
}

/**
 * (deprecated) The number of TLS connections initiated by the load balancer that did not establish
 * a session with the target.
 *
 * Possible causes include a mismatch of ciphers or protocols.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.tlsNegotiationErrorCount` instead
 */
public inline fun ApplicationTargetGroup.metricTargetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetTLSNegotiationErrorCount(builder.build())
}

/**
 * (deprecated) The number of unhealthy hosts in the target group.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationTargetGroup.metrics.unhealthyHostCount` instead
 */
public inline fun ApplicationTargetGroup.metricUnhealthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricUnhealthyHostCount(builder.build())
}

/**
 * Register a connectable as a member of this target group.
 *
 * Don't call this directly. It will be called by load balancing targets.
 *
 * @param connectable
 * @param portRange
 */
public inline fun ApplicationTargetGroup.registerConnectable(
    connectable: IConnectable,
    block: PortDsl.() -> Unit = {}
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(connectable, builder.build())
}

/**
 * Add a new listener to this load balancer.
 *
 * @param id
 * @param props
 */
public inline fun ApplicationLoadBalancer.addListener(
    id: String,
    block: BaseApplicationListenerPropsDsl.() -> Unit = {}
): ApplicationListener {
    val builder = BaseApplicationListenerPropsDsl()
    builder.apply(block)
    return addListener(id, builder.build())
}

/**
 * Add a redirection listener to this load balancer.
 *
 * @param props
 */
public inline fun ApplicationLoadBalancer.addRedirect(
    block: ApplicationLoadBalancerRedirectConfigDsl.() -> Unit = {}
): ApplicationListener {
    val builder = ApplicationLoadBalancerRedirectConfigDsl()
    builder.apply(block)
    return addRedirect(builder.build())
}

/**
 * (deprecated) Return the given named metric for this Application Load Balancer.
 *
 * Default: Average over 5 minutes
 *
 * @param metricName
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.custom` instead
 */
public inline fun ApplicationLoadBalancer.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * (deprecated) The total number of concurrent TCP connections active from clients to the load
 * balancer and from the load balancer to targets.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.activeConnectionCount` instead
 */
public inline fun ApplicationLoadBalancer.metricActiveConnectionCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricActiveConnectionCount(builder.build())
}

/**
 * (deprecated) The number of TLS connections initiated by the client that did not establish a
 * session with the load balancer.
 *
 * Possible causes include a mismatch of ciphers or protocols.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.clientTlsNegotiationErrorCount` instead
 */
public inline fun ApplicationLoadBalancer.metricClientTlsNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientTlsNegotiationErrorCount(builder.build())
}

/**
 * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.consumedLCUs` instead
 */
public inline fun ApplicationLoadBalancer.metricConsumedLCUs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedLCUs(builder.build())
}

/**
 * (deprecated) The number of user authentications that could not be completed.
 *
 * Because an authenticate action was misconfigured, the load balancer couldn't establish a
 * connection with the IdP, or the load balancer couldn't complete the authentication flow due to an
 * internal error.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthError` instead
 */
public inline fun ApplicationLoadBalancer.metricElbAuthError(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthError(builder.build())
}

/**
 * (deprecated) The number of user authentications that could not be completed because the IdP
 * denied access to the user or an authorization code was used more than once.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthFailure` instead
 */
public inline fun ApplicationLoadBalancer.metricElbAuthFailure(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthFailure(builder.build())
}

/**
 * (deprecated) The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
 *
 * If one or more of these operations fail, this is the time to failure.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthLatency` instead
 */
public inline fun ApplicationLoadBalancer.metricElbAuthLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthLatency(builder.build())
}

/**
 * (deprecated) The number of authenticate actions that were successful.
 *
 * This metric is incremented at the end of the authentication workflow, after the load balancer has
 * retrieved the user claims from the IdP.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthSuccess` instead
 */
public inline fun ApplicationLoadBalancer.metricElbAuthSuccess(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthSuccess(builder.build())
}

/**
 * (deprecated) The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
 *
 * This does not include any response codes generated by the targets.
 *
 * Default: Sum over 5 minutes
 *
 * @param code
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeElb` instead
 */
public inline fun ApplicationLoadBalancer.metricHttpCodeElb(
    code: HttpCodeElb,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpCodeElb(code, builder.build())
}

/**
 * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the
 * load balancer.
 *
 * This does not include any response codes generated by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param code
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeTarget` instead
 */
public inline fun ApplicationLoadBalancer.metricHttpCodeTarget(
    code: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpCodeTarget(code, builder.build())
}

/**
 * (deprecated) The number of fixed-response actions that were successful.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.httpFixedResponseCount` instead
 */
public inline fun ApplicationLoadBalancer.metricHttpFixedResponseCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpFixedResponseCount(builder.build())
}

/**
 * (deprecated) The number of redirect actions that were successful.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectCount` instead
 */
public inline fun ApplicationLoadBalancer.metricHttpRedirectCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpRedirectCount(builder.build())
}

/**
 * (deprecated) The number of redirect actions that couldn't be completed because the URL in the
 * response location header is larger than 8K.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectUrlLimitExceededCount` instead
 */
public inline fun ApplicationLoadBalancer.metricHttpRedirectUrlLimitExceededCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpRedirectUrlLimitExceededCount(builder.build())
}

/**
 * (deprecated) The total number of bytes processed by the load balancer over IPv6.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6ProcessedBytes` instead
 */
public inline fun ApplicationLoadBalancer.metricIpv6ProcessedBytes(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIpv6ProcessedBytes(builder.build())
}

/**
 * (deprecated) The number of IPv6 requests received by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6RequestCount` instead
 */
public inline fun ApplicationLoadBalancer.metricIpv6RequestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIpv6RequestCount(builder.build())
}

/**
 * (deprecated) The total number of new TCP connections established from clients to the load
 * balancer and from the load balancer to targets.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.newConnectionCount` instead
 */
public inline fun ApplicationLoadBalancer.metricNewConnectionCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNewConnectionCount(builder.build())
}

/**
 * (deprecated) The total number of bytes processed by the load balancer over IPv4 and IPv6.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.processedBytes` instead
 */
public inline fun ApplicationLoadBalancer.metricProcessedBytes(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricProcessedBytes(builder.build())
}

/**
 * (deprecated) The number of connections that were rejected because the load balancer had reached
 * its maximum number of connections.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.rejectedConnectionCount` instead
 */
public inline fun ApplicationLoadBalancer.metricRejectedConnectionCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRejectedConnectionCount(builder.build())
}

/**
 * (deprecated) The number of requests processed over IPv4 and IPv6.
 *
 * This count includes only the requests with a response generated by a target of the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.requestCount` instead
 */
public inline fun ApplicationLoadBalancer.metricRequestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRequestCount(builder.build())
}

/**
 * (deprecated) The number of rules processed by the load balancer given a request rate averaged
 * over an hour.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.ruleEvaluations` instead
 */
public inline fun ApplicationLoadBalancer.metricRuleEvaluations(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRuleEvaluations(builder.build())
}

/**
 * (deprecated) The number of connections that were not successfully established between the load
 * balancer and target.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.targetConnectionErrorCount` instead
 */
public inline fun ApplicationLoadBalancer.metricTargetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetConnectionErrorCount(builder.build())
}

/**
 * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
 * response from the target is received.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.targetResponseTime` instead
 */
public inline fun ApplicationLoadBalancer.metricTargetResponseTime(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetResponseTime(builder.build())
}

/**
 * (deprecated) The number of TLS connections initiated by the load balancer that did not establish
 * a session with the target.
 *
 * Possible causes include a mismatch of ciphers or protocols.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 * @deprecated Use `ApplicationLoadBalancer.metrics.targetTLSNegotiationErrorCount` instead
 */
public inline fun ApplicationLoadBalancer.metricTargetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetTLSNegotiationErrorCount(builder.build())
}

/**
 * Perform the given action on incoming requests.
 *
 * This allows full control of the default action of the load balancer, including Action chaining,
 * fixed responses and redirect responses. See the `ListenerAction` class for all options.
 *
 * It's possible to add routing conditions to the Action added in this way.
 *
 * It is not possible to add a default action to an imported IApplicationListener. In order to add
 * actions to an imported IApplicationListener a `priority` must be provided.
 *
 * @param id
 * @param props
 */
public inline fun IApplicationListener.addAction(
    arg0: String,
    block: AddApplicationActionPropsDsl.() -> Unit = {}
) {
    val builder = AddApplicationActionPropsDsl()
    builder.apply(block)
    return addAction(arg0, builder.build())
}

/**
 * Load balance incoming requests to the given target groups.
 *
 * It's possible to add conditions to the TargetGroups added in this way. At least one TargetGroup
 * must be added without conditions.
 *
 * @param id
 * @param props
 */
public inline fun IApplicationListener.addTargetGroups(
    arg0: String,
    block: AddApplicationTargetGroupsPropsDsl.() -> Unit = {}
) {
    val builder = AddApplicationTargetGroupsPropsDsl()
    builder.apply(block)
    return addTargetGroups(arg0, builder.build())
}

/**
 * Load balance incoming requests to the given load balancing targets.
 *
 * This method implicitly creates an ApplicationTargetGroup for the targets involved.
 *
 * It's possible to add conditions to the targets added in this way. At least one set of targets
 * must be added without conditions.
 *
 * @param id
 * @param props
 * @return The newly created target group
 */
public inline fun IApplicationListener.addTargets(
    arg0: String,
    block: AddApplicationTargetsPropsDsl.() -> Unit = {}
): ApplicationTargetGroup {
    val builder = AddApplicationTargetsPropsDsl()
    builder.apply(block)
    return addTargets(arg0, builder.build())
}

/**
 * Register that a connectable that has been added to this load balancer.
 *
 * Don't call this directly. It is called by ApplicationTargetGroup.
 *
 * @param connectable
 * @param portRange
 */
public inline fun IApplicationListener.registerConnectable(
    arg0: IConnectable,
    block: PortDsl.() -> Unit = {}
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(arg0, builder.build())
}

/**
 * Register a connectable as a member of this target group.
 *
 * Don't call this directly. It will be called by load balancing targets.
 *
 * @param connectable
 * @param portRange
 */
public inline fun IApplicationTargetGroup.registerConnectable(
    arg0: IConnectable,
    block: PortDsl.() -> Unit = {}
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(arg0, builder.build())
}

/**
 * The total number of concurrent TCP flows (or connections) from clients to targets.
 *
 * This metric includes connections in the SYN_SENT and ESTABLISHED states. TCP connections are not
 * terminated at the load balancer, so a client opening a TCP connection to a target counts as a
 * single flow.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.activeFlowCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return activeFlowCount(builder.build())
}

/**
 * The number of load balancer capacity units (LCU) used by your load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.consumedLCUs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return consumedLCUs(builder.build())
}

/**
 * Return the given named metric for this Network Load Balancer.
 *
 * Default: Average over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

/**
 * The total number of new TCP flows (or connections) established from clients to targets in the
 * time period.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.newFlowCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return newFlowCount(builder.build())
}

/**
 * The total number of bytes processed by the load balancer, including TCP/IP headers.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.processedBytes(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return processedBytes(builder.build())
}

/**
 * The total number of reset (RST) packets sent from a client to a target.
 *
 * These resets are generated by the client and forwarded by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.tcpClientResetCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return tcpClientResetCount(builder.build())
}

/**
 * The total number of reset (RST) packets generated by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.tcpElbResetCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return tcpElbResetCount(builder.build())
}

/**
 * The total number of reset (RST) packets sent from a target to a client.
 *
 * These resets are generated by the target and forwarded by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun INetworkLoadBalancerMetrics.tcpTargetResetCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return tcpTargetResetCount(builder.build())
}

/**
 * Return the given named metric for this Network Target Group.
 *
 * Default: Average over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

/**
 * The number of healthy hosts in the target group.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.healthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return healthyHostCount(builder.build())
}

/**
 * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in this target group.
 *
 * This does not include any response codes generated by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param code
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.httpCodeTarget(
    arg0: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpCodeTarget(arg0, builder.build())
}

/**
 * The number of IPv6 requests received by the target group.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.ipv6RequestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ipv6RequestCount(builder.build())
}

/**
 * The number of requests processed over IPv4 and IPv6.
 *
 * This count includes only the requests with a response generated by a target of the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.requestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return requestCount(builder.build())
}

/**
 * The average number of requests received by each target in a target group.
 *
 * The only valid statistic is Sum. Note that this represents the average not the sum.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.requestCountPerTarget(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return requestCountPerTarget(builder.build())
}

/**
 * The number of connections that were not successfully established between the load balancer and
 * target.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.targetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetConnectionErrorCount(builder.build())
}

/**
 * The time elapsed, in seconds, after the request leaves the load balancer until a response from
 * the target is received.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.targetResponseTime(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetResponseTime(builder.build())
}

/**
 * The number of TLS connections initiated by the load balancer that did not establish a session
 * with the target.
 *
 * Possible causes include a mismatch of ciphers or protocols.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.targetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetTLSNegotiationErrorCount(builder.build())
}

/**
 * The number of unhealthy hosts in the target group.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationTargetGroupMetrics.unhealthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return unhealthyHostCount(builder.build())
}

/**
 * The total number of concurrent TCP connections active from clients to the load balancer and from
 * the load balancer to targets.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.activeConnectionCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return activeConnectionCount(builder.build())
}

/**
 * The number of TLS connections initiated by the client that did not establish a session with the
 * load balancer.
 *
 * Possible causes include a mismatch of ciphers or protocols.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.clientTlsNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return clientTlsNegotiationErrorCount(builder.build())
}

/**
 * The number of load balancer capacity units (LCU) used by your load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.consumedLCUs(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return consumedLCUs(builder.build())
}

/**
 * Return the given named metric for this Application Load Balancer.
 *
 * Default: Average over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

/**
 * The number of user authentications that could not be completed.
 *
 * Because an authenticate action was misconfigured, the load balancer couldn't establish a
 * connection with the IdP, or the load balancer couldn't complete the authentication flow due to an
 * internal error.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.elbAuthError(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthError(builder.build())
}

/**
 * The number of user authentications that could not be completed because the IdP denied access to
 * the user or an authorization code was used more than once.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.elbAuthFailure(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthFailure(builder.build())
}

/**
 * The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
 *
 * If one or more of these operations fail, this is the time to failure.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.elbAuthLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthLatency(builder.build())
}

/**
 * The number of authenticate actions that were successful.
 *
 * This metric is incremented at the end of the authentication workflow, after the load balancer has
 * retrieved the user claims from the IdP.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.elbAuthSuccess(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthSuccess(builder.build())
}

/**
 * The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
 *
 * This does not include any response codes generated by the targets.
 *
 * Default: Sum over 5 minutes
 *
 * @param code
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.httpCodeElb(
    arg0: HttpCodeElb,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpCodeElb(arg0, builder.build())
}

/**
 * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the load balancer.
 *
 * This does not include any response codes generated by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param code
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.httpCodeTarget(
    arg0: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpCodeTarget(arg0, builder.build())
}

/**
 * The number of fixed-response actions that were successful.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.httpFixedResponseCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpFixedResponseCount(builder.build())
}

/**
 * The number of redirect actions that were successful.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.httpRedirectCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpRedirectCount(builder.build())
}

/**
 * The number of redirect actions that couldn't be completed because the URL in the response
 * location header is larger than 8K.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.httpRedirectUrlLimitExceededCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpRedirectUrlLimitExceededCount(builder.build())
}

/**
 * The total number of bytes processed by the load balancer over IPv6.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.ipv6ProcessedBytes(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ipv6ProcessedBytes(builder.build())
}

/**
 * The number of IPv6 requests received by the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.ipv6RequestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ipv6RequestCount(builder.build())
}

/**
 * The total number of new TCP connections established from clients to the load balancer and from
 * the load balancer to targets.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.newConnectionCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return newConnectionCount(builder.build())
}

/**
 * The total number of bytes processed by the load balancer over IPv4 and IPv6.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.processedBytes(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return processedBytes(builder.build())
}

/**
 * The number of connections that were rejected because the load balancer had reached its maximum
 * number of connections.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.rejectedConnectionCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return rejectedConnectionCount(builder.build())
}

/**
 * The number of requests processed over IPv4 and IPv6.
 *
 * This count includes only the requests with a response generated by a target of the load balancer.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.requestCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return requestCount(builder.build())
}

/**
 * The number of rules processed by the load balancer given a request rate averaged over an hour.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.ruleEvaluations(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ruleEvaluations(builder.build())
}

/**
 * The number of connections that were not successfully established between the load balancer and
 * target.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.targetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetConnectionErrorCount(builder.build())
}

/**
 * The time elapsed, in seconds, after the request leaves the load balancer until a response from
 * the target is received.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.targetResponseTime(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetResponseTime(builder.build())
}

/**
 * The number of TLS connections initiated by the load balancer that did not establish a session
 * with the target.
 *
 * Possible causes include a mismatch of ciphers or protocols.
 *
 * Default: Sum over 5 minutes
 *
 * @param props
 */
public inline fun IApplicationLoadBalancerMetrics.targetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetTLSNegotiationErrorCount(builder.build())
}

/**
 * Return the given named metric for this Network Target Group.
 *
 * Default: Average over 5 minutes
 *
 * @param metricName
 * @param props
 */
public inline fun INetworkTargetGroupMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

/**
 * The number of targets that are considered healthy.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun INetworkTargetGroupMetrics.healthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return healthyHostCount(builder.build())
}

/**
 * The number of targets that are considered unhealthy.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 */
public inline fun INetworkTargetGroupMetrics.unHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return unHealthyHostCount(builder.build())
}

/**
 * Add a new listener to this load balancer.
 *
 * @param id
 * @param props
 */
public inline fun IApplicationLoadBalancer.addListener(
    arg0: String,
    block: BaseApplicationListenerPropsDsl.() -> Unit = {}
): ApplicationListener {
    val builder = BaseApplicationListenerPropsDsl()
    builder.apply(block)
    return addListener(arg0, builder.build())
}

/**
 * Add a listener to this load balancer.
 *
 * @param id
 * @param props
 * @return The newly created listener
 */
public inline fun INetworkLoadBalancer.addListener(
    arg0: String,
    block: BaseNetworkListenerPropsDsl.() -> Unit = {}
): NetworkListener {
    val builder = BaseNetworkListenerPropsDsl()
    builder.apply(block)
    return addListener(arg0, builder.build())
}

/**
 * Set/replace the target group's health check.
 *
 * @param healthCheck
 */
public inline fun TargetGroupBase.configureHealthCheck(block: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(block)
    return configureHealthCheck(builder.build())
}

/** Health check for the members of this target group. */
public inline fun TargetGroupBase.setHealthCheck(block: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(block)
    return setHealthCheck(builder.build())
}

/**
 * Perform the given Action on incoming requests.
 *
 * This allows full control of the default Action of the load balancer, including weighted
 * forwarding. See the `NetworkListenerAction` class for all options.
 *
 * @param _id
 * @param props
 */
public inline fun NetworkListener.addAction(
    _id: String,
    block: AddNetworkActionPropsDsl.() -> Unit = {}
) {
    val builder = AddNetworkActionPropsDsl()
    builder.apply(block)
    return addAction(_id, builder.build())
}

/**
 * Load balance incoming requests to the given load balancing targets.
 *
 * This method implicitly creates a NetworkTargetGroup for the targets involved, and a 'forward'
 * action to route traffic to the given TargetGroup.
 *
 * If you want more control over the precise setup, create the TargetGroup and use `addAction`
 * yourself.
 *
 * It's possible to add conditions to the targets added in this way. At least one set of targets
 * must be added without conditions.
 *
 * @param id
 * @param props
 * @return The newly created target group
 */
public inline fun NetworkListener.addTargets(
    id: String,
    block: AddNetworkTargetsPropsDsl.() -> Unit = {}
): NetworkTargetGroup {
    val builder = AddNetworkTargetsPropsDsl()
    builder.apply(block)
    return addTargets(id, builder.build())
}

/**
 * (deprecated) The number of targets that are considered healthy.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
 */
public inline fun NetworkTargetGroup.metricHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHealthyHostCount(builder.build())
}

/**
 * (deprecated) The number of targets that are considered unhealthy.
 *
 * Default: Average over 5 minutes
 *
 * @param props
 * @deprecated Use `NetworkTargetGroup.metrics.healthyHostCount` instead
 */
public inline fun NetworkTargetGroup.metricUnHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricUnHealthyHostCount(builder.build())
}

/**
 * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response
 * from a target.
 */
public inline fun CfnTargetGroup.setMatcher(
    block: CfnTargetGroupMatcherPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTargetGroupMatcherPropertyDsl()
    builder.apply(block)
    return setMatcher(builder.build())
}
