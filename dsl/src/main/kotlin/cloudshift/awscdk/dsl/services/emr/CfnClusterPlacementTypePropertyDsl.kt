@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterPlacementTypePropertyDsl {
  private val cdkBuilder: CfnCluster.PlacementTypeProperty.Builder =
      CfnCluster.PlacementTypeProperty.builder()

  /**
   * @param availabilityZone The Amazon EC2 Availability Zone for the cluster. 
   * `AvailabilityZone` is used for uniform instance groups, while `AvailabilityZones` (plural) is
   * used for instance fleets.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun build(): CfnCluster.PlacementTypeProperty = cdkBuilder.build()
}
