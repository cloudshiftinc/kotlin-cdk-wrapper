@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelInputChannelLevelPropertyDsl {
  private val cdkBuilder: CfnChannel.InputChannelLevelProperty.Builder =
      CfnChannel.InputChannelLevelProperty.builder()

  public fun gain(gain: Number) {
    cdkBuilder.gain(gain)
  }

  public fun inputChannel(inputChannel: Number) {
    cdkBuilder.inputChannel(inputChannel)
  }

  public fun build(): CfnChannel.InputChannelLevelProperty = cdkBuilder.build()
}
