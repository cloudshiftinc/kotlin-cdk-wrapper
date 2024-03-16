@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an IAM Instance Profile.
 */
public interface IInstanceProfile : IResource {
  /**
   * The InstanceProfile's ARN.
   */
  public fun instanceProfileArn(): String

  /**
   * The InstanceProfile's name.
   */
  public fun instanceProfileName(): String

  /**
   * The role associated with the InstanceProfile.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IInstanceProfile):
        IInstanceProfile = CdkObjectWrappers.wrap(cdkObject) as IInstanceProfile

    internal fun unwrap(wrapped: IInstanceProfile):
        software.amazon.awscdk.services.iam.IInstanceProfile = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.IInstanceProfile
  }
}
