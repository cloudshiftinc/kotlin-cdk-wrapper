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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnUser

/**
 * Contains information about the identity of a user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * UserIdentityInfoProperty userIdentityInfoProperty = UserIdentityInfoProperty.builder()
 * .email("email")
 * .firstName("firstName")
 * .lastName("lastName")
 * .mobile("mobile")
 * .secondaryEmail("secondaryEmail")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html)
 */
@CdkDslMarker
public class CfnUserUserIdentityInfoPropertyDsl {
    private val cdkBuilder: CfnUser.UserIdentityInfoProperty.Builder =
        CfnUser.UserIdentityInfoProperty.builder()

    /**
     * @param email The email address. If you are using SAML for identity management and include
     *   this parameter, an error is returned.
     */
    public fun email(email: String) {
        cdkBuilder.email(email)
    }

    /**
     * @param firstName The first name. This is required if you are using Amazon Connect or SAML for
     *   identity management.
     */
    public fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
    }

    /**
     * @param lastName The last name. This is required if you are using Amazon Connect or SAML for
     *   identity management.
     */
    public fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
    }

    /** @param mobile The user's mobile number. */
    public fun mobile(mobile: String) {
        cdkBuilder.mobile(mobile)
    }

    /**
     * @param secondaryEmail The user's secondary email address. If you provide a secondary email,
     *   the user receives email notifications -- other than password reset notifications -- to this
     *   email address instead of to their primary email address.
     *
     * *Pattern* : `(?=^.{0,265}$)[a-zA-Z0-9._%+-]+&#64;[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}`
     */
    public fun secondaryEmail(secondaryEmail: String) {
        cdkBuilder.secondaryEmail(secondaryEmail)
    }

    public fun build(): CfnUser.UserIdentityInfoProperty = cdkBuilder.build()
}
