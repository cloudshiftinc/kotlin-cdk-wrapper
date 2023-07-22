@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * Specifies the number of units to request for an EC2 Fleet.
 *
 * You can choose to set the target capacity in terms of instances or a performance characteristic
 * that is important to your application workload, such as vCPUs, memory, or I/O. If the request type
 * is `maintain` , you can specify a target capacity of `0` and add capacity later.
 *
 * `TargetCapacitySpecificationRequest` is a property of the
 * [AWS::EC2::EC2Fleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TargetCapacitySpecificationRequestProperty targetCapacitySpecificationRequestProperty =
 * TargetCapacitySpecificationRequestProperty.builder()
 * .totalTargetCapacity(123)
 * // the properties below are optional
 * .defaultTargetCapacityType("defaultTargetCapacityType")
 * .onDemandTargetCapacity(123)
 * .spotTargetCapacity(123)
 * .targetCapacityUnitType("targetCapacityUnitType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html)
 */
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
