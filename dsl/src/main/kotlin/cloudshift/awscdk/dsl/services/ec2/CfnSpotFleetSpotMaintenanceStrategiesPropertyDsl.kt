@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetSpotMaintenanceStrategiesPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder =
      CfnSpotFleet.SpotMaintenanceStrategiesProperty.builder()

  /**
   * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2 emits a
   * signal that your Spot Instance is at an elevated risk of being interrupted.
   * For more information, see [Capacity
   * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
   * in the *Amazon EC2 User Guide for Linux Instances* .
   */
  public fun capacityRebalance(capacityRebalance: IResolvable) {
    cdkBuilder.capacityRebalance(capacityRebalance)
  }

  /**
   * @param capacityRebalance The Spot Instance replacement strategy to use when Amazon EC2 emits a
   * signal that your Spot Instance is at an elevated risk of being interrupted.
   * For more information, see [Capacity
   * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html)
   * in the *Amazon EC2 User Guide for Linux Instances* .
   */
  public fun capacityRebalance(capacityRebalance: CfnSpotFleet.SpotCapacityRebalanceProperty) {
    cdkBuilder.capacityRebalance(capacityRebalance)
  }

  public fun build(): CfnSpotFleet.SpotMaintenanceStrategiesProperty = cdkBuilder.build()
}
