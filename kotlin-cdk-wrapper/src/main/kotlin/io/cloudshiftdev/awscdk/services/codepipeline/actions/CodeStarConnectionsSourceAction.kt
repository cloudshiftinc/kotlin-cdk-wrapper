@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class CodeStarConnectionsSourceAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction,
) : Action(cdkObject) {
  public open fun variables(): CodeStarSourceVariables =
      unwrap(this).getVariables().let(CodeStarSourceVariables::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun branch(branch: String)

    public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean)

    public fun connectionArn(connectionArn: String)

    public fun output(output: Artifact)

    public fun owner(owner: String)

    public fun repo(repo: String)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun triggerOnPush(triggerOnPush: Boolean)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    override fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
      cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
    }

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun repo(repo: String) {
      cdkBuilder.repo(repo)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun triggerOnPush(triggerOnPush: Boolean) {
      cdkBuilder.triggerOnPush(triggerOnPush)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeStarConnectionsSourceAction {
      val builderImpl = BuilderImpl()
      return CodeStarConnectionsSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction):
        CodeStarConnectionsSourceAction = CodeStarConnectionsSourceAction(cdkObject)

    internal fun unwrap(wrapped: CodeStarConnectionsSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction =
        wrapped.cdkObject
  }
}
