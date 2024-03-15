@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface GitConfiguration {
  public fun pushFilter(): List<GitPushFilter> =
      unwrap(this).getPushFilter()?.map(GitPushFilter::wrap) ?: emptyList()

  public fun sourceAction(): IAction

  @CdkDslMarker
  public interface Builder {
    public fun pushFilter(pushFilter: List<GitPushFilter>)

    public fun pushFilter(vararg pushFilter: GitPushFilter)

    public fun sourceAction(sourceAction: IAction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.GitConfiguration.Builder =
        software.amazon.awscdk.services.codepipeline.GitConfiguration.builder()

    override fun pushFilter(pushFilter: List<GitPushFilter>) {
      cdkBuilder.pushFilter(pushFilter.map(GitPushFilter::unwrap))
    }

    override fun pushFilter(vararg pushFilter: GitPushFilter): Unit =
        pushFilter(pushFilter.toList())

    override fun sourceAction(sourceAction: IAction) {
      cdkBuilder.sourceAction(sourceAction.let(IAction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.GitConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.GitConfiguration,
  ) : CdkObject(cdkObject), GitConfiguration {
    override fun pushFilter(): List<GitPushFilter> =
        unwrap(this).getPushFilter()?.map(GitPushFilter::wrap) ?: emptyList()

    override fun sourceAction(): IAction = unwrap(this).getSourceAction().let(IAction::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GitConfiguration):
        GitConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitConfiguration):
        software.amazon.awscdk.services.codepipeline.GitConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.GitConfiguration
  }
}
