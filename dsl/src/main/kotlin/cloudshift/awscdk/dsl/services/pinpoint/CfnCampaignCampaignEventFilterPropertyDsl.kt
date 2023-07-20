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

  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun dimensions(dimensions: CfnCampaign.EventDimensionsProperty) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun filterType(filterType: String) {
    cdkBuilder.filterType(filterType)
  }

  public fun build(): CfnCampaign.CampaignEventFilterProperty = cdkBuilder.build()
}
