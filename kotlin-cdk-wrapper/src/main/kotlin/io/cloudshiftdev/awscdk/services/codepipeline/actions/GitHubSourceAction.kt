@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class GitHubSourceAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction,
) : Action(cdkObject) {
  public open fun variables(): GitHubSourceVariables =
      unwrap(this).getVariables().let(GitHubSourceVariables::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun branch(branch: String)

    public fun oauthToken(oauthToken: SecretValue)

    public fun output(output: Artifact)

    public fun owner(owner: String)

    public fun repo(repo: String)

    public fun runOrder(runOrder: Number)

    public fun trigger(trigger: GitHubTrigger)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    override fun oauthToken(oauthToken: SecretValue) {
      cdkBuilder.oauthToken(oauthToken.let(SecretValue::unwrap))
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

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun trigger(trigger: GitHubTrigger) {
      cdkBuilder.trigger(trigger.let(GitHubTrigger::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceAction {
      val builderImpl = BuilderImpl()
      return GitHubSourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction):
        GitHubSourceAction = GitHubSourceAction(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceAction):
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction = wrapped.cdkObject
  }
}
