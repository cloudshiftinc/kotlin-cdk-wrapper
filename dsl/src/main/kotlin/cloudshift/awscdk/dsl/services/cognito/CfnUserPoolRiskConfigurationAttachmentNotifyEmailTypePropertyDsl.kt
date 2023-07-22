@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment

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
