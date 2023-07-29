@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnEmailIdentity

/**
 * Used to enable or disable the custom Mail-From domain configuration for an email identity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * MailFromAttributesProperty mailFromAttributesProperty = MailFromAttributesProperty.builder()
 * .behaviorOnMxFailure("behaviorOnMxFailure")
 * .mailFromDomain("mailFromDomain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-mailfromattributes.html)
 */
@CdkDslMarker
public class CfnEmailIdentityMailFromAttributesPropertyDsl {
    private val cdkBuilder: CfnEmailIdentity.MailFromAttributesProperty.Builder =
        CfnEmailIdentity.MailFromAttributesProperty.builder()

    /**
     * @param behaviorOnMxFailure The action to take if the required MX record isn't found when you
     *   send an email. When you set this value to `USE_DEFAULT_VALUE` , the mail is sent using
     *   *amazonses.com* as the MAIL FROM domain. When you set this value to `REJECT_MESSAGE` , the
     *   Amazon SES API v2 returns a `MailFromDomainNotVerified` error, and doesn't attempt to
     *   deliver the email.
     *
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the `Pending`
     * , `Failed` , and `TemporaryFailure` states.
     *
     * Valid Values: `USE_DEFAULT_VALUE | REJECT_MESSAGE`
     */
    public fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
        cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
    }

    /**
     * @param mailFromDomain The custom MAIL FROM domain that you want the verified identity to use.
     *   The MAIL FROM domain must meet the following criteria:
     * * It has to be a subdomain of the verified identity.
     * * It can't be used to receive email.
     * * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback
     *   forwarding emails.
     */
    public fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
    }

    public fun build(): CfnEmailIdentity.MailFromAttributesProperty = cdkBuilder.build()
}
