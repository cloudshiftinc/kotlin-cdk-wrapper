@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * Helper class for working with `IComparablePrincipal`s.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * ComparablePrincipal comparablePrincipal = new ComparablePrincipal();
 * ```
 */
public open class ComparablePrincipal(
  cdkObject: software.amazon.awscdk.services.iam.ComparablePrincipal,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.iam.ComparablePrincipal()
  )

  public companion object {
    public fun dedupeStringFor(x: IPrincipal): String? =
        software.amazon.awscdk.services.iam.ComparablePrincipal.dedupeStringFor(x.let(IPrincipal.Companion::unwrap))

    public fun isComparablePrincipal(x: IPrincipal): Boolean =
        software.amazon.awscdk.services.iam.ComparablePrincipal.isComparablePrincipal(x.let(IPrincipal.Companion::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ComparablePrincipal):
        ComparablePrincipal = ComparablePrincipal(cdkObject)

    internal fun unwrap(wrapped: ComparablePrincipal):
        software.amazon.awscdk.services.iam.ComparablePrincipal = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.ComparablePrincipal
  }
}
