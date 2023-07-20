@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.ec2.PortDsl
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
import kotlin.String
import kotlin.Unit

public inline fun ApplicationListener.addAction(
    id: String,
    block: AddApplicationActionPropsDsl.() -> Unit = {},
) {
    val builder = AddApplicationActionPropsDsl()
    builder.apply(block)
    return addAction(id, builder.build())
}

public inline fun ApplicationListener.addTargetGroups(
    id: String,
    block: AddApplicationTargetGroupsPropsDsl.() -> Unit = {},
) {
    val builder = AddApplicationTargetGroupsPropsDsl()
    builder.apply(block)
    return addTargetGroups(id, builder.build())
}

public inline fun ApplicationListener.addTargets(
    id: String,
    block: AddApplicationTargetsPropsDsl.() -> Unit = {},
): ApplicationTargetGroup {
    val builder = AddApplicationTargetsPropsDsl()
    builder.apply(block)
    return addTargets(id, builder.build())
}

public inline fun ApplicationListener.registerConnectable(
    connectable: IConnectable,
    block: PortDsl.() -> Unit = {},
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(connectable, builder.build())
}

public inline fun NetworkLoadBalancer.addListener(
    id: String,
    block: BaseNetworkListenerPropsDsl.() -> Unit = {},
): NetworkListener {
    val builder = BaseNetworkListenerPropsDsl()
    builder.apply(block)
    return addListener(id, builder.build())
}

public inline fun NetworkLoadBalancer.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

public inline fun NetworkLoadBalancer.metricActiveFlowCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricActiveFlowCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricConsumedLCUs(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedLCUs(builder.build())
}

public inline fun NetworkLoadBalancer.metricNewFlowCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNewFlowCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricProcessedBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricProcessedBytes(builder.build())
}

public inline fun NetworkLoadBalancer.metricTcpClientResetCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTcpClientResetCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricTcpElbResetCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTcpElbResetCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricTcpTargetResetCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTcpTargetResetCount(builder.build())
}

public inline fun ApplicationTargetGroup.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

public inline fun ApplicationTargetGroup.metricHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHealthyHostCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricHttpCodeTarget(
    code: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpCodeTarget(code, builder.build())
}

public inline fun ApplicationTargetGroup.metricIpv6RequestCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIpv6RequestCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricRequestCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRequestCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricRequestCountPerTarget(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRequestCountPerTarget(builder.build())
}

public inline fun ApplicationTargetGroup.metricTargetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetConnectionErrorCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricTargetResponseTime(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetResponseTime(builder.build())
}

public inline fun ApplicationTargetGroup.metricTargetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetTLSNegotiationErrorCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricUnhealthyHostCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricUnhealthyHostCount(builder.build())
}

public inline fun ApplicationTargetGroup.registerConnectable(
    connectable: IConnectable,
    block: PortDsl.() -> Unit = {},
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(connectable, builder.build())
}

public inline fun ApplicationLoadBalancer.addListener(
    id: String,
    block: BaseApplicationListenerPropsDsl.() -> Unit = {},
): ApplicationListener {
    val builder = BaseApplicationListenerPropsDsl()
    builder.apply(block)
    return addListener(id, builder.build())
}

public inline fun ApplicationLoadBalancer.addRedirect(
    block: ApplicationLoadBalancerRedirectConfigDsl.() -> Unit =
        {},
): ApplicationListener {
    val builder = ApplicationLoadBalancerRedirectConfigDsl()
    builder.apply(block)
    return addRedirect(builder.build())
}

public inline fun ApplicationLoadBalancer.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

