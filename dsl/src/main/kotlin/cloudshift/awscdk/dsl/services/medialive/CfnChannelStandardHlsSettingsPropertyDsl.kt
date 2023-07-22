@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelStandardHlsSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.StandardHlsSettingsProperty.Builder =
      CfnChannel.StandardHlsSettingsProperty.builder()

  /**
   * @param audioRenditionSets Lists all the audio groups that are used with the video output
   * stream.
   * This inputs all the audio GROUP-IDs that are associated with the video, separated by a comma
   * (,).
   */
  public fun audioRenditionSets(audioRenditionSets: String) {
    cdkBuilder.audioRenditionSets(audioRenditionSets)
  }

  /**
   * @param m3U8Settings Settings for the M3U8 container.
   */
  public fun m3U8Settings(m3U8Settings: IResolvable) {
    cdkBuilder.m3U8Settings(m3U8Settings)
  }

  /**
   * @param m3U8Settings Settings for the M3U8 container.
   */
  public fun m3U8Settings(m3U8Settings: CfnChannel.M3u8SettingsProperty) {
    cdkBuilder.m3U8Settings(m3U8Settings)
  }

  public fun build(): CfnChannel.StandardHlsSettingsProperty = cdkBuilder.build()
}
