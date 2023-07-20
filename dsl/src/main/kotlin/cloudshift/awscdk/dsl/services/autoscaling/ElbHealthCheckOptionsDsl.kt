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
import software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions

@CdkDslMarker
public class ElbHealthCheckOptionsDsl {
    private val cdkBuilder: ElbHealthCheckOptions.Builder = ElbHealthCheckOptions.builder()

    public fun grace(grace: Duration) {
        cdkBuilder.grace(grace)
    }

    public fun build(): ElbHealthCheckOptions = cdkBuilder.build()
}
