package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class OriginRequestHeaderBehavior internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior,
) {
  public open fun behavior(): String = unwrap(this).getBehavior()

  public open fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

  public companion object {
    public open fun all(cloudfrontHeaders: String): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.all(cloudfrontHeaders).let(OriginRequestHeaderBehavior::wrap)

    public open fun allowList(headers: String): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.allowList(headers).let(OriginRequestHeaderBehavior::wrap)

    public open fun denyList(headers: String): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.denyList(headers).let(OriginRequestHeaderBehavior::wrap)

    public open fun none(): OriginRequestHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior.none().let(OriginRequestHeaderBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior):
        OriginRequestHeaderBehavior = OriginRequestHeaderBehavior(cdkObject)

    internal fun unwrap(wrapped: OriginRequestHeaderBehavior):
        software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior = wrapped.cdkObject
  }
}
