@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelEmbeddedDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.EmbeddedDestinationSettingsProperty.Builder =
      CfnChannel.EmbeddedDestinationSettingsProperty.builder()

  public fun build(): CfnChannel.EmbeddedDestinationSettingsProperty = cdkBuilder.build()
}
