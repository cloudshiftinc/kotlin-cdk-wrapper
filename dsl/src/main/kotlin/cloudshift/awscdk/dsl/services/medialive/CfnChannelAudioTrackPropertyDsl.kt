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
public class CfnChannelAudioTrackPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioTrackProperty.Builder =
        CfnChannel.AudioTrackProperty.builder()

    public fun track(track: Number) {
        cdkBuilder.track(track)
    }

    public fun build(): CfnChannel.AudioTrackProperty = cdkBuilder.build()
}
