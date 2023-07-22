@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

@CdkDslMarker
public class CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl {
  private val cdkBuilder:
      CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder =
      CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.builder()

  /**
   * @param onDemandSpecification The launch specification for On-Demand Instances in the instance
   * fleet, which determines the allocation strategy.
   *
   * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
   * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
   * releases 5.12.1 and later.
   */
  public fun onDemandSpecification(onDemandSpecification: IResolvable) {
    cdkBuilder.onDemandSpecification(onDemandSpecification)
  }

  /**
   * @param onDemandSpecification The launch specification for On-Demand Instances in the instance
   * fleet, which determines the allocation strategy.
   *
   * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
   * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
   * releases 5.12.1 and later.
   */
  public
      fun onDemandSpecification(onDemandSpecification: CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty) {
    cdkBuilder.onDemandSpecification(onDemandSpecification)
  }

  /**
   * @param spotSpecification The launch specification for Spot instances in the fleet, which
   * determines the defined duration, provisioning timeout behavior, and allocation strategy.
   */
  public fun spotSpecification(spotSpecification: IResolvable) {
    cdkBuilder.spotSpecification(spotSpecification)
  }

  /**
   * @param spotSpecification The launch specification for Spot instances in the fleet, which
   * determines the defined duration, provisioning timeout behavior, and allocation strategy.
   */
  public
      fun spotSpecification(spotSpecification: CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty) {
    cdkBuilder.spotSpecification(spotSpecification)
  }

  public fun build(): CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty =
      cdkBuilder.build()
}
