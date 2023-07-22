@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@CdkDslMarker
public class CfnGameSessionQueuePriorityConfigurationPropertyDsl {
  private val cdkBuilder: CfnGameSessionQueue.PriorityConfigurationProperty.Builder =
      CfnGameSessionQueue.PriorityConfigurationProperty.builder()

  private val _locationOrder: MutableList<String> = mutableListOf()

  private val _priorityOrder: MutableList<String> = mutableListOf()

  /**
   * @param locationOrder The prioritization order to use for fleet locations, when the
   * `PriorityOrder` property includes `LOCATION` .
   * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only be
   * listed once.
   */
  public fun locationOrder(vararg locationOrder: String) {
    _locationOrder.addAll(listOf(*locationOrder))
  }

  /**
   * @param locationOrder The prioritization order to use for fleet locations, when the
   * `PriorityOrder` property includes `LOCATION` .
   * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only be
   * listed once.
   */
  public fun locationOrder(locationOrder: Collection<String>) {
    _locationOrder.addAll(locationOrder)
  }

  /**
   * @param priorityOrder The recommended sequence to use when prioritizing where to place new game
   * sessions.
   * Each type can only be listed once.
   *
   * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in each
   * game session request) is lowest.
   * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
   * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
   * destination in the queue.
   * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in the
   * queue configuration.
   * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
   * `LocationOrder` .
   */
  public fun priorityOrder(vararg priorityOrder: String) {
    _priorityOrder.addAll(listOf(*priorityOrder))
  }

  /**
   * @param priorityOrder The recommended sequence to use when prioritizing where to place new game
   * sessions.
   * Each type can only be listed once.
   *
   * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in each
   * game session request) is lowest.
   * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
   * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
   * destination in the queue.
   * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in the
   * queue configuration.
   * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
   * `LocationOrder` .
   */
  public fun priorityOrder(priorityOrder: Collection<String>) {
    _priorityOrder.addAll(priorityOrder)
  }

  public fun build(): CfnGameSessionQueue.PriorityConfigurationProperty {
    if(_locationOrder.isNotEmpty()) cdkBuilder.locationOrder(_locationOrder)
    if(_priorityOrder.isNotEmpty()) cdkBuilder.priorityOrder(_priorityOrder)
    return cdkBuilder.build()
  }
}
