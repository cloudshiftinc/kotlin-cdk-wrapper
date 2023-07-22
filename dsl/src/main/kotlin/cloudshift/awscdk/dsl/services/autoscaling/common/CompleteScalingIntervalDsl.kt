@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling.common

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval

@CdkDslMarker
public class CompleteScalingIntervalDsl {
  private val cdkBuilder: CompleteScalingInterval.Builder = CompleteScalingInterval.builder()

  /**
   * @param change the value to be set.
   */
  public fun change(change: Number) {
    cdkBuilder.change(change)
  }

  /**
   * @param lower the value to be set. 
   */
  public fun lower(lower: Number) {
    cdkBuilder.lower(lower)
  }

  /**
   * @param upper the value to be set. 
   */
  public fun upper(upper: Number) {
    cdkBuilder.upper(upper)
  }

  public fun build(): CompleteScalingInterval = cdkBuilder.build()
}
