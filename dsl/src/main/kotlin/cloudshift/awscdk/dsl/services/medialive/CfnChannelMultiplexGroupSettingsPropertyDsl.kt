@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMultiplexGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MultiplexGroupSettingsProperty.Builder =
      CfnChannel.MultiplexGroupSettingsProperty.builder()

  public fun build(): CfnChannel.MultiplexGroupSettingsProperty = cdkBuilder.build()
}
