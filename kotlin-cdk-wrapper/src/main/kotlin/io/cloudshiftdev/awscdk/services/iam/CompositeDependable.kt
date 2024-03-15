@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IDependable

/**
 * Composite dependable.
 *
 * Not as simple as eagerly getting the dependency roots from the
 * inner dependables, as they may be mutable so we need to defer
 * the query.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import software.constructs.*;
 * IDependable dependable;
 * CompositeDependable compositeDependable = new CompositeDependable(dependable);
 * ```
 */
public open class CompositeDependable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CompositeDependable,
) : CdkObject(cdkObject), IDependable {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CompositeDependable):
        CompositeDependable = CompositeDependable(cdkObject)

    internal fun unwrap(wrapped: CompositeDependable):
        software.amazon.awscdk.services.iam.CompositeDependable = wrapped.cdkObject
  }
}
