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
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EcsEc2LaunchTargetOptionsDsl {
    private val cdkBuilder: EcsEc2LaunchTargetOptions.Builder = EcsEc2LaunchTargetOptions.builder()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

    public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
        _placementConstraints.addAll(placementConstraints)
    }

    public fun placementStrategies(vararg placementStrategies: PlacementStrategy) {
        _placementStrategies.addAll(listOf(*placementStrategies))
    }

    public fun placementStrategies(placementStrategies: Collection<PlacementStrategy>) {
        _placementStrategies.addAll(placementStrategies)
    }

    public fun build(): EcsEc2LaunchTargetOptions {
        if (_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        return cdkBuilder.build()
    }
}
