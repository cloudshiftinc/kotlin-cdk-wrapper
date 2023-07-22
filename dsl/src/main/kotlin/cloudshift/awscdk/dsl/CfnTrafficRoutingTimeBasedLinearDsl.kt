@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear

/**
 * The traffic routing configuration if `CfnTrafficRoutingConfig.type` is
 * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnTrafficRoutingTimeBasedLinear cfnTrafficRoutingTimeBasedLinear =
 * CfnTrafficRoutingTimeBasedLinear.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnTrafficRoutingTimeBasedLinearDsl {
  private val cdkBuilder: CfnTrafficRoutingTimeBasedLinear.Builder =
      CfnTrafficRoutingTimeBasedLinear.builder()

  /**
   * @param bakeTimeMins The number of minutes between the first and second traffic shifts of a
   * time-based linear deployment.
   */
  public fun bakeTimeMins(bakeTimeMins: Number) {
    cdkBuilder.bakeTimeMins(bakeTimeMins)
  }

  /**
   * @param stepPercentage The percentage of traffic that is shifted at the start of each increment
   * of a time-based linear deployment.
   * The step percentage must be 14% or greater.
   */
  public fun stepPercentage(stepPercentage: Number) {
    cdkBuilder.stepPercentage(stepPercentage)
  }

  public fun build(): CfnTrafficRoutingTimeBasedLinear = cdkBuilder.build()
}
