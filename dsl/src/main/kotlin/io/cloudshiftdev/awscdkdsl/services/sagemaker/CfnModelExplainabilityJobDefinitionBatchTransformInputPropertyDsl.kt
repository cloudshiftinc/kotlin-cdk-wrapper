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
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

/**
 * Input object for the batch transform job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * BatchTransformInputProperty batchTransformInputProperty = BatchTransformInputProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-batchtransforminput.html)
 */
@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionBatchTransformInputPropertyDsl {
    private val cdkBuilder:
        CfnModelExplainabilityJobDefinition.BatchTransformInputProperty.Builder =
        CfnModelExplainabilityJobDefinition.BatchTransformInputProperty.builder()

    /**
     * @param dataCapturedDestinationS3Uri The Amazon S3 location being used to capture the data.
     */
    public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
    }

    /** @param datasetFormat The dataset format for your batch transform job. */
    public fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat)
    }

    /** @param datasetFormat The dataset format for your batch transform job. */
    public fun datasetFormat(
        datasetFormat: CfnModelExplainabilityJobDefinition.DatasetFormatProperty
    ) {
        cdkBuilder.datasetFormat(datasetFormat)
    }

    /** @param featuresAttribute The attributes of the input data that are the input features. */
    public fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
    }

    /**
     * @param inferenceAttribute The attribute of the input data that represents the ground truth
     *   label.
     */
    public fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
    }

    /**
     * @param localPath Path to the filesystem where the batch transform data is available to the
     *   container.
     */
    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
    }

    /**
     * @param probabilityAttribute In a classification problem, the attribute that represents the
     *   class probability.
     */
    public fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
    }

    /**
     * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated
     *   or sharded by an S3 key. Defaults to `FullyReplicated`
     */
    public fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    /**
     * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
     *   data for the monitoring job. `Pipe` mode is recommended for large datasets. `File` mode is
     *   useful for small files that fit in memory. Defaults to `File` .
     */
    public fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.BatchTransformInputProperty =
        cdkBuilder.build()
}
