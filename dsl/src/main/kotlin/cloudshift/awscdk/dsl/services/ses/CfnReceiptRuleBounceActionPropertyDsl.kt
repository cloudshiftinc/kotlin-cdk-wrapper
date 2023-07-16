@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

@CdkDslMarker
public class CfnReceiptRuleBounceActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.BounceActionProperty.Builder =
      CfnReceiptRule.BounceActionProperty.builder()

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun sender(sender: String) {
    cdkBuilder.sender(sender)
  }

  public fun smtpReplyCode(smtpReplyCode: String) {
    cdkBuilder.smtpReplyCode(smtpReplyCode)
  }

  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnReceiptRule.BounceActionProperty = cdkBuilder.build()
}
