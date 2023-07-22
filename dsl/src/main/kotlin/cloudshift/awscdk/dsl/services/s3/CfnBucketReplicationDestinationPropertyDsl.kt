@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketReplicationDestinationPropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationDestinationProperty.Builder =
      CfnBucket.ReplicationDestinationProperty.builder()

  /**
   * @param accessControlTranslation Specify this only in a cross-account scenario (where source and
   * destination bucket owners are not the same), and you want to change replica ownership to the AWS
   * account that owns the destination bucket.
   * If this is not specified in the replication configuration, the replicas are owned by same AWS
   * account that owns the source object.
   */
  public fun accessControlTranslation(accessControlTranslation: IResolvable) {
    cdkBuilder.accessControlTranslation(accessControlTranslation)
  }

  /**
   * @param accessControlTranslation Specify this only in a cross-account scenario (where source and
   * destination bucket owners are not the same), and you want to change replica ownership to the AWS
   * account that owns the destination bucket.
   * If this is not specified in the replication configuration, the replicas are owned by same AWS
   * account that owns the source object.
   */
  public
      fun accessControlTranslation(accessControlTranslation: CfnBucket.AccessControlTranslationProperty) {
    cdkBuilder.accessControlTranslation(accessControlTranslation)
  }

  /**
   * @param account Destination bucket owner account ID.
   * In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the AWS
   * account that owns the destination bucket by specifying the `AccessControlTranslation` property,
   * this is the account ID of the destination bucket owner. For more information, see [Cross-Region
   * Replication Additional Configuration: Change Replica
   * Owner](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr-change-owner.html) in the *Amazon S3
   * User Guide* .
   *
   * If you specify the `AccessControlTranslation` property, the `Account` property is required.
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param bucket The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store
   * the results. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param encryptionConfiguration Specifies encryption-related information.
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param encryptionConfiguration Specifies encryption-related information.
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnBucket.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param metrics A container specifying replication metrics-related settings enabling replication
   * metrics and events.
   */
  public fun metrics(metrics: IResolvable) {
    cdkBuilder.metrics(metrics)
  }

  /**
   * @param metrics A container specifying replication metrics-related settings enabling replication
   * metrics and events.
   */
  public fun metrics(metrics: CfnBucket.MetricsProperty) {
    cdkBuilder.metrics(metrics)
  }

  /**
   * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC), including
   * whether S3 RTC is enabled and the time when all objects and operations on objects must be
   * replicated.
   * Must be specified together with a `Metrics` block.
   */
  public fun replicationTime(replicationTime: IResolvable) {
    cdkBuilder.replicationTime(replicationTime)
  }

  /**
   * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC), including
   * whether S3 RTC is enabled and the time when all objects and operations on objects must be
   * replicated.
   * Must be specified together with a `Metrics` block.
   */
  public fun replicationTime(replicationTime: CfnBucket.ReplicationTimeProperty) {
    cdkBuilder.replicationTime(replicationTime)
  }

  /**
   * @param storageClass The storage class to use when replicating objects, such as S3 Standard or
   * reduced redundancy.
   * By default, Amazon S3 uses the storage class of the source object to create the object replica.
   *
   * For valid values, see the `StorageClass` element of the [PUT Bucket
   * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) action
   * in the *Amazon S3 API Reference* .
   */
  public fun storageClass(storageClass: String) {
    cdkBuilder.storageClass(storageClass)
  }

  public fun build(): CfnBucket.ReplicationDestinationProperty = cdkBuilder.build()
}
