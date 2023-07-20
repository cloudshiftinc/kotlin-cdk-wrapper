@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAudioNormalizationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AudioNormalizationSettingsProperty.Builder =
      CfnChannel.AudioNormalizationSettingsProperty.builder()

  public fun algorithm(algorithm: String) {
    cdkBuilder.algorithm(algorithm)
  }

  public fun algorithmControl(algorithmControl: String) {
    cdkBuilder.algorithmControl(algorithmControl)
  }

  public fun targetLkfs(targetLkfs: Number) {
    cdkBuilder.targetLkfs(targetLkfs)
  }

  public fun build(): CfnChannel.AudioNormalizationSettingsProperty = cdkBuilder.build()
}
