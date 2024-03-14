package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class OriginRequestCookieBehavior internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior,
) {
  public open fun behavior(): String = unwrap(this).getBehavior()

  public open fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()

  public companion object {
    public open fun all(): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.all().let(OriginRequestCookieBehavior::wrap)

    public open fun allowList(cookies: String): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.allowList(cookies).let(OriginRequestCookieBehavior::wrap)

    public open fun denyList(cookies: String): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.denyList(cookies).let(OriginRequestCookieBehavior::wrap)

    public open fun none(): OriginRequestCookieBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior.none().let(OriginRequestCookieBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior):
        OriginRequestCookieBehavior = OriginRequestCookieBehavior(cdkObject)

    internal fun unwrap(wrapped: OriginRequestCookieBehavior):
        software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior = wrapped.cdkObject
  }
}
