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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * The event criteria that specify when a specified repository event will start the pipeline for the
 * specified trigger configuration, such as the lists of Git tags to include and exclude.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * GitPushFilterProperty gitPushFilterProperty = GitPushFilterProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitpushfilter.html)
 */
@CdkDslMarker
public class CfnPipelineGitPushFilterPropertyDsl {
    private val cdkBuilder: CfnPipeline.GitPushFilterProperty.Builder =
        CfnPipeline.GitPushFilterProperty.builder()

    /**
     * @param branches The field that specifies to filter on branches for the push trigger
     *   configuration.
     */
    public fun branches(branches: IResolvable) {
        cdkBuilder.branches(branches)
    }

    /**
     * @param branches The field that specifies to filter on branches for the push trigger
     *   configuration.
     */
    public fun branches(branches: CfnPipeline.GitBranchFilterCriteriaProperty) {
        cdkBuilder.branches(branches)
    }

    /**
     * @param filePaths The field that specifies to filter on file paths for the push trigger
     *   configuration.
     */
    public fun filePaths(filePaths: IResolvable) {
        cdkBuilder.filePaths(filePaths)
    }

    /**
     * @param filePaths The field that specifies to filter on file paths for the push trigger
     *   configuration.
     */
    public fun filePaths(filePaths: CfnPipeline.GitFilePathFilterCriteriaProperty) {
        cdkBuilder.filePaths(filePaths)
    }

    /** @param tags The field that contains the details for the Git tags trigger configuration. */
    public fun tags(tags: CfnPipelineGitTagFilterCriteriaPropertyDsl.() -> Unit = {}) {
        val builder = CfnPipelineGitTagFilterCriteriaPropertyDsl()
        builder.apply(tags)
        cdkBuilder.tags(builder.build())
    }

    /** @param tags The field that contains the details for the Git tags trigger configuration. */
    public fun tags(tags: CfnPipeline.GitTagFilterCriteriaProperty) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnPipeline.GitPushFilterProperty = cdkBuilder.build()
}
