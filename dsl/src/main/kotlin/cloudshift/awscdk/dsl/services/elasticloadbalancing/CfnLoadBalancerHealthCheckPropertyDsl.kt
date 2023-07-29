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

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

/**
 * Specifies health check settings for your Classic Load Balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * HealthCheckProperty healthCheckProperty = HealthCheckProperty.builder()
 * .healthyThreshold("healthyThreshold")
 * .interval("interval")
 * .target("target")
 * .timeout("timeout")
 * .unhealthyThreshold("unhealthyThreshold")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html)
 */
@CdkDslMarker
public class CfnLoadBalancerHealthCheckPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.HealthCheckProperty.Builder =
        CfnLoadBalancer.HealthCheckProperty.builder()

    /**
     * @param healthyThreshold The number of consecutive health checks successes required before
     *   moving the instance to the `Healthy` state.
     */
    public fun healthyThreshold(healthyThreshold: String) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /**
     * @param interval The approximate interval, in seconds, between health checks of an individual
     *   instance.
     */
    public fun interval(interval: String) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param target The instance being checked. The protocol is either TCP, HTTP, HTTPS, or SSL.
     *   The range of valid ports is one (1) through 65535.
     *
     * TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a
     * health check simply attempts to open a TCP connection to the instance on the specified port.
     * Failure to connect within the configured timeout is considered unhealthy.
     *
     * SSL is also specified as SSL: port pair, for example, SSL:5000.
     *
     * For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case,
     * a HTTP GET request is issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy.
     *
     * The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
     */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    /**
     * @param timeout The amount of time, in seconds, during which no response means a failed health
     *   check. This value must be less than the `Interval` value.
     */
    public fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param unhealthyThreshold The number of consecutive health check failures required before
     *   moving the instance to the `Unhealthy` state.
     */
    public fun unhealthyThreshold(unhealthyThreshold: String) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): CfnLoadBalancer.HealthCheckProperty = cdkBuilder.build()
}
