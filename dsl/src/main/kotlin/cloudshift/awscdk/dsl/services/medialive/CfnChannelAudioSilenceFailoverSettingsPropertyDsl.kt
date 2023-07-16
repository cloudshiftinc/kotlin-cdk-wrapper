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

  public fun audioSelectorName(audioSelectorName: String) {
    cdkBuilder.audioSelectorName(audioSelectorName)
  }

  public fun audioSilenceThresholdMsec(audioSilenceThresholdMsec: Number) {
    cdkBuilder.audioSilenceThresholdMsec(audioSilenceThresholdMsec)
  }

  public fun build(): CfnChannel.AudioSilenceFailoverSettingsProperty = cdkBuilder.build()
}
