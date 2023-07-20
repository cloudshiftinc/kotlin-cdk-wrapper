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
import software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions
import kotlin.Number

@CdkDslMarker
public class TcpHealthCheckOptionsDsl {
    private val cdkBuilder: TcpHealthCheckOptions.Builder = TcpHealthCheckOptions.builder()

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

    public fun build(): TcpHealthCheckOptions = cdkBuilder.build()
}
