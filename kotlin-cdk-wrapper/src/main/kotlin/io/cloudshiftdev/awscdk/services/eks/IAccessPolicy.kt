@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an access policy that defines the permissions and scope for a user or role to access
 * an Amazon EKS cluster.
 */
public interface IAccessPolicy {
  /**
   * The scope of the access policy, which determines the level of access granted.
   */
  public fun accessScope(): AccessScope

  /**
   * The access policy itself, which defines the specific permissions.
   */
  public fun policy(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.IAccessPolicy,
  ) : CdkObject(cdkObject),
      IAccessPolicy {
    /**
     * The scope of the access policy, which determines the level of access granted.
     */
    override fun accessScope(): AccessScope = unwrap(this).getAccessScope().let(AccessScope::wrap)

    /**
     * The access policy itself, which defines the specific permissions.
     */
    override fun policy(): String = unwrap(this).getPolicy()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.IAccessPolicy): IAccessPolicy =
        CdkObjectWrappers.wrap(cdkObject) as? IAccessPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessPolicy): software.amazon.awscdk.services.eks.IAccessPolicy =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.IAccessPolicy
  }
}
