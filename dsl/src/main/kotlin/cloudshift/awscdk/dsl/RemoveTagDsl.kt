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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemoveTag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class RemoveTagDsl(
    key: String,
) {
    private val cdkBuilder: RemoveTag.Builder = RemoveTag.Builder.create(key)

    private val _excludeResourceTypes: MutableList<String> = mutableListOf()

    private val _includeResourceTypes: MutableList<String> = mutableListOf()

    public fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean) {
        cdkBuilder.applyToLaunchedInstances(applyToLaunchedInstances)
    }

    public fun excludeResourceTypes(vararg excludeResourceTypes: String) {
        _excludeResourceTypes.addAll(listOf(*excludeResourceTypes))
    }

    public fun excludeResourceTypes(excludeResourceTypes: Collection<String>) {
        _excludeResourceTypes.addAll(excludeResourceTypes)
    }

    public fun includeResourceTypes(vararg includeResourceTypes: String) {
        _includeResourceTypes.addAll(listOf(*includeResourceTypes))
    }

    public fun includeResourceTypes(includeResourceTypes: Collection<String>) {
        _includeResourceTypes.addAll(includeResourceTypes)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): RemoveTag {
        if (_excludeResourceTypes.isNotEmpty()) cdkBuilder.excludeResourceTypes(_excludeResourceTypes)
        if (_includeResourceTypes.isNotEmpty()) cdkBuilder.includeResourceTypes(_includeResourceTypes)
        return cdkBuilder.build()
    }
}
