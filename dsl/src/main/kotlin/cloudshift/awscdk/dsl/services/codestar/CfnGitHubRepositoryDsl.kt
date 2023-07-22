@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.constructs.Construct

@CdkDslMarker
public class CfnGitHubRepositoryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGitHubRepository.Builder = CfnGitHubRepository.Builder.create(scope,
      id)

  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
   * @param code Information about code to be committed to a repository after it is created in an
   * AWS CloudFormation stack. 
   */
  public fun code(code: IResolvable) {
    cdkBuilder.code(code)
  }

  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-code)
   * @param code Information about code to be committed to a repository after it is created in an
   * AWS CloudFormation stack. 
   */
  public fun code(code: CfnGitHubRepository.CodeProperty) {
    cdkBuilder.code(code)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-connectionarn)
   * @param connectionArn 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * Indicates whether to enable issues for the GitHub repository.
   *
   * You can use GitHub issues to track information and bugs for your repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
   * @param enableIssues Indicates whether to enable issues for the GitHub repository. 
   */
  public fun enableIssues(enableIssues: Boolean) {
    cdkBuilder.enableIssues(enableIssues)
  }

  /**
   * Indicates whether to enable issues for the GitHub repository.
   *
   * You can use GitHub issues to track information and bugs for your repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues)
   * @param enableIssues Indicates whether to enable issues for the GitHub repository. 
   */
  public fun enableIssues(enableIssues: IResolvable) {
    cdkBuilder.enableIssues(enableIssues)
  }

  /**
   * Indicates whether the GitHub repository is a private repository.
   *
   * If so, you choose who can see and commit to this repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
   * @param isPrivate Indicates whether the GitHub repository is a private repository. 
   */
  public fun isPrivate(isPrivate: Boolean) {
    cdkBuilder.isPrivate(isPrivate)
  }

  /**
   * Indicates whether the GitHub repository is a private repository.
   *
   * If so, you choose who can see and commit to this repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate)
   * @param isPrivate Indicates whether the GitHub repository is a private repository. 
   */
  public fun isPrivate(isPrivate: IResolvable) {
    cdkBuilder.isPrivate(isPrivate)
  }

  /**
   * The GitHub user's personal access token for the GitHub repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken)
   * @param repositoryAccessToken The GitHub user's personal access token for the GitHub repository.
   * 
   */
  public fun repositoryAccessToken(repositoryAccessToken: String) {
    cdkBuilder.repositoryAccessToken(repositoryAccessToken)
  }

  /**
   * A comment or description about the new repository.
   *
   * This description is displayed in GitHub after the repository is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription)
   * @param repositoryDescription A comment or description about the new repository. 
   */
  public fun repositoryDescription(repositoryDescription: String) {
    cdkBuilder.repositoryDescription(repositoryDescription)
  }

  /**
   * The name of the repository you want to create in GitHub with AWS CloudFormation stack creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname)
   * @param repositoryName The name of the repository you want to create in GitHub with AWS
   * CloudFormation stack creation. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  /**
   * The GitHub user name for the owner of the GitHub repository to be created.
   *
   * If this repository should be owned by a GitHub organization, provide its name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner)
   * @param repositoryOwner The GitHub user name for the owner of the GitHub repository to be
   * created. 
   */
  public fun repositoryOwner(repositoryOwner: String) {
    cdkBuilder.repositoryOwner(repositoryOwner)
  }

  public fun build(): CfnGitHubRepository = cdkBuilder.build()
}
