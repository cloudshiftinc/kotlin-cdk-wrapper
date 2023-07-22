@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig

@CdkDslMarker
public class TrafficRoutingConfigDsl {
  private val cdkBuilder: TrafficRoutingConfig.Builder = TrafficRoutingConfig.builder()

  /**
   * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
   * function or ECS task set to another in two increments.
   */
  public fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfigDsl.() -> Unit = {}) {
    val builder = CanaryTrafficRoutingConfigDsl()
    builder.apply(timeBasedCanary)
    cdkBuilder.timeBasedCanary(builder.build())
  }

  /**
   * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
   * function or ECS task set to another in two increments.
   */
  public fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig) {
    cdkBuilder.timeBasedCanary(timeBasedCanary)
  }

  /**
   * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
   * function or Amazon ECS task set to another in equal increments, with an equal number of minutes
   * between each increment.
   */
  public fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfigDsl.() -> Unit = {}) {
    val builder = LinearTrafficRoutingConfigDsl()
    builder.apply(timeBasedLinear)
    cdkBuilder.timeBasedLinear(builder.build())
  }

  /**
   * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
   * function or Amazon ECS task set to another in equal increments, with an equal number of minutes
   * between each increment.
   */
  public fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig) {
    cdkBuilder.timeBasedLinear(timeBasedLinear)
  }

  /**
   * @param type The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a
   * deployment configuration. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): TrafficRoutingConfig = cdkBuilder.build()
}
