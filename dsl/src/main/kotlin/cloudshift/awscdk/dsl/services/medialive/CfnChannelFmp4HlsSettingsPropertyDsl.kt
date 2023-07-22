@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFmp4HlsSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Fmp4HlsSettingsProperty.Builder =
      CfnChannel.Fmp4HlsSettingsProperty.builder()

  /**
   * @param audioRenditionSets List all the audio groups that are used with the video output stream.
   * Input all the audio GROUP-IDs that are associated to the video, separate by ','.
   */
  public fun audioRenditionSets(audioRenditionSets: String) {
    cdkBuilder.audioRenditionSets(audioRenditionSets)
  }

  /**
   * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones for media tracking
   * will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
   */
  public fun nielsenId3Behavior(nielsenId3Behavior: String) {
    cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
  }

  /**
   * @param timedMetadataBehavior When set to passthrough, timed metadata is passed through from
   * input to output.
   */
  public fun timedMetadataBehavior(timedMetadataBehavior: String) {
    cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
  }

  public fun build(): CfnChannel.Fmp4HlsSettingsProperty = cdkBuilder.build()
}
