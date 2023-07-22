@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies which Amazon S3 objects to replicate and where to store the replicas.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplicationRuleProperty replicationRuleProperty = ReplicationRuleProperty.builder()
 * .destination(ReplicationDestinationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .accessControlTranslation(AccessControlTranslationProperty.builder()
 * .owner("owner")
 * .build())
 * .account("account")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .replicaKmsKeyId("replicaKmsKeyId")
 * .build())
 * .metrics(MetricsProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .eventThreshold(ReplicationTimeValueProperty.builder()
 * .minutes(123)
 * .build())
 * .build())
 * .replicationTime(ReplicationTimeProperty.builder()
 * .status("status")
 * .time(ReplicationTimeValueProperty.builder()
 * .minutes(123)
 * .build())
 * .build())
 * .storageClass("storageClass")
 * .build())
 * .status("status")
 * // the properties below are optional
 * .deleteMarkerReplication(DeleteMarkerReplicationProperty.builder()
 * .status("status")
 * .build())
 * .filter(ReplicationRuleFilterProperty.builder()
 * .and(ReplicationRuleAndOperatorProperty.builder()
 * .prefix("prefix")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .prefix("prefix")
 * .tagFilter(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build())
 * .build())
 * .id("id")
 * .prefix("prefix")
 * .priority(123)
 * .sourceSelectionCriteria(SourceSelectionCriteriaProperty.builder()
 * .replicaModifications(ReplicaModificationsProperty.builder()
 * .status("status")
 * .build())
 * .sseKmsEncryptedObjects(SseKmsEncryptedObjectsProperty.builder()
 * .status("status")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html)
 */
@CdkDslMarker
public class CfnBucketReplicationRulePropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationRuleProperty.Builder =
      CfnBucket.ReplicationRuleProperty.builder()

  /**
   * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
   * If you specify a `Filter` in your replication configuration, you must also include a
   * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
   * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
   * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
   * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
   * .
   *
   * For more information about delete marker replication, see [Basic Rule
   * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html) .
   *
   *
   * If you are using an earlier version of the replication configuration, Amazon S3 handles
   * replication of delete markers differently. For more information, see [Backward
   * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
   * .
   */
  public fun deleteMarkerReplication(deleteMarkerReplication: IResolvable) {
    cdkBuilder.deleteMarkerReplication(deleteMarkerReplication)
  }

  /**
   * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
   * If you specify a `Filter` in your replication configuration, you must also include a
   * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
   * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
   * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
   * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
   * .
   *
   * For more information about delete marker replication, see [Basic Rule
   * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html) .
   *
   *
   * If you are using an earlier version of the replication configuration, Amazon S3 handles
   * replication of delete markers differently. For more information, see [Backward
   * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
   * .
   */
  public
      fun deleteMarkerReplication(deleteMarkerReplication: CfnBucket.DeleteMarkerReplicationProperty) {
    cdkBuilder.deleteMarkerReplication(deleteMarkerReplication)
  }

  /**
   * @param destination A container for information about the replication destination and its
   * configurations including enabling the S3 Replication Time Control (S3 RTC). 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination A container for information about the replication destination and its
   * configurations including enabling the S3 Replication Time Control (S3 RTC). 
   */
  public fun destination(destination: CfnBucket.ReplicationDestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param filter A filter that identifies the subset of objects to which the replication rule
   * applies.
   * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The use
   * of the filter field indicates that this is a V2 replication configuration. This field isn't
   * supported in a V1 replication configuration.
   *
   *
   * V1 replication configuration only supports filtering by key prefix. To filter using a V1
   * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filter A filter that identifies the subset of objects to which the replication rule
   * applies.
   * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The use
   * of the filter field indicates that this is a V2 replication configuration. This field isn't
   * supported in a V1 replication configuration.
   *
   *
   * V1 replication configuration only supports filtering by key prefix. To filter using a V1
   * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
   */
  public fun filter(filter: CfnBucket.ReplicationRuleFilterProperty) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param id A unique identifier for the rule.
   * The maximum value is 255 characters. If you don't specify a value, AWS CloudFormation generates
   * a random ID. When using a V2 replication configuration this property is capitalized as "ID".
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param prefix An object key name prefix that identifies the object or objects to which the rule
   * applies.
   * The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify an
   * empty string. To filter using a V1 replication configuration, add the `Prefix` directly as a child
   * element of the `Rule` element.
   *
   *
   * Replacement must be made for object keys containing special characters (such as carriage
   * returns) when using XML requests. For more information, see [XML related object key
   * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
   * .
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param priority The priority indicates which rule has precedence whenever two or more
   * replication rules conflict.
   * Amazon S3 will attempt to replicate objects according to all replication rules. However, if
   * there are two or more rules with the same destination bucket, then objects will be replicated
   * according to the rule with the highest priority. The higher the number, the higher the priority.
   *
   * For more information, see
   * [Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html) in the *Amazon S3
   * User Guide* .
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param sourceSelectionCriteria A container that describes additional filters for identifying
   * the source objects that you want to replicate.
   * You can choose to enable or disable the replication of these objects.
   */
  public fun sourceSelectionCriteria(sourceSelectionCriteria: IResolvable) {
    cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria)
  }

  /**
   * @param sourceSelectionCriteria A container that describes additional filters for identifying
   * the source objects that you want to replicate.
   * You can choose to enable or disable the replication of these objects.
   */
  public
      fun sourceSelectionCriteria(sourceSelectionCriteria: CfnBucket.SourceSelectionCriteriaProperty) {
    cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria)
  }

  /**
   * @param status Specifies whether the rule is enabled. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnBucket.ReplicationRuleProperty = cdkBuilder.build()
}
