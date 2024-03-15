@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class OriginRequestHeaderBehavior internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior,
) : CdkObject(cdkObject) {
  public open fun behavior(): String = unwrap(this).getBehavior()

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
  }
}
