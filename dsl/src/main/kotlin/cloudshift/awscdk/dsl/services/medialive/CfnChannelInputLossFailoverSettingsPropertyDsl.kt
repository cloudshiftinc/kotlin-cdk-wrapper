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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number

@CdkDslMarker
public class CfnChannelInputLossFailoverSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.InputLossFailoverSettingsProperty.Builder =
        CfnChannel.InputLossFailoverSettingsProperty.builder()

    public fun inputLossThresholdMsec(inputLossThresholdMsec: Number) {
        cdkBuilder.inputLossThresholdMsec(inputLossThresholdMsec)
    }

    public fun build(): CfnChannel.InputLossFailoverSettingsProperty = cdkBuilder.build()
}
