@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

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
