@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings

@CdkDslMarker
public class CfnApplicationSettingsCampaignHookPropertyDsl {
  private val cdkBuilder: CfnApplicationSettings.CampaignHookProperty.Builder =
      CfnApplicationSettings.CampaignHookProperty.builder()

  public fun lambdaFunctionName(lambdaFunctionName: String) {
    cdkBuilder.lambdaFunctionName(lambdaFunctionName)
  }

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun webUrl(webUrl: String) {
    cdkBuilder.webUrl(webUrl)
  }

  public fun build(): CfnApplicationSettings.CampaignHookProperty = cdkBuilder.build()
}
