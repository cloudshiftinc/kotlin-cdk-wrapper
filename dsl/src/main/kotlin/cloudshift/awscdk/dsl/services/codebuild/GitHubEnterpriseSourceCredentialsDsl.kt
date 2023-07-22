@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
import software.constructs.Construct

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
   * @param accessToken The personal access token to use when contacting the instance of the GitHub
   * Enterprise API. 
   */
  public fun accessToken(accessToken: SecretValue) {
    cdkBuilder.accessToken(accessToken)
  }

  public fun build(): GitHubEnterpriseSourceCredentials = cdkBuilder.build()
}
