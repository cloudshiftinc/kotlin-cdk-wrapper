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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions
import kotlin.Number

@CdkDslMarker
public class GrpcHealthCheckOptionsDsl {
    private val cdkBuilder: GrpcHealthCheckOptions.Builder = GrpcHealthCheckOptions.builder()

    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): GrpcHealthCheckOptions = cdkBuilder.build()
}
