@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionBatchTransformInputPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.BatchTransformInputProperty.Builder =
      CfnModelQualityJobDefinition.BatchTransformInputProperty.builder()

  /**
   * @param dataCapturedDestinationS3Uri A URI that identifies the Amazon S3 storage location where
   * Batch Transform Job captures data. 
   */
  public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
    cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
  }

  /**
   * @param datasetFormat The dataset format of the data to monitor. 
   */
  public fun datasetFormat(datasetFormat: IResolvable) {
    cdkBuilder.datasetFormat(datasetFormat)
  }

  /**
   * @param datasetFormat The dataset format of the data to monitor. 
   */
  public fun datasetFormat(datasetFormat: CfnModelQualityJobDefinition.DatasetFormatProperty) {
    cdkBuilder.datasetFormat(datasetFormat)
  }

  /**
   * @param endTimeOffset The time offsets in ISO duration format.
   */
  public fun endTimeOffset(endTimeOffset: String) {
    cdkBuilder.endTimeOffset(endTimeOffset)
  }

  /**
   * @param inferenceAttribute Index or JSONpath to locate predicted label(s).
   */
  public fun inferenceAttribute(inferenceAttribute: String) {
    cdkBuilder.inferenceAttribute(inferenceAttribute)
  }

  /**
   * @param localPath Path to the filesystem where the endpoint data is available to the container. 
   */
  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  /**
   * @param probabilityAttribute Index or JSONpath to locate probabilities.
   */
  public fun probabilityAttribute(probabilityAttribute: String) {
    cdkBuilder.probabilityAttribute(probabilityAttribute)
  }

  /**
   * @param probabilityThresholdAttribute the value to be set.
   */
  public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
    cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
  }

  /**
   * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated
   * or sharded by an S3 key.
   * Defauts to FullyReplicated
   */
  public fun s3DataDistributionType(s3DataDistributionType: String) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  /**
   * @param s3InputMode Whether the Pipe or File is used as the input mode for transfering data for
   * the monitoring job.
   * Pipe mode is recommended for large datasets. File mode is useful for small files that fit in
   * memory. Defaults to File.
   */
  public fun s3InputMode(s3InputMode: String) {
    cdkBuilder.s3InputMode(s3InputMode)
  }

  /**
   * @param startTimeOffset The time offsets in ISO duration format.
   */
  public fun startTimeOffset(startTimeOffset: String) {
    cdkBuilder.startTimeOffset(startTimeOffset)
  }

  public fun build(): CfnModelQualityJobDefinition.BatchTransformInputProperty = cdkBuilder.build()
}
