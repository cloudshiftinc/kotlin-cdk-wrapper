@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for an HLS output.
 *
 * The parent of this entity is HlsOutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsSettingsProperty hlsSettingsProperty = HlsSettingsProperty.builder()
 * .audioOnlyHlsSettings(AudioOnlyHlsSettingsProperty.builder()
 * .audioGroupId("audioGroupId")
 * .audioOnlyImage(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .audioTrackType("audioTrackType")
 * .segmentType("segmentType")
 * .build())
 * .fmp4HlsSettings(Fmp4HlsSettingsProperty.builder()
 * .audioRenditionSets("audioRenditionSets")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .build())
 * .frameCaptureHlsSettings(FrameCaptureHlsSettingsProperty.builder().build())
 * .standardHlsSettings(StandardHlsSettingsProperty.builder()
 * .audioRenditionSets("audioRenditionSets")
 * .m3U8Settings(M3u8SettingsProperty.builder()
 * .audioFramesPerPes(123)
 * .audioPids("audioPids")
 * .ecmPid("ecmPid")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .patInterval(123)
 * .pcrControl("pcrControl")
 * .pcrPeriod(123)
 * .pcrPid("pcrPid")
 * .pmtInterval(123)
 * .pmtPid("pmtPid")
 * .programNum(123)
 * .scte35Behavior("scte35Behavior")
 * .scte35Pid("scte35Pid")
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .timedMetadataPid("timedMetadataPid")
 * .transportStreamId(123)
 * .videoPid("videoPid")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlssettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsSettingsProperty.Builder =
        CfnChannel.HlsSettingsProperty.builder()

    /** @param audioOnlyHlsSettings The settings for an audio-only output. */
    public fun audioOnlyHlsSettings(audioOnlyHlsSettings: IResolvable) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings)
    }

    /** @param audioOnlyHlsSettings The settings for an audio-only output. */
    public fun audioOnlyHlsSettings(audioOnlyHlsSettings: CfnChannel.AudioOnlyHlsSettingsProperty) {
        cdkBuilder.audioOnlyHlsSettings(audioOnlyHlsSettings)
    }

    /** @param fmp4HlsSettings The settings for an fMP4 container. */
    public fun fmp4HlsSettings(fmp4HlsSettings: IResolvable) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings)
    }

    /** @param fmp4HlsSettings The settings for an fMP4 container. */
    public fun fmp4HlsSettings(fmp4HlsSettings: CfnChannel.Fmp4HlsSettingsProperty) {
        cdkBuilder.fmp4HlsSettings(fmp4HlsSettings)
    }

    /**
     * @param frameCaptureHlsSettings Settings for a frame capture output in an HLS output group.
     */
    public fun frameCaptureHlsSettings(frameCaptureHlsSettings: IResolvable) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings)
    }

    /**
     * @param frameCaptureHlsSettings Settings for a frame capture output in an HLS output group.
     */
    public fun frameCaptureHlsSettings(
        frameCaptureHlsSettings: CfnChannel.FrameCaptureHlsSettingsProperty
    ) {
        cdkBuilder.frameCaptureHlsSettings(frameCaptureHlsSettings)
    }

    /**
     * @param standardHlsSettings The settings for a standard output (an output that is not
     *   audio-only).
     */
    public fun standardHlsSettings(standardHlsSettings: IResolvable) {
        cdkBuilder.standardHlsSettings(standardHlsSettings)
    }

    /**
     * @param standardHlsSettings The settings for a standard output (an output that is not
     *   audio-only).
     */
    public fun standardHlsSettings(standardHlsSettings: CfnChannel.StandardHlsSettingsProperty) {
        cdkBuilder.standardHlsSettings(standardHlsSettings)
    }

    public fun build(): CfnChannel.HlsSettingsProperty = cdkBuilder.build()
}
