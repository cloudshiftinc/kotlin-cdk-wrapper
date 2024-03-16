@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Git configuration for trigger.
 *
 * Example:
 *
 * ```
 * CodeStarConnectionsSourceAction sourceAction;
 * CodeBuildAction buildAction;
 * Pipeline.Builder.create(this, "Pipeline")
 * .pipelineType(PipelineType.V2)
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * .build()))
 * .triggers(List.of(TriggerProps.builder()
 * .providerType(ProviderType.CODE_STAR_SOURCE_CONNECTION)
 * .gitConfiguration(GitConfiguration.builder()
 * .sourceAction(sourceAction)
 * .pushFilter(List.of(GitPushFilter.builder()
 * .tagsExcludes(List.of("exclude1", "exclude2"))
 * .tagsIncludes(List.of("include*"))
 * .build()))
 * .build())
 * .build()))
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.GitConfiguration,
  ) : CdkObject(cdkObject), GitConfiguration {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): GitConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GitConfiguration):
        GitConfiguration = CdkObjectWrappers.wrap(cdkObject) as GitConfiguration

    internal fun unwrap(wrapped: GitConfiguration):
        software.amazon.awscdk.services.codepipeline.GitConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.GitConfiguration
  }
}
