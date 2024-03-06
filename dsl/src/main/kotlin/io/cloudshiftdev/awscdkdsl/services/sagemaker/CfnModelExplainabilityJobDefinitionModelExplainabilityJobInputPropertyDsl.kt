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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

/**
 * Inputs for the model explainability job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelExplainabilityJobInputProperty modelExplainabilityJobInputProperty =
 * ModelExplainabilityJobInputProperty.builder()
 * .batchTransformInput(BatchTransformInputProperty.builder()
 * .dataCapturedDestinationS3Uri("dataCapturedDestinationS3Uri")
 * .datasetFormat(DatasetFormatProperty.builder()
 * .csv(CsvProperty.builder()
 * .header(false)
 * .build())
 * .json(JsonProperty.builder()
 * .line(false)
 * .build())
 * .parquet(false)
 * .build())
 * .localPath("localPath")
 * // the properties below are optional
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-modelexplainabilityjobinput.html)
 */
@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl {
    private val cdkBuilder:
        CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder =
        CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.builder()

    /** @param batchTransformInput Input object for the batch transform job. */
    public fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    /** @param batchTransformInput Input object for the batch transform job. */
    public fun batchTransformInput(
        batchTransformInput: CfnModelExplainabilityJobDefinition.BatchTransformInputProperty
    ) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    /** @param endpointInput Input object for the endpoint. */
    public fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput)
    }

    /** @param endpointInput Input object for the endpoint. */
    public fun endpointInput(
        endpointInput: CfnModelExplainabilityJobDefinition.EndpointInputProperty
    ) {
        cdkBuilder.endpointInput(endpointInput)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty =
        cdkBuilder.build()
}
