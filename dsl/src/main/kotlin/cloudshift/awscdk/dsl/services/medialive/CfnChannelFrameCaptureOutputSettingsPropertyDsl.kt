@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFrameCaptureOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.FrameCaptureOutputSettingsProperty.Builder =
      CfnChannel.FrameCaptureOutputSettingsProperty.builder()

  public fun nameModifier(nameModifier: String) {
    cdkBuilder.nameModifier(nameModifier)
  }

  public fun build(): CfnChannel.FrameCaptureOutputSettingsProperty = cdkBuilder.build()
}
