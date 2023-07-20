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
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckType
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class HealthCheckConfigDsl {
    private val cdkBuilder: HealthCheckConfig.Builder = HealthCheckConfig.builder()

    public fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
    }

    public fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
    }

    public fun type(type: HealthCheckType) {
        cdkBuilder.type(type)
    }

    public fun build(): HealthCheckConfig = cdkBuilder.build()
}
