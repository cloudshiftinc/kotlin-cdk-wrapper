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
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType
import software.constructs.Construct

/**
 * Define an Application Target Group.
 *
 * Example:
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
@CdkDslMarker
public class ApplicationTargetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ApplicationTargetGroup.Builder =
        ApplicationTargetGroup.Builder.create(scope, id)

    private val _targets: MutableList<IApplicationLoadBalancerTarget> = mutableListOf()

    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
     *
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     *   deregistering a target.
     */
    public fun deregistrationDelay(deregistrationDelay: Duration) {
        cdkBuilder.deregistrationDelay(deregistrationDelay)
    }

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     *
     * @param healthCheck Health check configuration.
     */
    public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(healthCheck)
        cdkBuilder.healthCheck(builder.build())
    }

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     *
     * @param healthCheck Health check configuration.
     */
    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * The load balancing algorithm to select targets for routing requests.
     *
     * Default: TargetGroupLoadBalancingAlgorithmType.ROUND_ROBIN
     *
     * @param loadBalancingAlgorithmType The load balancing algorithm to select targets for routing
     *   requests.
     */
    public fun loadBalancingAlgorithmType(
        loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType
    ) {
        cdkBuilder.loadBalancingAlgorithmType(loadBalancingAlgorithmType)
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
    public fun port(port: Number) {
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
    public fun protocol(protocol: ApplicationProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * The protocol version to use.
     *
     * Default: ApplicationProtocolVersion.HTTP1
     *
     * @param protocolVersion The protocol version to use.
     */
    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
        cdkBuilder.protocolVersion(protocolVersion)
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
     *   target a linearly increasing share of the traffic to the target group.
     */
    public fun slowStart(slowStart: Duration) {
        cdkBuilder.slowStart(slowStart)
    }

    /**
     * The stickiness cookie expiration period.
     *
     * Setting this value enables load balancer stickiness.
     *
     * After this period, the cookie is considered stale. The minimum value is 1 second and the
     * maximum value is 7 days (604800 seconds).
     *
     * Default: Duration.days(1)
     *
     * @param stickinessCookieDuration The stickiness cookie expiration period.
     */
    public fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
        cdkBuilder.stickinessCookieDuration(stickinessCookieDuration)
    }

    /**
     * The name of an application-based stickiness cookie.
     *
     * Names that start with the following prefixes are not allowed: AWSALB, AWSALBAPP, and
     * AWSALBTG; they're reserved for use by the load balancer.
     *
     * Note: `stickinessCookieName` parameter depends on the presence of `stickinessCookieDuration`
     * parameter. If `stickinessCookieDuration` is not set, `stickinessCookieName` will be omitted.
     *
     * Default: - If `stickinessCookieDuration` is set, a load-balancer generated cookie is used.
     * Otherwise, no stickiness is defined.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/sticky-sessions.html)
     *
     * @param stickinessCookieName The name of an application-based stickiness cookie.
     */
    public fun stickinessCookieName(stickinessCookieName: String) {
        cdkBuilder.stickinessCookieName(stickinessCookieName)
    }

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     *
     * Default: - Automatically generated.
     *
     * @param targetGroupName The name of the target group.
     */
    public fun targetGroupName(targetGroupName: String) {
        cdkBuilder.targetGroupName(targetGroupName)
    }

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you register targets to the
     * TargetGroup in the CDK app, the TargetType is determined automatically.
     *
     * Default: - Determined automatically.
     *
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     */
    public fun targetType(targetType: TargetType) {
        cdkBuilder.targetType(targetType)
    }

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing target. If you use
     * either `Instance` or `IPAddress` as targets, all target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group.
     */
    public fun targets(vararg targets: IApplicationLoadBalancerTarget) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * The targets to add to this target group.
     *
     * Can be `Instance`, `IPAddress`, or any self-registering load balancing target. If you use
     * either `Instance` or `IPAddress` as targets, all target must be of the same type.
     *
     * Default: - No targets.
     *
     * @param targets The targets to add to this target group.
     */
    public fun targets(targets: Collection<IApplicationLoadBalancerTarget>) {
        _targets.addAll(targets)
    }

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     *
     * @param vpc The virtual private cloud (VPC).
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ApplicationTargetGroup {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
