@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig

/**
 * Represents the configuration specific to linear traffic shifting.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * LinearTrafficRoutingConfig linearTrafficRoutingConfig = LinearTrafficRoutingConfig.builder()
 * .linearInterval(123)
 * .linearPercentage(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class LinearTrafficRoutingConfigDsl {
  private val cdkBuilder: LinearTrafficRoutingConfig.Builder = LinearTrafficRoutingConfig.builder()

  /**
   * @param linearInterval The number of minutes between each incremental traffic shift of a
   * `TimeBasedLinear` deployment. 
   */
  public fun linearInterval(linearInterval: Number) {
    cdkBuilder.linearInterval(linearInterval)
  }

  /**
   * @param linearPercentage The percentage of traffic that is shifted at the start of each
   * increment of a `TimeBasedLinear` deployment. 
   */
  public fun linearPercentage(linearPercentage: Number) {
    cdkBuilder.linearPercentage(linearPercentage)
  }

  public fun build(): LinearTrafficRoutingConfig = cdkBuilder.build()
}
