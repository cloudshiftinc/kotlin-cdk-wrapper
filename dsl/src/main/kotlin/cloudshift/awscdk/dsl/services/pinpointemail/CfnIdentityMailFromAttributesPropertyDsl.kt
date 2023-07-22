@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnIdentity

/**
 * A list of attributes that are associated with a MAIL FROM domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * MailFromAttributesProperty mailFromAttributesProperty = MailFromAttributesProperty.builder()
 * .behaviorOnMxFailure("behaviorOnMxFailure")
 * .mailFromDomain("mailFromDomain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html)
 */
@CdkDslMarker
public class CfnIdentityMailFromAttributesPropertyDsl {
  private val cdkBuilder: CfnIdentity.MailFromAttributesProperty.Builder =
      CfnIdentity.MailFromAttributesProperty.builder()

  /**
   * @param behaviorOnMxFailure The action that Amazon Pinpoint to takes if it can't read the
   * required MX record for a custom MAIL FROM domain.
   * When you set this value to `UseDefaultValue` , Amazon Pinpoint uses *amazonses.com* as the MAIL
   * FROM domain. When you set this value to `RejectMessage` , Amazon Pinpoint returns a
   * `MailFromDomainNotVerified` error, and doesn't attempt to deliver the email.
   *
   * These behaviors are taken when the custom MAIL FROM domain configuration is in the `Pending` ,
   * `Failed` , and `TemporaryFailure` states.
   */
  public fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
    cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
  }

  /**
   * @param mailFromDomain The name of a domain that an email identity uses as a custom MAIL FROM
   * domain.
   */
  public fun mailFromDomain(mailFromDomain: String) {
    cdkBuilder.mailFromDomain(mailFromDomain)
  }

  public fun build(): CfnIdentity.MailFromAttributesProperty = cdkBuilder.build()
}
