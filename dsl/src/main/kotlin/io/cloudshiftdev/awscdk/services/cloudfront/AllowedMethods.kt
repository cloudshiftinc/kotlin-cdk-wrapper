package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.List

public open class AllowedMethods internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods,
) : CdkObject(cdkObject) {
  /**
   * HTTP methods supported.
   */
  public open fun methods(): List<String> = unwrap(this).getMethods()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods):
        AllowedMethods = AllowedMethods(cdkObject)

    internal fun unwrap(wrapped: AllowedMethods):
        software.amazon.awscdk.services.cloudfront.AllowedMethods = wrapped.cdkObject
  }
}
