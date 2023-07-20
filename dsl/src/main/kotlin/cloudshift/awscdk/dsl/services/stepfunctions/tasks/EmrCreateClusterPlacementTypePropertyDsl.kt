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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrCreateClusterPlacementTypePropertyDsl {
    private val cdkBuilder: EmrCreateCluster.PlacementTypeProperty.Builder =
        EmrCreateCluster.PlacementTypeProperty.builder()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    public fun build(): EmrCreateCluster.PlacementTypeProperty {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        return cdkBuilder.build()
    }
}
