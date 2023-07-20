@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnWebhook

@CdkDslMarker
public class CfnWebhookWebhookAuthConfigurationPropertyDsl {
  private val cdkBuilder: CfnWebhook.WebhookAuthConfigurationProperty.Builder =
      CfnWebhook.WebhookAuthConfigurationProperty.builder()

  public fun allowedIpRange(allowedIpRange: String) {
    cdkBuilder.allowedIpRange(allowedIpRange)
  }

  public fun secretToken(secretToken: String) {
    cdkBuilder.secretToken(secretToken)
  }

  public fun build(): CfnWebhook.WebhookAuthConfigurationProperty = cdkBuilder.build()
}
