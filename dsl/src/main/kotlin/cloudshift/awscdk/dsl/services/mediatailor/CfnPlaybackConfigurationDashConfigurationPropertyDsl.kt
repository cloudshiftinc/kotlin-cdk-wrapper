@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationDashConfigurationPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.DashConfigurationProperty.Builder =
      CfnPlaybackConfiguration.DashConfigurationProperty.builder()

  public fun manifestEndpointPrefix(manifestEndpointPrefix: String) {
    cdkBuilder.manifestEndpointPrefix(manifestEndpointPrefix)
  }

  public fun mpdLocation(mpdLocation: String) {
    cdkBuilder.mpdLocation(mpdLocation)
  }

  public fun originManifestType(originManifestType: String) {
    cdkBuilder.originManifestType(originManifestType)
  }

  public fun build(): CfnPlaybackConfiguration.DashConfigurationProperty = cdkBuilder.build()
}
