@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioSelectorSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioSelectorSettingsProperty.Builder =
      CfnChannel.AudioSelectorSettingsProperty.builder()

  public fun audioHlsRenditionSelection(audioHlsRenditionSelection: IResolvable) {
    cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection)
  }

  public
      fun audioHlsRenditionSelection(audioHlsRenditionSelection: CfnChannel.AudioHlsRenditionSelectionProperty) {
    cdkBuilder.audioHlsRenditionSelection(audioHlsRenditionSelection)
  }

  public fun audioLanguageSelection(audioLanguageSelection: IResolvable) {
    cdkBuilder.audioLanguageSelection(audioLanguageSelection)
  }

  public
      fun audioLanguageSelection(audioLanguageSelection: CfnChannel.AudioLanguageSelectionProperty) {
    cdkBuilder.audioLanguageSelection(audioLanguageSelection)
  }

  public fun audioPidSelection(audioPidSelection: IResolvable) {
    cdkBuilder.audioPidSelection(audioPidSelection)
  }

  public fun audioPidSelection(audioPidSelection: CfnChannel.AudioPidSelectionProperty) {
    cdkBuilder.audioPidSelection(audioPidSelection)
  }

  public fun audioTrackSelection(audioTrackSelection: IResolvable) {
    cdkBuilder.audioTrackSelection(audioTrackSelection)
  }

  public fun audioTrackSelection(audioTrackSelection: CfnChannel.AudioTrackSelectionProperty) {
    cdkBuilder.audioTrackSelection(audioTrackSelection)
  }

  public fun build(): CfnChannel.AudioSelectorSettingsProperty = cdkBuilder.build()
}
