@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

/**
 * The notify email type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * NotifyEmailTypeProperty notifyEmailTypeProperty = NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html)
 */
@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentNotifyEmailTypePropertyDsl {
  private val cdkBuilder: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.Builder =
      CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.builder()

  /**
   * @param htmlBody The email HTML body.
   */
  public fun htmlBody(htmlBody: String) {
    cdkBuilder.htmlBody(htmlBody)
  }

  /**
   * @param subject The email subject. 
   */
  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  /**
   * @param textBody The email text body.
   */
  public fun textBody(textBody: String) {
    cdkBuilder.textBody(textBody)
  }

  public fun build(): CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty =
      cdkBuilder.build()
}
