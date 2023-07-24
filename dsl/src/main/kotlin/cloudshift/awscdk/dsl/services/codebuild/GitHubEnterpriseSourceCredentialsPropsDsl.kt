@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps

/**
 * Creation properties for `GitHubEnterpriseSourceCredentials`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.codebuild.*;
 * SecretValue secretValue;
 * GitHubEnterpriseSourceCredentialsProps gitHubEnterpriseSourceCredentialsProps =
 * GitHubEnterpriseSourceCredentialsProps.builder()
 * .accessToken(secretValue)
 * .build();
 * ```
 */
@CdkDslMarker
public class GitHubEnterpriseSourceCredentialsPropsDsl {
    private val cdkBuilder: GitHubEnterpriseSourceCredentialsProps.Builder =
        GitHubEnterpriseSourceCredentialsProps.builder()

    /**
     * @param accessToken The personal access token to use when contacting the instance of the GitHub
     * Enterprise API.
     */
    public fun accessToken(accessToken: SecretValue) {
        cdkBuilder.accessToken(accessToken)
    }

    public fun build(): GitHubEnterpriseSourceCredentialsProps = cdkBuilder.build()
}
