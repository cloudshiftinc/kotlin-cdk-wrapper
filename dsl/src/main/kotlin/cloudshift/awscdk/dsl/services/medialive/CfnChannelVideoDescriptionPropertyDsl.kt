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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Encoding information for one output video.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoDescriptionProperty videoDescriptionProperty = VideoDescriptionProperty.builder()
 * .codecSettings(VideoCodecSettingsProperty.builder()
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
 * .build())
 * .height(123)
 * .name("name")
 * .respondToAfd("respondToAfd")
 * .scalingBehavior("scalingBehavior")
 * .sharpness(123)
 * .width(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videodescription.html)
 */
@CdkDslMarker
public class CfnChannelVideoDescriptionPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoDescriptionProperty.Builder =
        CfnChannel.VideoDescriptionProperty.builder()

    /** @param codecSettings The video codec settings. */
    public fun codecSettings(codecSettings: IResolvable) {
        cdkBuilder.codecSettings(codecSettings)
    }

    /** @param codecSettings The video codec settings. */
    public fun codecSettings(codecSettings: CfnChannel.VideoCodecSettingsProperty) {
        cdkBuilder.codecSettings(codecSettings)
    }

    /**
     * @param height The output video height, in pixels. This must be an even number. For most
     *   codecs, you can keep this field and width blank in order to use the height and width
     *   (resolution) from the source. Note that we don't recommend keeping the field blank. For the
     *   Frame Capture codec, height and width are required.
     */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /**
     * @param name The name of this VideoDescription. Outputs use this name to uniquely identify
     *   this description. Description names should be unique within this channel.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param respondToAfd Indicates how to respond to the AFD values in the input stream. RESPOND
     *   causes input video to be clipped, depending on the AFD value, input display aspect ratio,
     *   and output display aspect ratio, and (except for the FRAMECAPTURE codec) includes the
     *   values in the output. PASSTHROUGH (does not apply to FRAMECAPTURE codec) ignores the AFD
     *   values and includes the values in the output, so input video is not clipped. NONE ignores
     *   the AFD values and does not include the values through to the output, so input video is not
     *   clipped.
     */
    public fun respondToAfd(respondToAfd: String) {
        cdkBuilder.respondToAfd(respondToAfd)
    }

    /**
     * @param scalingBehavior STRETCHTOOUTPUT configures the output position to stretch the video to
     *   the specified output resolution (height and width). This option overrides any position
     *   value. DEFAULT might insert black boxes (pillar boxes or letter boxes) around the video to
     *   provide the specified output resolution.
     */
    public fun scalingBehavior(scalingBehavior: String) {
        cdkBuilder.scalingBehavior(scalingBehavior)
    }

    /**
     * @param sharpness Changes the strength of the anti-alias filter used for scaling. 0 is the
     *   softest setting, and 100 is the sharpest. We recommend a setting of 50 for most content.
     */
    public fun sharpness(sharpness: Number) {
        cdkBuilder.sharpness(sharpness)
    }

    /**
     * @param width The output video width, in pixels. It must be an even number. For most codecs,
     *   you can keep this field and height blank in order to use the height and width (resolution)
     *   from the source. Note that we don't recommend keeping the field blank. For the Frame
     *   Capture codec, height and width are required.
     */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): CfnChannel.VideoDescriptionProperty = cdkBuilder.build()
}
