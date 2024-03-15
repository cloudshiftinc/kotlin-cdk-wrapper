@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CodeStarSourceVariables {
  public fun authorDate(): String

  public fun branchName(): String

  public fun commitId(): String

  public fun commitMessage(): String

  public fun connectionArn(): String

  public fun fullRepositoryName(): String

  @CdkDslMarker
  public interface Builder {
    public fun authorDate(authorDate: String)

    public fun branchName(branchName: String)

    public fun commitId(commitId: String)

    public fun commitMessage(commitMessage: String)

    public fun connectionArn(connectionArn: String)

    public fun fullRepositoryName(fullRepositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeStarSourceVariables.builder()

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

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

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
    override fun authorDate(): String = unwrap(this).getAuthorDate()

    override fun branchName(): String = unwrap(this).getBranchName()

    override fun commitId(): String = unwrap(this).getCommitId()

    override fun commitMessage(): String = unwrap(this).getCommitMessage()

    override fun connectionArn(): String = unwrap(this).getConnectionArn()

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
