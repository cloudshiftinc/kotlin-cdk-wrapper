@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.Port
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define an Application Target Group.
 *
 * Example:
 *
 * ```
 * ApplicationLoadBalancer alb;
 * ApplicationListener listener = alb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * ApplicationTargetGroup targetGroup = listener.addTargets("Fleet",
 * AddApplicationTargetsProps.builder().port(80).build());
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "DeploymentGroup")
 * .loadBalancer(LoadBalancer.application(targetGroup))
 * .build();
 * ```
 */
public open class ApplicationTargetGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup,
) : TargetGroupBase(cdkObject), IApplicationTargetGroup {
  /**
   * Add a load balancing target to this target group.
   *
   * @param targets 
   */
  public override fun addTarget(vararg targets: IApplicationLoadBalancerTarget) {
    unwrap(this).addTarget(*targets.map(IApplicationLoadBalancerTarget::unwrap).toTypedArray())
  }

  /**
   * Enable sticky routing via a cookie to members of this target group.
   *
   * Note: If the `cookieName` parameter is set, application-based stickiness will be applied,
   * otherwise it defaults to duration-based stickiness attributes (`lb_cookie`).
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/sticky-sessions.html)
   * @param duration 
   * @param cookieName
   */
  public open fun enableCookieStickiness(duration: Duration) {
    unwrap(this).enableCookieStickiness(duration.let(Duration::unwrap))
  }

  /**
   * Enable sticky routing via a cookie to members of this target group.
   *
   * Note: If the `cookieName` parameter is set, application-based stickiness will be applied,
   * otherwise it defaults to duration-based stickiness attributes (`lb_cookie`).
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/sticky-sessions.html)
   * @param duration 
   * @param cookieName
   */
  public open fun enableCookieStickiness(duration: Duration, cookieName: String) {
    unwrap(this).enableCookieStickiness(duration.let(Duration::unwrap), cookieName)
  }

  /**
   * Full name of first load balancer.
   */
  public override fun firstLoadBalancerFullName(): String =
      unwrap(this).getFirstLoadBalancerFullName()

  /**
   * Return the given named metric for this Application Load Balancer Target Group.
   *
   * Returns the metric for this target group from the point of view of the first
   * load balancer load balancing to it. If you have multiple load balancers load
   * sending traffic to the same target group, you will have to override the dimensions
   * on this metric.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Application Load Balancer Target Group.
   *
   * Returns the metric for this target group from the point of view of the first
   * load balancer load balancing to it. If you have multiple load balancers load
   * sending traffic to the same target group, you will have to override the dimensions
   * on this metric.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Application Load Balancer Target Group.
   *
   * Returns the metric for this target group from the point of view of the first
   * load balancer load balancing to it. If you have multiple load balancers load
   * sending traffic to the same target group, you will have to override the dimensions
   * on this metric.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * (deprecated) The number of healthy hosts in the target group.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(): Metric =
      unwrap(this).metricHealthyHostCount().let(Metric::wrap)

  /**
   * (deprecated) The number of healthy hosts in the target group.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricHealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of healthy hosts in the target group.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.healthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd2021699bf4459818ab9875d89c7bd44524bb3ba873974adc6684a32214f8fc")
  public open fun metricHealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHealthyHostCount(MetricOptions(props))

  /**
   * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in this
   * target group.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.httpCodeTarget` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in this
   * target group.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.httpCodeTarget` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget, props: MetricOptions): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in this
   * target group.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.httpCodeTarget` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("121a82afa7f74fa036d0dc74440ef0d024223acab827324eda17b612a9012454")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget,
      props: MetricOptions.Builder.() -> Unit): Metric = metricHttpCodeTarget(code,
      MetricOptions(props))

  /**
   * (deprecated) The number of IPv6 requests received by the target group.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.ipv6RequestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(): Metric =
      unwrap(this).metricIpv6RequestCount().let(Metric::wrap)

  /**
   * (deprecated) The number of IPv6 requests received by the target group.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.ipv6RequestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(props: MetricOptions): Metric =
      unwrap(this).metricIpv6RequestCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of IPv6 requests received by the target group.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.ipv6RequestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7cb2b61a2d0456f8f0f6806cc31cbb006c4e1f7f92ce14af7aae5ed4fcb572d1")
  public open fun metricIpv6RequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIpv6RequestCount(MetricOptions(props))

  /**
   * (deprecated) The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.requestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(): Metric = unwrap(this).metricRequestCount().let(Metric::wrap)

  /**
   * (deprecated) The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.requestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(props: MetricOptions): Metric =
      unwrap(this).metricRequestCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.requestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a6855b6eecd989b6fd05d9eadf7997928023d1bd51a53703a9bb975518c563c2")
  public open fun metricRequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequestCount(MetricOptions(props))

  /**
   * (deprecated) The average number of requests received by each target in a target group.
   *
   * The only valid statistic is Sum. Note that this represents the average not the sum.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.requestCountPerTarget` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCountPerTarget(): Metric =
      unwrap(this).metricRequestCountPerTarget().let(Metric::wrap)

  /**
   * (deprecated) The average number of requests received by each target in a target group.
   *
   * The only valid statistic is Sum. Note that this represents the average not the sum.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.requestCountPerTarget` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCountPerTarget(props: MetricOptions): Metric =
      unwrap(this).metricRequestCountPerTarget(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The average number of requests received by each target in a target group.
   *
   * The only valid statistic is Sum. Note that this represents the average not the sum.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.requestCountPerTarget` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1b50a7e3927206110e8b90bca18758b60d0a5d5e1e95ae3049a3e72c47b21bbd")
  public open fun metricRequestCountPerTarget(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequestCountPerTarget(MetricOptions(props))

  /**
   * (deprecated) The number of connections that were not successfully established between the load
   * balancer and target.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.targetConnectionErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(): Metric =
      unwrap(this).metricTargetConnectionErrorCount().let(Metric::wrap)

  /**
   * (deprecated) The number of connections that were not successfully established between the load
   * balancer and target.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.targetConnectionErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetConnectionErrorCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of connections that were not successfully established between the load
   * balancer and target.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.targetConnectionErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("89056777171dd65db09c827c4c0fa488d94a8c0bc618f5b80e0b582e570684fe")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions.Builder.() -> Unit): Metric
      = metricTargetConnectionErrorCount(MetricOptions(props))

  /**
   * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
   * response from the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.targetResponseTime` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(): Metric =
      unwrap(this).metricTargetResponseTime().let(Metric::wrap)

  /**
   * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
   * response from the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.targetResponseTime` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(props: MetricOptions): Metric =
      unwrap(this).metricTargetResponseTime(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
   * response from the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.targetResponseTime` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47cb9abec01142cff45f0038aa6de07ef9926f5c2b9b0dfe8af82ee727462c44")
  public open fun metricTargetResponseTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTargetResponseTime(MetricOptions(props))

  /**
   * (deprecated) The number of TLS connections initiated by the load balancer that did not
   * establish a session with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.tlsNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTlsNegotiationErrorCount(): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount().let(Metric::wrap)

  /**
   * (deprecated) The number of TLS connections initiated by the load balancer that did not
   * establish a session with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.tlsNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTlsNegotiationErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of TLS connections initiated by the load balancer that did not
   * establish a session with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.tlsNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6fb589e77244f79e7b207d6efccaa92a565bce39740975d0c083f19f8a1853d0")
  public open fun metricTargetTlsNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricTargetTlsNegotiationErrorCount(MetricOptions(props))

  /**
   * (deprecated) The number of unhealthy hosts in the target group.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.unhealthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnhealthyHostCount(): Metric =
      unwrap(this).metricUnhealthyHostCount().let(Metric::wrap)

  /**
   * (deprecated) The number of unhealthy hosts in the target group.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.unhealthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricUnhealthyHostCount(props: MetricOptions): Metric =
      unwrap(this).metricUnhealthyHostCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of unhealthy hosts in the target group.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationTargetGroup.metrics.unhealthyHostCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96e990ece6c5feaea1a29d4e3b77684015532abf9ccd8b065bf1ae1b263f90b9")
  public open fun metricUnhealthyHostCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricUnhealthyHostCount(MetricOptions(props))

  /**
   * All metrics available for this target group.
   */
  public override fun metrics(): IApplicationTargetGroupMetrics =
      unwrap(this).getMetrics().let(IApplicationTargetGroupMetrics::wrap)

  /**
   * Register a connectable as a member of this target group.
   *
   * Don't call this directly. It will be called by load balancing targets.
   *
   * @param connectable 
   * @param portRange
   */
  public override fun registerConnectable(connectable: IConnectable) {
    unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap))
  }

  /**
   * Register a connectable as a member of this target group.
   *
   * Don't call this directly. It will be called by load balancing targets.
   *
   * @param connectable 
   * @param portRange
   */
  public override fun registerConnectable(connectable: IConnectable, portRange: Port) {
    unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap),
        portRange.let(Port::unwrap))
  }

  /**
   * Register a connectable as a member of this target group.
   *
   * Don't call this directly. It will be called by load balancing targets.
   *
   * @param connectable 
   * @param portRange
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public override fun registerConnectable(connectable: IConnectable,
      portRange: Port.Builder.() -> Unit): Unit = registerConnectable(connectable, Port(portRange))

  /**
   * Register a listener that is load balancing to this target group.
   *
   * Don't call this directly. It will be called by listeners.
   *
   * @param listener 
   * @param associatingConstruct
   */
  public override fun registerListener(listener: IApplicationListener) {
    unwrap(this).registerListener(listener.let(IApplicationListener::unwrap))
  }

  /**
   * Register a listener that is load balancing to this target group.
   *
   * Don't call this directly. It will be called by listeners.
   *
   * @param listener 
   * @param associatingConstruct
   */
  public override fun registerListener(listener: IApplicationListener,
      associatingConstruct: IConstruct) {
    unwrap(this).registerListener(listener.let(IApplicationListener::unwrap),
        associatingConstruct.let(IConstruct::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
     *
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target. 
     */
    public fun deregistrationDelay(deregistrationDelay: Duration)

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05551a8897b13ef92696e78fac308b2def5ca4407866770b3893b34a21ead542")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * The load balancing algorithm to select targets for routing requests.
     *
     * Default: TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN
     *
     * @param loadBalancingAlgorithmType The load balancing algorithm to select targets for routing
     * requests. 
     */
    public
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType)

    /**
     * The port on which the target receives traffic.
     *
     * This is not applicable for Lambda targets.
     *
     * Default: - Determined from protocol if known
     *
     * @param port The port on which the target receives traffic. 
     */
    public fun port(port: Number)

    /**
     * The protocol used for communication with the target.
     *
     * This is not applicable for Lambda targets.
     *
     * Default: - Determined from port if known
     *
     * @param protocol The protocol used for communication with the target. 
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     *
     * @param protocolVersion The protocol version to use. 
     */
    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion)

    /**
     * The time period during which the load balancer sends a newly registered target a linearly
     * increasing share of the traffic to the target group.
     *
     * The range is 30-900 seconds (15 minutes).
     *
     * Default: 0
     *
     * @param slowStart The time period during which the load balancer sends a newly registered
     * target a linearly increasing share of the traffic to the target group. 
     */
    public fun slowStart(slowStart: Duration)

    /**
     * The stickiness cookie expiration period.
     *
     * Setting this value enables load balancer stickiness.
     *
     * After this period, the cookie is considered stale. The minimum value is
     * 1 second and the maximum value is 7 days (604800 seconds).
     *
     * Default: Duration.days(1)
     *
     * @param stickinessCookieDuration The stickiness cookie expiration period. 
     */
    public fun stickinessCookieDuration(stickinessCookieDuration: Duration)

    /**
     * The name of an application-based stickiness cookie.
     *
     * Names that start with the following prefixes are not allowed: AWSALB, AWSALBAPP,
     * and AWSALBTG; they're reserved for use by the load balancer.
     *
     * Note: `stickinessCookieName` parameter depends on the presence of `stickinessCookieDuration`
     * parameter.
     * If `stickinessCookieDuration` is not set, `stickinessCookieName` will be omitted.
     *
     * Default: - If `stickinessCookieDuration` is set, a load-balancer generated cookie is used.
     * Otherwise, no stickiness is defined.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/sticky-sessions.html)
     * @param stickinessCookieName The name of an application-based stickiness cookie. 
     */
    public fun stickinessCookieName(stickinessCookieName: String)

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     *
     * Default: - Automatically generated.
     *
     * @param targetGroupName The name of the target group. 
     */
    public fun targetGroupName(targetGroupName: String)

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     *
     * Default: - Determined automatically.
     *
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance. 
     */
    public fun targetType(targetType: TargetType)

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    public fun targets(targets: List<IApplicationLoadBalancerTarget>)

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    public fun targets(vararg targets: IApplicationLoadBalancerTarget)

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     *
     * @param vpc The virtual private cloud (VPC). 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup.Builder.create(scope,
        id)

    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
     *
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target. 
     */
    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     * @param healthCheck Health check configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05551a8897b13ef92696e78fac308b2def5ca4407866770b3893b34a21ead542")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * The load balancing algorithm to select targets for routing requests.
     *
     * Default: TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN
     *
     * @param loadBalancingAlgorithmType The load balancing algorithm to select targets for routing
     * requests. 
     */
    override
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType) {
      cdkBuilder.loadBalancingAlgorithmType(loadBalancingAlgorithmType.let(TargetGroupLoadBalancingAlgorithmType::unwrap))
    }

    /**
     * The port on which the target receives traffic.
     *
     * This is not applicable for Lambda targets.
     *
     * Default: - Determined from protocol if known
     *
     * @param port The port on which the target receives traffic. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The protocol used for communication with the target.
     *
     * This is not applicable for Lambda targets.
     *
     * Default: - Determined from port if known
     *
     * @param protocol The protocol used for communication with the target. 
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     *
     * @param protocolVersion The protocol version to use. 
     */
    override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion::unwrap))
    }

    /**
     * The time period during which the load balancer sends a newly registered target a linearly
     * increasing share of the traffic to the target group.
     *
     * The range is 30-900 seconds (15 minutes).
     *
     * Default: 0
     *
     * @param slowStart The time period during which the load balancer sends a newly registered
     * target a linearly increasing share of the traffic to the target group. 
     */
    override fun slowStart(slowStart: Duration) {
      cdkBuilder.slowStart(slowStart.let(Duration::unwrap))
    }

    /**
     * The stickiness cookie expiration period.
     *
     * Setting this value enables load balancer stickiness.
     *
     * After this period, the cookie is considered stale. The minimum value is
     * 1 second and the maximum value is 7 days (604800 seconds).
     *
     * Default: Duration.days(1)
     *
     * @param stickinessCookieDuration The stickiness cookie expiration period. 
     */
    override fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
      cdkBuilder.stickinessCookieDuration(stickinessCookieDuration.let(Duration::unwrap))
    }

    /**
     * The name of an application-based stickiness cookie.
     *
     * Names that start with the following prefixes are not allowed: AWSALB, AWSALBAPP,
     * and AWSALBTG; they're reserved for use by the load balancer.
     *
     * Note: `stickinessCookieName` parameter depends on the presence of `stickinessCookieDuration`
     * parameter.
     * If `stickinessCookieDuration` is not set, `stickinessCookieName` will be omitted.
     *
     * Default: - If `stickinessCookieDuration` is set, a load-balancer generated cookie is used.
     * Otherwise, no stickiness is defined.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/sticky-sessions.html)
     * @param stickinessCookieName The name of an application-based stickiness cookie. 
     */
    override fun stickinessCookieName(stickinessCookieName: String) {
      cdkBuilder.stickinessCookieName(stickinessCookieName)
    }

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     *
     * Default: - Automatically generated.
     *
     * @param targetGroupName The name of the target group. 
     */
    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     *
     * Default: - Determined automatically.
     *
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance. 
     */
    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType::unwrap))
    }

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    override fun targets(targets: List<IApplicationLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(IApplicationLoadBalancerTarget::unwrap))
    }

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group. 
     */
    override fun targets(vararg targets: IApplicationLoadBalancerTarget): Unit =
        targets(targets.toList())

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     *
     * @param vpc The virtual private cloud (VPC). 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromTargetGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TargetGroupAttributes,
    ): IApplicationTargetGroup =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup.fromTargetGroupAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(TargetGroupAttributes::unwrap)).let(IApplicationTargetGroup::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22a0352b4305020b57f07768a4d7557c8f9f1dddb85c7eaaa8816f33b3ff9c2d")
    public fun fromTargetGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TargetGroupAttributes.Builder.() -> Unit,
    ): IApplicationTargetGroup = fromTargetGroupAttributes(scope, id, TargetGroupAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationTargetGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup):
        ApplicationTargetGroup = ApplicationTargetGroup(cdkObject)

    internal fun unwrap(wrapped: ApplicationTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup =
        wrapped.cdkObject
  }
}
