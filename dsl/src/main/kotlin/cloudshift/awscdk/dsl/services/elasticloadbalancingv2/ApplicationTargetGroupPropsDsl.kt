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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType

/**
 * Properties for defining an Application Target Group.
 *
 * Example:
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
@CdkDslMarker
public class ApplicationTargetGroupPropsDsl {
    private val cdkBuilder: ApplicationTargetGroupProps.Builder =
        ApplicationTargetGroupProps.builder()

    private val _targets: MutableList<IApplicationLoadBalancerTarget> = mutableListOf()

    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     *   deregistering a target. The range is 0-3600 seconds.
     */
    public fun deregistrationDelay(deregistrationDelay: Duration) {
        cdkBuilder.deregistrationDelay(deregistrationDelay)
    }

    /** @param healthCheck Health check configuration. */
    public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(healthCheck)
        cdkBuilder.healthCheck(builder.build())
    }

    /** @param healthCheck Health check configuration. */
    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param loadBalancingAlgorithmType The load balancing algorithm to select targets for routing
     *   requests.
     */
    public fun loadBalancingAlgorithmType(
        loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType
    ) {
        cdkBuilder.loadBalancingAlgorithmType(loadBalancingAlgorithmType)
    }

    /**
     * @param port The port on which the target receives traffic. This is not applicable for Lambda
     *   targets.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol used for communication with the target. This is not applicable
     *   for Lambda targets.
     */
    public fun protocol(protocol: ApplicationProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /** @param protocolVersion The protocol version to use. */
    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
        cdkBuilder.protocolVersion(protocolVersion)
    }

    /**
     * @param slowStart The time period during which the load balancer sends a newly registered
     *   target a linearly increasing share of the traffic to the target group. The range is 30-900
     *   seconds (15 minutes).
     */
    public fun slowStart(slowStart: Duration) {
        cdkBuilder.slowStart(slowStart)
    }

    /**
     * @param stickinessCookieDuration The stickiness cookie expiration period. Setting this value
     *   enables load balancer stickiness.
     *
     * After this period, the cookie is considered stale. The minimum value is 1 second and the
     * maximum value is 7 days (604800 seconds).
     */
    public fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
        cdkBuilder.stickinessCookieDuration(stickinessCookieDuration)
    }

    /**
     * @param stickinessCookieName The name of an application-based stickiness cookie. Names that
     *   start with the following prefixes are not allowed: AWSALB, AWSALBAPP, and AWSALBTG; they're
     *   reserved for use by the load balancer.
     *
     * Note: `stickinessCookieName` parameter depends on the presence of `stickinessCookieDuration`
     * parameter. If `stickinessCookieDuration` is not set, `stickinessCookieName` will be omitted.
     */
    public fun stickinessCookieName(stickinessCookieName: String) {
        cdkBuilder.stickinessCookieName(stickinessCookieName)
    }

    /**
     * @param targetGroupName The name of the target group. This name must be unique per region per
     *   account, can have a maximum of 32 characters, must contain only alphanumeric characters or
     *   hyphens, and must not begin or end with a hyphen.
     */
    public fun targetGroupName(targetGroupName: String) {
        cdkBuilder.targetGroupName(targetGroupName)
    }

    /**
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     *   All targets registered into the group must be of this type. If you register targets to the
     *   TargetGroup in the CDK app, the TargetType is determined automatically.
     */
    public fun targetType(targetType: TargetType) {
        cdkBuilder.targetType(targetType)
    }

    /**
     * @param targets The targets to add to this target group. Can be `Instance`, `IPAddress`, or
     *   any self-registering load balancing target. If you use either `Instance` or `IPAddress` as
     *   targets, all target must be of the same type.
     */
    public fun targets(vararg targets: IApplicationLoadBalancerTarget) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * @param targets The targets to add to this target group. Can be `Instance`, `IPAddress`, or
     *   any self-registering load balancing target. If you use either `Instance` or `IPAddress` as
     *   targets, all target must be of the same type.
     */
    public fun targets(targets: Collection<IApplicationLoadBalancerTarget>) {
        _targets.addAll(targets)
    }

    /** @param vpc The virtual private cloud (VPC). only if `TargetType` is `Ip` or `InstanceId` */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ApplicationTargetGroupProps {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
