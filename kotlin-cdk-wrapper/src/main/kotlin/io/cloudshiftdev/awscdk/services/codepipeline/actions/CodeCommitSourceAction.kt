@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codecommit.IRepository
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class CodeCommitSourceAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction,
) : Action(cdkObject) {
  public open fun variables(): CodeCommitSourceVariables =
      unwrap(this).getVariables().let(CodeCommitSourceVariables::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun branch(branch: String)

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    public fun customEventRule(customEventRule: ICustomEventRule)

    public fun eventRole(eventRole: IRole)

    public fun output(output: Artifact)

    public fun repository(repository: IRepository)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun trigger(trigger: CodeCommitTrigger)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    override fun customEventRule(customEventRule: ICustomEventRule) {
      cdkBuilder.customEventRule(customEventRule.let(ICustomEventRule::unwrap))
    }

    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole::unwrap))
    }

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun repository(repository: IRepository) {
      cdkBuilder.repository(repository.let(IRepository::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun trigger(trigger: CodeCommitTrigger) {
      cdkBuilder.trigger(trigger.let(CodeCommitTrigger::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceAction {
      val builderImpl = BuilderImpl()
      return CodeCommitSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction):
        CodeCommitSourceAction = CodeCommitSourceAction(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction =
        wrapped.cdkObject
  }
}
