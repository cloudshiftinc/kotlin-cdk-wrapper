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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Allows you to specify a global secondary index for the global table.
 *
 * The index will be defined on all replicas.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * GlobalSecondaryIndexProperty globalSecondaryIndexProperty =
 * GlobalSecondaryIndexProperty.builder()
 * .indexName("indexName")
 * .keySchema(List.of(KeySchemaProperty.builder()
 * .attributeName("attributeName")
 * .keyType("keyType")
 * .build()))
 * .projection(ProjectionProperty.builder()
 * .nonKeyAttributes(List.of("nonKeyAttributes"))
 * .projectionType("projectionType")
 * .build())
 * // the properties below are optional
 * .writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty.builder()
 * .writeCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html)
 */
@CdkDslMarker
public class CfnGlobalTableGlobalSecondaryIndexPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.GlobalSecondaryIndexProperty.Builder =
        CfnGlobalTable.GlobalSecondaryIndexProperty.builder()

    private val _keySchema: MutableList<Any> = mutableListOf()

    /**
     * @param indexName The name of the global secondary index. The name must be unique among all
     *   other indexes on this table.
     */
    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    /**
     * @param keySchema The complete key schema for a global secondary index, which consists of one
     *   or more pairs of attribute names and key types: - `HASH` - partition key - `RANGE` - sort
     *   key &gt; The partition key of an item is also known as its *hash attribute* . The term
     *   "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly
     *   distribute data items across partitions, based on their partition key values.
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     */
    public fun keySchema(vararg keySchema: Any) {
        _keySchema.addAll(listOf(*keySchema))
    }

    /**
     * @param keySchema The complete key schema for a global secondary index, which consists of one
     *   or more pairs of attribute names and key types: - `HASH` - partition key - `RANGE` - sort
     *   key &gt; The partition key of an item is also known as its *hash attribute* . The term
     *   "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly
     *   distribute data items across partitions, based on their partition key values.
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     */
    public fun keySchema(keySchema: Collection<Any>) {
        _keySchema.addAll(keySchema)
    }

    /**
     * @param keySchema The complete key schema for a global secondary index, which consists of one
     *   or more pairs of attribute names and key types: - `HASH` - partition key - `RANGE` - sort
     *   key &gt; The partition key of an item is also known as its *hash attribute* . The term
     *   "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly
     *   distribute data items across partitions, based on their partition key values.
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     */
    public fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema)
    }

    /**
     * @param projection Represents attributes that are copied (projected) from the table into the
     *   global secondary index. These are in addition to the primary key attributes and index key
     *   attributes, which are automatically projected.
     */
    public fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection)
    }

    /**
     * @param projection Represents attributes that are copied (projected) from the table into the
     *   global secondary index. These are in addition to the primary key attributes and index key
     *   attributes, which are automatically projected.
     */
    public fun projection(projection: CfnGlobalTable.ProjectionProperty) {
        cdkBuilder.projection(projection)
    }

    /**
     * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
     *   secondary index. You must specify a value for this property if the table's `BillingMode` is
     *   `PROVISIONED` . All replicas will have the same write capacity settings for this global
     *   secondary index.
     */
    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    /**
     * @param writeProvisionedThroughputSettings Defines write capacity settings for the global
     *   secondary index. You must specify a value for this property if the table's `BillingMode` is
     *   `PROVISIONED` . All replicas will have the same write capacity settings for this global
     *   secondary index.
     */
    public fun writeProvisionedThroughputSettings(
        writeProvisionedThroughputSettings:
            CfnGlobalTable.WriteProvisionedThroughputSettingsProperty
    ) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    public fun build(): CfnGlobalTable.GlobalSecondaryIndexProperty {
        if (_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
        return cdkBuilder.build()
    }
}
