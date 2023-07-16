@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelTemporalFilterSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.TemporalFilterSettingsProperty.Builder =
      CfnChannel.TemporalFilterSettingsProperty.builder()

  public fun postFilterSharpening(postFilterSharpening: String) {
    cdkBuilder.postFilterSharpening(postFilterSharpening)
  }

  public fun strength(strength: String) {
    cdkBuilder.strength(strength)
  }

  public fun build(): CfnChannel.TemporalFilterSettingsProperty = cdkBuilder.build()
}
