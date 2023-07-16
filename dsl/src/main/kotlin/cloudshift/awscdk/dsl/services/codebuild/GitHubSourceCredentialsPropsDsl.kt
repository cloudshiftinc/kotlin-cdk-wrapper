@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps

@CdkDslMarker
public class GitHubSourceCredentialsPropsDsl {
  private val cdkBuilder: GitHubSourceCredentialsProps.Builder =
      GitHubSourceCredentialsProps.builder()

  public fun accessToken(accessToken: SecretValue) {
    cdkBuilder.accessToken(accessToken)
  }

  public fun build(): GitHubSourceCredentialsProps = cdkBuilder.build()
}
