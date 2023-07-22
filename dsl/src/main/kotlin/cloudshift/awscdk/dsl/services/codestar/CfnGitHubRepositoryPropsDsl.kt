@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps

@CdkDslMarker
public class CfnGitHubRepositoryPropsDsl {
  private val cdkBuilder: CfnGitHubRepositoryProps.Builder = CfnGitHubRepositoryProps.builder()

  /**
   * @param code Information about code to be committed to a repository after it is created in an
   * AWS CloudFormation stack.
   */
  public fun code(code: IResolvable) {
    cdkBuilder.code(code)
  }

  /**
   * @param code Information about code to be committed to a repository after it is created in an
   * AWS CloudFormation stack.
   */
  public fun code(code: CfnGitHubRepository.CodeProperty) {
    cdkBuilder.code(code)
  }

  /**
   * @param connectionArn the value to be set.
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * @param enableIssues Indicates whether to enable issues for the GitHub repository.
   * You can use GitHub issues to track information and bugs for your repository.
   */
  public fun enableIssues(enableIssues: Boolean) {
    cdkBuilder.enableIssues(enableIssues)
  }

  /**
   * @param enableIssues Indicates whether to enable issues for the GitHub repository.
   * You can use GitHub issues to track information and bugs for your repository.
   */
  public fun enableIssues(enableIssues: IResolvable) {
    cdkBuilder.enableIssues(enableIssues)
  }

  /**
   * @param isPrivate Indicates whether the GitHub repository is a private repository.
   * If so, you choose who can see and commit to this repository.
   */
  public fun isPrivate(isPrivate: Boolean) {
    cdkBuilder.isPrivate(isPrivate)
  }

  /**
   * @param isPrivate Indicates whether the GitHub repository is a private repository.
   * If so, you choose who can see and commit to this repository.
   */
  public fun isPrivate(isPrivate: IResolvable) {
    cdkBuilder.isPrivate(isPrivate)
  }

  /**
   * @param repositoryAccessToken The GitHub user's personal access token for the GitHub repository.
   */
  public fun repositoryAccessToken(repositoryAccessToken: String) {
    cdkBuilder.repositoryAccessToken(repositoryAccessToken)
  }

  /**
   * @param repositoryDescription A comment or description about the new repository.
   * This description is displayed in GitHub after the repository is created.
   */
  public fun repositoryDescription(repositoryDescription: String) {
    cdkBuilder.repositoryDescription(repositoryDescription)
  }

  /**
   * @param repositoryName The name of the repository you want to create in GitHub with AWS
   * CloudFormation stack creation. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  /**
   * @param repositoryOwner The GitHub user name for the owner of the GitHub repository to be
   * created. 
   * If this repository should be owned by a GitHub organization, provide its name.
   */
  public fun repositoryOwner(repositoryOwner: String) {
    cdkBuilder.repositoryOwner(repositoryOwner)
  }

  public fun build(): CfnGitHubRepositoryProps = cdkBuilder.build()
}
