@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Determines whether any cookies in viewer requests are included in the cache key and automatically
 * included in requests that CloudFront sends to the origin.
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
public open class CacheCookieBehavior internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CacheCookieBehavior,
) : CdkObject(cdkObject) {
  /**
   * The behavior of cookies: allow all, none, an allow list, or a deny list.
   */
  public open fun behavior(): String = unwrap(this).getBehavior()

  /**
   * The cookies to allow or deny, if the behavior is an allow or deny list.
   */
  public open fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()

  public companion object {
    public fun all(): CacheCookieBehavior =
        software.amazon.awscdk.services.cloudfront.CacheCookieBehavior.all().let(CacheCookieBehavior::wrap)

    public fun allowList(cookies: String): CacheCookieBehavior =
        software.amazon.awscdk.services.cloudfront.CacheCookieBehavior.allowList(cookies).let(CacheCookieBehavior::wrap)

    public fun denyList(cookies: String): CacheCookieBehavior =
        software.amazon.awscdk.services.cloudfront.CacheCookieBehavior.denyList(cookies).let(CacheCookieBehavior::wrap)

    public fun none(): CacheCookieBehavior =
        software.amazon.awscdk.services.cloudfront.CacheCookieBehavior.none().let(CacheCookieBehavior::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CacheCookieBehavior):
        CacheCookieBehavior = CacheCookieBehavior(cdkObject)

    internal fun unwrap(wrapped: CacheCookieBehavior):
        software.amazon.awscdk.services.cloudfront.CacheCookieBehavior = wrapped.cdkObject
  }
}
