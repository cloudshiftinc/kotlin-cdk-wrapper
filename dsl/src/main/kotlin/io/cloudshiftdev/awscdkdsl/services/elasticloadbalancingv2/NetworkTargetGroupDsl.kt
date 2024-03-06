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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType
import software.constructs.Construct

/**
 * Define a Network Target Group.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * LoadBalancer clb;
 * ApplicationLoadBalancer alb;
 * NetworkLoadBalancer nlb;
 * ApplicationListener albListener = alb.addListener("ALBListener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * ApplicationTargetGroup albTargetGroup = albListener.addTargets("ALBFleet",
 * AddApplicationTargetsProps.builder().port(80).build());
 * NetworkListener nlbListener = nlb.addListener("NLBListener",
 * BaseNetworkListenerProps.builder().port(80).build());
 * NetworkTargetGroup nlbTargetGroup = nlbListener.addTargets("NLBFleet",
 * AddNetworkTargetsProps.builder().port(80).build());
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "DeploymentGroup")
 * .loadBalancers(List.of(LoadBalancer.classic(clb), LoadBalancer.application(albTargetGroup),
 * LoadBalancer.network(nlbTargetGroup)))
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkTargetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: NetworkTargetGroup.Builder =
        NetworkTargetGroup.Builder.create(scope, id)

    private val _targets: MutableList<INetworkLoadBalancerTarget> = mutableListOf()

    /**
     * Indicates whether the load balancer terminates connections at the end of the deregistration
     * timeout.
     *
     * Default: false
     *
     * @param connectionTermination Indicates whether the load balancer terminates connections at
     *   the end of the deregistration timeout.
     */
    public fun connectionTermination(connectionTermination: Boolean) {
        cdkBuilder.connectionTermination(connectionTermination)
    }

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
     * The port on which the target receives traffic.
     *
     * @param port The port on which the target receives traffic.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * Indicates whether client IP preservation is enabled.
     *
     * Default: false if the target group type is IP address and the target group protocol is TCP or
     * TLS. Otherwise, true.
     *
     * @param preserveClientIp Indicates whether client IP preservation is enabled.
     */
    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
     *
     * Default: - TCP
     *
     * @param protocol Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP.
     */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * Indicates whether Proxy Protocol version 2 is enabled.
     *
     * Default: false
     *
     * @param proxyProtocolV2 Indicates whether Proxy Protocol version 2 is enabled.
     */
    public fun proxyProtocolV2(proxyProtocolV2: Boolean) {
        cdkBuilder.proxyProtocolV2(proxyProtocolV2)
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
    public fun targets(vararg targets: INetworkLoadBalancerTarget) {
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
    public fun targets(targets: Collection<INetworkLoadBalancerTarget>) {
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

    public fun build(): NetworkTargetGroup {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
