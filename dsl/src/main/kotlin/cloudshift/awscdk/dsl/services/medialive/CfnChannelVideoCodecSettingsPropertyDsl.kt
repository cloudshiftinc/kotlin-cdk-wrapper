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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for the video codec in the output.
 *
 * The parent of this entity is VideoDescription.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoCodecSettingsProperty videoCodecSettingsProperty = VideoCodecSettingsProperty.builder()
 * .frameCaptureSettings(FrameCaptureSettingsProperty.builder()
 * .captureInterval(123)
 * .captureIntervalUnits("captureIntervalUnits")
 * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
 * .fontSize("fontSize")
 * .position("position")
 * .prefix("prefix")
 * .build())
 * .build())
 * .h264Settings(H264SettingsProperty.builder()
 * .adaptiveQuantization("adaptiveQuantization")
 * .afdSignaling("afdSignaling")
 * .bitrate(123)
 * .bufFillPct(123)
 * .bufSize(123)
 * .colorMetadata("colorMetadata")
 * .colorSpaceSettings(H264ColorSpaceSettingsProperty.builder()
 * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
 * .rec601Settings(Rec601SettingsProperty.builder().build())
 * .rec709Settings(Rec709SettingsProperty.builder().build())
 * .build())
 * .entropyEncoding("entropyEncoding")
 * .filterSettings(H264FilterSettingsProperty.builder()
 * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
 * .postFilterSharpening("postFilterSharpening")
 * .strength("strength")
 * .build())
 * .build())
 * .fixedAfd("fixedAfd")
 * .flickerAq("flickerAq")
 * .forceFieldPictures("forceFieldPictures")
 * .framerateControl("framerateControl")
 * .framerateDenominator(123)
 * .framerateNumerator(123)
 * .gopBReference("gopBReference")
 * .gopClosedCadence(123)
 * .gopNumBFrames(123)
 * .gopSize(123)
 * .gopSizeUnits("gopSizeUnits")
 * .level("level")
 * .lookAheadRateControl("lookAheadRateControl")
 * .maxBitrate(123)
 * .minIInterval(123)
 * .numRefFrames(123)
 * .parControl("parControl")
 * .parDenominator(123)
 * .parNumerator(123)
 * .profile("profile")
 * .qualityLevel("qualityLevel")
 * .qvbrQualityLevel(123)
 * .rateControlMode("rateControlMode")
 * .scanType("scanType")
 * .sceneChangeDetect("sceneChangeDetect")
 * .slices(123)
 * .softness(123)
 * .spatialAq("spatialAq")
 * .subgopLength("subgopLength")
 * .syntax("syntax")
 * .temporalAq("temporalAq")
 * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
 * .fontSize("fontSize")
 * .position("position")
 * .prefix("prefix")
 * .build())
 * .timecodeInsertion("timecodeInsertion")
 * .build())
 * .h265Settings(H265SettingsProperty.builder()
 * .adaptiveQuantization("adaptiveQuantization")
 * .afdSignaling("afdSignaling")
 * .alternativeTransferFunction("alternativeTransferFunction")
 * .bitrate(123)
 * .bufSize(123)
 * .colorMetadata("colorMetadata")
 * .colorSpaceSettings(H265ColorSpaceSettingsProperty.builder()
 * .colorSpacePassthroughSettings(ColorSpacePassthroughSettingsProperty.builder().build())
 * .dolbyVision81Settings(DolbyVision81SettingsProperty.builder().build())
 * .hdr10Settings(Hdr10SettingsProperty.builder()
 * .maxCll(123)
 * .maxFall(123)
 * .build())
 * .rec601Settings(Rec601SettingsProperty.builder().build())
 * .rec709Settings(Rec709SettingsProperty.builder().build())
 * .build())
 * .filterSettings(H265FilterSettingsProperty.builder()
 * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
 * .postFilterSharpening("postFilterSharpening")
 * .strength("strength")
 * .build())
 * .build())
 * .fixedAfd("fixedAfd")
 * .flickerAq("flickerAq")
 * .framerateDenominator(123)
 * .framerateNumerator(123)
 * .gopClosedCadence(123)
 * .gopSize(123)
 * .gopSizeUnits("gopSizeUnits")
 * .level("level")
 * .lookAheadRateControl("lookAheadRateControl")
 * .maxBitrate(123)
 * .minIInterval(123)
 * .parDenominator(123)
 * .parNumerator(123)
 * .profile("profile")
 * .qvbrQualityLevel(123)
 * .rateControlMode("rateControlMode")
 * .scanType("scanType")
 * .sceneChangeDetect("sceneChangeDetect")
 * .slices(123)
 * .tier("tier")
 * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
 * .fontSize("fontSize")
 * .position("position")
 * .prefix("prefix")
 * .build())
 * .timecodeInsertion("timecodeInsertion")
 * .build())
 * .mpeg2Settings(Mpeg2SettingsProperty.builder()
 * .adaptiveQuantization("adaptiveQuantization")
 * .afdSignaling("afdSignaling")
 * .colorMetadata("colorMetadata")
 * .colorSpace("colorSpace")
 * .displayAspectRatio("displayAspectRatio")
 * .filterSettings(Mpeg2FilterSettingsProperty.builder()
 * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
 * .postFilterSharpening("postFilterSharpening")
 * .strength("strength")
 * .build())
 * .build())
 * .fixedAfd("fixedAfd")
 * .framerateDenominator(123)
 * .framerateNumerator(123)
 * .gopClosedCadence(123)
 * .gopNumBFrames(123)
 * .gopSize(123)
 * .gopSizeUnits("gopSizeUnits")
 * .scanType("scanType")
 * .subgopLength("subgopLength")
 * .timecodeBurninSettings(TimecodeBurninSettingsProperty.builder()
 * .fontSize("fontSize")
 * .position("position")
 * .prefix("prefix")
 * .build())
 * .timecodeInsertion("timecodeInsertion")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videocodecsettings.html)
 */
