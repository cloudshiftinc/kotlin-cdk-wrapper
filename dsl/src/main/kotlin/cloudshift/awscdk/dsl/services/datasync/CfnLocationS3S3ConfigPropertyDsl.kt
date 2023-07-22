@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationS3

/**
 * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role used to
 * access an Amazon S3 bucket.
 *
 * For detailed information about using such a role, see [Creating a Location for Amazon
 * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
 * in the *AWS DataSync User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locations3-s3config.html)
 */
@CdkDslMarker
public class CfnLocationS3S3ConfigPropertyDsl {
  private val cdkBuilder: CfnLocationS3.S3ConfigProperty.Builder =
      CfnLocationS3.S3ConfigProperty.builder()

  /**
   * @param bucketAccessRoleArn The ARN of the IAM role for accessing the S3 bucket. 
   */
  public fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
    cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
  }

  public fun build(): CfnLocationS3.S3ConfigProperty = cdkBuilder.build()
}
