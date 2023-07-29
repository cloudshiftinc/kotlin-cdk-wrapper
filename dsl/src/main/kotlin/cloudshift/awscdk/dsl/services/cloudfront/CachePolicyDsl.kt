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
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.CacheCookieBehavior
import software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior
import software.amazon.awscdk.services.cloudfront.CachePolicy
import software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior
import software.constructs.Construct

/**
 * A Cache Policy configuration.
 *
 * Example:
 * ```
 * // Using an existing cache policy for a Distribution
 * S3Origin bucketOrigin;
 * Distribution.Builder.create(this, "myDistManagedPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .cachePolicy(CachePolicy.CACHING_OPTIMIZED)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CachePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CachePolicy.Builder = CachePolicy.Builder.create(scope, id)

    /**
     * A unique name to identify the cache policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     *
     * @param cachePolicyName A unique name to identify the cache policy.
     */
    public fun cachePolicyName(cachePolicyName: String) {
        cdkBuilder.cachePolicyName(cachePolicyName)
    }

    /**
     * A comment to describe the cache policy.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the cache policy.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     *
     * Default: CacheCookieBehavior.none()
     *
     * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
     *   cache key and automatically included in requests that CloudFront sends to the origin.
     */
    public fun cookieBehavior(cookieBehavior: CacheCookieBehavior) {
        cdkBuilder.cookieBehavior(cookieBehavior)
    }

    /**
     * The default amount of time for objects to stay in the CloudFront cache.
     *
     * Only used when the origin does not send Cache-Control or Expires headers with the object.
     *
     * Default: - The greater of 1 day and ``minTtl``
     *
     * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache.
     */
    public fun defaultTtl(defaultTtl: Duration) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'br'.
     *
     * Default: false
     *
     * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding`
     *   header in the cache key when the `Accept-Encoding` header is 'br'.
     */
    public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
    }

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'gzip'.
     *
     * Default: false
     *
     * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding` header
     *   in the cache key when the `Accept-Encoding` header is 'gzip'.
     */
    public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
    }

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheHeaderBehavior.none()
     *
     * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
     *   automatically included in requests that CloudFront sends to the origin.
     */
    public fun headerBehavior(headerBehavior: CacheHeaderBehavior) {
        cdkBuilder.headerBehavior(headerBehavior)
    }

    /**
     * The maximum amount of time for objects to stay in the CloudFront cache.
     *
     * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with
     * the object.
     *
     * Default: - The greater of 1 year and ``defaultTtl``
     *
     * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache.
     */
    public fun maxTtl(maxTtl: Duration) {
        cdkBuilder.maxTtl(maxTtl)
    }

    /**
     * The minimum amount of time for objects to stay in the CloudFront cache.
     *
     * Default: Duration.seconds(0)
     *
     * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache.
     */
    public fun minTtl(minTtl: Duration) {
        cdkBuilder.minTtl(minTtl)
    }

    /**
     * Determines whether any query strings are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheQueryStringBehavior.none()
     *
     * @param queryStringBehavior Determines whether any query strings are included in the cache key
     *   and automatically included in requests that CloudFront sends to the origin.
     */
    public fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
    }

    public fun build(): CachePolicy = cdkBuilder.build()
}
