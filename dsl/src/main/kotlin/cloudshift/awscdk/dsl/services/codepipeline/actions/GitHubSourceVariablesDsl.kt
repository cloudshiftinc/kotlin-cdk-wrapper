@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables

@CdkDslMarker
public class GitHubSourceVariablesDsl {
  private val cdkBuilder: GitHubSourceVariables.Builder = GitHubSourceVariables.builder()

  /**
   * @param authorDate The date the currently last commit on the tracked branch was authored, in
   * ISO-8601 format. 
   */
  public fun authorDate(authorDate: String) {
    cdkBuilder.authorDate(authorDate)
  }

  /**
   * @param branchName The name of the branch this action tracks. 
   */
  public fun branchName(branchName: String) {
    cdkBuilder.branchName(branchName)
  }

  /**
   * @param commitId The SHA1 hash of the currently last commit on the tracked branch. 
   */
  public fun commitId(commitId: String) {
    cdkBuilder.commitId(commitId)
  }

  /**
   * @param commitMessage The message of the currently last commit on the tracked branch. 
   */
  public fun commitMessage(commitMessage: String) {
    cdkBuilder.commitMessage(commitMessage)
  }

  /**
   * @param commitUrl The GitHub API URL of the currently last commit on the tracked branch. 
   */
  public fun commitUrl(commitUrl: String) {
    cdkBuilder.commitUrl(commitUrl)
  }

  /**
   * @param committerDate The date the currently last commit on the tracked branch was committed, in
   * ISO-8601 format. 
   */
  public fun committerDate(committerDate: String) {
    cdkBuilder.committerDate(committerDate)
  }

  /**
   * @param repositoryName The name of the repository this action points to. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): GitHubSourceVariables = cdkBuilder.build()
}
