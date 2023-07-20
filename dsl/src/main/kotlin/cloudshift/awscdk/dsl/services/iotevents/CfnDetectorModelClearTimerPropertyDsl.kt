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
import kotlin.String

@CdkDslMarker
public class CfnDetectorModelClearTimerPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.ClearTimerProperty.Builder =
        CfnDetectorModel.ClearTimerProperty.builder()

    public fun timerName(timerName: String) {
        cdkBuilder.timerName(timerName)
    }

    public fun build(): CfnDetectorModel.ClearTimerProperty = cdkBuilder.build()
}
