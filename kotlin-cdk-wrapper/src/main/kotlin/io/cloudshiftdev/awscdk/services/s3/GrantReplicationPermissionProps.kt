@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit
import kotlin.collections.List

/**
 * The properties for the destination bucket for granting replication permission.
 *
 * Example:
 *
 * ```
 * IBucket destinationBucket1;
 * IBucket destinationBucket2;
 * IRole replicationRole;
 * IKey encryptionKey;
 * IKey destinationEncryptionKey;
 * Bucket sourceBucket = Bucket.Builder.create(this, "SourceBucket")
 * // Versioning must be enabled on both the source and destination bucket
 * .versioned(true)
 * // Optional. Specify the KMS key to use for encrypts objects in the source bucket.
 * .encryptionKey(encryptionKey)
 * // Optional. If not specified, a new role will be created.
 * .replicationRole(replicationRole)
 * .replicationRules(List.of(ReplicationRule.builder()
 * // The destination bucket for the replication rule.
 * .destination(destinationBucket1)
 * // The priority of the rule.
 * // Amazon S3 will attempt to replicate objects according to all replication rules.
 * // However, if there are two or more rules with the same destination bucket, then objects will be
 * replicated according to the rule with the highest priority.
 * // The higher the number, the higher the priority.
 * // It is essential to specify priority explicitly when the replication configuration has multiple
 * rules.
 * .priority(1)
 * .build(), ReplicationRule.builder()
 * .destination(destinationBucket2)
 * .priority(2)
 * // Whether to specify S3 Replication Time Control (S3 RTC).
 * // S3 RTC replicates most objects that you upload to Amazon S3 in seconds,
 * // and 99.99 percent of those objects within specified time.
 * .replicationTimeControl(ReplicationTimeValue.FIFTEEN_MINUTES)
 * // Whether to enable replication metrics about S3 RTC.
 * // If set, metrics will be output to indicate whether replication by S3 RTC took longer than the
 * configured time.
 * .metrics(ReplicationTimeValue.FIFTEEN_MINUTES)
 * // The kms key to use for the destination bucket.
 * .kmsKey(destinationEncryptionKey)
 * // The storage class to use for the destination bucket.
 * .storageClass(StorageClass.INFREQUENT_ACCESS)
 * // Whether to replicate objects with SSE-KMS encryption.
 * .sseKmsEncryptedObjects(false)
 * // Whether to replicate modifications on replicas.
 * .replicaModifications(true)
 * // Whether to replicate delete markers.
 * // This property cannot be enabled if the replication rule has a tag filter.
 * .deleteMarkerReplication(false)
 * // The ID of the rule.
 * .id("full-settings-rule")
 * // The object filter for the rule.
 * .filter(Filter.builder()
 * // The prefix filter for the rule.
 * .prefix("prefix")
 * // The tag filter for the rule.
 * .tags(List.of(Tag.builder()
 * .key("tagKey")
 * .value("tagValue")
 * .build()))
 * .build())
 * .build()))
 * .build();
 * // Grant permissions to the replication role.
 * // This method is not required if you choose to use an auto-generated replication role or
 * manually grant permissions.
 * sourceBucket.grantReplicationPermission(replicationRole,
 * GrantReplicationPermissionProps.builder()
 * // Optional. Specify the KMS key to use for decrypting objects in the source bucket.
 * .sourceDecryptionKey(encryptionKey)
 * .destinations(List.of(GrantReplicationPermissionDestinationProps.builder().bucket(destinationBucket1).build(),
 * GrantReplicationPermissionDestinationProps.builder().bucket(destinationBucket2).encryptionKey(destinationEncryptionKey).build()))
 * .build());
 * ```
 */
public interface GrantReplicationPermissionProps {
  /**
   * The destination buckets for replication.
   *
   * Specify the KMS key to use for encryption if a destination bucket needs to be encrypted with a
   * customer-managed KMS key.
   * One or more destination buckets are required if replication configuration is enabled (i.e.,
   * `replicationRole` is specified).
   *
   * Default: - empty array (valid only if the `replicationRole` property is NOT specified)
   */
  public fun destinations(): List<GrantReplicationPermissionDestinationProps>

