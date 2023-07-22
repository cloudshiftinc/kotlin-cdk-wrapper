@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of an HLS output that is a standard output (not an audio-only output).
 *
 * The parent of this entity is HlsSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * StandardHlsSettingsProperty standardHlsSettingsProperty = StandardHlsSettingsProperty.builder()
 * .audioRenditionSets("audioRenditionSets")
 * .m3U8Settings(M3u8SettingsProperty.builder()
 * .audioFramesPerPes(123)
 * .audioPids("audioPids")
 * .ecmPid("ecmPid")
 * .nielsenId3Behavior("nielsenId3Behavior")
 * .patInterval(123)
 * .pcrControl("pcrControl")
 * .pcrPeriod(123)
 * .pcrPid("pcrPid")
 * .pmtInterval(123)
 * .pmtPid("pmtPid")
 * .programNum(123)
 * .scte35Behavior("scte35Behavior")
 * .scte35Pid("scte35Pid")
 * .timedMetadataBehavior("timedMetadataBehavior")
 * .timedMetadataPid("timedMetadataPid")
 * .transportStreamId(123)
 * .videoPid("videoPid")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-standardhlssettings.html)
 */
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
