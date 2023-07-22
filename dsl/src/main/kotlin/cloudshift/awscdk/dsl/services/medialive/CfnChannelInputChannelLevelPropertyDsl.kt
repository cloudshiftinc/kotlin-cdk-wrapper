@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelInputChannelLevelPropertyDsl {
  private val cdkBuilder: CfnChannel.InputChannelLevelProperty.Builder =
      CfnChannel.InputChannelLevelProperty.builder()

  /**
   * @param gain The remixing value.
   * Units are in dB, and acceptable values are within the range from -60 (mute) to 6 dB.
   */
  public fun gain(gain: Number) {
    cdkBuilder.gain(gain)
  }

  /**
   * @param inputChannel The index of the input channel that is used as a source.
   */
  public fun inputChannel(inputChannel: Number) {
    cdkBuilder.inputChannel(inputChannel)
  }

  public fun build(): CfnChannel.InputChannelLevelProperty = cdkBuilder.build()
}
