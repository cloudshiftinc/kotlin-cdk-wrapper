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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnPipeline

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * PipelineDefinitionProperty pipelineDefinitionProperty = PipelineDefinitionProperty.builder()
 * .pipelineDefinitionBody("pipelineDefinitionBody")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html)
 */
@CdkDslMarker
public class CfnPipelinePipelineDefinitionPropertyDsl {
    private val cdkBuilder: CfnPipeline.PipelineDefinitionProperty.Builder =
        CfnPipeline.PipelineDefinitionProperty.builder()

    /** @param pipelineDefinitionBody A specification that defines the pipeline in JSON format. */
    public fun pipelineDefinitionBody(pipelineDefinitionBody: String) {
        cdkBuilder.pipelineDefinitionBody(pipelineDefinitionBody)
    }

    public fun build(): CfnPipeline.PipelineDefinitionProperty = cdkBuilder.build()
}
