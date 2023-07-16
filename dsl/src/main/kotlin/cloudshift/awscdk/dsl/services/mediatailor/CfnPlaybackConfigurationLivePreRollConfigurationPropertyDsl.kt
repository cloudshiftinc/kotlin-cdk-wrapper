@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

@CdkDslMarker
public class CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.LivePreRollConfigurationProperty.Builder =
      CfnPlaybackConfiguration.LivePreRollConfigurationProperty.builder()

  public fun adDecisionServerUrl(adDecisionServerUrl: String) {
    cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
  }

  public fun maxDurationSeconds(maxDurationSeconds: Number) {
    cdkBuilder.maxDurationSeconds(maxDurationSeconds)
  }

  public fun build(): CfnPlaybackConfiguration.LivePreRollConfigurationProperty = cdkBuilder.build()
}
