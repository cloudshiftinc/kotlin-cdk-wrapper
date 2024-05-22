@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

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
public interface CachePolicyProps {
  /**
   * A unique name to identify the cache policy.
   *
   * The name must only include '-', '_', or alphanumeric characters.
   *
   * Default: - generated from the `id`
   */
  public fun cachePolicyName(): String? = unwrap(this).getCachePolicyName()

  /**
   * A comment to describe the cache policy.
   *
   * Default: - no comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * Determines whether any cookies in viewer requests are included in the cache key and
   * automatically included in requests that CloudFront sends to the origin.
   *
   * Default: CacheCookieBehavior.none()
   */
  public fun cookieBehavior(): CacheCookieBehavior? =
      unwrap(this).getCookieBehavior()?.let(CacheCookieBehavior::wrap)

  /**
   * The default amount of time for objects to stay in the CloudFront cache.
   *
   * Only used when the origin does not send Cache-Control or Expires headers with the object.
   *
   * Default: - The greater of 1 day and ``minTtl``
   */
  public fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

  /**
   * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
   * `Accept-Encoding` header is 'br'.
   *
   * Default: false
   */
  public fun enableAcceptEncodingBrotli(): Boolean? = unwrap(this).getEnableAcceptEncodingBrotli()

  /**
   * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
   * `Accept-Encoding` header is 'gzip'.
   *
   * Default: false
   */
  public fun enableAcceptEncodingGzip(): Boolean? = unwrap(this).getEnableAcceptEncodingGzip()

  /**
   * Determines whether any HTTP headers are included in the cache key and automatically included in
   * requests that CloudFront sends to the origin.
   *
   * Default: CacheHeaderBehavior.none()
   */
  public fun headerBehavior(): CacheHeaderBehavior? =
      unwrap(this).getHeaderBehavior()?.let(CacheHeaderBehavior::wrap)

  /**
   * The maximum amount of time for objects to stay in the CloudFront cache.
   *
   * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with the
   * object.
   *
   * Default: - The greater of 1 year and ``defaultTtl``
   */
  public fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

  /**
   * The minimum amount of time for objects to stay in the CloudFront cache.
   *
   * Default: Duration.seconds(0)
   */
  public fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

  /**
   * Determines whether any query strings are included in the cache key and automatically included
   * in requests that CloudFront sends to the origin.
   *
   * Default: CacheQueryStringBehavior.none()
   */
  public fun queryStringBehavior(): CacheQueryStringBehavior? =
      unwrap(this).getQueryStringBehavior()?.let(CacheQueryStringBehavior::wrap)

  /**
   * A builder for [CachePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cachePolicyName A unique name to identify the cache policy.
     * The name must only include '-', '_', or alphanumeric characters.
     */
    public fun cachePolicyName(cachePolicyName: String)

    /**
     * @param comment A comment to describe the cache policy.
     */
    public fun comment(comment: String)

    /**
     * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin.
     */
    public fun cookieBehavior(cookieBehavior: CacheCookieBehavior)

    /**
     * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache.
     * Only used when the origin does not send Cache-Control or Expires headers with the object.
     */
    public fun defaultTtl(defaultTtl: Duration)

