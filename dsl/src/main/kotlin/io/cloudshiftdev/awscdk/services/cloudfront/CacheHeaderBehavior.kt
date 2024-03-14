package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class CacheHeaderBehavior internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior,
) {
  public open fun behavior(): String = unwrap(this).getBehavior()

  public open fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

  public companion object {
    public open fun allowList(headers: String): CacheHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior.allowList(headers).let(CacheHeaderBehavior::wrap)

    public open fun none(): CacheHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior.none().let(CacheHeaderBehavior::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior):
        CacheHeaderBehavior = CacheHeaderBehavior(cdkObject)

    internal fun unwrap(wrapped: CacheHeaderBehavior):
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior = wrapped.cdkObject
  }
}
