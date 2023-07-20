@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.services.codebuild.IProject
import kotlin.Number

@CdkDslMarker
public class CodePipelineActionFactoryResultDsl {
    private val cdkBuilder: CodePipelineActionFactoryResult.Builder =
        CodePipelineActionFactoryResult.builder()

    public fun project(project: IProject) {
        cdkBuilder.project(project)
    }

    public fun runOrdersConsumed(runOrdersConsumed: Number) {
        cdkBuilder.runOrdersConsumed(runOrdersConsumed)
    }

    public fun build(): CodePipelineActionFactoryResult = cdkBuilder.build()
}
