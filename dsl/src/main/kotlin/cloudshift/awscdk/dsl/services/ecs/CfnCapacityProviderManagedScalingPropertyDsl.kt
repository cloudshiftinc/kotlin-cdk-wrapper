@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

@CdkDslMarker
public class CfnCapacityProviderManagedScalingPropertyDsl {
  private val cdkBuilder: CfnCapacityProvider.ManagedScalingProperty.Builder =
      CfnCapacityProvider.ManagedScalingProperty.builder()

  /**
   * @param instanceWarmupPeriod The period of time, in seconds, after a newly launched Amazon EC2
   * instance can contribute to CloudWatch metrics for Auto Scaling group.
   * If this parameter is omitted, the default value of `300` seconds is used.
   */
  public fun instanceWarmupPeriod(instanceWarmupPeriod: Number) {
    cdkBuilder.instanceWarmupPeriod(instanceWarmupPeriod)
  }

  /**
   * @param maximumScalingStepSize The maximum number of Amazon EC2 instances that Amazon ECS will
   * scale out at one time.
   * The scale in process is not affected by this parameter. If this parameter is omitted, the
   * default value of `1` is used.
   */
  public fun maximumScalingStepSize(maximumScalingStepSize: Number) {
    cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
  }

  /**
   * @param minimumScalingStepSize The minimum number of Amazon EC2 instances that Amazon ECS will
   * scale out at one time.
   * The scale in process is not affected by this parameter If this parameter is omitted, the
   * default value of `1` is used.
   *
   * When additional capacity is required, Amazon ECS will scale up the minimum scaling step size
   * even if the actual demand is less than the minimum scaling step size.
   *
   * If you use a capacity provider with an Auto Scaling group configured with more than one Amazon
   * EC2 instance type or Availability Zone, Amazon ECS will scale up by the exact minimum scaling step
   * size value and will ignore both the maximum scaling step size as well as the capacity demand.
   */
  public fun minimumScalingStepSize(minimumScalingStepSize: Number) {
    cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
  }

  /**
   * @param status Determines whether to use managed scaling for the capacity provider.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param targetCapacity The target capacity utilization as a percentage for the capacity
   * provider.
   * The specified value must be greater than `0` and less than or equal to `100` . For example, if
   * you want the capacity provider to maintain 10% spare capacity, then that means the utilization is
   * 90%, so use a `targetCapacity` of `90` . The default value of `100` percent results in the Amazon
   * EC2 instances in your Auto Scaling group being completely used.
   */
  public fun targetCapacity(targetCapacity: Number) {
    cdkBuilder.targetCapacity(targetCapacity)
  }

  public fun build(): CfnCapacityProvider.ManagedScalingProperty = cdkBuilder.build()
}
