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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol

/**
 * Properties for configuring a health check.
 *
 * Example:
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService loadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .cpu(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .command(List.of("command"))
 * .entryPoint(List.of("entry", "point"))
 * .build())
 * .build();
 * loadBalancedFargateService.targetGroup.configureHealthCheck(HealthCheck.builder()
 * .path("/custom-health-path")
 * .build());
 * ```
 */
@CdkDslMarker
public class HealthCheckDsl {
    private val cdkBuilder: HealthCheck.Builder = HealthCheck.builder()

    /**
     * @param enabled Indicates whether health checks are enabled. If the target type is lambda,
     *   health checks are disabled by default but can be enabled. If the target type is instance or
     *   ip, health checks are always enabled and cannot be disabled.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param healthyGrpcCodes GRPC code to use when checking for a successful response from a
     *   target. You can specify values between 0 and 99. You can specify multiple values (for
     *   example, "0,1") or a range of values (for example, "0-5").
     */
    public fun healthyGrpcCodes(healthyGrpcCodes: String) {
        cdkBuilder.healthyGrpcCodes(healthyGrpcCodes)
    }

    /**
     * @param healthyHttpCodes HTTP code to use when checking for a successful response from a
     *   target. For Application Load Balancers, you can specify values between 200 and 499, and the
     *   default value is 200. You can specify multiple values (for example, "200,202") or a range
     *   of values (for example, "200-299").
     */
    public fun healthyHttpCodes(healthyHttpCodes: String) {
        cdkBuilder.healthyHttpCodes(healthyHttpCodes)
    }

    /**
     * @param healthyThresholdCount The number of consecutive health checks successes required
     *   before considering an unhealthy target healthy. For Application Load Balancers, the default
     *   is 5. For Network Load Balancers, the default is 3.
     */
    public fun healthyThresholdCount(healthyThresholdCount: Number) {
        cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    /**
     * @param interval The approximate number of seconds between health checks for an individual
     *   target. Must be 5 to 300 seconds
     */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param path The ping path destination where Elastic Load Balancing sends health check
     *   requests.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param port The port that the load balancer uses when performing health checks on the
     *   targets.
     */
    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol the load balancer uses when performing health checks on targets.
     *   The TCP protocol is supported for health checks only if the protocol of the target group is
     *   TCP, TLS, UDP, or TCP_UDP. The TLS, UDP, and TCP_UDP protocols are not supported for health
     *   checks.
     */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param timeout The amount of time, in seconds, during which no response from a target means a
     *   failed health check. Must be 2 to 120 seconds.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param unhealthyThresholdCount The number of consecutive health check failures required
     *   before considering a target unhealthy. For Application Load Balancers, the default is 2.
     *   For Network Load Balancers, this value must be the same as the healthy threshold count.
     */
    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
        cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    public fun build(): HealthCheck = cdkBuilder.build()
}
