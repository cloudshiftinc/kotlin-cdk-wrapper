@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The CodePipeline variables emitted by the CodeCommit source Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * CodeCommitSourceVariables codeCommitSourceVariables = CodeCommitSourceVariables.builder()
 * .authorDate("authorDate")
 * .branchName("branchName")
 * .commitId("commitId")
 * .commitMessage("commitMessage")
 * .committerDate("committerDate")
 * .repositoryName("repositoryName")
 * .build();
 * ```
 */
public interface CodeCommitSourceVariables {
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
   * The date the currently last commit on the tracked branch was committed, in ISO-8601 format.
   */
  public fun committerDate(): String

  /**
   * The name of the repository this action points to.
   */
  public fun repositoryName(): String

  /**
   * A builder for [CodeCommitSourceVariables]
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
     * @param committerDate The date the currently last commit on the tracked branch was committed,
     * in ISO-8601 format. 
     */
    public fun committerDate(committerDate: String)

    /**
     * @param repositoryName The name of the repository this action points to. 
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables.builder()

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
     * @param committerDate The date the currently last commit on the tracked branch was committed,
     * in ISO-8601 format. 
     */
    override fun committerDate(committerDate: String) {
      cdkBuilder.committerDate(committerDate)
    }

    /**
     * @param repositoryName The name of the repository this action points to. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables,
  ) : CdkObject(cdkObject),
      CodeCommitSourceVariables {
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
     * The date the currently last commit on the tracked branch was committed, in ISO-8601 format.
     */
    override fun committerDate(): String = unwrap(this).getCommitterDate()

    /**
     * The name of the repository this action points to.
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables):
        CodeCommitSourceVariables = CdkObjectWrappers.wrap(cdkObject) as? CodeCommitSourceVariables
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceVariables):
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables
  }
}
