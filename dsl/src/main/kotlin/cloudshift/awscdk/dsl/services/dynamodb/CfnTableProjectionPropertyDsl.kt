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
import software.amazon.awscdk.services.dynamodb.CfnTable
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTableProjectionPropertyDsl {
    private val cdkBuilder: CfnTable.ProjectionProperty.Builder =
        CfnTable.ProjectionProperty.builder()

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

    public fun build(): CfnTable.ProjectionProperty {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
