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
import software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.ProjectionType

/**
 * Properties for a local secondary index.
 *
 * Example:
 * ```
 * TableV2 table = TableV2.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .sortKey(Attribute.builder().name("sk").type(AttributeType.NUMBER).build())
 * .localSecondaryIndexes(List.of(LocalSecondaryIndexProps.builder()
 * .indexName("lsi1")
 * .sortKey(Attribute.builder().name("sk").type(AttributeType.NUMBER).build())
 * .build()))
 * .build();
 * table.addLocalSecondaryIndex(LocalSecondaryIndexProps.builder()
 * .indexName("lsi2")
 * .sortKey(Attribute.builder().name("sk").type(AttributeType.NUMBER).build())
 * .build());
 * ```
 */
@CdkDslMarker
public class LocalSecondaryIndexPropsDsl {
    private val cdkBuilder: LocalSecondaryIndexProps.Builder = LocalSecondaryIndexProps.builder()

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

    /** @param projectionType The set of attributes that are projected into the secondary index. */
    public fun projectionType(projectionType: ProjectionType) {
        cdkBuilder.projectionType(projectionType)
    }

    /** @param sortKey The attribute of a sort key for the local secondary index. */
    public fun sortKey(sortKey: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(sortKey)
        cdkBuilder.sortKey(builder.build())
    }

    /** @param sortKey The attribute of a sort key for the local secondary index. */
    public fun sortKey(sortKey: Attribute) {
        cdkBuilder.sortKey(sortKey)
    }

    public fun build(): LocalSecondaryIndexProps {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
