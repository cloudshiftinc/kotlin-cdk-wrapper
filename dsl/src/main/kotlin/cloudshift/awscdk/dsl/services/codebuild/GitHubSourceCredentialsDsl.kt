@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.constructs.Construct

/**
 * The source credentials used when contacting the GitHub API.
 *
 * **Note**: CodeBuild only allows a single credential for GitHub
 * to be saved in a given AWS account in a given region -
 * any attempt to add more than one will result in an error.
 *
 * Example:
 *
 * ```
 * GitHubSourceCredentials.Builder.create(this, "CodeBuildGitHubCreds")
 * .accessToken(SecretValue.secretsManager("my-token"))
 * .build();
 * ```
 */
@CdkDslMarker
public class GitHubSourceCredentialsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: GitHubSourceCredentials.Builder =
      GitHubSourceCredentials.Builder.create(scope, id)

  /**
   * The personal access token to use when contacting the GitHub API.
   *
   * @param accessToken The personal access token to use when contacting the GitHub API. 
   */
  public fun accessToken(accessToken: SecretValue) {
    cdkBuilder.accessToken(accessToken)
  }

  public fun build(): GitHubSourceCredentials = cdkBuilder.build()
}
