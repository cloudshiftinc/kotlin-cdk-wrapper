@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignQuietTimePropertyDsl {
  private val cdkBuilder: CfnCampaign.QuietTimeProperty.Builder =
      CfnCampaign.QuietTimeProperty.builder()

  public fun end(end: String) {
    cdkBuilder.end(end)
  }

  public fun start(start: String) {
    cdkBuilder.start(start)
  }

  public fun build(): CfnCampaign.QuietTimeProperty = cdkBuilder.build()
}
