@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTargetOptions

@CdkDslMarker
public class EcsEc2LaunchTargetOptionsDsl {
  private val cdkBuilder: EcsEc2LaunchTargetOptions.Builder = EcsEc2LaunchTargetOptions.builder()

  private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

  private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

  /**
   * @param placementConstraints Placement constraints.
   */
  public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
    _placementConstraints.addAll(listOf(*placementConstraints))
  }

  /**
   * @param placementConstraints Placement constraints.
   */
  public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
    _placementConstraints.addAll(placementConstraints)
  }

  /**
   * @param placementStrategies Placement strategies.
   */
  public fun placementStrategies(vararg placementStrategies: PlacementStrategy) {
    _placementStrategies.addAll(listOf(*placementStrategies))
  }

  /**
   * @param placementStrategies Placement strategies.
   */
  public fun placementStrategies(placementStrategies: Collection<PlacementStrategy>) {
    _placementStrategies.addAll(placementStrategies)
  }

  public fun build(): EcsEc2LaunchTargetOptions {
    if(_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
    if(_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
    return cdkBuilder.build()
  }
}
