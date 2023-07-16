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

  public fun bitDepth(bitDepth: Number) {
    cdkBuilder.bitDepth(bitDepth)
  }

  public fun codingMode(codingMode: String) {
    cdkBuilder.codingMode(codingMode)
  }

  public fun sampleRate(sampleRate: Number) {
    cdkBuilder.sampleRate(sampleRate)
  }

  public fun build(): CfnChannel.WavSettingsProperty = cdkBuilder.build()
}
