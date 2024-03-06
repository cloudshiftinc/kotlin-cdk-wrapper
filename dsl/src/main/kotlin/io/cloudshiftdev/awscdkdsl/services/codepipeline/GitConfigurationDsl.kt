@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.GitConfiguration
import software.amazon.awscdk.services.codepipeline.GitPushFilter
import software.amazon.awscdk.services.codepipeline.IAction

/**
 * Git configuration for trigger.
 *
 * Example:
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
@CdkDslMarker
public class GitConfigurationDsl {
    private val cdkBuilder: GitConfiguration.Builder = GitConfiguration.builder()

    private val _pushFilter: MutableList<GitPushFilter> = mutableListOf()

    /**
     * @param pushFilter The field where the repository event that will start the pipeline, such as
     *   pushing Git tags, is specified with details. Git tags is the only supported event type.
     *
     * The length must be less than or equal to 3.
     */
    public fun pushFilter(pushFilter: GitPushFilterDsl.() -> Unit) {
        _pushFilter.add(GitPushFilterDsl().apply(pushFilter).build())
    }

    /**
     * @param pushFilter The field where the repository event that will start the pipeline, such as
     *   pushing Git tags, is specified with details. Git tags is the only supported event type.
     *
     * The length must be less than or equal to 3.
     */
    public fun pushFilter(pushFilter: Collection<GitPushFilter>) {
        _pushFilter.addAll(pushFilter)
    }

    /**
     * @param sourceAction The pipeline source action where the trigger configuration, such as Git
     *   tags. The trigger configuration will start the pipeline upon the specified change only. You
     *   can only specify one trigger configuration per source action.
     *
     * Since the provider for `sourceAction` must be `CodeStarSourceConnection`, you can use
     * `CodeStarConnectionsSourceAction` construct in `aws-codepipeline-actions` module.
     */
    public fun sourceAction(sourceAction: IAction) {
        cdkBuilder.sourceAction(sourceAction)
    }

    public fun build(): GitConfiguration {
        if (_pushFilter.isNotEmpty()) cdkBuilder.pushFilter(_pushFilter)
        return cdkBuilder.build()
    }
}
