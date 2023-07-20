@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionBatchTransformInputPropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.BatchTransformInputProperty.Builder =
      CfnDataQualityJobDefinition.BatchTransformInputProperty.builder()

  public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
    cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
  }

  public fun datasetFormat(datasetFormat: IResolvable) {
    cdkBuilder.datasetFormat(datasetFormat)
  }

  public fun datasetFormat(datasetFormat: CfnDataQualityJobDefinition.DatasetFormatProperty) {
    cdkBuilder.datasetFormat(datasetFormat)
  }

  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  public fun s3DataDistributionType(s3DataDistributionType: String) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  public fun s3InputMode(s3InputMode: String) {
    cdkBuilder.s3InputMode(s3InputMode)
  }

  public fun build(): CfnDataQualityJobDefinition.BatchTransformInputProperty = cdkBuilder.build()
}
