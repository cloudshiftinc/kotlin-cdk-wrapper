@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFmp4HlsSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Fmp4HlsSettingsProperty.Builder =
      CfnChannel.Fmp4HlsSettingsProperty.builder()

  public fun audioRenditionSets(audioRenditionSets: String) {
    cdkBuilder.audioRenditionSets(audioRenditionSets)
  }

  public fun nielsenId3Behavior(nielsenId3Behavior: String) {
    cdkBuilder.nielsenId3Behavior(nielsenId3Behavior)
  }

  public fun timedMetadataBehavior(timedMetadataBehavior: String) {
    cdkBuilder.timedMetadataBehavior(timedMetadataBehavior)
  }

  public fun build(): CfnChannel.Fmp4HlsSettingsProperty = cdkBuilder.build()
}
