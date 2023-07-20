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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod
import kotlin.Unit

@CdkDslMarker
public class ThrottlingPerMethodDsl {
    private val cdkBuilder: ThrottlingPerMethod.Builder = ThrottlingPerMethod.builder()

    public fun method(method: Method) {
        cdkBuilder.method(method)
    }

    public fun throttle(block: ThrottleSettingsDsl.() -> Unit = {}) {
        val builder = ThrottleSettingsDsl()
        builder.apply(block)
        cdkBuilder.throttle(builder.build())
    }

    public fun throttle(throttle: ThrottleSettings) {
        cdkBuilder.throttle(throttle)
    }

    public fun build(): ThrottlingPerMethod = cdkBuilder.build()
}
