@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAribSourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AribSourceSettingsProperty.Builder =
      CfnChannel.AribSourceSettingsProperty.builder()

  public fun build(): CfnChannel.AribSourceSettingsProperty = cdkBuilder.build()
}
