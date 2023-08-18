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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about extracting content from the input and about handling the content.
 *
 * The parent of this entity is InputAttachment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputSettingsProperty inputSettingsProperty = InputSettingsProperty.builder()
 * .audioSelectors(List.of(AudioSelectorProperty.builder()
 * .name("name")
 * .selectorSettings(AudioSelectorSettingsProperty.builder()
 * .audioHlsRenditionSelection(AudioHlsRenditionSelectionProperty.builder()
 * .groupId("groupId")
 * .name("name")
 * .build())
 * .audioLanguageSelection(AudioLanguageSelectionProperty.builder()
 * .languageCode("languageCode")
 * .languageSelectionPolicy("languageSelectionPolicy")
 * .build())
 * .audioPidSelection(AudioPidSelectionProperty.builder()
 * .pid(123)
 * .build())
 * .audioTrackSelection(AudioTrackSelectionProperty.builder()
 * .dolbyEDecode(AudioDolbyEDecodeProperty.builder()
 * .programSelection("programSelection")
 * .build())
 * .tracks(List.of(AudioTrackProperty.builder()
 * .track(123)
 * .build()))
 * .build())
 * .build())
 * .build()))
 * .captionSelectors(List.of(CaptionSelectorProperty.builder()
 * .languageCode("languageCode")
 * .name("name")
 * .selectorSettings(CaptionSelectorSettingsProperty.builder()
 * .ancillarySourceSettings(AncillarySourceSettingsProperty.builder()
 * .sourceAncillaryChannelNumber(123)
 * .build())
 * .aribSourceSettings(AribSourceSettingsProperty.builder().build())
 * .dvbSubSourceSettings(DvbSubSourceSettingsProperty.builder()
 * .ocrLanguage("ocrLanguage")
 * .pid(123)
 * .build())
 * .embeddedSourceSettings(EmbeddedSourceSettingsProperty.builder()
 * .convert608To708("convert608To708")
 * .scte20Detection("scte20Detection")
 * .source608ChannelNumber(123)
 * .source608TrackNumber(123)
 * .build())
 * .scte20SourceSettings(Scte20SourceSettingsProperty.builder()
 * .convert608To708("convert608To708")
 * .source608ChannelNumber(123)
 * .build())
 * .scte27SourceSettings(Scte27SourceSettingsProperty.builder()
 * .ocrLanguage("ocrLanguage")
 * .pid(123)
 * .build())
 * .teletextSourceSettings(TeletextSourceSettingsProperty.builder()
 * .outputRectangle(CaptionRectangleProperty.builder()
 * .height(123)
 * .leftOffset(123)
 * .topOffset(123)
 * .width(123)
 * .build())
 * .pageNumber("pageNumber")
 * .build())
 * .build())
 * .build()))
 * .deblockFilter("deblockFilter")
 * .denoiseFilter("denoiseFilter")
 * .filterStrength(123)
 * .inputFilter("inputFilter")
 * .networkInputSettings(NetworkInputSettingsProperty.builder()
 * .hlsInputSettings(HlsInputSettingsProperty.builder()
 * .bandwidth(123)
 * .bufferSegments(123)
 * .retries(123)
 * .retryInterval(123)
 * .scte35Source("scte35Source")
 * .build())
 * .serverValidation("serverValidation")
 * .build())
 * .scte35Pid(123)
 * .smpte2038DataPreference("smpte2038DataPreference")
 * .sourceEndBehavior("sourceEndBehavior")
 * .videoSelector(VideoSelectorProperty.builder()
 * .colorSpace("colorSpace")
 * .colorSpaceSettings(VideoSelectorColorSpaceSettingsProperty.builder()
 * .hdr10Settings(Hdr10SettingsProperty.builder()
 * .maxCll(123)
 * .maxFall(123)
 * .build())
 * .build())
 * .colorSpaceUsage("colorSpaceUsage")
 * .selectorSettings(VideoSelectorSettingsProperty.builder()
 * .videoSelectorPid(VideoSelectorPidProperty.builder()
 * .pid(123)
 * .build())
 * .videoSelectorProgramId(VideoSelectorProgramIdProperty.builder()
 * .programId(123)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html)
 */
@CdkDslMarker
public class CfnChannelInputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.InputSettingsProperty.Builder =
        CfnChannel.InputSettingsProperty.builder()

    private val _audioSelectors: MutableList<Any> = mutableListOf()

    private val _captionSelectors: MutableList<Any> = mutableListOf()

    /**
     * @param audioSelectors Information about the specific audio to extract from the input. The
     *   parent of this entity is InputSettings.
     */
    public fun audioSelectors(vararg audioSelectors: Any) {
        _audioSelectors.addAll(listOf(*audioSelectors))
    }

    /**
     * @param audioSelectors Information about the specific audio to extract from the input. The
     *   parent of this entity is InputSettings.
     */
    public fun audioSelectors(audioSelectors: Collection<Any>) {
        _audioSelectors.addAll(audioSelectors)
    }

    /**
     * @param audioSelectors Information about the specific audio to extract from the input. The
     *   parent of this entity is InputSettings.
     */
    public fun audioSelectors(audioSelectors: IResolvable) {
        cdkBuilder.audioSelectors(audioSelectors)
    }

    /**
     * @param captionSelectors Information about the specific captions to extract from the input.
     */
    public fun captionSelectors(vararg captionSelectors: Any) {
        _captionSelectors.addAll(listOf(*captionSelectors))
    }

    /**
     * @param captionSelectors Information about the specific captions to extract from the input.
     */
    public fun captionSelectors(captionSelectors: Collection<Any>) {
        _captionSelectors.addAll(captionSelectors)
    }

    /**
     * @param captionSelectors Information about the specific captions to extract from the input.
     */
    public fun captionSelectors(captionSelectors: IResolvable) {
        cdkBuilder.captionSelectors(captionSelectors)
    }

    /** @param deblockFilter Enables or disables the deblock filter when filtering. */
    public fun deblockFilter(deblockFilter: String) {
        cdkBuilder.deblockFilter(deblockFilter)
    }

    /** @param denoiseFilter Enables or disables the denoise filter when filtering. */
    public fun denoiseFilter(denoiseFilter: String) {
        cdkBuilder.denoiseFilter(denoiseFilter)
    }

    /**
     * @param filterStrength Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
     */
    public fun filterStrength(filterStrength: Number) {
        cdkBuilder.filterStrength(filterStrength)
    }

    /**
     * @param inputFilter Turns on the filter for this input. MPEG-2 inputs have the deblocking
     *   filter enabled by default. 1) auto - filtering is applied depending on input
     *   type/quality 2) disabled - no filtering is applied to the input 3) forced - filtering is
     *   applied regardless of the input type.
     */
    public fun inputFilter(inputFilter: String) {
        cdkBuilder.inputFilter(inputFilter)
    }

    /** @param networkInputSettings Information about how to connect to the upstream system. */
    public fun networkInputSettings(networkInputSettings: IResolvable) {
        cdkBuilder.networkInputSettings(networkInputSettings)
    }

    /** @param networkInputSettings Information about how to connect to the upstream system. */
    public fun networkInputSettings(networkInputSettings: CfnChannel.NetworkInputSettingsProperty) {
        cdkBuilder.networkInputSettings(networkInputSettings)
    }

    /** @param scte35Pid the value to be set. */
    public fun scte35Pid(scte35Pid: Number) {
        cdkBuilder.scte35Pid(scte35Pid)
    }

    /**
     * @param smpte2038DataPreference Specifies whether to extract applicable ancillary data from a
     *   SMPTE-2038 source in this input. Applicable data types are captions, timecode, AFD, and
     *   SCTE-104 messages.
     * * PREFER: Extract from SMPTE-2038 if present in this input, otherwise extract from another
     *   source (if any).
     * * IGNORE: Never extract any ancillary data from SMPTE-2038.
     */
    public fun smpte2038DataPreference(smpte2038DataPreference: String) {
        cdkBuilder.smpte2038DataPreference(smpte2038DataPreference)
    }

    /** @param sourceEndBehavior The loop input if it is a file. */
    public fun sourceEndBehavior(sourceEndBehavior: String) {
        cdkBuilder.sourceEndBehavior(sourceEndBehavior)
    }

    /** @param videoSelector Information about one video to extract from the input. */
    public fun videoSelector(videoSelector: IResolvable) {
        cdkBuilder.videoSelector(videoSelector)
    }

    /** @param videoSelector Information about one video to extract from the input. */
    public fun videoSelector(videoSelector: CfnChannel.VideoSelectorProperty) {
        cdkBuilder.videoSelector(videoSelector)
    }

    public fun build(): CfnChannel.InputSettingsProperty {
        if (_audioSelectors.isNotEmpty()) cdkBuilder.audioSelectors(_audioSelectors)
        if (_captionSelectors.isNotEmpty()) cdkBuilder.captionSelectors(_captionSelectors)
        return cdkBuilder.build()
    }
}
