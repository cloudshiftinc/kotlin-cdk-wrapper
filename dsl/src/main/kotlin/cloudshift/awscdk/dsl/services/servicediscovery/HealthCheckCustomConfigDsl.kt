@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
import kotlin.Number

@CdkDslMarker
public class HealthCheckCustomConfigDsl {
    private val cdkBuilder: HealthCheckCustomConfig.Builder = HealthCheckCustomConfig.builder()

    public fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
    }

    public fun build(): HealthCheckCustomConfig = cdkBuilder.build()
}
