@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowS3SourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.S3SourcePropertiesProperty.Builder =
      CfnFlow.S3SourcePropertiesProperty.builder()

  /**
   * @param bucketName The Amazon S3 bucket name where the source files are stored. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
   * stored. 
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format that
   * you provide the flow input data.
   */
  public fun s3InputFormatConfig(s3InputFormatConfig: IResolvable) {
    cdkBuilder.s3InputFormatConfig(s3InputFormatConfig)
  }

  /**
   * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format that
   * you provide the flow input data.
   */
  public fun s3InputFormatConfig(s3InputFormatConfig: CfnFlow.S3InputFormatConfigProperty) {
    cdkBuilder.s3InputFormatConfig(s3InputFormatConfig)
  }

  public fun build(): CfnFlow.S3SourcePropertiesProperty = cdkBuilder.build()
}
