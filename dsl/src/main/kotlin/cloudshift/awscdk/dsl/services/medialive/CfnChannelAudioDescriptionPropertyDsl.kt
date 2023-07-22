@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The encoding information for one output audio.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AudioDescriptionProperty audioDescriptionProperty = AudioDescriptionProperty.builder()
 * .audioNormalizationSettings(AudioNormalizationSettingsProperty.builder()
 * .algorithm("algorithm")
 * .algorithmControl("algorithmControl")
 * .targetLkfs(123)
 * .build())
 * .audioSelectorName("audioSelectorName")
 * .audioType("audioType")
 * .audioTypeControl("audioTypeControl")
 * .audioWatermarkingSettings(AudioWatermarkSettingsProperty.builder()
 * .nielsenWatermarksSettings(NielsenWatermarksSettingsProperty.builder()
 * .nielsenCbetSettings(NielsenCBETProperty.builder()
 * .cbetCheckDigitString("cbetCheckDigitString")
 * .cbetStepaside("cbetStepaside")
 * .csid("csid")
 * .build())
 * .nielsenDistributionType("nielsenDistributionType")
 * .nielsenNaesIiNwSettings(NielsenNaesIiNwProperty.builder()
 * .checkDigitString("checkDigitString")
 * .sid(123)
 * .timezone("timezone")
 * .build())
 * .build())
 * .build())
 * .codecSettings(AudioCodecSettingsProperty.builder()
 * .aacSettings(AacSettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .inputType("inputType")
 * .profile("profile")
 * .rateControlMode("rateControlMode")
 * .rawFormat("rawFormat")
 * .sampleRate(123)
 * .spec("spec")
 * .vbrQuality("vbrQuality")
 * .build())
 * .ac3Settings(Ac3SettingsProperty.builder()
 * .bitrate(123)
 * .bitstreamMode("bitstreamMode")
 * .codingMode("codingMode")
 * .dialnorm(123)
 * .drcProfile("drcProfile")
 * .lfeFilter("lfeFilter")
 * .metadataControl("metadataControl")
 * .build())
 * .eac3AtmosSettings(Eac3AtmosSettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .dialnorm(123)
 * .drcLine("drcLine")
 * .drcRf("drcRf")
 * .heightTrim(123)
 * .surroundTrim(123)
 * .build())
 * .eac3Settings(Eac3SettingsProperty.builder()
 * .attenuationControl("attenuationControl")
 * .bitrate(123)
 * .bitstreamMode("bitstreamMode")
 * .codingMode("codingMode")
 * .dcFilter("dcFilter")
 * .dialnorm(123)
 * .drcLine("drcLine")
 * .drcRf("drcRf")
 * .lfeControl("lfeControl")
 * .lfeFilter("lfeFilter")
 * .loRoCenterMixLevel(123)
 * .loRoSurroundMixLevel(123)
 * .ltRtCenterMixLevel(123)
 * .ltRtSurroundMixLevel(123)
 * .metadataControl("metadataControl")
 * .passthroughControl("passthroughControl")
 * .phaseControl("phaseControl")
 * .stereoDownmix("stereoDownmix")
 * .surroundExMode("surroundExMode")
 * .surroundMode("surroundMode")
 * .build())
 * .mp2Settings(Mp2SettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .sampleRate(123)
 * .build())
 * .passThroughSettings(PassThroughSettingsProperty.builder().build())
 * .wavSettings(WavSettingsProperty.builder()
 * .bitDepth(123)
 * .codingMode("codingMode")
 * .sampleRate(123)
 * .build())
 * .build())
 * .languageCode("languageCode")
 * .languageCodeControl("languageCodeControl")
 * .name("name")
 * .remixSettings(RemixSettingsProperty.builder()
 * .channelMappings(List.of(AudioChannelMappingProperty.builder()
 * .inputChannelLevels(List.of(InputChannelLevelProperty.builder()
 * .gain(123)
 * .inputChannel(123)
 * .build()))
 * .outputChannel(123)
 * .build()))
 * .channelsIn(123)
 * .channelsOut(123)
 * .build())
 * .streamName("streamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiodescription.html)
 */
@CdkDslMarker
public class CfnChannelAudioDescriptionPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioDescriptionProperty.Builder =
      CfnChannel.AudioDescriptionProperty.builder()

  /**
   * @param audioNormalizationSettings The advanced audio normalization settings.
   */
  public fun audioNormalizationSettings(audioNormalizationSettings: IResolvable) {
    cdkBuilder.audioNormalizationSettings(audioNormalizationSettings)
  }

  /**
   * @param audioNormalizationSettings The advanced audio normalization settings.
   */
  public
      fun audioNormalizationSettings(audioNormalizationSettings: CfnChannel.AudioNormalizationSettingsProperty) {
    cdkBuilder.audioNormalizationSettings(audioNormalizationSettings)
  }

  /**
   * @param audioSelectorName The name of the AudioSelector that is used as the source for this
   * AudioDescription.
   */
  public fun audioSelectorName(audioSelectorName: String) {
    cdkBuilder.audioSelectorName(audioSelectorName)
  }

  /**
   * @param audioType Applies only if audioTypeControl is useConfigured.
   * The values for audioType are defined in ISO-IEC 13818-1.
   */
  public fun audioType(audioType: String) {
    cdkBuilder.audioType(audioType)
  }

  /**
   * @param audioTypeControl Determines how audio type is determined.
   * followInput: If the input contains an ISO 639 audioType, then that value is passed through to
   * the output. If the input contains no ISO 639 audioType, the value in Audio Type is included in the
   * output. useConfigured: The value in Audio Type is included in the output. Note that this field and
   * audioType are both ignored if inputType is broadcasterMixedAd.
   */
  public fun audioTypeControl(audioTypeControl: String) {
    cdkBuilder.audioTypeControl(audioTypeControl)
  }

  /**
   * @param audioWatermarkingSettings Settings to configure one or more solutions that insert audio
   * watermarks in the audio encode.
   */
  public fun audioWatermarkingSettings(audioWatermarkingSettings: IResolvable) {
    cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings)
  }

  /**
   * @param audioWatermarkingSettings Settings to configure one or more solutions that insert audio
   * watermarks in the audio encode.
   */
  public
      fun audioWatermarkingSettings(audioWatermarkingSettings: CfnChannel.AudioWatermarkSettingsProperty) {
    cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings)
  }

  /**
   * @param codecSettings The audio codec settings.
   */
  public fun codecSettings(codecSettings: IResolvable) {
    cdkBuilder.codecSettings(codecSettings)
  }

  /**
   * @param codecSettings The audio codec settings.
   */
  public fun codecSettings(codecSettings: CfnChannel.AudioCodecSettingsProperty) {
    cdkBuilder.codecSettings(codecSettings)
  }

  /**
   * @param languageCode Indicates the language of the audio output track.
   * Used only if languageControlMode is useConfigured, or there is no ISO 639 language code
   * specified in the input.
   */
  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  /**
   * @param languageCodeControl Choosing followInput causes the ISO 639 language code of the output
   * to follow the ISO 639 language code of the input.
   * The languageCode setting is used when useConfigured is set, or when followInput is selected but
   * there is no ISO 639 language code specified by the input.
   */
  public fun languageCodeControl(languageCodeControl: String) {
    cdkBuilder.languageCodeControl(languageCodeControl)
  }

  /**
   * @param name The name of this AudioDescription.
   * Outputs use this name to uniquely identify this AudioDescription. Description names should be
   * unique within this channel.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param remixSettings The settings that control how input audio channels are remixed into the
   * output audio channels.
   */
  public fun remixSettings(remixSettings: IResolvable) {
    cdkBuilder.remixSettings(remixSettings)
  }

  /**
   * @param remixSettings The settings that control how input audio channels are remixed into the
   * output audio channels.
   */
  public fun remixSettings(remixSettings: CfnChannel.RemixSettingsProperty) {
    cdkBuilder.remixSettings(remixSettings)
  }

  /**
   * @param streamName Used for Microsoft Smooth and Apple HLS outputs.
   * Indicates the name displayed by the player (for example, English or Director Commentary).
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): CfnChannel.AudioDescriptionProperty = cdkBuilder.build()
}
