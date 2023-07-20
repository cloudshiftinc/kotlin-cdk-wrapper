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

  public fun timeBasedCanary(block: CfnTrafficRoutingTimeBasedCanaryDsl.() -> Unit = {}) {
    val builder = CfnTrafficRoutingTimeBasedCanaryDsl()
    builder.apply(block)
    cdkBuilder.timeBasedCanary(builder.build())
  }

  public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary) {
    cdkBuilder.timeBasedCanary(timeBasedCanary)
  }

  public fun timeBasedLinear(block: CfnTrafficRoutingTimeBasedLinearDsl.() -> Unit = {}) {
    val builder = CfnTrafficRoutingTimeBasedLinearDsl()
    builder.apply(block)
    cdkBuilder.timeBasedLinear(builder.build())
  }

  public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear) {
    cdkBuilder.timeBasedLinear(timeBasedLinear)
  }

  public fun type(type: CfnTrafficRoutingType) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTrafficRoutingConfig = cdkBuilder.build()
}
