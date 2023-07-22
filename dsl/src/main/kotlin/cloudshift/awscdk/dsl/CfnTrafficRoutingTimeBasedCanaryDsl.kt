@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary

@CdkDslMarker
public class CfnTrafficRoutingTimeBasedCanaryDsl {
  private val cdkBuilder: CfnTrafficRoutingTimeBasedCanary.Builder =
      CfnTrafficRoutingTimeBasedCanary.builder()

  /**
   * @param bakeTimeMins The number of minutes between the first and second traffic shifts of a
   * time-based canary deployment.
   */
  public fun bakeTimeMins(bakeTimeMins: Number) {
    cdkBuilder.bakeTimeMins(bakeTimeMins)
  }

  /**
   * @param stepPercentage The percentage of traffic to shift in the first increment of a time-based
   * canary deployment.
   * The step percentage must be 14% or greater.
   */
  public fun stepPercentage(stepPercentage: Number) {
    cdkBuilder.stepPercentage(stepPercentage)
  }

  public fun build(): CfnTrafficRoutingTimeBasedCanary = cdkBuilder.build()
}
