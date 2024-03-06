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
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * The Git repository file paths specified as filter criteria to start the pipeline.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * GitFilePathFilterCriteriaProperty gitFilePathFilterCriteriaProperty =
 * GitFilePathFilterCriteriaProperty.builder()
 * .excludes(List.of("excludes"))
 * .includes(List.of("includes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-gitfilepathfiltercriteria.html)
 */
@CdkDslMarker
public class CfnPipelineGitFilePathFilterCriteriaPropertyDsl {
    private val cdkBuilder: CfnPipeline.GitFilePathFilterCriteriaProperty.Builder =
        CfnPipeline.GitFilePathFilterCriteriaProperty.builder()

    private val _excludes: MutableList<String> = mutableListOf()

    private val _includes: MutableList<String> = mutableListOf()

    /**
     * @param excludes The list of patterns of Git repository file paths that, when a commit is
     *   pushed, are to be excluded from starting the pipeline.
     */
    public fun excludes(vararg excludes: String) {
        _excludes.addAll(listOf(*excludes))
    }

    /**
     * @param excludes The list of patterns of Git repository file paths that, when a commit is
     *   pushed, are to be excluded from starting the pipeline.
     */
    public fun excludes(excludes: Collection<String>) {
        _excludes.addAll(excludes)
    }

    /**
     * @param includes The list of patterns of Git repository file paths that, when a commit is
     *   pushed, are to be included as criteria that starts the pipeline.
     */
    public fun includes(vararg includes: String) {
        _includes.addAll(listOf(*includes))
    }

    /**
     * @param includes The list of patterns of Git repository file paths that, when a commit is
     *   pushed, are to be included as criteria that starts the pipeline.
     */
    public fun includes(includes: Collection<String>) {
        _includes.addAll(includes)
    }

    public fun build(): CfnPipeline.GitFilePathFilterCriteriaProperty {
        if (_excludes.isNotEmpty()) cdkBuilder.excludes(_excludes)
        if (_includes.isNotEmpty()) cdkBuilder.includes(_includes)
        return cdkBuilder.build()
    }
}
