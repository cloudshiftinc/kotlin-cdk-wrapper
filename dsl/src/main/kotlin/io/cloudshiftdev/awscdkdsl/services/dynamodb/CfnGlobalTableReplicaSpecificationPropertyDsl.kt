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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Defines settings specific to a single replica of a global table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * ReplicaSpecificationProperty replicaSpecificationProperty =
 * ReplicaSpecificationProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
 * .enabled(false)
 * .build())
 * .deletionProtectionEnabled(false)
 * .globalSecondaryIndexes(List.of(ReplicaGlobalSecondaryIndexSpecificationProperty.builder()
 * .indexName("indexName")
 * // the properties below are optional
 * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
 * .enabled(false)
 * .build())
 * .readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty.builder()
 * .readCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build())
 * .readCapacityUnits(123)
 * .build())
 * .build()))
 * .kinesisStreamSpecification(KinesisStreamSpecificationProperty.builder()
 * .streamArn("streamArn")
 * .build())
 * .pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty.builder()
 * .pointInTimeRecoveryEnabled(false)
 * .build())
 * .readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty.builder()
 * .readCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build())
 * .readCapacityUnits(123)
 * .build())
 * .sseSpecification(ReplicaSSESpecificationProperty.builder()
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .build())
 * .tableClass("tableClass")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html)
 */
@CdkDslMarker
public class CfnGlobalTableReplicaSpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.ReplicaSpecificationProperty.Builder =
        CfnGlobalTable.ReplicaSpecificationProperty.builder()

    private val _globalSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     *   Contributor Insights for the specified replica. When not specified, defaults to contributor
     *   insights disabled for the replica.
     */
    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     *   Contributor Insights for the specified replica. When not specified, defaults to contributor
     *   insights disabled for the replica.
     */
    public fun contributorInsightsSpecification(
        contributorInsightsSpecification: CfnGlobalTable.ContributorInsightsSpecificationProperty
    ) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

    /**
     * @param deletionProtectionEnabled Determines if a replica is protected from deletion. When
     *   enabled, the table cannot be deleted by any user or process. This setting is disabled by
     *   default. For more information, see
     *   [Using deletion protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     *   in the *Amazon DynamoDB Developer Guide* .
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * @param deletionProtectionEnabled Determines if a replica is protected from deletion. When
     *   enabled, the table cannot be deleted by any user or process. This setting is disabled by
     *   default. For more information, see
     *   [Using deletion protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     *   in the *Amazon DynamoDB Developer Guide* .
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes of
     *   this replica.
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any) {
        _globalSecondaryIndexes.addAll(listOf(*globalSecondaryIndexes))
    }

    /**
     * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes of
     *   this replica.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: Collection<Any>) {
        _globalSecondaryIndexes.addAll(globalSecondaryIndexes)
    }

    /**
     * @param globalSecondaryIndexes Defines additional settings for the global secondary indexes of
     *   this replica.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    /**
     * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
     *   specified replica.
     */
    public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
    }

    /**
     * @param kinesisStreamSpecification Defines the Kinesis Data Streams configuration for the
     *   specified replica.
     */
    public fun kinesisStreamSpecification(
        kinesisStreamSpecification: CfnGlobalTable.KinesisStreamSpecificationProperty
    ) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
    }

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     *   When not specified, defaults to point in time recovery disabled for the replica.
     */
    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
    }

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     *   When not specified, defaults to point in time recovery disabled for the replica.
     */
    public fun pointInTimeRecoverySpecification(
        pointInTimeRecoverySpecification: CfnGlobalTable.PointInTimeRecoverySpecificationProperty
    ) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
    }

    /**
     * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
     *   table.
     */
    public fun readProvisionedThroughputSettings(readProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
    }

    /**
     * @param readProvisionedThroughputSettings Defines read capacity settings for the replica
     *   table.
     */
    public fun readProvisionedThroughputSettings(
        readProvisionedThroughputSettings: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty
    ) {
        cdkBuilder.readProvisionedThroughputSettings(readProvisionedThroughputSettings)
    }

    /** @param region The region in which this replica exists. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param sseSpecification Allows you to specify a customer-managed key for the replica. When
     *   using customer-managed keys for server-side encryption, this property must have a value in
     *   all replicas.
     */
    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * @param sseSpecification Allows you to specify a customer-managed key for the replica. When
     *   using customer-managed keys for server-side encryption, this property must have a value in
     *   all replicas.
     */
    public fun sseSpecification(sseSpecification: CfnGlobalTable.ReplicaSSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * @param tableClass The table class of the specified table. Valid values are `STANDARD` and
     *   `STANDARD_INFREQUENT_ACCESS` .
     */
    public fun tableClass(tableClass: String) {
        cdkBuilder.tableClass(tableClass)
    }

    /**
     * @param tags An array of key-value pairs to apply to this replica. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this replica. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGlobalTable.ReplicaSpecificationProperty {
        if (_globalSecondaryIndexes.isNotEmpty())
            cdkBuilder.globalSecondaryIndexes(_globalSecondaryIndexes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
