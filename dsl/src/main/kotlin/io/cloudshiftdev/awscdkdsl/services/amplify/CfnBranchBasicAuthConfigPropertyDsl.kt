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

package io.cloudshiftdev.awscdkdsl.services.amplify

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnBranch

/**
 * Use the BasicAuthConfig property type to set password protection for a specific branch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * BasicAuthConfigProperty basicAuthConfigProperty = BasicAuthConfigProperty.builder()
 * .password("password")
 * .username("username")
 * // the properties below are optional
 * .enableBasicAuth(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html)
 */
@CdkDslMarker
public class CfnBranchBasicAuthConfigPropertyDsl {
    private val cdkBuilder: CfnBranch.BasicAuthConfigProperty.Builder =
        CfnBranch.BasicAuthConfigProperty.builder()

    /** @param enableBasicAuth Enables basic authorization for the branch. */
    public fun enableBasicAuth(enableBasicAuth: Boolean) {
        cdkBuilder.enableBasicAuth(enableBasicAuth)
    }

    /** @param enableBasicAuth Enables basic authorization for the branch. */
    public fun enableBasicAuth(enableBasicAuth: IResolvable) {
        cdkBuilder.enableBasicAuth(enableBasicAuth)
    }

    /**
     * @param password The password for basic authorization. *Length Constraints:* Minimum length
     *   of 1. Maximum length of 255.
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * @param username The user name for basic authorization. *Length Constraints:* Minimum length
     *   of 1. Maximum length of 255.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnBranch.BasicAuthConfigProperty = cdkBuilder.build()
}
