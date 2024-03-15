@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codecommit.IRepository
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CodeCommitSourceActionProps : CommonAwsActionProps {
  public fun branch(): String? = unwrap(this).getBranch()

  public fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

  public fun customEventRule(): ICustomEventRule? =
      unwrap(this).getCustomEventRule()?.let(ICustomEventRule::wrap)

  public fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

  public fun output(): Artifact

  public fun repository(): IRepository

  public fun trigger(): CodeCommitTrigger? = unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)

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
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps,
  ) : CdkObject(cdkObject), CodeCommitSourceActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun branch(): String? = unwrap(this).getBranch()

    override fun codeBuildCloneOutput(): Boolean? = unwrap(this).getCodeBuildCloneOutput()

    override fun customEventRule(): ICustomEventRule? =
        unwrap(this).getCustomEventRule()?.let(ICustomEventRule::wrap)

    override fun eventRole(): IRole? = unwrap(this).getEventRole()?.let(IRole::wrap)

    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    override fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun trigger(): CodeCommitTrigger? =
        unwrap(this).getTrigger()?.let(CodeCommitTrigger::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeCommitSourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps):
        CodeCommitSourceActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeCommitSourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps
  }
}
