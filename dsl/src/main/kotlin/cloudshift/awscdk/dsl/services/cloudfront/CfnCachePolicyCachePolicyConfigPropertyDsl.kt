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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

/**
 * A cache policy configuration.
 *
 * This configuration determines the following:
 * * The values that CloudFront includes in the cache key. These values can include HTTP headers,
 *   cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache
 *   that it can return to the viewer.
 * * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in
 *   the CloudFront cache.
 *
 * The headers, cookies, and query strings that are included in the cache key are also included in
 * requests that CloudFront sends to the origin. CloudFront sends a request when it can't find a
 * valid object in its cache that matches the request's cache key. If you want to send values to the
 * origin but *not* include them in the cache key, use `OriginRequestPolicy` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CachePolicyConfigProperty cachePolicyConfigProperty = CachePolicyConfigProperty.builder()
 * .defaultTtl(123)
 * .maxTtl(123)
 * .minTtl(123)
 * .name("name")
 * .parametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOriginProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .comment("comment")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html)
 */
@CdkDslMarker
public class CfnCachePolicyCachePolicyConfigPropertyDsl {
    private val cdkBuilder: CfnCachePolicy.CachePolicyConfigProperty.Builder =
        CfnCachePolicy.CachePolicyConfigProperty.builder()

    /**
     * @param comment A comment to describe the cache policy. The comment cannot be longer than 128
     *   characters.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param defaultTtl The default amount of time, in seconds, that you want objects to stay in
     *   the CloudFront cache before CloudFront sends another request to the origin to see if the
     *   object has been updated. CloudFront uses this value as the object's time to live (TTL) only
     *   when the origin does *not* send `Cache-Control` or `Expires` headers with the object. For
     *   more information, see
     *   [Managing How Long Content Stays in an Edge Cache (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * The default value for this field is 86400 seconds (one day). If the value of `MinTTL` is more
     * than 86400 seconds, then the default value for this field is the same as the value of
     * `MinTTL` .
     */
    public fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    /**
     * @param maxTtl The maximum amount of time, in seconds, that objects stay in the CloudFront
     *   cache before CloudFront sends another request to the origin to see if the object has been
     *   updated. CloudFront uses this value only when the origin sends `Cache-Control` or `Expires`
     *   headers with the object. For more information, see
     *   [Managing How Long Content Stays in an Edge Cache (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * The default value for this field is 31536000 seconds (one year). If the value of `MinTTL` or
     * `DefaultTTL` is more than 31536000 seconds, then the default value for this field is the same
     * as the value of `DefaultTTL` .
     */
    public fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
    }

    /**
     * @param minTtl The minimum amount of time, in seconds, that you want objects to stay in the
     *   CloudFront cache before CloudFront sends another request to the origin to see if the object
     *   has been updated. For more information, see
     *   [Managing How Long Content Stays in an Edge Cache (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
    }

    /** @param name A unique name to identify the cache policy. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
     *   strings to include in the cache key. The values included in the cache key are also included
     *   in requests that CloudFront sends to the origin.
     */
    public fun parametersInCacheKeyAndForwardedToOrigin(
        parametersInCacheKeyAndForwardedToOrigin: IResolvable
    ) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(
            parametersInCacheKeyAndForwardedToOrigin
        )
    }

    /**
     * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
     *   strings to include in the cache key. The values included in the cache key are also included
     *   in requests that CloudFront sends to the origin.
     */
    public fun parametersInCacheKeyAndForwardedToOrigin(
        parametersInCacheKeyAndForwardedToOrigin:
            CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty
    ) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(
            parametersInCacheKeyAndForwardedToOrigin
        )
    }

    public fun build(): CfnCachePolicy.CachePolicyConfigProperty = cdkBuilder.build()
}
