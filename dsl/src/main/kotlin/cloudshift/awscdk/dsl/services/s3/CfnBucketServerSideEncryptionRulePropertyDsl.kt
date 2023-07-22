@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketServerSideEncryptionRulePropertyDsl {
  private val cdkBuilder: CfnBucket.ServerSideEncryptionRuleProperty.Builder =
      CfnBucket.ServerSideEncryptionRuleProperty.builder()

  /**
   * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
   * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
   * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
   * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
   *
   * For more information, see [Amazon S3 Bucket
   * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
   * Guide* .
   */
  public fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
    cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
  }

  /**
   * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
   * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
   * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
   * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
   *
   * For more information, see [Amazon S3 Bucket
   * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
   * Guide* .
   */
  public fun bucketKeyEnabled(bucketKeyEnabled: IResolvable) {
    cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
  }

  /**
   * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply to
   * new objects in the bucket.
   * If a PUT Object request doesn't specify any server-side encryption, this default encryption
   * will be applied.
   */
  public fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable) {
    cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault)
  }

  /**
   * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply to
   * new objects in the bucket.
   * If a PUT Object request doesn't specify any server-side encryption, this default encryption
   * will be applied.
   */
  public
      fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: CfnBucket.ServerSideEncryptionByDefaultProperty) {
    cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault)
  }

  public fun build(): CfnBucket.ServerSideEncryptionRuleProperty = cdkBuilder.build()
}
