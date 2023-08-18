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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.ProjectionType

/**
 * Properties for a global secondary index.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * GlobalSecondaryIndexProps globalSecondaryIndexProps = GlobalSecondaryIndexProps.builder()
 * .indexName("indexName")
 * .partitionKey(Attribute.builder()
 * .name("name")
 * .type(AttributeType.BINARY)
 * .build())
 * // the properties below are optional
 * .nonKeyAttributes(List.of("nonKeyAttributes"))
 * .projectionType(ProjectionType.KEYS_ONLY)
 * .readCapacity(123)
 * .sortKey(Attribute.builder()
 * .name("name")
 * .type(AttributeType.BINARY)
 * .build())
 * .writeCapacity(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class GlobalSecondaryIndexPropsDsl {
    private val cdkBuilder: GlobalSecondaryIndexProps.Builder = GlobalSecondaryIndexProps.builder()

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
     * @param readCapacity The read capacity for the global secondary index. Can only be provided if
     *   table billingMode is Provisioned or undefined.
     */
    public fun readCapacity(readCapacity: Number) {
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
     * @param writeCapacity The write capacity for the global secondary index. Can only be provided
     *   if table billingMode is Provisioned or undefined.
     */
    public fun writeCapacity(writeCapacity: Number) {
        cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): GlobalSecondaryIndexProps {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
