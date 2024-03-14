package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class CachedMethods internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CachedMethods,
) {
  public open fun methods(): List<String> = unwrap(this).getMethods() ?: emptyList()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CachedMethods):
        CachedMethods = CachedMethods(cdkObject)

    internal fun unwrap(wrapped: CachedMethods):
        software.amazon.awscdk.services.cloudfront.CachedMethods = wrapped.cdkObject
  }
}
