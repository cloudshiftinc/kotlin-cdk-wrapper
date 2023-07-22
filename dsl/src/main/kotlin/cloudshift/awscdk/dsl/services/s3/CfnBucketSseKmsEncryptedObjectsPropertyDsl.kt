@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container for filter information for the selection of S3 objects encrypted with AWS KMS.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * SseKmsEncryptedObjectsProperty sseKmsEncryptedObjectsProperty =
 * SseKmsEncryptedObjectsProperty.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html)
 */
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
