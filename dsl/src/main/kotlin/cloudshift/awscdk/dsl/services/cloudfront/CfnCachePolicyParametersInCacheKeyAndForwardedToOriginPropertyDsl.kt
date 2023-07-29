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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

/**
 * This object determines the values that CloudFront includes in the cache key.
 *
 * These values can include HTTP headers, cookies, and URL query strings. CloudFront uses the cache
 * key to find an object in its cache that it can return to the viewer.
 *
 * The headers, cookies, and query strings that are included in the cache key are also included in
 * requests that CloudFront sends to the origin. CloudFront sends a request when it can't find an
 * object in its cache that matches the request's cache key. If you want to send values to the
 * origin but *not* include them in the cache key, use `OriginRequestPolicy` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ParametersInCacheKeyAndForwardedToOriginProperty parametersInCacheKeyAndForwardedToOriginProperty
 * = ParametersInCacheKeyAndForwardedToOriginProperty.builder()
 * .cookiesConfig(CookiesConfigProperty.builder()
 * .cookieBehavior("cookieBehavior")
 * // the properties below are optional
 * .cookies(List.of("cookies"))
 * .build())
 * .enableAcceptEncodingGzip(false)
 * .headersConfig(HeadersConfigProperty.builder()
 * .headerBehavior("headerBehavior")
 * // the properties below are optional
 * .headers(List.of("headers"))
 * .build())
 * .queryStringsConfig(QueryStringsConfigProperty.builder()
 * .queryStringBehavior("queryStringBehavior")
 * // the properties below are optional
 * .queryStrings(List.of("queryStrings"))
 * .build())
 * // the properties below are optional
 * .enableAcceptEncodingBrotli(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html)
 */
@CdkDslMarker
public class CfnCachePolicyParametersInCacheKeyAndForwardedToOriginPropertyDsl {
    private val cdkBuilder:
        CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.Builder =
        CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.builder()

    /**
     * @param cookiesConfig An object that determines whether any cookies in viewer requests (and if
     *   so, which cookies) are included in the cache key and in requests that CloudFront sends to
     *   the origin.
     */
    public fun cookiesConfig(cookiesConfig: IResolvable) {
        cdkBuilder.cookiesConfig(cookiesConfig)
    }

    /**
     * @param cookiesConfig An object that determines whether any cookies in viewer requests (and if
     *   so, which cookies) are included in the cache key and in requests that CloudFront sends to
     *   the origin.
     */
    public fun cookiesConfig(cookiesConfig: CfnCachePolicy.CookiesConfigProperty) {
        cdkBuilder.cookiesConfig(cookiesConfig)
    }

