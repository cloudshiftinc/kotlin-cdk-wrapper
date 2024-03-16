@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A Role object.
 */
public interface IRole : IIdentity {
  /**
   * Grant the actions defined in actions to the identity Principal on this resource.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IPrincipal, actions: String): Grant

  /**
   * Grant permissions to the given principal to assume this role.
   *
   * @param grantee 
   */
  public fun grantAssumeRole(grantee: IPrincipal): Grant

  /**
   * Grant permissions to the given principal to pass this role.
   *
   * @param grantee 
   */
  public fun grantPassRole(grantee: IPrincipal): Grant

  /**
   * Returns the ARN of this role.
   */
  public fun roleArn(): String

  /**
   * Returns the name of this role.
   */
  public fun roleName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IRole): IRole =
        CdkObjectWrappers.wrap(cdkObject) as IRole

    internal fun unwrap(wrapped: IRole): software.amazon.awscdk.services.iam.IRole = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.IRole
  }
}
