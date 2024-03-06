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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.Capacity
import software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexPropsV2
import software.amazon.awscdk.services.dynamodb.ProjectionType

/**
 * Properties used to configure a global secondary index.
 *
 * Example:
 * ```
 * TableV2 table = TableV2.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .globalSecondaryIndexes(List.of(GlobalSecondaryIndexPropsV2.builder()
 * .indexName("gsi1")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .build()))
 * .build();
 * table.addGlobalSecondaryIndex(GlobalSecondaryIndexPropsV2.builder()
 * .indexName("gsi2")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .build());
 * ```
 */
@CdkDslMarker
public class GlobalSecondaryIndexPropsV2Dsl {
    private val cdkBuilder: GlobalSecondaryIndexPropsV2.Builder =
        GlobalSecondaryIndexPropsV2.builder()

    private val _nonKeyAttributes: MutableList<String> = mutableListOf()

    /** @param indexName The name of the secondary index. */
    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    public fun nonKeyAttributes(vararg nonKeyAttributes: String) {
        _nonKeyAttributes.addAll(listOf(*nonKeyAttributes))
    }

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    public fun nonKeyAttributes(nonKeyAttributes: Collection<String>) {
        _nonKeyAttributes.addAll(nonKeyAttributes)
    }

    /** @param partitionKey Partition key attribute definition. */
    public fun partitionKey(partitionKey: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(partitionKey)
        cdkBuilder.partitionKey(builder.build())
    }

    /** @param partitionKey Partition key attribute definition. */
    public fun partitionKey(partitionKey: Attribute) {
        cdkBuilder.partitionKey(partitionKey)
    }

    /** @param projectionType The set of attributes that are projected into the secondary index. */
    public fun projectionType(projectionType: ProjectionType) {
        cdkBuilder.projectionType(projectionType)
    }

    /**
     * @param readCapacity The read capacity. Note: This can only be configured if the primary table
     *   billing is provisioned.
     */
    public fun readCapacity(readCapacity: Capacity) {
        cdkBuilder.readCapacity(readCapacity)
    }

    /** @param sortKey Sort key attribute definition. */
    public fun sortKey(sortKey: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(sortKey)
        cdkBuilder.sortKey(builder.build())
    }

    /** @param sortKey Sort key attribute definition. */
    public fun sortKey(sortKey: Attribute) {
        cdkBuilder.sortKey(sortKey)
    }

    /**
     * @param writeCapacity The write capacity. Note: This can only be configured if the primary
     *   table billing is provisioned.
     */
    public fun writeCapacity(writeCapacity: Capacity) {
        cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): GlobalSecondaryIndexPropsV2 {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
