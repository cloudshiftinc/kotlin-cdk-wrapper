@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an IAM Group.
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html)
 */
public interface IGroup : IIdentity {
  /**
   * Returns the IAM Group ARN.
   */
  public fun groupArn(): String

  /**
   * Returns the IAM Group Name.
   */
  public fun groupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IGroup): IGroup =
        CdkObjectWrappers.wrap(cdkObject) as IGroup

    internal fun unwrap(wrapped: IGroup): software.amazon.awscdk.services.iam.IGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.IGroup
  }
}
