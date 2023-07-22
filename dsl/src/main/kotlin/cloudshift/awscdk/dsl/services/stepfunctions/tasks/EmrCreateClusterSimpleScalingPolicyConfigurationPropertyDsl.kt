@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

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
