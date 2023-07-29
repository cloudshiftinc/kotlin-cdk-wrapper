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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * A configuration for enabling the `Server-Timing` header in HTTP responses sent from CloudFront.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ServerTimingHeadersConfigProperty serverTimingHeadersConfigProperty =
 * ServerTimingHeadersConfigProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .samplingRate(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-servertimingheadersconfig.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyServerTimingHeadersConfigPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.Builder =
        CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.builder()

    /**
     * @param enabled A Boolean that determines whether CloudFront adds the `Server-Timing` header
     *   to HTTP responses that it sends in response to requests that match a cache behavior that's
     *   associated with this response headers policy.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A Boolean that determines whether CloudFront adds the `Server-Timing` header
     *   to HTTP responses that it sends in response to requests that match a cache behavior that's
     *   associated with this response headers policy.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param samplingRate A number 0–100 (inclusive) that specifies the percentage of responses
     *   that you want CloudFront to add the `Server-Timing` header to. When you set the sampling
     *   rate to 100, CloudFront adds the `Server-Timing` header to the HTTP response for every
     *   request that matches the cache behavior that this response headers policy is attached to.
     *   When you set it to 50, CloudFront adds the header to 50% of the responses for requests that
     *   match the cache behavior. You can set the sampling rate to any number 0–100 with up to four
     *   decimal places.
     */
    public fun samplingRate(samplingRate: Number) {
        cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty =
        cdkBuilder.build()
}
