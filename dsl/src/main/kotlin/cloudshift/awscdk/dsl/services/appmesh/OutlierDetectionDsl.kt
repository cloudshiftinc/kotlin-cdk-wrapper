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
import software.amazon.awscdk.services.appmesh.OutlierDetection
import kotlin.Number

@CdkDslMarker
public class OutlierDetectionDsl {
    private val cdkBuilder: OutlierDetection.Builder = OutlierDetection.builder()

    public fun baseEjectionDuration(baseEjectionDuration: Duration) {
        cdkBuilder.baseEjectionDuration(baseEjectionDuration)
    }

    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    public fun maxEjectionPercent(maxEjectionPercent: Number) {
        cdkBuilder.maxEjectionPercent(maxEjectionPercent)
    }

    public fun maxServerErrors(maxServerErrors: Number) {
        cdkBuilder.maxServerErrors(maxServerErrors)
    }

    public fun build(): OutlierDetection = cdkBuilder.build()
}
