package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.List

public open class CachedMethods internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CachedMethods,
) : CdkObject(cdkObject) {
  /**
   * HTTP methods supported.
   */
  public open fun methods(): List<String> = unwrap(this).getMethods()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CachedMethods):
        CachedMethods = CachedMethods(cdkObject)

    internal fun unwrap(wrapped: CachedMethods):
        software.amazon.awscdk.services.cloudfront.CachedMethods = wrapped.cdkObject
  }
}
