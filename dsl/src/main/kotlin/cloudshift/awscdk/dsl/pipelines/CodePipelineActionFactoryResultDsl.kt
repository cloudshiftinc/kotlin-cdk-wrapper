@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.services.codebuild.IProject
import kotlin.Number

/**
 * The result of adding actions to the pipeline.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.pipelines.*;
 * Project project;
 * CodePipelineActionFactoryResult codePipelineActionFactoryResult =
 * CodePipelineActionFactoryResult.builder()
 * .runOrdersConsumed(123)
 * // the properties below are optional
 * .project(project)
 * .build();
 * ```
 */
@CdkDslMarker
public class CodePipelineActionFactoryResultDsl {
    private val cdkBuilder: CodePipelineActionFactoryResult.Builder =
        CodePipelineActionFactoryResult.builder()

    /**
     * @param project If a CodeBuild project got created, the project.
     */
    public fun project(project: IProject) {
        cdkBuilder.project(project)
    }

    /**
     * @param runOrdersConsumed How many RunOrders were consumed.
     * If you add 1 action, return the value 1 here.
     */
    public fun runOrdersConsumed(runOrdersConsumed: Number) {
        cdkBuilder.runOrdersConsumed(runOrdersConsumed)
    }

    public fun build(): CodePipelineActionFactoryResult = cdkBuilder.build()
}
