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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType

/**
 * Properties for adding new targets to a listener.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.autoscaling.AutoScalingGroup;
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
@CdkDslMarker
public class AddApplicationTargetsPropsDsl {
    private val cdkBuilder: AddApplicationTargetsProps.Builder =
        AddApplicationTargetsProps.builder()

    private val _conditions: MutableList<ListenerCondition> = mutableListOf()

    private val _targets: MutableList<IApplicationLoadBalancerTarget> = mutableListOf()

    /** @param conditions Rule applies if matches the conditions. */
    public fun conditions(vararg conditions: ListenerCondition) {
        _conditions.addAll(listOf(*conditions))
    }

    /** @param conditions Rule applies if matches the conditions. */
    public fun conditions(conditions: Collection<ListenerCondition>) {
        _conditions.addAll(conditions)
    }

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

    /** @param port The port on which the listener listens for requests. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param priority Priority of this target group. The rule with the lowest priority will be used
     *   for every request. If priority is not given, these target groups will be added as defaults,
     *   and must not have conditions.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param protocol The protocol to use. */
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
     * @param targets The targets to add to this target group. Can be `Instance`, `IPAddress`, or
     *   any self-registering load balancing target. All target must be of the same type.
     */
    public fun targets(vararg targets: IApplicationLoadBalancerTarget) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * @param targets The targets to add to this target group. Can be `Instance`, `IPAddress`, or
     *   any self-registering load balancing target. All target must be of the same type.
     */
    public fun targets(targets: Collection<IApplicationLoadBalancerTarget>) {
        _targets.addAll(targets)
    }

    public fun build(): AddApplicationTargetsProps {
        if (_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
