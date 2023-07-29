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
 * H265 Settings.
 *
 * The parent of this entity is VideoCodecSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * H265SettingsProperty h265SettingsProperty = H265SettingsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h265settings.html)
 */
@CdkDslMarker
public class CfnChannelH265SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.H265SettingsProperty.Builder =
        CfnChannel.H265SettingsProperty.builder()

    /**
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame quantizers to vary to
     *   improve visual quality.
     */
    public fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
    }

    /**
     * @param afdSignaling Indicates that AFD values will be written into the output stream. If
     *   afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where
     *   multiple AFD values are valid). If set to "fixed", the AFD value will be the value
     *   configured in the fixedAfd parameter.
     */
    public fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
    }

    /**
     * @param alternativeTransferFunction Whether or not EML should insert an Alternative Transfer
     *   Function SEI message to support backwards compatibility with non-HDR decoders and displays.
     */
    public fun alternativeTransferFunction(alternativeTransferFunction: String) {
        cdkBuilder.alternativeTransferFunction(alternativeTransferFunction)
    }

    /**
     * @param bitrate Average bitrate in bits/second. Required when the rate control mode is VBR or
     *   CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value
     *   when its bitrate is rounded down to the nearest multiple of 1000.
     */
    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    /** @param bufSize Size of buffer (HRD buffer model) in bits. */
    public fun bufSize(bufSize: Number) {
        cdkBuilder.bufSize(bufSize)
    }

    /** @param colorMetadata Includes colorspace metadata in the output. */
    public fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
    }

    /** @param colorSpaceSettings Color Space settings. */
    public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    /** @param colorSpaceSettings Color Space settings. */
    public fun colorSpaceSettings(colorSpaceSettings: CfnChannel.H265ColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    /** @param filterSettings Optional filters that you can apply to an encode. */
    public fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings)
    }

    /** @param filterSettings Optional filters that you can apply to an encode. */
    public fun filterSettings(filterSettings: CfnChannel.H265FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings)
    }

    /**
     * @param fixedAfd Four bit AFD value to write on all frames of video in the output stream. Only
     *   valid when afdSignaling is set to 'Fixed'.
     */
    public fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
    }

    /**
     * @param flickerAq If set to enabled, adjust quantization within each frame to reduce flicker
     *   or 'pop' on I-frames.
     */
    public fun flickerAq(flickerAq: String) {
        cdkBuilder.flickerAq(flickerAq)
    }

    /** @param framerateDenominator Framerate denominator. */
    public fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
    }

    /**
     * @param framerateNumerator Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 =
     *   23.976 fps.
     */
    public fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
    }

    /**
     * @param gopClosedCadence Frequency of closed GOPs. In streaming applications, it is
     *   recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame
     *   as quickly as possible. Setting this value to 0 will break output segmenting.
     */
    public fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
    }

    /**
     * @param gopSize GOP size (keyframe interval) in units of either frames or seconds per
     *   gopSizeUnits. If gopSizeUnits is frames, gopSize must be an integer and must be greater
     *   than or equal to 1. If gopSizeUnits is seconds, gopSize must be greater than 0, but need
     *   not be an integer.
     */
    public fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
    }

    /**
     * @param gopSizeUnits Indicates if the gopSize is specified in frames or seconds. If seconds
     *   the system will convert the gopSize into a frame count at run time.
     */
    public fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
    }

    /** @param level H.265 Level. */
    public fun level(level: String) {
        cdkBuilder.level(level)
    }

    /**
     * @param lookAheadRateControl Amount of lookahead. A value of low can decrease latency and
     *   memory usage, while high can produce better quality for certain content.
     */
    public fun lookAheadRateControl(lookAheadRateControl: String) {
        cdkBuilder.lookAheadRateControl(lookAheadRateControl)
    }

    /** @param maxBitrate For QVBR: See the tooltip for Quality level. */
    public fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
    }

    /**
     * @param minIInterval Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if
     *   multiplex rate control is used. Enforces separation between repeated (cadence) I-frames and
     *   I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval
     *   frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change
     *   I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal
     *   cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */
    public fun minIInterval(minIInterval: Number) {
        cdkBuilder.minIInterval(minIInterval)
    }

    /** @param parDenominator Pixel Aspect Ratio denominator. */
    public fun parDenominator(parDenominator: Number) {
        cdkBuilder.parDenominator(parDenominator)
    }

    /** @param parNumerator Pixel Aspect Ratio numerator. */
    public fun parNumerator(parNumerator: Number) {
        cdkBuilder.parNumerator(parNumerator)
    }

    /** @param profile H.265 Profile. */
    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    /**
     * @param qvbrQualityLevel Controls the target quality for the video encode. Applies only when
     *   the rate control mode is QVBR. Set values for the QVBR quality level field and Max bitrate
     *   field that suit your most important viewing devices. Recommended values are:
     * * Primary screen: Quality level: 8 to 10. Max bitrate: 4M
     * * PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M
     * * Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     */
    public fun qvbrQualityLevel(qvbrQualityLevel: Number) {
        cdkBuilder.qvbrQualityLevel(qvbrQualityLevel)
    }

    /**
     * @param rateControlMode Rate control mode. QVBR: Quality will match the specified quality
     *   level except when it is constrained by the maximum bitrate. Recommended if you or your
     *   viewers pay for bandwidth. CBR: Quality varies, depending on the video complexity.
     *   Recommended only if you distribute your assets to devices that cannot handle variable
     *   bitrates. Multiplex: This rate control mode is only supported (and is required) when the
     *   video is being delivered to a MediaLive Multiplex in which case the rate control
     *   configuration is controlled by the properties within the Multiplex Program.
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

    /** @param sceneChangeDetect Scene change detection. */
    public fun sceneChangeDetect(sceneChangeDetect: String) {
        cdkBuilder.sceneChangeDetect(sceneChangeDetect)
    }

    /**
     * @param slices Number of slices per picture. Must be less than or equal to the number of
     *   macroblock rows for progressive pictures, and less than or equal to half the number of
     *   macroblock rows for interlaced pictures. This field is optional; when no value is specified
     *   the encoder will choose the number of slices based on encode resolution.
     */
    public fun slices(slices: Number) {
        cdkBuilder.slices(slices)
    }

    /** @param tier H.265 Tier. */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
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
     *   elementary stream.
     * * 'disabled': Do not include timecodes
     * * 'picTimingSei': Pass through picture timing SEI messages from the source specified in
     *   Timecode Config
     */
    public fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
    }

    public fun build(): CfnChannel.H265SettingsProperty = cdkBuilder.build()
}
