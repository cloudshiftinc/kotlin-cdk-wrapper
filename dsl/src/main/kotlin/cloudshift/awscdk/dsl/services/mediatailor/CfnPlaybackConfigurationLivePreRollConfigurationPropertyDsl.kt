@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

/**
 * The configuration for pre-roll ad insertion.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * LivePreRollConfigurationProperty livePreRollConfigurationProperty =
 * LivePreRollConfigurationProperty.builder()
 * .adDecisionServerUrl("adDecisionServerUrl")
 * .maxDurationSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-liveprerollconfiguration.html)
 */
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
