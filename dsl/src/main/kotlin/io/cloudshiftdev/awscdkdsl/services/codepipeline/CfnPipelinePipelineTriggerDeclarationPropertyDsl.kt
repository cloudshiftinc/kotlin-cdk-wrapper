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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * Represents information about the specified trigger configuration, such as the filter criteria and
 * the source stage for the action that contains the trigger.
 *
 * This is only supported for the `CodeStarSourceConnection` action type. &gt; When a trigger
 * configuration is specified, default change detection for repository and branch commits is
 * disabled.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * PipelineTriggerDeclarationProperty pipelineTriggerDeclarationProperty =
 * PipelineTriggerDeclarationProperty.builder()
 * .providerType("providerType")
 * // the properties below are optional
 * .gitConfiguration(GitConfigurationProperty.builder()
 * .sourceActionName("sourceActionName")
 * // the properties below are optional
 * .pullRequest(List.of(GitPullRequestFilterProperty.builder()
 * .branches(GitBranchFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .events(List.of("events"))
 * .filePaths(GitFilePathFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .build()))
 * .push(List.of(GitPushFilterProperty.builder()
 * .branches(GitBranchFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .filePaths(GitFilePathFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .tags(GitTagFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-pipelinetriggerdeclaration.html)
 */
@CdkDslMarker
public class CfnPipelinePipelineTriggerDeclarationPropertyDsl {
    private val cdkBuilder: CfnPipeline.PipelineTriggerDeclarationProperty.Builder =
        CfnPipeline.PipelineTriggerDeclarationProperty.builder()

    /**
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     *   event that starts the pipeline, such as Git tags.
     */
    public fun gitConfiguration(gitConfiguration: IResolvable) {
        cdkBuilder.gitConfiguration(gitConfiguration)
    }

    /**
     * @param gitConfiguration Provides the filter criteria and the source stage for the repository
     *   event that starts the pipeline, such as Git tags.
     */
    public fun gitConfiguration(gitConfiguration: CfnPipeline.GitConfigurationProperty) {
        cdkBuilder.gitConfiguration(gitConfiguration)
    }

    /**
     * @param providerType The source provider for the event, such as connections configured for a
     *   repository with Git tags, for the specified trigger configuration.
     */
    public fun providerType(providerType: String) {
        cdkBuilder.providerType(providerType)
    }

    public fun build(): CfnPipeline.PipelineTriggerDeclarationProperty = cdkBuilder.build()
}
