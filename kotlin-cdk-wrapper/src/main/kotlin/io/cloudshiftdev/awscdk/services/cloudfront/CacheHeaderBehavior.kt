@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Determines whether any HTTP headers are included in the cache key and automatically included in
 * requests that CloudFront sends to the origin.
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
public open class CacheHeaderBehavior internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior,
) : CdkObject(cdkObject) {
  /**
   * If no headers will be passed, or an allow list of headers.
   */
  public open fun behavior(): String = unwrap(this).getBehavior()

  /**
   * The headers for the allow/deny list, if applicable.
   */
  public open fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

  public companion object {
    public fun allowList(headers: String): CacheHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior.allowList(headers).let(CacheHeaderBehavior::wrap)

    public fun none(): CacheHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior.none().let(CacheHeaderBehavior::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior):
        CacheHeaderBehavior = CacheHeaderBehavior(cdkObject)

    internal fun unwrap(wrapped: CacheHeaderBehavior):
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior = wrapped.cdkObject
  }
}
