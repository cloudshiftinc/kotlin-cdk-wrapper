@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.actions.BounceTemplateProps

/**
 * Construction properties for a BounceTemplate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.actions.*;
 * BounceTemplateProps bounceTemplateProps = BounceTemplateProps.builder()
 * .message("message")
 * .smtpReplyCode("smtpReplyCode")
 * // the properties below are optional
 * .statusCode("statusCode")
 * .build();
 * ```
 */
@CdkDslMarker
public class BounceTemplatePropsDsl {
  private val cdkBuilder: BounceTemplateProps.Builder = BounceTemplateProps.builder()

  /**
   * @param message Human-readable text to include in the bounce message. 
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
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

  public fun build(): BounceTemplateProps = cdkBuilder.build()
}
