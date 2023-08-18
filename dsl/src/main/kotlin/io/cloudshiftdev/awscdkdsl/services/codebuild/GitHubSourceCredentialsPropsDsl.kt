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
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps

/**
 * Creation properties for `GitHubSourceCredentials`.
 *
 * Example:
 * ```
 * GitHubSourceCredentials.Builder.create(this, "CodeBuildGitHubCreds")
 * .accessToken(SecretValue.secretsManager("my-token"))
 * .build();
 * ```
 */
@CdkDslMarker
public class GitHubSourceCredentialsPropsDsl {
    private val cdkBuilder: GitHubSourceCredentialsProps.Builder =
        GitHubSourceCredentialsProps.builder()

    /** @param accessToken The personal access token to use when contacting the GitHub API. */
    public fun accessToken(accessToken: SecretValue) {
        cdkBuilder.accessToken(accessToken)
    }

    public fun build(): GitHubSourceCredentialsProps = cdkBuilder.build()
}
