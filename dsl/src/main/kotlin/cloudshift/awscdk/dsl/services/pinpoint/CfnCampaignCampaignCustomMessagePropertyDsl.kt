@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignCampaignCustomMessagePropertyDsl {
  private val cdkBuilder: CfnCampaign.CampaignCustomMessageProperty.Builder =
      CfnCampaign.CampaignCustomMessageProperty.builder()

  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  public fun build(): CfnCampaign.CampaignCustomMessageProperty = cdkBuilder.build()
}
