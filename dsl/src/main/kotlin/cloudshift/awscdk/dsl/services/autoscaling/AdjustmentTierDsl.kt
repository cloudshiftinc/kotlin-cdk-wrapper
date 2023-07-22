@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.AdjustmentTier

@CdkDslMarker
public class AdjustmentTierDsl {
  private val cdkBuilder: AdjustmentTier.Builder = AdjustmentTier.builder()

  /**
   * @param adjustment What number to adjust the capacity with. 
   * The number is interpeted as an added capacity, a new fixed capacity or an
   * added percentage depending on the AdjustmentType value of the
   * StepScalingPolicy.
   *
   * Can be positive or negative.
   */
  public fun adjustment(adjustment: Number) {
    cdkBuilder.adjustment(adjustment)
  }

  /**
   * @param lowerBound Lower bound where this scaling tier applies.
   * The scaling tier applies if the difference between the metric
   * value and its alarm threshold is higher than this value.
   */
  public fun lowerBound(lowerBound: Number) {
    cdkBuilder.lowerBound(lowerBound)
  }

  /**
   * @param upperBound Upper bound where this scaling tier applies.
   * The scaling tier applies if the difference between the metric
   * value and its alarm threshold is lower than this value.
   */
  public fun upperBound(upperBound: Number) {
    cdkBuilder.upperBound(upperBound)
  }

  public fun build(): AdjustmentTier = cdkBuilder.build()
}
