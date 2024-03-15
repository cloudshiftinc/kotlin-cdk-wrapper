@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class CacheCookieBehavior internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CacheCookieBehavior,
) : CdkObject(cdkObject) {
  public open fun behavior(): String = unwrap(this).getBehavior()

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
