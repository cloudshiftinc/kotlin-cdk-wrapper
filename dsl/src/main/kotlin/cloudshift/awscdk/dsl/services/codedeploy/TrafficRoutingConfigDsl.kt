@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class TrafficRoutingConfigDsl {
    private val cdkBuilder: TrafficRoutingConfig.Builder = TrafficRoutingConfig.builder()

    public fun timeBasedCanary(block: CanaryTrafficRoutingConfigDsl.() -> Unit = {}) {
        val builder = CanaryTrafficRoutingConfigDsl()
        builder.apply(block)
        cdkBuilder.timeBasedCanary(builder.build())
    }

    public fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig) {
        cdkBuilder.timeBasedCanary(timeBasedCanary)
    }

    public fun timeBasedLinear(block: LinearTrafficRoutingConfigDsl.() -> Unit = {}) {
        val builder = LinearTrafficRoutingConfigDsl()
        builder.apply(block)
        cdkBuilder.timeBasedLinear(builder.build())
    }

    public fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig) {
        cdkBuilder.timeBasedLinear(timeBasedLinear)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): TrafficRoutingConfig = cdkBuilder.build()
}
