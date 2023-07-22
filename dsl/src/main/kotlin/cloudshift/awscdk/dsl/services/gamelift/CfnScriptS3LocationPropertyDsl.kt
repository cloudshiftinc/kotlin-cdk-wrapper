@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnScript

@CdkDslMarker
public class CfnScriptS3LocationPropertyDsl {
  private val cdkBuilder: CfnScript.S3LocationProperty.Builder =
      CfnScript.S3LocationProperty.builder()

  /**
   * @param bucket An Amazon S3 bucket identifier. Thename of the S3 bucket. 
   *
   * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a dot
   * (.).
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The name of the zip file that contains the build files or script files. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param objectVersion The version of the file, if object versioning is turned on for the bucket.
   * Amazon GameLift uses this information when retrieving files from an S3 bucket that you own. Use
   * this parameter to specify a specific version of the file. If not set, the latest version of the
   * file is retrieved.
   */
  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  /**
   * @param roleArn The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
   * allows Amazon GameLift to access the S3 bucket. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnScript.S3LocationProperty = cdkBuilder.build()
}
