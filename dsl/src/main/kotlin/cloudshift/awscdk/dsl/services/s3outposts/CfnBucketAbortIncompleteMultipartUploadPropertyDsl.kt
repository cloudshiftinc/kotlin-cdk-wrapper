@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3outposts.CfnBucket

/**
 * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 on
 * Outposts waits before permanently removing all parts of the upload.
 *
 * For more information, see [Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
 * Policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * AbortIncompleteMultipartUploadProperty abortIncompleteMultipartUploadProperty =
 * AbortIncompleteMultipartUploadProperty.builder()
 * .daysAfterInitiation(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-abortincompletemultipartupload.html)
 */
@CdkDslMarker
public class CfnBucketAbortIncompleteMultipartUploadPropertyDsl {
  private val cdkBuilder: CfnBucket.AbortIncompleteMultipartUploadProperty.Builder =
      CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

  /**
   * @param daysAfterInitiation Specifies the number of days after initiation that Amazon S3 on
   * Outposts aborts an incomplete multipart upload. 
   */
  public fun daysAfterInitiation(daysAfterInitiation: Number) {
    cdkBuilder.daysAfterInitiation(daysAfterInitiation)
  }

  public fun build(): CfnBucket.AbortIncompleteMultipartUploadProperty = cdkBuilder.build()
}
