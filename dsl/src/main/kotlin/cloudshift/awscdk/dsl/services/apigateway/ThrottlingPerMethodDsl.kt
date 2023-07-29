@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.ThrottlingPerMethod

/**
 * Represents per-method throttling for a resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * Method method;
 * ThrottlingPerMethod throttlingPerMethod = ThrottlingPerMethod.builder()
 * .method(method)
 * .throttle(ThrottleSettings.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ThrottlingPerMethodDsl {
    private val cdkBuilder: ThrottlingPerMethod.Builder = ThrottlingPerMethod.builder()

    /**
     * @param method [disable-awslint:ref-via-interface] The method for which you specify the
     *   throttling settings.
     */
    public fun method(method: Method) {
        cdkBuilder.method(method)
    }

    /**
     * @param throttle Specifies the overall request rate (average requests per second) and burst
     *   capacity.
     */
    public fun throttle(throttle: ThrottleSettingsDsl.() -> Unit = {}) {
        val builder = ThrottleSettingsDsl()
        builder.apply(throttle)
        cdkBuilder.throttle(builder.build())
    }

    /**
     * @param throttle Specifies the overall request rate (average requests per second) and burst
     *   capacity.
     */
    public fun throttle(throttle: ThrottleSettings) {
        cdkBuilder.throttle(throttle)
    }

    public fun build(): ThrottlingPerMethod = cdkBuilder.build()
}
