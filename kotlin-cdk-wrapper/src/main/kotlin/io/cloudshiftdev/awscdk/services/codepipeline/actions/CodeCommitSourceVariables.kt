@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CodeCommitSourceVariables {
  public fun authorDate(): String

  public fun branchName(): String

  public fun commitId(): String

  public fun commitMessage(): String

  public fun committerDate(): String

  public fun repositoryName(): String

  @CdkDslMarker
  public interface Builder {
    public fun authorDate(authorDate: String)

    public fun branchName(branchName: String)

    public fun commitId(commitId: String)

    public fun commitMessage(commitMessage: String)

    public fun committerDate(committerDate: String)

    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables.builder()

    override fun authorDate(authorDate: String) {
      cdkBuilder.authorDate(authorDate)
    }

    override fun branchName(branchName: String) {
      cdkBuilder.branchName(branchName)
    }

    override fun commitId(commitId: String) {
      cdkBuilder.commitId(commitId)
    }

    override fun commitMessage(commitMessage: String) {
      cdkBuilder.commitMessage(commitMessage)
    }

    override fun committerDate(committerDate: String) {
      cdkBuilder.committerDate(committerDate)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables,
  ) : CdkObject(cdkObject), CodeCommitSourceVariables {
    override fun authorDate(): String = unwrap(this).getAuthorDate()

    override fun branchName(): String = unwrap(this).getBranchName()

    override fun commitId(): String = unwrap(this).getCommitId()

    override fun commitMessage(): String = unwrap(this).getCommitMessage()

    override fun committerDate(): String = unwrap(this).getCommitterDate()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceVariables {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables):
        CodeCommitSourceVariables = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceVariables):
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables
  }
}
