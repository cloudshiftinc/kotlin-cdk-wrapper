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
 * The settings for the H.264 codec in the output.
 *
 * The parent of this entity is VideoCodecSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * H264SettingsProperty h264SettingsProperty = H264SettingsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h264settings.html)
 */
@CdkDslMarker
public class CfnChannelH264SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.H264SettingsProperty.Builder =
        CfnChannel.H264SettingsProperty.builder()

    /**
     * @param adaptiveQuantization The adaptive quantization. This allows intra-frame quantizers to
     *   vary to improve visual quality.
     */
    public fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
    }

    /**
     * @param afdSignaling Indicates that AFD values will be written into the output stream. If
     *   afdSignaling is auto, the system tries to preserve the input AFD value (in cases where
     *   multiple AFD values are valid). If set to fixed, the AFD value is the value configured in
     *   the fixedAfd parameter.
     */
    public fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
    }

    /**
     * @param bitrate The average bitrate in bits/second. This is required when the rate control
     *   mode is VBR or CBR. It isn't used for QVBR. In a Microsoft Smooth output group, each output
     *   must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
     */
    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    /**
     * @param bufFillPct The percentage of the buffer that should initially be filled (HRD buffer
     *   model).
     */
    public fun bufFillPct(bufFillPct: Number) {
        cdkBuilder.bufFillPct(bufFillPct)
    }

    /** @param bufSize The size of the buffer (HRD buffer model) in bits/second. */
    public fun bufSize(bufSize: Number) {
        cdkBuilder.bufSize(bufSize)
    }

    /** @param colorMetadata Includes color space metadata in the output. */
    public fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
    }

    /** @param colorSpaceSettings Settings to configure the color space handling for the video. */
    public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    /** @param colorSpaceSettings Settings to configure the color space handling for the video. */
    public fun colorSpaceSettings(colorSpaceSettings: CfnChannel.H264ColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    /**
     * @param entropyEncoding The entropy encoding mode. Use cabac (must be in Main or High profile)
     *   or cavlc.
     */
    public fun entropyEncoding(entropyEncoding: String) {
        cdkBuilder.entropyEncoding(entropyEncoding)
    }

    /** @param filterSettings Optional filters that you can apply to an encode. */
    public fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings)
    }

    /** @param filterSettings Optional filters that you can apply to an encode. */
    public fun filterSettings(filterSettings: CfnChannel.H264FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings)
    }

    /**
     * @param fixedAfd A four-bit AFD value to write on all frames of video in the output stream.
     *   Valid only when afdSignaling is set to Fixed.
     */
    public fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
    }

    /**
     * @param flickerAq If set to enabled, adjusts the quantization within each frame to reduce
     *   flicker or pop on I-frames.
     */
    public fun flickerAq(flickerAq: String) {
        cdkBuilder.flickerAq(flickerAq)
    }

    /**
     * @param forceFieldPictures This setting applies only when scan type is "interlaced." It
     *   controls whether coding is performed on a field basis or on a frame basis. (When the video
     *   is progressive, the coding is always performed on a frame basis.) enabled: Force MediaLive
     *   to code on a field basis, so that odd and even sets of fields are coded separately.
     *   disabled: Code the two sets of fields separately (on a field basis) or together (on a frame
     *   basis using PAFF), depending on what is most appropriate for the content.
     */
    public fun forceFieldPictures(forceFieldPictures: String) {
        cdkBuilder.forceFieldPictures(forceFieldPictures)
    }

    /**
     * @param framerateControl Indicates how the output video frame rate is specified. If you select
     *   "specified," the output video frame rate is determined by framerateNumerator and
     *   framerateDenominator. If you select "initializeFromSource," the output video frame rate is
     *   set equal to the input video frame rate of the first input.
     */
    public fun framerateControl(framerateControl: String) {
        cdkBuilder.framerateControl(framerateControl)
    }

    /** @param framerateDenominator The frame rate denominator. */
    public fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
    }

    /**
     * @param framerateNumerator The frame rate numerator. The frame rate is a fraction, for
     *   example, 24000/1001 = 23.976 fps.
     */
    public fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
    }

    /**
     * @param gopBReference If enabled, uses reference B frames for GOP structures that have B
     *   frames &gt; 1.
     */
    public fun gopBReference(gopBReference: String) {
        cdkBuilder.gopBReference(gopBReference)
    }

    /**
     * @param gopClosedCadence The frequency of closed GOPs. In streaming applications, we recommend
     *   that you set this to 1 so that a decoder joining mid-stream will receive an IDR frame as
     *   quickly as possible. Setting this value to 0 will break output segmenting.
     */
    public fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
    }

    /** @param gopNumBFrames The number of B-frames between reference frames. */
    public fun gopNumBFrames(gopNumBFrames: Number) {
        cdkBuilder.gopNumBFrames(gopNumBFrames)
    }

    /**
     * @param gopSize The GOP size (keyframe interval) in units of either frames or seconds per
     *   gopSizeUnits. The value must be greater than zero.
     */
    public fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
    }

    /**
     * @param gopSizeUnits Indicates if the gopSize is specified in frames or seconds. If seconds,
     *   the system converts the gopSize into a frame count at runtime.
     */
    public fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
    }

    /** @param level The H.264 level. */
    public fun level(level: String) {
        cdkBuilder.level(level)
    }

    /**
     * @param lookAheadRateControl The amount of lookahead. A value of low can decrease latency and
     *   memory usage, while high can produce better quality for certain content.
     */
    public fun lookAheadRateControl(lookAheadRateControl: String) {
        cdkBuilder.lookAheadRateControl(lookAheadRateControl)
    }

    /**
     * @param maxBitrate For QVBR: See the tooltip for Quality level. For VBR: Set the maximum
     *   bitrate in order to accommodate expected spikes in the complexity of the video.
     */
    public fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
    }

    /**
     * @param minIInterval Meaningful only if sceneChangeDetect is set to enabled. This setting
     *   enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene
     *   Change Detection. If a scene change I-frame is within I-interval frames of a cadence
     *   I-frame, the GOP is shrunk or stretched to the scene change I-frame. GOP stretch requires
     *   enabling lookahead as well as setting the I-interval. The normal cadence resumes for the
     *   next GOP. Note that the maximum GOP stretch = GOP size + Min-I-interval - 1.
     */
    public fun minIInterval(minIInterval: Number) {
        cdkBuilder.minIInterval(minIInterval)
    }

    /**
     * @param numRefFrames The number of reference frames to use. The encoder might use more than
     *   requested if you use B-frames or interlaced encoding.
     */
    public fun numRefFrames(numRefFrames: Number) {
        cdkBuilder.numRefFrames(numRefFrames)
    }

    /**
     * @param parControl Indicates how the output pixel aspect ratio is specified. If "specified" is
     *   selected, the output video pixel aspect ratio is determined by parNumerator and
     *   parDenominator. If "initializeFromSource" is selected, the output pixels aspect ratio will
     *   be set equal to the input video pixel aspect ratio of the first input.
     */
    public fun parControl(parControl: String) {
        cdkBuilder.parControl(parControl)
    }

    /** @param parDenominator The Pixel Aspect Ratio denominator. */
    public fun parDenominator(parDenominator: Number) {
        cdkBuilder.parDenominator(parDenominator)
    }

    /** @param parNumerator The Pixel Aspect Ratio numerator. */
    public fun parNumerator(parNumerator: Number) {
        cdkBuilder.parNumerator(parNumerator)
    }

    /** @param profile An H.264 profile. */
    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    /**
     * @param qualityLevel Leave as STANDARD_QUALITY or choose a different value (which might result
     *   in additional costs to run the channel).
     * * ENHANCED_QUALITY: Produces a slightly better video quality without an increase in the
     *   bitrate. Has an effect only when the Rate control mode is QVBR or CBR. If this channel is
     *   in a MediaLive multiplex, the value must be ENHANCED_QUALITY.
     * * STANDARD_QUALITY: Valid for any Rate control mode.
     */
    public fun qualityLevel(qualityLevel: String) {
        cdkBuilder.qualityLevel(qualityLevel)
    }

    /**
     * @param qvbrQualityLevel Controls the target quality for the video encode. This applies only
     *   when the rate control mode is QVBR. Set values for the QVBR quality level field and Max
     *   bitrate field that suit your most important viewing devices. Recommended values are: -
     *   Primary screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet: Quality level: 7.
     *   Max bitrate: 1.5M to 3M - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M.
     */
    public fun qvbrQualityLevel(qvbrQualityLevel: Number) {
        cdkBuilder.qvbrQualityLevel(qvbrQualityLevel)
    }

    /**
     * @param rateControlMode The rate control mode. QVBR: The quality will match the specified
     *   quality level except when it is constrained by the maximum bitrate. We recommend this if
     *   you or your viewers pay for bandwidth. VBR: The quality and bitrate vary, depending on the
     *   video complexity. We recommend this instead of QVBR if you want to maintain a specific
     *   average bitrate over the duration of the channel. CBR: The quality varies, depending on the
     *   video complexity. We recommend this only if you distribute your assets to devices that
     *   can't handle variable bitrates.
     */
    public fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
    }

    /**
     * @param scanType Sets the scan type of the output to progressive or top-field-first
     *   interlaced.
     */
    public fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
    }

    /**
     * @param sceneChangeDetect The scene change detection. On: inserts I-frames when the scene
     *   change is detected. Off: does not force an I-frame when the scene change is detected.
     */
    public fun sceneChangeDetect(sceneChangeDetect: String) {
        cdkBuilder.sceneChangeDetect(sceneChangeDetect)
    }

    /**
     * @param slices The number of slices per picture. The number must be less than or equal to the
     *   number of macroblock rows for progressive pictures, and less than or equal to half the
     *   number of macroblock rows for interlaced pictures. This field is optional. If you don't
     *   specify a value, MediaLive chooses the number of slices based on the encode resolution.
     */
    public fun slices(slices: Number) {
        cdkBuilder.slices(slices)
    }

    /**
     * @param softness Softness. Selects a quantizer matrix. Larger values reduce high-frequency
     *   content in the encoded image.
     */
    public fun softness(softness: Number) {
        cdkBuilder.softness(softness)
    }

    /**
     * @param spatialAq If set to enabled, adjusts quantization within each frame based on the
     *   spatial variation of content complexity.
     */
    public fun spatialAq(spatialAq: String) {
        cdkBuilder.spatialAq(spatialAq)
    }

    /**
     * @param subgopLength If set to fixed, uses gopNumBFrames B-frames per sub-GOP. If set to
     *   dynamic, optimizes the number of B-frames used for each sub-GOP to improve visual quality.
     */
    public fun subgopLength(subgopLength: String) {
        cdkBuilder.subgopLength(subgopLength)
    }

    /** @param syntax Produces a bitstream that is compliant with SMPTE RP-2027. */
    public fun syntax(syntax: String) {
        cdkBuilder.syntax(syntax)
    }

    /**
     * @param temporalAq If set to enabled, adjusts quantization within each frame based on the
     *   temporal variation of content complexity.
     */
    public fun temporalAq(temporalAq: String) {
        cdkBuilder.temporalAq(temporalAq)
    }

    /** @param timecodeBurninSettings the value to be set. */
    public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
    }

    /** @param timecodeBurninSettings the value to be set. */
    public fun timecodeBurninSettings(
        timecodeBurninSettings: CfnChannel.TimecodeBurninSettingsProperty
    ) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
    }

    /**
     * @param timecodeInsertion Determines how timecodes should be inserted into the video
     *   elementary stream. disabled: don't include timecodes. picTimingSei: pass through picture
     *   timing SEI messages from the source specified in Timecode Config.
     */
    public fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
    }

    public fun build(): CfnChannel.H264SettingsProperty = cdkBuilder.build()
}
