@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMp2SettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Mp2SettingsProperty.Builder =
      CfnChannel.Mp2SettingsProperty.builder()

  /**
   * @param bitrate The average bitrate in bits/second.
   */
  public fun bitrate(bitrate: Number) {
    cdkBuilder.bitrate(bitrate)
  }

  /**
   * @param codingMode The MPEG2 Audio coding mode.
   * Valid values are codingMode10 (for mono) or codingMode20 (for stereo).
   */
  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  /**
   * @param sampleRate The sample rate in Hz.
   */
  public fun sampleRate(sampleRate: Number) {
    cdkBuilder.sampleRate(sampleRate)
  }

  public fun build(): CfnChannel.Mp2SettingsProperty = cdkBuilder.build()
}
