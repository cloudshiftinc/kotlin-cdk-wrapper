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

  public fun bitrate(bitrate: Number) {
    cdkBuilder.bitrate(bitrate)
  }

  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  public fun sampleRate(sampleRate: Number) {
    cdkBuilder.sampleRate(sampleRate)
  }

  public fun build(): CfnChannel.Mp2SettingsProperty = cdkBuilder.build()
}
