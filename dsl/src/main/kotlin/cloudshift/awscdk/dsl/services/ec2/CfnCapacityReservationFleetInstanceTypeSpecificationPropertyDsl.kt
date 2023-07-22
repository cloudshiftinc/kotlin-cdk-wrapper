@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet

@CdkDslMarker
public class CfnCapacityReservationFleetInstanceTypeSpecificationPropertyDsl {
  private val cdkBuilder: CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.Builder =
      CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.builder()

  /**
   * @param availabilityZone The Availability Zone in which the Capacity Reservation Fleet reserves
   * the capacity.
   * A Capacity Reservation Fleet can't span Availability Zones. All instance type specifications
   * that you specify for the Fleet must use the same Availability Zone.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param availabilityZoneId The ID of the Availability Zone in which the Capacity Reservation
   * Fleet reserves the capacity.
   * A Capacity Reservation Fleet can't span Availability Zones. All instance type specifications
   * that you specify for the Fleet must use the same Availability Zone.
   */
  public fun availabilityZoneId(availabilityZoneId: String) {
    cdkBuilder.availabilityZoneId(availabilityZoneId)
  }

  /**
   * @param ebsOptimized Indicates whether the Capacity Reservation Fleet supports EBS-optimized
   * instances types.
   * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
   * stack to provide optimal I/O performance. This optimization isn't available with all instance
   * types. Additional usage charges apply when using EBS-optimized instance types.
   */
  public fun ebsOptimized(ebsOptimized: Boolean) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  /**
   * @param ebsOptimized Indicates whether the Capacity Reservation Fleet supports EBS-optimized
   * instances types.
   * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
   * stack to provide optimal I/O performance. This optimization isn't available with all instance
   * types. Additional usage charges apply when using EBS-optimized instance types.
   */
  public fun ebsOptimized(ebsOptimized: IResolvable) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  /**
   * @param instancePlatform The type of operating system for which the Capacity Reservation Fleet
   * reserves capacity.
   */
  public fun instancePlatform(instancePlatform: String) {
    cdkBuilder.instancePlatform(instancePlatform)
  }

  /**
   * @param instanceType The instance type for which the Capacity Reservation Fleet reserves
   * capacity.
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param priority The priority to assign to the instance type.
   * This value is used to determine which of the instance types specified for the Fleet should be
   * prioritized for use. A lower value indicates a high priority. For more information, see [Instance
   * type
   * priority](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority)
   * in the Amazon EC2 User Guide.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param weight The number of capacity units provided by the specified instance type.
   * This value, together with the total target capacity that you specify for the Fleet determine
   * the number of instances for which the Fleet reserves capacity. Both values are based on units that
   * make sense for your workload. For more information, see [Total target
   * capacity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity)
   * in the Amazon EC2 User Guide.
   *
   * Valid Range: Minimum value of `0.001` . Maximum value of `99.999` .
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnCapacityReservationFleet.InstanceTypeSpecificationProperty =
      cdkBuilder.build()
}
