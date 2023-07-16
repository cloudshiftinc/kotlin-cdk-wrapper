@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder =
      CfnPlaybackConfiguration.ManifestProcessingRulesProperty.builder()

  public fun adMarkerPassthrough(adMarkerPassthrough: IResolvable) {
    cdkBuilder.adMarkerPassthrough(adMarkerPassthrough)
  }

  public
      fun adMarkerPassthrough(adMarkerPassthrough: CfnPlaybackConfiguration.AdMarkerPassthroughProperty) {
    cdkBuilder.adMarkerPassthrough(adMarkerPassthrough)
  }

  public fun build(): CfnPlaybackConfiguration.ManifestProcessingRulesProperty = cdkBuilder.build()
}
