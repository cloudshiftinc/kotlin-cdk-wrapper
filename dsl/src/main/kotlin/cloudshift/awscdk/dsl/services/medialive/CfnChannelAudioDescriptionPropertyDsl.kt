@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioDescriptionPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioDescriptionProperty.Builder =
      CfnChannel.AudioDescriptionProperty.builder()

  public fun audioNormalizationSettings(audioNormalizationSettings: IResolvable) {
    cdkBuilder.audioNormalizationSettings(audioNormalizationSettings)
  }

  public
      fun audioNormalizationSettings(audioNormalizationSettings: CfnChannel.AudioNormalizationSettingsProperty) {
    cdkBuilder.audioNormalizationSettings(audioNormalizationSettings)
  }

  public fun audioSelectorName(audioSelectorName: String) {
    cdkBuilder.audioSelectorName(audioSelectorName)
  }

  public fun audioType(audioType: String) {
    cdkBuilder.audioType(audioType)
  }

  public fun audioTypeControl(audioTypeControl: String) {
    cdkBuilder.audioTypeControl(audioTypeControl)
  }

  public fun audioWatermarkingSettings(audioWatermarkingSettings: IResolvable) {
    cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings)
  }

  public
      fun audioWatermarkingSettings(audioWatermarkingSettings: CfnChannel.AudioWatermarkSettingsProperty) {
    cdkBuilder.audioWatermarkingSettings(audioWatermarkingSettings)
  }

  public fun codecSettings(codecSettings: IResolvable) {
    cdkBuilder.codecSettings(codecSettings)
  }

  public fun codecSettings(codecSettings: CfnChannel.AudioCodecSettingsProperty) {
    cdkBuilder.codecSettings(codecSettings)
  }

  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  public fun languageCodeControl(languageCodeControl: String) {
    cdkBuilder.languageCodeControl(languageCodeControl)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun remixSettings(remixSettings: IResolvable) {
    cdkBuilder.remixSettings(remixSettings)
  }

  public fun remixSettings(remixSettings: CfnChannel.RemixSettingsProperty) {
    cdkBuilder.remixSettings(remixSettings)
  }

  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): CfnChannel.AudioDescriptionProperty = cdkBuilder.build()
}
