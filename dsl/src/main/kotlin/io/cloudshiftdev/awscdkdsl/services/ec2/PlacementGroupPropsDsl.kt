@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.PlacementGroupProps
import software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel
import software.amazon.awscdk.services.ec2.PlacementGroupStrategy

/**
 * Props for a PlacementGroup.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PlacementGroupProps placementGroupProps = PlacementGroupProps.builder()
 * .partitions(123)
 * .placementGroupName("placementGroupName")
 * .spreadLevel(PlacementGroupSpreadLevel.HOST)
 * .strategy(PlacementGroupStrategy.CLUSTER)
 * .build();
 * ```
 */
@CdkDslMarker
public class PlacementGroupPropsDsl {
    private val cdkBuilder: PlacementGroupProps.Builder = PlacementGroupProps.builder()

    /** @param partitions The number of partitions. Valid only when Strategy is set to partition. */
    public fun partitions(partitions: Number) {
        cdkBuilder.partitions(partitions)
    }

    /** @param placementGroupName the name of this placement group. */
    public fun placementGroupName(placementGroupName: String) {
        cdkBuilder.placementGroupName(placementGroupName)
    }

    /**
     * @param spreadLevel Places instances on distinct hardware. Spread placement groups are
     *   recommended for applications that have a small number of critical instances that should be
     *   kept separate from each other. Launching instances in a spread level placement group
     *   reduces the risk of simultaneous failures that might occur when instances share the same
     *   equipment. Spread level placement groups provide access to distinct hardware, and are
     *   therefore suitable for mixing instance types or launching instances over time. If you start
     *   or launch an instance in a spread placement group and there is insufficient unique hardware
     *   to fulfill the request, the request fails. Amazon EC2 makes more distinct hardware
     *   available over time, so you can try your request again later. Placement groups can spread
     *   instances across racks or hosts. You can use host level spread placement groups only with
     *   AWS Outposts.
     */
    public fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel) {
        cdkBuilder.spreadLevel(spreadLevel)
    }

    /** @param strategy Which strategy to use when launching instances. */
    public fun strategy(strategy: PlacementGroupStrategy) {
        cdkBuilder.strategy(strategy)
    }

    public fun build(): PlacementGroupProps = cdkBuilder.build()
}
