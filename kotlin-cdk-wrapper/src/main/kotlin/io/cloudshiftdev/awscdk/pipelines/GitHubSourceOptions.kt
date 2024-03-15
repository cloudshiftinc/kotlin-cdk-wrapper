@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.actions.GitHubTrigger
import kotlin.String
import kotlin.Unit

public interface GitHubSourceOptions {
  public fun actionName(): String? = unwrap(this).getActionName()

  public fun authentication(): SecretValue? =
      unwrap(this).getAuthentication()?.let(SecretValue::wrap)

  public fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun authentication(authentication: SecretValue)

    public fun trigger(trigger: GitHubTrigger)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.GitHubSourceOptions.Builder =
        software.amazon.awscdk.pipelines.GitHubSourceOptions.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun authentication(authentication: SecretValue) {
      cdkBuilder.authentication(authentication.let(SecretValue::unwrap))
    }

    override fun trigger(trigger: GitHubTrigger) {
      cdkBuilder.trigger(trigger.let(GitHubTrigger::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.GitHubSourceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.GitHubSourceOptions,
  ) : CdkObject(cdkObject), GitHubSourceOptions {
    override fun actionName(): String? = unwrap(this).getActionName()

    override fun authentication(): SecretValue? =
        unwrap(this).getAuthentication()?.let(SecretValue::wrap)

    override fun trigger(): GitHubTrigger? = unwrap(this).getTrigger()?.let(GitHubTrigger::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.GitHubSourceOptions):
        GitHubSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceOptions):
        software.amazon.awscdk.pipelines.GitHubSourceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.GitHubSourceOptions
  }
}
