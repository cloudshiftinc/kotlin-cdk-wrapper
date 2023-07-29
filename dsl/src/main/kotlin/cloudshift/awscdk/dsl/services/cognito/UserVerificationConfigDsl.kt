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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.UserVerificationConfig
import software.amazon.awscdk.services.cognito.VerificationEmailStyle

/**
 * User pool configuration for user self sign up.
 *
 * Example:
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .selfSignUpEnabled(true)
 * .userVerification(UserVerificationConfig.builder()
 * .emailSubject("Verify your email for our awesome app!")
 * .emailBody("Thanks for signing up to our awesome app! Your verification code is {####}")
 * .emailStyle(VerificationEmailStyle.CODE)
 * .smsMessage("Thanks for signing up to our awesome app! Your verification code is {####}")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class UserVerificationConfigDsl {
    private val cdkBuilder: UserVerificationConfig.Builder = UserVerificationConfig.builder()

    /**
     * @param emailBody The email body template for the verification email sent to the user upon
     *   sign up. See
     *   https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     *   to learn more about message templates.
     */
    public fun emailBody(emailBody: String) {
        cdkBuilder.emailBody(emailBody)
    }

    /**
     * @param emailStyle Emails can be verified either using a code or a link. Learn more at
     *   https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-email-verification-message-customization.html
     */
    public fun emailStyle(emailStyle: VerificationEmailStyle) {
        cdkBuilder.emailStyle(emailStyle)
    }

    /**
     * @param emailSubject The email subject template for the verification email sent to the user
     *   upon sign up. See
     *   https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     *   to learn more about message templates.
     */
    public fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
    }

    /**
     * @param smsMessage The message template for the verification SMS sent to the user upon sign
     *   up. See
     *   https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     *   to learn more about message templates.
     */
    public fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): UserVerificationConfig = cdkBuilder.build()
}
