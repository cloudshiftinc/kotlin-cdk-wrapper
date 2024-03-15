@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * The HTTP methods that the Behavior will cache requests on.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CachedMethods cachedMethods = CachedMethods.CACHE_GET_HEAD;
 * ```
 */
public open class CachedMethods internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CachedMethods,
) : CdkObject(cdkObject) {
  /**
   * HTTP methods supported.
   */
  public open fun methods(): List<String> = unwrap(this).getMethods()

  public companion object {
    public val CACHE_GET_HEAD: CachedMethods =
        CachedMethods.wrap(software.amazon.awscdk.services.cloudfront.CachedMethods.CACHE_GET_HEAD)

    public val CACHE_GET_HEAD_OPTIONS: CachedMethods =
        CachedMethods.wrap(software.amazon.awscdk.services.cloudfront.CachedMethods.CACHE_GET_HEAD_OPTIONS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CachedMethods):
        CachedMethods = CachedMethods(cdkObject)

    internal fun unwrap(wrapped: CachedMethods):
        software.amazon.awscdk.services.cloudfront.CachedMethods = wrapped.cdkObject
  }
}
