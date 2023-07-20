@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolVerificationMessageTemplatePropertyDsl {
  private val cdkBuilder: CfnUserPool.VerificationMessageTemplateProperty.Builder =
      CfnUserPool.VerificationMessageTemplateProperty.builder()

  public fun defaultEmailOption(defaultEmailOption: String) {
    cdkBuilder.defaultEmailOption(defaultEmailOption)
  }

  public fun emailMessage(emailMessage: String) {
    cdkBuilder.emailMessage(emailMessage)
  }

  public fun emailMessageByLink(emailMessageByLink: String) {
    cdkBuilder.emailMessageByLink(emailMessageByLink)
  }

  public fun emailSubject(emailSubject: String) {
    cdkBuilder.emailSubject(emailSubject)
  }

  public fun emailSubjectByLink(emailSubjectByLink: String) {
    cdkBuilder.emailSubjectByLink(emailSubjectByLink)
  }

  public fun smsMessage(smsMessage: String) {
    cdkBuilder.smsMessage(smsMessage)
  }

  public fun build(): CfnUserPool.VerificationMessageTemplateProperty = cdkBuilder.build()
}
