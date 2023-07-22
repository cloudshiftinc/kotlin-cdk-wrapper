@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables

/**
 * The CodePipeline variables emitted by CodeStar source Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.actions.*;
 * CodeStarSourceVariables codeStarSourceVariables = CodeStarSourceVariables.builder()
 * .authorDate("authorDate")
 * .branchName("branchName")
 * .commitId("commitId")
 * .commitMessage("commitMessage")
 * .connectionArn("connectionArn")
 * .fullRepositoryName("fullRepositoryName")
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeStarSourceVariablesDsl {
  private val cdkBuilder: CodeStarSourceVariables.Builder = CodeStarSourceVariables.builder()

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
   * @param connectionArn The connection ARN this source uses. 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * @param fullRepositoryName The name of the repository this action points to. 
   */
  public fun fullRepositoryName(fullRepositoryName: String) {
    cdkBuilder.fullRepositoryName(fullRepositoryName)
  }

  public fun build(): CodeStarSourceVariables = cdkBuilder.build()
}
