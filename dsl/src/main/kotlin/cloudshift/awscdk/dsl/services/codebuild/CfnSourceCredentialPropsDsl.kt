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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps

/**
 * Properties for defining a `CfnSourceCredential`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * CfnSourceCredentialProps cfnSourceCredentialProps = CfnSourceCredentialProps.builder()
 * .authType("authType")
 * .serverType("serverType")
 * .token("token")
 * // the properties below are optional
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html)
 */
@CdkDslMarker
public class CfnSourceCredentialPropsDsl {
    private val cdkBuilder: CfnSourceCredentialProps.Builder = CfnSourceCredentialProps.builder()

    /**
     * @param authType The type of authentication used by the credentials. Valid options are OAUTH,
     *   BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     */
    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    /**
     * @param serverType The type of source provider. The valid options are GITHUB,
     *   GITHUB_ENTERPRISE, or BITBUCKET.
     */
    public fun serverType(serverType: String) {
        cdkBuilder.serverType(serverType)
    }

    /**
     * @param token For GitHub or GitHub Enterprise, this is the personal access token. For
     *   Bitbucket, this is the app password.
     */
    public fun token(token: String) {
        cdkBuilder.token(token)
    }

    /**
     * @param username The Bitbucket username when the `authType` is BASIC_AUTH. This parameter is
     *   not valid for other types of source providers or connections.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnSourceCredentialProps = cdkBuilder.build()
}
