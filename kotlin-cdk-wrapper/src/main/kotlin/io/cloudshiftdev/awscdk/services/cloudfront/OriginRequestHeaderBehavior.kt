@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Determines whether any HTTP headers (and if so, which headers) are included in requests that
 * CloudFront sends to the origin.
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
public open class OriginRequestHeaderBehavior(
  cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior,
) : CdkObject(cdkObject) {
  /**
   * The behavior of headers: allow all, none or an allow list.
   */
  public open fun behavior(): String = unwrap(this).getBehavior()

  /**
   * The headers for the allow list or the included CloudFront headers, if applicable.
   */
  public open fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

  public companion object {
    public fun all(cloudfrontHeaders: String): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.all(cloudfrontHeaders).let(OriginRequestHeaderBehavior::wrap)

    public fun allowList(headers: String): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.allowList(headers).let(OriginRequestHeaderBehavior::wrap)

    public fun denyList(headers: String): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.denyList(headers).let(OriginRequestHeaderBehavior::wrap)

    public fun none(): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.none().let(OriginRequestHeaderBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior):
        OriginRequestHeaderBehavior = OriginRequestHeaderBehavior(cdkObject)

    internal fun unwrap(wrapped: OriginRequestHeaderBehavior):
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior = wrapped.cdkObject
        as software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior
  }
}
