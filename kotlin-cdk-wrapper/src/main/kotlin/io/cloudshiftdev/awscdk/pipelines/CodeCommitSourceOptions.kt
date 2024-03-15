@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.actions.CodeCommitTrigger
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CodeCommitSourceOptions {
  public fun actionName(): String? = unwrap(this).getActionName()

  public fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  public fun trigger(): CodeCommitTrigger? = unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    public fun eventRole(eventRole: IRole)

    public fun trigger(trigger: CodeCommitTrigger)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeCommitSourceOptions.Builder =
        software.amazon.awscdk.pipelines.CodeCommitSourceOptions.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    override fun trigger(trigger: CodeCommitTrigger) {
      cdkBuilder.trigger(trigger.let(CodeCommitTrigger::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeCommitSourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodeCommitSourceOptions,
  ) : CdkObject(cdkObject), CodeCommitSourceOptions {
    override fun actionName(): String? = unwrap(this).getActionName()

    override fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    override fun trigger(): CodeCommitTrigger? =
        unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeCommitSourceOptions):
        CodeCommitSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceOptions):
        software.amazon.awscdk.pipelines.CodeCommitSourceOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.pipelines.CodeCommitSourceOptions
  }
}
