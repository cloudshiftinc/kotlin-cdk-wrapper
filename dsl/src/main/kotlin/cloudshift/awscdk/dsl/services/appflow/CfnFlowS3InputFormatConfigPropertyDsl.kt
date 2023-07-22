@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * When you use Amazon S3 as the source, the configuration format that you provide the flow input
 * data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * S3InputFormatConfigProperty s3InputFormatConfigProperty = S3InputFormatConfigProperty.builder()
 * .s3InputFileType("s3InputFileType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3inputformatconfig.html)
 */
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
