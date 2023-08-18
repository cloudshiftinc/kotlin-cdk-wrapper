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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
import software.constructs.Construct

/**
 * The source credentials used when contacting the GitHub Enterprise API.
 *
 * **Note**: CodeBuild only allows a single credential for GitHub Enterprise to be saved in a given
 * AWS account in a given region - any attempt to add more than one will result in an error.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.codebuild.*;
 * SecretValue secretValue;
 * GitHubEnterpriseSourceCredentials gitHubEnterpriseSourceCredentials =
 * GitHubEnterpriseSourceCredentials.Builder.create(this, "MyGitHubEnterpriseSourceCredentials")
 * .accessToken(secretValue)
 * .build();
 * ```
 */
@CdkDslMarker
public class GitHubEnterpriseSourceCredentialsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: GitHubEnterpriseSourceCredentials.Builder =
        GitHubEnterpriseSourceCredentials.Builder.create(scope, id)

    /**
     * The personal access token to use when contacting the instance of the GitHub Enterprise API.
     *
     * @param accessToken The personal access token to use when contacting the instance of the
     *   GitHub Enterprise API.
     */
    public fun accessToken(accessToken: SecretValue) {
        cdkBuilder.accessToken(accessToken)
    }

    public fun build(): GitHubEnterpriseSourceCredentials = cdkBuilder.build()
}
