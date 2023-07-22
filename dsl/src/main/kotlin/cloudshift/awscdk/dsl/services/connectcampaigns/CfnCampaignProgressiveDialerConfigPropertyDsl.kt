@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

/**
 * Contains progressive dialer configuration for an outbound campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * ProgressiveDialerConfigProperty progressiveDialerConfigProperty =
 * ProgressiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-progressivedialerconfig.html)
 */
@CdkDslMarker
public class CfnCampaignProgressiveDialerConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.ProgressiveDialerConfigProperty.Builder =
      CfnCampaign.ProgressiveDialerConfigProperty.builder()

  /**
   * @param bandwidthAllocation Bandwidth allocation for the progressive dialer. 
   */
  public fun bandwidthAllocation(bandwidthAllocation: Number) {
    cdkBuilder.bandwidthAllocation(bandwidthAllocation)
  }

  public fun build(): CfnCampaign.ProgressiveDialerConfigProperty = cdkBuilder.build()
}
