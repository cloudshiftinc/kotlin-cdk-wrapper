@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3outposts.CfnBucket

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
