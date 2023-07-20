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
import software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class HttpHealthCheckOptionsDsl {
    private val cdkBuilder: HttpHealthCheckOptions.Builder = HttpHealthCheckOptions.builder()

    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): HttpHealthCheckOptions = cdkBuilder.build()
}
