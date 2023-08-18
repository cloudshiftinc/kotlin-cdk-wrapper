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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * The input for the data quality monitoring job.
 *
 * Currently endpoints are supported for input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DataQualityJobInputProperty dataQualityJobInputProperty = DataQualityJobInputProperty.builder()
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
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .endpointInput(EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-dataqualityjobinput.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder =
        CfnDataQualityJobDefinition.DataQualityJobInputProperty.builder()

    /** @param batchTransformInput The batch transform input for a monitoring job. */
    public fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    /** @param batchTransformInput The batch transform input for a monitoring job. */
    public fun batchTransformInput(
        batchTransformInput: CfnDataQualityJobDefinition.BatchTransformInputProperty
    ) {
        cdkBuilder.batchTransformInput(batchTransformInput)
    }

    /** @param endpointInput Input object for the endpoint. */
    public fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput)
    }

    /** @param endpointInput Input object for the endpoint. */
    public fun endpointInput(endpointInput: CfnDataQualityJobDefinition.EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput)
    }

    public fun build(): CfnDataQualityJobDefinition.DataQualityJobInputProperty = cdkBuilder.build()
}
