@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignCampaignEmailMessagePropertyDsl {
  private val cdkBuilder: CfnCampaign.CampaignEmailMessageProperty.Builder =
      CfnCampaign.CampaignEmailMessageProperty.builder()

  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  public fun fromAddress(fromAddress: String) {
    cdkBuilder.fromAddress(fromAddress)
  }

  public fun htmlBody(htmlBody: String) {
    cdkBuilder.htmlBody(htmlBody)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnCampaign.CampaignEmailMessageProperty = cdkBuilder.build()
}
