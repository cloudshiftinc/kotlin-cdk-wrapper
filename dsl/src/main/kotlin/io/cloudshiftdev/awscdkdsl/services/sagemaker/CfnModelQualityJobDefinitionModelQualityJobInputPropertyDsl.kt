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
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

/**
 * The input for the model quality monitoring job.
 *
 * Currently endponts are supported for input for model quality monitoring jobs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelQualityJobInputProperty modelQualityJobInputProperty =
 * ModelQualityJobInputProperty.builder()
 * .groundTruthS3Input(MonitoringGroundTruthS3InputProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * // the properties below are optional
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
 * .endTimeOffset("endTimeOffset")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .endTimeOffset("endTimeOffset")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-modelqualityjobinput.html)
 */
@CdkDslMarker
public class CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl {
    private val cdkBuilder: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder =
        CfnModelQualityJobDefinition.ModelQualityJobInputProperty.builder()

    /** @param batchTransformInput The batch transform input for a monitoring job. */
    public fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    /** @param batchTransformInput The batch transform input for a monitoring job. */
    public fun batchTransformInput(
        batchTransformInput: CfnModelQualityJobDefinition.BatchTransformInputProperty
    ) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    /** @param endpointInput Input object for the endpoint. */
    public fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput)
    }

    /** @param endpointInput Input object for the endpoint. */
    public fun endpointInput(endpointInput: CfnModelQualityJobDefinition.EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput)
    }

    /** @param groundTruthS3Input The ground truth label provided for the model. */
    public fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input)
    }

    /** @param groundTruthS3Input The ground truth label provided for the model. */
    public fun groundTruthS3Input(
        groundTruthS3Input: CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty
    ) {
        cdkBuilder.groundTruthS3Input(groundTruthS3Input)
    }

    public fun build(): CfnModelQualityJobDefinition.ModelQualityJobInputProperty =
        cdkBuilder.build()
}
