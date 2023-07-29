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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

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
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-batchtransforminput.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionBatchTransformInputPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.BatchTransformInputProperty.Builder =
        CfnDataQualityJobDefinition.BatchTransformInputProperty.builder()

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
    public fun datasetFormat(datasetFormat: CfnDataQualityJobDefinition.DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat)
    }

    /**
     * @param localPath Path to the filesystem where the endpoint data is available to the
     *   container.
     */
    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
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

    public fun build(): CfnDataQualityJobDefinition.BatchTransformInputProperty = cdkBuilder.build()
}
