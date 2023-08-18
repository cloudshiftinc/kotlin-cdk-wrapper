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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * Represents the properties of a global secondary index.
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
 * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
 * .enabled(false)
 * .build())
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .readCapacityUnits(123)
 * .writeCapacityUnits(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html)
 */
@CdkDslMarker
public class CfnTableGlobalSecondaryIndexPropertyDsl {
    private val cdkBuilder: CfnTable.GlobalSecondaryIndexProperty.Builder =
        CfnTable.GlobalSecondaryIndexProperty.builder()

    private val _keySchema: MutableList<Any> = mutableListOf()

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     *   Contributor Insights for the specified global secondary index.
     */
    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     *   Contributor Insights for the specified global secondary index.
     */
    public fun contributorInsightsSpecification(
        contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty
    ) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

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
    public fun projection(projection: CfnTable.ProjectionProperty) {
        cdkBuilder.projection(projection)
    }

    /**
     * @param provisionedThroughput Represents the provisioned throughput settings for the specified
     *   global secondary index. For current minimum and maximum provisioned throughput values, see
     *   [Service, Account, and Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html)
     *   in the *Amazon DynamoDB Developer Guide* .
     */
    public fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    /**
     * @param provisionedThroughput Represents the provisioned throughput settings for the specified
     *   global secondary index. For current minimum and maximum provisioned throughput values, see
     *   [Service, Account, and Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html)
     *   in the *Amazon DynamoDB Developer Guide* .
     */
    public fun provisionedThroughput(
        provisionedThroughput: CfnTable.ProvisionedThroughputProperty
    ) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    public fun build(): CfnTable.GlobalSecondaryIndexProperty {
        if (_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
        return cdkBuilder.build()
    }
}
