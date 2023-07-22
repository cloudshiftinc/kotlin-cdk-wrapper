@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowUpsolverDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.UpsolverDestinationPropertiesProperty.Builder =
      CfnFlow.UpsolverDestinationPropertiesProperty.builder()

  /**
   * @param bucketName The Upsolver Amazon S3 bucket name in which Amazon AppFlow places the
   * transferred data. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix The object key for the destination Upsolver Amazon S3 bucket in which
   * Amazon AppFlow places the files.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param s3OutputFormatConfig The configuration that determines how data is formatted when
   * Upsolver is used as the flow destination. 
   */
  public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
    cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
  }

  /**
   * @param s3OutputFormatConfig The configuration that determines how data is formatted when
   * Upsolver is used as the flow destination. 
   */
  public
      fun s3OutputFormatConfig(s3OutputFormatConfig: CfnFlow.UpsolverS3OutputFormatConfigProperty) {
    cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
  }

  public fun build(): CfnFlow.UpsolverDestinationPropertiesProperty = cdkBuilder.build()
}
