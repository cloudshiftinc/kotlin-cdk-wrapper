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
 * An input to attach to this channel.
 *
 * This entity is at the top level in the channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputAttachmentProperty inputAttachmentProperty = InputAttachmentProperty.builder()
 * .automaticInputFailoverSettings(AutomaticInputFailoverSettingsProperty.builder()
 * .errorClearTimeMsec(123)
 * .failoverConditions(List.of(FailoverConditionProperty.builder()
 * .failoverConditionSettings(FailoverConditionSettingsProperty.builder()
 * .audioSilenceSettings(AudioSilenceFailoverSettingsProperty.builder()
 * .audioSelectorName("audioSelectorName")
 * .audioSilenceThresholdMsec(123)
 * .build())
 * .inputLossSettings(InputLossFailoverSettingsProperty.builder()
 * .inputLossThresholdMsec(123)
 * .build())
 * .videoBlackSettings(VideoBlackFailoverSettingsProperty.builder()
 * .blackDetectThreshold(123)
 * .videoBlackThresholdMsec(123)
 * .build())
 * .build())
 * .build()))
 * .inputPreference("inputPreference")
 * .secondaryInputId("secondaryInputId")
 * .build())
 * .inputAttachmentName("inputAttachmentName")
 * .inputId("inputId")
 * .inputSettings(InputSettingsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html)
 */
@CdkDslMarker
public class CfnChannelInputAttachmentPropertyDsl {
    private val cdkBuilder: CfnChannel.InputAttachmentProperty.Builder =
        CfnChannel.InputAttachmentProperty.builder()

    /**
     * @param automaticInputFailoverSettings Settings to implement automatic input failover in this
     *   input.
     */
    public fun automaticInputFailoverSettings(automaticInputFailoverSettings: IResolvable) {
        cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings)
    }

    /**
     * @param automaticInputFailoverSettings Settings to implement automatic input failover in this
     *   input.
     */
    public fun automaticInputFailoverSettings(
        automaticInputFailoverSettings: CfnChannel.AutomaticInputFailoverSettingsProperty
    ) {
        cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings)
    }

    /**
     * @param inputAttachmentName A name for the attachment. This is required if you want to use
     *   this input in an input switch action.
     */
    public fun inputAttachmentName(inputAttachmentName: String) {
        cdkBuilder.inputAttachmentName(inputAttachmentName)
    }

    /** @param inputId The ID of the input to attach. */
    public fun inputId(inputId: String) {
        cdkBuilder.inputId(inputId)
    }

    /**
     * @param inputSettings Information about the content to extract from the input and about the
     *   general handling of the content.
     */
    public fun inputSettings(inputSettings: IResolvable) {
        cdkBuilder.inputSettings(inputSettings)
    }

    /**
     * @param inputSettings Information about the content to extract from the input and about the
     *   general handling of the content.
     */
    public fun inputSettings(inputSettings: CfnChannel.InputSettingsProperty) {
        cdkBuilder.inputSettings(inputSettings)
    }

    public fun build(): CfnChannel.InputAttachmentProperty = cdkBuilder.build()
}
