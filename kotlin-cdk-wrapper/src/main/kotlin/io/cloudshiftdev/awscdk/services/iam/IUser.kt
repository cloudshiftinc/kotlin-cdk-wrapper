@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an IAM user.
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users.html)
 */
public interface IUser : IIdentity {
  /**
   * Adds this user to a group.
   *
   * @param group 
   */
  public fun addToGroup(group: IGroup)

  /**
   * The user's ARN.
   */
  public fun userArn(): String

  /**
   * The user's name.
   */
  public fun userName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IUser): IUser =
        CdkObjectWrappers.wrap(cdkObject) as IUser

    internal fun unwrap(wrapped: IUser): software.amazon.awscdk.services.iam.IUser = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.IUser
  }
}
