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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * The event criteria for the pull request trigger configuration, such as the lists of branches or
 * file paths to include and exclude.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * GitPullRequestFilterProperty gitPullRequestFilterProperty =
 * GitPullRequestFilterProperty.builder()
 * .branches(GitBranchFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .events(List.of("events"))
 * .filePaths(GitFilePathFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpullrequestfilter.html)
 */
@CdkDslMarker
public class CfnPipelineGitPullRequestFilterPropertyDsl {
    private val cdkBuilder: CfnPipeline.GitPullRequestFilterProperty.Builder =
        CfnPipeline.GitPullRequestFilterProperty.builder()

    private val _events: MutableList<String> = mutableListOf()

    /**
     * @param branches The field that specifies to filter on branches for the pull request trigger
     *   configuration.
     */
    public fun branches(branches: IResolvable) {
        cdkBuilder.branches(branches)
    }

    /**
     * @param branches The field that specifies to filter on branches for the pull request trigger
     *   configuration.
     */
    public fun branches(branches: CfnPipeline.GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches)
    }

    /**
     * @param events The field that specifies which pull request events to filter on (opened,
     *   updated, closed) for the trigger configuration.
     */
    public fun events(vararg events: String) {
        _events.addAll(listOf(*events))
    }

    /**
     * @param events The field that specifies which pull request events to filter on (opened,
     *   updated, closed) for the trigger configuration.
     */
    public fun events(events: Collection<String>) {
        _events.addAll(events)
    }

    /**
     * @param filePaths The field that specifies to filter on file paths for the pull request
     *   trigger configuration.
     */
    public fun filePaths(filePaths: IResolvable) {
        cdkBuilder.filePaths(filePaths)
    }

    /**
     * @param filePaths The field that specifies to filter on file paths for the pull request
     *   trigger configuration.
     */
    public fun filePaths(filePaths: CfnPipeline.GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths)
    }

    public fun build(): CfnPipeline.GitPullRequestFilterProperty {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
