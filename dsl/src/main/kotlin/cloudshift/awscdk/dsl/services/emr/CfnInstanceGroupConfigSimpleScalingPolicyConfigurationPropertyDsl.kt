@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@CdkDslMarker
public class CfnInstanceGroupConfigSimpleScalingPolicyConfigurationPropertyDsl {
  private val cdkBuilder: CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder =
      CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.builder()

  /**
   * @param adjustmentType The way in which Amazon EC2 instances are added (if `ScalingAdjustment`
   * is a positive number) or terminated (if `ScalingAdjustment` is a negative number) each time the
   * scaling activity is triggered.
   * `CHANGE_IN_CAPACITY` is the default. `CHANGE_IN_CAPACITY` indicates that the Amazon EC2
   * instance count increments or decrements by `ScalingAdjustment` , which should be expressed as an
   * integer. `PERCENT_CHANGE_IN_CAPACITY` indicates the instance count increments or decrements by the
   * percentage specified by `ScalingAdjustment` , which should be expressed as an integer. For
   * example, 20 indicates an increase in 20% increments of cluster capacity. `EXACT_CAPACITY`
   * indicates the scaling activity results in an instance group with the number of Amazon EC2
   * instances specified by `ScalingAdjustment` , which should be expressed as a positive integer.
   */
  public fun adjustmentType(adjustmentType: String) {
    cdkBuilder.adjustmentType(adjustmentType)
  }

  /**
   * @param coolDown The amount of time, in seconds, after a scaling activity completes before any
   * further trigger-related scaling activities can start.
   * The default value is 0.
   */
  public fun coolDown(coolDown: Number) {
    cdkBuilder.coolDown(coolDown)
  }

  /**
   * @param scalingAdjustment The amount by which to scale in or scale out, based on the specified
   * `AdjustmentType` . 
   * A positive value adds to the instance group's Amazon EC2 instance count while a negative number
   * removes instances. If `AdjustmentType` is set to `EXACT_CAPACITY` , the number should only be a
   * positive integer. If `AdjustmentType` is set to `PERCENT_CHANGE_IN_CAPACITY` , the value should
   * express the percentage as an integer. For example, -20 indicates a decrease in 20% increments of
   * cluster capacity.
   */
  public fun scalingAdjustment(scalingAdjustment: Number) {
    cdkBuilder.scalingAdjustment(scalingAdjustment)
  }

  public fun build(): CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty =
      cdkBuilder.build()
}
