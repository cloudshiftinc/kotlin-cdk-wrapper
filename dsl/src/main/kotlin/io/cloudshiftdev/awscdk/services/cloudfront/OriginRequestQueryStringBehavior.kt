package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.List

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
