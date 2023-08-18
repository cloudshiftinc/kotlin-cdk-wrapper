@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container for replication rules.
 *
 * You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplicationConfigurationProperty replicationConfigurationProperty =
 * ReplicationConfigurationProperty.builder()
 * .role("role")
 * .rules(List.of(ReplicationRuleProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketReplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicationConfigurationProperty.Builder =
        CfnBucket.ReplicationConfigurationProperty.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    /**
     * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
     *   role that Amazon S3 assumes when replicating objects. For more information, see
     *   [How to Set Up Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * @param rules A container for one or more replication rules. A replication configuration must
     *   have at least one rule and can contain a maximum of 1,000 rules.
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * @param rules A container for one or more replication rules. A replication configuration must
     *   have at least one rule and can contain a maximum of 1,000 rules.
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * @param rules A container for one or more replication rules. A replication configuration must
     *   have at least one rule and can contain a maximum of 1,000 rules.
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnBucket.ReplicationConfigurationProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
