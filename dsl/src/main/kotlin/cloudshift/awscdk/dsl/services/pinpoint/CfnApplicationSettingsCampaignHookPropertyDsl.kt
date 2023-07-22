@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings

@CdkDslMarker
public class CfnApplicationSettingsCampaignHookPropertyDsl {
  private val cdkBuilder: CfnApplicationSettings.CampaignHookProperty.Builder =
      CfnApplicationSettings.CampaignHookProperty.builder()

  /**
   * @param lambdaFunctionName The name or Amazon Resource Name (ARN) of the Lambda function that
   * Amazon Pinpoint invokes to send messages for campaigns in the application.
   */
  public fun lambdaFunctionName(lambdaFunctionName: String) {
    cdkBuilder.lambdaFunctionName(lambdaFunctionName)
  }

  /**
   * @param mode The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible values
   * are:.
   * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
   * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
   * custom channel. This functionality is not supported anymore. To send a campaign through a custom
   * channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of the
   * campaign.
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param webUrl The web URL that Amazon Pinpoint calls to invoke the Lambda function over HTTPS.
   */
  public fun webUrl(webUrl: String) {
    cdkBuilder.webUrl(webUrl)
  }

  public fun build(): CfnApplicationSettings.CampaignHookProperty = cdkBuilder.build()
}
