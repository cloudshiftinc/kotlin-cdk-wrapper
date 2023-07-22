@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketServerSideEncryptionByDefaultPropertyDsl {
  private val cdkBuilder: CfnBucket.ServerSideEncryptionByDefaultProperty.Builder =
      CfnBucket.ServerSideEncryptionByDefaultProperty.builder()

  /**
   * @param kmsMasterKeyId KMS key ID to use for the default encryption. This parameter is allowed
   * if SSEAlgorithm is aws:kms.
   * You can specify the key ID, key alias, or the Amazon Resource Name (ARN) of the CMK. However,
   * if you are using encryption with cross-account operations, you must use a fully qualified CMK ARN.
   * For more information, see [Using encryption for cross-account
   * operations](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy)
   * .
   *
   * For example:
   *
   * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
   * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
   *
   *
   * Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information,
   * see [Using Symmetric and Asymmetric
   * Keys](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
   * *AWS Key Management Service Developer Guide* .
   */
  public fun kmsMasterKeyId(kmsMasterKeyId: String) {
    cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
  }

  /**
   * @param sseAlgorithm Server-side encryption algorithm to use for the default encryption. 
   */
  public fun sseAlgorithm(sseAlgorithm: String) {
    cdkBuilder.sseAlgorithm(sseAlgorithm)
  }

  public fun build(): CfnBucket.ServerSideEncryptionByDefaultProperty = cdkBuilder.build()
}
