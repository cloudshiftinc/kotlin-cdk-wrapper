@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.ec2.PortDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb
import software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup

public inline fun ApplicationListener.addAction(arg0: String,
    block: AddApplicationActionPropsDsl.() -> Unit = {}) {
  val builder = AddApplicationActionPropsDsl()
  builder.apply(block)
  return addAction(arg0,builder.build())
}

public inline fun ApplicationListener.addTargetGroups(arg0: String,
    block: AddApplicationTargetGroupsPropsDsl.() -> Unit = {}) {
  val builder = AddApplicationTargetGroupsPropsDsl()
  builder.apply(block)
  return addTargetGroups(arg0,builder.build())
}

public inline fun ApplicationListener.addTargets(arg0: String,
    block: AddApplicationTargetsPropsDsl.() -> Unit = {}): ApplicationTargetGroup {
  val builder = AddApplicationTargetsPropsDsl()
  builder.apply(block)
  return addTargets(arg0,builder.build())
}

public inline fun ApplicationListener.registerConnectable(arg0: IConnectable,
    block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return registerConnectable(arg0,builder.build())
}

public inline fun ApplicationLoadBalancer.addListener(arg0: String,
    block: BaseApplicationListenerPropsDsl.() -> Unit = {}): ApplicationListener {
  val builder = BaseApplicationListenerPropsDsl()
  builder.apply(block)
  return addListener(arg0,builder.build())
}

public inline
    fun ApplicationLoadBalancer.addRedirect(block: ApplicationLoadBalancerRedirectConfigDsl.() -> Unit
    = {}): ApplicationListener {
  val builder = ApplicationLoadBalancerRedirectConfigDsl()
  builder.apply(block)
  return addRedirect(builder.build())
}

public inline fun ApplicationLoadBalancer.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricActiveConnectionCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricActiveConnectionCount(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricClientTlsNegotiationErrorCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricClientTlsNegotiationErrorCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricConsumedLCUs(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConsumedLCUs(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthError(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricElbAuthError(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthFailure(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricElbAuthFailure(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthLatency(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricElbAuthLatency(builder.build())
}

public inline fun ApplicationLoadBalancer.metricElbAuthSuccess(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricElbAuthSuccess(builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpCodeElb(arg0: HttpCodeElb,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHttpCodeElb(arg0,builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpCodeTarget(arg0: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHttpCodeTarget(arg0,builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricHttpFixedResponseCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHttpFixedResponseCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricHttpRedirectCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHttpRedirectCount(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricHttpRedirectUrlLimitExceededCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHttpRedirectUrlLimitExceededCount(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricIpv6ProcessedBytes(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIpv6ProcessedBytes(builder.build())
}

public inline fun ApplicationLoadBalancer.metricIpv6RequestCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIpv6RequestCount(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricNewConnectionCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNewConnectionCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricProcessedBytes(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricProcessedBytes(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricRejectedConnectionCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRejectedConnectionCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricRequestCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRequestCount(builder.build())
}

public inline fun ApplicationLoadBalancer.metricRuleEvaluations(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRuleEvaluations(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricTargetConnectionErrorCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTargetConnectionErrorCount(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricTargetResponseTime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTargetResponseTime(builder.build())
}

public inline
    fun ApplicationLoadBalancer.metricTargetTLSNegotiationErrorCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTargetTLSNegotiationErrorCount(builder.build())
}

public inline fun ApplicationTargetGroup.configureHealthCheck(block: HealthCheckDsl.() -> Unit =
    {}) {
  val builder = HealthCheckDsl()
  builder.apply(block)
  return configureHealthCheck(builder.build())
}

public inline fun ApplicationTargetGroup.metric(arg0: String, block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun ApplicationTargetGroup.metricHealthyHostCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHealthyHostCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricHttpCodeTarget(arg0: HttpCodeTarget,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHttpCodeTarget(arg0,builder.build())
}

public inline fun ApplicationTargetGroup.metricIpv6RequestCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIpv6RequestCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricRequestCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRequestCount(builder.build())
}

public inline
    fun ApplicationTargetGroup.metricRequestCountPerTarget(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricRequestCountPerTarget(builder.build())
}

public inline
    fun ApplicationTargetGroup.metricTargetConnectionErrorCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTargetConnectionErrorCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricTargetResponseTime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTargetResponseTime(builder.build())
}

public inline
    fun ApplicationTargetGroup.metricTargetTLSNegotiationErrorCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTargetTLSNegotiationErrorCount(builder.build())
}

public inline fun ApplicationTargetGroup.metricUnhealthyHostCount(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricUnhealthyHostCount(builder.build())
}

public inline fun ApplicationTargetGroup.registerConnectable(arg0: IConnectable,
    block: PortDsl.() -> Unit = {}) {
  val builder = PortDsl()
  builder.apply(block)
  return registerConnectable(arg0,builder.build())
}

public inline fun ApplicationTargetGroup.setHealthCheck(block: HealthCheckDsl.() -> Unit = {}) {
  val builder = HealthCheckDsl()
  builder.apply(block)
  return setHealthCheck(builder.build())
}

public inline fun CfnListener.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnListenerCertificate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnListenerRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLoadBalancer.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTargetGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTargetGroup.setMatcher(block: CfnTargetGroupMatcherPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTargetGroupMatcherPropertyDsl()
  builder.apply(block)
  return setMatcher(builder.build())
}

public inline fun NetworkListener.addAction(arg0: String, block: AddNetworkActionPropsDsl.() -> Unit
    = {}) {
  val builder = AddNetworkActionPropsDsl()
  builder.apply(block)
  return addAction(arg0,builder.build())
}

public inline fun NetworkListener.addTargets(arg0: String,
    block: AddNetworkTargetsPropsDsl.() -> Unit = {}): NetworkTargetGroup {
  val builder = AddNetworkTargetsPropsDsl()
  builder.apply(block)
  return addTargets(arg0,builder.build())
}

public inline fun NetworkLoadBalancer.addListener(arg0: String,
    block: BaseNetworkListenerPropsDsl.() -> Unit = {}): NetworkListener {
  val builder = BaseNetworkListenerPropsDsl()
  builder.apply(block)
  return addListener(arg0,builder.build())
}

public inline fun NetworkLoadBalancer.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun NetworkLoadBalancer.metricActiveFlowCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricActiveFlowCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricConsumedLCUs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConsumedLCUs(builder.build())
}

public inline fun NetworkLoadBalancer.metricNewFlowCount(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNewFlowCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricProcessedBytes(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricProcessedBytes(builder.build())
}

public inline fun NetworkLoadBalancer.metricTcpClientResetCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTcpClientResetCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricTcpElbResetCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTcpElbResetCount(builder.build())
}

public inline fun NetworkLoadBalancer.metricTcpTargetResetCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTcpTargetResetCount(builder.build())
}

public inline fun NetworkTargetGroup.configureHealthCheck(block: HealthCheckDsl.() -> Unit = {}) {
  val builder = HealthCheckDsl()
  builder.apply(block)
  return configureHealthCheck(builder.build())
}

public inline fun NetworkTargetGroup.metricHealthyHostCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricHealthyHostCount(builder.build())
}

public inline fun NetworkTargetGroup.metricUnHealthyHostCount(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricUnHealthyHostCount(builder.build())
}

public inline fun NetworkTargetGroup.setHealthCheck(block: HealthCheckDsl.() -> Unit = {}) {
  val builder = HealthCheckDsl()
  builder.apply(block)
  return setHealthCheck(builder.build())
}
