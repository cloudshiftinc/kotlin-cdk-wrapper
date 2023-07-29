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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig

/**
 * Specifies information about an optional custom health check.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * HealthCheckCustomConfig healthCheckCustomConfig = HealthCheckCustomConfig.builder()
 * .failureThreshold(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class HealthCheckCustomConfigDsl {
    private val cdkBuilder: HealthCheckCustomConfig.Builder = HealthCheckCustomConfig.builder()

    /**
     * @param failureThreshold The number of 30-second intervals that you want Cloud Map to wait
     *   after receiving an UpdateInstanceCustomHealthStatus request before it changes the health
     *   status of a service instance.
     */
    public fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
    }

    public fun build(): HealthCheckCustomConfig = cdkBuilder.build()
}
