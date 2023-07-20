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
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGlobalTableProjectionPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.ProjectionProperty.Builder =
        CfnGlobalTable.ProjectionProperty.builder()

    private val _nonKeyAttributes: MutableList<String> = mutableListOf()

    public fun nonKeyAttributes(vararg nonKeyAttributes: String) {
        _nonKeyAttributes.addAll(listOf(*nonKeyAttributes))
    }

    public fun nonKeyAttributes(nonKeyAttributes: Collection<String>) {
        _nonKeyAttributes.addAll(nonKeyAttributes)
    }

    public fun projectionType(projectionType: String) {
        cdkBuilder.projectionType(projectionType)
    }

    public fun build(): CfnGlobalTable.ProjectionProperty {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
