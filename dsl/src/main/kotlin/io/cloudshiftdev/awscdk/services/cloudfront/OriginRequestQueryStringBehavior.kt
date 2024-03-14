package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class OriginRequestQueryStringBehavior internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior,
) {
  public open fun behavior(): String = unwrap(this).getBehavior()

  public open fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

  public companion object {
    public open fun all(): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.all().let(OriginRequestQueryStringBehavior::wrap)

    public open fun allowList(queryStrings: String): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.allowList(queryStrings).let(OriginRequestQueryStringBehavior::wrap)

    public open fun denyList(queryStrings: String): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.denyList(queryStrings).let(OriginRequestQueryStringBehavior::wrap)

    public open fun none(): OriginRequestQueryStringBehavior =
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior.none().let(OriginRequestQueryStringBehavior::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior):
        OriginRequestQueryStringBehavior = OriginRequestQueryStringBehavior(cdkObject)

    internal fun unwrap(wrapped: OriginRequestQueryStringBehavior):
        software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior =
        wrapped.cdkObject
  }
}
