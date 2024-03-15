@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

public open class ComparablePrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.ComparablePrincipal,
) : CdkObject(cdkObject) {
  public companion object {
    public fun dedupeStringFor(x: IPrincipal): String? =
        software.amazon.awscdk.services.iam.ComparablePrincipal.dedupeStringFor(x.let(IPrincipal::unwrap))

    public fun isComparablePrincipal(x: IPrincipal): Boolean =
        software.amazon.awscdk.services.iam.ComparablePrincipal.isComparablePrincipal(x.let(IPrincipal::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ComparablePrincipal):
        ComparablePrincipal = ComparablePrincipal(cdkObject)

    internal fun unwrap(wrapped: ComparablePrincipal):
        software.amazon.awscdk.services.iam.ComparablePrincipal = wrapped.cdkObject
  }
}
