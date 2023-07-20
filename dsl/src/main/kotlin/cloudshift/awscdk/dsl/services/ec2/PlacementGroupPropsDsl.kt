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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.PlacementGroupProps
import software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel
import software.amazon.awscdk.services.ec2.PlacementGroupStrategy
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class PlacementGroupPropsDsl {
    private val cdkBuilder: PlacementGroupProps.Builder = PlacementGroupProps.builder()

    public fun partitions(partitions: Number) {
        cdkBuilder.partitions(partitions)
    }

    public fun placementGroupName(placementGroupName: String) {
        cdkBuilder.placementGroupName(placementGroupName)
    }

    public fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel) {
        cdkBuilder.spreadLevel(spreadLevel)
    }

    public fun strategy(strategy: PlacementGroupStrategy) {
        cdkBuilder.strategy(strategy)
    }

    public fun build(): PlacementGroupProps = cdkBuilder.build()
}
