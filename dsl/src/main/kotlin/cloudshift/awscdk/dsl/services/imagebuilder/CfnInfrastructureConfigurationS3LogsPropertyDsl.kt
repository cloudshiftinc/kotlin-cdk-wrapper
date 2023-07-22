@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

@CdkDslMarker
public class CfnInfrastructureConfigurationS3LogsPropertyDsl {
  private val cdkBuilder: CfnInfrastructureConfiguration.S3LogsProperty.Builder =
      CfnInfrastructureConfiguration.S3LogsProperty.builder()

  /**
   * @param s3BucketName The S3 bucket in which to store the logs.
   */
  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  /**
   * @param s3KeyPrefix The Amazon S3 path to the bucket where the logs are stored.
   */
  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  public fun build(): CfnInfrastructureConfiguration.S3LogsProperty = cdkBuilder.build()
}
