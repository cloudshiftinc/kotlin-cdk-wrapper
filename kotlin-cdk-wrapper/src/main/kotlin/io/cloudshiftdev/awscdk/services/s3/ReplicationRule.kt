@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Specifies which Amazon S3 objects to replicate and where to store the replicas.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * Key key;
 * ReplicationTimeValue replicationTimeValue;
 * StorageClass storageClass;
 * ReplicationRule replicationRule = ReplicationRule.builder()
 * .destination(bucket)
 * // the properties below are optional
 * .accessControlTransition(false)
 * .deleteMarkerReplication(false)
 * .filter(Filter.builder()
 * .prefix("prefix")
 * .tags(List.of(Tag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .id("id")
 * .kmsKey(key)
 * .metrics(replicationTimeValue)
 * .priority(123)
 * .replicaModifications(false)
 * .replicationTimeControl(replicationTimeValue)
 * .sseKmsEncryptedObjects(false)
 * .storageClass(storageClass)
 * .build();
 * ```
 */
public interface ReplicationRule {
  /**
   * Whether to want to change replica ownership to the AWS account that owns the destination
   * bucket.
   *
   * This can only be specified if the source bucket and the destination bucket are not in the same
   * AWS account.
   *
   * Default: - The replicas are owned by same AWS account that owns the source object
   */
  public fun accessControlTransition(): Boolean? = unwrap(this).getAccessControlTransition()

  /**
   * Specifies whether Amazon S3 replicates delete markers.
   *
   * Default: - delete markers in source bucket is not replicated to destination bucket
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/delete-marker-replication.html)
   */
  public fun deleteMarkerReplication(): Boolean? = unwrap(this).getDeleteMarkerReplication()

  /**
   * The destination bucket for the replicated objects.
   *
   * The destination can be either in the same AWS account or a cross account.
   *
   * If you want to configure cross-account replication,
   * the destination bucket must have a policy that allows the source bucket to replicate objects to
   * it.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-walkthrough-2.html)
   */
  public fun destination(): IBucket

  /**
   * A filter that identifies the subset of objects to which the replication rule applies.
   *
   * Default: - applies to all objects
   */
  public fun filter(): Filter? = unwrap(this).getFilter()?.let(Filter::wrap)

  /**
   * A unique identifier for the rule.
   *
   * The maximum value is 255 characters.
   *
   * Default: - auto generated random ID
   */
  public fun id(): String? = unwrap(this).getId()

  /**
   * The customer managed AWS KMS key stored in AWS Key Management Service (KMS) for the destination
   * bucket.
   *
   * Amazon S3 uses this key to encrypt replica objects.
   *
   * Amazon S3 only supports symmetric encryption KMS keys.
   *
   * Default: - Amazon S3 uses the AWS managed KMS key for encryption
   *
   * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html)
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * A container specifying replication metrics-related settings enabling replication metrics and
   * events.
   *
   * When a value is set, metrics will be output to indicate whether the replication took longer
   * than the specified time.
   *
   * Default: - Replication metrics are not enabled
   */
  public fun metrics(): ReplicationTimeValue? =
      unwrap(this).getMetrics()?.let(ReplicationTimeValue::wrap)

  /**
   * The priority indicates which rule has precedence whenever two or more replication rules
   * conflict.
   *
   * Amazon S3 will attempt to replicate objects according to all replication rules.
   * However, if there are two or more rules with the same destination bucket,
   * then objects will be replicated according to the rule with the highest priority.
   *
   * The higher the number, the higher the priority.
   *
   * It is essential to specify priority explicitly when the replication configuration has multiple
   * rules.
   *
   * Default: 0
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * Specifies whether Amazon S3 replicates modifications on replicas.
   *
   * Default: false
   */
  public fun replicaModifications(): Boolean? = unwrap(this).getReplicaModifications()

  /**
   * Specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the
   * time when all objects and operations on objects must be replicated.
   *
   * Default: - S3 Replication Time Control is not enabled
   */
  public fun replicationTimeControl(): ReplicationTimeValue? =
      unwrap(this).getReplicationTimeControl()?.let(ReplicationTimeValue::wrap)

  /**
   * Specifies whether Amazon S3 replicates objects created with server-side encryption using an AWS
   * KMS key stored in AWS Key Management Service.
   *
   * Default: false
   */
  public fun sseKmsEncryptedObjects(): Boolean? = unwrap(this).getSseKmsEncryptedObjects()

  /**
   * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
   *
   * Default: - The storage class of the source object
   */
  public fun storageClass(): StorageClass? = unwrap(this).getStorageClass()?.let(StorageClass::wrap)

  /**
   * A builder for [ReplicationRule]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControlTransition Whether to want to change replica ownership to the AWS account
     * that owns the destination bucket.
     * This can only be specified if the source bucket and the destination bucket are not in the
     * same AWS account.
     */
    public fun accessControlTransition(accessControlTransition: Boolean)

    /**
     * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
     */
    public fun deleteMarkerReplication(deleteMarkerReplication: Boolean)

    /**
     * @param destination The destination bucket for the replicated objects. 
     * The destination can be either in the same AWS account or a cross account.
     *
     * If you want to configure cross-account replication,
     * the destination bucket must have a policy that allows the source bucket to replicate objects
     * to it.
     */
    public fun destination(destination: IBucket)

    /**
     * @param filter A filter that identifies the subset of objects to which the replication rule
     * applies.
     */
    public fun filter(filter: Filter)

    /**
     * @param filter A filter that identifies the subset of objects to which the replication rule
     * applies.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("099137d66f41b764bf2ebf6d4e7007b47dd2f54bcd74329a365c818d72309083")
    public fun filter(filter: Filter.Builder.() -> Unit)

    /**
     * @param id A unique identifier for the rule.
     * The maximum value is 255 characters.
     */
    public fun id(id: String)

    /**
     * @param kmsKey The customer managed AWS KMS key stored in AWS Key Management Service (KMS) for
     * the destination bucket.
     * Amazon S3 uses this key to encrypt replica objects.
     *
     * Amazon S3 only supports symmetric encryption KMS keys.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param metrics A container specifying replication metrics-related settings enabling
     * replication metrics and events.
     * When a value is set, metrics will be output to indicate whether the replication took longer
     * than the specified time.
     */
    public fun metrics(metrics: ReplicationTimeValue)

    /**
     * @param priority The priority indicates which rule has precedence whenever two or more
     * replication rules conflict.
     * Amazon S3 will attempt to replicate objects according to all replication rules.
     * However, if there are two or more rules with the same destination bucket,
     * then objects will be replicated according to the rule with the highest priority.
     *
     * The higher the number, the higher the priority.
     *
     * It is essential to specify priority explicitly when the replication configuration has
     * multiple rules.
     */
    public fun priority(priority: Number)

    /**
     * @param replicaModifications Specifies whether Amazon S3 replicates modifications on replicas.
     */
    public fun replicaModifications(replicaModifications: Boolean)

    /**
     * @param replicationTimeControl Specifying S3 Replication Time Control (S3 RTC), including
     * whether S3 RTC is enabled and the time when all objects and operations on objects must be
     * replicated.
     */
    public fun replicationTimeControl(replicationTimeControl: ReplicationTimeValue)

    /**
     * @param sseKmsEncryptedObjects Specifies whether Amazon S3 replicates objects created with
     * server-side encryption using an AWS KMS key stored in AWS Key Management Service.
     */
    public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: Boolean)

    /**
     * @param storageClass The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy.
     */
    public fun storageClass(storageClass: StorageClass)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.ReplicationRule.Builder =
        software.amazon.awscdk.services.s3.ReplicationRule.builder()

    /**
     * @param accessControlTransition Whether to want to change replica ownership to the AWS account
     * that owns the destination bucket.
     * This can only be specified if the source bucket and the destination bucket are not in the
     * same AWS account.
     */
    override fun accessControlTransition(accessControlTransition: Boolean) {
      cdkBuilder.accessControlTransition(accessControlTransition)
    }

    /**
     * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
     */
    override fun deleteMarkerReplication(deleteMarkerReplication: Boolean) {
      cdkBuilder.deleteMarkerReplication(deleteMarkerReplication)
    }

    /**
     * @param destination The destination bucket for the replicated objects. 
     * The destination can be either in the same AWS account or a cross account.
     *
     * If you want to configure cross-account replication,
     * the destination bucket must have a policy that allows the source bucket to replicate objects
     * to it.
     */
    override fun destination(destination: IBucket) {
      cdkBuilder.destination(destination.let(IBucket.Companion::unwrap))
    }

    /**
     * @param filter A filter that identifies the subset of objects to which the replication rule
     * applies.
     */
    override fun filter(filter: Filter) {
      cdkBuilder.filter(filter.let(Filter.Companion::unwrap))
    }

    /**
     * @param filter A filter that identifies the subset of objects to which the replication rule
     * applies.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("099137d66f41b764bf2ebf6d4e7007b47dd2f54bcd74329a365c818d72309083")
    override fun filter(filter: Filter.Builder.() -> Unit): Unit = filter(Filter(filter))

    /**
     * @param id A unique identifier for the rule.
     * The maximum value is 255 characters.
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param kmsKey The customer managed AWS KMS key stored in AWS Key Management Service (KMS) for
     * the destination bucket.
     * Amazon S3 uses this key to encrypt replica objects.
     *
     * Amazon S3 only supports symmetric encryption KMS keys.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param metrics A container specifying replication metrics-related settings enabling
     * replication metrics and events.
     * When a value is set, metrics will be output to indicate whether the replication took longer
     * than the specified time.
     */
    override fun metrics(metrics: ReplicationTimeValue) {
      cdkBuilder.metrics(metrics.let(ReplicationTimeValue.Companion::unwrap))
    }

    /**
     * @param priority The priority indicates which rule has precedence whenever two or more
     * replication rules conflict.
     * Amazon S3 will attempt to replicate objects according to all replication rules.
     * However, if there are two or more rules with the same destination bucket,
     * then objects will be replicated according to the rule with the highest priority.
     *
     * The higher the number, the higher the priority.
     *
     * It is essential to specify priority explicitly when the replication configuration has
     * multiple rules.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param replicaModifications Specifies whether Amazon S3 replicates modifications on replicas.
     */
    override fun replicaModifications(replicaModifications: Boolean) {
      cdkBuilder.replicaModifications(replicaModifications)
    }

    /**
     * @param replicationTimeControl Specifying S3 Replication Time Control (S3 RTC), including
     * whether S3 RTC is enabled and the time when all objects and operations on objects must be
     * replicated.
     */
    override fun replicationTimeControl(replicationTimeControl: ReplicationTimeValue) {
      cdkBuilder.replicationTimeControl(replicationTimeControl.let(ReplicationTimeValue.Companion::unwrap))
    }

    /**
     * @param sseKmsEncryptedObjects Specifies whether Amazon S3 replicates objects created with
     * server-side encryption using an AWS KMS key stored in AWS Key Management Service.
     */
    override fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: Boolean) {
      cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects)
    }

    /**
     * @param storageClass The storage class to use when replicating objects, such as S3 Standard or
     * reduced redundancy.
     */
    override fun storageClass(storageClass: StorageClass) {
      cdkBuilder.storageClass(storageClass.let(StorageClass.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.ReplicationRule = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.ReplicationRule,
  ) : CdkObject(cdkObject),
      ReplicationRule {
    /**
     * Whether to want to change replica ownership to the AWS account that owns the destination
     * bucket.
     *
     * This can only be specified if the source bucket and the destination bucket are not in the
     * same AWS account.
     *
     * Default: - The replicas are owned by same AWS account that owns the source object
     */
    override fun accessControlTransition(): Boolean? = unwrap(this).getAccessControlTransition()

    /**
     * Specifies whether Amazon S3 replicates delete markers.
     *
     * Default: - delete markers in source bucket is not replicated to destination bucket
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/delete-marker-replication.html)
     */
    override fun deleteMarkerReplication(): Boolean? = unwrap(this).getDeleteMarkerReplication()

    /**
     * The destination bucket for the replicated objects.
     *
     * The destination can be either in the same AWS account or a cross account.
     *
     * If you want to configure cross-account replication,
     * the destination bucket must have a policy that allows the source bucket to replicate objects
     * to it.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication-walkthrough-2.html)
     */
    override fun destination(): IBucket = unwrap(this).getDestination().let(IBucket::wrap)

    /**
     * A filter that identifies the subset of objects to which the replication rule applies.
     *
     * Default: - applies to all objects
     */
    override fun filter(): Filter? = unwrap(this).getFilter()?.let(Filter::wrap)

    /**
     * A unique identifier for the rule.
     *
     * The maximum value is 255 characters.
     *
     * Default: - auto generated random ID
     */
    override fun id(): String? = unwrap(this).getId()

    /**
     * The customer managed AWS KMS key stored in AWS Key Management Service (KMS) for the
     * destination bucket.
     *
     * Amazon S3 uses this key to encrypt replica objects.
     *
     * Amazon S3 only supports symmetric encryption KMS keys.
     *
     * Default: - Amazon S3 uses the AWS managed KMS key for encryption
     *
     * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html)
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * A container specifying replication metrics-related settings enabling replication metrics and
     * events.
     *
     * When a value is set, metrics will be output to indicate whether the replication took longer
     * than the specified time.
     *
     * Default: - Replication metrics are not enabled
     */
    override fun metrics(): ReplicationTimeValue? =
        unwrap(this).getMetrics()?.let(ReplicationTimeValue::wrap)

    /**
     * The priority indicates which rule has precedence whenever two or more replication rules
     * conflict.
     *
     * Amazon S3 will attempt to replicate objects according to all replication rules.
     * However, if there are two or more rules with the same destination bucket,
     * then objects will be replicated according to the rule with the highest priority.
     *
     * The higher the number, the higher the priority.
     *
     * It is essential to specify priority explicitly when the replication configuration has
     * multiple rules.
     *
     * Default: 0
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * Specifies whether Amazon S3 replicates modifications on replicas.
     *
     * Default: false
     */
    override fun replicaModifications(): Boolean? = unwrap(this).getReplicaModifications()

    /**
     * Specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the
     * time when all objects and operations on objects must be replicated.
     *
     * Default: - S3 Replication Time Control is not enabled
     */
    override fun replicationTimeControl(): ReplicationTimeValue? =
        unwrap(this).getReplicationTimeControl()?.let(ReplicationTimeValue::wrap)

    /**
     * Specifies whether Amazon S3 replicates objects created with server-side encryption using an
     * AWS KMS key stored in AWS Key Management Service.
     *
     * Default: false
     */
    override fun sseKmsEncryptedObjects(): Boolean? = unwrap(this).getSseKmsEncryptedObjects()

    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     *
     * Default: - The storage class of the source object
     */
    override fun storageClass(): StorageClass? =
        unwrap(this).getStorageClass()?.let(StorageClass::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ReplicationRule):
        ReplicationRule = CdkObjectWrappers.wrap(cdkObject) as? ReplicationRule ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicationRule):
        software.amazon.awscdk.services.s3.ReplicationRule = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.ReplicationRule
  }
}
