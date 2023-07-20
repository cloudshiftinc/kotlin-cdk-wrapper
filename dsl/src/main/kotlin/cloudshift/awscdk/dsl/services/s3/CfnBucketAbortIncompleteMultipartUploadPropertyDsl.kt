@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketAbortIncompleteMultipartUploadPropertyDsl {
  private val cdkBuilder: CfnBucket.AbortIncompleteMultipartUploadProperty.Builder =
      CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

  public fun daysAfterInitiation(daysAfterInitiation: Number) {
    cdkBuilder.daysAfterInitiation(daysAfterInitiation)
  }

  public fun build(): CfnBucket.AbortIncompleteMultipartUploadProperty = cdkBuilder.build()
}
