@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationHlsConfigurationPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.HlsConfigurationProperty.Builder =
      CfnPlaybackConfiguration.HlsConfigurationProperty.builder()

  public fun manifestEndpointPrefix(manifestEndpointPrefix: String) {
    cdkBuilder.manifestEndpointPrefix(manifestEndpointPrefix)
  }

  public fun build(): CfnPlaybackConfiguration.HlsConfigurationProperty = cdkBuilder.build()
}
