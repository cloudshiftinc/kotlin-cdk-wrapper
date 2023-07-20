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

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.synthetics.CfnCanary
import kotlin.String

@CdkDslMarker
public class CfnCanarySchedulePropertyDsl {
    private val cdkBuilder: CfnCanary.ScheduleProperty.Builder = CfnCanary.ScheduleProperty.builder()

    public fun durationInSeconds(durationInSeconds: String) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnCanary.ScheduleProperty = cdkBuilder.build()
}
