@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * The CodePipeline variables emitted by CodeStar source Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
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
public interface CodeStarSourceVariables {
  /**
   * The date the currently last commit on the tracked branch was authored, in ISO-8601 format.
   */
  public fun authorDate(): String

  /**
   * The name of the branch this action tracks.
   */
  public fun branchName(): String

  /**
   * The SHA1 hash of the currently last commit on the tracked branch.
   */
  public fun commitId(): String

  /**
   * The message of the currently last commit on the tracked branch.
   */
  public fun commitMessage(): String

  /**
   * The connection ARN this source uses.
   */
  public fun connectionArn(): String

  /**
   * The name of the repository this action points to.
   */
  public fun fullRepositoryName(): String

  /**
   * A builder for [CodeStarSourceVariables]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorDate The date the currently last commit on the tracked branch was authored, in
     * ISO-8601 format. 
     */
    public fun authorDate(authorDate: String)

    /**
     * @param branchName The name of the branch this action tracks. 
     */
    public fun branchName(branchName: String)

    /**
     * @param commitId The SHA1 hash of the currently last commit on the tracked branch. 
     */
    public fun commitId(commitId: String)

    /**
     * @param commitMessage The message of the currently last commit on the tracked branch. 
     */
    public fun commitMessage(commitMessage: String)

    /**
     * @param connectionArn The connection ARN this source uses. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param fullRepositoryName The name of the repository this action points to. 
     */
    public fun fullRepositoryName(fullRepositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables.builder()

    /**
     * @param authorDate The date the currently last commit on the tracked branch was authored, in
     * ISO-8601 format. 
     */
    override fun authorDate(authorDate: String) {
      cdkBuilder.authorDate(authorDate)
    }

    /**
     * @param branchName The name of the branch this action tracks. 
     */
    override fun branchName(branchName: String) {
      cdkBuilder.branchName(branchName)
    }

    /**
     * @param commitId The SHA1 hash of the currently last commit on the tracked branch. 
     */
    override fun commitId(commitId: String) {
      cdkBuilder.commitId(commitId)
    }

    /**
     * @param commitMessage The message of the currently last commit on the tracked branch. 
     */
    override fun commitMessage(commitMessage: String) {
      cdkBuilder.commitMessage(commitMessage)
    }

    /**
     * @param connectionArn The connection ARN this source uses. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param fullRepositoryName The name of the repository this action points to. 
     */
    override fun fullRepositoryName(fullRepositoryName: String) {
      cdkBuilder.fullRepositoryName(fullRepositoryName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables,
  ) : CdkObject(cdkObject), CodeStarSourceVariables {
    /**
     * The date the currently last commit on the tracked branch was authored, in ISO-8601 format.
     */
    override fun authorDate(): String = unwrap(this).getAuthorDate()

    /**
     * The name of the branch this action tracks.
     */
    override fun branchName(): String = unwrap(this).getBranchName()

    /**
     * The SHA1 hash of the currently last commit on the tracked branch.
     */
    override fun commitId(): String = unwrap(this).getCommitId()

    /**
     * The message of the currently last commit on the tracked branch.
     */
    override fun commitMessage(): String = unwrap(this).getCommitMessage()

    /**
     * The connection ARN this source uses.
     */
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    /**
     * The name of the repository this action points to.
     */
    override fun fullRepositoryName(): String = unwrap(this).getFullRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeStarSourceVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables):
        CodeStarSourceVariables = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeStarSourceVariables):
        software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables
  }
}
