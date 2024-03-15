@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for adding new targets to a listener.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup;
 * AutoScalingGroup asg;
 * Vpc vpc;
 * // Create the load balancer in a VPC. 'internetFacing' is 'false'
 * // by default, which creates an internal load balancer.
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // Add a listener and open up the load balancer's security group
 * // to the world.
 * ApplicationListener listener = lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(80)
 * // 'open: true' is the default, you can leave it out if you want. Set it
 * // to 'false' and use `listener.connections` if you want to be selective
 * // about who can access the load balancer.
 * .open(true)
 * .build());
 * // Create an AutoScaling group and add it as a load balancing
 * // target to the listener.
 * listener.addTargets("ApplicationFleet", AddApplicationTargetsProps.builder()
 * .port(8080)
 * .targets(List.of(asg))
 * .build());
 * ```
 */
public interface AddApplicationTargetsProps : AddRuleProps {
  /**
   * The amount of time for Elastic Load Balancing to wait before deregistering a target.
   *
   * The range is 0-3600 seconds.
   *
   * Default: Duration.minutes(5)
   */
  public fun deregistrationDelay(): Duration? =
      unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

  /**
   * Health check configuration.
   *
   * Default: - The default value for each property in this configuration varies depending on the
   * target.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
   */
  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  /**
   * The load balancing algorithm to select targets for routing requests.
   *
   * Default: round_robin.
   */
  public fun loadBalancingAlgorithmType(): TargetGroupLoadBalancingAlgorithmType? =
      unwrap(this).getLoadBalancingAlgorithmType()?.let(TargetGroupLoadBalancingAlgorithmType::wrap)

  /**
   * The port on which the listener listens for requests.
   *
   * Default: Determined from protocol if known
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The protocol to use.
   *
   * Default: Determined from port if known
   */
  public fun protocol(): ApplicationProtocol? =
      unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * The protocol version to use.
   *
   * Default: ApplicationProtocolVersion.HTTP1
   */
  public fun protocolVersion(): ApplicationProtocolVersion? =
      unwrap(this).getProtocolVersion()?.let(ApplicationProtocolVersion::wrap)

  /**
   * The time period during which the load balancer sends a newly registered target a linearly
   * increasing share of the traffic to the target group.
   *
   * The range is 30-900 seconds (15 minutes).
   *
   * Default: 0
   */
  public fun slowStart(): Duration? = unwrap(this).getSlowStart()?.let(Duration::wrap)

  /**
   * The stickiness cookie expiration period.
   *
   * Setting this value enables load balancer stickiness.
   *
   * After this period, the cookie is considered stale. The minimum value is
   * 1 second and the maximum value is 7 days (604800 seconds).
   *
   * Default: Stickiness disabled
   */
  public fun stickinessCookieDuration(): Duration? =
      unwrap(this).getStickinessCookieDuration()?.let(Duration::wrap)

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
   */
  public fun stickinessCookieName(): String? = unwrap(this).getStickinessCookieName()

  /**
   * The name of the target group.
   *
   * This name must be unique per region per account, can have a maximum of
   * 32 characters, must contain only alphanumeric characters or hyphens, and
   * must not begin or end with a hyphen.
   *
   * Default: Automatically generated
   */
  public fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

  /**
   * The targets to add to this target group.
   *
   * Can be `Instance`, `IPAddress`, or any self-registering load balancing
   * target. All target must be of the same type.
   */
  public fun targets(): List<IApplicationLoadBalancerTarget> =
      unwrap(this).getTargets()?.map(IApplicationLoadBalancerTarget::wrap) ?: emptyList()

  /**
   * A builder for [AddApplicationTargetsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param conditions Rule applies if matches the conditions.
     */
    public fun conditions(conditions: List<ListenerCondition>)

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    public fun conditions(vararg conditions: ListenerCondition)

    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target.
     * The range is 0-3600 seconds.
     */
    public fun deregistrationDelay(deregistrationDelay: Duration)

    /**
     * @param healthCheck Health check configuration.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param healthCheck Health check configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6f55b95bf0e01bd41dfdb5a4b30c87f807a05fadebff1e920ae80f78ded647")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * @param loadBalancingAlgorithmType The load balancing algorithm to select targets for routing
     * requests.
     */
    public
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType)

    /**
     * @param port The port on which the listener listens for requests.
     */
    public fun port(port: Number)

    /**
     * @param priority Priority of this target group.
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number)

    /**
     * @param protocol The protocol to use.
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * @param protocolVersion The protocol version to use.
     */
    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion)

    /**
     * @param slowStart The time period during which the load balancer sends a newly registered
     * target a linearly increasing share of the traffic to the target group.
     * The range is 30-900 seconds (15 minutes).
     */
    public fun slowStart(slowStart: Duration)

    /**
     * @param stickinessCookieDuration The stickiness cookie expiration period.
     * Setting this value enables load balancer stickiness.
     *
     * After this period, the cookie is considered stale. The minimum value is
     * 1 second and the maximum value is 7 days (604800 seconds).
     */
    public fun stickinessCookieDuration(stickinessCookieDuration: Duration)

    /**
     * @param stickinessCookieName The name of an application-based stickiness cookie.
     * Names that start with the following prefixes are not allowed: AWSALB, AWSALBAPP,
     * and AWSALBTG; they're reserved for use by the load balancer.
     *
     * Note: `stickinessCookieName` parameter depends on the presence of `stickinessCookieDuration`
     * parameter.
     * If `stickinessCookieDuration` is not set, `stickinessCookieName` will be omitted.
     */
    public fun stickinessCookieName(stickinessCookieName: String)

    /**
     * @param targetGroupName The name of the target group.
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     */
    public fun targetGroupName(targetGroupName: String)

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. All target must be of the same type.
     */
    public fun targets(targets: List<IApplicationLoadBalancerTarget>)

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. All target must be of the same type.
     */
    public fun targets(vararg targets: IApplicationLoadBalancerTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps.builder()

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
    }

    /**
     * @param conditions Rule applies if matches the conditions.
     */
    override fun conditions(vararg conditions: ListenerCondition): Unit =
        conditions(conditions.toList())

    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target.
     * The range is 0-3600 seconds.
     */
    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6f55b95bf0e01bd41dfdb5a4b30c87f807a05fadebff1e920ae80f78ded647")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * @param loadBalancingAlgorithmType The load balancing algorithm to select targets for routing
     * requests.
     */
    override
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType) {
      cdkBuilder.loadBalancingAlgorithmType(loadBalancingAlgorithmType.let(TargetGroupLoadBalancingAlgorithmType::unwrap))
    }

    /**
     * @param port The port on which the listener listens for requests.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param priority Priority of this target group.
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param protocol The protocol to use.
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * @param protocolVersion The protocol version to use.
     */
    override fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
      cdkBuilder.protocolVersion(protocolVersion.let(ApplicationProtocolVersion::unwrap))
    }

    /**
     * @param slowStart The time period during which the load balancer sends a newly registered
     * target a linearly increasing share of the traffic to the target group.
     * The range is 30-900 seconds (15 minutes).
     */
    override fun slowStart(slowStart: Duration) {
      cdkBuilder.slowStart(slowStart.let(Duration::unwrap))
    }

    /**
     * @param stickinessCookieDuration The stickiness cookie expiration period.
     * Setting this value enables load balancer stickiness.
     *
     * After this period, the cookie is considered stale. The minimum value is
     * 1 second and the maximum value is 7 days (604800 seconds).
     */
    override fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
      cdkBuilder.stickinessCookieDuration(stickinessCookieDuration.let(Duration::unwrap))
    }

    /**
     * @param stickinessCookieName The name of an application-based stickiness cookie.
     * Names that start with the following prefixes are not allowed: AWSALB, AWSALBAPP,
     * and AWSALBTG; they're reserved for use by the load balancer.
     *
     * Note: `stickinessCookieName` parameter depends on the presence of `stickinessCookieDuration`
     * parameter.
     * If `stickinessCookieDuration` is not set, `stickinessCookieName` will be omitted.
     */
    override fun stickinessCookieName(stickinessCookieName: String) {
      cdkBuilder.stickinessCookieName(stickinessCookieName)
    }

    /**
     * @param targetGroupName The name of the target group.
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     */
    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. All target must be of the same type.
     */
    override fun targets(targets: List<IApplicationLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(IApplicationLoadBalancerTarget::unwrap))
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. All target must be of the same type.
     */
    override fun targets(vararg targets: IApplicationLoadBalancerTarget): Unit =
        targets(targets.toList())

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps,
  ) : CdkObject(cdkObject), AddApplicationTargetsProps {
    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     */
    override fun conditions(): List<ListenerCondition> =
        unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: Duration.minutes(5)
     */
    override fun deregistrationDelay(): Duration? =
        unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * The load balancing algorithm to select targets for routing requests.
     *
     * Default: round_robin.
     */
    override fun loadBalancingAlgorithmType(): TargetGroupLoadBalancingAlgorithmType? =
        unwrap(this).getLoadBalancingAlgorithmType()?.let(TargetGroupLoadBalancingAlgorithmType::wrap)

    /**
     * The port on which the listener listens for requests.
     *
     * Default: Determined from protocol if known
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * Priority of this target group.
     *
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     *
     * Default: Target groups are used as defaults
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The protocol to use.
     *
     * Default: Determined from port if known
     */
    override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     */
    override fun protocolVersion(): ApplicationProtocolVersion? =
        unwrap(this).getProtocolVersion()?.let(ApplicationProtocolVersion::wrap)

    /**
     * The time period during which the load balancer sends a newly registered target a linearly
     * increasing share of the traffic to the target group.
     *
     * The range is 30-900 seconds (15 minutes).
     *
     * Default: 0
     */
    override fun slowStart(): Duration? = unwrap(this).getSlowStart()?.let(Duration::wrap)

    /**
     * The stickiness cookie expiration period.
     *
     * Setting this value enables load balancer stickiness.
     *
     * After this period, the cookie is considered stale. The minimum value is
     * 1 second and the maximum value is 7 days (604800 seconds).
     *
     * Default: Stickiness disabled
     */
    override fun stickinessCookieDuration(): Duration? =
        unwrap(this).getStickinessCookieDuration()?.let(Duration::wrap)

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
     */
    override fun stickinessCookieName(): String? = unwrap(this).getStickinessCookieName()

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     *
     * Default: Automatically generated
     */
    override fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. All target must be of the same type.
     */
    override fun targets(): List<IApplicationLoadBalancerTarget> =
        unwrap(this).getTargets()?.map(IApplicationLoadBalancerTarget::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddApplicationTargetsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps):
        AddApplicationTargetsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApplicationTargetsProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps
  }
}
