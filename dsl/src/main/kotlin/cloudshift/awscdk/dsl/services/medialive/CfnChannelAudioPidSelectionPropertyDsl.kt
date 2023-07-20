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
public class CfnChannelAudioPidSelectionPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioPidSelectionProperty.Builder =
        CfnChannel.AudioPidSelectionProperty.builder()

    public fun pid(pid: Number) {
        cdkBuilder.pid(pid)
    }

    public fun build(): CfnChannel.AudioPidSelectionProperty = cdkBuilder.build()
}
