@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioSilenceFailoverSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioSilenceFailoverSettingsProperty.Builder =
      CfnChannel.AudioSilenceFailoverSettingsProperty.builder()

  /**
   * @param audioSelectorName The name of the audio selector in the input that MediaLive should
   * monitor to detect silence.
   * Select your most important rendition. If you didn't create an audio selector in this input,
   * leave blank.
   */
  public fun audioSelectorName(audioSelectorName: String) {
    cdkBuilder.audioSelectorName(audioSelectorName)
  }

  /**
   * @param audioSilenceThresholdMsec The amount of time (in milliseconds) that the active input
   * must be silent before automatic input failover occurs.
   * Silence is defined as audio loss or audio quieter than -50 dBFS.
   */
  public fun audioSilenceThresholdMsec(audioSilenceThresholdMsec: Number) {
    cdkBuilder.audioSilenceThresholdMsec(audioSilenceThresholdMsec)
  }

  public fun build(): CfnChannel.AudioSilenceFailoverSettingsProperty = cdkBuilder.build()
}
