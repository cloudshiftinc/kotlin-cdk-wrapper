package io.cloudshiftdev.awscdk.services.codepipeline

import kotlin.Unit
import kotlin.collections.List

public interface GitConfiguration {
  public fun pushFilter(): List<GitPushFilter> =
      unwrap(this).getPushFilter()?.map(GitPushFilter::wrap) ?: emptyList()

  public fun sourceAction(): IAction

  public interface Builder {
    public fun pushFilter(pushFilter: List<GitPushFilter>) {
    }

    public fun sourceAction(sourceAction: IAction) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.GitConfiguration.Builder =
        software.amazon.awscdk.services.codepipeline.GitConfiguration.builder()

    public override fun pushFilter(pushFilter: List<GitPushFilter>) {
      cdkBuilder.pushFilter(pushFilter.map(GitPushFilter::unwrap))
    }

    public override fun sourceAction(sourceAction: IAction) {
      cdkBuilder.sourceAction(sourceAction.let(IAction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.GitConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.GitConfiguration,
  ) : GitConfiguration {
    public override fun pushFilter(): List<GitPushFilter> =
        unwrap(this).getPushFilter()?.map(GitPushFilter::wrap) ?: emptyList()

    public override fun sourceAction(): IAction = unwrap(this).getSourceAction().let(IAction::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GitConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GitConfiguration):
        GitConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitConfiguration):
        software.amazon.awscdk.services.codepipeline.GitConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