public inline fun ApplicationLoadBalancer.metricActiveConnectionCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricActiveConnectionCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricClientTlsNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricClientTlsNegotiationErrorCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricConsumedLCUs(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedLCUs(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthError(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthError(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthFailure(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthFailure(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthLatency(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthLatency(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthSuccess(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricElbAuthSuccess(builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpCodeElb(
    code: HttpCodeElb,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpCodeElb(code, builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpCodeTarget(
    code: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpCodeTarget(code, builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpFixedResponseCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpFixedResponseCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpRedirectCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpRedirectCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpRedirectUrlLimitExceededCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHttpRedirectUrlLimitExceededCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricIpv6ProcessedBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIpv6ProcessedBytes(builder.build())
}

public inline fun ApplicationLoadBalancer.metricIpv6RequestCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIpv6RequestCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricNewConnectionCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNewConnectionCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricProcessedBytes(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricProcessedBytes(builder.build())
}

public inline fun ApplicationLoadBalancer.metricRejectedConnectionCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRejectedConnectionCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricRequestCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRequestCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricRuleEvaluations(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRuleEvaluations(builder.build())
}

public inline fun ApplicationLoadBalancer.metricTargetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetConnectionErrorCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricTargetResponseTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetResponseTime(builder.build())
}

public inline fun ApplicationLoadBalancer.metricTargetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTargetTLSNegotiationErrorCount(builder.build())
}

public inline fun IApplicationListener.addAction(
    arg0: String,
    block: AddApplicationActionPropsDsl.() -> Unit = {},
) {
    val builder = AddApplicationActionPropsDsl()
    builder.apply(block)
    return addAction(arg0, builder.build())
}

public inline fun IApplicationListener.addTargetGroups(
    arg0: String,
    block: AddApplicationTargetGroupsPropsDsl.() -> Unit = {},
) {
    val builder = AddApplicationTargetGroupsPropsDsl()
    builder.apply(block)
    return addTargetGroups(arg0, builder.build())
}

public inline fun IApplicationListener.addTargets(
    arg0: String,
    block: AddApplicationTargetsPropsDsl.() -> Unit = {},
): ApplicationTargetGroup {
    val builder = AddApplicationTargetsPropsDsl()
    builder.apply(block)
    return addTargets(arg0, builder.build())
}

public inline fun IApplicationListener.registerConnectable(
    arg0: IConnectable,
    block: PortDsl.() -> Unit = {},
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(arg0, builder.build())
}

public inline fun IApplicationTargetGroup.registerConnectable(
    arg0: IConnectable,
    block: PortDsl.() -> Unit = {},
) {
    val builder = PortDsl()
    builder.apply(block)
    return registerConnectable(arg0, builder.build())
}

public inline fun INetworkLoadBalancerMetrics.activeFlowCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return activeFlowCount(builder.build())
}

public inline fun INetworkLoadBalancerMetrics.consumedLCUs(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return consumedLCUs(builder.build())
}

public inline fun INetworkLoadBalancerMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

public inline fun INetworkLoadBalancerMetrics.newFlowCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return newFlowCount(builder.build())
}

public inline fun INetworkLoadBalancerMetrics.processedBytes(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return processedBytes(builder.build())
}

public inline fun INetworkLoadBalancerMetrics.tcpClientResetCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return tcpClientResetCount(builder.build())
}

public inline fun INetworkLoadBalancerMetrics.tcpElbResetCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return tcpElbResetCount(builder.build())
}

public inline fun INetworkLoadBalancerMetrics.tcpTargetResetCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return tcpTargetResetCount(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

public inline fun IApplicationTargetGroupMetrics.healthyHostCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return healthyHostCount(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.httpCodeTarget(
    arg0: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpCodeTarget(arg0, builder.build())
}

public inline fun IApplicationTargetGroupMetrics.ipv6RequestCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ipv6RequestCount(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.requestCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return requestCount(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.requestCountPerTarget(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return requestCountPerTarget(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.targetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetConnectionErrorCount(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.targetResponseTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetResponseTime(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.targetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetTLSNegotiationErrorCount(builder.build())
}

public inline fun IApplicationTargetGroupMetrics.unhealthyHostCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return unhealthyHostCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.activeConnectionCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return activeConnectionCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.clientTlsNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return clientTlsNegotiationErrorCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.consumedLCUs(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return consumedLCUs(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.elbAuthError(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthError(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.elbAuthFailure(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthFailure(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.elbAuthLatency(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthLatency(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.elbAuthSuccess(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return elbAuthSuccess(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.httpCodeElb(
    arg0: HttpCodeElb,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpCodeElb(arg0, builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.httpCodeTarget(
    arg0: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpCodeTarget(arg0, builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.httpFixedResponseCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpFixedResponseCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.httpRedirectCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpRedirectCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.httpRedirectUrlLimitExceededCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return httpRedirectUrlLimitExceededCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.ipv6ProcessedBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ipv6ProcessedBytes(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.ipv6RequestCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ipv6RequestCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.newConnectionCount(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return newConnectionCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.processedBytes(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return processedBytes(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.rejectedConnectionCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return rejectedConnectionCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.requestCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return requestCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.ruleEvaluations(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return ruleEvaluations(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.targetConnectionErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetConnectionErrorCount(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.targetResponseTime(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetResponseTime(builder.build())
}

public inline fun IApplicationLoadBalancerMetrics.targetTLSNegotiationErrorCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return targetTLSNegotiationErrorCount(builder.build())
}

public inline fun INetworkTargetGroupMetrics.custom(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return custom(arg0, builder.build())
}

public inline fun INetworkTargetGroupMetrics.healthyHostCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return healthyHostCount(builder.build())
}

public inline fun INetworkTargetGroupMetrics.unHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return unHealthyHostCount(builder.build())
}

public inline fun IApplicationLoadBalancer.addListener(
    arg0: String,
    block: BaseApplicationListenerPropsDsl.() -> Unit = {},
): ApplicationListener {
    val builder = BaseApplicationListenerPropsDsl()
    builder.apply(block)
    return addListener(arg0, builder.build())
}

public inline fun INetworkLoadBalancer.addListener(
    arg0: String,
    block: BaseNetworkListenerPropsDsl.() -> Unit = {},
): NetworkListener {
    val builder = BaseNetworkListenerPropsDsl()
    builder.apply(block)
    return addListener(arg0, builder.build())
}

public inline fun TargetGroupBase.configureHealthCheck(block: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(block)
    return configureHealthCheck(builder.build())
}

public inline fun TargetGroupBase.setHealthCheck(block: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(block)
    return setHealthCheck(builder.build())
}

public inline fun NetworkListener.addAction(
    _id: String,
    block: AddNetworkActionPropsDsl.() -> Unit =
        {},
) {
    val builder = AddNetworkActionPropsDsl()
    builder.apply(block)
    return addAction(_id, builder.build())
}

public inline fun NetworkListener.addTargets(
    id: String,
    block: AddNetworkTargetsPropsDsl.() -> Unit =
        {},
): NetworkTargetGroup {
    val builder = AddNetworkTargetsPropsDsl()
    builder.apply(block)
    return addTargets(id, builder.build())
}

public inline fun NetworkTargetGroup.metricHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricHealthyHostCount(builder.build())
}

public inline fun NetworkTargetGroup.metricUnHealthyHostCount(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricUnHealthyHostCount(builder.build())
}

public inline fun CfnTargetGroup.setMatcher(
    block: CfnTargetGroupMatcherPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnTargetGroupMatcherPropertyDsl()
    builder.apply(block)
    return setMatcher(builder.build())
}
