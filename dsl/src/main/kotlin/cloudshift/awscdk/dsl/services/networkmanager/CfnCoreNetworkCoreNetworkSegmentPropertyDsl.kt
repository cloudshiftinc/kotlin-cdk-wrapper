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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCoreNetworkCoreNetworkSegmentPropertyDsl {
    private val cdkBuilder: CfnCoreNetwork.CoreNetworkSegmentProperty.Builder =
        CfnCoreNetwork.CoreNetworkSegmentProperty.builder()

    private val _edgeLocations: MutableList<String> = mutableListOf()

    private val _sharedSegments: MutableList<String> = mutableListOf()

    public fun edgeLocations(vararg edgeLocations: String) {
        _edgeLocations.addAll(listOf(*edgeLocations))
    }

    public fun edgeLocations(edgeLocations: Collection<String>) {
        _edgeLocations.addAll(edgeLocations)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sharedSegments(vararg sharedSegments: String) {
        _sharedSegments.addAll(listOf(*sharedSegments))
    }

    public fun sharedSegments(sharedSegments: Collection<String>) {
        _sharedSegments.addAll(sharedSegments)
    }

    public fun build(): CfnCoreNetwork.CoreNetworkSegmentProperty {
        if (_edgeLocations.isNotEmpty()) cdkBuilder.edgeLocations(_edgeLocations)
        if (_sharedSegments.isNotEmpty()) cdkBuilder.sharedSegments(_sharedSegments)
        return cdkBuilder.build()
    }
}
