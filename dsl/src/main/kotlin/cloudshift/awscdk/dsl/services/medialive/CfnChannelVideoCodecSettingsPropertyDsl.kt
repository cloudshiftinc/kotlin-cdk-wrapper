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

@CdkDslMarker
public class CfnChannelVideoCodecSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoCodecSettingsProperty.Builder =
        CfnChannel.VideoCodecSettingsProperty.builder()

    public fun frameCaptureSettings(frameCaptureSettings: IResolvable) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings)
    }

    public fun frameCaptureSettings(frameCaptureSettings: CfnChannel.FrameCaptureSettingsProperty) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings)
    }

    public fun h264Settings(h264Settings: IResolvable) {
        cdkBuilder.h264Settings(h264Settings)
    }

    public fun h264Settings(h264Settings: CfnChannel.H264SettingsProperty) {
        cdkBuilder.h264Settings(h264Settings)
    }

    public fun h265Settings(h265Settings: IResolvable) {
        cdkBuilder.h265Settings(h265Settings)
    }

    public fun h265Settings(h265Settings: CfnChannel.H265SettingsProperty) {
        cdkBuilder.h265Settings(h265Settings)
    }

    public fun mpeg2Settings(mpeg2Settings: IResolvable) {
        cdkBuilder.mpeg2Settings(mpeg2Settings)
    }

    public fun mpeg2Settings(mpeg2Settings: CfnChannel.Mpeg2SettingsProperty) {
        cdkBuilder.mpeg2Settings(mpeg2Settings)
    }

    public fun build(): CfnChannel.VideoCodecSettingsProperty = cdkBuilder.build()
}
