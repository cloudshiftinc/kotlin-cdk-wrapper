@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
 * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with KMS-managed
 * keys (DSSE-KMS).
 *
 * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default Encryption
 * for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the
 * *Amazon S3 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * BucketEncryptionProperty bucketEncryptionProperty = BucketEncryptionProperty.builder()
 * .serverSideEncryptionConfiguration(List.of(ServerSideEncryptionRuleProperty.builder()
 * .bucketKeyEnabled(false)
 * .serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty.builder()
 * .sseAlgorithm("sseAlgorithm")
 * // the properties below are optional
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html)
 */
@CdkDslMarker
public class CfnBucketBucketEncryptionPropertyDsl {
  private val cdkBuilder: CfnBucket.BucketEncryptionProperty.Builder =
      CfnBucket.BucketEncryptionProperty.builder()

  private val _serverSideEncryptionConfiguration: MutableList<Any> = mutableListOf()

  /**
   * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
   * configuration. 
   */
  public fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any) {
    _serverSideEncryptionConfiguration.addAll(listOf(*serverSideEncryptionConfiguration))
  }

  /**
   * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
   * configuration. 
   */
  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: Collection<Any>) {
    _serverSideEncryptionConfiguration.addAll(serverSideEncryptionConfiguration)
  }

  /**
   * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
   * configuration. 
   */
  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public fun build(): CfnBucket.BucketEncryptionProperty {
    if(_serverSideEncryptionConfiguration.isNotEmpty())
        cdkBuilder.serverSideEncryptionConfiguration(_serverSideEncryptionConfiguration)
    return cdkBuilder.build()
  }
}
