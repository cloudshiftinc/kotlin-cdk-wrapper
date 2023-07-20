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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDetectorModelSetTimerPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.SetTimerProperty.Builder =
        CfnDetectorModel.SetTimerProperty.builder()

    public fun durationExpression(durationExpression: String) {
        cdkBuilder.durationExpression(durationExpression)
    }

    public fun seconds(seconds: Number) {
        cdkBuilder.seconds(seconds)
    }

    public fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
    }

    public fun build(): CfnDetectorModel.SetTimerProperty = cdkBuilder.build()
}
