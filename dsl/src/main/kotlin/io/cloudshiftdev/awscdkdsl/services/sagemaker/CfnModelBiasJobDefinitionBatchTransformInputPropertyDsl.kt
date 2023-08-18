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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

/**
 * The batch transform input for a monitoring job.
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
 * .endTimeOffset("endTimeOffset")
 * .featuresAttribute("featuresAttribute")
 * .inferenceAttribute("inferenceAttribute")
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityThresholdAttribute(123)
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .startTimeOffset("startTimeOffset")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-batchtransforminput.html)
 */
@CdkDslMarker
public class CfnModelBiasJobDefinitionBatchTransformInputPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.BatchTransformInputProperty.Builder =
        CfnModelBiasJobDefinition.BatchTransformInputProperty.builder()

    /**
     * @param dataCapturedDestinationS3Uri A URI that identifies the Amazon S3 storage location
     *   where Batch Transform Job captures data.
     */
    public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
    }

    /** @param datasetFormat The dataset format of the data to monitor. */
    public fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat)
    }

    /** @param datasetFormat The dataset format of the data to monitor. */
    public fun datasetFormat(datasetFormat: CfnModelBiasJobDefinition.DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat)
    }

    /** @param endTimeOffset The time offsets in ISO duration format. */
    public fun endTimeOffset(endTimeOffset: String) {
        cdkBuilder.endTimeOffset(endTimeOffset)
    }

    /** @param featuresAttribute JSONpath to locate features in JSONlines dataset. */
    public fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
    }

    /** @param inferenceAttribute Index or JSONpath to locate predicted label(s). */
    public fun inferenceAttribute(inferenceAttribute: String) {
        cdkBuilder.inferenceAttribute(inferenceAttribute)
    }

    /**
     * @param localPath Path to the filesystem where the endpoint data is available to the
     *   container.
     */
    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
    }

    /** @param probabilityAttribute Index or JSONpath to locate probabilities. */
    public fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
    }

    /** @param probabilityThresholdAttribute the value to be set. */
    public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
        cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
    }

    /**
     * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated
     *   or sharded by an S3 key. Defauts to FullyReplicated
     */
    public fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    /**
     * @param s3InputMode Whether the Pipe or File is used as the input mode for transfering data
     *   for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful
     *   for small files that fit in memory. Defaults to File.
     */
    public fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
    }

    /** @param startTimeOffset The time offsets in ISO duration format. */
    public fun startTimeOffset(startTimeOffset: String) {
        cdkBuilder.startTimeOffset(startTimeOffset)
    }

    public fun build(): CfnModelBiasJobDefinition.BatchTransformInputProperty = cdkBuilder.build()
}
