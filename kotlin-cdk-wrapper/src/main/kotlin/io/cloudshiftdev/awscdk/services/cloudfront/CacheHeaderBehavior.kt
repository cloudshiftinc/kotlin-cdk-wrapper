@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class CacheHeaderBehavior internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior,
) : CdkObject(cdkObject) {
  public open fun behavior(): String = unwrap(this).getBehavior()

  public open fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

  public companion object {
    public fun allowList(headers: String): CacheHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior.allowList(headers).let(CacheHeaderBehavior::wrap)

    public fun none(): CacheHeaderBehavior =
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior.none().let(CacheHeaderBehavior::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior):
        CacheHeaderBehavior = CacheHeaderBehavior(cdkObject)

    internal fun unwrap(wrapped: CacheHeaderBehavior):
        software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior = wrapped.cdkObject
  }
}
