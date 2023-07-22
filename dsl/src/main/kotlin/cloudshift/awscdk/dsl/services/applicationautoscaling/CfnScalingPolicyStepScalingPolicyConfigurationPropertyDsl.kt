@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyStepScalingPolicyConfigurationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder =
      CfnScalingPolicy.StepScalingPolicyConfigurationProperty.builder()

  private val _stepAdjustments: MutableList<Any> = mutableListOf()

  /**
   * @param adjustmentType Specifies whether the `ScalingAdjustment` value in the `StepAdjustment`
   * property is an absolute number or a percentage of the current capacity.
   */
  public fun adjustmentType(adjustmentType: String) {
    cdkBuilder.adjustmentType(adjustmentType)
  }

  /**
   * @param cooldown The amount of time, in seconds, to wait for a previous scaling activity to take
   * effect.
   * If not specified, the default value is 300. For more information, see [Cooldown
   * period](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#step-scaling-cooldown)
   * in the *Application Auto Scaling User Guide* .
   */
  public fun cooldown(cooldown: Number) {
    cdkBuilder.cooldown(cooldown)
  }

  /**
   * @param metricAggregationType The aggregation type for the CloudWatch metrics.
   * Valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null, the
   * value is treated as `Average` .
   */
  public fun metricAggregationType(metricAggregationType: String) {
    cdkBuilder.metricAggregationType(metricAggregationType)
  }

  /**
   * @param minAdjustmentMagnitude The minimum value to scale by when the adjustment type is
   * `PercentChangeInCapacity` .
   * For example, suppose that you create a step scaling policy to scale out an Amazon ECS service
   * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the service has 4 tasks and the
   * scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
   * `MinAdjustmentMagnitude` of 2, Application Auto Scaling scales out the service by 2 tasks.
   */
  public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
    cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
  }

  /**
   * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
   * alarm breach.
   * At least one step adjustment is required if you are adding a new step scaling policy
   * configuration.
   */
  public fun stepAdjustments(vararg stepAdjustments: Any) {
    _stepAdjustments.addAll(listOf(*stepAdjustments))
  }

  /**
   * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
   * alarm breach.
   * At least one step adjustment is required if you are adding a new step scaling policy
   * configuration.
   */
  public fun stepAdjustments(stepAdjustments: Collection<Any>) {
    _stepAdjustments.addAll(stepAdjustments)
  }

  /**
   * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
   * alarm breach.
   * At least one step adjustment is required if you are adding a new step scaling policy
   * configuration.
   */
  public fun stepAdjustments(stepAdjustments: IResolvable) {
    cdkBuilder.stepAdjustments(stepAdjustments)
  }

  public fun build(): CfnScalingPolicy.StepScalingPolicyConfigurationProperty {
    if(_stepAdjustments.isNotEmpty()) cdkBuilder.stepAdjustments(_stepAdjustments)
    return cdkBuilder.build()
  }
}
