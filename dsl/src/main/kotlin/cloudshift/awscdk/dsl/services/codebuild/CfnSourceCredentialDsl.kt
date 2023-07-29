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
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.constructs.Construct

/**
 * Information about the credentials for a GitHub, GitHub Enterprise, or Bitbucket repository.
 *
 * We strongly recommend that you use AWS Secrets Manager to store your credentials. If you use
 * Secrets Manager , you must have secrets in your secrets manager. For more information, see
 * [Using Dynamic References to Specify Template Values](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
 * .
 *
 * For security purposes, do not use plain text in your AWS CloudFormation template to store your
 * credentials.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * CfnSourceCredential cfnSourceCredential = CfnSourceCredential.Builder.create(this,
 * "MyCfnSourceCredential")
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
public class CfnSourceCredentialDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSourceCredential.Builder =
        CfnSourceCredential.Builder.create(scope, id)

    /**
     * The type of authentication used by the credentials.
     *
     * Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-authtype)
     *
     * @param authType The type of authentication used by the credentials.
     */
    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    /**
     * The type of source provider.
     *
     * The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-servertype)
     *
     * @param serverType The type of source provider.
     */
    public fun serverType(serverType: String) {
        cdkBuilder.serverType(serverType)
    }

    /**
     * For GitHub or GitHub Enterprise, this is the personal access token.
     *
     * For Bitbucket, this is the app password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-token)
     *
     * @param token For GitHub or GitHub Enterprise, this is the personal access token.
     */
    public fun token(token: String) {
        cdkBuilder.token(token)
    }

    /**
     * The Bitbucket username when the `authType` is BASIC_AUTH.
     *
     * This parameter is not valid for other types of source providers or connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html#cfn-codebuild-sourcecredential-username)
     *
     * @param username The Bitbucket username when the `authType` is BASIC_AUTH.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnSourceCredential = cdkBuilder.build()
}
