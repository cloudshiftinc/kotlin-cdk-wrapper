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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.UserPoolSESOptions

/**
 * Configuration for Cognito sending emails via Amazon SES.
 *
 * Example:
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * .email(UserPoolEmail.withSES(UserPoolSESOptions.builder()
 * .fromEmail("noreply&#64;myawesomeapp.com")
 * .fromName("Awesome App")
 * .replyTo("support&#64;myawesomeapp.com")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class UserPoolSESOptionsDsl {
    private val cdkBuilder: UserPoolSESOptions.Builder = UserPoolSESOptions.builder()

    /**
     * @param configurationSetName The name of a configuration set in Amazon SES that should be
     *   applied to emails sent via Cognito.
     */
    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * @param fromEmail The verified Amazon SES email address that Cognito should use to send
     *   emails. The email address used must be a verified email address in Amazon SES and must be
     *   configured to allow Cognito to send emails.
     */
    public fun fromEmail(fromEmail: String) {
        cdkBuilder.fromEmail(fromEmail)
    }

    /**
     * @param fromName An optional name that should be used as the sender's name along with the
     *   email.
     */
    public fun fromName(fromName: String) {
        cdkBuilder.fromName(fromName)
    }

    /** @param replyTo The destination to which the receiver of the email should reply to. */
    public fun replyTo(replyTo: String) {
        cdkBuilder.replyTo(replyTo)
    }

    /**
     * @param sesRegion Required if the UserPool region is different than the SES region. If sending
     *   emails with a Amazon SES verified email address, and the region that SES is configured is
     *   different than the region in which the UserPool is deployed, you must specify that region
     *   here.
     */
    public fun sesRegion(sesRegion: String) {
        cdkBuilder.sesRegion(sesRegion)
    }

    /** @param sesVerifiedDomain SES Verified custom domain to be used to verify the identity. */
    public fun sesVerifiedDomain(sesVerifiedDomain: String) {
        cdkBuilder.sesVerifiedDomain(sesVerifiedDomain)
    }

    public fun build(): UserPoolSESOptions = cdkBuilder.build()
}
