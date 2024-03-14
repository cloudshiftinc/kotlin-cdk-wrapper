package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class CacheCookieBehavior internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CacheCookieBehavior,
) {
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
