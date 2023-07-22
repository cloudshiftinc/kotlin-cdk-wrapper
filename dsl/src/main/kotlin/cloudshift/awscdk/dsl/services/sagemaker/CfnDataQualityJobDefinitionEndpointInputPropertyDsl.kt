@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionEndpointInputPropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.EndpointInputProperty.Builder =
      CfnDataQualityJobDefinition.EndpointInputProperty.builder()

  /**
   * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
   * enabled. 
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param localPath Path to the filesystem where the endpoint data is available to the container. 
   */
  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  /**
   * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated
   * or sharded by an S3 key.
   * Defaults to `FullyReplicated`
   */
  public fun s3DataDistributionType(s3DataDistributionType: String) {
    cdkBuilder.s3DataDistributionType(s3DataDistributionType)
  }

  /**
   * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring data
   * for the monitoring job.
   * `Pipe` mode is recommended for large datasets. `File` mode is useful for small files that fit
   * in memory. Defaults to `File` .
   */
  public fun s3InputMode(s3InputMode: String) {
    cdkBuilder.s3InputMode(s3InputMode)
  }

  public fun build(): CfnDataQualityJobDefinition.EndpointInputProperty = cdkBuilder.build()
}
