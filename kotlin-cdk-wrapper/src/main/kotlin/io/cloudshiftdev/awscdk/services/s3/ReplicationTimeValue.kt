@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number

/**
 * The replication time value used for S3 Replication Time Control (S3 RTC).
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
public open class ReplicationTimeValue(
  cdkObject: software.amazon.awscdk.services.s3.ReplicationTimeValue,
) : CdkObject(cdkObject) {
  /**
   * the time in minutes.
   */
  public open fun minutes(): Number = unwrap(this).getMinutes()

  public companion object {
    public val FIFTEEN_MINUTES: ReplicationTimeValue =
        ReplicationTimeValue.wrap(software.amazon.awscdk.services.s3.ReplicationTimeValue.FIFTEEN_MINUTES)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ReplicationTimeValue):
        ReplicationTimeValue = ReplicationTimeValue(cdkObject)

    internal fun unwrap(wrapped: ReplicationTimeValue):
        software.amazon.awscdk.services.s3.ReplicationTimeValue = wrapped.cdkObject as
        software.amazon.awscdk.services.s3.ReplicationTimeValue
  }
}
