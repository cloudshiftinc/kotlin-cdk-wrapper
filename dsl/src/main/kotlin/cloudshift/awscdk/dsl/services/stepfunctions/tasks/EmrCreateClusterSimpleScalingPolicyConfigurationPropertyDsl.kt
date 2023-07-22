@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * An automatic scaling configuration, which describes how the policy adds or removes instances, the
 * cooldown period, and the number of EC2 instances that will be added each time the CloudWatch metric
 * alarm condition is satisfied.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * SimpleScalingPolicyConfigurationProperty simpleScalingPolicyConfigurationProperty =
 * SimpleScalingPolicyConfigurationProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
 * .coolDown(123)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_SimpleScalingPolicyConfiguration.html)
 */
@CdkDslMarker
public class EmrCreateClusterSimpleScalingPolicyConfigurationPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder =
      EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.builder()

  /**
   * @param adjustmentType The way in which EC2 instances are added (if ScalingAdjustment is a
   * positive number) or terminated (if ScalingAdjustment is a negative number) each time the scaling
   * activity is triggered.
   */
  public fun adjustmentType(adjustmentType: EmrCreateCluster.ScalingAdjustmentType) {
    cdkBuilder.adjustmentType(adjustmentType)
  }

  /**
   * @param coolDown The amount of time, in seconds, after a scaling activity completes before any
   * further trigger-related scaling activities can start.
   */
  public fun coolDown(coolDown: Number) {
    cdkBuilder.coolDown(coolDown)
  }

  /**
   * @param scalingAdjustment The amount by which to scale in or scale out, based on the specified
   * AdjustmentType. 
   * A positive value adds to the instance group's
   * EC2 instance count while a negative number removes instances. If AdjustmentType is set to
   * EXACT_CAPACITY, the number should only be
   * a positive integer.
   */
  public fun scalingAdjustment(scalingAdjustment: Number) {
    cdkBuilder.scalingAdjustment(scalingAdjustment)
  }

  public fun build(): EmrCreateCluster.SimpleScalingPolicyConfigurationProperty = cdkBuilder.build()
}
