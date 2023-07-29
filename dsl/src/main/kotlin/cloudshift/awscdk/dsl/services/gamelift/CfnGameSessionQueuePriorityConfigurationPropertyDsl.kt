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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

/**
 * Custom prioritization settings for use by a game session queue when placing new game sessions
 * with available game servers.
 *
 * When defined, this configuration replaces the default FleetIQ prioritization process, which is as
 * follows:
 * * If player latency data is included in a game session request, destinations and locations are
 *   prioritized first based on lowest average latency (1), then on lowest hosting cost (2), then on
 *   destination list order (3), and finally on location (alphabetical) (4). This approach ensures
 *   that the queue's top priority is to place game sessions where average player latency is lowest,
 *   and--if latency is the same--where the hosting cost is less, etc.
 * * If player latency data is not included, destinations and locations are prioritized first on
 *   destination list order (1), and then on location (alphabetical) (2). This approach ensures that
 *   the queue's top priority is to place game sessions on the first destination fleet listed. If
 *   that fleet has multiple locations, the game session is placed on the first location (when
 *   listed alphabetically).
 *
 * Changing the priority order will affect how game sessions are placed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * PriorityConfigurationProperty priorityConfigurationProperty =
 * PriorityConfigurationProperty.builder()
 * .locationOrder(List.of("locationOrder"))
 * .priorityOrder(List.of("priorityOrder"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-priorityconfiguration.html)
 */
@CdkDslMarker
public class CfnGameSessionQueuePriorityConfigurationPropertyDsl {
    private val cdkBuilder: CfnGameSessionQueue.PriorityConfigurationProperty.Builder =
        CfnGameSessionQueue.PriorityConfigurationProperty.builder()

    private val _locationOrder: MutableList<String> = mutableListOf()

    private val _priorityOrder: MutableList<String> = mutableListOf()

    /**
     * @param locationOrder The prioritization order to use for fleet locations, when the
     *   `PriorityOrder` property includes `LOCATION` . Locations are identified by AWS Region codes
     *   such as `us-west-2` . Each location can only be listed once.
     */
    public fun locationOrder(vararg locationOrder: String) {
        _locationOrder.addAll(listOf(*locationOrder))
    }

    /**
     * @param locationOrder The prioritization order to use for fleet locations, when the
     *   `PriorityOrder` property includes `LOCATION` . Locations are identified by AWS Region codes
     *   such as `us-west-2` . Each location can only be listed once.
     */
    public fun locationOrder(locationOrder: Collection<String>) {
        _locationOrder.addAll(locationOrder)
    }

    /**
     * @param priorityOrder The recommended sequence to use when prioritizing where to place new
     *   game sessions. Each type can only be listed once.
     * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
     *   each game session request) is lowest.
     * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     *   evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
     *   destination in the queue.
     * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in the
     *   queue configuration.
     * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
     *   `LocationOrder` .
     */
    public fun priorityOrder(vararg priorityOrder: String) {
        _priorityOrder.addAll(listOf(*priorityOrder))
    }

    /**
     * @param priorityOrder The recommended sequence to use when prioritizing where to place new
     *   game sessions. Each type can only be listed once.
     * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
     *   each game session request) is lowest.
     * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     *   evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
     *   destination in the queue.
     * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in the
     *   queue configuration.
     * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
     *   `LocationOrder` .
     */
    public fun priorityOrder(priorityOrder: Collection<String>) {
        _priorityOrder.addAll(priorityOrder)
    }

    public fun build(): CfnGameSessionQueue.PriorityConfigurationProperty {
        if (_locationOrder.isNotEmpty()) cdkBuilder.locationOrder(_locationOrder)
        if (_priorityOrder.isNotEmpty()) cdkBuilder.priorityOrder(_priorityOrder)
        return cdkBuilder.build()
    }
}
