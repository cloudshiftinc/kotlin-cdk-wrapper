@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplication

/**
 * The S3 location of the application icon.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-application-s3location.html)
 */
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
