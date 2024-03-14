package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.collections.List

public open class AllowedMethods internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods,
) {
  public open fun methods(): List<String> = unwrap(this).getMethods() ?: emptyList()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.AllowedMethods):
        AllowedMethods = AllowedMethods(cdkObject)

    internal fun unwrap(wrapped: AllowedMethods):
        software.amazon.awscdk.services.cloudfront.AllowedMethods = wrapped.cdkObject
  }
}
