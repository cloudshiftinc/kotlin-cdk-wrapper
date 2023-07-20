@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelPassThroughSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.PassThroughSettingsProperty.Builder =
      CfnChannel.PassThroughSettingsProperty.builder()

  public fun build(): CfnChannel.PassThroughSettingsProperty = cdkBuilder.build()
}