@CdkDslMarker
public class CfnChannelVideoCodecSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoCodecSettingsProperty.Builder =
        CfnChannel.VideoCodecSettingsProperty.builder()

    /** @param frameCaptureSettings The settings for the video codec in a frame capture output. */
    public fun frameCaptureSettings(frameCaptureSettings: IResolvable) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings)
    }

    /** @param frameCaptureSettings The settings for the video codec in a frame capture output. */
    public fun frameCaptureSettings(frameCaptureSettings: CfnChannel.FrameCaptureSettingsProperty) {
        cdkBuilder.frameCaptureSettings(frameCaptureSettings)
    }

    /** @param h264Settings The settings for the H.264 codec in the output. */
    public fun h264Settings(h264Settings: IResolvable) {
        cdkBuilder.h264Settings(h264Settings)
    }

    /** @param h264Settings The settings for the H.264 codec in the output. */
    public fun h264Settings(h264Settings: CfnChannel.H264SettingsProperty) {
        cdkBuilder.h264Settings(h264Settings)
    }

    /** @param h265Settings Settings for video encoded with the H265 codec. */
    public fun h265Settings(h265Settings: IResolvable) {
        cdkBuilder.h265Settings(h265Settings)
    }

    /** @param h265Settings Settings for video encoded with the H265 codec. */
    public fun h265Settings(h265Settings: CfnChannel.H265SettingsProperty) {
        cdkBuilder.h265Settings(h265Settings)
    }

    /** @param mpeg2Settings Settings for video encoded with the MPEG-2 codec. */
    public fun mpeg2Settings(mpeg2Settings: IResolvable) {
        cdkBuilder.mpeg2Settings(mpeg2Settings)
    }

    /** @param mpeg2Settings Settings for video encoded with the MPEG-2 codec. */
    public fun mpeg2Settings(mpeg2Settings: CfnChannel.Mpeg2SettingsProperty) {
        cdkBuilder.mpeg2Settings(mpeg2Settings)
    }

    public fun build(): CfnChannel.VideoCodecSettingsProperty = cdkBuilder.build()
}
