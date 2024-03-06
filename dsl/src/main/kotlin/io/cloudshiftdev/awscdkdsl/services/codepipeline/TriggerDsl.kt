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
import software.amazon.awscdk.services.codepipeline.Trigger

/**
 * Trigger.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * Action action;
 * Trigger trigger = Trigger.Builder.create()
 * .providerType(ProviderType.CODE_STAR_SOURCE_CONNECTION)
 * // the properties below are optional
 * .gitConfiguration(GitConfiguration.builder()
 * .sourceAction(action)
 * // the properties below are optional
 * .pushFilter(List.of(GitPushFilter.builder()
 * .tagsExcludes(List.of("tagsExcludes"))
 * .tagsIncludes(List.of("tagsIncludes"))
 * .build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class TriggerDsl {
    private val cdkBuilder: Trigger.Builder = Trigger.Builder.create()

    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * Default: - no configuration.
     *
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     *   event that starts the pipeline, such as Git tags.
     */
    public fun gitConfiguration(gitConfiguration: GitConfigurationDsl.() -> Unit = {}) {
        val builder = GitConfigurationDsl()
        builder.apply(gitConfiguration)
        cdkBuilder.gitConfiguration(builder.build())
    }

    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * Default: - no configuration.
     *
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     *   event that starts the pipeline, such as Git tags.
     */
    public fun gitConfiguration(gitConfiguration: GitConfiguration) {
        cdkBuilder.gitConfiguration(gitConfiguration)
    }

    /**
     * The source provider for the event, such as connections configured for a repository with Git
     * tags, for the specified trigger configuration.
     *
     * @param providerType The source provider for the event, such as connections configured for a
     *   repository with Git tags, for the specified trigger configuration.
     */
    public fun providerType(providerType: ProviderType) {
        cdkBuilder.providerType(providerType)
    }

    public fun build(): Trigger = cdkBuilder.build()
}