    /**
     * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding`
     * header in the cache key when the `Accept-Encoding` header is 'br'.
     */
    public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean)

    /**
     * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding` header
     * in the cache key when the `Accept-Encoding` header is 'gzip'.
     */
    public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean)

    /**
     * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     */
    public fun headerBehavior(headerBehavior: CacheHeaderBehavior)

    /**
     * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache.
     * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with
     * the object.
     */
    public fun maxTtl(maxTtl: Duration)

    /**
     * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache.
     */
    public fun minTtl(minTtl: Duration)

    /**
     * @param queryStringBehavior Determines whether any query strings are included in the cache key
     * and automatically included in requests that CloudFront sends to the origin.
     */
    public fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CachePolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CachePolicyProps.builder()

    /**
     * @param cachePolicyName A unique name to identify the cache policy.
     * The name must only include '-', '_', or alphanumeric characters.
     */
    override fun cachePolicyName(cachePolicyName: String) {
      cdkBuilder.cachePolicyName(cachePolicyName)
    }

    /**
     * @param comment A comment to describe the cache policy.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin.
     */
    override fun cookieBehavior(cookieBehavior: CacheCookieBehavior) {
      cdkBuilder.cookieBehavior(cookieBehavior.let(CacheCookieBehavior.Companion::unwrap))
    }

    /**
     * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache.
     * Only used when the origin does not send Cache-Control or Expires headers with the object.
     */
    override fun defaultTtl(defaultTtl: Duration) {
      cdkBuilder.defaultTtl(defaultTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding`
     * header in the cache key when the `Accept-Encoding` header is 'br'.
     */
    override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
      cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
    }

    /**
     * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding` header
     * in the cache key when the `Accept-Encoding` header is 'gzip'.
     */
    override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
      cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
    }

    /**
     * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     */
    override fun headerBehavior(headerBehavior: CacheHeaderBehavior) {
      cdkBuilder.headerBehavior(headerBehavior.let(CacheHeaderBehavior.Companion::unwrap))
    }

    /**
     * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache.
     * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with
     * the object.
     */
    override fun maxTtl(maxTtl: Duration) {
      cdkBuilder.maxTtl(maxTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache.
     */
    override fun minTtl(minTtl: Duration) {
      cdkBuilder.minTtl(minTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param queryStringBehavior Determines whether any query strings are included in the cache key
     * and automatically included in requests that CloudFront sends to the origin.
     */
    override fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior) {
      cdkBuilder.queryStringBehavior(queryStringBehavior.let(CacheQueryStringBehavior.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CachePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicyProps,
  ) : CdkObject(cdkObject), CachePolicyProps {
    /**
     * A unique name to identify the cache policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     */
    override fun cachePolicyName(): String? = unwrap(this).getCachePolicyName()

    /**
     * A comment to describe the cache policy.
     *
     * Default: - no comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     *
     * Default: CacheCookieBehavior.none()
     */
    override fun cookieBehavior(): CacheCookieBehavior? =
        unwrap(this).getCookieBehavior()?.let(CacheCookieBehavior::wrap)

    /**
     * The default amount of time for objects to stay in the CloudFront cache.
     *
     * Only used when the origin does not send Cache-Control or Expires headers with the object.
     *
     * Default: - The greater of 1 day and ``minTtl``
     */
    override fun defaultTtl(): Duration? = unwrap(this).getDefaultTtl()?.let(Duration::wrap)

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'br'.
     *
     * Default: false
     */
    override fun enableAcceptEncodingBrotli(): Boolean? =
        unwrap(this).getEnableAcceptEncodingBrotli()

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'gzip'.
     *
     * Default: false
     */
    override fun enableAcceptEncodingGzip(): Boolean? = unwrap(this).getEnableAcceptEncodingGzip()

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheHeaderBehavior.none()
     */
    override fun headerBehavior(): CacheHeaderBehavior? =
        unwrap(this).getHeaderBehavior()?.let(CacheHeaderBehavior::wrap)

    /**
     * The maximum amount of time for objects to stay in the CloudFront cache.
     *
     * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with
     * the object.
     *
     * Default: - The greater of 1 year and ``defaultTtl``
     */
    override fun maxTtl(): Duration? = unwrap(this).getMaxTtl()?.let(Duration::wrap)

    /**
     * The minimum amount of time for objects to stay in the CloudFront cache.
     *
     * Default: Duration.seconds(0)
     */
    override fun minTtl(): Duration? = unwrap(this).getMinTtl()?.let(Duration::wrap)

    /**
     * Determines whether any query strings are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheQueryStringBehavior.none()
     */
    override fun queryStringBehavior(): CacheQueryStringBehavior? =
        unwrap(this).getQueryStringBehavior()?.let(CacheQueryStringBehavior::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CachePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicyProps):
        CachePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CachePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CachePolicyProps):
        software.amazon.awscdk.services.cloudfront.CachePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CachePolicyProps
  }
}
