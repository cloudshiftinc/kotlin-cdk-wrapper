@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Specifies either the application code, or the location of the application code, for a Flink-based
 * Kinesis Data Analytics application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CodeContentProperty codeContentProperty = CodeContentProperty.builder()
 * .s3ContentLocation(S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .textContent("textContent")
 * .zipFileContent("zipFileContent")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html)
 */
@CdkDslMarker
public class CfnApplicationV2CodeContentPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.CodeContentProperty.Builder =
      CfnApplicationV2.CodeContentProperty.builder()

  /**
   * @param s3ContentLocation Information about the Amazon S3 bucket that contains the application
   * code.
   */
  public fun s3ContentLocation(s3ContentLocation: IResolvable) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  /**
   * @param s3ContentLocation Information about the Amazon S3 bucket that contains the application
   * code.
   */
  public fun s3ContentLocation(s3ContentLocation: CfnApplicationV2.S3ContentLocationProperty) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  /**
   * @param textContent The text-format code for a Flink-based Kinesis Data Analytics application.
   */
  public fun textContent(textContent: String) {
    cdkBuilder.textContent(textContent)
  }

  /**
   * @param zipFileContent The zip-format code for a Flink-based Kinesis Data Analytics application.
   */
  public fun zipFileContent(zipFileContent: String) {
    cdkBuilder.zipFileContent(zipFileContent)
  }

  public fun build(): CfnApplicationV2.CodeContentProperty = cdkBuilder.build()
}
