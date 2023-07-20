@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationBumperPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.BumperProperty.Builder =
      CfnPlaybackConfiguration.BumperProperty.builder()

  public fun endUrl(endUrl: String) {
    cdkBuilder.endUrl(endUrl)
  }

  public fun startUrl(startUrl: String) {
    cdkBuilder.startUrl(startUrl)
  }

  public fun build(): CfnPlaybackConfiguration.BumperProperty = cdkBuilder.build()
}