  /**
   * The KMS key used to decrypt objects in the source bucket for replication.
   *
   * **Required if** the source bucket is encrypted with a customer-managed KMS key.
   *
   * Default: - it's assumed the source bucket is not encrypted with a customer-managed KMS key.
   */
  public fun sourceDecryptionKey(): IKey? = unwrap(this).getSourceDecryptionKey()?.let(IKey::wrap)

  /**
   * A builder for [GrantReplicationPermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinations The destination buckets for replication. 
     * Specify the KMS key to use for encryption if a destination bucket needs to be encrypted with
     * a customer-managed KMS key.
     * One or more destination buckets are required if replication configuration is enabled (i.e.,
     * `replicationRole` is specified).
     */
    public fun destinations(destinations: List<GrantReplicationPermissionDestinationProps>)

    /**
     * @param destinations The destination buckets for replication. 
     * Specify the KMS key to use for encryption if a destination bucket needs to be encrypted with
     * a customer-managed KMS key.
     * One or more destination buckets are required if replication configuration is enabled (i.e.,
     * `replicationRole` is specified).
     */
    public fun destinations(vararg destinations: GrantReplicationPermissionDestinationProps)

    /**
     * @param sourceDecryptionKey The KMS key used to decrypt objects in the source bucket for
     * replication.
     * **Required if** the source bucket is encrypted with a customer-managed KMS key.
     */
    public fun sourceDecryptionKey(sourceDecryptionKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.GrantReplicationPermissionProps.Builder =
        software.amazon.awscdk.services.s3.GrantReplicationPermissionProps.builder()

    /**
     * @param destinations The destination buckets for replication. 
     * Specify the KMS key to use for encryption if a destination bucket needs to be encrypted with
     * a customer-managed KMS key.
     * One or more destination buckets are required if replication configuration is enabled (i.e.,
     * `replicationRole` is specified).
     */
    override fun destinations(destinations: List<GrantReplicationPermissionDestinationProps>) {
      cdkBuilder.destinations(destinations.map(GrantReplicationPermissionDestinationProps.Companion::unwrap))
    }

    /**
     * @param destinations The destination buckets for replication. 
     * Specify the KMS key to use for encryption if a destination bucket needs to be encrypted with
     * a customer-managed KMS key.
     * One or more destination buckets are required if replication configuration is enabled (i.e.,
     * `replicationRole` is specified).
     */
    override fun destinations(vararg destinations: GrantReplicationPermissionDestinationProps): Unit
        = destinations(destinations.toList())

    /**
     * @param sourceDecryptionKey The KMS key used to decrypt objects in the source bucket for
     * replication.
     * **Required if** the source bucket is encrypted with a customer-managed KMS key.
     */
    override fun sourceDecryptionKey(sourceDecryptionKey: IKey) {
      cdkBuilder.sourceDecryptionKey(sourceDecryptionKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.GrantReplicationPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.GrantReplicationPermissionProps,
  ) : CdkObject(cdkObject),
      GrantReplicationPermissionProps {
    /**
     * The destination buckets for replication.
     *
     * Specify the KMS key to use for encryption if a destination bucket needs to be encrypted with
     * a customer-managed KMS key.
     * One or more destination buckets are required if replication configuration is enabled (i.e.,
     * `replicationRole` is specified).
     *
     * Default: - empty array (valid only if the `replicationRole` property is NOT specified)
     */
    override fun destinations(): List<GrantReplicationPermissionDestinationProps> =
        unwrap(this).getDestinations().map(GrantReplicationPermissionDestinationProps::wrap)

    /**
     * The KMS key used to decrypt objects in the source bucket for replication.
     *
     * **Required if** the source bucket is encrypted with a customer-managed KMS key.
     *
     * Default: - it's assumed the source bucket is not encrypted with a customer-managed KMS key.
     */
    override fun sourceDecryptionKey(): IKey? =
        unwrap(this).getSourceDecryptionKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrantReplicationPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.GrantReplicationPermissionProps):
        GrantReplicationPermissionProps = CdkObjectWrappers.wrap(cdkObject) as?
        GrantReplicationPermissionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantReplicationPermissionProps):
        software.amazon.awscdk.services.s3.GrantReplicationPermissionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.GrantReplicationPermissionProps
  }
}
