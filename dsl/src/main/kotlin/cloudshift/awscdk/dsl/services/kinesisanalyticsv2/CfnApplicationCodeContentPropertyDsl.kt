@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationCodeContentPropertyDsl {
  private val cdkBuilder: CfnApplication.CodeContentProperty.Builder =
      CfnApplication.CodeContentProperty.builder()

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
  public fun s3ContentLocation(s3ContentLocation: CfnApplication.S3ContentLocationProperty) {
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

  public fun build(): CfnApplication.CodeContentProperty = cdkBuilder.build()
}
