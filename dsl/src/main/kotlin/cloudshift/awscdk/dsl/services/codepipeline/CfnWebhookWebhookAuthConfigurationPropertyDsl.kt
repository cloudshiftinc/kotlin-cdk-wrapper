@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnWebhook

@CdkDslMarker
public class CfnWebhookWebhookAuthConfigurationPropertyDsl {
  private val cdkBuilder: CfnWebhook.WebhookAuthConfigurationProperty.Builder =
      CfnWebhook.WebhookAuthConfigurationProperty.builder()

  /**
   * @param allowedIpRange The property used to configure acceptance of webhooks in an IP address
   * range.
   * For IP, only the `AllowedIPRange` property must be set. This property must be set to a valid
   * CIDR range.
   */
  public fun allowedIpRange(allowedIpRange: String) {
    cdkBuilder.allowedIpRange(allowedIpRange)
  }

  /**
   * @param secretToken The property used to configure GitHub authentication.
   * For GITHUB_HMAC, only the `SecretToken` property must be set.
   */
  public fun secretToken(secretToken: String) {
    cdkBuilder.secretToken(secretToken)
  }

  public fun build(): CfnWebhook.WebhookAuthConfigurationProperty = cdkBuilder.build()
}
