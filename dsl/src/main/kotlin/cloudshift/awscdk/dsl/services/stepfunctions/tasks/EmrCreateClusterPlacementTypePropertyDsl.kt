@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterPlacementTypePropertyDsl {
  private val cdkBuilder: EmrCreateCluster.PlacementTypeProperty.Builder =
      EmrCreateCluster.PlacementTypeProperty.builder()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  /**
   * @param availabilityZone The Amazon EC2 Availability Zone for the cluster.
   * AvailabilityZone is used for uniform instance groups, while AvailabilityZones
   * (plural) is used for instance fleets.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param availabilityZones When multiple Availability Zones are specified, Amazon EMR evaluates
   * them and launches instances in the optimal Availability Zone.
   * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used for
   * uniform instance groups.
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * @param availabilityZones When multiple Availability Zones are specified, Amazon EMR evaluates
   * them and launches instances in the optimal Availability Zone.
   * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used for
   * uniform instance groups.
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  public fun build(): EmrCreateCluster.PlacementTypeProperty {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    return cdkBuilder.build()
  }
}
