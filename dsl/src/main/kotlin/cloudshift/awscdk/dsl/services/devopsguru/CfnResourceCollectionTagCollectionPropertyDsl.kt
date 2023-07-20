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

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceCollectionTagCollectionPropertyDsl {
    private val cdkBuilder: CfnResourceCollection.TagCollectionProperty.Builder =
        CfnResourceCollection.TagCollectionProperty.builder()

    private val _tagValues: MutableList<String> = mutableListOf()

    public fun appBoundaryKey(appBoundaryKey: String) {
        cdkBuilder.appBoundaryKey(appBoundaryKey)
    }

    public fun tagValues(vararg tagValues: String) {
        _tagValues.addAll(listOf(*tagValues))
    }

    public fun tagValues(tagValues: Collection<String>) {
        _tagValues.addAll(tagValues)
    }

    public fun build(): CfnResourceCollection.TagCollectionProperty {
        if (_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
        return cdkBuilder.build()
    }
}
