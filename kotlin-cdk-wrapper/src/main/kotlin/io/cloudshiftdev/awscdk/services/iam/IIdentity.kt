@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A construct that represents an IAM principal, such as a user, group or role.
 */
public interface IIdentity : IPrincipal, IResource {
  /**
   * Attaches a managed policy to this principal.
   *
   * @param policy The managed policy. 
   */
  public fun addManagedPolicy(policy: IManagedPolicy)

  /**
   * Attaches an inline policy to this principal.
   *
   * This is the same as calling `policy.addToXxx(principal)`.
   *
   * @param policy The policy resource to attach to this principal
   * [disable-awslint:ref-via-interface]. 
   */
  public fun attachInlinePolicy(policy: Policy)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IIdentity): IIdentity =
        CdkObjectWrappers.wrap(cdkObject) as IIdentity

    internal fun unwrap(wrapped: IIdentity): software.amazon.awscdk.services.iam.IIdentity =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IIdentity
  }
}
