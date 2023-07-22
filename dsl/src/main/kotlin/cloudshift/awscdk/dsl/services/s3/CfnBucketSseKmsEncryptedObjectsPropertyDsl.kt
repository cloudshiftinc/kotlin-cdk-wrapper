@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketSseKmsEncryptedObjectsPropertyDsl {
  private val cdkBuilder: CfnBucket.SseKmsEncryptedObjectsProperty.Builder =
      CfnBucket.SseKmsEncryptedObjectsProperty.builder()

  /**
   * @param status Specifies whether Amazon S3 replicates objects created with server-side
   * encryption using an AWS KMS key stored in AWS Key Management Service. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnBucket.SseKmsEncryptedObjectsProperty = cdkBuilder.build()
}
