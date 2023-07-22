@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.EncryptionConfigurationProperty.Builder =
      CfnBucket.EncryptionConfigurationProperty.builder()

  /**
   * @param replicaKmsKeyId Specifies the ID (Key ARN or Alias ARN) of the customer managed AWS KMS
   * key stored in AWS Key Management Service (KMS) for the destination bucket. 
   * Amazon S3 uses this key to encrypt replica objects. Amazon S3 only supports symmetric
   * encryption KMS keys. For more information, see [Asymmetric keys in AWS
   * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the *AWS
   * Key Management Service Developer Guide* .
   */
  public fun replicaKmsKeyId(replicaKmsKeyId: String) {
    cdkBuilder.replicaKmsKeyId(replicaKmsKeyId)
  }

  public fun build(): CfnBucket.EncryptionConfigurationProperty = cdkBuilder.build()
}
