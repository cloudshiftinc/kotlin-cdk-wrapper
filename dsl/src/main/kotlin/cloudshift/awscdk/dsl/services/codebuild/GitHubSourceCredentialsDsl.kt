@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.constructs.Construct

@CdkDslMarker
public class GitHubSourceCredentialsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: GitHubSourceCredentials.Builder =
      GitHubSourceCredentials.Builder.create(scope, id)

  public fun accessToken(accessToken: SecretValue) {
    cdkBuilder.accessToken(accessToken)
  }

  public fun build(): GitHubSourceCredentials = cdkBuilder.build()
}
