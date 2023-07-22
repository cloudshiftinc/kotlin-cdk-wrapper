@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowS3DestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.S3DestinationPropertiesProperty.Builder =
      CfnFlow.S3DestinationPropertiesProperty.builder()

  /**
   * @param bucketName The Amazon S3 bucket name in which Amazon AppFlow places the transferred
   * data. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix The object key for the destination bucket in which Amazon AppFlow places
   * the files.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should format
   * the flow output data when Amazon S3 is used as the destination.
   */
  public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
    cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
  }

  /**
   * @param s3OutputFormatConfig The configuration that determines how Amazon AppFlow should format
   * the flow output data when Amazon S3 is used as the destination.
   */
  public fun s3OutputFormatConfig(s3OutputFormatConfig: CfnFlow.S3OutputFormatConfigProperty) {
    cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
  }

  public fun build(): CfnFlow.S3DestinationPropertiesProperty = cdkBuilder.build()
}
