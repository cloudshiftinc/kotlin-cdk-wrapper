@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.CacheCookieBehavior
import software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior
import software.amazon.awscdk.services.cloudfront.CachePolicyProps
import software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior

/**
 * Properties for creating a Cache Policy.
 *
 * Example:
 *
 * ```
 * // Creating a custom cache policy for a Distribution -- all parameters optional
 * S3Origin bucketOrigin;
 * CachePolicy myCachePolicy = CachePolicy.Builder.create(this, "myCachePolicy")
 * .cachePolicyName("MyPolicy")
 * .comment("A default policy")
 * .defaultTtl(Duration.days(2))
 * .minTtl(Duration.minutes(1))
 * .maxTtl(Duration.days(10))
 * .cookieBehavior(CacheCookieBehavior.all())
 * .headerBehavior(CacheHeaderBehavior.allowList("X-CustomHeader"))
 * .queryStringBehavior(CacheQueryStringBehavior.denyList("username"))
 * .enableAcceptEncodingGzip(true)
 * .enableAcceptEncodingBrotli(true)
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .cachePolicy(myCachePolicy)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CachePolicyPropsDsl {
  private val cdkBuilder: CachePolicyProps.Builder = CachePolicyProps.builder()

  /**
   * @param cachePolicyName A unique name to identify the cache policy.
   * The name must only include '-', '_', or alphanumeric characters.
   */
  public fun cachePolicyName(cachePolicyName: String) {
    cdkBuilder.cachePolicyName(cachePolicyName)
  }

  /**
   * @param comment A comment to describe the cache policy.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
   * cache key and automatically included in requests that CloudFront sends to the origin.
   */
  public fun cookieBehavior(cookieBehavior: CacheCookieBehavior) {
    cdkBuilder.cookieBehavior(cookieBehavior)
  }

  /**
   * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache.
   * Only used when the origin does not send Cache-Control or Expires headers with the object.
   */
  public fun defaultTtl(defaultTtl: Duration) {
    cdkBuilder.defaultTtl(defaultTtl)
  }

  /**
   * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding` header
   * in the cache key when the `Accept-Encoding` header is 'br'.
   */
  public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
    cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
  }

  /**
   * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding` header
   * in the cache key when the `Accept-Encoding` header is 'gzip'.
   */
  public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
    cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
  }

  /**
   * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
   * automatically included in requests that CloudFront sends to the origin.
   */
  public fun headerBehavior(headerBehavior: CacheHeaderBehavior) {
    cdkBuilder.headerBehavior(headerBehavior)
  }

  /**
   * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache.
   * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with the
   * object.
   */
  public fun maxTtl(maxTtl: Duration) {
    cdkBuilder.maxTtl(maxTtl)
  }

  /**
   * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache.
   */
  public fun minTtl(minTtl: Duration) {
    cdkBuilder.minTtl(minTtl)
  }

  /**
   * @param queryStringBehavior Determines whether any query strings are included in the cache key
   * and automatically included in requests that CloudFront sends to the origin.
   */
  public fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior) {
    cdkBuilder.queryStringBehavior(queryStringBehavior)
  }

  public fun build(): CachePolicyProps = cdkBuilder.build()
}
