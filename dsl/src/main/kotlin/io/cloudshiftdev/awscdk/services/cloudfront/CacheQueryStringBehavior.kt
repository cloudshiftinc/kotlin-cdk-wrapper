package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class CacheQueryStringBehavior internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior,
) {
  public open fun behavior(): String = unwrap(this).getBehavior()

  public open fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

  public companion object {
    public open fun all(): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.all().let(CacheQueryStringBehavior::wrap)

    public open fun allowList(queryStrings: String): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.allowList(queryStrings).let(CacheQueryStringBehavior::wrap)

    public open fun denyList(queryStrings: String): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.denyList(queryStrings).let(CacheQueryStringBehavior::wrap)

    public open fun none(): CacheQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior.none().let(CacheQueryStringBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior):
        CacheQueryStringBehavior = CacheQueryStringBehavior(cdkObject)

    internal fun unwrap(wrapped: CacheQueryStringBehavior):
        software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior = wrapped.cdkObject
  }
}
