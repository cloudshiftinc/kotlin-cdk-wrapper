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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * A configuration for a set of HTTP response headers that are used for cross-origin resource
 * sharing (CORS).
 *
 * CloudFront adds these headers to HTTP responses that it sends for CORS requests that match a
 * cache behavior associated with this response headers policy.
 *
 * For more information about CORS, see
 * [Cross-Origin Resource Sharing (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
 * in the MDN Web Docs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CorsConfigProperty corsConfigProperty = CorsConfigProperty.builder()
 * .accessControlAllowCredentials(false)
 * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .originOverride(false)
 * // the properties below are optional
 * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlMaxAgeSec(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyCorsConfigPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.CorsConfigProperty.Builder =
        CfnResponseHeadersPolicy.CorsConfigProperty.builder()

    /**
     * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
     *   `Access-Control-Allow-Credentials` HTTP response header. For more information about the
     *   `Access-Control-Allow-Credentials` HTTP response header, see
     *   [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
        cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
    }

    /**
     * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
     *   `Access-Control-Allow-Credentials` HTTP response header. For more information about the
     *   `Access-Control-Allow-Credentials` HTTP response header, see
     *   [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowCredentials(accessControlAllowCredentials: IResolvable) {
        cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
    }

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     *   values for the `Access-Control-Allow-Headers` HTTP response header. For more information
     *   about the `Access-Control-Allow-Headers` HTTP response header, see
     *   [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowHeaders(accessControlAllowHeaders: IResolvable) {
        cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders)
    }

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     *   values for the `Access-Control-Allow-Headers` HTTP response header. For more information
     *   about the `Access-Control-Allow-Headers` HTTP response header, see
     *   [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowHeaders(
        accessControlAllowHeaders: CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty
    ) {
        cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders)
    }

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     *   for the `Access-Control-Allow-Methods` HTTP response header. For more information about the
     *   `Access-Control-Allow-Methods` HTTP response header, see
     *   [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowMethods(accessControlAllowMethods: IResolvable) {
        cdkBuilder.accessControlAllowMethods(accessControlAllowMethods)
    }

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     *   for the `Access-Control-Allow-Methods` HTTP response header. For more information about the
     *   `Access-Control-Allow-Methods` HTTP response header, see
     *   [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowMethods(
        accessControlAllowMethods: CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty
    ) {
        cdkBuilder.accessControlAllowMethods(accessControlAllowMethods)
    }

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     *   the value for the `Access-Control-Allow-Origin` HTTP response header. For more information
     *   about the `Access-Control-Allow-Origin` HTTP response header, see
     *   [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowOrigins(accessControlAllowOrigins: IResolvable) {
        cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins)
    }

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     *   the value for the `Access-Control-Allow-Origin` HTTP response header. For more information
     *   about the `Access-Control-Allow-Origin` HTTP response header, see
     *   [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
     *   in the MDN Web Docs.
     */
    public fun accessControlAllowOrigins(
        accessControlAllowOrigins: CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty
    ) {
        cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins)
    }

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     *   for the `Access-Control-Expose-Headers` HTTP response header. For more information about
     *   the `Access-Control-Expose-Headers` HTTP response header, see
     *   [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
     *   in the MDN Web Docs.
     */
    public fun accessControlExposeHeaders(accessControlExposeHeaders: IResolvable) {
        cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders)
    }

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     *   for the `Access-Control-Expose-Headers` HTTP response header. For more information about
     *   the `Access-Control-Expose-Headers` HTTP response header, see
     *   [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
     *   in the MDN Web Docs.
     */
    public fun accessControlExposeHeaders(
        accessControlExposeHeaders: CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty
    ) {
        cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders)
    }

    /**
     * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the
     *   `Access-Control-Max-Age` HTTP response header. For more information about the
     *   `Access-Control-Max-Age` HTTP response header, see
     *   [Access-Control-Max-Age](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age)
     *   in the MDN Web Docs.
     */
    public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
        cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
    }

    /**
     * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
     *   headers received from the origin with the ones specified in this response headers policy.
     */
    public fun originOverride(originOverride: Boolean) {
        cdkBuilder.originOverride(originOverride)
    }

    /**
     * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
     *   headers received from the origin with the ones specified in this response headers policy.
     */
    public fun originOverride(originOverride: IResolvable) {
        cdkBuilder.originOverride(originOverride)
    }

    public fun build(): CfnResponseHeadersPolicy.CorsConfigProperty = cdkBuilder.build()
}
