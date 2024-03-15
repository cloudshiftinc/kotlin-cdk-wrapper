@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonActionProps
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface GitHubSourceActionProps : CommonActionProps {
  public fun branch(): String? = unwrap(this).getBranch()

  public fun oauthToken(): SecretValue

  public fun output(): Artifact

  public fun owner(): String

  public fun repo(): String

  public fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)

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
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps,
  ) : CdkObject(cdkObject), GitHubSourceActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun branch(): String? = unwrap(this).getBranch()

    override fun oauthToken(): SecretValue = unwrap(this).getOauthToken().let(SecretValue::wrap)

    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

    override fun owner(): String = unwrap(this).getOwner()

    override fun repo(): String = unwrap(this).getRepo()

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps):
        GitHubSourceActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.GitHubSourceActionProps
  }
}
