@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignInAppMessageBodyConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.InAppMessageBodyConfigProperty.Builder =
      CfnCampaign.InAppMessageBodyConfigProperty.builder()

  public fun alignment(alignment: String) {
    cdkBuilder.alignment(alignment)
  }

  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  public fun textColor(textColor: String) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnCampaign.InAppMessageBodyConfigProperty = cdkBuilder.build()
}
