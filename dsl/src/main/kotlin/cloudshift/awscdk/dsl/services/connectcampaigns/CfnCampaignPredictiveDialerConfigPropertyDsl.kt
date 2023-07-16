@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign

@CdkDslMarker
public class CfnCampaignPredictiveDialerConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.PredictiveDialerConfigProperty.Builder =
      CfnCampaign.PredictiveDialerConfigProperty.builder()

  public fun bandwidthAllocation(bandwidthAllocation: Number) {
    cdkBuilder.bandwidthAllocation(bandwidthAllocation)
  }

  public fun build(): CfnCampaign.PredictiveDialerConfigProperty = cdkBuilder.build()
}
