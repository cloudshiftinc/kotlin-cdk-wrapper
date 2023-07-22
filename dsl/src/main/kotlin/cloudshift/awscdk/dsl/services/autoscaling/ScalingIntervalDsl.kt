@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.ScalingInterval

@CdkDslMarker
public class ScalingIntervalDsl {
  private val cdkBuilder: ScalingInterval.Builder = ScalingInterval.builder()

  /**
   * @param change The capacity adjustment to apply in this interval. 
   * The number is interpreted differently based on AdjustmentType:
   *
   * * ChangeInCapacity: add the adjustment to the current capacity.
   * The number can be positive or negative.
   * * PercentChangeInCapacity: add or remove the given percentage of the current
   * capacity to itself. The number can be in the range [-100..100].
   * * ExactCapacity: set the capacity to this number. The number must
   * be positive.
   */
  public fun change(change: Number) {
    cdkBuilder.change(change)
  }

  /**
   * @param lower The lower bound of the interval.
   * The scaling adjustment will be applied if the metric is higher than this value.
   */
  public fun lower(lower: Number) {
    cdkBuilder.lower(lower)
  }

  /**
   * @param upper The upper bound of the interval.
   * The scaling adjustment will be applied if the metric is lower than this value.
   */
  public fun upper(upper: Number) {
    cdkBuilder.upper(upper)
  }

  public fun build(): ScalingInterval = cdkBuilder.build()
}
