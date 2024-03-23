@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Determines whether any URL query strings in viewer requests are included in the cache key and
 * automatically included in requests that CloudFront sends to the origin.
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
public open class CacheQueryStringBehavior(
  cdkObject: software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior,
) : CdkObject(cdkObject) {
  /**
   * The behavior of query strings -- allow all, none, only an allow list, or a deny list.
   */
  public open fun behavior(): String = unwrap(this).getBehavior()

  /**
   * The query strings to allow or deny, if the behavior is an allow or deny list.
   */
  public open fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

  public companion object {
    public fun all(): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.all().let(CacheQueryStringBehavior::wrap)

    public fun allowList(queryStrings: String): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.allowList(queryStrings).let(CacheQueryStringBehavior::wrap)

    public fun denyList(queryStrings: String): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.denyList(queryStrings).let(CacheQueryStringBehavior::wrap)

    public fun none(): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.none().let(CacheQueryStringBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior):
        CacheQueryStringBehavior = CacheQueryStringBehavior(cdkObject)

    internal fun unwrap(wrapped: CacheQueryStringBehavior):
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior
  }
}
