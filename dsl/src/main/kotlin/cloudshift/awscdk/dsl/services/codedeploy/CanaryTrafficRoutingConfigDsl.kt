@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig

/**
 * Represents the configuration specific to canary traffic shifting.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * CanaryTrafficRoutingConfig canaryTrafficRoutingConfig = CanaryTrafficRoutingConfig.builder()
 * .canaryInterval(123)
 * .canaryPercentage(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class CanaryTrafficRoutingConfigDsl {
  private val cdkBuilder: CanaryTrafficRoutingConfig.Builder = CanaryTrafficRoutingConfig.builder()

  /**
   * @param canaryInterval The number of minutes between the first and second traffic shifts of a
   * `TimeBasedCanary` deployment. 
   */
  public fun canaryInterval(canaryInterval: Number) {
    cdkBuilder.canaryInterval(canaryInterval)
  }

  /**
   * @param canaryPercentage The percentage of traffic to shift in the first increment of a
   * `TimeBasedCanary` deployment. 
   */
  public fun canaryPercentage(canaryPercentage: Number) {
    cdkBuilder.canaryPercentage(canaryPercentage)
  }

  public fun build(): CanaryTrafficRoutingConfig = cdkBuilder.build()
}
