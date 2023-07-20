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
public class CfnChannelHlsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsSettingsProperty.Builder =
        CfnChannel.HlsSettingsProperty.builder()

    public fun audioOnlyHlsSettings(audioOnlyHlsSettings: IResolvable) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings)
    }

    public fun audioOnlyHlsSettings(audioOnlyHlsSettings: CfnChannel.AudioOnlyHlsSettingsProperty) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings)
    }

    public fun fmp4HlsSettings(fmp4HlsSettings: IResolvable) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings)
    }

    public fun fmp4HlsSettings(fmp4HlsSettings: CfnChannel.Fmp4HlsSettingsProperty) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings)
    }

    public fun frameCaptureHlsSettings(frameCaptureHlsSettings: IResolvable) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings)
    }

    public fun frameCaptureHlsSettings(frameCaptureHlsSettings: CfnChannel.FrameCaptureHlsSettingsProperty) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings)
    }

    public fun standardHlsSettings(standardHlsSettings: IResolvable) {
        cdkBuilder.standardHlsSettings(standardHlsSettings)
    }

    public fun standardHlsSettings(standardHlsSettings: CfnChannel.StandardHlsSettingsProperty) {
        cdkBuilder.standardHlsSettings(standardHlsSettings)
    }

    public fun build(): CfnChannel.HlsSettingsProperty = cdkBuilder.build()
}
