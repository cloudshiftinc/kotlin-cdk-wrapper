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

  /**
   * @param adDecisionServerUrl The URL for the ad decision server (ADS) for pre-roll ads.
   * This includes the specification of static parameters and placeholders for dynamic parameters.
   * AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed
   * when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum
   * length is 25,000 characters.
   */
  public fun adDecisionServerUrl(adDecisionServerUrl: String) {
    cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
  }

  /**
   * @param maxDurationSeconds The maximum allowed duration for the pre-roll ad avail.
   * AWS Elemental MediaTailor won't play pre-roll ads to exceed this duration, regardless of the
   * total duration of ads that the ADS returns.
   */
  public fun maxDurationSeconds(maxDurationSeconds: Number) {
    cdkBuilder.maxDurationSeconds(maxDurationSeconds)
  }

  public fun build(): CfnPlaybackConfiguration.LivePreRollConfigurationProperty = cdkBuilder.build()
}
