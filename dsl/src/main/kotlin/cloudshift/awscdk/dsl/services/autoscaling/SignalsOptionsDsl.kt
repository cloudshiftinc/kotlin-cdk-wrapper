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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.SignalsOptions
import kotlin.Number

@CdkDslMarker
public class SignalsOptionsDsl {
    private val cdkBuilder: SignalsOptions.Builder = SignalsOptions.builder()

    public fun minSuccessPercentage(minSuccessPercentage: Number) {
        cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): SignalsOptions = cdkBuilder.build()
}
