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

  public fun locationOrder(vararg locationOrder: String) {
    _locationOrder.addAll(listOf(*locationOrder))
  }

  public fun locationOrder(locationOrder: Collection<String>) {
    _locationOrder.addAll(locationOrder)
  }

  public fun priorityOrder(vararg priorityOrder: String) {
    _priorityOrder.addAll(listOf(*priorityOrder))
  }

  public fun priorityOrder(priorityOrder: Collection<String>) {
    _priorityOrder.addAll(priorityOrder)
  }

  public fun build(): CfnGameSessionQueue.PriorityConfigurationProperty {
    if(_locationOrder.isNotEmpty()) cdkBuilder.locationOrder(_locationOrder)
    if(_priorityOrder.isNotEmpty()) cdkBuilder.priorityOrder(_priorityOrder)
    return cdkBuilder.build()
  }
}
