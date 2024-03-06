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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings

/**
 * Container for defining throttling parameters to API stages.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ThrottleSettings throttleSettings = ThrottleSettings.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ThrottleSettingsDsl {
    private val cdkBuilder: ThrottleSettings.Builder = ThrottleSettings.builder()

    /**
     * @param burstLimit The maximum API request rate limit over a time ranging from one to a few
     *   seconds.
     */
    public fun burstLimit(burstLimit: Number) {
        cdkBuilder.burstLimit(burstLimit)
    }

    /**
     * @param rateLimit The API request steady-state rate limit (average requests per second over an
     *   extended period of time).
     */
    public fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): ThrottleSettings = cdkBuilder.build()
}
