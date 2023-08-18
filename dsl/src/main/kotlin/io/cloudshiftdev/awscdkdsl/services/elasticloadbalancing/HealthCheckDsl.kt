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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancing

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol

/**
 * Describe the health check to a load balancer.
 *
 * Example:
 * ```
 * IVpc vpc;
 * AutoScalingGroup myAutoScalingGroup;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .healthCheck(HealthCheck.builder()
 * .port(80)
 * .build())
 * .build();
 * lb.addTarget(myAutoScalingGroup);
 * lb.addListener(LoadBalancerListener.builder()
 * .externalPort(80)
 * .build());
 * ```
 */
@CdkDslMarker
public class HealthCheckDsl {
    private val cdkBuilder: HealthCheck.Builder = HealthCheck.builder()

    /**
     * @param healthyThreshold After how many successful checks is an instance considered healthy.
     */
    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /** @param interval Number of seconds between health checks. */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param path What path to use for HTTP or HTTPS health check (must return 200). For SSL and
     *   TCP health checks, accepting connections is enough to be considered healthy.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param port What port number to health check on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param protocol What protocol to use for health checking. The protocol is automatically
     *   determined from the port if it's not supplied.
     */
    public fun protocol(protocol: LoadBalancingProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /** @param timeout Health check timeout. */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param unhealthyThreshold After how many unsuccessful checks is an instance considered
     *   unhealthy.
     */
    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): HealthCheck = cdkBuilder.build()
}
