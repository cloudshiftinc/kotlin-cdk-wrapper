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

package io.cloudshiftdev.awscdkdsl.services.memorydb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.memorydb.CfnUser

/**
 * Denotes the user's authentication properties, such as whether it requires a password to
 * authenticate.
 *
 * Used in output responses.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.memorydb.*;
 * AuthenticationModeProperty authenticationModeProperty = AuthenticationModeProperty.builder()
 * .passwords(List.of("passwords"))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-user-authenticationmode.html)
 */
@CdkDslMarker
public class CfnUserAuthenticationModePropertyDsl {
    private val cdkBuilder: CfnUser.AuthenticationModeProperty.Builder =
        CfnUser.AuthenticationModeProperty.builder()

    private val _passwords: MutableList<String> = mutableListOf()

    /** @param passwords The password(s) used for authentication. */
    public fun passwords(vararg passwords: String) {
        _passwords.addAll(listOf(*passwords))
    }

    /** @param passwords The password(s) used for authentication. */
    public fun passwords(passwords: Collection<String>) {
        _passwords.addAll(passwords)
    }

    /**
     * @param type Indicates whether the user requires a password to authenticate. All newly-created
     *   users require a password.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnUser.AuthenticationModeProperty {
        if (_passwords.isNotEmpty()) cdkBuilder.passwords(_passwords)
        return cdkBuilder.build()
    }
}
