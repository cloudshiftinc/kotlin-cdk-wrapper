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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.OriginOptions

/**
 * Options to define an Origin.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginOptions originOptions = OriginOptions.builder()
 * .connectionAttempts(123)
 * .connectionTimeout(Duration.minutes(30))
 * .customHeaders(Map.of(
 * "customHeadersKey", "customHeaders"))
 * .originId("originId")
 * .originShieldEnabled(false)
 * .originShieldRegion("originShieldRegion")
 * .build();
 * ```
 */
@CdkDslMarker
public class OriginOptionsDsl {
    private val cdkBuilder: OriginOptions.Builder = OriginOptions.builder()

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     *   origin;. valid values are 1, 2, or 3 attempts.
     */
    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     *   a connection to the origin. Valid values are 1-10 seconds, inclusive.
     */
    public fun connectionTimeout(connectionTimeout: Duration) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    /**
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     *   it sends to the origin.
     */
    public fun customHeaders(customHeaders: Map<String, String>) {
        cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * @param originId A unique identifier for the origin. This value must be unique within the
     *   distribution.
     */
    public fun originId(originId: String) {
        cdkBuilder.originId(originId)
    }

    /**
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     *   region, after this to disable Origin Shield again you must set this flag to false.
     */
    public fun originShieldEnabled(originShieldEnabled: Boolean) {
        cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     *   latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): OriginOptions = cdkBuilder.build()
}
