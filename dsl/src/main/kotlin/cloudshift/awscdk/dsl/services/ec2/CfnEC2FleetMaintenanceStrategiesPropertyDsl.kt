@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetMaintenanceStrategiesPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.MaintenanceStrategiesProperty.Builder =
      CfnEC2Fleet.MaintenanceStrategiesProperty.builder()

  public fun capacityRebalance(capacityRebalance: IResolvable) {
    cdkBuilder.capacityRebalance(capacityRebalance)
  }

  public fun capacityRebalance(capacityRebalance: CfnEC2Fleet.CapacityRebalanceProperty) {
    cdkBuilder.capacityRebalance(capacityRebalance)
  }

  public fun build(): CfnEC2Fleet.MaintenanceStrategiesProperty = cdkBuilder.build()
}
