@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * `GitHubLocation` is a property of the [CodeDeploy DeploymentGroup
 * Revision](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html)
 * property that specifies the location of an application revision that is stored in GitHub.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * GitHubLocationProperty gitHubLocationProperty = GitHubLocationProperty.builder()
 * .commitId("commitId")
 * .repository("repository")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-githublocation.html)
 */
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
