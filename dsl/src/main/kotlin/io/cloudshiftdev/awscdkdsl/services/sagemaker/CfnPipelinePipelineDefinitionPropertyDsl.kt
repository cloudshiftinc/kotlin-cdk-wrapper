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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnPipeline

/**
 * The definition of the pipeline.
 *
 * This can be either a JSON string or an Amazon S3 location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * PipelineDefinitionProperty pipelineDefinitionProperty = PipelineDefinitionProperty.builder()
 * .pipelineDefinitionBody("pipelineDefinitionBody")
 * // the properties below are optional
 * .pipelineDefinitionS3Location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .eTag("eTag")
 * .version("version")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html)
 */
@CdkDslMarker
public class CfnPipelinePipelineDefinitionPropertyDsl {
    private val cdkBuilder: CfnPipeline.PipelineDefinitionProperty.Builder =
        CfnPipeline.PipelineDefinitionProperty.builder()

    /**
     * @param pipelineDefinitionBody The
     *   [JSON pipeline definition](https://docs.aws.amazon.com/https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/)
     *   of the pipeline.
     */
    public fun pipelineDefinitionBody(pipelineDefinitionBody: String) {
        cdkBuilder.pipelineDefinitionBody(pipelineDefinitionBody)
    }

    /**
     * @param pipelineDefinitionS3Location The location of the pipeline definition stored in Amazon
     *   S3. If specified, SageMaker retrieves the pipeline definition from this location.
     */
    public fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: IResolvable) {
        cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location)
    }

    /**
     * @param pipelineDefinitionS3Location The location of the pipeline definition stored in Amazon
     *   S3. If specified, SageMaker retrieves the pipeline definition from this location.
     */
    public fun pipelineDefinitionS3Location(
        pipelineDefinitionS3Location: CfnPipeline.S3LocationProperty
    ) {
        cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location)
    }

    public fun build(): CfnPipeline.PipelineDefinitionProperty = cdkBuilder.build()
}
