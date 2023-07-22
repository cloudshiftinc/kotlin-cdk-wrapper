@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioWatermarkSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioWatermarkSettingsProperty.Builder =
      CfnChannel.AudioWatermarkSettingsProperty.builder()

  /**
   * @param nielsenWatermarksSettings Settings to configure Nielsen Watermarks in the audio encode.
   */
  public fun nielsenWatermarksSettings(nielsenWatermarksSettings: IResolvable) {
    cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings)
  }

  /**
   * @param nielsenWatermarksSettings Settings to configure Nielsen Watermarks in the audio encode.
   */
  public
      fun nielsenWatermarksSettings(nielsenWatermarksSettings: CfnChannel.NielsenWatermarksSettingsProperty) {
    cdkBuilder.nielsenWatermarksSettings(nielsenWatermarksSettings)
  }

  public fun build(): CfnChannel.AudioWatermarkSettingsProperty = cdkBuilder.build()
}
