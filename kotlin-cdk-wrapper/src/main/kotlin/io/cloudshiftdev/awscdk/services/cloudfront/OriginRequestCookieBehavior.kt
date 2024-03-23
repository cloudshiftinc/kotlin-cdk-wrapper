@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Determines whether any cookies in viewer requests (and if so, which cookies) are included in
 * requests that CloudFront sends to the origin.
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
public open class OriginRequestCookieBehavior(
  cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior,
) : CdkObject(cdkObject) {
  /**
   * The behavior of cookies: allow all, none or an allow list.
   */
  public open fun behavior(): String = unwrap(this).getBehavior()

  /**
   * The cookies to allow, if the behavior is an allow list.
   */
  public open fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()

  public companion object {
    public fun all(): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.all().let(OriginRequestCookieBehavior::wrap)

    public fun allowList(cookies: String): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.allowList(cookies).let(OriginRequestCookieBehavior::wrap)

    public fun denyList(cookies: String): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.denyList(cookies).let(OriginRequestCookieBehavior::wrap)

    public fun none(): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.none().let(OriginRequestCookieBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior):
        OriginRequestCookieBehavior = OriginRequestCookieBehavior(cdkObject)

    internal fun unwrap(wrapped: OriginRequestCookieBehavior):
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior = wrapped.cdkObject
        as software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior
  }
}
