@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig

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
