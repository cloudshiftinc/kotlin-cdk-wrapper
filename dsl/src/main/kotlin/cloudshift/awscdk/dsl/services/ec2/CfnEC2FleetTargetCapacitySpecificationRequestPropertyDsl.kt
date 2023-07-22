@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetTargetCapacitySpecificationRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder =
      CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.builder()

  /**
   * @param defaultTargetCapacityType The default `TotalTargetCapacity` , which is either `Spot` or
   * `On-Demand` .
   */
  public fun defaultTargetCapacityType(defaultTargetCapacityType: String) {
    cdkBuilder.defaultTargetCapacityType(defaultTargetCapacityType)
  }

  /**
   * @param onDemandTargetCapacity The number of On-Demand units to request.
   */
  public fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
    cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
  }

  /**
   * @param spotTargetCapacity The number of Spot units to request.
   */
  public fun spotTargetCapacity(spotTargetCapacity: Number) {
    cdkBuilder.spotTargetCapacity(spotTargetCapacity)
  }

  /**
   * @param targetCapacityUnitType The unit for the target capacity. `TargetCapacityUnitType` can
   * only be specified when `InstanceRequirements` is specified.
   * Default: `units` (translates to number of instances)
   */
  public fun targetCapacityUnitType(targetCapacityUnitType: String) {
    cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
  }

  /**
   * @param totalTargetCapacity The number of units to request, filled using
   * `DefaultTargetCapacityType` . 
   */
  public fun totalTargetCapacity(totalTargetCapacity: Number) {
    cdkBuilder.totalTargetCapacity(totalTargetCapacity)
  }

  public fun build(): CfnEC2Fleet.TargetCapacitySpecificationRequestProperty = cdkBuilder.build()
}
