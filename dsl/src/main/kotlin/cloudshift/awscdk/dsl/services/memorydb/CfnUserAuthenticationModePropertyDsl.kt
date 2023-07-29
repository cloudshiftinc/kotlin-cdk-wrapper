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

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.memorydb.CfnUser

/**
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

    /**
     * @param passwords Passwords used for this user account. You can create up to two passwords for
     *   each user.
     */
    public fun passwords(vararg passwords: String) {
        _passwords.addAll(listOf(*passwords))
    }

    /**
     * @param passwords Passwords used for this user account. You can create up to two passwords for
     *   each user.
     */
    public fun passwords(passwords: Collection<String>) {
        _passwords.addAll(passwords)
    }

    /** @param type Type of authentication strategy for this user. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnUser.AuthenticationModeProperty {
        if (_passwords.isNotEmpty()) cdkBuilder.passwords(_passwords)
        return cdkBuilder.build()
    }
}
