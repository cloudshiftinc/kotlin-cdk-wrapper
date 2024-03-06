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
import software.amazon.awscdk.services.codepipeline.GitConfiguration
import software.amazon.awscdk.services.codepipeline.ProviderType
import software.amazon.awscdk.services.codepipeline.TriggerProps

/**
 * Properties of trigger.
 *
 * Example:
 * ```
 * Pipeline pipeline;
 * CodeStarConnectionsSourceAction sourceAction;
 * pipeline.addTrigger(TriggerProps.builder()
 * .providerType(ProviderType.CODE_STAR_SOURCE_CONNECTION)
 * .gitConfiguration(GitConfiguration.builder()
 * .sourceAction(sourceAction)
 * .pushFilter(List.of(GitPushFilter.builder()
 * .tagsExcludes(List.of("exclude1", "exclude2"))
 * .tagsIncludes(List.of("include*"))
 * .build()))
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class TriggerPropsDsl {
    private val cdkBuilder: TriggerProps.Builder = TriggerProps.builder()

    /**
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     *   event that starts the pipeline, such as Git tags.
     */
    public fun gitConfiguration(gitConfiguration: GitConfigurationDsl.() -> Unit = {}) {
        val builder = GitConfigurationDsl()
        builder.apply(gitConfiguration)
        cdkBuilder.gitConfiguration(builder.build())
    }

    /**
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     *   event that starts the pipeline, such as Git tags.
     */
    public fun gitConfiguration(gitConfiguration: GitConfiguration) {
        cdkBuilder.gitConfiguration(gitConfiguration)
    }

    /**
     * @param providerType The source provider for the event, such as connections configured for a
     *   repository with Git tags, for the specified trigger configuration.
     */
    public fun providerType(providerType: ProviderType) {
        cdkBuilder.providerType(providerType)
    }

    public fun build(): TriggerProps = cdkBuilder.build()
}
