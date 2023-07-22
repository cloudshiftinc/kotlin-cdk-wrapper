@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignCampaignEventFilterPropertyDsl {
  private val cdkBuilder: CfnCampaign.CampaignEventFilterProperty.Builder =
      CfnCampaign.CampaignEventFilterProperty.builder()

  /**
   * @param dimensions The dimension settings of the event filter for the campaign.
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param dimensions The dimension settings of the event filter for the campaign.
   */
  public fun dimensions(dimensions: CfnCampaign.EventDimensionsProperty) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param filterType The type of event that causes the campaign to be sent.
   * Valid values are: `SYSTEM` , sends the campaign when a system event occurs; and, `ENDPOINT` ,
   * sends the campaign when an endpoint event (Events resource) occurs.
   */
  public fun filterType(filterType: String) {
    cdkBuilder.filterType(filterType)
  }

  public fun build(): CfnCampaign.CampaignEventFilterProperty = cdkBuilder.build()
}
