@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnWebhook

/**
 * The authentication applied to incoming webhook trigger requests.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * WebhookAuthConfigurationProperty webhookAuthConfigurationProperty =
 * WebhookAuthConfigurationProperty.builder()
 * .allowedIpRange("allowedIpRange")
 * .secretToken("secretToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html)
 */
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
