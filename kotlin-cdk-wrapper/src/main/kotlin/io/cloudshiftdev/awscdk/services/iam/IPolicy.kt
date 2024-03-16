@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an IAM Policy.
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage.html)
 */
public interface IPolicy : IResource {
  /**
   * The name of this policy.
   */
  public fun policyName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IPolicy): IPolicy =
        CdkObjectWrappers.wrap(cdkObject) as IPolicy

    internal fun unwrap(wrapped: IPolicy): software.amazon.awscdk.services.iam.IPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.IPolicy
  }
}
