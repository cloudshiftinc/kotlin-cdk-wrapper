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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for an HLS output.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsOutputSettingsProperty hlsOutputSettingsProperty = HlsOutputSettingsProperty.builder()
 * .h265PackagingType("h265PackagingType")
 * .hlsSettings(HlsSettingsProperty.builder()
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
 * .klvBehavior("klvBehavior")
 * .klvDataPids("klvDataPids")
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
 * .build())
 * .nameModifier("nameModifier")
 * .segmentModifier("segmentModifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsOutputSettingsProperty.Builder =
        CfnChannel.HlsOutputSettingsProperty.builder()

    /**
     * @param h265PackagingType Only applicable when this output is referencing an H.265 video
     *   description. Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
     */
    public fun h265PackagingType(h265PackagingType: String) {
        cdkBuilder.h265PackagingType(h265PackagingType)
    }

    /**
     * @param hlsSettings The settings regarding the underlying stream. These settings are different
     *   for audio-only outputs.
     */
    public fun hlsSettings(hlsSettings: IResolvable) {
        cdkBuilder.hlsSettings(hlsSettings)
    }

    /**
     * @param hlsSettings The settings regarding the underlying stream. These settings are different
     *   for audio-only outputs.
     */
    public fun hlsSettings(hlsSettings: CfnChannel.HlsSettingsProperty) {
        cdkBuilder.hlsSettings(hlsSettings)
    }

    /**
     * @param nameModifier A string that is concatenated to the end of the destination file name.
     *   Accepts "Format Identifiers":#formatIdentifierParameters.
     */
    public fun nameModifier(nameModifier: String) {
        cdkBuilder.nameModifier(nameModifier)
    }

    /** @param segmentModifier A string that is concatenated to the end of segment file names. */
    public fun segmentModifier(segmentModifier: String) {
        cdkBuilder.segmentModifier(segmentModifier)
    }

    public fun build(): CfnChannel.HlsOutputSettingsProperty = cdkBuilder.build()
}
