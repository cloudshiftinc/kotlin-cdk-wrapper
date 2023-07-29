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
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.SchemaOptions

/**
 * Represents the table schema attributes.
 *
 * Example:
 * ```
 * Table table;
 * SchemaOptions schema = table.schema();
 * Attribute partitionKey = schema.getPartitionKey();
 * Attribute sortKey = schema.getSortKey();
 * ```
 */
@CdkDslMarker
public class SchemaOptionsDsl {
    private val cdkBuilder: SchemaOptions.Builder = SchemaOptions.builder()

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

    public fun build(): SchemaOptions = cdkBuilder.build()
}
