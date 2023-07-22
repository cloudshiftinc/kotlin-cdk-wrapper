@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelWavSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.WavSettingsProperty.Builder =
      CfnChannel.WavSettingsProperty.builder()

  /**
   * @param bitDepth Bits per sample.
   */
  public fun bitDepth(bitDepth: Number) {
    cdkBuilder.bitDepth(bitDepth)
  }

  /**
   * @param codingMode The audio coding mode for the WAV audio.
   * The mode determines the number of channels in the audio.
   */
  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  /**
   * @param sampleRate Sample rate in Hz.
   */
  public fun sampleRate(sampleRate: Number) {
    cdkBuilder.sampleRate(sampleRate)
  }

  public fun build(): CfnChannel.WavSettingsProperty = cdkBuilder.build()
}
