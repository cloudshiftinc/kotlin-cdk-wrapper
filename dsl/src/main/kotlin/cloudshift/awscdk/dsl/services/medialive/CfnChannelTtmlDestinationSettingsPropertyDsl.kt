@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelTtmlDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.TtmlDestinationSettingsProperty.Builder =
      CfnChannel.TtmlDestinationSettingsProperty.builder()

  public fun styleControl(styleControl: String) {
    cdkBuilder.styleControl(styleControl)
  }

  public fun build(): CfnChannel.TtmlDestinationSettingsProperty = cdkBuilder.build()
}
