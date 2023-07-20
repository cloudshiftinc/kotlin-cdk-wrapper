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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelAudioOnlyHlsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioOnlyHlsSettingsProperty.Builder =
        CfnChannel.AudioOnlyHlsSettingsProperty.builder()

    public fun audioGroupId(audioGroupId: String) {
        cdkBuilder.audioGroupId(audioGroupId)
    }

    public fun audioOnlyImage(audioOnlyImage: IResolvable) {
        cdkBuilder.audioOnlyImage(audioOnlyImage)
    }

    public fun audioOnlyImage(audioOnlyImage: CfnChannel.InputLocationProperty) {
        cdkBuilder.audioOnlyImage(audioOnlyImage)
    }

    public fun audioTrackType(audioTrackType: String) {
        cdkBuilder.audioTrackType(audioTrackType)
    }

    public fun segmentType(segmentType: String) {
        cdkBuilder.segmentType(segmentType)
    }

    public fun build(): CfnChannel.AudioOnlyHlsSettingsProperty = cdkBuilder.build()
}
