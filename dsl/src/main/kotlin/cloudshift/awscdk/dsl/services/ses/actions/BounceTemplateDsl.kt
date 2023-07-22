@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.actions.BounceTemplate

/**
 * A bounce template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.actions.*;
 * BounceTemplate bounceTemplate = BounceTemplate.MAILBOX_DOES_NOT_EXIST;
 * ```
 */
@CdkDslMarker
public class BounceTemplateDsl {
  private val cdkBuilder: BounceTemplate.Builder = BounceTemplate.Builder.create()

  /**
   * Human-readable text to include in the bounce message.
   *
   * @param message Human-readable text to include in the bounce message. 
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  /**
   * The SMTP reply code, as defined by RFC 5321.
   *
   * [Documentation](https://tools.ietf.org/html/rfc5321)
   * @param smtpReplyCode The SMTP reply code, as defined by RFC 5321. 
   */
  public fun smtpReplyCode(smtpReplyCode: String) {
    cdkBuilder.smtpReplyCode(smtpReplyCode)
  }

  /**
   * The SMTP enhanced status code, as defined by RFC 3463.
   *
   * [Documentation](https://tools.ietf.org/html/rfc3463)
   * @param statusCode The SMTP enhanced status code, as defined by RFC 3463. 
   */
  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): BounceTemplate = cdkBuilder.build()
}
