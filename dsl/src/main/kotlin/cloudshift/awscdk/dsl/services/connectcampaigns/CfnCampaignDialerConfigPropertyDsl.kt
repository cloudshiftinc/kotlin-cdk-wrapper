@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

@CdkDslMarker
public class CfnCampaignDialerConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.DialerConfigProperty.Builder =
      CfnCampaign.DialerConfigProperty.builder()

  /**
   * @param predictiveDialerConfig The configuration of the predictive dialer.
   */
  public fun predictiveDialerConfig(predictiveDialerConfig: IResolvable) {
    cdkBuilder.predictiveDialerConfig(predictiveDialerConfig)
  }

  /**
   * @param predictiveDialerConfig The configuration of the predictive dialer.
   */
  public
      fun predictiveDialerConfig(predictiveDialerConfig: CfnCampaign.PredictiveDialerConfigProperty) {
    cdkBuilder.predictiveDialerConfig(predictiveDialerConfig)
  }

  /**
   * @param progressiveDialerConfig The configuration of the progressive dialer.
   */
  public fun progressiveDialerConfig(progressiveDialerConfig: IResolvable) {
    cdkBuilder.progressiveDialerConfig(progressiveDialerConfig)
  }

  /**
   * @param progressiveDialerConfig The configuration of the progressive dialer.
   */
  public
      fun progressiveDialerConfig(progressiveDialerConfig: CfnCampaign.ProgressiveDialerConfigProperty) {
    cdkBuilder.progressiveDialerConfig(progressiveDialerConfig)
  }

  public fun build(): CfnCampaign.DialerConfigProperty = cdkBuilder.build()
}
