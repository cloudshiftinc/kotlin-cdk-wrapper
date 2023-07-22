@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationS3ContentLocationPropertyDsl {
  private val cdkBuilder: CfnApplication.S3ContentLocationProperty.Builder =
      CfnApplication.S3ContentLocationProperty.builder()

  /**
   * @param bucketArn The Amazon Resource Name (ARN) for the S3 bucket containing the application
   * code. 
   */
  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  /**
   * @param fileKey The file key for the object containing the application code. 
   */
  public fun fileKey(fileKey: String) {
    cdkBuilder.fileKey(fileKey)
  }

  /**
   * @param objectVersion The version of the object containing the application code.
   */
  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun build(): CfnApplication.S3ContentLocationProperty = cdkBuilder.build()
}
