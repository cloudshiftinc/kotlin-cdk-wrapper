package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.List

public interface GitConfiguration {
  /**
   * The field where the repository event that will start the pipeline, such as pushing Git tags, is
   * specified with details.
   *
   * Git tags is the only supported event type.
   *
   * The length must be less than or equal to 3.
   *
   * Default: - no filter.
   */
  public fun pushFilter(): List<GitPushFilter> =
      unwrap(this).getPushFilter()?.map(GitPushFilter::wrap) ?: emptyList()

  /**
   * The pipeline source action where the trigger configuration, such as Git tags.
   *
   * The trigger configuration will start the pipeline upon the specified change only.
   * You can only specify one trigger configuration per source action.
   *
   * Since the provider for `sourceAction` must be `CodeStarSourceConnection`, you can use
   * `CodeStarConnectionsSourceAction` construct in `aws-codepipeline-actions` module.
   */
  public fun sourceAction(): IAction

  /**
   * A builder for [GitConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param pushFilter The field where the repository event that will start the pipeline, such as
     * pushing Git tags, is specified with details.
     * Git tags is the only supported event type.
     *
     * The length must be less than or equal to 3.
     */
    public fun pushFilter(pushFilter: List<GitPushFilter>)

    /**
     * @param pushFilter The field where the repository event that will start the pipeline, such as
     * pushing Git tags, is specified with details.
     * Git tags is the only supported event type.
     *
     * The length must be less than or equal to 3.
     */
    public fun pushFilter(vararg pushFilter: GitPushFilter)

    /**
     * @param sourceAction The pipeline source action where the trigger configuration, such as Git
     * tags. 
     * The trigger configuration will start the pipeline upon the specified change only.
     * You can only specify one trigger configuration per source action.
     *
     * Since the provider for `sourceAction` must be `CodeStarSourceConnection`, you can use
     * `CodeStarConnectionsSourceAction` construct in `aws-codepipeline-actions` module.
     */
    public fun sourceAction(sourceAction: IAction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.GitConfiguration.Builder =
        software.amazon.awscdk.services.codepipeline.GitConfiguration.builder()

    /**
     * @param pushFilter The field where the repository event that will start the pipeline, such as
     * pushing Git tags, is specified with details.
     * Git tags is the only supported event type.
     *
     * The length must be less than or equal to 3.
     */
    override fun pushFilter(pushFilter: List<GitPushFilter>) {
      cdkBuilder.pushFilter(pushFilter.map(GitPushFilter::unwrap))
    }

    /**
     * @param pushFilter The field where the repository event that will start the pipeline, such as
     * pushing Git tags, is specified with details.
     * Git tags is the only supported event type.
     *
     * The length must be less than or equal to 3.
     */
    override fun pushFilter(vararg pushFilter: GitPushFilter): Unit =
        pushFilter(pushFilter.toList())

    /**
     * @param sourceAction The pipeline source action where the trigger configuration, such as Git
     * tags. 
     * The trigger configuration will start the pipeline upon the specified change only.
     * You can only specify one trigger configuration per source action.
     *
     * Since the provider for `sourceAction` must be `CodeStarSourceConnection`, you can use
     * `CodeStarConnectionsSourceAction` construct in `aws-codepipeline-actions` module.
     */
    override fun sourceAction(sourceAction: IAction) {
      cdkBuilder.sourceAction(sourceAction.let(IAction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.GitConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.GitConfiguration,
  ) : GitConfiguration {
    /**
     * The field where the repository event that will start the pipeline, such as pushing Git tags,
     * is specified with details.
     *
     * Git tags is the only supported event type.
     *
     * The length must be less than or equal to 3.
     *
     * Default: - no filter.
     */
    override fun pushFilter(): List<GitPushFilter> =
        unwrap(this).getPushFilter()?.map(GitPushFilter::wrap) ?: emptyList()

    /**
     * The pipeline source action where the trigger configuration, such as Git tags.
     *
     * The trigger configuration will start the pipeline upon the specified change only.
     * You can only specify one trigger configuration per source action.
     *
     * Since the provider for `sourceAction` must be `CodeStarSourceConnection`, you can use
     * `CodeStarConnectionsSourceAction` construct in `aws-codepipeline-actions` module.
     */
    override fun sourceAction(): IAction = unwrap(this).getSourceAction().let(IAction::wrap)
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
