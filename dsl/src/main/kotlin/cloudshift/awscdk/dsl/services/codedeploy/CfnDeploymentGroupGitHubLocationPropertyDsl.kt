@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupGitHubLocationPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.GitHubLocationProperty.Builder =
      CfnDeploymentGroup.GitHubLocationProperty.builder()

  /**
   * @param commitId The SHA1 commit ID of the GitHub commit that represents the bundled artifacts
   * for the application revision. 
   */
  public fun commitId(commitId: String) {
    cdkBuilder.commitId(commitId)
  }

  /**
   * @param repository The GitHub account and repository pair that stores a reference to the commit
   * that represents the bundled artifacts for the application revision. 
   * Specify the value as `account/repository` .
   */
  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  public fun build(): CfnDeploymentGroup.GitHubLocationProperty = cdkBuilder.build()
}
