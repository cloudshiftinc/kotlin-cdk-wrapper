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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnThingType
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnThingTypeThingTypePropertiesPropertyDsl {
    private val cdkBuilder: CfnThingType.ThingTypePropertiesProperty.Builder =
        CfnThingType.ThingTypePropertiesProperty.builder()

    private val _searchableAttributes: MutableList<String> = mutableListOf()

    public fun searchableAttributes(vararg searchableAttributes: String) {
        _searchableAttributes.addAll(listOf(*searchableAttributes))
    }

    public fun searchableAttributes(searchableAttributes: Collection<String>) {
        _searchableAttributes.addAll(searchableAttributes)
    }

    public fun thingTypeDescription(thingTypeDescription: String) {
        cdkBuilder.thingTypeDescription(thingTypeDescription)
    }

    public fun build(): CfnThingType.ThingTypePropertiesProperty {
        if (_searchableAttributes.isNotEmpty()) cdkBuilder.searchableAttributes(_searchableAttributes)
        return cdkBuilder.build()
    }
}
