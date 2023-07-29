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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes the settings for the health check that AWS App Runner performs to monitor the health of
 * a service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * HealthCheckConfigurationProperty healthCheckConfigurationProperty =
 * HealthCheckConfigurationProperty.builder()
 * .healthyThreshold(123)
 * .interval(123)
 * .path("path")
 * .protocol("protocol")
 * .timeout(123)
 * .unhealthyThreshold(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-healthcheckconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceHealthCheckConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.HealthCheckConfigurationProperty.Builder =
        CfnService.HealthCheckConfigurationProperty.builder()

    /**
     * @param healthyThreshold The number of consecutive checks that must succeed before App Runner
     *   decides that the service is healthy. Default: `1`
     */
    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /** @param interval The time interval, in seconds, between health checks. Default: `5` */
    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    /**
     * @param path The URL that health check requests are sent to. `Path` is only applicable when
     *   you set `Protocol` to `HTTP` .
     *
     * Default: `"/"`
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param protocol The IP protocol that App Runner uses to perform health checks for your
     *   service. If you set `Protocol` to `HTTP` , App Runner sends health check requests to the
     *   HTTP path specified by `Path` .
     *
     * Default: `TCP`
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param timeout The time, in seconds, to wait for a health check response before deciding it
     *   failed. Default: `2`
     */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param unhealthyThreshold The number of consecutive checks that must fail before App Runner
     *   decides that the service is unhealthy. Default: `5`
     */
    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): CfnService.HealthCheckConfigurationProperty = cdkBuilder.build()
}
