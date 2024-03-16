@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining an Application Target Group.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * // Target group with duration-based stickiness with load-balancer generated cookie
 * ApplicationTargetGroup tg1 = ApplicationTargetGroup.Builder.create(this, "TG1")
 * .targetType(TargetType.INSTANCE)
 * .port(80)
 * .stickinessCookieDuration(Duration.minutes(5))
 * .vpc(vpc)
 * .build();
 * // Target group with application-based stickiness
 * ApplicationTargetGroup tg2 = ApplicationTargetGroup.Builder.create(this, "TG2")
 * .targetType(TargetType.INSTANCE)
 * .port(80)
 * .stickinessCookieDuration(Duration.minutes(5))
 * .stickinessCookieName("MyDeliciousCookie")
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface ApplicationTargetGroupProps : BaseTargetGroupProps {
  /**
   * The load balancing algorithm to select targets for routing requests.
   *
   * Default: TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN
   */
  public fun loadBalancingAlgorithmType(): TargetGroupLoadBalancingAlgorithmType? =
      unwrap(this).getLoadBalancingAlgorithmType()?.let(TargetGroupLoadBalancingAlgorithmType::wrap)

  /**
   * The port on which the target receives traffic.
   *
   * This is not applicable for Lambda targets.
   *
   * Default: - Determined from protocol if known
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The protocol used for communication with the target.
   *
   * This is not applicable for Lambda targets.
   *
   * Default: - Determined from port if known
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
   * Default: Duration.days(1)
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
   * The targets to add to this target group.
   *
   * Can be `Instance`, `IPAddress`, or any self-registering load balancing
   * target. If you use either `Instance` or `IPAddress` as targets, all
   * target must be of the same type.
   *
   * Default: - No targets.
   */
  public fun targets(): List<IApplicationLoadBalancerTarget> =
      unwrap(this).getTargets()?.map(IApplicationLoadBalancerTarget::wrap) ?: emptyList()

  /**
   * A builder for [ApplicationTargetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    @JvmName("c2f995ba5117b9a831a822de8f1aeeb5b308203b530fc36a5e89ae1795c1671a")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * @param loadBalancingAlgorithmType The load balancing algorithm to select targets for routing
     * requests.
     */
    public
        fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType)

    /**
     * @param port The port on which the target receives traffic.
     * This is not applicable for Lambda targets.
     */
    public fun port(port: Number)

    /**
     * @param protocol The protocol used for communication with the target.
     * This is not applicable for Lambda targets.
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
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     */
    public fun targetType(targetType: TargetType)

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    public fun targets(targets: List<IApplicationLoadBalancerTarget>)

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    public fun targets(vararg targets: IApplicationLoadBalancerTarget)

    /**
     * @param vpc The virtual private cloud (VPC).
     * only if `TargetType` is `Ip` or `InstanceId`
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps.builder()

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
    @JvmName("c2f995ba5117b9a831a822de8f1aeeb5b308203b530fc36a5e89ae1795c1671a")
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
     * @param port The port on which the target receives traffic.
     * This is not applicable for Lambda targets.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol used for communication with the target.
     * This is not applicable for Lambda targets.
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
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     */
    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType::unwrap))
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    override fun targets(targets: List<IApplicationLoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(IApplicationLoadBalancerTarget::unwrap))
    }

    /**
     * @param targets The targets to add to this target group.
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     */
    override fun targets(vararg targets: IApplicationLoadBalancerTarget): Unit =
        targets(targets.toList())

    /**
     * @param vpc The virtual private cloud (VPC).
     * only if `TargetType` is `Ip` or `InstanceId`
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps,
  ) : CdkObject(cdkObject), ApplicationTargetGroupProps {
    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
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
     * Default: TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN
     */
    override fun loadBalancingAlgorithmType(): TargetGroupLoadBalancingAlgorithmType? =
        unwrap(this).getLoadBalancingAlgorithmType()?.let(TargetGroupLoadBalancingAlgorithmType::wrap)

    /**
     * The port on which the target receives traffic.
     *
     * This is not applicable for Lambda targets.
     *
     * Default: - Determined from protocol if known
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol used for communication with the target.
     *
     * This is not applicable for Lambda targets.
     *
     * Default: - Determined from port if known
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
     * Default: Duration.days(1)
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
     * Default: - Automatically generated.
     */
    override fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     *
     * Default: - Determined automatically.
     */
    override fun targetType(): TargetType? = unwrap(this).getTargetType()?.let(TargetType::wrap)

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing
     * target. If you use either `Instance` or `IPAddress` as targets, all
     * target must be of the same type.
     *
     * Default: - No targets.
     */
    override fun targets(): List<IApplicationLoadBalancerTarget> =
        unwrap(this).getTargets()?.map(IApplicationLoadBalancerTarget::wrap) ?: emptyList()

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps):
        ApplicationTargetGroupProps = CdkObjectWrappers.wrap(cdkObject) as
        ApplicationTargetGroupProps

    internal fun unwrap(wrapped: ApplicationTargetGroupProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
  }
}
