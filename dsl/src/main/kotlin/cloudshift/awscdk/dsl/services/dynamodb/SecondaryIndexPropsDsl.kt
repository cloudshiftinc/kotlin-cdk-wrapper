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
import software.amazon.awscdk.services.dynamodb.ProjectionType
import software.amazon.awscdk.services.dynamodb.SecondaryIndexProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class SecondaryIndexPropsDsl {
    private val cdkBuilder: SecondaryIndexProps.Builder = SecondaryIndexProps.builder()

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

    public fun projectionType(projectionType: ProjectionType) {
        cdkBuilder.projectionType(projectionType)
    }

    public fun build(): SecondaryIndexProps {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
