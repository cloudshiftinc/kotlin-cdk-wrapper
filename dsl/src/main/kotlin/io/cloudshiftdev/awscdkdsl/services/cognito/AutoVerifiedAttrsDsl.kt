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
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.AutoVerifiedAttrs

/**
 * Attributes that can be automatically verified for users in a user pool.
 *
 * Example:
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * // ...
 * .signInAliases(SignInAliases.builder().username(true).email(true).build())
 * .autoVerify(AutoVerifiedAttrs.builder().email(true).phone(true).build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AutoVerifiedAttrsDsl {
    private val cdkBuilder: AutoVerifiedAttrs.Builder = AutoVerifiedAttrs.builder()

    /**
     * @param email Whether the email address of the user should be auto verified at sign up. Note:
     *   If both `email` and `phone` is set, Cognito only verifies the phone number. To also verify
     *   email, see here -
     *   https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html
     */
    public fun email(email: Boolean) {
        cdkBuilder.email(email)
    }

    /** @param phone Whether the phone number of the user should be auto verified at sign up. */
    public fun phone(phone: Boolean) {
        cdkBuilder.phone(phone)
    }

    public fun build(): AutoVerifiedAttrs = cdkBuilder.build()
}
