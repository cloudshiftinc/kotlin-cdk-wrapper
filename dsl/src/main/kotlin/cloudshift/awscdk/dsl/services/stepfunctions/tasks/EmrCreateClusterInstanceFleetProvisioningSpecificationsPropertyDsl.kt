@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder =
      EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

  /**
   * @param spotSpecification The launch specification for Spot instances in the fleet, which
   * determines the defined duration and provisioning timeout behavior. 
   */
  public
      fun spotSpecification(spotSpecification: EmrCreateClusterSpotProvisioningSpecificationPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterSpotProvisioningSpecificationPropertyDsl()
    builder.apply(spotSpecification)
    cdkBuilder.spotSpecification(builder.build())
  }

  /**
   * @param spotSpecification The launch specification for Spot instances in the fleet, which
   * determines the defined duration and provisioning timeout behavior. 
   */
  public
      fun spotSpecification(spotSpecification: EmrCreateCluster.SpotProvisioningSpecificationProperty) {
    cdkBuilder.spotSpecification(spotSpecification)
  }

  public fun build(): EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty =
      cdkBuilder.build()
}
