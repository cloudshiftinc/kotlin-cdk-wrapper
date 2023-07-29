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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * `HealthCheckConfig` is a property of the
 * [PublicEndpoint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html)
 * property. It describes the healthcheck configuration of a container deployment on a container
 * service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
 * .healthyThreshold(123)
 * .intervalSeconds(123)
 * .path("path")
 * .successCodes("successCodes")
 * .timeoutSeconds(123)
 * .unhealthyThreshold(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-healthcheckconfig.html)
 */
@CdkDslMarker
public class CfnContainerHealthCheckConfigPropertyDsl {
    private val cdkBuilder: CfnContainer.HealthCheckConfigProperty.Builder =
        CfnContainer.HealthCheckConfigProperty.builder()

    /**
     * @param healthyThreshold The number of consecutive health check successes required before
     *   moving the container to the `Healthy` state. The default value is `2` .
     */
    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /**
     * @param intervalSeconds The approximate interval, in seconds, between health checks of an
     *   individual container. You can specify between `5` and `300` seconds. The default value is
     *   `5` .
     */
    public fun intervalSeconds(intervalSeconds: Number) {
        cdkBuilder.intervalSeconds(intervalSeconds)
    }

    /**
     * @param path The path on the container on which to perform the health check. The default value
     *   is `/` .
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param successCodes The HTTP codes to use when checking for a successful response from a
     *   container. You can specify values between `200` and `499` . You can specify multiple values
     *   (for example, `200,202` ) or a range of values (for example, `200-299` ).
     */
    public fun successCodes(successCodes: String) {
        cdkBuilder.successCodes(successCodes)
    }

    /**
     * @param timeoutSeconds The amount of time, in seconds, during which no response means a failed
     *   health check. You can specify between `2` and `60` seconds. The default value is `2` .
     */
    public fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
    }

    /**
     * @param unhealthyThreshold The number of consecutive health check failures required before
     *   moving the container to the `Unhealthy` state. The default value is `2` .
     */
    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): CfnContainer.HealthCheckConfigProperty = cdkBuilder.build()
}