    /**
     * @param enableAcceptEncodingBrotli A flag that can affect whether the `Accept-Encoding` HTTP
     *   header is included in the cache key and included in requests that CloudFront sends to the
     *   origin. This field is related to the `EnableAcceptEncodingGzip` field. If one or both of
     *   these fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
     *   CloudFront does the following:
     * * Normalizes the value of the viewer's `Accept-Encoding` header
     * * Includes the normalized header in the cache key
     * * Includes the normalized header in the request to the origin, if a request is necessary
     *
     * For more information, see
     * [Compression support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you set this value to `true` , and this cache behavior also has an origin request policy
     * attached, do not include the `Accept-Encoding` header in the origin request policy.
     * CloudFront always includes the `Accept-Encoding` header in origin requests when the value of
     * this field is `true` , so including this header in an origin request policy has no effect.
     *
     * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header the
     * same as any other HTTP header in the viewer request. By default, it's not included in the
     * cache key and it's not included in origin requests. In this case, you can manually add
     * `Accept-Encoding` to the headers whitelist like any other HTTP header.
     */
    public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
    }

    /**
     * @param enableAcceptEncodingBrotli A flag that can affect whether the `Accept-Encoding` HTTP
     *   header is included in the cache key and included in requests that CloudFront sends to the
     *   origin. This field is related to the `EnableAcceptEncodingGzip` field. If one or both of
     *   these fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
     *   CloudFront does the following:
     * * Normalizes the value of the viewer's `Accept-Encoding` header
     * * Includes the normalized header in the cache key
     * * Includes the normalized header in the request to the origin, if a request is necessary
     *
     * For more information, see
     * [Compression support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you set this value to `true` , and this cache behavior also has an origin request policy
     * attached, do not include the `Accept-Encoding` header in the origin request policy.
     * CloudFront always includes the `Accept-Encoding` header in origin requests when the value of
     * this field is `true` , so including this header in an origin request policy has no effect.
     *
     * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header the
     * same as any other HTTP header in the viewer request. By default, it's not included in the
     * cache key and it's not included in origin requests. In this case, you can manually add
     * `Accept-Encoding` to the headers whitelist like any other HTTP header.
     */
    public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: IResolvable) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
    }

    /**
     * @param enableAcceptEncodingGzip A flag that can affect whether the `Accept-Encoding` HTTP
     *   header is included in the cache key and included in requests that CloudFront sends to the
     *   origin. This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of
     *   these fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
     *   CloudFront does the following:
     * * Normalizes the value of the viewer's `Accept-Encoding` header
     * * Includes the normalized header in the cache key
     * * Includes the normalized header in the request to the origin, if a request is necessary
     *
     * For more information, see
     * [Compression support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you set this value to `true` , and this cache behavior also has an origin request policy
     * attached, do not include the `Accept-Encoding` header in the origin request policy.
     * CloudFront always includes the `Accept-Encoding` header in origin requests when the value of
     * this field is `true` , so including this header in an origin request policy has no effect.
     *
     * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header the
     * same as any other HTTP header in the viewer request. By default, it's not included in the
     * cache key and it's not included in origin requests. In this case, you can manually add
     * `Accept-Encoding` to the headers whitelist like any other HTTP header.
     */
    public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
    }

    /**
     * @param enableAcceptEncodingGzip A flag that can affect whether the `Accept-Encoding` HTTP
     *   header is included in the cache key and included in requests that CloudFront sends to the
     *   origin. This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of
     *   these fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
     *   CloudFront does the following:
     * * Normalizes the value of the viewer's `Accept-Encoding` header
     * * Includes the normalized header in the cache key
     * * Includes the normalized header in the request to the origin, if a request is necessary
     *
     * For more information, see
     * [Compression support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you set this value to `true` , and this cache behavior also has an origin request policy
     * attached, do not include the `Accept-Encoding` header in the origin request policy.
     * CloudFront always includes the `Accept-Encoding` header in origin requests when the value of
     * this field is `true` , so including this header in an origin request policy has no effect.
     *
     * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header the
     * same as any other HTTP header in the viewer request. By default, it's not included in the
     * cache key and it's not included in origin requests. In this case, you can manually add
     * `Accept-Encoding` to the headers whitelist like any other HTTP header.
     */
    public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: IResolvable) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
    }

    /**
     * @param headersConfig An object that determines whether any HTTP headers (and if so, which
     *   headers) are included in the cache key and in requests that CloudFront sends to the origin.
     */
    public fun headersConfig(headersConfig: IResolvable) {
        cdkBuilder.headersConfig(headersConfig)
    }

    /**
     * @param headersConfig An object that determines whether any HTTP headers (and if so, which
     *   headers) are included in the cache key and in requests that CloudFront sends to the origin.
     */
    public fun headersConfig(headersConfig: CfnCachePolicy.HeadersConfigProperty) {
        cdkBuilder.headersConfig(headersConfig)
    }

    /**
     * @param queryStringsConfig An object that determines whether any URL query strings in viewer
     *   requests (and if so, which query strings) are included in the cache key and in requests
     *   that CloudFront sends to the origin.
     */
    public fun queryStringsConfig(queryStringsConfig: IResolvable) {
        cdkBuilder.queryStringsConfig(queryStringsConfig)
    }

    /**
     * @param queryStringsConfig An object that determines whether any URL query strings in viewer
     *   requests (and if so, which query strings) are included in the cache key and in requests
     *   that CloudFront sends to the origin.
     */
    public fun queryStringsConfig(queryStringsConfig: CfnCachePolicy.QueryStringsConfigProperty) {
        cdkBuilder.queryStringsConfig(queryStringsConfig)
    }

    public fun build(): CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty =
        cdkBuilder.build()
}
