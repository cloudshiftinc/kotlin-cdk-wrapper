@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplication

@CdkDslMarker
public class CfnApplicationS3LocationPropertyDsl {
  private val cdkBuilder: CfnApplication.S3LocationProperty.Builder =
      CfnApplication.S3LocationProperty.builder()

  /**
   * @param s3Bucket The S3 bucket of the S3 object. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Key The S3 key of the S3 object. 
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnApplication.S3LocationProperty = cdkBuilder.build()
}
