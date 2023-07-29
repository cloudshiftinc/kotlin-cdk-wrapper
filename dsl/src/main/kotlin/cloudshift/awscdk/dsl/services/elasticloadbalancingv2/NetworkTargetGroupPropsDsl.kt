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
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType

/**
 * Properties for a new Network Target Group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * INetworkLoadBalancerTarget networkLoadBalancerTarget;
 * Vpc vpc;
 * NetworkTargetGroupProps networkTargetGroupProps = NetworkTargetGroupProps.builder()
 * .port(123)
 * // the properties below are optional
 * .connectionTermination(false)
 * .deregistrationDelay(Duration.minutes(30))
 * .healthCheck(HealthCheck.builder()
 * .enabled(false)
 * .healthyGrpcCodes("healthyGrpcCodes")
 * .healthyHttpCodes("healthyHttpCodes")
 * .healthyThresholdCount(123)
 * .interval(Duration.minutes(30))
 * .path("path")
 * .port("port")
 * .protocol(Protocol.HTTP)
 * .timeout(Duration.minutes(30))
 * .unhealthyThresholdCount(123)
 * .build())
 * .preserveClientIp(false)
 * .protocol(Protocol.HTTP)
 * .proxyProtocolV2(false)
 * .targetGroupName("targetGroupName")
 * .targets(List.of(networkLoadBalancerTarget))
 * .targetType(TargetType.INSTANCE)
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkTargetGroupPropsDsl {
    private val cdkBuilder: NetworkTargetGroupProps.Builder = NetworkTargetGroupProps.builder()

    private val _targets: MutableList<INetworkLoadBalancerTarget> = mutableListOf()

    /**
     * @param connectionTermination Indicates whether the load balancer terminates connections at
     *   the end of the deregistration timeout.
     */
    public fun connectionTermination(connectionTermination: Boolean) {
        cdkBuilder.connectionTermination(connectionTermination)
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

    /** @param port The port on which the target receives traffic. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param preserveClientIp Indicates whether client IP preservation is enabled. */
    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /** @param protocol Protocol for target group, expects TCP, TLS, UDP, or TCP_UDP. */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    /** @param proxyProtocolV2 Indicates whether Proxy Protocol version 2 is enabled. */
    public fun proxyProtocolV2(proxyProtocolV2: Boolean) {
        cdkBuilder.proxyProtocolV2(proxyProtocolV2)
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
    public fun targets(vararg targets: INetworkLoadBalancerTarget) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * @param targets The targets to add to this target group. Can be `Instance`, `IPAddress`, or
     *   any self-registering load balancing target. If you use either `Instance` or `IPAddress` as
     *   targets, all target must be of the same type.
     */
    public fun targets(targets: Collection<INetworkLoadBalancerTarget>) {
        _targets.addAll(targets)
    }

    /** @param vpc The virtual private cloud (VPC). only if `TargetType` is `Ip` or `InstanceId` */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): NetworkTargetGroupProps {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
