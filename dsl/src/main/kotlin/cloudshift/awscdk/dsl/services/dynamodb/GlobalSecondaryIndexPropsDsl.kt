@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.ProjectionType
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class GlobalSecondaryIndexPropsDsl {
    private val cdkBuilder: GlobalSecondaryIndexProps.Builder = GlobalSecondaryIndexProps.builder()

    private val _nonKeyAttributes: MutableList<String> = mutableListOf()

    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    public fun nonKeyAttributes(vararg nonKeyAttributes: String) {
        _nonKeyAttributes.addAll(listOf(*nonKeyAttributes))
    }

    public fun nonKeyAttributes(nonKeyAttributes: Collection<String>) {
        _nonKeyAttributes.addAll(nonKeyAttributes)
    }

    public fun partitionKey(block: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(block)
        cdkBuilder.partitionKey(builder.build())
    }

    public fun partitionKey(partitionKey: Attribute) {
        cdkBuilder.partitionKey(partitionKey)
    }

    public fun projectionType(projectionType: ProjectionType) {
        cdkBuilder.projectionType(projectionType)
    }

    public fun readCapacity(readCapacity: Number) {
        cdkBuilder.readCapacity(readCapacity)
    }

    public fun sortKey(block: AttributeDsl.() -> Unit = {}) {
        val builder = AttributeDsl()
        builder.apply(block)
        cdkBuilder.sortKey(builder.build())
    }

    public fun sortKey(sortKey: Attribute) {
        cdkBuilder.sortKey(sortKey)
    }

    public fun writeCapacity(writeCapacity: Number) {
        cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): GlobalSecondaryIndexProps {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
