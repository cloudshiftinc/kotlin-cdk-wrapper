@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for principals that can be compared.
 *
 * This only needs to be implemented for principals that could potentially be value-equal.
 * Identity-equal principals will be handled correctly by default.
 */
public interface IComparablePrincipal : IPrincipal {
  /**
   * Return a string format of this principal which should be identical if the two principals are
   * the same.
   */
  public fun dedupeString(): String?

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IComparablePrincipal):
        IComparablePrincipal = CdkObjectWrappers.wrap(cdkObject) as IComparablePrincipal

    internal fun unwrap(wrapped: IComparablePrincipal):
        software.amazon.awscdk.services.iam.IComparablePrincipal = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.IComparablePrincipal
  }
}
