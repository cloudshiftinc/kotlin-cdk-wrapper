@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowS3InputFormatConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.S3InputFormatConfigProperty.Builder =
      CfnFlow.S3InputFormatConfigProperty.builder()

  /**
   * @param s3InputFileType The file type that Amazon AppFlow gets from your Amazon S3 bucket.
   */
  public fun s3InputFileType(s3InputFileType: String) {
    cdkBuilder.s3InputFileType(s3InputFileType)
  }

  public fun build(): CfnFlow.S3InputFormatConfigProperty = cdkBuilder.build()
}
