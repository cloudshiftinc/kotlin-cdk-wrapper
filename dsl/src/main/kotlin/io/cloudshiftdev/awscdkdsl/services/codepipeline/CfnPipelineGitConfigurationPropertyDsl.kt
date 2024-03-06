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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * A type of trigger configuration for Git-based source actions.
 *
 * You can specify the Git configuration trigger type for all third-party Git-based source actions
 * that are supported by the `CodeStarSourceConnection` action type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * GitConfigurationProperty gitConfigurationProperty = GitConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitconfiguration.html)
 */
@CdkDslMarker
public class CfnPipelineGitConfigurationPropertyDsl {
    private val cdkBuilder: CfnPipeline.GitConfigurationProperty.Builder =
        CfnPipeline.GitConfigurationProperty.builder()

    private val _pullRequest: MutableList<Any> = mutableListOf()

    private val _push: MutableList<Any> = mutableListOf()

    /**
     * @param pullRequest The field where the repository event that will start the pipeline is
     *   specified as pull requests.
     */
    public fun pullRequest(vararg pullRequest: Any) {
        _pullRequest.addAll(listOf(*pullRequest))
    }

    /**
     * @param pullRequest The field where the repository event that will start the pipeline is
     *   specified as pull requests.
     */
    public fun pullRequest(pullRequest: Collection<Any>) {
        _pullRequest.addAll(pullRequest)
    }

    /**
     * @param pullRequest The field where the repository event that will start the pipeline is
     *   specified as pull requests.
     */
    public fun pullRequest(pullRequest: IResolvable) {
        cdkBuilder.pullRequest(pullRequest)
    }

    /**
     * @param push The field where the repository event that will start the pipeline, such as
     *   pushing Git tags, is specified with details.
     */
    public fun push(vararg push: Any) {
        _push.addAll(listOf(*push))
    }

    /**
     * @param push The field where the repository event that will start the pipeline, such as
     *   pushing Git tags, is specified with details.
     */
    public fun push(push: Collection<Any>) {
        _push.addAll(push)
    }

    /**
     * @param push The field where the repository event that will start the pipeline, such as
     *   pushing Git tags, is specified with details.
     */
    public fun push(push: IResolvable) {
        cdkBuilder.push(push)
    }

    /**
     * @param sourceActionName The name of the pipeline source action where the trigger
     *   configuration, such as Git tags, is specified. The trigger configuration will start the
     *   pipeline upon the specified change only.
     *
     * You can only specify one trigger configuration per source action.
     */
    public fun sourceActionName(sourceActionName: String) {
        cdkBuilder.sourceActionName(sourceActionName)
    }

    public fun build(): CfnPipeline.GitConfigurationProperty {
        if (_pullRequest.isNotEmpty()) cdkBuilder.pullRequest(_pullRequest)
        if (_push.isNotEmpty()) cdkBuilder.push(_push)
        return cdkBuilder.build()
    }
}
