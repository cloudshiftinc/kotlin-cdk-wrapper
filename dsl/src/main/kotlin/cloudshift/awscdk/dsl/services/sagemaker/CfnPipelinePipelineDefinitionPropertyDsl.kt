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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnPipeline
import kotlin.String

@CdkDslMarker
public class CfnPipelinePipelineDefinitionPropertyDsl {
    private val cdkBuilder: CfnPipeline.PipelineDefinitionProperty.Builder =
        CfnPipeline.PipelineDefinitionProperty.builder()

    public fun pipelineDefinitionBody(pipelineDefinitionBody: String) {
        cdkBuilder.pipelineDefinitionBody(pipelineDefinitionBody)
    }

    public fun build(): CfnPipeline.PipelineDefinitionProperty = cdkBuilder.build()
}
