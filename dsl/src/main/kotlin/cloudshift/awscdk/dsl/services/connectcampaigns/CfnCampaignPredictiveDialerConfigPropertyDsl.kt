@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

/**
 * Contains predictive dialer configuration for an outbound campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * PredictiveDialerConfigProperty predictiveDialerConfigProperty =
 * PredictiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-predictivedialerconfig.html)
 */
@CdkDslMarker
public class CfnCampaignPredictiveDialerConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.PredictiveDialerConfigProperty.Builder =
      CfnCampaign.PredictiveDialerConfigProperty.builder()

  /**
   * @param bandwidthAllocation Bandwidth allocation for the predictive dialer. 
   */
  public fun bandwidthAllocation(bandwidthAllocation: Number) {
    cdkBuilder.bandwidthAllocation(bandwidthAllocation)
  }

  public fun build(): CfnCampaign.PredictiveDialerConfigProperty = cdkBuilder.build()
}
