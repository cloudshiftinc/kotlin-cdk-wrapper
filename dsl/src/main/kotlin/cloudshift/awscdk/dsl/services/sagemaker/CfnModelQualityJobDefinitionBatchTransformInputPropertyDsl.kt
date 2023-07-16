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

  public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
    cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
  }

  public fun datasetFormat(datasetFormat: IResolvable) {
    cdkBuilder.datasetFormat(datasetFormat)
  }

  public fun datasetFormat(datasetFormat: CfnModelQualityJobDefinition.DatasetFormatProperty) {
    cdkBuilder.datasetFormat(datasetFormat)
  }

  public fun endTimeOffset(endTimeOffset: String) {
    cdkBuilder.endTimeOffset(endTimeOffset)
  }

  public fun inferenceAttribute(inferenceAttribute: String) {
    cdkBuilder.inferenceAttribute(inferenceAttribute)
  }

  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  public fun probabilityAttribute(probabilityAttribute: String) {
    cdkBuilder.probabilityAttribute(probabilityAttribute)
  }

  public fun probabilityThresholdAttribute(probabilityThresholdAttribute: Number) {
    cdkBuilder.probabilityThresholdAttribute(probabilityThresholdAttribute)
  }

  public fun s3DataDistributionType(s3DataDistributionType: String) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  public fun s3InputMode(s3InputMode: String) {
    cdkBuilder.s3InputMode(s3InputMode)
  }

  public fun startTimeOffset(startTimeOffset: String) {
    cdkBuilder.startTimeOffset(startTimeOffset)
  }

  public fun build(): CfnModelQualityJobDefinition.BatchTransformInputProperty = cdkBuilder.build()
}
