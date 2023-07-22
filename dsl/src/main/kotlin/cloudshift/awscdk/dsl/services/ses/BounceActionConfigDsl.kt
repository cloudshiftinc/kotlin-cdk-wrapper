@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.BounceActionConfig

@CdkDslMarker
public class BounceActionConfigDsl {
  private val cdkBuilder: BounceActionConfig.Builder = BounceActionConfig.builder()

  /**
   * @param message Human-readable text to include in the bounce message. 
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  /**
   * @param sender The email address of the sender of the bounced email. 
   * This is the address that the bounce message is sent from.
   */
  public fun sender(sender: String) {
    cdkBuilder.sender(sender)
  }

  /**
   * @param smtpReplyCode The SMTP reply code, as defined by RFC 5321. 
   */
  public fun smtpReplyCode(smtpReplyCode: String) {
    cdkBuilder.smtpReplyCode(smtpReplyCode)
  }

  /**
   * @param statusCode The SMTP enhanced status code, as defined by RFC 3463.
   */
  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  /**
   * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
   * bounce action is taken.
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): BounceActionConfig = cdkBuilder.build()
}
