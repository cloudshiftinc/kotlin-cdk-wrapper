@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.CfnTrafficRoutingConfig
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear
import software.amazon.awscdk.CfnTrafficRoutingType

@CdkDslMarker
public class CfnTrafficRoutingConfigDsl {
  private val cdkBuilder: CfnTrafficRoutingConfig.Builder = CfnTrafficRoutingConfig.builder()

  /**
   * @param timeBasedCanary The configuration for traffic routing when `type` is
   * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
   */
  public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanaryDsl.() -> Unit = {}) {
    val builder = CfnTrafficRoutingTimeBasedCanaryDsl()
    builder.apply(timeBasedCanary)
    cdkBuilder.timeBasedCanary(builder.build())
  }

  /**
   * @param timeBasedCanary The configuration for traffic routing when `type` is
   * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
   */
  public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary) {
    cdkBuilder.timeBasedCanary(timeBasedCanary)
  }

  /**
   * @param timeBasedLinear The configuration for traffic routing when `type` is
   * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
   */
  public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinearDsl.() -> Unit = {}) {
    val builder = CfnTrafficRoutingTimeBasedLinearDsl()
    builder.apply(timeBasedLinear)
    cdkBuilder.timeBasedLinear(builder.build())
  }

  /**
   * @param timeBasedLinear The configuration for traffic routing when `type` is
   * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
   */
  public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear) {
    cdkBuilder.timeBasedLinear(timeBasedLinear)
  }

  /**
   * @param type The type of traffic shifting used by the blue-green deployment configuration. 
   */
  public fun type(type: CfnTrafficRoutingType) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTrafficRoutingConfig = cdkBuilder.build()
}
