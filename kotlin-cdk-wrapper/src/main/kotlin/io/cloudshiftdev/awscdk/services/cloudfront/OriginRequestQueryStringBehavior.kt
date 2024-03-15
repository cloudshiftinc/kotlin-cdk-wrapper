@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Determines whether any URL query strings in viewer requests (and if so, which query strings) are
 * included in requests that CloudFront sends to the origin.
 *
 * Example:
 *
 * ```
 * // Creating a custom origin request policy for a Distribution -- all parameters optional
 * S3Origin bucketOrigin;
 * OriginRequestPolicy myOriginRequestPolicy = OriginRequestPolicy.Builder.create(this,
 * "OriginRequestPolicy")
 * .originRequestPolicyName("MyPolicy")
 * .comment("A default policy")
 * .cookieBehavior(OriginRequestCookieBehavior.none())
 * .headerBehavior(OriginRequestHeaderBehavior.all("CloudFront-Is-Android-Viewer"))
 * .queryStringBehavior(OriginRequestQueryStringBehavior.allowList("username"))
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .originRequestPolicy(myOriginRequestPolicy)
 * .build())
 * .build();
 * ```
 */
public open class OriginRequestQueryStringBehavior internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior,
) : CdkObject(cdkObject) {
  /**
   * The behavior of query strings -- allow all, none, or only an allow list.
   */
  public open fun behavior(): String = unwrap(this).getBehavior()

  /**
   * The query strings to allow, if the behavior is an allow list.
   */
  public open fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

  public companion object {
    public fun all(): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.all().let(OriginRequestQueryStringBehavior::wrap)

    public fun allowList(queryStrings: String): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.allowList(queryStrings).let(OriginRequestQueryStringBehavior::wrap)

    public fun denyList(queryStrings: String): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.denyList(queryStrings).let(OriginRequestQueryStringBehavior::wrap)

    public fun none(): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.none().let(OriginRequestQueryStringBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior):
        OriginRequestQueryStringBehavior = OriginRequestQueryStringBehavior(cdkObject)

    internal fun unwrap(wrapped: OriginRequestQueryStringBehavior):
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior =
        wrapped.cdkObject
  }
}
